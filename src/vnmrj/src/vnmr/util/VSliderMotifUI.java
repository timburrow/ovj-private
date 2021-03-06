/*
 * Copyright (C) 2015  University of Oregon
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the LICENSE file.
 *
 * For more information, see the LICENSE file.
 */

package vnmr.util;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.*;
import javax.swing.Timer.*;

import javax.swing.plaf.basic.BasicSliderUI;
import com.sun.java.swing.plaf.motif.MotifSliderUI;

/**
 * Motif VSlider
 */
public class VSliderMotifUI extends MotifSliderUI implements VSliderUI {
    private sliderMouseListener ml;
    private boolean inThumb = false;
    private int smallStep = 1;
    private int largeStep = 2;
    private int moveStep = 0;
    private int button = 1;
    private int curX = 0;
    private int curY = 0;
    private boolean negativeMove;
    private Timer sliderTimer;
    private sliderTimerListener sliderListener;

    public VSliderMotifUI(JSlider b)   {
        super(b);
    }

    public static ComponentUI createUI(JComponent b)    {
        return new VSliderMotifUI((JSlider)b);
    }


    public void installUI(JComponent c)   {
	super.installUI(c);
	c.removeMouseListener(trackListener);
	c.removeMouseMotionListener(trackListener);
	ml = new sliderMouseListener();
	c.addMouseListener(ml);
	c.addMouseMotionListener(ml);
	sliderListener = new sliderTimerListener();
	sliderTimer = new Timer( 100, sliderListener );
        sliderTimer.setInitialDelay( 500 );
    }

    public void setEditMode(boolean s) {
	if (s) {
	    slider.removeMouseListener(ml);
	    slider.removeMouseMotionListener(ml);
	}
	else {
	    slider.addMouseListener(ml);
	    slider.addMouseMotionListener(ml);
	}
    }

    public void setSmallStep(int a) {
	smallStep = a;
    }

    public void setLargeStep(int a) {
	largeStep = a;
    }

    public boolean toScroll() {
        Rectangle r = thumbRect;
/*
	switch ( slider.getOrientation() ) {
	   case JSlider.VERTICAL:
		if (negativeMove) {
		       if (r.y + r.height  <= curY)
                          return false;
                }
		else if (r.y >= curY)
                          return false;
		break;
	   default:
		if (negativeMove) {
		       if (r.x + r.width  <= curX)
                          return false;
                }
		else if (r.x >= curX)
                          return false;
		break;
	}
*/
	if (negativeMove) {
	       if (slider.getValue() <= slider.getMinimum())
                   return false;
	}
	else {
	       if (slider.getValue() >= slider.getMaximum())
                   return false;
	}
	return true;
    }

    private void moveOneStep() {
	int v = slider.getValue();
	if (negativeMove) {
	    v = v - moveStep;
	    if (v <= slider.getMinimum())
		v = slider.getMinimum();
	}
	else {
	    v = v + moveStep;
	    if (v >= slider.getMaximum())
		v = slider.getMaximum();
	}
        slider.setValue( v );
    }

    private class sliderMouseListener extends MouseInputAdapter {
	private int offset;

	public void mouseReleased(MouseEvent e) {
	     inThumb = false;
             sliderTimer.stop();
	     if ( !slider.isEnabled() )
                return;
	     slider.setValueIsAdjusting(false);
	}

	public void mouseDragged( MouseEvent e ) {
	    if ( !slider.isEnabled() )
                return;
	    if (!inThumb)
                return;
	    int thumbMiddle = 0;

	    switch ( slider.getOrientation() ) {
	      case JSlider.VERTICAL:
                   int thumbTop = e.getY() - offset;
                   thumbMiddle = thumbTop + thumbRect.height / 2;
                   slider.setValue( valueForYPosition( thumbMiddle ) );
                   break;
	      default:
            	   int thumbLeft = e.getX() - offset;
                   thumbMiddle = thumbLeft + thumbRect.width / 2;
            	   slider.setValue( valueForXPosition( thumbMiddle ) );
                   break;
	    }
	}
        
	public void mousePressed(MouseEvent e) {
	    if ( !slider.isEnabled() )
                return;

	    slider.requestFocus();
	    curX = e.getX();
            curY = e.getY();
	    slider.setValueIsAdjusting(true);
            sliderTimer.stop();
	    if ( thumbRect.contains(curX, curY) ) {
		switch ( slider.getOrientation() ) {
                  case JSlider.VERTICAL:
                      offset = curY - thumbRect.y;
                      break;
                  case JSlider.HORIZONTAL:
                      offset = curX - thumbRect.x;
                      break;
                }
                
		inThumb = true;
		return;
	    }
	    button = 1;
	    moveStep = smallStep;
	    int modify = e.getModifiers();
	    if ((modify & InputEvent.BUTTON2_MASK) != 0) {
		button = 2;
	        switch ( slider.getOrientation() ) {
              	    case JSlider.VERTICAL:
            		slider.setValue( valueForYPosition( curY ) );
			offset = thumbRect.height / 2;
			break;
		    default:
            		slider.setValue( valueForXPosition( curX ) );
			offset = thumbRect.width / 2;
			break;
		}
		inThumb = true;
		return;
	    }
	    if ((modify & InputEvent.BUTTON3_MASK) != 0) {
		button = 3;
	        moveStep = largeStep;
	    }
	    switch ( slider.getOrientation() ) {
              case JSlider.VERTICAL:
            	   if (curY < thumbRect.y)
			negativeMove = true;
		   else
			negativeMove = false;
		   break;
	      default:
            	   if (curX < thumbRect.x)
			negativeMove = true;
		   else
			negativeMove = false;
		   break;
	    }
	    moveOneStep();
	    if (toScroll())
            	sliderTimer.start();
	}

	public void mouseMoved(MouseEvent e) {
	}
    
    } // class sliderMouseListener

    private class sliderTimerListener implements ActionListener {

	public sliderTimerListener() {
        }
        
	public void actionPerformed(ActionEvent e) {
	    moveOneStep();
	    if (!toScroll())
		sliderTimer.stop();
        }

    } // class sliderTimerListener
}


/*
 *   Swing Explorer. Tool for developers exploring Java/Swing-based application internals. 
 * 	 Copyright (C) 2012, Maxim Zakharenkov
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *   Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free Software
 *   Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *   
 */
package org.swingexplorer;


import java.awt.Rectangle;
import java.awt.event.ActionEvent;

import javax.swing.AbstractListModel;
import javax.swing.SpinnerNumberModel;

import org.swingexplorer.graphics.CurrentOperationChangeEvent;
import org.swingexplorer.graphics.ImageEvent;
import org.swingexplorer.graphics.Operation;
import org.swingexplorer.graphics.OperationResetEvent;
import org.swingexplorer.graphics.Player;
import org.swingexplorer.graphics.PlayerListener;
import org.swingexplorer.graphics.StateEvent;
import org.swingexplorer.idesupport.IDESupport;


/**
 *
 * @author  Maxim Zakharenkov
 */
@SuppressWarnings("serial")
public class PnlPlayerControls extends javax.swing.JPanel {
    
    /** Creates new form PnlPlayerControls */
    public PnlPlayerControls() {
        initComponents();
        initActions();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpOperations = new javax.swing.JScrollPane();
        lstOperations = new javax.swing.JList();
        slider = new javax.swing.JSlider();
        spinner = new javax.swing.JSpinner();
        btnPlayPause = new javax.swing.JButton();
        btnPlayStep = new javax.swing.JButton();
        btnToEnd = new javax.swing.JButton();
        btnToStart = new javax.swing.JButton();
        btnPlayStepBack = new javax.swing.JButton();
        btnDumpStackTrace = new javax.swing.JButton();
        btnSrc = new javax.swing.JButton();

        lstOperations.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstOperations.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstOperations.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstOperationsValueChanged(evt);
            }
        });
        scpOperations.setViewportView(lstOperations);

        slider.setValueIsAdjusting(true);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });
        slider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sliderMouseReleased(evt);
            }
        });

        spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerStateChanged(evt);
            }
        });

        btnPlayPause.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPlayStep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnToEnd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnToStart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPlayStepBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnDumpStackTrace.setText("Trace");
        btnDumpStackTrace.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSrc.setText("src");
        btnSrc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(btnToStart, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(btnPlayStepBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(btnPlayPause, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(btnPlayStep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(btnToEnd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(btnDumpStackTrace, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(btnSrc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(spinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(slider, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, scpOperations, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        layout.linkSize(new java.awt.Component[] {btnPlayPause, btnPlayStep, btnPlayStepBack, btnToEnd, btnToStart}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnToStart, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(btnPlayStepBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(btnPlayPause, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(btnPlayStep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(btnToEnd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(spinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(btnDumpStackTrace, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(btnSrc))
                    .add(slider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(scpOperations, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
        );

        layout.linkSize(new java.awt.Component[] {btnDumpStackTrace, btnPlayPause, btnPlayStep, btnPlayStepBack, btnSrc, btnToEnd, btnToStart, spinner}, org.jdesktop.layout.GroupLayout.VERTICAL);

    }// </editor-fold>//GEN-END:initComponents

    private void lstOperationsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstOperationsValueChanged
        if(blockEventsFromControls) {
    		return;
    	}
        int selIndex = lstOperations.getSelectedIndex();
        if(player.getCurrentOperationIndex() != selIndex) {
    		player.seek(selIndex);
    	}
    }//GEN-LAST:event_lstOperationsValueChanged

    private void spinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerStateChanged
        if(blockEventsFromControls) {
    		return;
    	}
        int value = (int)(Integer)spinner.getValue();
    	if(player.getCurrentOperationIndex() != value) {
    		player.seek(value);
    	}
    }//GEN-LAST:event_spinnerStateChanged

    private void sliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderMouseReleased
        
    }//GEN-LAST:event_sliderMouseReleased

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
    	if(blockEventsFromControls) {
    		return;
    	}
    	
    	int value = slider.getValue();
    	if(player.getCurrentOperationIndex() != value) {
    		if(value < 0) { // in some cases slider value becomes -1 (may be it is slider's bug)
    			value =0;
    		}
   			player.seek(value);
    	}
    }//GEN-LAST:event_sliderStateChanged
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDumpStackTrace;
    private javax.swing.JButton btnPlayPause;
    private javax.swing.JButton btnPlayStep;
    private javax.swing.JButton btnPlayStepBack;
    private javax.swing.JButton btnSrc;
    private javax.swing.JButton btnToEnd;
    private javax.swing.JButton btnToStart;
    private javax.swing.JList lstOperations;
    private javax.swing.JScrollPane scpOperations;
    private javax.swing.JSlider slider;
    private javax.swing.JSpinner spinner;
    // End of variables declaration//GEN-END:variables
    
    private boolean blockEventsFromControls = true;
    Player player;
    private PlayerListener listener = new PlayerListenerImpl();
    private OperationListModel mdlOperations = new OperationListModel();
    
    private ActPlay actPlay = new ActPlay();
    private ActToStart actToStart = new ActToStart();
    private ActToEnd actToEnd = new ActToEnd();
    private ActPause actPause = new ActPause();
    private ActPlayStep actPlayStep = new ActPlayStep();
    private ActPlayStepBack actPlayStepBack = new ActPlayStepBack();
    private ActDumpStackTrace actDumpStackTrace = new ActDumpStackTrace();
    private ActOpenSourceCode actOpenSourceCode;
    
    private void initActions() {
    	btnPlayPause.setAction(actPlay);    	
    	btnToStart.setAction(actToStart);
    	btnPlayStep.setAction(actPlayStep);
        btnToEnd.setAction(actToEnd);
        btnPlayStepBack.setAction(actPlayStepBack);
        btnDumpStackTrace.setAction(actDumpStackTrace);
    	lstOperations.setModel(mdlOperations);
        
        actOpenSourceCode = new ActOpenSourceCode(this);
        btnSrc.setAction(actOpenSourceCode);
    }
    
    void setIDESupport(IDESupport _ideSupport) {
        actOpenSourceCode.ideSupport = _ideSupport;
    }
    
    public void setPlayer(Player playerP) {        
        if(player == playerP) {
            return;
        }
        
        if(player != null) {
            player.removePlayerListener(listener);
        }
        player = playerP;
        if(player != null) {
        	updateOperationList();
            updateActionAvailabilityFromState(player.getCurrentState());
            updateCurrentOperationSelection(player.getCurrentOperation());

            player.addPlayerListener(listener);
        }
        
    }
    
    public Player getPlayer() {
        return player;
    }
    
    private void updateActionAvailabilityFromState(Player.PState state) {
    	switch (state) {
		case IDLE:
			actPlay.setEnabled(true);
			actPlayStep.setEnabled(true);
			actPlayStepBack.setEnabled(true);
			actToStart.setEnabled(true);
			actPause.setEnabled(false);
			actToEnd.setEnabled(true);			
			actDumpStackTrace.setEnabled(true);
			actOpenSourceCode.setEnabled(true);
			btnPlayPause.setAction(actPlay);
			slider.setEnabled(true);
			spinner.setEnabled(true);
			break;
		case PLAYING:
			actPlay.setEnabled(false);
			actPlayStep.setEnabled(true);
			actPlayStepBack.setEnabled(true);
			actToStart.setEnabled(true);
			actToEnd.setEnabled(true);
			actPause.setEnabled(true);
			actDumpStackTrace.setEnabled(false);
			actOpenSourceCode.setEnabled(false);
			btnPlayPause.setAction(actPause);
			slider.setEnabled(true);
			spinner.setEnabled(true);
			break;
		case NEW:
			actPlay.setEnabled(false);
			actPlayStep.setEnabled(false);
			actPlayStepBack.setEnabled(false);
			actToStart.setEnabled(false);
			actPause.setEnabled(false);
			actToEnd.setEnabled(false);
			slider.setEnabled(false);
			spinner.setEnabled(false);
			actDumpStackTrace.setEnabled(false);
			actOpenSourceCode.setEnabled(false);
			break;
		}
    }
    
    private void updateCurrentOperationSelection(Operation op) {
    	if(op == null) {
    		lstOperations.getSelectionModel().clearSelection();
    		return;
    	}
    	lstOperations.setSelectedIndex(op.getIndex());
    	
    	Rectangle rect = lstOperations.getCellBounds(op.getIndex(), op.getIndex());
    	if(rect !=null) {
    		lstOperations.scrollRectToVisible(rect);
    	}
    	slider.setValue(op.getIndex());
    	spinner.setValue(op.getIndex());
    }
    
    class PlayerListenerImpl implements PlayerListener {
        public void imageRendered(ImageEvent evt) {
        }

		public void operationsReset(OperationResetEvent evt) {
			updateOperationList();
		}

		public void stateChanged(StateEvent evt) {
			updateActionAvailabilityFromState(evt.getNewState());
		}

		public void currentOperationChanged(CurrentOperationChangeEvent evt) {
			blockEventsFromControls = true;
        	Operation op = evt.getCurrentOperation();
        	updateCurrentOperationSelection(op);
        	blockEventsFromControls = false;
		}        
    }
    
    class OperationListModel extends AbstractListModel {

    	Operation[] operations = new Operation[0];

    	void setOperations(Operation[] operationsP) {
    		
    		if(operationsP == null) {
    			operationsP = new Operation[0];
    		}
    		
    		Operation[] old = operations;
    		operations = operationsP;
    		
    		if(old.length != 0) {
    			super.fireIntervalRemoved(this, 0, old.length - 1);
    		}
    		if(operations.length != 0) {
    		 super.fireIntervalAdded(this, 0, operations.length - 1);
    		}
    	}
    	
		public int getSize() {
			return operations.length;
		}

		public Object getElementAt(int index) {
			return operations[index];
		}    	
    }
    
    
    class ActPlay extends RichAction {
        ActPlay() {
            setTooltip("Play");
            setIcon("play.png");
        }
        public void actionPerformed(ActionEvent e) {
            Player player = getPlayer();
            player.play();
        }        
    }
	class ActPlayStep extends RichAction {
        ActPlayStep() {
            setTooltip("Play Step");
            setIcon("play_step.png");
        }
        public void actionPerformed(ActionEvent e) {
            Player player = getPlayer();
            player.playStep();
        }        
    }
	class ActPause extends RichAction {
        ActPause() {
            setTooltip("Pause");
            setIcon("pause.png");
        }
        public void actionPerformed(ActionEvent e) {
            Player player = getPlayer();
            player.pause();
        }        
    }
    
	class ActToStart extends RichAction {
        ActToStart() {
            setTooltip("Go to start");
            setIcon("to_start.png");
        }
        public void actionPerformed(ActionEvent e) {
            Player player = getPlayer();
            player.seek(0);
        }        
    }
    
	class ActToEnd extends RichAction {
        ActToEnd() {
            setTooltip("Go to end");
            setIcon("to_end.png");
        }
        public void actionPerformed(ActionEvent e) {
            Player player = getPlayer();
            player.seek(player.getOperationCount() - 1);
        }        
    }
    
	class ActPlayStepBack extends RichAction {
    	ActPlayStepBack() {
            setTooltip("Play step back");
            setIcon("play_step_back.png");
        }
        public void actionPerformed(ActionEvent e) {
            Player player = getPlayer();
            player.playStepBack();
        }        
    }

	class ActDumpStackTrace extends RichAction {
    	ActDumpStackTrace() {
            setTooltip("Dump current operation's stack trace");
            setName("Trace");
        }
        public void actionPerformed(ActionEvent e) {
            Player player = getPlayer();
            Operation op = player.getCurrentOperation();
            if(op == null) {
            	System.out.println("Current operation is null");
            	return;
            }
            if(op.isEndOperation()) {
            	System.out.println("No stack trace available for END operation");
            	return;
            }
            
            System.out.println(op.toString());
            for(StackTraceElement elem : op.getStackTrace()) {            	
            	System.out.println(elem.toString());
            }
        }        
    }
    
	public ActPause getActPause() {
		return actPause;
	}

	public ActPlay getActPlay() {
		return actPlay;
	}

	public ActToStart getActStop() {
		return actToStart;
	}

	private void updateOperationList() {
		blockEventsFromControls = true;
		
		mdlOperations.setOperations(player.getOperations());
		slider.setMaximum(mdlOperations.getSize() - 1);
		SpinnerNumberModel spinnerModel =  (SpinnerNumberModel)spinner.getModel();
		spinnerModel.setMinimum(0);
		spinnerModel.setMaximum(mdlOperations.getSize() - 1);
		
		blockEventsFromControls = false;
	}
}


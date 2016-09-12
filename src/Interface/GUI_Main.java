package Interface;

import java.awt.*;
import javax.swing.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author marcw
 */
public class GUI_Main extends javax.swing.JFrame {

	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	/**
	 * Creates new form NewJFrame
	 */
	public GUI_Main() {
		BS = new FindBrightestSpot();
		initComponents();

		MinLazerBrightness = jSlider_LazerBrightness.getValue();
		MoveMouse = this.jCheckBox_MouseCurser.isSelected();
		DisplayOriginal = this.jCheckBox_OriginalIMG.isSelected();
		BS.blur = jSlider_Blur.getValue();
		BS.isStaticBack = this.jCheckBox_StaticBackGround.isSelected();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_ScaledVedioFeed = imageLabel;
        jSlider_Blur = new javax.swing.JSlider();
        jLabel_Blur = new javax.swing.JLabel();
        jLabel_LazerBrightness = new javax.swing.JLabel();
        jSlider_LazerBrightness = new javax.swing.JSlider();
        jCheckBox_OriginalIMG = new javax.swing.JCheckBox();
        jCheckBox_MouseCurser = new javax.swing.JCheckBox();
        jCheckBox_StaticBackGround = new javax.swing.JCheckBox();
        jLabel_DisplayStatistrics = new javax.swing.JLabel();
        jCheckBox_Motion = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lazer Pointer Tracking");
        setMinimumSize(new java.awt.Dimension(635, 147));
        setName("Lazer Pointer Tracking"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1020, 720));

        jLabel_ScaledVedioFeed.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_ScaledVedioFeed.setText(" ");
        jLabel_ScaledVedioFeed.setAlignmentY(0.0F);
        jLabel_ScaledVedioFeed.setMinimumSize(new java.awt.Dimension(0, 0));

        jSlider_Blur.setMajorTickSpacing(2);
        jSlider_Blur.setMaximum(17);
        jSlider_Blur.setMinimum(1);
        jSlider_Blur.setMinorTickSpacing(2);
        jSlider_Blur.setPaintLabels(true);
        jSlider_Blur.setPaintTicks(true);
        jSlider_Blur.setSnapToTicks(true);
        jSlider_Blur.setToolTipText("");
        jSlider_Blur.setValue(5);
        jSlider_Blur.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_BlurStateChanged(evt);
            }
        });

        jLabel_Blur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Blur.setText("Blur");

        jLabel_LazerBrightness.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_LazerBrightness.setText("Lazer Brightness");

        jSlider_LazerBrightness.setMajorTickSpacing(25);
        jSlider_LazerBrightness.setMaximum(255);
        jSlider_LazerBrightness.setMinorTickSpacing(5);
        jSlider_LazerBrightness.setPaintLabels(true);
        jSlider_LazerBrightness.setPaintTicks(true);
        jSlider_LazerBrightness.setToolTipText("");
        jSlider_LazerBrightness.setValue(100);
        jSlider_LazerBrightness.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_LazerBrightnessStateChanged(evt);
            }
        });

        jCheckBox_OriginalIMG.setSelected(true);
        jCheckBox_OriginalIMG.setText("Original Image");
        jCheckBox_OriginalIMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_OriginalIMGActionPerformed(evt);
            }
        });

        jCheckBox_MouseCurser.setText("Mouve Curser");
        jCheckBox_MouseCurser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_MouseCurserActionPerformed(evt);
            }
        });

        jCheckBox_StaticBackGround.setText("Static Background");
        jCheckBox_StaticBackGround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_StaticBackGroundActionPerformed(evt);
            }
        });

        jLabel_DisplayStatistrics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_DisplayStatistrics.setText(" ");

        jCheckBox_Motion.setText("laser motion detection");
        jCheckBox_Motion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_MotionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Blur, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider_Blur, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_LazerBrightness, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider_LazerBrightness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_DisplayStatistrics, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_StaticBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_MouseCurser, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_OriginalIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_Motion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jLabel_ScaledVedioFeed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_ScaledVedioFeed, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_LazerBrightness, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSlider_LazerBrightness, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSlider_Blur, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_Blur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jCheckBox_OriginalIMG)
                            .addGap(2, 2, 2)
                            .addComponent(jCheckBox_Motion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox_StaticBackGround)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox_MouseCurser)))
                    .addComponent(jLabel_DisplayStatistrics, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void jSlider_BlurStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jSlider_BlurStateChanged
   {//GEN-HEADEREND:event_jSlider_BlurStateChanged
	   // TODO add your handling code here:
	   if (!jSlider_Blur.getValueIsAdjusting()) {
		   BS.blur = (int) jSlider_Blur.getValue();
	   }
   }//GEN-LAST:event_jSlider_BlurStateChanged

   private void jCheckBox_OriginalIMGActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox_OriginalIMGActionPerformed
   {//GEN-HEADEREND:event_jCheckBox_OriginalIMGActionPerformed
	   // TODO add your handling code here:
	   DisplayOriginal = jCheckBox_OriginalIMG.isSelected();
   }//GEN-LAST:event_jCheckBox_OriginalIMGActionPerformed

   private void jSlider_LazerBrightnessStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jSlider_LazerBrightnessStateChanged
   {//GEN-HEADEREND:event_jSlider_LazerBrightnessStateChanged
	   // TODO add your handling code here:
	   if (!jSlider_LazerBrightness.getValueIsAdjusting()) {
		   MinLazerBrightness = (int) jSlider_LazerBrightness.getValue();
	   }
   }//GEN-LAST:event_jSlider_LazerBrightnessStateChanged

   private void jCheckBox_StaticBackGroundActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox_StaticBackGroundActionPerformed
   {//GEN-HEADEREND:event_jCheckBox_StaticBackGroundActionPerformed
	   // TODO add your handling code here:
	   if (!webcamMatImage.empty()) {
		   BS.setFirstImage(webcamMatImage, jCheckBox_StaticBackGround.isSelected());
	   }
   }//GEN-LAST:event_jCheckBox_StaticBackGroundActionPerformed

   private void jCheckBox_MotionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox_MotionActionPerformed
   {//GEN-HEADEREND:event_jCheckBox_MotionActionPerformed
	   // TODO add your handling code here:
	   Motion = jCheckBox_Motion.isSelected();
   }//GEN-LAST:event_jCheckBox_MotionActionPerformed

   private void jCheckBox_MouseCurserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox_MouseCurserActionPerformed
   {//GEN-HEADEREND:event_jCheckBox_MouseCurserActionPerformed
	   // TODO add your handling code here:
	   MoveMouse = jCheckBox_MouseCurser.isSelected();
   }//GEN-LAST:event_jCheckBox_MouseCurserActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI_Main().setVisible(true);
			}
		});

		try {
			runMainLoop();
		} catch (AWTException ex) {
		}
	}

	private static void runMainLoop() throws AWTException {
		BS = new FindBrightestSpot();
		Robot robot = new Robot();

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//video
		VideoCapture capture = new VideoCapture(0);
		capture.set(Videoio.CAP_PROP_FRAME_WIDTH, 1920);
		capture.set(Videoio.CAP_PROP_FRAME_HEIGHT, 1080);
		//capture.set(Videoio.CV_CAP_PROP_ISO_SPEED, 50);
		//capture.set(Videoio.CAP_PROP_WHITE_BALANCE_RED_V, 100);

		if (capture.isOpened()) {
			while (true) {
				capture.read(webcamMatImage);
				if (!webcamMatImage.empty()) {
					BS.originalImage = webcamMatImage;
					if (BS.firstImage == null) {
						BS.firstImage = new Mat();
						Imgproc.cvtColor(BS.originalImage, BS.firstImage, Imgproc.COLOR_BGR2GRAY);
					}
					if (Motion) {
						BS.locateHighestBrightnessPointMotionDetect();
					} else {
						BS.locateHighestBrightnessPoint();
					}

					jLabel_DisplayStatistrics.setText(Double.toString(BS.minMaxLocResult.maxVal));
					if (BS.minMaxLocResult.maxVal > MinLazerBrightness) {  //<<< change the value in the if
						if (MoveMouse) {
							robot.mouseMove(
									(int) (screenSize.width / BS.originalImage.size().width * BS.minMaxLocResult.maxLoc.x),
									(int) (screenSize.height / BS.originalImage.size().height * BS.minMaxLocResult.maxLoc.y));
						}

						Imgproc.circle(webcamMatImage, BS.minMaxLocResult.maxLoc, 8, new Scalar(0, 255, 0));
					}

					if (DisplayOriginal) {
						imageLabel.setIcon(new ImageIcon(ScaledImageLabel.toBufferedImage(webcamMatImage)));
					} else {
						imageLabel.setIcon(new ImageIcon(ScaledImageLabel.toBufferedImage(BS.grayImage)));
					}
				} else {
					JOptionPane.showMessageDialog(null, "Please close any other app using the webcam", "-- Frame not captured --", ERROR_MESSAGE);
					System.exit(1);
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "Couldn't open capture.", "Error", ERROR_MESSAGE);
			System.exit(1);
		}
	}

	private static int MinLazerBrightness = 250;
	private static boolean MoveMouse = false;
	private static boolean DisplayOriginal = false;
	private static boolean Motion = false;
	private static Mat webcamMatImage = new Mat();
	private static ScaledImageLabel imageLabel = new ScaledImageLabel();
	private static FindBrightestSpot BS;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox_Motion;
    private javax.swing.JCheckBox jCheckBox_MouseCurser;
    private javax.swing.JCheckBox jCheckBox_OriginalIMG;
    private javax.swing.JCheckBox jCheckBox_StaticBackGround;
    private javax.swing.JLabel jLabel_Blur;
    private static javax.swing.JLabel jLabel_DisplayStatistrics;
    private javax.swing.JLabel jLabel_LazerBrightness;
    private javax.swing.JLabel jLabel_ScaledVedioFeed;
    private javax.swing.JSlider jSlider_Blur;
    private javax.swing.JSlider jSlider_LazerBrightness;
    // End of variables declaration//GEN-END:variables
}

package jetbrains.mps.samples.VoiceMenu.sandbox;

/*Generated by MPS */

import java.awt.event.ActionListener;
import JavaVoiceMenu.runtime.Event;
import java.util.ArrayList;
import JavaVoiceMenu.runtime.Variables;
import JavaVoiceMenu.runtime.Behaviour;
import JavaVoiceMenu.runtime.Style;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import JavaVoiceMenu.runtime.MacVoice;
import java.io.IOException;

public class Sample_1 implements ActionListener {


  public static Sample_1 instance;

  public static void initHashMap() {

    Event Home = new Event("Sample", "0");
    Home.setAction("", true);
    Home.setPlayBack("Welcome to " + "Sample");

    Home.setPlayBack("Welcome to Sample Menu");
    Home.childs = new ArrayList<Event>();
    Home.isFinal = false;
    Variables.main_Text = "Sample";

    Variables.myHashMap.put("0", Home);


    Event Sample_Activity_kf1bs5_a0 = new Event("Sample Activity", "1");
    Sample_Activity_kf1bs5_a0.isFinal = false;
    Sample_Activity_kf1bs5_a0.setAction("", false);
    Sample_Activity_kf1bs5_a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01", Sample_Activity_kf1bs5_a0);
    Sample_Activity_kf1bs5_a0.setAction("getInfo", true);
    Sample_Activity_kf1bs5_a0.childs = new ArrayList<Event>();

    Home.childs.add(Sample_Activity_kf1bs5_a0);


    Variables.timeout = new Event("timeout", "X");
    Variables.timeout.playback = "";
    Variables.timeout.duration = 7;
    Variables.timeout.action = "replay";
    Variables.timeout.isFinal = false;
  }

  public static void main(String[] args) {
    initHashMap();
    instance = new Sample_1();
    Sample_1.initHashMap();
    initView();
    Behaviour.runInitSetup();

  }

  public static void initView() {
    Style.setContent();
    addButtons(Style.myPanelOfButtons);
    Style.myPhone.add(Style.myPanelOfButtons, BorderLayout.SOUTH);
    Style.setFrame();
  }

  public static void addButtons(JPanel myPanelOfButtons) {/* error: statement w/o textGen:foreach */
  }
  @Override
  public void actionPerformed(ActionEvent event) {
    if (!(((Variables.path == null || Variables.path.length() == 0) || Variables.finished == true || Variables.started == false))) {
      try {
        if (Variables.timerThr.isAlive()) {
          Variables.timerThr.interrupt();
        }
        try {
          if (MacVoice.waitingThr.isAlive()) {
            MacVoice.waitingThr.interrupt();
          }
        } catch (Exception e) {
        }
        Behaviour.runLogic(event, false);

      } catch (IOException e) {
        e.printStackTrace();
      }


    }
  }

}

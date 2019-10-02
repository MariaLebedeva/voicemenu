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

public class myVoiceMenu_1 implements ActionListener {


  public static myVoiceMenu_1 instance;

  public static void initHashMap() {

    Event Home = new Event("myVoiceMenu", "0");
    Home.setAction("", true);
    Home.setPlayBack("Welcome to " + "myVoiceMenu");

    Home.childs = new ArrayList<Event>();
    Home.isFinal = false;
    Variables.main_Text = "myVoiceMenu";

    Variables.myHashMap.put("0", Home);


    Event Technical_Department_35s59u_a0 = new Event("Technical Department", "1");
    Technical_Department_35s59u_a0.isFinal = false;
    Technical_Department_35s59u_a0.setAction("", false);
    Technical_Department_35s59u_a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01", Technical_Department_35s59u_a0);
    Event Hardware_35s59u_a0a0 = new Event("Hardware", "1");
    Hardware_35s59u_a0a0.isFinal = false;
    Hardware_35s59u_a0a0.setAction("", false);
    Hardware_35s59u_a0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("011", Hardware_35s59u_a0a0);
    Hardware_35s59u_a0a0.setAction("getInfo", false);
    Hardware_35s59u_a0a0.childs = new ArrayList<Event>();
    Event Previous_Menu_35s59u_b0a0 = new Event("Previous Menu", "*");
    Previous_Menu_35s59u_b0a0.isFinal = false;
    Previous_Menu_35s59u_b0a0.setAction("", false);
    Previous_Menu_35s59u_b0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01*", Previous_Menu_35s59u_b0a0);
    Previous_Menu_35s59u_b0a0.setAction("getInfo", true);
    Previous_Menu_35s59u_b0a0.childs = new ArrayList<Event>();
    Technical_Department_35s59u_a0.childs = new ArrayList<Event>();
    Technical_Department_35s59u_a0.childs.add(Hardware_35s59u_a0a0);
    Technical_Department_35s59u_a0.childs.add(Previous_Menu_35s59u_b0a0);
    Event Marketing_Department_35s59u_b0 = new Event("Marketing Department", "2");
    Marketing_Department_35s59u_b0.isFinal = false;
    Marketing_Department_35s59u_b0.setAction("", false);
    Marketing_Department_35s59u_b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("02", Marketing_Department_35s59u_b0);
    Marketing_Department_35s59u_b0.setAction("call", true);
    Marketing_Department_35s59u_b0.childs = new ArrayList<Event>();
    Event Others_35s59u_c0 = new Event("Others", "3");
    Others_35s59u_c0.isFinal = false;
    Others_35s59u_c0.setAction("", false);
    Others_35s59u_c0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("03", Others_35s59u_c0);
    Others_35s59u_c0.setAction("record", false);
    Others_35s59u_c0.childs = new ArrayList<Event>();

    Home.childs.add(Technical_Department_35s59u_a0);
    Home.childs.add(Marketing_Department_35s59u_b0);
    Home.childs.add(Others_35s59u_c0);


    Variables.timeout = new Event("timeout", "X");
    Variables.timeout.playback = "";
    Variables.timeout.duration = 7;
    Variables.timeout.action = "replay";
    Variables.timeout.isFinal = false;
  }

  public static void main(String[] args) {
    initHashMap();
    instance = new myVoiceMenu_1();
    myVoiceMenu_1.initHashMap();
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

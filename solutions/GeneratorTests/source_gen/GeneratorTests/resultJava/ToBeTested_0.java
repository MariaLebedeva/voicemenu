package GeneratorTests.resultJava;

/*Generated by MPS */

import java.awt.event.ActionListener;
import JavaVoiceMenu.runtime.Event;
import java.util.ArrayList;
import JavaVoiceMenu.runtime.Variables;
import JavaVoiceMenu.runtime.Behaviour;
import JavaVoiceMenu.runtime.Style;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import JavaVoiceMenu.runtime.Data;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import JavaVoiceMenu.runtime.MacVoice;
import java.io.IOException;

public class ToBeTested_0 implements ActionListener {


  public static ToBeTested_0 instance;

  public static void initHashMap() {

    Event Home = new Event("ToBeTested", "0");
    Home.setAction("", true);
    Home.setPlayBack("Welcome to " + "ToBeTested");

    Home.childs = new ArrayList<Event>();
    Home.isFinal = false;
    Variables.main_Text = "ToBeTested";

    Variables.myHashMap.put("0", Home);


    Event a_o3uxqf_a0 = new Event("a", "1");
    a_o3uxqf_a0.isFinal = false;
    a_o3uxqf_a0.setAction("", false);
    a_o3uxqf_a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01", a_o3uxqf_a0);
    a_o3uxqf_a0.setAction("hangUp", true);
    a_o3uxqf_a0.childs = new ArrayList<Event>();
    Event b_o3uxqf_b0 = new Event("b", "2");
    b_o3uxqf_b0.isFinal = false;
    b_o3uxqf_b0.setAction("", false);
    b_o3uxqf_b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("02", b_o3uxqf_b0);
    b_o3uxqf_b0.setAction("call", true);
    b_o3uxqf_b0.childs = new ArrayList<Event>();

    Home.childs.add(a_o3uxqf_a0);
    Home.childs.add(b_o3uxqf_b0);


    Variables.timeout = new Event("timeout", "X");
    Variables.timeout.playback = "";
    Variables.timeout.duration = 7;
    Variables.timeout.action = "replay";
    Variables.timeout.isFinal = false;
  }

  public static void main(String[] args) {
    initHashMap();
    instance = new ToBeTested_0();
    ToBeTested_0.initHashMap();
    initView();
    Behaviour.runInitSetup();

  }

  public static void initView() {
    Style.setContent();
    addButtons(Style.myPanelOfButtons);
    Style.myPhone.add(Style.myPanelOfButtons, BorderLayout.SOUTH);
    Style.setFrame();
  }

  public static void addButtons(JPanel myPanelOfButtons) {
    for (Data.Status item : Data.Status.values()) {
      JButton button = new JButton(item.getCode());
      button.setActionCommand(item.getCode());
      button.addActionListener(instance);
      button.setPreferredSize(new Dimension(78, 76));
      Border border = new LineBorder(Color.white, 13);
      button.setBorder(border);
      myPanelOfButtons.add(button);
    }
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

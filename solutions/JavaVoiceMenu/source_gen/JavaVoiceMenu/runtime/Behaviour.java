package JavaVoiceMenu.runtime;

/*Generated by MPS */

import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.IOException;

public class Behaviour {
  public static class myTimer implements Runnable {
    public static ActionEvent evt;
    /*package*/ int duration;
    public static boolean loadEvnt;
    /*package*/ String action = "";

    public myTimer(ActionEvent EVNT, boolean RPT) {
      evt = EVNT;
      loadEvnt = RPT;
    }

    public void run() {
      try {
        if (!(Variables.started)) {
          return;
        }
        TimeUnit.SECONDS.sleep(Variables.timeout.duration);
        String timeoutAction = Variables.timeout.action;
        if (Objects.equals(timeoutAction, "back")) {
          if (Variables.path.length() > 1) {
            Variables.path = Variables.path.substring(0, Variables.path.length() - 1);
          }
          Style.setTextToScreen("Back");

          if (isEmptyString(Variables.timeout.playback)) {
            Variables.voice.addText("Going to the previous menu.");
          } else {
            PlayGetInfo(Variables.timeout.playback);
          }

        } else if (Objects.equals(timeoutAction, "call")) {
          Style.setTextToScreen("Direct Call");

          if (isEmptyString(Variables.timeout.playback)) {
            Variables.voice.addText("Direct call has begun.");
          } else {
            PlayGetInfo(Variables.timeout.playback);
          }
          if (Variables.timeout.isFinal) {
            Style.setTextToScreen("Call ended");
            Variables.voice.speak();
            return;
          }

        } else if (Objects.equals(timeoutAction, "getInfo")) {
          Style.setTextToScreen("Get Info");
          if (isEmptyString(Variables.timeout.playback)) {
            Variables.voice.addText("Getting you the latest info.");
          } else {
            PlayGetInfo(Variables.timeout.playback);
          }
          if (Variables.timeout.isFinal) {
            Style.setTextToScreen("Call ended");
            Variables.voice.speak();
            return;
          }

        } else if (Objects.equals(timeoutAction, "hangUp")) {
          Style.setTextToScreen("HangUp");
          if (isEmptyString(Variables.timeout.playback)) {
            Variables.voice.addText("Phone call ended.");
          } else {
            PlayGetInfo(Variables.timeout.playback);
          }
          Style.setTextToScreen("Call ended");
          Variables.voice.speak();
          return;

        } else if (Objects.equals(timeoutAction, "other")) {
          Style.setTextToScreen("Other");
          if (isEmptyString(Variables.timeout.playback)) {
            Variables.voice.addText("Other");
          } else {
            PlayGetInfo(Variables.timeout.playback);
          }
          if (Variables.timeout.isFinal) {
            Style.setTextToScreen("Call ended");
            Variables.voice.speak();
            return;
          }

        } else if (Objects.equals(timeoutAction, "record")) {
          Style.setTextToScreen("Initiliazing record. ");
          Thread.sleep(900);
          Style.setTextToScreen("Recording started. ");
          Thread.sleep(2000);
          if (isEmptyString(Variables.timeout.playback)) {
            Variables.voice.addText("Succesfully recorded. ");
          } else {
            PlayGetInfo(Variables.timeout.playback);
          }
          Style.setTextToScreen("Succesfully recorded");
          Thread.sleep(900);

          if (Variables.timeout.isFinal) {
            Style.setTextToScreen("Call ended");
            Variables.voice.speak();
            return;

          }

        } else if (Objects.equals(timeoutAction, "replay")) {
          Style.setTextToScreen("Replay");
          if (isEmptyString(Variables.timeout.playback)) {
            Variables.voice.addText("Replay Options");
          } else {
            PlayGetInfo(Variables.timeout.playback);
          }
        }
        Behaviour.runLogic(evt, true);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    private static boolean isEmptyString(String str) {
      return str == null || str.length() == 0;
    }
  }

  public static void PlayGetInfo(String path) {
    try {
      File iFile = new File(path);
      AudioInputStream iStream = AudioSystem.getAudioInputStream(iFile);
      Clip myClip = AudioSystem.getClip();
      myClip.open(iStream);
      Variables.voice.speak();
      myClip.start();

      while (myClip.isOpen()) {
        try {
          Thread.sleep(10);
          if (!(myClip.isActive())) {
            break;
          }
        } catch (Exception e) {
          Variables.playbackisFile = false;
          e.getStackTrace();
        }
        Variables.playbackisFile = true;
      }
    } catch (Exception e) {
      System.out.println("File does NOT exist\ntext used as input for generating speech");
      Variables.voice.addText(path);
    }
  }

  public static void runLogic(ActionEvent evt, boolean sameEvnt) throws IOException {
    Variables.voice.stop();
    // Initilization of voice output 
    // Variable to store which character was pressed 
    if (!(sameEvnt)) {
      String character = evt.getActionCommand();
      if (!(Variables.possibleOptList.contains(character))) {
        String charToRead;
        if (character == "*") {
          charToRead = "star ";
        } else if (character == "#") {
          charToRead = "hash";
        } else {
          charToRead = character;
        }
        Variables.voice.addText(charToRead + "is a bad option. please try again");
      } else {
        Variables.path = Variables.path + character;
      }
    }
    // Checking if correct option was pressed. If so Variables.path is updated 
    // Loading next Event according to what is specified in "Variables.path" 
    Event currentEvent = Variables.myHashMap.get(Variables.path);
    Style.setTextToScreen(currentEvent.name);
    // Checking if "back" option was selected via name of the current event 
    if (!(isEmptyString(currentEvent.action))) {
      if (currentEvent.action.equals("back")) {
        // updating Variables.path to get back 
        Variables.voice.addText("Going to the previous menu");
        Variables.path = Variables.path.substring(0, Variables.path.length() - 2);
        // loading previous event 
      } else
      if (currentEvent.action.equals("call")) {
        Variables.voice.addText("Direct call started");
        Style.setTextToScreen("Direct Call");
        Variables.finished = currentEvent.isFinal;

      } else
      if (currentEvent.action.equals("getInfo")) {
        if (isEmptyString(currentEvent.playback)) {
          Variables.voice.addText("Getting you the latest information");
        } else {
          PlayGetInfo(currentEvent.playback);
        }
        Style.setTextToScreen("Getting Informations");
        Variables.finished = currentEvent.isFinal;

      } else
      if (currentEvent.action.equals("other")) {
        Variables.voice.addText(currentEvent.playback);
        Variables.voice.addText("You've entered section of Other Services");
        Style.setTextToScreen("Other Services");
        Variables.finished = currentEvent.isFinal;

      } else if (currentEvent.action.equals("hangUp")) {
        Variables.voice.addText(currentEvent.playback);
        Variables.voice.addText("Phone call ended");
        Style.setTextToScreen("End of Call");
        Variables.finished = currentEvent.isFinal;

      } else if (currentEvent.action.equals("record")) {
        Variables.voice.addText(currentEvent.playback);
        Style.setTextToScreen("Recording");
        Variables.voice.addText("After beep start speaking beep");
        try {
        } catch (Exception e) {

        }
        Variables.voice.addText("Succesfully recorded");

      } else if (currentEvent.action.equals("replay")) {
        if (isEmptyString(currentEvent.playback)) {
          Variables.voice.addText("Repeating possible options");
          System.out.println("addtext");
        } else {
          PlayGetInfo(currentEvent.playback);
        }
        Variables.path = Variables.path.substring(0, Variables.path.length() - 1);
      }
      Variables.finished = currentEvent.isFinal;
      if (Variables.finished) {
        Variables.voice.speak();
        Style.setTextToScreen("PhoneCall finished");
        return;
      } else {
        if (!(currentEvent.action.equals("back")) && !(currentEvent.action.equals("replay"))) {
          Variables.path = Variables.path.substring(0, Variables.path.length() - 1);
        }
        currentEvent = Variables.myHashMap.get(Variables.path);
      }
      Style.setTextToScreen(currentEvent.action);
    }

    // Handling voice output 
    if (isNotEmptyString(currentEvent.playback)) {
      PlayGetInfo(currentEvent.playback);
    }
    if (!(Variables.playbackisFile)) {
      if (isEmptyString(Variables.voice.text)) {
        Variables.voice.addText("Choose from this menu, ");
      } else {
        Variables.voice.addText(", Choose from this menu, ");
      }
    }
    // Delete all the previous possible options 
    Variables.possibleOptList.clear();
    // Proposing possible options consisting of next events 
    for (Event child : currentEvent.childs) {
      String trigger;
      if (child.trigger == "*") {
        trigger = " star";
      } else if (child.trigger == "#") {
        trigger = " hash";
      } else {
        trigger = child.trigger;
      }
      if (!(Variables.playbackisFile)) {
        Variables.voice.addText(" ,For " + child.name + " press " + trigger + ",");
      }
      Variables.possibleOptList.add(child.trigger);
    }
    Variables.voice.speak();
  }
  public static void runInitSetup() {
    // Static first iteration of Voicemenu 
    // declaring first possible following characters 
    Event currentEvent = Variables.myHashMap.get("0");
    for (Event item : currentEvent.childs) {
      Variables.possibleOptList.add(item.trigger);
    }
    // Itialization of voice output 
  }
  private static boolean isEmptyString(String str) {
    return str == null || str.length() == 0;
  }
  private static boolean isNotEmptyString(String str) {
    return str != null && str.length() > 0;
  }
}

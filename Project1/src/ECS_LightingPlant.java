import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.ECS_GUI;//sysj\ECS_plant.sysj line: 1, column: 1

public class ECS_LightingPlant extends ClockDomain{
  public ECS_LightingPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal zoneOneLightingI = new Signal("zoneOneLightingI", Signal.INPUT);
  public Signal zoneTwoLightingI = new Signal("zoneTwoLightingI", Signal.INPUT);
  public Signal zoneThreeLightingI = new Signal("zoneThreeLightingI", Signal.INPUT);
  public Signal zoneFourLightingI = new Signal("zoneFourLightingI", Signal.INPUT);
  public Signal zoneFiveLightingI = new Signal("zoneFiveLightingI", Signal.INPUT);
  public Signal zoneSixLightingI = new Signal("zoneSixLightingI", Signal.INPUT);
  public Signal zoneSevenLightingI = new Signal("zoneSevenLightingI", Signal.INPUT);
  public Signal zoneOneLightONOFF = new Signal("zoneOneLightONOFF", Signal.INPUT);
  public Signal zoneTwoLightONOFF = new Signal("zoneTwoLightONOFF", Signal.INPUT);
  public Signal zoneThreeLightONOFF = new Signal("zoneThreeLightONOFF", Signal.INPUT);
  public Signal zoneFourLightONOFF = new Signal("zoneFourLightONOFF", Signal.INPUT);
  public Signal zoneFiveLightONOFF = new Signal("zoneFiveLightONOFF", Signal.INPUT);
  public Signal zoneSixLightONOFF = new Signal("zoneSixLightONOFF", Signal.INPUT);
  public Signal zoneSevenLightONOFF = new Signal("zoneSevenLightONOFF", Signal.INPUT);
  public Signal zoneOneWindowONOFF = new Signal("zoneOneWindowONOFF", Signal.INPUT);
  public Signal zoneTwoWindowONOFF = new Signal("zoneTwoWindowONOFF", Signal.INPUT);
  public Signal zoneThreeWindowONOFF = new Signal("zoneThreeWindowONOFF", Signal.INPUT);
  public Signal zoneFourWindowONOFF = new Signal("zoneFourWindowONOFF", Signal.INPUT);
  public Signal zoneFiveWindowONOFF = new Signal("zoneFiveWindowONOFF", Signal.INPUT);
  public Signal zoneSixWindowONOFF = new Signal("zoneSixWindowONOFF", Signal.INPUT);
  public Signal zoneSevenWindowONOFF = new Signal("zoneSevenWindowONOFF", Signal.INPUT);
  public Signal zoneOneFinished = new Signal("zoneOneFinished", Signal.OUTPUT);
  public Signal zoneTwoFinished = new Signal("zoneTwoFinished", Signal.OUTPUT);
  public Signal zoneThreeFinished = new Signal("zoneThreeFinished", Signal.OUTPUT);
  public Signal zoneFourFinished = new Signal("zoneFourFinished", Signal.OUTPUT);
  public Signal zoneFiveFinished = new Signal("zoneFiveFinished", Signal.OUTPUT);
  public Signal zoneSixFinished = new Signal("zoneSixFinished", Signal.OUTPUT);
  public Signal zoneSevenFinished = new Signal("zoneSevenFinished", Signal.OUTPUT);
  public Signal zoneOneLightONOFF_E = new Signal("zoneOneLightONOFF_E", Signal.OUTPUT);
  public Signal zoneTwoLightONOFF_E = new Signal("zoneTwoLightONOFF_E", Signal.OUTPUT);
  public Signal zoneThreeLightONOFF_E = new Signal("zoneThreeLightONOFF_E", Signal.OUTPUT);
  public Signal zoneFourLightONOFF_E = new Signal("zoneFourLightONOFF_E", Signal.OUTPUT);
  public Signal zoneFiveLightONOFF_E = new Signal("zoneFiveLightONOFF_E", Signal.OUTPUT);
  public Signal zoneSixLightONOFF_E = new Signal("zoneSixLightONOFF_E", Signal.OUTPUT);
  public Signal zoneSevenLightONOFF_E = new Signal("zoneSevenLightONOFF_E", Signal.OUTPUT);
  public Signal zoneOneWindowONOFF_E = new Signal("zoneOneWindowONOFF_E", Signal.OUTPUT);
  public Signal zoneTwoWindowONOFF_E = new Signal("zoneTwoWindowONOFF_E", Signal.OUTPUT);
  public Signal zoneThreeWindowONOFF_E = new Signal("zoneThreeWindowONOFF_E", Signal.OUTPUT);
  public Signal zoneFourWindowONOFF_E = new Signal("zoneFourWindowONOFF_E", Signal.OUTPUT);
  public Signal zoneFiveWindowONOFF_E = new Signal("zoneFiveWindowONOFF_E", Signal.OUTPUT);
  public Signal zoneSixWindowONOFF_E = new Signal("zoneSixWindowONOFF_E", Signal.OUTPUT);
  public Signal zoneSevenWindowONOFF_E = new Signal("zoneSevenWindowONOFF_E", Signal.OUTPUT);
  private int previousIntensity_thread_23;//sysj\ECS_plant.sysj line: 139, column: 8
  private int previousIntensity_thread_24;//sysj\ECS_plant.sysj line: 155, column: 8
  private int previousIntensity_thread_25;//sysj\ECS_plant.sysj line: 170, column: 8
  private int previousIntensity_thread_26;//sysj\ECS_plant.sysj line: 185, column: 8
  private int previousIntensity_thread_27;//sysj\ECS_plant.sysj line: 200, column: 8
  private int previousIntensity_thread_28;//sysj\ECS_plant.sysj line: 215, column: 8
  private int previousIntensity_thread_29;//sysj\ECS_plant.sysj line: 230, column: 8
  private int currentIntensity_thread_23;//sysj\ECS_plant.sysj line: 142, column: 12
  private int currentIntensity_thread_24;//sysj\ECS_plant.sysj line: 158, column: 12
  private int currentIntensity_thread_25;//sysj\ECS_plant.sysj line: 173, column: 12
  private int currentIntensity_thread_26;//sysj\ECS_plant.sysj line: 188, column: 12
  private int currentIntensity_thread_27;//sysj\ECS_plant.sysj line: 203, column: 12
  private int currentIntensity_thread_28;//sysj\ECS_plant.sysj line: 218, column: 12
  private int currentIntensity_thread_29;//sysj\ECS_plant.sysj line: 233, column: 12
  private int S25586 = 1;
  private int S25388 = 1;
  private int S25402 = 1;
  private int S25416 = 1;
  private int S25430 = 1;
  private int S25444 = 1;
  private int S25458 = 1;
  private int S25472 = 1;
  private int S25480 = 1;
  private int S25488 = 1;
  private int S25496 = 1;
  private int S25504 = 1;
  private int S25512 = 1;
  private int S25520 = 1;
  private int S25528 = 1;
  private int S25536 = 1;
  private int S25544 = 1;
  private int S25552 = 1;
  private int S25560 = 1;
  private int S25568 = 1;
  private int S25576 = 1;
  private int S25584 = 1;
  
  private int[] ends = new int[47];
  private int[] tdone = new int[47];
  
  public void thread25724(int [] tdone, int [] ends){
        switch(S25584){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        if(zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 275, column: 31
          zoneSevenWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 275, column: 53
          currsigs.addElement(zoneSevenWindowONOFF_E);
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        break;
      
    }
  }

  public void thread25723(int [] tdone, int [] ends){
        switch(S25576){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        if(zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 273, column: 31
          zoneSixWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 273, column: 51
          currsigs.addElement(zoneSixWindowONOFF_E);
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        break;
      
    }
  }

  public void thread25722(int [] tdone, int [] ends){
        switch(S25568){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 271, column: 31
          zoneFiveWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 271, column: 52
          currsigs.addElement(zoneFiveWindowONOFF_E);
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        break;
      
    }
  }

  public void thread25721(int [] tdone, int [] ends){
        switch(S25560){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        if(zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 269, column: 31
          zoneFourWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 269, column: 52
          currsigs.addElement(zoneFourWindowONOFF_E);
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        break;
      
    }
  }

  public void thread25720(int [] tdone, int [] ends){
        switch(S25552){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        if(zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 267, column: 31
          zoneThreeWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 267, column: 53
          currsigs.addElement(zoneThreeWindowONOFF_E);
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        break;
      
    }
  }

  public void thread25719(int [] tdone, int [] ends){
        switch(S25544){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 265, column: 31
          zoneTwoWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 265, column: 51
          currsigs.addElement(zoneTwoWindowONOFF_E);
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        break;
      
    }
  }

  public void thread25718(int [] tdone, int [] ends){
        switch(S25536){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 263, column: 31
          zoneOneWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 263, column: 51
          currsigs.addElement(zoneOneWindowONOFF_E);
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        break;
      
    }
  }

  public void thread25717(int [] tdone, int [] ends){
        switch(S25528){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 257, column: 31
          zoneSevenLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 257, column: 52
          currsigs.addElement(zoneSevenLightONOFF_E);
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        break;
      
    }
  }

  public void thread25716(int [] tdone, int [] ends){
        switch(S25520){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 255, column: 31
          zoneSixLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 255, column: 50
          currsigs.addElement(zoneSixLightONOFF_E);
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread25715(int [] tdone, int [] ends){
        switch(S25512){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 253, column: 31
          zoneFiveLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 253, column: 51
          currsigs.addElement(zoneFiveLightONOFF_E);
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread25714(int [] tdone, int [] ends){
        switch(S25504){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 251, column: 31
          zoneFourLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 251, column: 51
          currsigs.addElement(zoneFourLightONOFF_E);
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread25713(int [] tdone, int [] ends){
        switch(S25496){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 249, column: 31
          zoneThreeLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 249, column: 52
          currsigs.addElement(zoneThreeLightONOFF_E);
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        else {
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        break;
      
    }
  }

  public void thread25712(int [] tdone, int [] ends){
        switch(S25488){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 247, column: 31
          zoneTwoLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 247, column: 50
          currsigs.addElement(zoneTwoLightONOFF_E);
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        else {
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        break;
      
    }
  }

  public void thread25711(int [] tdone, int [] ends){
        switch(S25480){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 245, column: 31
          zoneOneLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 245, column: 50
          currsigs.addElement(zoneOneLightONOFF_E);
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread25710(int [] tdone, int [] ends){
        switch(S25472){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(zoneSevenLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 232, column: 18
          currentIntensity_thread_29 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS_plant.sysj line: 233, column: 12
          if(currentIntensity_thread_29 != previousIntensity_thread_29) {//sysj\ECS_plant.sysj line: 235, column: 54
            System.out.println("Zone 7 Detected Change in Occupancy and Intensity is set to: " + currentIntensity_thread_29);//sysj\ECS_plant.sysj line: 236, column: 16
            previousIntensity_thread_29 = currentIntensity_thread_29;//sysj\ECS_plant.sysj line: 237, column: 16
          }
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread25709(int [] tdone, int [] ends){
        switch(S25458){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(zoneSixLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 217, column: 18
          currentIntensity_thread_28 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS_plant.sysj line: 218, column: 12
          if(currentIntensity_thread_28 != previousIntensity_thread_28) {//sysj\ECS_plant.sysj line: 220, column: 54
            System.out.println("Zone 6 Detected Change in Occupancy and Intensity is set to: " + currentIntensity_thread_28);//sysj\ECS_plant.sysj line: 221, column: 16
            previousIntensity_thread_28 = currentIntensity_thread_28;//sysj\ECS_plant.sysj line: 222, column: 16
          }
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        else {
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread25708(int [] tdone, int [] ends){
        switch(S25444){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(zoneFiveLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 202, column: 18
          currentIntensity_thread_27 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS_plant.sysj line: 203, column: 12
          if(currentIntensity_thread_27 != previousIntensity_thread_27) {//sysj\ECS_plant.sysj line: 205, column: 54
            System.out.println("Zone 5 Detected Change in Occupancy and Intensity is set to: " + currentIntensity_thread_27);//sysj\ECS_plant.sysj line: 206, column: 16
            previousIntensity_thread_27 = currentIntensity_thread_27;//sysj\ECS_plant.sysj line: 207, column: 16
          }
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread25707(int [] tdone, int [] ends){
        switch(S25430){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(zoneFourLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 187, column: 18
          currentIntensity_thread_26 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS_plant.sysj line: 188, column: 12
          if(currentIntensity_thread_26 != previousIntensity_thread_26) {//sysj\ECS_plant.sysj line: 190, column: 54
            System.out.println("Zone 4 Detected Change in Occupancy and Intensity is set to: " + currentIntensity_thread_26);//sysj\ECS_plant.sysj line: 191, column: 16
            previousIntensity_thread_26 = currentIntensity_thread_26;//sysj\ECS_plant.sysj line: 192, column: 16
          }
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread25706(int [] tdone, int [] ends){
        switch(S25416){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(zoneThreeLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 172, column: 18
          currentIntensity_thread_25 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS_plant.sysj line: 173, column: 12
          if(currentIntensity_thread_25 != previousIntensity_thread_25) {//sysj\ECS_plant.sysj line: 175, column: 54
            System.out.println("Zone 3 Detected Change in Occupancy and Intensity is set to: " + currentIntensity_thread_25);//sysj\ECS_plant.sysj line: 176, column: 16
            previousIntensity_thread_25 = currentIntensity_thread_25;//sysj\ECS_plant.sysj line: 177, column: 16
          }
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread25705(int [] tdone, int [] ends){
        switch(S25402){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(zoneTwoLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 157, column: 18
          currentIntensity_thread_24 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS_plant.sysj line: 158, column: 12
          if(currentIntensity_thread_24 != previousIntensity_thread_24) {//sysj\ECS_plant.sysj line: 160, column: 54
            System.out.println("Zone 2 Detected Change in Occupancy and Intensity is set to: " + currentIntensity_thread_24);//sysj\ECS_plant.sysj line: 161, column: 16
            previousIntensity_thread_24 = currentIntensity_thread_24;//sysj\ECS_plant.sysj line: 162, column: 16
          }
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        else {
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread25704(int [] tdone, int [] ends){
        switch(S25388){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(zoneOneLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 141, column: 18
          currentIntensity_thread_23 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS_plant.sysj line: 142, column: 12
          if(currentIntensity_thread_23 != previousIntensity_thread_23) {//sysj\ECS_plant.sysj line: 144, column: 54
            System.out.println("Zone 1 Detected Change in Occupancy and Intensity is set to: " + currentIntensity_thread_23);//sysj\ECS_plant.sysj line: 145, column: 16
            previousIntensity_thread_23 = currentIntensity_thread_23;//sysj\ECS_plant.sysj line: 146, column: 16
          }
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread25702(int [] tdone, int [] ends){
        S25584=1;
    if(zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 275, column: 31
      zoneSevenWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 275, column: 53
      currsigs.addElement(zoneSevenWindowONOFF_E);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread25701(int [] tdone, int [] ends){
        S25576=1;
    if(zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 273, column: 31
      zoneSixWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 273, column: 51
      currsigs.addElement(zoneSixWindowONOFF_E);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread25700(int [] tdone, int [] ends){
        S25568=1;
    if(zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 271, column: 31
      zoneFiveWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 271, column: 52
      currsigs.addElement(zoneFiveWindowONOFF_E);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread25699(int [] tdone, int [] ends){
        S25560=1;
    if(zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 269, column: 31
      zoneFourWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 269, column: 52
      currsigs.addElement(zoneFourWindowONOFF_E);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread25698(int [] tdone, int [] ends){
        S25552=1;
    if(zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 267, column: 31
      zoneThreeWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 267, column: 53
      currsigs.addElement(zoneThreeWindowONOFF_E);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread25697(int [] tdone, int [] ends){
        S25544=1;
    if(zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 265, column: 31
      zoneTwoWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 265, column: 51
      currsigs.addElement(zoneTwoWindowONOFF_E);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread25696(int [] tdone, int [] ends){
        S25536=1;
    if(zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 263, column: 31
      zoneOneWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 263, column: 51
      currsigs.addElement(zoneOneWindowONOFF_E);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread25695(int [] tdone, int [] ends){
        S25528=1;
    if(zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 257, column: 31
      zoneSevenLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 257, column: 52
      currsigs.addElement(zoneSevenLightONOFF_E);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread25694(int [] tdone, int [] ends){
        S25520=1;
    if(zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 255, column: 31
      zoneSixLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 255, column: 50
      currsigs.addElement(zoneSixLightONOFF_E);
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread25693(int [] tdone, int [] ends){
        S25512=1;
    if(zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 253, column: 31
      zoneFiveLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 253, column: 51
      currsigs.addElement(zoneFiveLightONOFF_E);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread25692(int [] tdone, int [] ends){
        S25504=1;
    if(zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 251, column: 31
      zoneFourLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 251, column: 51
      currsigs.addElement(zoneFourLightONOFF_E);
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread25691(int [] tdone, int [] ends){
        S25496=1;
    if(zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 249, column: 31
      zoneThreeLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 249, column: 52
      currsigs.addElement(zoneThreeLightONOFF_E);
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread25690(int [] tdone, int [] ends){
        S25488=1;
    if(zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 247, column: 31
      zoneTwoLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 247, column: 50
      currsigs.addElement(zoneTwoLightONOFF_E);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
  }

  public void thread25689(int [] tdone, int [] ends){
        S25480=1;
    if(zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 245, column: 31
      zoneOneLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 245, column: 50
      currsigs.addElement(zoneOneLightONOFF_E);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
  }

  public void thread25688(int [] tdone, int [] ends){
        S25472=1;
    previousIntensity_thread_29 = -1;//sysj\ECS_plant.sysj line: 230, column: 8
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread25687(int [] tdone, int [] ends){
        S25458=1;
    previousIntensity_thread_28 = -1;//sysj\ECS_plant.sysj line: 215, column: 8
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread25686(int [] tdone, int [] ends){
        S25444=1;
    previousIntensity_thread_27 = -1;//sysj\ECS_plant.sysj line: 200, column: 8
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread25685(int [] tdone, int [] ends){
        S25430=1;
    previousIntensity_thread_26 = -1;//sysj\ECS_plant.sysj line: 185, column: 8
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread25684(int [] tdone, int [] ends){
        S25416=1;
    previousIntensity_thread_25 = -1;//sysj\ECS_plant.sysj line: 170, column: 8
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread25683(int [] tdone, int [] ends){
        S25402=1;
    previousIntensity_thread_24 = -1;//sysj\ECS_plant.sysj line: 155, column: 8
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread25682(int [] tdone, int [] ends){
        S25388=1;
    previousIntensity_thread_23 = -1;//sysj\ECS_plant.sysj line: 139, column: 8
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S25586){
        case 0 : 
          S25586=0;
          break RUN;
        
        case 1 : 
          S25586=2;
          S25586=2;
          thread25682(tdone,ends);
          thread25683(tdone,ends);
          thread25684(tdone,ends);
          thread25685(tdone,ends);
          thread25686(tdone,ends);
          thread25687(tdone,ends);
          thread25688(tdone,ends);
          thread25689(tdone,ends);
          thread25690(tdone,ends);
          thread25691(tdone,ends);
          thread25692(tdone,ends);
          thread25693(tdone,ends);
          thread25694(tdone,ends);
          thread25695(tdone,ends);
          thread25696(tdone,ends);
          thread25697(tdone,ends);
          thread25698(tdone,ends);
          thread25699(tdone,ends);
          thread25700(tdone,ends);
          thread25701(tdone,ends);
          thread25702(tdone,ends);
          int biggest25703 = 0;
          if(ends[23]>=biggest25703){
            biggest25703=ends[23];
          }
          if(ends[24]>=biggest25703){
            biggest25703=ends[24];
          }
          if(ends[25]>=biggest25703){
            biggest25703=ends[25];
          }
          if(ends[26]>=biggest25703){
            biggest25703=ends[26];
          }
          if(ends[27]>=biggest25703){
            biggest25703=ends[27];
          }
          if(ends[28]>=biggest25703){
            biggest25703=ends[28];
          }
          if(ends[29]>=biggest25703){
            biggest25703=ends[29];
          }
          if(ends[30]>=biggest25703){
            biggest25703=ends[30];
          }
          if(ends[31]>=biggest25703){
            biggest25703=ends[31];
          }
          if(ends[32]>=biggest25703){
            biggest25703=ends[32];
          }
          if(ends[33]>=biggest25703){
            biggest25703=ends[33];
          }
          if(ends[34]>=biggest25703){
            biggest25703=ends[34];
          }
          if(ends[35]>=biggest25703){
            biggest25703=ends[35];
          }
          if(ends[36]>=biggest25703){
            biggest25703=ends[36];
          }
          if(ends[37]>=biggest25703){
            biggest25703=ends[37];
          }
          if(ends[38]>=biggest25703){
            biggest25703=ends[38];
          }
          if(ends[39]>=biggest25703){
            biggest25703=ends[39];
          }
          if(ends[40]>=biggest25703){
            biggest25703=ends[40];
          }
          if(ends[41]>=biggest25703){
            biggest25703=ends[41];
          }
          if(ends[42]>=biggest25703){
            biggest25703=ends[42];
          }
          if(ends[43]>=biggest25703){
            biggest25703=ends[43];
          }
          if(biggest25703 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
        
        case 2 : 
          thread25704(tdone,ends);
          thread25705(tdone,ends);
          thread25706(tdone,ends);
          thread25707(tdone,ends);
          thread25708(tdone,ends);
          thread25709(tdone,ends);
          thread25710(tdone,ends);
          thread25711(tdone,ends);
          thread25712(tdone,ends);
          thread25713(tdone,ends);
          thread25714(tdone,ends);
          thread25715(tdone,ends);
          thread25716(tdone,ends);
          thread25717(tdone,ends);
          thread25718(tdone,ends);
          thread25719(tdone,ends);
          thread25720(tdone,ends);
          thread25721(tdone,ends);
          thread25722(tdone,ends);
          thread25723(tdone,ends);
          thread25724(tdone,ends);
          int biggest25725 = 0;
          if(ends[23]>=biggest25725){
            biggest25725=ends[23];
          }
          if(ends[24]>=biggest25725){
            biggest25725=ends[24];
          }
          if(ends[25]>=biggest25725){
            biggest25725=ends[25];
          }
          if(ends[26]>=biggest25725){
            biggest25725=ends[26];
          }
          if(ends[27]>=biggest25725){
            biggest25725=ends[27];
          }
          if(ends[28]>=biggest25725){
            biggest25725=ends[28];
          }
          if(ends[29]>=biggest25725){
            biggest25725=ends[29];
          }
          if(ends[30]>=biggest25725){
            biggest25725=ends[30];
          }
          if(ends[31]>=biggest25725){
            biggest25725=ends[31];
          }
          if(ends[32]>=biggest25725){
            biggest25725=ends[32];
          }
          if(ends[33]>=biggest25725){
            biggest25725=ends[33];
          }
          if(ends[34]>=biggest25725){
            biggest25725=ends[34];
          }
          if(ends[35]>=biggest25725){
            biggest25725=ends[35];
          }
          if(ends[36]>=biggest25725){
            biggest25725=ends[36];
          }
          if(ends[37]>=biggest25725){
            biggest25725=ends[37];
          }
          if(ends[38]>=biggest25725){
            biggest25725=ends[38];
          }
          if(ends[39]>=biggest25725){
            biggest25725=ends[39];
          }
          if(ends[40]>=biggest25725){
            biggest25725=ends[40];
          }
          if(ends[41]>=biggest25725){
            biggest25725=ends[41];
          }
          if(ends[42]>=biggest25725){
            biggest25725=ends[42];
          }
          if(ends[43]>=biggest25725){
            biggest25725=ends[43];
          }
          if(biggest25725 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
          //FINXME code
          if(biggest25725 == 0){
            S25586=0;
            active[22]=0;
            ends[22]=0;
            S25586=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[22] != 0){
      int index = 22;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[22]!=0 || suspended[22]!=0 || active[22]!=1);
      else{
        if(!df){
          zoneOneLightingI.gethook();
          zoneTwoLightingI.gethook();
          zoneThreeLightingI.gethook();
          zoneFourLightingI.gethook();
          zoneFiveLightingI.gethook();
          zoneSixLightingI.gethook();
          zoneSevenLightingI.gethook();
          zoneOneLightONOFF.gethook();
          zoneTwoLightONOFF.gethook();
          zoneThreeLightONOFF.gethook();
          zoneFourLightONOFF.gethook();
          zoneFiveLightONOFF.gethook();
          zoneSixLightONOFF.gethook();
          zoneSevenLightONOFF.gethook();
          zoneOneWindowONOFF.gethook();
          zoneTwoWindowONOFF.gethook();
          zoneThreeWindowONOFF.gethook();
          zoneFourWindowONOFF.gethook();
          zoneFiveWindowONOFF.gethook();
          zoneSixWindowONOFF.gethook();
          zoneSevenWindowONOFF.gethook();
          df = true;
        }
        runClockDomain();
      }
      zoneOneLightingI.setpreclear();
      zoneTwoLightingI.setpreclear();
      zoneThreeLightingI.setpreclear();
      zoneFourLightingI.setpreclear();
      zoneFiveLightingI.setpreclear();
      zoneSixLightingI.setpreclear();
      zoneSevenLightingI.setpreclear();
      zoneOneLightONOFF.setpreclear();
      zoneTwoLightONOFF.setpreclear();
      zoneThreeLightONOFF.setpreclear();
      zoneFourLightONOFF.setpreclear();
      zoneFiveLightONOFF.setpreclear();
      zoneSixLightONOFF.setpreclear();
      zoneSevenLightONOFF.setpreclear();
      zoneOneWindowONOFF.setpreclear();
      zoneTwoWindowONOFF.setpreclear();
      zoneThreeWindowONOFF.setpreclear();
      zoneFourWindowONOFF.setpreclear();
      zoneFiveWindowONOFF.setpreclear();
      zoneSixWindowONOFF.setpreclear();
      zoneSevenWindowONOFF.setpreclear();
      zoneOneFinished.setpreclear();
      zoneTwoFinished.setpreclear();
      zoneThreeFinished.setpreclear();
      zoneFourFinished.setpreclear();
      zoneFiveFinished.setpreclear();
      zoneSixFinished.setpreclear();
      zoneSevenFinished.setpreclear();
      zoneOneLightONOFF_E.setpreclear();
      zoneTwoLightONOFF_E.setpreclear();
      zoneThreeLightONOFF_E.setpreclear();
      zoneFourLightONOFF_E.setpreclear();
      zoneFiveLightONOFF_E.setpreclear();
      zoneSixLightONOFF_E.setpreclear();
      zoneSevenLightONOFF_E.setpreclear();
      zoneOneWindowONOFF_E.setpreclear();
      zoneTwoWindowONOFF_E.setpreclear();
      zoneThreeWindowONOFF_E.setpreclear();
      zoneFourWindowONOFF_E.setpreclear();
      zoneFiveWindowONOFF_E.setpreclear();
      zoneSixWindowONOFF_E.setpreclear();
      zoneSevenWindowONOFF_E.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = zoneOneLightingI.getStatus() ? zoneOneLightingI.setprepresent() : zoneOneLightingI.setpreclear();
      zoneOneLightingI.setpreval(zoneOneLightingI.getValue());
      zoneOneLightingI.setClear();
      dummyint = zoneTwoLightingI.getStatus() ? zoneTwoLightingI.setprepresent() : zoneTwoLightingI.setpreclear();
      zoneTwoLightingI.setpreval(zoneTwoLightingI.getValue());
      zoneTwoLightingI.setClear();
      dummyint = zoneThreeLightingI.getStatus() ? zoneThreeLightingI.setprepresent() : zoneThreeLightingI.setpreclear();
      zoneThreeLightingI.setpreval(zoneThreeLightingI.getValue());
      zoneThreeLightingI.setClear();
      dummyint = zoneFourLightingI.getStatus() ? zoneFourLightingI.setprepresent() : zoneFourLightingI.setpreclear();
      zoneFourLightingI.setpreval(zoneFourLightingI.getValue());
      zoneFourLightingI.setClear();
      dummyint = zoneFiveLightingI.getStatus() ? zoneFiveLightingI.setprepresent() : zoneFiveLightingI.setpreclear();
      zoneFiveLightingI.setpreval(zoneFiveLightingI.getValue());
      zoneFiveLightingI.setClear();
      dummyint = zoneSixLightingI.getStatus() ? zoneSixLightingI.setprepresent() : zoneSixLightingI.setpreclear();
      zoneSixLightingI.setpreval(zoneSixLightingI.getValue());
      zoneSixLightingI.setClear();
      dummyint = zoneSevenLightingI.getStatus() ? zoneSevenLightingI.setprepresent() : zoneSevenLightingI.setpreclear();
      zoneSevenLightingI.setpreval(zoneSevenLightingI.getValue());
      zoneSevenLightingI.setClear();
      dummyint = zoneOneLightONOFF.getStatus() ? zoneOneLightONOFF.setprepresent() : zoneOneLightONOFF.setpreclear();
      zoneOneLightONOFF.setpreval(zoneOneLightONOFF.getValue());
      zoneOneLightONOFF.setClear();
      dummyint = zoneTwoLightONOFF.getStatus() ? zoneTwoLightONOFF.setprepresent() : zoneTwoLightONOFF.setpreclear();
      zoneTwoLightONOFF.setpreval(zoneTwoLightONOFF.getValue());
      zoneTwoLightONOFF.setClear();
      dummyint = zoneThreeLightONOFF.getStatus() ? zoneThreeLightONOFF.setprepresent() : zoneThreeLightONOFF.setpreclear();
      zoneThreeLightONOFF.setpreval(zoneThreeLightONOFF.getValue());
      zoneThreeLightONOFF.setClear();
      dummyint = zoneFourLightONOFF.getStatus() ? zoneFourLightONOFF.setprepresent() : zoneFourLightONOFF.setpreclear();
      zoneFourLightONOFF.setpreval(zoneFourLightONOFF.getValue());
      zoneFourLightONOFF.setClear();
      dummyint = zoneFiveLightONOFF.getStatus() ? zoneFiveLightONOFF.setprepresent() : zoneFiveLightONOFF.setpreclear();
      zoneFiveLightONOFF.setpreval(zoneFiveLightONOFF.getValue());
      zoneFiveLightONOFF.setClear();
      dummyint = zoneSixLightONOFF.getStatus() ? zoneSixLightONOFF.setprepresent() : zoneSixLightONOFF.setpreclear();
      zoneSixLightONOFF.setpreval(zoneSixLightONOFF.getValue());
      zoneSixLightONOFF.setClear();
      dummyint = zoneSevenLightONOFF.getStatus() ? zoneSevenLightONOFF.setprepresent() : zoneSevenLightONOFF.setpreclear();
      zoneSevenLightONOFF.setpreval(zoneSevenLightONOFF.getValue());
      zoneSevenLightONOFF.setClear();
      dummyint = zoneOneWindowONOFF.getStatus() ? zoneOneWindowONOFF.setprepresent() : zoneOneWindowONOFF.setpreclear();
      zoneOneWindowONOFF.setpreval(zoneOneWindowONOFF.getValue());
      zoneOneWindowONOFF.setClear();
      dummyint = zoneTwoWindowONOFF.getStatus() ? zoneTwoWindowONOFF.setprepresent() : zoneTwoWindowONOFF.setpreclear();
      zoneTwoWindowONOFF.setpreval(zoneTwoWindowONOFF.getValue());
      zoneTwoWindowONOFF.setClear();
      dummyint = zoneThreeWindowONOFF.getStatus() ? zoneThreeWindowONOFF.setprepresent() : zoneThreeWindowONOFF.setpreclear();
      zoneThreeWindowONOFF.setpreval(zoneThreeWindowONOFF.getValue());
      zoneThreeWindowONOFF.setClear();
      dummyint = zoneFourWindowONOFF.getStatus() ? zoneFourWindowONOFF.setprepresent() : zoneFourWindowONOFF.setpreclear();
      zoneFourWindowONOFF.setpreval(zoneFourWindowONOFF.getValue());
      zoneFourWindowONOFF.setClear();
      dummyint = zoneFiveWindowONOFF.getStatus() ? zoneFiveWindowONOFF.setprepresent() : zoneFiveWindowONOFF.setpreclear();
      zoneFiveWindowONOFF.setpreval(zoneFiveWindowONOFF.getValue());
      zoneFiveWindowONOFF.setClear();
      dummyint = zoneSixWindowONOFF.getStatus() ? zoneSixWindowONOFF.setprepresent() : zoneSixWindowONOFF.setpreclear();
      zoneSixWindowONOFF.setpreval(zoneSixWindowONOFF.getValue());
      zoneSixWindowONOFF.setClear();
      dummyint = zoneSevenWindowONOFF.getStatus() ? zoneSevenWindowONOFF.setprepresent() : zoneSevenWindowONOFF.setpreclear();
      zoneSevenWindowONOFF.setpreval(zoneSevenWindowONOFF.getValue());
      zoneSevenWindowONOFF.setClear();
      zoneOneFinished.sethook();
      zoneOneFinished.setClear();
      zoneTwoFinished.sethook();
      zoneTwoFinished.setClear();
      zoneThreeFinished.sethook();
      zoneThreeFinished.setClear();
      zoneFourFinished.sethook();
      zoneFourFinished.setClear();
      zoneFiveFinished.sethook();
      zoneFiveFinished.setClear();
      zoneSixFinished.sethook();
      zoneSixFinished.setClear();
      zoneSevenFinished.sethook();
      zoneSevenFinished.setClear();
      zoneOneLightONOFF_E.sethook();
      zoneOneLightONOFF_E.setClear();
      zoneTwoLightONOFF_E.sethook();
      zoneTwoLightONOFF_E.setClear();
      zoneThreeLightONOFF_E.sethook();
      zoneThreeLightONOFF_E.setClear();
      zoneFourLightONOFF_E.sethook();
      zoneFourLightONOFF_E.setClear();
      zoneFiveLightONOFF_E.sethook();
      zoneFiveLightONOFF_E.setClear();
      zoneSixLightONOFF_E.sethook();
      zoneSixLightONOFF_E.setClear();
      zoneSevenLightONOFF_E.sethook();
      zoneSevenLightONOFF_E.setClear();
      zoneOneWindowONOFF_E.sethook();
      zoneOneWindowONOFF_E.setClear();
      zoneTwoWindowONOFF_E.sethook();
      zoneTwoWindowONOFF_E.setClear();
      zoneThreeWindowONOFF_E.sethook();
      zoneThreeWindowONOFF_E.setClear();
      zoneFourWindowONOFF_E.sethook();
      zoneFourWindowONOFF_E.setClear();
      zoneFiveWindowONOFF_E.sethook();
      zoneFiveWindowONOFF_E.setClear();
      zoneSixWindowONOFF_E.sethook();
      zoneSixWindowONOFF_E.setClear();
      zoneSevenWindowONOFF_E.sethook();
      zoneSevenWindowONOFF_E.setClear();
      if(paused[22]!=0 || suspended[22]!=0 || active[22]!=1);
      else{
        zoneOneLightingI.gethook();
        zoneTwoLightingI.gethook();
        zoneThreeLightingI.gethook();
        zoneFourLightingI.gethook();
        zoneFiveLightingI.gethook();
        zoneSixLightingI.gethook();
        zoneSevenLightingI.gethook();
        zoneOneLightONOFF.gethook();
        zoneTwoLightONOFF.gethook();
        zoneThreeLightONOFF.gethook();
        zoneFourLightONOFF.gethook();
        zoneFiveLightONOFF.gethook();
        zoneSixLightONOFF.gethook();
        zoneSevenLightONOFF.gethook();
        zoneOneWindowONOFF.gethook();
        zoneTwoWindowONOFF.gethook();
        zoneThreeWindowONOFF.gethook();
        zoneFourWindowONOFF.gethook();
        zoneFiveWindowONOFF.gethook();
        zoneSixWindowONOFF.gethook();
        zoneSevenWindowONOFF.gethook();
      }
      runFinisher();
      if(active[22] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

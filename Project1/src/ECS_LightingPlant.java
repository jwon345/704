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
  public Signal zoneOneLightingI_E = new Signal("zoneOneLightingI_E", Signal.OUTPUT);
  public Signal zoneTwoLightingI_E = new Signal("zoneTwoLightingI_E", Signal.OUTPUT);
  public Signal zoneThreeLightingI_E = new Signal("zoneThreeLightingI_E", Signal.OUTPUT);
  public Signal zoneFourLightingI_E = new Signal("zoneFourLightingI_E", Signal.OUTPUT);
  public Signal zoneFiveLightingI_E = new Signal("zoneFiveLightingI_E", Signal.OUTPUT);
  public Signal zoneSixLightingI_E = new Signal("zoneSixLightingI_E", Signal.OUTPUT);
  public Signal zoneSevenLightingI_E = new Signal("zoneSevenLightingI_E", Signal.OUTPUT);
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
  private int previousIntensity_thread_23;//sysj\ECS_plant.sysj line: 140, column: 8
  private int previousIntensity_thread_24;//sysj\ECS_plant.sysj line: 156, column: 8
  private int previousIntensity_thread_25;//sysj\ECS_plant.sysj line: 171, column: 8
  private int previousIntensity_thread_26;//sysj\ECS_plant.sysj line: 186, column: 8
  private int previousIntensity_thread_27;//sysj\ECS_plant.sysj line: 201, column: 8
  private int previousIntensity_thread_28;//sysj\ECS_plant.sysj line: 216, column: 8
  private int previousIntensity_thread_29;//sysj\ECS_plant.sysj line: 231, column: 8
  private int currentIntensity_thread_23;//sysj\ECS_plant.sysj line: 143, column: 12
  private int currentIntensity_thread_24;//sysj\ECS_plant.sysj line: 159, column: 12
  private int currentIntensity_thread_25;//sysj\ECS_plant.sysj line: 174, column: 12
  private int currentIntensity_thread_26;//sysj\ECS_plant.sysj line: 189, column: 12
  private int currentIntensity_thread_27;//sysj\ECS_plant.sysj line: 204, column: 12
  private int currentIntensity_thread_28;//sysj\ECS_plant.sysj line: 219, column: 12
  private int currentIntensity_thread_29;//sysj\ECS_plant.sysj line: 234, column: 12
  private int S209754 = 1;
  private int S209500 = 1;
  private int S209514 = 1;
  private int S209528 = 1;
  private int S209542 = 1;
  private int S209556 = 1;
  private int S209570 = 1;
  private int S209584 = 1;
  private int S209592 = 1;
  private int S209600 = 1;
  private int S209608 = 1;
  private int S209616 = 1;
  private int S209624 = 1;
  private int S209632 = 1;
  private int S209640 = 1;
  private int S209648 = 1;
  private int S209656 = 1;
  private int S209664 = 1;
  private int S209672 = 1;
  private int S209680 = 1;
  private int S209688 = 1;
  private int S209696 = 1;
  private int S209704 = 1;
  private int S209712 = 1;
  private int S209720 = 1;
  private int S209728 = 1;
  private int S209736 = 1;
  private int S209744 = 1;
  private int S209752 = 1;
  
  private int[] ends = new int[54];
  private int[] tdone = new int[54];
  
  public void thread209906(int [] tdone, int [] ends){
        switch(S209752){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 290, column: 31
          zoneSevenWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 290, column: 53
          currsigs.addElement(zoneSevenWindowONOFF_E);
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        else {
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        break;
      
    }
  }

  public void thread209905(int [] tdone, int [] ends){
        switch(S209744){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        if(zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 288, column: 31
          zoneSixWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 288, column: 51
          currsigs.addElement(zoneSixWindowONOFF_E);
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        break;
      
    }
  }

  public void thread209904(int [] tdone, int [] ends){
        switch(S209736){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if(zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 286, column: 31
          zoneFiveWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 286, column: 52
          currsigs.addElement(zoneFiveWindowONOFF_E);
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        else {
          active[48]=1;
          ends[48]=1;
          tdone[48]=1;
        }
        break;
      
    }
  }

  public void thread209903(int [] tdone, int [] ends){
        switch(S209728){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 284, column: 31
          zoneFourWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 284, column: 52
          currsigs.addElement(zoneFourWindowONOFF_E);
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        break;
      
    }
  }

  public void thread209902(int [] tdone, int [] ends){
        switch(S209720){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 282, column: 31
          zoneThreeWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 282, column: 53
          currsigs.addElement(zoneThreeWindowONOFF_E);
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        break;
      
    }
  }

  public void thread209901(int [] tdone, int [] ends){
        switch(S209712){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        if(zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 280, column: 31
          zoneTwoWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 280, column: 51
          currsigs.addElement(zoneTwoWindowONOFF_E);
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        break;
      
    }
  }

  public void thread209900(int [] tdone, int [] ends){
        switch(S209704){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        if(zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 278, column: 31
          zoneOneWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 278, column: 51
          currsigs.addElement(zoneOneWindowONOFF_E);
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        break;
      
    }
  }

  public void thread209899(int [] tdone, int [] ends){
        switch(S209696){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        if(zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 272, column: 31
          zoneSevenLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 272, column: 52
          currsigs.addElement(zoneSevenLightONOFF_E);
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

  public void thread209898(int [] tdone, int [] ends){
        switch(S209688){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        if(zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 270, column: 31
          zoneSixLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 270, column: 50
          currsigs.addElement(zoneSixLightONOFF_E);
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

  public void thread209897(int [] tdone, int [] ends){
        switch(S209680){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 268, column: 31
          zoneFiveLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 268, column: 51
          currsigs.addElement(zoneFiveLightONOFF_E);
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

  public void thread209896(int [] tdone, int [] ends){
        switch(S209672){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        if(zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 266, column: 31
          zoneFourLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 266, column: 51
          currsigs.addElement(zoneFourLightONOFF_E);
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

  public void thread209895(int [] tdone, int [] ends){
        switch(S209664){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        if(zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 264, column: 31
          zoneThreeLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 264, column: 52
          currsigs.addElement(zoneThreeLightONOFF_E);
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

  public void thread209894(int [] tdone, int [] ends){
        switch(S209656){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 262, column: 31
          zoneTwoLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 262, column: 50
          currsigs.addElement(zoneTwoLightONOFF_E);
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

  public void thread209893(int [] tdone, int [] ends){
        switch(S209648){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 260, column: 31
          zoneOneLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 260, column: 50
          currsigs.addElement(zoneOneLightONOFF_E);
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

  public void thread209892(int [] tdone, int [] ends){
        switch(S209640){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(zoneSevenLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 256, column: 28
          zoneSevenLightingI_E.setPresent();//sysj\ECS_plant.sysj line: 256, column: 48
          currsigs.addElement(zoneSevenLightingI_E);
          zoneSevenLightingI_E.setValue(zoneSevenLightingI);//sysj\ECS_plant.sysj line: 256, column: 48
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

  public void thread209891(int [] tdone, int [] ends){
        switch(S209632){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        if(zoneSixLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 254, column: 28
          zoneSixLightingI_E.setPresent();//sysj\ECS_plant.sysj line: 254, column: 46
          currsigs.addElement(zoneSixLightingI_E);
          zoneSixLightingI_E.setValue(zoneSixLightingI);//sysj\ECS_plant.sysj line: 254, column: 46
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

  public void thread209890(int [] tdone, int [] ends){
        switch(S209624){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(zoneFiveLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 252, column: 28
          zoneFiveLightingI_E.setPresent();//sysj\ECS_plant.sysj line: 252, column: 47
          currsigs.addElement(zoneFiveLightingI_E);
          zoneFiveLightingI_E.setValue(zoneFiveLightingI);//sysj\ECS_plant.sysj line: 252, column: 47
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

  public void thread209889(int [] tdone, int [] ends){
        switch(S209616){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(zoneFourLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 250, column: 28
          zoneFourLightingI_E.setPresent();//sysj\ECS_plant.sysj line: 250, column: 47
          currsigs.addElement(zoneFourLightingI_E);
          zoneFourLightingI_E.setValue(zoneFourLightingI);//sysj\ECS_plant.sysj line: 250, column: 47
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

  public void thread209888(int [] tdone, int [] ends){
        switch(S209608){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(zoneThreeLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 248, column: 28
          zoneThreeLightingI_E.setPresent();//sysj\ECS_plant.sysj line: 248, column: 48
          currsigs.addElement(zoneThreeLightingI_E);
          zoneThreeLightingI_E.setValue(zoneThreeLightingI);//sysj\ECS_plant.sysj line: 248, column: 48
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

  public void thread209887(int [] tdone, int [] ends){
        switch(S209600){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(zoneTwoLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 246, column: 28
          zoneTwoLightingI_E.setPresent();//sysj\ECS_plant.sysj line: 246, column: 46
          currsigs.addElement(zoneTwoLightingI_E);
          zoneTwoLightingI_E.setValue(zoneTwoLightingI);//sysj\ECS_plant.sysj line: 246, column: 46
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

  public void thread209886(int [] tdone, int [] ends){
        switch(S209592){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(zoneOneLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 244, column: 28
          zoneOneLightingI_E.setPresent();//sysj\ECS_plant.sysj line: 244, column: 46
          currsigs.addElement(zoneOneLightingI_E);
          zoneOneLightingI_E.setValue(zoneOneLightingI);//sysj\ECS_plant.sysj line: 244, column: 46
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

  public void thread209885(int [] tdone, int [] ends){
        switch(S209584){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(zoneSevenLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 233, column: 18
          currentIntensity_thread_29 = (Integer)(zoneSevenLightingI.getpreval() == null ? 0 : ((Integer)zoneSevenLightingI.getpreval()).intValue());//sysj\ECS_plant.sysj line: 234, column: 12
          if(currentIntensity_thread_29 != previousIntensity_thread_29) {//sysj\ECS_plant.sysj line: 236, column: 54
            System.out.println("Zone 7 Detected Change in Occupancy and Intensity is set to: " + currentIntensity_thread_29);//sysj\ECS_plant.sysj line: 237, column: 16
            previousIntensity_thread_29 = currentIntensity_thread_29;//sysj\ECS_plant.sysj line: 238, column: 16
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

  public void thread209884(int [] tdone, int [] ends){
        switch(S209570){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(zoneSixLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 218, column: 18
          currentIntensity_thread_28 = (Integer)(zoneSixLightingI.getpreval() == null ? 0 : ((Integer)zoneSixLightingI.getpreval()).intValue());//sysj\ECS_plant.sysj line: 219, column: 12
          if(currentIntensity_thread_28 != previousIntensity_thread_28) {//sysj\ECS_plant.sysj line: 221, column: 54
            System.out.println("Zone 6 Detected Change in Occupancy and Intensity is set to: " + currentIntensity_thread_28);//sysj\ECS_plant.sysj line: 222, column: 16
            previousIntensity_thread_28 = currentIntensity_thread_28;//sysj\ECS_plant.sysj line: 223, column: 16
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

  public void thread209883(int [] tdone, int [] ends){
        switch(S209556){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(zoneFiveLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 203, column: 18
          currentIntensity_thread_27 = (Integer)(zoneFiveLightingI.getpreval() == null ? 0 : ((Integer)zoneFiveLightingI.getpreval()).intValue());//sysj\ECS_plant.sysj line: 204, column: 12
          if(currentIntensity_thread_27 != previousIntensity_thread_27) {//sysj\ECS_plant.sysj line: 206, column: 54
            System.out.println("Zone 5 Detected Change in Occupancy and Intensity is set to: " + currentIntensity_thread_27);//sysj\ECS_plant.sysj line: 207, column: 16
            previousIntensity_thread_27 = currentIntensity_thread_27;//sysj\ECS_plant.sysj line: 208, column: 16
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

  public void thread209882(int [] tdone, int [] ends){
        switch(S209542){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(zoneFourLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 188, column: 18
          currentIntensity_thread_26 = (Integer)(zoneFourLightingI.getpreval() == null ? 0 : ((Integer)zoneFourLightingI.getpreval()).intValue());//sysj\ECS_plant.sysj line: 189, column: 12
          if(currentIntensity_thread_26 != previousIntensity_thread_26) {//sysj\ECS_plant.sysj line: 191, column: 54
            System.out.println("Zone 4 Detected Change in Occupancy and Intensity is set to: " + currentIntensity_thread_26);//sysj\ECS_plant.sysj line: 192, column: 16
            previousIntensity_thread_26 = currentIntensity_thread_26;//sysj\ECS_plant.sysj line: 193, column: 16
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

  public void thread209881(int [] tdone, int [] ends){
        switch(S209528){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(zoneThreeLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 173, column: 18
          currentIntensity_thread_25 = (Integer)(zoneThreeLightingI.getpreval() == null ? 0 : ((Integer)zoneThreeLightingI.getpreval()).intValue());//sysj\ECS_plant.sysj line: 174, column: 12
          if(currentIntensity_thread_25 != previousIntensity_thread_25) {//sysj\ECS_plant.sysj line: 176, column: 54
            System.out.println("Zone 3 Detected Change in Occupancy and Intensity is set to: " + currentIntensity_thread_25);//sysj\ECS_plant.sysj line: 177, column: 16
            previousIntensity_thread_25 = currentIntensity_thread_25;//sysj\ECS_plant.sysj line: 178, column: 16
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

  public void thread209880(int [] tdone, int [] ends){
        switch(S209514){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(zoneTwoLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 158, column: 18
          currentIntensity_thread_24 = (Integer)(zoneTwoLightingI.getpreval() == null ? 0 : ((Integer)zoneTwoLightingI.getpreval()).intValue());//sysj\ECS_plant.sysj line: 159, column: 12
          if(currentIntensity_thread_24 != previousIntensity_thread_24) {//sysj\ECS_plant.sysj line: 161, column: 54
            System.out.println("Zone 2 Detected Change in Occupancy and Intensity is set to: " + currentIntensity_thread_24);//sysj\ECS_plant.sysj line: 162, column: 16
            previousIntensity_thread_24 = currentIntensity_thread_24;//sysj\ECS_plant.sysj line: 163, column: 16
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

  public void thread209879(int [] tdone, int [] ends){
        switch(S209500){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(zoneOneLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 142, column: 18
          currentIntensity_thread_23 = (Integer)(zoneOneLightingI.getpreval() == null ? 0 : ((Integer)zoneOneLightingI.getpreval()).intValue());//sysj\ECS_plant.sysj line: 143, column: 12
          if(currentIntensity_thread_23 != previousIntensity_thread_23) {//sysj\ECS_plant.sysj line: 145, column: 54
            System.out.println("Zone 1 Detected Change in Occupancy and Intensity is set to: " + currentIntensity_thread_23);//sysj\ECS_plant.sysj line: 146, column: 16
            previousIntensity_thread_23 = currentIntensity_thread_23;//sysj\ECS_plant.sysj line: 147, column: 16
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

  public void thread209877(int [] tdone, int [] ends){
        S209752=1;
    if(zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 290, column: 31
      zoneSevenWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 290, column: 53
      currsigs.addElement(zoneSevenWindowONOFF_E);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread209876(int [] tdone, int [] ends){
        S209744=1;
    if(zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 288, column: 31
      zoneSixWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 288, column: 51
      currsigs.addElement(zoneSixWindowONOFF_E);
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
  }

  public void thread209875(int [] tdone, int [] ends){
        S209736=1;
    if(zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 286, column: 31
      zoneFiveWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 286, column: 52
      currsigs.addElement(zoneFiveWindowONOFF_E);
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
    else {
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread209874(int [] tdone, int [] ends){
        S209728=1;
    if(zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 284, column: 31
      zoneFourWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 284, column: 52
      currsigs.addElement(zoneFourWindowONOFF_E);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread209873(int [] tdone, int [] ends){
        S209720=1;
    if(zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 282, column: 31
      zoneThreeWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 282, column: 53
      currsigs.addElement(zoneThreeWindowONOFF_E);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread209872(int [] tdone, int [] ends){
        S209712=1;
    if(zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 280, column: 31
      zoneTwoWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 280, column: 51
      currsigs.addElement(zoneTwoWindowONOFF_E);
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread209871(int [] tdone, int [] ends){
        S209704=1;
    if(zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 278, column: 31
      zoneOneWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 278, column: 51
      currsigs.addElement(zoneOneWindowONOFF_E);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread209870(int [] tdone, int [] ends){
        S209696=1;
    if(zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 272, column: 31
      zoneSevenLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 272, column: 52
      currsigs.addElement(zoneSevenLightONOFF_E);
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

  public void thread209869(int [] tdone, int [] ends){
        S209688=1;
    if(zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 270, column: 31
      zoneSixLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 270, column: 50
      currsigs.addElement(zoneSixLightONOFF_E);
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

  public void thread209868(int [] tdone, int [] ends){
        S209680=1;
    if(zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 268, column: 31
      zoneFiveLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 268, column: 51
      currsigs.addElement(zoneFiveLightONOFF_E);
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

  public void thread209867(int [] tdone, int [] ends){
        S209672=1;
    if(zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 266, column: 31
      zoneFourLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 266, column: 51
      currsigs.addElement(zoneFourLightONOFF_E);
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

  public void thread209866(int [] tdone, int [] ends){
        S209664=1;
    if(zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 264, column: 31
      zoneThreeLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 264, column: 52
      currsigs.addElement(zoneThreeLightONOFF_E);
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

  public void thread209865(int [] tdone, int [] ends){
        S209656=1;
    if(zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 262, column: 31
      zoneTwoLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 262, column: 50
      currsigs.addElement(zoneTwoLightONOFF_E);
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

  public void thread209864(int [] tdone, int [] ends){
        S209648=1;
    if(zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 260, column: 31
      zoneOneLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 260, column: 50
      currsigs.addElement(zoneOneLightONOFF_E);
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

  public void thread209863(int [] tdone, int [] ends){
        S209640=1;
    if(zoneSevenLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 256, column: 28
      zoneSevenLightingI_E.setPresent();//sysj\ECS_plant.sysj line: 256, column: 48
      currsigs.addElement(zoneSevenLightingI_E);
      zoneSevenLightingI_E.setValue(zoneSevenLightingI);//sysj\ECS_plant.sysj line: 256, column: 48
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

  public void thread209862(int [] tdone, int [] ends){
        S209632=1;
    if(zoneSixLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 254, column: 28
      zoneSixLightingI_E.setPresent();//sysj\ECS_plant.sysj line: 254, column: 46
      currsigs.addElement(zoneSixLightingI_E);
      zoneSixLightingI_E.setValue(zoneSixLightingI);//sysj\ECS_plant.sysj line: 254, column: 46
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

  public void thread209861(int [] tdone, int [] ends){
        S209624=1;
    if(zoneFiveLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 252, column: 28
      zoneFiveLightingI_E.setPresent();//sysj\ECS_plant.sysj line: 252, column: 47
      currsigs.addElement(zoneFiveLightingI_E);
      zoneFiveLightingI_E.setValue(zoneFiveLightingI);//sysj\ECS_plant.sysj line: 252, column: 47
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

  public void thread209860(int [] tdone, int [] ends){
        S209616=1;
    if(zoneFourLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 250, column: 28
      zoneFourLightingI_E.setPresent();//sysj\ECS_plant.sysj line: 250, column: 47
      currsigs.addElement(zoneFourLightingI_E);
      zoneFourLightingI_E.setValue(zoneFourLightingI);//sysj\ECS_plant.sysj line: 250, column: 47
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

  public void thread209859(int [] tdone, int [] ends){
        S209608=1;
    if(zoneThreeLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 248, column: 28
      zoneThreeLightingI_E.setPresent();//sysj\ECS_plant.sysj line: 248, column: 48
      currsigs.addElement(zoneThreeLightingI_E);
      zoneThreeLightingI_E.setValue(zoneThreeLightingI);//sysj\ECS_plant.sysj line: 248, column: 48
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

  public void thread209858(int [] tdone, int [] ends){
        S209600=1;
    if(zoneTwoLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 246, column: 28
      zoneTwoLightingI_E.setPresent();//sysj\ECS_plant.sysj line: 246, column: 46
      currsigs.addElement(zoneTwoLightingI_E);
      zoneTwoLightingI_E.setValue(zoneTwoLightingI);//sysj\ECS_plant.sysj line: 246, column: 46
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

  public void thread209857(int [] tdone, int [] ends){
        S209592=1;
    if(zoneOneLightingI.getprestatus()){//sysj\ECS_plant.sysj line: 244, column: 28
      zoneOneLightingI_E.setPresent();//sysj\ECS_plant.sysj line: 244, column: 46
      currsigs.addElement(zoneOneLightingI_E);
      zoneOneLightingI_E.setValue(zoneOneLightingI);//sysj\ECS_plant.sysj line: 244, column: 46
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

  public void thread209856(int [] tdone, int [] ends){
        S209584=1;
    previousIntensity_thread_29 = -1;//sysj\ECS_plant.sysj line: 231, column: 8
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209855(int [] tdone, int [] ends){
        S209570=1;
    previousIntensity_thread_28 = -1;//sysj\ECS_plant.sysj line: 216, column: 8
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread209854(int [] tdone, int [] ends){
        S209556=1;
    previousIntensity_thread_27 = -1;//sysj\ECS_plant.sysj line: 201, column: 8
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread209853(int [] tdone, int [] ends){
        S209542=1;
    previousIntensity_thread_26 = -1;//sysj\ECS_plant.sysj line: 186, column: 8
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209852(int [] tdone, int [] ends){
        S209528=1;
    previousIntensity_thread_25 = -1;//sysj\ECS_plant.sysj line: 171, column: 8
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209851(int [] tdone, int [] ends){
        S209514=1;
    previousIntensity_thread_24 = -1;//sysj\ECS_plant.sysj line: 156, column: 8
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread209850(int [] tdone, int [] ends){
        S209500=1;
    previousIntensity_thread_23 = -1;//sysj\ECS_plant.sysj line: 140, column: 8
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
      switch(S209754){
        case 0 : 
          S209754=0;
          break RUN;
        
        case 1 : 
          S209754=2;
          S209754=2;
          thread209850(tdone,ends);
          thread209851(tdone,ends);
          thread209852(tdone,ends);
          thread209853(tdone,ends);
          thread209854(tdone,ends);
          thread209855(tdone,ends);
          thread209856(tdone,ends);
          thread209857(tdone,ends);
          thread209858(tdone,ends);
          thread209859(tdone,ends);
          thread209860(tdone,ends);
          thread209861(tdone,ends);
          thread209862(tdone,ends);
          thread209863(tdone,ends);
          thread209864(tdone,ends);
          thread209865(tdone,ends);
          thread209866(tdone,ends);
          thread209867(tdone,ends);
          thread209868(tdone,ends);
          thread209869(tdone,ends);
          thread209870(tdone,ends);
          thread209871(tdone,ends);
          thread209872(tdone,ends);
          thread209873(tdone,ends);
          thread209874(tdone,ends);
          thread209875(tdone,ends);
          thread209876(tdone,ends);
          thread209877(tdone,ends);
          int biggest209878 = 0;
          if(ends[23]>=biggest209878){
            biggest209878=ends[23];
          }
          if(ends[24]>=biggest209878){
            biggest209878=ends[24];
          }
          if(ends[25]>=biggest209878){
            biggest209878=ends[25];
          }
          if(ends[26]>=biggest209878){
            biggest209878=ends[26];
          }
          if(ends[27]>=biggest209878){
            biggest209878=ends[27];
          }
          if(ends[28]>=biggest209878){
            biggest209878=ends[28];
          }
          if(ends[29]>=biggest209878){
            biggest209878=ends[29];
          }
          if(ends[30]>=biggest209878){
            biggest209878=ends[30];
          }
          if(ends[31]>=biggest209878){
            biggest209878=ends[31];
          }
          if(ends[32]>=biggest209878){
            biggest209878=ends[32];
          }
          if(ends[33]>=biggest209878){
            biggest209878=ends[33];
          }
          if(ends[34]>=biggest209878){
            biggest209878=ends[34];
          }
          if(ends[35]>=biggest209878){
            biggest209878=ends[35];
          }
          if(ends[36]>=biggest209878){
            biggest209878=ends[36];
          }
          if(ends[37]>=biggest209878){
            biggest209878=ends[37];
          }
          if(ends[38]>=biggest209878){
            biggest209878=ends[38];
          }
          if(ends[39]>=biggest209878){
            biggest209878=ends[39];
          }
          if(ends[40]>=biggest209878){
            biggest209878=ends[40];
          }
          if(ends[41]>=biggest209878){
            biggest209878=ends[41];
          }
          if(ends[42]>=biggest209878){
            biggest209878=ends[42];
          }
          if(ends[43]>=biggest209878){
            biggest209878=ends[43];
          }
          if(ends[44]>=biggest209878){
            biggest209878=ends[44];
          }
          if(ends[45]>=biggest209878){
            biggest209878=ends[45];
          }
          if(ends[46]>=biggest209878){
            biggest209878=ends[46];
          }
          if(ends[47]>=biggest209878){
            biggest209878=ends[47];
          }
          if(ends[48]>=biggest209878){
            biggest209878=ends[48];
          }
          if(ends[49]>=biggest209878){
            biggest209878=ends[49];
          }
          if(ends[50]>=biggest209878){
            biggest209878=ends[50];
          }
          if(biggest209878 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
        
        case 2 : 
          thread209879(tdone,ends);
          thread209880(tdone,ends);
          thread209881(tdone,ends);
          thread209882(tdone,ends);
          thread209883(tdone,ends);
          thread209884(tdone,ends);
          thread209885(tdone,ends);
          thread209886(tdone,ends);
          thread209887(tdone,ends);
          thread209888(tdone,ends);
          thread209889(tdone,ends);
          thread209890(tdone,ends);
          thread209891(tdone,ends);
          thread209892(tdone,ends);
          thread209893(tdone,ends);
          thread209894(tdone,ends);
          thread209895(tdone,ends);
          thread209896(tdone,ends);
          thread209897(tdone,ends);
          thread209898(tdone,ends);
          thread209899(tdone,ends);
          thread209900(tdone,ends);
          thread209901(tdone,ends);
          thread209902(tdone,ends);
          thread209903(tdone,ends);
          thread209904(tdone,ends);
          thread209905(tdone,ends);
          thread209906(tdone,ends);
          int biggest209907 = 0;
          if(ends[23]>=biggest209907){
            biggest209907=ends[23];
          }
          if(ends[24]>=biggest209907){
            biggest209907=ends[24];
          }
          if(ends[25]>=biggest209907){
            biggest209907=ends[25];
          }
          if(ends[26]>=biggest209907){
            biggest209907=ends[26];
          }
          if(ends[27]>=biggest209907){
            biggest209907=ends[27];
          }
          if(ends[28]>=biggest209907){
            biggest209907=ends[28];
          }
          if(ends[29]>=biggest209907){
            biggest209907=ends[29];
          }
          if(ends[30]>=biggest209907){
            biggest209907=ends[30];
          }
          if(ends[31]>=biggest209907){
            biggest209907=ends[31];
          }
          if(ends[32]>=biggest209907){
            biggest209907=ends[32];
          }
          if(ends[33]>=biggest209907){
            biggest209907=ends[33];
          }
          if(ends[34]>=biggest209907){
            biggest209907=ends[34];
          }
          if(ends[35]>=biggest209907){
            biggest209907=ends[35];
          }
          if(ends[36]>=biggest209907){
            biggest209907=ends[36];
          }
          if(ends[37]>=biggest209907){
            biggest209907=ends[37];
          }
          if(ends[38]>=biggest209907){
            biggest209907=ends[38];
          }
          if(ends[39]>=biggest209907){
            biggest209907=ends[39];
          }
          if(ends[40]>=biggest209907){
            biggest209907=ends[40];
          }
          if(ends[41]>=biggest209907){
            biggest209907=ends[41];
          }
          if(ends[42]>=biggest209907){
            biggest209907=ends[42];
          }
          if(ends[43]>=biggest209907){
            biggest209907=ends[43];
          }
          if(ends[44]>=biggest209907){
            biggest209907=ends[44];
          }
          if(ends[45]>=biggest209907){
            biggest209907=ends[45];
          }
          if(ends[46]>=biggest209907){
            biggest209907=ends[46];
          }
          if(ends[47]>=biggest209907){
            biggest209907=ends[47];
          }
          if(ends[48]>=biggest209907){
            biggest209907=ends[48];
          }
          if(ends[49]>=biggest209907){
            biggest209907=ends[49];
          }
          if(ends[50]>=biggest209907){
            biggest209907=ends[50];
          }
          if(biggest209907 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
          //FINXME code
          if(biggest209907 == 0){
            S209754=0;
            active[22]=0;
            ends[22]=0;
            S209754=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      zoneOneLightingI_E.setpreclear();
      zoneTwoLightingI_E.setpreclear();
      zoneThreeLightingI_E.setpreclear();
      zoneFourLightingI_E.setpreclear();
      zoneFiveLightingI_E.setpreclear();
      zoneSixLightingI_E.setpreclear();
      zoneSevenLightingI_E.setpreclear();
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
      zoneOneLightingI_E.sethook();
      zoneOneLightingI_E.setClear();
      zoneTwoLightingI_E.sethook();
      zoneTwoLightingI_E.setClear();
      zoneThreeLightingI_E.sethook();
      zoneThreeLightingI_E.setClear();
      zoneFourLightingI_E.sethook();
      zoneFourLightingI_E.setClear();
      zoneFiveLightingI_E.sethook();
      zoneFiveLightingI_E.setClear();
      zoneSixLightingI_E.sethook();
      zoneSixLightingI_E.setClear();
      zoneSevenLightingI_E.sethook();
      zoneSevenLightingI_E.setClear();
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

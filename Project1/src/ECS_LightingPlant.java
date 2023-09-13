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
  public Signal Zone1_Finished = new Signal("Zone1_Finished", Signal.OUTPUT);
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
  private int S207301 = 1;
  private int S207005 = 1;
  private int S206993 = 1;
  private int S207019 = 1;
  private int S207007 = 1;
  private int S207033 = 1;
  private int S207021 = 1;
  private int S207047 = 1;
  private int S207035 = 1;
  private int S207061 = 1;
  private int S207049 = 1;
  private int S207075 = 1;
  private int S207063 = 1;
  private int S207089 = 1;
  private int S207077 = 1;
  private int S207103 = 1;
  private int S207091 = 1;
  private int S207117 = 1;
  private int S207105 = 1;
  private int S207131 = 1;
  private int S207119 = 1;
  private int S207145 = 1;
  private int S207133 = 1;
  private int S207159 = 1;
  private int S207147 = 1;
  private int S207173 = 1;
  private int S207161 = 1;
  private int S207187 = 1;
  private int S207175 = 1;
  private int S207195 = 1;
  private int S207203 = 1;
  private int S207211 = 1;
  private int S207219 = 1;
  private int S207227 = 1;
  private int S207235 = 1;
  private int S207243 = 1;
  private int S207251 = 1;
  private int S207259 = 1;
  private int S207267 = 1;
  private int S207275 = 1;
  private int S207283 = 1;
  private int S207291 = 1;
  private int S207299 = 1;
  
  private int[] ends = new int[54];
  private int[] tdone = new int[54];
  
  public void thread207447(int [] tdone, int [] ends){
        switch(S207299){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 302, column: 31
          zoneSevenWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 302, column: 53
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

  public void thread207446(int [] tdone, int [] ends){
        switch(S207291){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        if(zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 300, column: 31
          zoneSixWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 300, column: 51
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

  public void thread207445(int [] tdone, int [] ends){
        switch(S207283){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        if(zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 298, column: 31
          zoneFiveWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 298, column: 52
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

  public void thread207444(int [] tdone, int [] ends){
        switch(S207275){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 296, column: 31
          zoneFourWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 296, column: 52
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

  public void thread207443(int [] tdone, int [] ends){
        switch(S207267){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        if(zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 294, column: 31
          zoneThreeWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 294, column: 53
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

  public void thread207442(int [] tdone, int [] ends){
        switch(S207259){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        if(zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 292, column: 31
          zoneTwoWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 292, column: 51
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

  public void thread207441(int [] tdone, int [] ends){
        switch(S207251){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        if(zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 290, column: 31
          zoneOneWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 290, column: 51
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

  public void thread207440(int [] tdone, int [] ends){
        switch(S207243){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        if(zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 284, column: 31
          zoneSevenLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 284, column: 52
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

  public void thread207439(int [] tdone, int [] ends){
        switch(S207235){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        if(zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 282, column: 31
          zoneSixLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 282, column: 50
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

  public void thread207438(int [] tdone, int [] ends){
        switch(S207227){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        if(zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 280, column: 31
          zoneFiveLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 280, column: 51
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

  public void thread207437(int [] tdone, int [] ends){
        switch(S207219){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        if(zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 278, column: 31
          zoneFourLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 278, column: 51
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

  public void thread207436(int [] tdone, int [] ends){
        switch(S207211){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        if(zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 276, column: 31
          zoneThreeLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 276, column: 52
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

  public void thread207435(int [] tdone, int [] ends){
        switch(S207203){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        if(zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 274, column: 31
          zoneTwoLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 274, column: 50
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

  public void thread207434(int [] tdone, int [] ends){
        switch(S207195){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        if(zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 272, column: 31
          zoneOneLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 272, column: 50
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

  public void thread207433(int [] tdone, int [] ends){
        switch(S207187){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        switch(S207175){
          case 0 : 
            if(zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 265, column: 21
              System.out.println("After Hours - Zone 7 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 266, column: 15
              S207175=1;
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
          
          case 1 : 
            if(!zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 267, column: 21
              S207175=0;
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
        break;
      
    }
  }

  public void thread207432(int [] tdone, int [] ends){
        switch(S207173){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        switch(S207161){
          case 0 : 
            if(zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 255, column: 21
              System.out.println("After Hours - Zone 6 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 256, column: 15
              S207161=1;
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
          
          case 1 : 
            if(!zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 257, column: 21
              S207161=0;
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
        break;
      
    }
  }

  public void thread207431(int [] tdone, int [] ends){
        switch(S207159){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        switch(S207147){
          case 0 : 
            if(zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 245, column: 21
              System.out.println("After Hours - Zone 5 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 246, column: 15
              S207147=1;
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
          
          case 1 : 
            if(!zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 247, column: 21
              S207147=0;
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
        break;
      
    }
  }

  public void thread207430(int [] tdone, int [] ends){
        switch(S207145){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        switch(S207133){
          case 0 : 
            if(zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 235, column: 21
              System.out.println("After Hours - Zone 4 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 236, column: 15
              S207133=1;
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
          
          case 1 : 
            if(!zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 237, column: 21
              S207133=0;
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
        break;
      
    }
  }

  public void thread207429(int [] tdone, int [] ends){
        switch(S207131){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        switch(S207119){
          case 0 : 
            if(zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 225, column: 21
              System.out.println("After Hours - Zone 3 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 226, column: 15
              S207119=1;
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
          
          case 1 : 
            if(!zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 227, column: 21
              S207119=0;
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
        break;
      
    }
  }

  public void thread207428(int [] tdone, int [] ends){
        switch(S207117){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        switch(S207105){
          case 0 : 
            if(zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 215, column: 21
              System.out.println("After Hours - Zone 2 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 216, column: 15
              S207105=1;
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
          
          case 1 : 
            if(!zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 217, column: 21
              S207105=0;
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
        break;
      
    }
  }

  public void thread207427(int [] tdone, int [] ends){
        switch(S207103){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S207091){
          case 0 : 
            if(zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 206, column: 21
              System.out.println("After Hours - Zone 1 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 207, column: 15
              S207091=1;
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
          
          case 1 : 
            if(!zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 208, column: 21
              S207091=0;
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
        break;
      
    }
  }

  public void thread207426(int [] tdone, int [] ends){
        switch(S207089){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S207077){
          case 0 : 
            if(zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 192, column: 21
              System.out.println("Work Hours - Zone 7 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 193, column: 15
              S207077=1;
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
          
          case 1 : 
            if(!zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 194, column: 21
              S207077=0;
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
        break;
      
    }
  }

  public void thread207425(int [] tdone, int [] ends){
        switch(S207075){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        switch(S207063){
          case 0 : 
            if(zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 183, column: 21
              System.out.println("Work Hours - Zone 6 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 184, column: 15
              S207063=1;
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
          
          case 1 : 
            if(!zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 185, column: 21
              S207063=0;
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
        break;
      
    }
  }

  public void thread207424(int [] tdone, int [] ends){
        switch(S207061){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S207049){
          case 0 : 
            if(zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 174, column: 21
              System.out.println("Work Hours - Zone 5 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 175, column: 15
              S207049=1;
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
          
          case 1 : 
            if(!zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 176, column: 21
              S207049=0;
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
        break;
      
    }
  }

  public void thread207423(int [] tdone, int [] ends){
        switch(S207047){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S207035){
          case 0 : 
            if(zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 165, column: 21
              System.out.println("Work Hours - Zone 4 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 166, column: 15
              S207035=1;
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
          
          case 1 : 
            if(!zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 167, column: 21
              S207035=0;
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
        break;
      
    }
  }

  public void thread207422(int [] tdone, int [] ends){
        switch(S207033){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S207021){
          case 0 : 
            if(zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 156, column: 21
              System.out.println("Work Hours - Zone 3 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 157, column: 15
              S207021=1;
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
          
          case 1 : 
            if(!zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 158, column: 21
              S207021=0;
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
        break;
      
    }
  }

  public void thread207421(int [] tdone, int [] ends){
        switch(S207019){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S207007){
          case 0 : 
            if(zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 147, column: 21
              System.out.println("Work Hours - Zone 2 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 148, column: 15
              S207007=1;
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
          
          case 1 : 
            if(!zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 149, column: 21
              S207007=0;
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
        break;
      
    }
  }

  public void thread207420(int [] tdone, int [] ends){
        switch(S207005){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S206993){
          case 0 : 
            if(zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 139, column: 21
              System.out.println("Work Hours - Zone 1 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 140, column: 15
              S206993=1;
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
          
          case 1 : 
            if(!zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 141, column: 21
              S206993=0;
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
        break;
      
    }
  }

  public void thread207418(int [] tdone, int [] ends){
        S207299=1;
    if(zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 302, column: 31
      zoneSevenWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 302, column: 53
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

  public void thread207417(int [] tdone, int [] ends){
        S207291=1;
    if(zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 300, column: 31
      zoneSixWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 300, column: 51
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

  public void thread207416(int [] tdone, int [] ends){
        S207283=1;
    if(zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 298, column: 31
      zoneFiveWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 298, column: 52
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

  public void thread207415(int [] tdone, int [] ends){
        S207275=1;
    if(zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 296, column: 31
      zoneFourWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 296, column: 52
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

  public void thread207414(int [] tdone, int [] ends){
        S207267=1;
    if(zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 294, column: 31
      zoneThreeWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 294, column: 53
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

  public void thread207413(int [] tdone, int [] ends){
        S207259=1;
    if(zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 292, column: 31
      zoneTwoWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 292, column: 51
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

  public void thread207412(int [] tdone, int [] ends){
        S207251=1;
    if(zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 290, column: 31
      zoneOneWindowONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 290, column: 51
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

  public void thread207411(int [] tdone, int [] ends){
        S207243=1;
    if(zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 284, column: 31
      zoneSevenLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 284, column: 52
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

  public void thread207410(int [] tdone, int [] ends){
        S207235=1;
    if(zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 282, column: 31
      zoneSixLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 282, column: 50
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

  public void thread207409(int [] tdone, int [] ends){
        S207227=1;
    if(zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 280, column: 31
      zoneFiveLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 280, column: 51
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

  public void thread207408(int [] tdone, int [] ends){
        S207219=1;
    if(zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 278, column: 31
      zoneFourLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 278, column: 51
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

  public void thread207407(int [] tdone, int [] ends){
        S207211=1;
    if(zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 276, column: 31
      zoneThreeLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 276, column: 52
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

  public void thread207406(int [] tdone, int [] ends){
        S207203=1;
    if(zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 274, column: 31
      zoneTwoLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 274, column: 50
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

  public void thread207405(int [] tdone, int [] ends){
        S207195=1;
    if(zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 272, column: 31
      zoneOneLightONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 272, column: 50
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

  public void thread207404(int [] tdone, int [] ends){
        S207187=1;
    S207175=0;
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread207403(int [] tdone, int [] ends){
        S207173=1;
    S207161=0;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread207402(int [] tdone, int [] ends){
        S207159=1;
    S207147=0;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread207401(int [] tdone, int [] ends){
        S207145=1;
    S207133=0;
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread207400(int [] tdone, int [] ends){
        S207131=1;
    S207119=0;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread207399(int [] tdone, int [] ends){
        S207117=1;
    S207105=0;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread207398(int [] tdone, int [] ends){
        S207103=1;
    S207091=0;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread207397(int [] tdone, int [] ends){
        S207089=1;
    S207077=0;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread207396(int [] tdone, int [] ends){
        S207075=1;
    S207063=0;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread207395(int [] tdone, int [] ends){
        S207061=1;
    S207049=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread207394(int [] tdone, int [] ends){
        S207047=1;
    S207035=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread207393(int [] tdone, int [] ends){
        S207033=1;
    S207021=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread207392(int [] tdone, int [] ends){
        S207019=1;
    S207007=0;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread207391(int [] tdone, int [] ends){
        S207005=1;
    S206993=0;
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
      switch(S207301){
        case 0 : 
          S207301=0;
          break RUN;
        
        case 1 : 
          S207301=2;
          S207301=2;
          thread207391(tdone,ends);
          thread207392(tdone,ends);
          thread207393(tdone,ends);
          thread207394(tdone,ends);
          thread207395(tdone,ends);
          thread207396(tdone,ends);
          thread207397(tdone,ends);
          thread207398(tdone,ends);
          thread207399(tdone,ends);
          thread207400(tdone,ends);
          thread207401(tdone,ends);
          thread207402(tdone,ends);
          thread207403(tdone,ends);
          thread207404(tdone,ends);
          thread207405(tdone,ends);
          thread207406(tdone,ends);
          thread207407(tdone,ends);
          thread207408(tdone,ends);
          thread207409(tdone,ends);
          thread207410(tdone,ends);
          thread207411(tdone,ends);
          thread207412(tdone,ends);
          thread207413(tdone,ends);
          thread207414(tdone,ends);
          thread207415(tdone,ends);
          thread207416(tdone,ends);
          thread207417(tdone,ends);
          thread207418(tdone,ends);
          int biggest207419 = 0;
          if(ends[23]>=biggest207419){
            biggest207419=ends[23];
          }
          if(ends[24]>=biggest207419){
            biggest207419=ends[24];
          }
          if(ends[25]>=biggest207419){
            biggest207419=ends[25];
          }
          if(ends[26]>=biggest207419){
            biggest207419=ends[26];
          }
          if(ends[27]>=biggest207419){
            biggest207419=ends[27];
          }
          if(ends[28]>=biggest207419){
            biggest207419=ends[28];
          }
          if(ends[29]>=biggest207419){
            biggest207419=ends[29];
          }
          if(ends[30]>=biggest207419){
            biggest207419=ends[30];
          }
          if(ends[31]>=biggest207419){
            biggest207419=ends[31];
          }
          if(ends[32]>=biggest207419){
            biggest207419=ends[32];
          }
          if(ends[33]>=biggest207419){
            biggest207419=ends[33];
          }
          if(ends[34]>=biggest207419){
            biggest207419=ends[34];
          }
          if(ends[35]>=biggest207419){
            biggest207419=ends[35];
          }
          if(ends[36]>=biggest207419){
            biggest207419=ends[36];
          }
          if(ends[37]>=biggest207419){
            biggest207419=ends[37];
          }
          if(ends[38]>=biggest207419){
            biggest207419=ends[38];
          }
          if(ends[39]>=biggest207419){
            biggest207419=ends[39];
          }
          if(ends[40]>=biggest207419){
            biggest207419=ends[40];
          }
          if(ends[41]>=biggest207419){
            biggest207419=ends[41];
          }
          if(ends[42]>=biggest207419){
            biggest207419=ends[42];
          }
          if(ends[43]>=biggest207419){
            biggest207419=ends[43];
          }
          if(ends[44]>=biggest207419){
            biggest207419=ends[44];
          }
          if(ends[45]>=biggest207419){
            biggest207419=ends[45];
          }
          if(ends[46]>=biggest207419){
            biggest207419=ends[46];
          }
          if(ends[47]>=biggest207419){
            biggest207419=ends[47];
          }
          if(ends[48]>=biggest207419){
            biggest207419=ends[48];
          }
          if(ends[49]>=biggest207419){
            biggest207419=ends[49];
          }
          if(ends[50]>=biggest207419){
            biggest207419=ends[50];
          }
          if(biggest207419 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
        
        case 2 : 
          thread207420(tdone,ends);
          thread207421(tdone,ends);
          thread207422(tdone,ends);
          thread207423(tdone,ends);
          thread207424(tdone,ends);
          thread207425(tdone,ends);
          thread207426(tdone,ends);
          thread207427(tdone,ends);
          thread207428(tdone,ends);
          thread207429(tdone,ends);
          thread207430(tdone,ends);
          thread207431(tdone,ends);
          thread207432(tdone,ends);
          thread207433(tdone,ends);
          thread207434(tdone,ends);
          thread207435(tdone,ends);
          thread207436(tdone,ends);
          thread207437(tdone,ends);
          thread207438(tdone,ends);
          thread207439(tdone,ends);
          thread207440(tdone,ends);
          thread207441(tdone,ends);
          thread207442(tdone,ends);
          thread207443(tdone,ends);
          thread207444(tdone,ends);
          thread207445(tdone,ends);
          thread207446(tdone,ends);
          thread207447(tdone,ends);
          int biggest207448 = 0;
          if(ends[23]>=biggest207448){
            biggest207448=ends[23];
          }
          if(ends[24]>=biggest207448){
            biggest207448=ends[24];
          }
          if(ends[25]>=biggest207448){
            biggest207448=ends[25];
          }
          if(ends[26]>=biggest207448){
            biggest207448=ends[26];
          }
          if(ends[27]>=biggest207448){
            biggest207448=ends[27];
          }
          if(ends[28]>=biggest207448){
            biggest207448=ends[28];
          }
          if(ends[29]>=biggest207448){
            biggest207448=ends[29];
          }
          if(ends[30]>=biggest207448){
            biggest207448=ends[30];
          }
          if(ends[31]>=biggest207448){
            biggest207448=ends[31];
          }
          if(ends[32]>=biggest207448){
            biggest207448=ends[32];
          }
          if(ends[33]>=biggest207448){
            biggest207448=ends[33];
          }
          if(ends[34]>=biggest207448){
            biggest207448=ends[34];
          }
          if(ends[35]>=biggest207448){
            biggest207448=ends[35];
          }
          if(ends[36]>=biggest207448){
            biggest207448=ends[36];
          }
          if(ends[37]>=biggest207448){
            biggest207448=ends[37];
          }
          if(ends[38]>=biggest207448){
            biggest207448=ends[38];
          }
          if(ends[39]>=biggest207448){
            biggest207448=ends[39];
          }
          if(ends[40]>=biggest207448){
            biggest207448=ends[40];
          }
          if(ends[41]>=biggest207448){
            biggest207448=ends[41];
          }
          if(ends[42]>=biggest207448){
            biggest207448=ends[42];
          }
          if(ends[43]>=biggest207448){
            biggest207448=ends[43];
          }
          if(ends[44]>=biggest207448){
            biggest207448=ends[44];
          }
          if(ends[45]>=biggest207448){
            biggest207448=ends[45];
          }
          if(ends[46]>=biggest207448){
            biggest207448=ends[46];
          }
          if(ends[47]>=biggest207448){
            biggest207448=ends[47];
          }
          if(ends[48]>=biggest207448){
            biggest207448=ends[48];
          }
          if(ends[49]>=biggest207448){
            biggest207448=ends[49];
          }
          if(ends[50]>=biggest207448){
            biggest207448=ends[50];
          }
          if(biggest207448 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
          //FINXME code
          if(biggest207448 == 0){
            S207301=0;
            active[22]=0;
            ends[22]=0;
            S207301=0;
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
      Zone1_Finished.setpreclear();
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
      Zone1_Finished.sethook();
      Zone1_Finished.setClear();
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

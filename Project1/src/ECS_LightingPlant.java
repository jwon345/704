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
  private int S207326 = 1;
  private int S207030 = 1;
  private int S207018 = 1;
  private int S207044 = 1;
  private int S207032 = 1;
  private int S207058 = 1;
  private int S207046 = 1;
  private int S207072 = 1;
  private int S207060 = 1;
  private int S207086 = 1;
  private int S207074 = 1;
  private int S207100 = 1;
  private int S207088 = 1;
  private int S207114 = 1;
  private int S207102 = 1;
  private int S207128 = 1;
  private int S207116 = 1;
  private int S207142 = 1;
  private int S207130 = 1;
  private int S207156 = 1;
  private int S207144 = 1;
  private int S207170 = 1;
  private int S207158 = 1;
  private int S207184 = 1;
  private int S207172 = 1;
  private int S207198 = 1;
  private int S207186 = 1;
  private int S207212 = 1;
  private int S207200 = 1;
  private int S207220 = 1;
  private int S207228 = 1;
  private int S207236 = 1;
  private int S207244 = 1;
  private int S207252 = 1;
  private int S207260 = 1;
  private int S207268 = 1;
  private int S207276 = 1;
  private int S207284 = 1;
  private int S207292 = 1;
  private int S207300 = 1;
  private int S207308 = 1;
  private int S207316 = 1;
  private int S207324 = 1;
  
  private int[] ends = new int[54];
  private int[] tdone = new int[54];
  
  public void thread207472(int [] tdone, int [] ends){
        switch(S207324){
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

  public void thread207471(int [] tdone, int [] ends){
        switch(S207316){
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

  public void thread207470(int [] tdone, int [] ends){
        switch(S207308){
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

  public void thread207469(int [] tdone, int [] ends){
        switch(S207300){
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

  public void thread207468(int [] tdone, int [] ends){
        switch(S207292){
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

  public void thread207467(int [] tdone, int [] ends){
        switch(S207284){
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

  public void thread207466(int [] tdone, int [] ends){
        switch(S207276){
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

  public void thread207465(int [] tdone, int [] ends){
        switch(S207268){
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

  public void thread207464(int [] tdone, int [] ends){
        switch(S207260){
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

  public void thread207463(int [] tdone, int [] ends){
        switch(S207252){
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

  public void thread207462(int [] tdone, int [] ends){
        switch(S207244){
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

  public void thread207461(int [] tdone, int [] ends){
        switch(S207236){
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

  public void thread207460(int [] tdone, int [] ends){
        switch(S207228){
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

  public void thread207459(int [] tdone, int [] ends){
        switch(S207220){
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

  public void thread207458(int [] tdone, int [] ends){
        switch(S207212){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        switch(S207200){
          case 0 : 
            if(zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 265, column: 21
              System.out.println("After Hours - Zone 7 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 266, column: 15
              S207200=1;
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
              S207200=0;
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

  public void thread207457(int [] tdone, int [] ends){
        switch(S207198){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        switch(S207186){
          case 0 : 
            if(zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 255, column: 21
              System.out.println("After Hours - Zone 6 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 256, column: 15
              S207186=1;
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
              S207186=0;
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

  public void thread207456(int [] tdone, int [] ends){
        switch(S207184){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        switch(S207172){
          case 0 : 
            if(zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 245, column: 21
              System.out.println("After Hours - Zone 5 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 246, column: 15
              S207172=1;
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
              S207172=0;
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

  public void thread207455(int [] tdone, int [] ends){
        switch(S207170){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        switch(S207158){
          case 0 : 
            if(zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 235, column: 21
              System.out.println("After Hours - Zone 4 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 236, column: 15
              S207158=1;
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
              S207158=0;
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

  public void thread207454(int [] tdone, int [] ends){
        switch(S207156){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        switch(S207144){
          case 0 : 
            if(zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 225, column: 21
              System.out.println("After Hours - Zone 3 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 226, column: 15
              S207144=1;
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
              S207144=0;
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

  public void thread207453(int [] tdone, int [] ends){
        switch(S207142){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        switch(S207130){
          case 0 : 
            if(zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 215, column: 21
              System.out.println("After Hours - Zone 2 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 216, column: 15
              S207130=1;
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
              S207130=0;
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

  public void thread207452(int [] tdone, int [] ends){
        switch(S207128){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S207116){
          case 0 : 
            if(zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 206, column: 21
              System.out.println("After Hours - Zone 1 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 207, column: 15
              S207116=1;
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
              S207116=0;
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

  public void thread207451(int [] tdone, int [] ends){
        switch(S207114){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S207102){
          case 0 : 
            if(zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 192, column: 21
              System.out.println("Work Hours - Zone 7 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 193, column: 15
              S207102=1;
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
              S207102=0;
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

  public void thread207450(int [] tdone, int [] ends){
        switch(S207100){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        switch(S207088){
          case 0 : 
            if(zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 183, column: 21
              System.out.println("Work Hours - Zone 6 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 184, column: 15
              S207088=1;
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
              S207088=0;
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

  public void thread207449(int [] tdone, int [] ends){
        switch(S207086){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S207074){
          case 0 : 
            if(zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 174, column: 21
              System.out.println("Work Hours - Zone 5 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 175, column: 15
              S207074=1;
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
              S207074=0;
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

  public void thread207448(int [] tdone, int [] ends){
        switch(S207072){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S207060){
          case 0 : 
            if(zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 165, column: 21
              System.out.println("Work Hours - Zone 4 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 166, column: 15
              S207060=1;
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
              S207060=0;
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

  public void thread207447(int [] tdone, int [] ends){
        switch(S207058){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S207046){
          case 0 : 
            if(zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 156, column: 21
              System.out.println("Work Hours - Zone 3 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 157, column: 15
              S207046=1;
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
              S207046=0;
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

  public void thread207446(int [] tdone, int [] ends){
        switch(S207044){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S207032){
          case 0 : 
            if(zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 147, column: 21
              System.out.println("Work Hours - Zone 2 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 148, column: 15
              S207032=1;
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
              S207032=0;
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

  public void thread207445(int [] tdone, int [] ends){
        switch(S207030){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S207018){
          case 0 : 
            if(zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 139, column: 21
              System.out.println("Work Hours - Zone 1 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 140, column: 15
              S207018=1;
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
              S207018=0;
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

  public void thread207443(int [] tdone, int [] ends){
        S207324=1;
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

  public void thread207442(int [] tdone, int [] ends){
        S207316=1;
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

  public void thread207441(int [] tdone, int [] ends){
        S207308=1;
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

  public void thread207440(int [] tdone, int [] ends){
        S207300=1;
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

  public void thread207439(int [] tdone, int [] ends){
        S207292=1;
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

  public void thread207438(int [] tdone, int [] ends){
        S207284=1;
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

  public void thread207437(int [] tdone, int [] ends){
        S207276=1;
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

  public void thread207436(int [] tdone, int [] ends){
        S207268=1;
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

  public void thread207435(int [] tdone, int [] ends){
        S207260=1;
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

  public void thread207434(int [] tdone, int [] ends){
        S207252=1;
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

  public void thread207433(int [] tdone, int [] ends){
        S207244=1;
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

  public void thread207432(int [] tdone, int [] ends){
        S207236=1;
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

  public void thread207431(int [] tdone, int [] ends){
        S207228=1;
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

  public void thread207430(int [] tdone, int [] ends){
        S207220=1;
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

  public void thread207429(int [] tdone, int [] ends){
        S207212=1;
    S207200=0;
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread207428(int [] tdone, int [] ends){
        S207198=1;
    S207186=0;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread207427(int [] tdone, int [] ends){
        S207184=1;
    S207172=0;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread207426(int [] tdone, int [] ends){
        S207170=1;
    S207158=0;
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread207425(int [] tdone, int [] ends){
        S207156=1;
    S207144=0;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread207424(int [] tdone, int [] ends){
        S207142=1;
    S207130=0;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread207423(int [] tdone, int [] ends){
        S207128=1;
    S207116=0;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread207422(int [] tdone, int [] ends){
        S207114=1;
    S207102=0;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread207421(int [] tdone, int [] ends){
        S207100=1;
    S207088=0;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread207420(int [] tdone, int [] ends){
        S207086=1;
    S207074=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread207419(int [] tdone, int [] ends){
        S207072=1;
    S207060=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread207418(int [] tdone, int [] ends){
        S207058=1;
    S207046=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread207417(int [] tdone, int [] ends){
        S207044=1;
    S207032=0;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread207416(int [] tdone, int [] ends){
        S207030=1;
    S207018=0;
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
      switch(S207326){
        case 0 : 
          S207326=0;
          break RUN;
        
        case 1 : 
          S207326=2;
          S207326=2;
          thread207416(tdone,ends);
          thread207417(tdone,ends);
          thread207418(tdone,ends);
          thread207419(tdone,ends);
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
          int biggest207444 = 0;
          if(ends[23]>=biggest207444){
            biggest207444=ends[23];
          }
          if(ends[24]>=biggest207444){
            biggest207444=ends[24];
          }
          if(ends[25]>=biggest207444){
            biggest207444=ends[25];
          }
          if(ends[26]>=biggest207444){
            biggest207444=ends[26];
          }
          if(ends[27]>=biggest207444){
            biggest207444=ends[27];
          }
          if(ends[28]>=biggest207444){
            biggest207444=ends[28];
          }
          if(ends[29]>=biggest207444){
            biggest207444=ends[29];
          }
          if(ends[30]>=biggest207444){
            biggest207444=ends[30];
          }
          if(ends[31]>=biggest207444){
            biggest207444=ends[31];
          }
          if(ends[32]>=biggest207444){
            biggest207444=ends[32];
          }
          if(ends[33]>=biggest207444){
            biggest207444=ends[33];
          }
          if(ends[34]>=biggest207444){
            biggest207444=ends[34];
          }
          if(ends[35]>=biggest207444){
            biggest207444=ends[35];
          }
          if(ends[36]>=biggest207444){
            biggest207444=ends[36];
          }
          if(ends[37]>=biggest207444){
            biggest207444=ends[37];
          }
          if(ends[38]>=biggest207444){
            biggest207444=ends[38];
          }
          if(ends[39]>=biggest207444){
            biggest207444=ends[39];
          }
          if(ends[40]>=biggest207444){
            biggest207444=ends[40];
          }
          if(ends[41]>=biggest207444){
            biggest207444=ends[41];
          }
          if(ends[42]>=biggest207444){
            biggest207444=ends[42];
          }
          if(ends[43]>=biggest207444){
            biggest207444=ends[43];
          }
          if(ends[44]>=biggest207444){
            biggest207444=ends[44];
          }
          if(ends[45]>=biggest207444){
            biggest207444=ends[45];
          }
          if(ends[46]>=biggest207444){
            biggest207444=ends[46];
          }
          if(ends[47]>=biggest207444){
            biggest207444=ends[47];
          }
          if(ends[48]>=biggest207444){
            biggest207444=ends[48];
          }
          if(ends[49]>=biggest207444){
            biggest207444=ends[49];
          }
          if(ends[50]>=biggest207444){
            biggest207444=ends[50];
          }
          if(biggest207444 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
        
        case 2 : 
          thread207445(tdone,ends);
          thread207446(tdone,ends);
          thread207447(tdone,ends);
          thread207448(tdone,ends);
          thread207449(tdone,ends);
          thread207450(tdone,ends);
          thread207451(tdone,ends);
          thread207452(tdone,ends);
          thread207453(tdone,ends);
          thread207454(tdone,ends);
          thread207455(tdone,ends);
          thread207456(tdone,ends);
          thread207457(tdone,ends);
          thread207458(tdone,ends);
          thread207459(tdone,ends);
          thread207460(tdone,ends);
          thread207461(tdone,ends);
          thread207462(tdone,ends);
          thread207463(tdone,ends);
          thread207464(tdone,ends);
          thread207465(tdone,ends);
          thread207466(tdone,ends);
          thread207467(tdone,ends);
          thread207468(tdone,ends);
          thread207469(tdone,ends);
          thread207470(tdone,ends);
          thread207471(tdone,ends);
          thread207472(tdone,ends);
          int biggest207473 = 0;
          if(ends[23]>=biggest207473){
            biggest207473=ends[23];
          }
          if(ends[24]>=biggest207473){
            biggest207473=ends[24];
          }
          if(ends[25]>=biggest207473){
            biggest207473=ends[25];
          }
          if(ends[26]>=biggest207473){
            biggest207473=ends[26];
          }
          if(ends[27]>=biggest207473){
            biggest207473=ends[27];
          }
          if(ends[28]>=biggest207473){
            biggest207473=ends[28];
          }
          if(ends[29]>=biggest207473){
            biggest207473=ends[29];
          }
          if(ends[30]>=biggest207473){
            biggest207473=ends[30];
          }
          if(ends[31]>=biggest207473){
            biggest207473=ends[31];
          }
          if(ends[32]>=biggest207473){
            biggest207473=ends[32];
          }
          if(ends[33]>=biggest207473){
            biggest207473=ends[33];
          }
          if(ends[34]>=biggest207473){
            biggest207473=ends[34];
          }
          if(ends[35]>=biggest207473){
            biggest207473=ends[35];
          }
          if(ends[36]>=biggest207473){
            biggest207473=ends[36];
          }
          if(ends[37]>=biggest207473){
            biggest207473=ends[37];
          }
          if(ends[38]>=biggest207473){
            biggest207473=ends[38];
          }
          if(ends[39]>=biggest207473){
            biggest207473=ends[39];
          }
          if(ends[40]>=biggest207473){
            biggest207473=ends[40];
          }
          if(ends[41]>=biggest207473){
            biggest207473=ends[41];
          }
          if(ends[42]>=biggest207473){
            biggest207473=ends[42];
          }
          if(ends[43]>=biggest207473){
            biggest207473=ends[43];
          }
          if(ends[44]>=biggest207473){
            biggest207473=ends[44];
          }
          if(ends[45]>=biggest207473){
            biggest207473=ends[45];
          }
          if(ends[46]>=biggest207473){
            biggest207473=ends[46];
          }
          if(ends[47]>=biggest207473){
            biggest207473=ends[47];
          }
          if(ends[48]>=biggest207473){
            biggest207473=ends[48];
          }
          if(ends[49]>=biggest207473){
            biggest207473=ends[49];
          }
          if(ends[50]>=biggest207473){
            biggest207473=ends[50];
          }
          if(biggest207473 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
          //FINXME code
          if(biggest207473 == 0){
            S207326=0;
            active[22]=0;
            ends[22]=0;
            S207326=0;
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

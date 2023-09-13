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
  private int S207668 = 1;
  private int S207372 = 1;
  private int S207360 = 1;
  private int S207386 = 1;
  private int S207374 = 1;
  private int S207400 = 1;
  private int S207388 = 1;
  private int S207414 = 1;
  private int S207402 = 1;
  private int S207428 = 1;
  private int S207416 = 1;
  private int S207442 = 1;
  private int S207430 = 1;
  private int S207456 = 1;
  private int S207444 = 1;
  private int S207470 = 1;
  private int S207458 = 1;
  private int S207484 = 1;
  private int S207472 = 1;
  private int S207498 = 1;
  private int S207486 = 1;
  private int S207512 = 1;
  private int S207500 = 1;
  private int S207526 = 1;
  private int S207514 = 1;
  private int S207540 = 1;
  private int S207528 = 1;
  private int S207554 = 1;
  private int S207542 = 1;
  private int S207562 = 1;
  private int S207570 = 1;
  private int S207578 = 1;
  private int S207586 = 1;
  private int S207594 = 1;
  private int S207602 = 1;
  private int S207610 = 1;
  private int S207618 = 1;
  private int S207626 = 1;
  private int S207634 = 1;
  private int S207642 = 1;
  private int S207650 = 1;
  private int S207658 = 1;
  private int S207666 = 1;
  
  private int[] ends = new int[54];
  private int[] tdone = new int[54];
  
  public void thread207820(int [] tdone, int [] ends){
        switch(S207666){
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

  public void thread207819(int [] tdone, int [] ends){
        switch(S207658){
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

  public void thread207818(int [] tdone, int [] ends){
        switch(S207650){
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

  public void thread207817(int [] tdone, int [] ends){
        switch(S207642){
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

  public void thread207816(int [] tdone, int [] ends){
        switch(S207634){
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

  public void thread207815(int [] tdone, int [] ends){
        switch(S207626){
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

  public void thread207814(int [] tdone, int [] ends){
        switch(S207618){
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

  public void thread207813(int [] tdone, int [] ends){
        switch(S207610){
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

  public void thread207812(int [] tdone, int [] ends){
        switch(S207602){
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

  public void thread207811(int [] tdone, int [] ends){
        switch(S207594){
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

  public void thread207810(int [] tdone, int [] ends){
        switch(S207586){
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

  public void thread207809(int [] tdone, int [] ends){
        switch(S207578){
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

  public void thread207808(int [] tdone, int [] ends){
        switch(S207570){
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

  public void thread207807(int [] tdone, int [] ends){
        switch(S207562){
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

  public void thread207806(int [] tdone, int [] ends){
        switch(S207554){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        switch(S207542){
          case 0 : 
            if(zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 265, column: 21
              System.out.println("After Hours - Zone 7 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 266, column: 15
              S207542=1;
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
              S207542=0;
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

  public void thread207805(int [] tdone, int [] ends){
        switch(S207540){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        switch(S207528){
          case 0 : 
            if(zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 255, column: 21
              System.out.println("After Hours - Zone 6 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 256, column: 15
              S207528=1;
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
              S207528=0;
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

  public void thread207804(int [] tdone, int [] ends){
        switch(S207526){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        switch(S207514){
          case 0 : 
            if(zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 245, column: 21
              System.out.println("After Hours - Zone 5 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 246, column: 15
              S207514=1;
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
              S207514=0;
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

  public void thread207803(int [] tdone, int [] ends){
        switch(S207512){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        switch(S207500){
          case 0 : 
            if(zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 235, column: 21
              System.out.println("After Hours - Zone 4 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 236, column: 15
              S207500=1;
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
              S207500=0;
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

  public void thread207802(int [] tdone, int [] ends){
        switch(S207498){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        switch(S207486){
          case 0 : 
            if(zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 225, column: 21
              System.out.println("After Hours - Zone 3 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 226, column: 15
              S207486=1;
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
              S207486=0;
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

  public void thread207801(int [] tdone, int [] ends){
        switch(S207484){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        switch(S207472){
          case 0 : 
            if(zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 215, column: 21
              System.out.println("After Hours - Zone 2 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 216, column: 15
              S207472=1;
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
              S207472=0;
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

  public void thread207800(int [] tdone, int [] ends){
        switch(S207470){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S207458){
          case 0 : 
            if(zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 206, column: 21
              System.out.println("After Hours - Zone 1 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 207, column: 15
              S207458=1;
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
              S207458=0;
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

  public void thread207799(int [] tdone, int [] ends){
        switch(S207456){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S207444){
          case 0 : 
            if(zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 192, column: 21
              System.out.println("Work Hours - Zone 7 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 193, column: 15
              S207444=1;
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
              S207444=0;
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

  public void thread207798(int [] tdone, int [] ends){
        switch(S207442){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        switch(S207430){
          case 0 : 
            if(zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 183, column: 21
              System.out.println("Work Hours - Zone 6 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 184, column: 15
              S207430=1;
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
              S207430=0;
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

  public void thread207797(int [] tdone, int [] ends){
        switch(S207428){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S207416){
          case 0 : 
            if(zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 174, column: 21
              System.out.println("Work Hours - Zone 5 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 175, column: 15
              S207416=1;
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
              S207416=0;
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

  public void thread207796(int [] tdone, int [] ends){
        switch(S207414){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S207402){
          case 0 : 
            if(zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 165, column: 21
              System.out.println("Work Hours - Zone 4 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 166, column: 15
              S207402=1;
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
              S207402=0;
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

  public void thread207795(int [] tdone, int [] ends){
        switch(S207400){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S207388){
          case 0 : 
            if(zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 156, column: 21
              System.out.println("Work Hours - Zone 3 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 157, column: 15
              S207388=1;
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
              S207388=0;
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

  public void thread207794(int [] tdone, int [] ends){
        switch(S207386){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S207374){
          case 0 : 
            if(zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 147, column: 21
              System.out.println("Work Hours - Zone 2 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 148, column: 15
              S207374=1;
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
              S207374=0;
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

  public void thread207793(int [] tdone, int [] ends){
        switch(S207372){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S207360){
          case 0 : 
            if(zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 139, column: 21
              System.out.println("Work Hours - Zone 1 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 140, column: 15
              S207360=1;
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
              S207360=0;
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

  public void thread207791(int [] tdone, int [] ends){
        S207666=1;
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

  public void thread207790(int [] tdone, int [] ends){
        S207658=1;
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

  public void thread207789(int [] tdone, int [] ends){
        S207650=1;
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

  public void thread207788(int [] tdone, int [] ends){
        S207642=1;
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

  public void thread207787(int [] tdone, int [] ends){
        S207634=1;
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

  public void thread207786(int [] tdone, int [] ends){
        S207626=1;
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

  public void thread207785(int [] tdone, int [] ends){
        S207618=1;
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

  public void thread207784(int [] tdone, int [] ends){
        S207610=1;
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

  public void thread207783(int [] tdone, int [] ends){
        S207602=1;
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

  public void thread207782(int [] tdone, int [] ends){
        S207594=1;
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

  public void thread207781(int [] tdone, int [] ends){
        S207586=1;
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

  public void thread207780(int [] tdone, int [] ends){
        S207578=1;
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

  public void thread207779(int [] tdone, int [] ends){
        S207570=1;
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

  public void thread207778(int [] tdone, int [] ends){
        S207562=1;
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

  public void thread207777(int [] tdone, int [] ends){
        S207554=1;
    S207542=0;
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread207776(int [] tdone, int [] ends){
        S207540=1;
    S207528=0;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread207775(int [] tdone, int [] ends){
        S207526=1;
    S207514=0;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread207774(int [] tdone, int [] ends){
        S207512=1;
    S207500=0;
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread207773(int [] tdone, int [] ends){
        S207498=1;
    S207486=0;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread207772(int [] tdone, int [] ends){
        S207484=1;
    S207472=0;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread207771(int [] tdone, int [] ends){
        S207470=1;
    S207458=0;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread207770(int [] tdone, int [] ends){
        S207456=1;
    S207444=0;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread207769(int [] tdone, int [] ends){
        S207442=1;
    S207430=0;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread207768(int [] tdone, int [] ends){
        S207428=1;
    S207416=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread207767(int [] tdone, int [] ends){
        S207414=1;
    S207402=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread207766(int [] tdone, int [] ends){
        S207400=1;
    S207388=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread207765(int [] tdone, int [] ends){
        S207386=1;
    S207374=0;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread207764(int [] tdone, int [] ends){
        S207372=1;
    S207360=0;
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
      switch(S207668){
        case 0 : 
          S207668=0;
          break RUN;
        
        case 1 : 
          S207668=2;
          S207668=2;
          thread207764(tdone,ends);
          thread207765(tdone,ends);
          thread207766(tdone,ends);
          thread207767(tdone,ends);
          thread207768(tdone,ends);
          thread207769(tdone,ends);
          thread207770(tdone,ends);
          thread207771(tdone,ends);
          thread207772(tdone,ends);
          thread207773(tdone,ends);
          thread207774(tdone,ends);
          thread207775(tdone,ends);
          thread207776(tdone,ends);
          thread207777(tdone,ends);
          thread207778(tdone,ends);
          thread207779(tdone,ends);
          thread207780(tdone,ends);
          thread207781(tdone,ends);
          thread207782(tdone,ends);
          thread207783(tdone,ends);
          thread207784(tdone,ends);
          thread207785(tdone,ends);
          thread207786(tdone,ends);
          thread207787(tdone,ends);
          thread207788(tdone,ends);
          thread207789(tdone,ends);
          thread207790(tdone,ends);
          thread207791(tdone,ends);
          int biggest207792 = 0;
          if(ends[23]>=biggest207792){
            biggest207792=ends[23];
          }
          if(ends[24]>=biggest207792){
            biggest207792=ends[24];
          }
          if(ends[25]>=biggest207792){
            biggest207792=ends[25];
          }
          if(ends[26]>=biggest207792){
            biggest207792=ends[26];
          }
          if(ends[27]>=biggest207792){
            biggest207792=ends[27];
          }
          if(ends[28]>=biggest207792){
            biggest207792=ends[28];
          }
          if(ends[29]>=biggest207792){
            biggest207792=ends[29];
          }
          if(ends[30]>=biggest207792){
            biggest207792=ends[30];
          }
          if(ends[31]>=biggest207792){
            biggest207792=ends[31];
          }
          if(ends[32]>=biggest207792){
            biggest207792=ends[32];
          }
          if(ends[33]>=biggest207792){
            biggest207792=ends[33];
          }
          if(ends[34]>=biggest207792){
            biggest207792=ends[34];
          }
          if(ends[35]>=biggest207792){
            biggest207792=ends[35];
          }
          if(ends[36]>=biggest207792){
            biggest207792=ends[36];
          }
          if(ends[37]>=biggest207792){
            biggest207792=ends[37];
          }
          if(ends[38]>=biggest207792){
            biggest207792=ends[38];
          }
          if(ends[39]>=biggest207792){
            biggest207792=ends[39];
          }
          if(ends[40]>=biggest207792){
            biggest207792=ends[40];
          }
          if(ends[41]>=biggest207792){
            biggest207792=ends[41];
          }
          if(ends[42]>=biggest207792){
            biggest207792=ends[42];
          }
          if(ends[43]>=biggest207792){
            biggest207792=ends[43];
          }
          if(ends[44]>=biggest207792){
            biggest207792=ends[44];
          }
          if(ends[45]>=biggest207792){
            biggest207792=ends[45];
          }
          if(ends[46]>=biggest207792){
            biggest207792=ends[46];
          }
          if(ends[47]>=biggest207792){
            biggest207792=ends[47];
          }
          if(ends[48]>=biggest207792){
            biggest207792=ends[48];
          }
          if(ends[49]>=biggest207792){
            biggest207792=ends[49];
          }
          if(ends[50]>=biggest207792){
            biggest207792=ends[50];
          }
          if(biggest207792 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
        
        case 2 : 
          thread207793(tdone,ends);
          thread207794(tdone,ends);
          thread207795(tdone,ends);
          thread207796(tdone,ends);
          thread207797(tdone,ends);
          thread207798(tdone,ends);
          thread207799(tdone,ends);
          thread207800(tdone,ends);
          thread207801(tdone,ends);
          thread207802(tdone,ends);
          thread207803(tdone,ends);
          thread207804(tdone,ends);
          thread207805(tdone,ends);
          thread207806(tdone,ends);
          thread207807(tdone,ends);
          thread207808(tdone,ends);
          thread207809(tdone,ends);
          thread207810(tdone,ends);
          thread207811(tdone,ends);
          thread207812(tdone,ends);
          thread207813(tdone,ends);
          thread207814(tdone,ends);
          thread207815(tdone,ends);
          thread207816(tdone,ends);
          thread207817(tdone,ends);
          thread207818(tdone,ends);
          thread207819(tdone,ends);
          thread207820(tdone,ends);
          int biggest207821 = 0;
          if(ends[23]>=biggest207821){
            biggest207821=ends[23];
          }
          if(ends[24]>=biggest207821){
            biggest207821=ends[24];
          }
          if(ends[25]>=biggest207821){
            biggest207821=ends[25];
          }
          if(ends[26]>=biggest207821){
            biggest207821=ends[26];
          }
          if(ends[27]>=biggest207821){
            biggest207821=ends[27];
          }
          if(ends[28]>=biggest207821){
            biggest207821=ends[28];
          }
          if(ends[29]>=biggest207821){
            biggest207821=ends[29];
          }
          if(ends[30]>=biggest207821){
            biggest207821=ends[30];
          }
          if(ends[31]>=biggest207821){
            biggest207821=ends[31];
          }
          if(ends[32]>=biggest207821){
            biggest207821=ends[32];
          }
          if(ends[33]>=biggest207821){
            biggest207821=ends[33];
          }
          if(ends[34]>=biggest207821){
            biggest207821=ends[34];
          }
          if(ends[35]>=biggest207821){
            biggest207821=ends[35];
          }
          if(ends[36]>=biggest207821){
            biggest207821=ends[36];
          }
          if(ends[37]>=biggest207821){
            biggest207821=ends[37];
          }
          if(ends[38]>=biggest207821){
            biggest207821=ends[38];
          }
          if(ends[39]>=biggest207821){
            biggest207821=ends[39];
          }
          if(ends[40]>=biggest207821){
            biggest207821=ends[40];
          }
          if(ends[41]>=biggest207821){
            biggest207821=ends[41];
          }
          if(ends[42]>=biggest207821){
            biggest207821=ends[42];
          }
          if(ends[43]>=biggest207821){
            biggest207821=ends[43];
          }
          if(ends[44]>=biggest207821){
            biggest207821=ends[44];
          }
          if(ends[45]>=biggest207821){
            biggest207821=ends[45];
          }
          if(ends[46]>=biggest207821){
            biggest207821=ends[46];
          }
          if(ends[47]>=biggest207821){
            biggest207821=ends[47];
          }
          if(ends[48]>=biggest207821){
            biggest207821=ends[48];
          }
          if(ends[49]>=biggest207821){
            biggest207821=ends[49];
          }
          if(ends[50]>=biggest207821){
            biggest207821=ends[50];
          }
          if(biggest207821 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
          //FINXME code
          if(biggest207821 == 0){
            S207668=0;
            active[22]=0;
            ends[22]=0;
            S207668=0;
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

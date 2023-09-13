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
  private int S217482 = 1;
  private int S217186 = 1;
  private int S217174 = 1;
  private int S217200 = 1;
  private int S217188 = 1;
  private int S217214 = 1;
  private int S217202 = 1;
  private int S217228 = 1;
  private int S217216 = 1;
  private int S217242 = 1;
  private int S217230 = 1;
  private int S217256 = 1;
  private int S217244 = 1;
  private int S217270 = 1;
  private int S217258 = 1;
  private int S217284 = 1;
  private int S217272 = 1;
  private int S217298 = 1;
  private int S217286 = 1;
  private int S217312 = 1;
  private int S217300 = 1;
  private int S217326 = 1;
  private int S217314 = 1;
  private int S217340 = 1;
  private int S217328 = 1;
  private int S217354 = 1;
  private int S217342 = 1;
  private int S217368 = 1;
  private int S217356 = 1;
  private int S217376 = 1;
  private int S217384 = 1;
  private int S217392 = 1;
  private int S217400 = 1;
  private int S217408 = 1;
  private int S217416 = 1;
  private int S217424 = 1;
  private int S217432 = 1;
  private int S217440 = 1;
  private int S217448 = 1;
  private int S217456 = 1;
  private int S217464 = 1;
  private int S217472 = 1;
  private int S217480 = 1;
  
  private int[] ends = new int[54];
  private int[] tdone = new int[54];
  
  public void thread217634(int [] tdone, int [] ends){
        switch(S217480){
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

  public void thread217633(int [] tdone, int [] ends){
        switch(S217472){
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

  public void thread217632(int [] tdone, int [] ends){
        switch(S217464){
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

  public void thread217631(int [] tdone, int [] ends){
        switch(S217456){
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

  public void thread217630(int [] tdone, int [] ends){
        switch(S217448){
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

  public void thread217629(int [] tdone, int [] ends){
        switch(S217440){
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

  public void thread217628(int [] tdone, int [] ends){
        switch(S217432){
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

  public void thread217627(int [] tdone, int [] ends){
        switch(S217424){
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

  public void thread217626(int [] tdone, int [] ends){
        switch(S217416){
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

  public void thread217625(int [] tdone, int [] ends){
        switch(S217408){
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

  public void thread217624(int [] tdone, int [] ends){
        switch(S217400){
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

  public void thread217623(int [] tdone, int [] ends){
        switch(S217392){
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

  public void thread217622(int [] tdone, int [] ends){
        switch(S217384){
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

  public void thread217621(int [] tdone, int [] ends){
        switch(S217376){
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

  public void thread217620(int [] tdone, int [] ends){
        switch(S217368){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        switch(S217356){
          case 0 : 
            if(zoneSevenLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 265, column: 21
              System.out.println("After Hours - Zone 7 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 266, column: 15
              S217356=1;
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
              S217356=0;
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

  public void thread217619(int [] tdone, int [] ends){
        switch(S217354){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        switch(S217342){
          case 0 : 
            if(zoneSixLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 255, column: 21
              System.out.println("After Hours - Zone 6 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 256, column: 15
              S217342=1;
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
              S217342=0;
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

  public void thread217618(int [] tdone, int [] ends){
        switch(S217340){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        switch(S217328){
          case 0 : 
            if(zoneFiveLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 245, column: 21
              System.out.println("After Hours - Zone 5 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 246, column: 15
              S217328=1;
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
              S217328=0;
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

  public void thread217617(int [] tdone, int [] ends){
        switch(S217326){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        switch(S217314){
          case 0 : 
            if(zoneFourLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 235, column: 21
              System.out.println("After Hours - Zone 4 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 236, column: 15
              S217314=1;
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
              S217314=0;
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

  public void thread217616(int [] tdone, int [] ends){
        switch(S217312){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        switch(S217300){
          case 0 : 
            if(zoneThreeLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 225, column: 21
              System.out.println("After Hours - Zone 3 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 226, column: 15
              S217300=1;
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
              S217300=0;
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

  public void thread217615(int [] tdone, int [] ends){
        switch(S217298){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        switch(S217286){
          case 0 : 
            if(zoneTwoLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 215, column: 21
              System.out.println("After Hours - Zone 2 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 216, column: 15
              S217286=1;
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
              S217286=0;
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

  public void thread217614(int [] tdone, int [] ends){
        switch(S217284){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S217272){
          case 0 : 
            if(zoneOneLightONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 206, column: 21
              System.out.println("After Hours - Zone 1 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 207, column: 15
              S217272=1;
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
              S217272=0;
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

  public void thread217613(int [] tdone, int [] ends){
        switch(S217270){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S217258){
          case 0 : 
            if(zoneSevenWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 192, column: 21
              System.out.println("Work Hours - Zone 7 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 193, column: 15
              S217258=1;
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
              S217258=0;
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

  public void thread217612(int [] tdone, int [] ends){
        switch(S217256){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        switch(S217244){
          case 0 : 
            if(zoneSixWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 183, column: 21
              System.out.println("Work Hours - Zone 6 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 184, column: 15
              S217244=1;
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
              S217244=0;
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

  public void thread217611(int [] tdone, int [] ends){
        switch(S217242){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S217230){
          case 0 : 
            if(zoneFiveWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 174, column: 21
              System.out.println("Work Hours - Zone 5 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 175, column: 15
              S217230=1;
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
              S217230=0;
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

  public void thread217610(int [] tdone, int [] ends){
        switch(S217228){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S217216){
          case 0 : 
            if(zoneFourWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 165, column: 21
              System.out.println("Work Hours - Zone 4 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 166, column: 15
              S217216=1;
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
              S217216=0;
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

  public void thread217609(int [] tdone, int [] ends){
        switch(S217214){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S217202){
          case 0 : 
            if(zoneThreeWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 156, column: 21
              System.out.println("Work Hours - Zone 3 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 157, column: 15
              S217202=1;
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
              S217202=0;
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

  public void thread217608(int [] tdone, int [] ends){
        switch(S217200){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S217188){
          case 0 : 
            if(zoneTwoWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 147, column: 21
              System.out.println("Work Hours - Zone 2 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 148, column: 15
              S217188=1;
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
              S217188=0;
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

  public void thread217607(int [] tdone, int [] ends){
        switch(S217186){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S217174){
          case 0 : 
            if(zoneOneWindowONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 139, column: 21
              System.out.println("Work Hours - Zone 1 Detected Person and Intensity is Low");//sysj\ECS_plant.sysj line: 140, column: 15
              S217174=1;
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
              S217174=0;
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

  public void thread217605(int [] tdone, int [] ends){
        S217480=1;
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

  public void thread217604(int [] tdone, int [] ends){
        S217472=1;
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

  public void thread217603(int [] tdone, int [] ends){
        S217464=1;
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

  public void thread217602(int [] tdone, int [] ends){
        S217456=1;
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

  public void thread217601(int [] tdone, int [] ends){
        S217448=1;
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

  public void thread217600(int [] tdone, int [] ends){
        S217440=1;
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

  public void thread217599(int [] tdone, int [] ends){
        S217432=1;
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

  public void thread217598(int [] tdone, int [] ends){
        S217424=1;
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

  public void thread217597(int [] tdone, int [] ends){
        S217416=1;
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

  public void thread217596(int [] tdone, int [] ends){
        S217408=1;
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

  public void thread217595(int [] tdone, int [] ends){
        S217400=1;
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

  public void thread217594(int [] tdone, int [] ends){
        S217392=1;
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

  public void thread217593(int [] tdone, int [] ends){
        S217384=1;
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

  public void thread217592(int [] tdone, int [] ends){
        S217376=1;
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

  public void thread217591(int [] tdone, int [] ends){
        S217368=1;
    S217356=0;
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread217590(int [] tdone, int [] ends){
        S217354=1;
    S217342=0;
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread217589(int [] tdone, int [] ends){
        S217340=1;
    S217328=0;
    active[34]=1;
    ends[34]=1;
    tdone[34]=1;
  }

  public void thread217588(int [] tdone, int [] ends){
        S217326=1;
    S217314=0;
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread217587(int [] tdone, int [] ends){
        S217312=1;
    S217300=0;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread217586(int [] tdone, int [] ends){
        S217298=1;
    S217286=0;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread217585(int [] tdone, int [] ends){
        S217284=1;
    S217272=0;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread217584(int [] tdone, int [] ends){
        S217270=1;
    S217258=0;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread217583(int [] tdone, int [] ends){
        S217256=1;
    S217244=0;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread217582(int [] tdone, int [] ends){
        S217242=1;
    S217230=0;
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread217581(int [] tdone, int [] ends){
        S217228=1;
    S217216=0;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread217580(int [] tdone, int [] ends){
        S217214=1;
    S217202=0;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread217579(int [] tdone, int [] ends){
        S217200=1;
    S217188=0;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread217578(int [] tdone, int [] ends){
        S217186=1;
    S217174=0;
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
      switch(S217482){
        case 0 : 
          S217482=0;
          break RUN;
        
        case 1 : 
          S217482=2;
          S217482=2;
          thread217578(tdone,ends);
          thread217579(tdone,ends);
          thread217580(tdone,ends);
          thread217581(tdone,ends);
          thread217582(tdone,ends);
          thread217583(tdone,ends);
          thread217584(tdone,ends);
          thread217585(tdone,ends);
          thread217586(tdone,ends);
          thread217587(tdone,ends);
          thread217588(tdone,ends);
          thread217589(tdone,ends);
          thread217590(tdone,ends);
          thread217591(tdone,ends);
          thread217592(tdone,ends);
          thread217593(tdone,ends);
          thread217594(tdone,ends);
          thread217595(tdone,ends);
          thread217596(tdone,ends);
          thread217597(tdone,ends);
          thread217598(tdone,ends);
          thread217599(tdone,ends);
          thread217600(tdone,ends);
          thread217601(tdone,ends);
          thread217602(tdone,ends);
          thread217603(tdone,ends);
          thread217604(tdone,ends);
          thread217605(tdone,ends);
          int biggest217606 = 0;
          if(ends[23]>=biggest217606){
            biggest217606=ends[23];
          }
          if(ends[24]>=biggest217606){
            biggest217606=ends[24];
          }
          if(ends[25]>=biggest217606){
            biggest217606=ends[25];
          }
          if(ends[26]>=biggest217606){
            biggest217606=ends[26];
          }
          if(ends[27]>=biggest217606){
            biggest217606=ends[27];
          }
          if(ends[28]>=biggest217606){
            biggest217606=ends[28];
          }
          if(ends[29]>=biggest217606){
            biggest217606=ends[29];
          }
          if(ends[30]>=biggest217606){
            biggest217606=ends[30];
          }
          if(ends[31]>=biggest217606){
            biggest217606=ends[31];
          }
          if(ends[32]>=biggest217606){
            biggest217606=ends[32];
          }
          if(ends[33]>=biggest217606){
            biggest217606=ends[33];
          }
          if(ends[34]>=biggest217606){
            biggest217606=ends[34];
          }
          if(ends[35]>=biggest217606){
            biggest217606=ends[35];
          }
          if(ends[36]>=biggest217606){
            biggest217606=ends[36];
          }
          if(ends[37]>=biggest217606){
            biggest217606=ends[37];
          }
          if(ends[38]>=biggest217606){
            biggest217606=ends[38];
          }
          if(ends[39]>=biggest217606){
            biggest217606=ends[39];
          }
          if(ends[40]>=biggest217606){
            biggest217606=ends[40];
          }
          if(ends[41]>=biggest217606){
            biggest217606=ends[41];
          }
          if(ends[42]>=biggest217606){
            biggest217606=ends[42];
          }
          if(ends[43]>=biggest217606){
            biggest217606=ends[43];
          }
          if(ends[44]>=biggest217606){
            biggest217606=ends[44];
          }
          if(ends[45]>=biggest217606){
            biggest217606=ends[45];
          }
          if(ends[46]>=biggest217606){
            biggest217606=ends[46];
          }
          if(ends[47]>=biggest217606){
            biggest217606=ends[47];
          }
          if(ends[48]>=biggest217606){
            biggest217606=ends[48];
          }
          if(ends[49]>=biggest217606){
            biggest217606=ends[49];
          }
          if(ends[50]>=biggest217606){
            biggest217606=ends[50];
          }
          if(biggest217606 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
        
        case 2 : 
          thread217607(tdone,ends);
          thread217608(tdone,ends);
          thread217609(tdone,ends);
          thread217610(tdone,ends);
          thread217611(tdone,ends);
          thread217612(tdone,ends);
          thread217613(tdone,ends);
          thread217614(tdone,ends);
          thread217615(tdone,ends);
          thread217616(tdone,ends);
          thread217617(tdone,ends);
          thread217618(tdone,ends);
          thread217619(tdone,ends);
          thread217620(tdone,ends);
          thread217621(tdone,ends);
          thread217622(tdone,ends);
          thread217623(tdone,ends);
          thread217624(tdone,ends);
          thread217625(tdone,ends);
          thread217626(tdone,ends);
          thread217627(tdone,ends);
          thread217628(tdone,ends);
          thread217629(tdone,ends);
          thread217630(tdone,ends);
          thread217631(tdone,ends);
          thread217632(tdone,ends);
          thread217633(tdone,ends);
          thread217634(tdone,ends);
          int biggest217635 = 0;
          if(ends[23]>=biggest217635){
            biggest217635=ends[23];
          }
          if(ends[24]>=biggest217635){
            biggest217635=ends[24];
          }
          if(ends[25]>=biggest217635){
            biggest217635=ends[25];
          }
          if(ends[26]>=biggest217635){
            biggest217635=ends[26];
          }
          if(ends[27]>=biggest217635){
            biggest217635=ends[27];
          }
          if(ends[28]>=biggest217635){
            biggest217635=ends[28];
          }
          if(ends[29]>=biggest217635){
            biggest217635=ends[29];
          }
          if(ends[30]>=biggest217635){
            biggest217635=ends[30];
          }
          if(ends[31]>=biggest217635){
            biggest217635=ends[31];
          }
          if(ends[32]>=biggest217635){
            biggest217635=ends[32];
          }
          if(ends[33]>=biggest217635){
            biggest217635=ends[33];
          }
          if(ends[34]>=biggest217635){
            biggest217635=ends[34];
          }
          if(ends[35]>=biggest217635){
            biggest217635=ends[35];
          }
          if(ends[36]>=biggest217635){
            biggest217635=ends[36];
          }
          if(ends[37]>=biggest217635){
            biggest217635=ends[37];
          }
          if(ends[38]>=biggest217635){
            biggest217635=ends[38];
          }
          if(ends[39]>=biggest217635){
            biggest217635=ends[39];
          }
          if(ends[40]>=biggest217635){
            biggest217635=ends[40];
          }
          if(ends[41]>=biggest217635){
            biggest217635=ends[41];
          }
          if(ends[42]>=biggest217635){
            biggest217635=ends[42];
          }
          if(ends[43]>=biggest217635){
            biggest217635=ends[43];
          }
          if(ends[44]>=biggest217635){
            biggest217635=ends[44];
          }
          if(ends[45]>=biggest217635){
            biggest217635=ends[45];
          }
          if(ends[46]>=biggest217635){
            biggest217635=ends[46];
          }
          if(ends[47]>=biggest217635){
            biggest217635=ends[47];
          }
          if(ends[48]>=biggest217635){
            biggest217635=ends[48];
          }
          if(ends[49]>=biggest217635){
            biggest217635=ends[49];
          }
          if(ends[50]>=biggest217635){
            biggest217635=ends[50];
          }
          if(biggest217635 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
          }
          //FINXME code
          if(biggest217635 == 0){
            S217482=0;
            active[22]=0;
            ends[22]=0;
            S217482=0;
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

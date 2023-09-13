import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import run.ECS_GUI;//sysj\ECS_plant.sysj line: 1, column: 1

public class ECS_HVAC_Plant extends ClockDomain{
  public ECS_HVAC_Plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal zoneOneSevenFanONOFF = new Signal("zoneOneSevenFanONOFF", Signal.INPUT);
  public Signal zoneOneSevenHeaterONOFF = new Signal("zoneOneSevenHeaterONOFF", Signal.INPUT);
  public Signal zoneTwoThreeFanONOFF = new Signal("zoneTwoThreeFanONOFF", Signal.INPUT);
  public Signal zoneTwoThreeHeaterONOFF = new Signal("zoneTwoThreeHeaterONOFF", Signal.INPUT);
  public Signal zoneFourFiveSixACONOFF = new Signal("zoneFourFiveSixACONOFF", Signal.INPUT);
  public Signal zoneOneSevenAtTempHumid = new Signal("zoneOneSevenAtTempHumid", Signal.OUTPUT);
  public Signal zoneTwoThreeAtTempHumid = new Signal("zoneTwoThreeAtTempHumid", Signal.OUTPUT);
  public Signal zoneFourFiveSixAtTempHumid = new Signal("zoneFourFiveSixAtTempHumid", Signal.OUTPUT);
  public Signal zoneOneSevenFanONOFF_E = new Signal("zoneOneSevenFanONOFF_E", Signal.OUTPUT);
  public Signal zoneOneSevenHeaterONOFF_E = new Signal("zoneOneSevenHeaterONOFF_E", Signal.OUTPUT);
  public Signal zoneTwoThreeFanONOFF_E = new Signal("zoneTwoThreeFanONOFF_E", Signal.OUTPUT);
  public Signal zoneTwoThreeHeaterONOFF_E = new Signal("zoneTwoThreeHeaterONOFF_E", Signal.OUTPUT);
  public Signal zoneFourFiveSixACONOFF_E = new Signal("zoneFourFiveSixACONOFF_E", Signal.OUTPUT);
  private long __start_thread_2;//sysj\ECS_plant.sysj line: 16, column: 4
  private long __start_thread_3;//sysj\ECS_plant.sysj line: 29, column: 4
  private long __start_thread_4;//sysj\ECS_plant.sysj line: 42, column: 4
  private long __start_thread_5;//sysj\ECS_plant.sysj line: 55, column: 4
  private long __start_thread_6;//sysj\ECS_plant.sysj line: 63, column: 4
  private int S207358 = 1;
  private int S205638 = 1;
  private int S205488 = 1;
  private int S205490 = 1;
  private int S205790 = 1;
  private int S205640 = 1;
  private int S205942 = 1;
  private int S205792 = 1;
  private int S206094 = 1;
  private int S205944 = 1;
  private int S206246 = 1;
  private int S206096 = 1;
  private int S206281 = 1;
  private int S206257 = 1;
  private int S206251 = 1;
  private int S206254 = 1;
  private int S206316 = 1;
  private int S206292 = 1;
  private int S206286 = 1;
  private int S206289 = 1;
  private int S206351 = 1;
  private int S206327 = 1;
  private int S206321 = 1;
  private int S206324 = 1;
  private int S206386 = 1;
  private int S206362 = 1;
  private int S206356 = 1;
  private int S206359 = 1;
  private int S206421 = 1;
  private int S206397 = 1;
  private int S206391 = 1;
  private int S206394 = 1;
  
  private int[] ends = new int[54];
  private int[] tdone = new int[54];
  
  public void thread207761(int [] tdone, int [] ends){
        S206394=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread207760(int [] tdone, int [] ends){
        S206391=1;
    zoneFourFiveSixACONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 109, column: 13
    currsigs.addElement(zoneFourFiveSixACONOFF_E);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread207758(int [] tdone, int [] ends){
        switch(S206394){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS_plant.sysj line: 111, column: 19
          ends[21]=2;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread207757(int [] tdone, int [] ends){
        switch(S206391){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        zoneFourFiveSixACONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 109, column: 13
        currsigs.addElement(zoneFourFiveSixACONOFF_E);
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
        break;
      
    }
  }

  public void thread207756(int [] tdone, int [] ends){
        switch(S206421){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S206397){
          case 0 : 
            thread207757(tdone,ends);
            thread207758(tdone,ends);
            int biggest207759 = 0;
            if(ends[20]>=biggest207759){
              biggest207759=ends[20];
            }
            if(ends[21]>=biggest207759){
              biggest207759=ends[21];
            }
            if(biggest207759 == 1){
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            if(biggest207759 == 2){
              ends[19]=2;
              ;//sysj\ECS_plant.sysj line: 108, column: 8
              S206397=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            //FINXME code
            if(biggest207759 == 0){
              S206397=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            S206397=1;
            S206397=0;
            if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 107, column: 26
              thread207760(tdone,ends);
              thread207761(tdone,ends);
              int biggest207762 = 0;
              if(ends[20]>=biggest207762){
                biggest207762=ends[20];
              }
              if(ends[21]>=biggest207762){
                biggest207762=ends[21];
              }
              if(biggest207762 == 1){
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            else {
              S206397=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207754(int [] tdone, int [] ends){
        S206359=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread207753(int [] tdone, int [] ends){
        S206356=1;
    zoneTwoThreeHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 100, column: 13
    currsigs.addElement(zoneTwoThreeHeaterONOFF_E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread207751(int [] tdone, int [] ends){
        switch(S206359){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS_plant.sysj line: 102, column: 19
          ends[18]=2;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread207750(int [] tdone, int [] ends){
        switch(S206356){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        zoneTwoThreeHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 100, column: 13
        currsigs.addElement(zoneTwoThreeHeaterONOFF_E);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread207749(int [] tdone, int [] ends){
        switch(S206386){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S206362){
          case 0 : 
            thread207750(tdone,ends);
            thread207751(tdone,ends);
            int biggest207752 = 0;
            if(ends[17]>=biggest207752){
              biggest207752=ends[17];
            }
            if(ends[18]>=biggest207752){
              biggest207752=ends[18];
            }
            if(biggest207752 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            if(biggest207752 == 2){
              ends[16]=2;
              ;//sysj\ECS_plant.sysj line: 99, column: 8
              S206362=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest207752 == 0){
              S206362=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            S206362=1;
            S206362=0;
            if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 98, column: 26
              thread207753(tdone,ends);
              thread207754(tdone,ends);
              int biggest207755 = 0;
              if(ends[17]>=biggest207755){
                biggest207755=ends[17];
              }
              if(ends[18]>=biggest207755){
                biggest207755=ends[18];
              }
              if(biggest207755 == 1){
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
            }
            else {
              S206362=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207747(int [] tdone, int [] ends){
        S206324=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread207746(int [] tdone, int [] ends){
        S206321=1;
    zoneTwoThreeFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 91, column: 13
    currsigs.addElement(zoneTwoThreeFanONOFF_E);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread207744(int [] tdone, int [] ends){
        switch(S206324){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS_plant.sysj line: 93, column: 19
          ends[15]=2;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread207743(int [] tdone, int [] ends){
        switch(S206321){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        zoneTwoThreeFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 91, column: 13
        currsigs.addElement(zoneTwoThreeFanONOFF_E);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread207742(int [] tdone, int [] ends){
        switch(S206351){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S206327){
          case 0 : 
            thread207743(tdone,ends);
            thread207744(tdone,ends);
            int biggest207745 = 0;
            if(ends[14]>=biggest207745){
              biggest207745=ends[14];
            }
            if(ends[15]>=biggest207745){
              biggest207745=ends[15];
            }
            if(biggest207745 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            if(biggest207745 == 2){
              ends[13]=2;
              ;//sysj\ECS_plant.sysj line: 90, column: 8
              S206327=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            //FINXME code
            if(biggest207745 == 0){
              S206327=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S206327=1;
            S206327=0;
            if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 89, column: 26
              thread207746(tdone,ends);
              thread207747(tdone,ends);
              int biggest207748 = 0;
              if(ends[14]>=biggest207748){
                biggest207748=ends[14];
              }
              if(ends[15]>=biggest207748){
                biggest207748=ends[15];
              }
              if(biggest207748 == 1){
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            else {
              S206327=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207740(int [] tdone, int [] ends){
        S206289=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread207739(int [] tdone, int [] ends){
        S206286=1;
    zoneOneSevenHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 82, column: 13
    currsigs.addElement(zoneOneSevenHeaterONOFF_E);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread207737(int [] tdone, int [] ends){
        switch(S206289){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS_plant.sysj line: 84, column: 19
          ends[12]=2;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread207736(int [] tdone, int [] ends){
        switch(S206286){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        zoneOneSevenHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 82, column: 13
        currsigs.addElement(zoneOneSevenHeaterONOFF_E);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread207735(int [] tdone, int [] ends){
        switch(S206316){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S206292){
          case 0 : 
            thread207736(tdone,ends);
            thread207737(tdone,ends);
            int biggest207738 = 0;
            if(ends[11]>=biggest207738){
              biggest207738=ends[11];
            }
            if(ends[12]>=biggest207738){
              biggest207738=ends[12];
            }
            if(biggest207738 == 1){
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            if(biggest207738 == 2){
              ends[10]=2;
              ;//sysj\ECS_plant.sysj line: 81, column: 8
              S206292=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            //FINXME code
            if(biggest207738 == 0){
              S206292=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S206292=1;
            S206292=0;
            if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 80, column: 26
              thread207739(tdone,ends);
              thread207740(tdone,ends);
              int biggest207741 = 0;
              if(ends[11]>=biggest207741){
                biggest207741=ends[11];
              }
              if(ends[12]>=biggest207741){
                biggest207741=ends[12];
              }
              if(biggest207741 == 1){
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              S206292=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207733(int [] tdone, int [] ends){
        S206254=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread207732(int [] tdone, int [] ends){
        S206251=1;
    zoneOneSevenFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 73, column: 13
    currsigs.addElement(zoneOneSevenFanONOFF_E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread207730(int [] tdone, int [] ends){
        switch(S206254){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS_plant.sysj line: 75, column: 19
          ends[9]=2;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread207729(int [] tdone, int [] ends){
        switch(S206251){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        zoneOneSevenFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 73, column: 13
        currsigs.addElement(zoneOneSevenFanONOFF_E);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread207728(int [] tdone, int [] ends){
        switch(S206281){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S206257){
          case 0 : 
            thread207729(tdone,ends);
            thread207730(tdone,ends);
            int biggest207731 = 0;
            if(ends[8]>=biggest207731){
              biggest207731=ends[8];
            }
            if(ends[9]>=biggest207731){
              biggest207731=ends[9];
            }
            if(biggest207731 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest207731 == 2){
              ends[7]=2;
              ;//sysj\ECS_plant.sysj line: 72, column: 8
              S206257=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest207731 == 0){
              S206257=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S206257=1;
            S206257=0;
            if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 71, column: 26
              thread207732(tdone,ends);
              thread207733(tdone,ends);
              int biggest207734 = 0;
              if(ends[8]>=biggest207734){
                biggest207734=ends[8];
              }
              if(ends[9]>=biggest207734){
                biggest207734=ends[9];
              }
              if(biggest207734 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              S206257=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207727(int [] tdone, int [] ends){
        switch(S206246){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S206096){
          case 0 : 
            if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 65, column: 13
              System.out.println("Zone(4,5,6) AC - On");//sysj\ECS_plant.sysj line: 66, column: 7
              S206096=1;
              __start_thread_6 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 63, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_6 >= (2) * 1000){//sysj\ECS_plant.sysj line: 63, column: 4
                ends[6]=2;
                ;//sysj\ECS_plant.sysj line: 63, column: 4
                zoneFourFiveSixAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 66, column: 60
                currsigs.addElement(zoneFourFiveSixAtTempHumid);
                S206096=0;
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
              else {
                active[6]=1;
                ends[6]=1;
                tdone[6]=1;
              }
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (2) * 1000){//sysj\ECS_plant.sysj line: 63, column: 4
              ends[6]=2;
              ;//sysj\ECS_plant.sysj line: 63, column: 4
              zoneFourFiveSixAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 66, column: 60
              currsigs.addElement(zoneFourFiveSixAtTempHumid);
              S206096=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207726(int [] tdone, int [] ends){
        switch(S206094){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S205944){
          case 0 : 
            if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 57, column: 13
              System.out.println("Zone(2,3) Heater - On");//sysj\ECS_plant.sysj line: 58, column: 7
              S205944=1;
              __start_thread_5 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 55, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_5 >= (2) * 1000){//sysj\ECS_plant.sysj line: 55, column: 4
                ends[5]=2;
                ;//sysj\ECS_plant.sysj line: 55, column: 4
                zoneTwoThreeAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 58, column: 62
                currsigs.addElement(zoneTwoThreeAtTempHumid);
                S205944=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_5 >= (2) * 1000){//sysj\ECS_plant.sysj line: 55, column: 4
              ends[5]=2;
              ;//sysj\ECS_plant.sysj line: 55, column: 4
              zoneTwoThreeAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 58, column: 62
              currsigs.addElement(zoneTwoThreeAtTempHumid);
              S205944=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207725(int [] tdone, int [] ends){
        switch(S205942){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S205792){
          case 0 : 
            if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 45, column: 13
              System.out.println("Zone(2,3) Fan - On");//sysj\ECS_plant.sysj line: 47, column: 7
              S205792=1;
              __start_thread_4 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 42, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_4 >= (2) * 1000){//sysj\ECS_plant.sysj line: 42, column: 4
                ends[4]=2;
                ;//sysj\ECS_plant.sysj line: 42, column: 4
                zoneTwoThreeAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 49, column: 7
                currsigs.addElement(zoneTwoThreeAtTempHumid);
                S205792=0;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_4 >= (2) * 1000){//sysj\ECS_plant.sysj line: 42, column: 4
              ends[4]=2;
              ;//sysj\ECS_plant.sysj line: 42, column: 4
              zoneTwoThreeAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 49, column: 7
              currsigs.addElement(zoneTwoThreeAtTempHumid);
              S205792=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207724(int [] tdone, int [] ends){
        switch(S205790){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S205640){
          case 0 : 
            if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 32, column: 13
              System.out.println("Zone(1,7) Heater - On");//sysj\ECS_plant.sysj line: 34, column: 7
              S205640=1;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 29, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_3 >= (2) * 1000){//sysj\ECS_plant.sysj line: 29, column: 4
                ends[3]=2;
                ;//sysj\ECS_plant.sysj line: 29, column: 4
                zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 36, column: 7
                currsigs.addElement(zoneOneSevenAtTempHumid);
                S205640=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_3 >= (2) * 1000){//sysj\ECS_plant.sysj line: 29, column: 4
              ends[3]=2;
              ;//sysj\ECS_plant.sysj line: 29, column: 4
              zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 36, column: 7
              currsigs.addElement(zoneOneSevenAtTempHumid);
              S205640=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207723(int [] tdone, int [] ends){
        switch(S205638){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S205488){
          case 0 : 
            if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 19, column: 13
              System.out.println("Zone(1,7) Fan - On");//sysj\ECS_plant.sysj line: 21, column: 8
              S205488=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 16, column: 4
              S205490=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                ends[2]=2;
                ;//sysj\ECS_plant.sysj line: 16, column: 4
                zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                currsigs.addElement(zoneOneSevenAtTempHumid);
                S205488=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S205490=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            switch(S205490){
              case 0 : 
                S205490=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                  ends[2]=2;
                  ;//sysj\ECS_plant.sysj line: 16, column: 4
                  zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                  currsigs.addElement(zoneOneSevenAtTempHumid);
                  S205488=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S205490=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S205490=1;
                S205490=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                  ends[2]=2;
                  ;//sysj\ECS_plant.sysj line: 16, column: 4
                  zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                  currsigs.addElement(zoneOneSevenAtTempHumid);
                  S205488=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S205490=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207720(int [] tdone, int [] ends){
        S206394=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread207719(int [] tdone, int [] ends){
        S206391=1;
    zoneFourFiveSixACONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 109, column: 13
    currsigs.addElement(zoneFourFiveSixACONOFF_E);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread207718(int [] tdone, int [] ends){
        S206421=1;
    S206397=0;
    if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 107, column: 26
      thread207719(tdone,ends);
      thread207720(tdone,ends);
      int biggest207721 = 0;
      if(ends[20]>=biggest207721){
        biggest207721=ends[20];
      }
      if(ends[21]>=biggest207721){
        biggest207721=ends[21];
      }
      if(biggest207721 == 1){
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
    else {
      S206397=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread207716(int [] tdone, int [] ends){
        S206359=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread207715(int [] tdone, int [] ends){
        S206356=1;
    zoneTwoThreeHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 100, column: 13
    currsigs.addElement(zoneTwoThreeHeaterONOFF_E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread207714(int [] tdone, int [] ends){
        S206386=1;
    S206362=0;
    if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 98, column: 26
      thread207715(tdone,ends);
      thread207716(tdone,ends);
      int biggest207717 = 0;
      if(ends[17]>=biggest207717){
        biggest207717=ends[17];
      }
      if(ends[18]>=biggest207717){
        biggest207717=ends[18];
      }
      if(biggest207717 == 1){
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
    }
    else {
      S206362=1;
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread207712(int [] tdone, int [] ends){
        S206324=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread207711(int [] tdone, int [] ends){
        S206321=1;
    zoneTwoThreeFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 91, column: 13
    currsigs.addElement(zoneTwoThreeFanONOFF_E);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread207710(int [] tdone, int [] ends){
        S206351=1;
    S206327=0;
    if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 89, column: 26
      thread207711(tdone,ends);
      thread207712(tdone,ends);
      int biggest207713 = 0;
      if(ends[14]>=biggest207713){
        biggest207713=ends[14];
      }
      if(ends[15]>=biggest207713){
        biggest207713=ends[15];
      }
      if(biggest207713 == 1){
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
    }
    else {
      S206327=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread207708(int [] tdone, int [] ends){
        S206289=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread207707(int [] tdone, int [] ends){
        S206286=1;
    zoneOneSevenHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 82, column: 13
    currsigs.addElement(zoneOneSevenHeaterONOFF_E);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread207706(int [] tdone, int [] ends){
        S206316=1;
    S206292=0;
    if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 80, column: 26
      thread207707(tdone,ends);
      thread207708(tdone,ends);
      int biggest207709 = 0;
      if(ends[11]>=biggest207709){
        biggest207709=ends[11];
      }
      if(ends[12]>=biggest207709){
        biggest207709=ends[12];
      }
      if(biggest207709 == 1){
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
    else {
      S206292=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread207704(int [] tdone, int [] ends){
        S206254=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread207703(int [] tdone, int [] ends){
        S206251=1;
    zoneOneSevenFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 73, column: 13
    currsigs.addElement(zoneOneSevenFanONOFF_E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread207702(int [] tdone, int [] ends){
        S206281=1;
    S206257=0;
    if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 71, column: 26
      thread207703(tdone,ends);
      thread207704(tdone,ends);
      int biggest207705 = 0;
      if(ends[8]>=biggest207705){
        biggest207705=ends[8];
      }
      if(ends[9]>=biggest207705){
        biggest207705=ends[9];
      }
      if(biggest207705 == 1){
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
    }
    else {
      S206257=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread207701(int [] tdone, int [] ends){
        S206246=1;
    S206096=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread207700(int [] tdone, int [] ends){
        S206094=1;
    S205944=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread207699(int [] tdone, int [] ends){
        S205942=1;
    S205792=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread207698(int [] tdone, int [] ends){
        S205790=1;
    S205640=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread207697(int [] tdone, int [] ends){
        S205638=1;
    S205488=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S207358){
        case 0 : 
          S207358=0;
          break RUN;
        
        case 1 : 
          S207358=2;
          S207358=2;
          new Thread(new ECS_GUI()).start();//sysj\ECS_plant.sysj line: 14, column: 4
          thread207697(tdone,ends);
          thread207698(tdone,ends);
          thread207699(tdone,ends);
          thread207700(tdone,ends);
          thread207701(tdone,ends);
          thread207702(tdone,ends);
          thread207706(tdone,ends);
          thread207710(tdone,ends);
          thread207714(tdone,ends);
          thread207718(tdone,ends);
          int biggest207722 = 0;
          if(ends[2]>=biggest207722){
            biggest207722=ends[2];
          }
          if(ends[3]>=biggest207722){
            biggest207722=ends[3];
          }
          if(ends[4]>=biggest207722){
            biggest207722=ends[4];
          }
          if(ends[5]>=biggest207722){
            biggest207722=ends[5];
          }
          if(ends[6]>=biggest207722){
            biggest207722=ends[6];
          }
          if(ends[7]>=biggest207722){
            biggest207722=ends[7];
          }
          if(ends[10]>=biggest207722){
            biggest207722=ends[10];
          }
          if(ends[13]>=biggest207722){
            biggest207722=ends[13];
          }
          if(ends[16]>=biggest207722){
            biggest207722=ends[16];
          }
          if(ends[19]>=biggest207722){
            biggest207722=ends[19];
          }
          if(biggest207722 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread207723(tdone,ends);
          thread207724(tdone,ends);
          thread207725(tdone,ends);
          thread207726(tdone,ends);
          thread207727(tdone,ends);
          thread207728(tdone,ends);
          thread207735(tdone,ends);
          thread207742(tdone,ends);
          thread207749(tdone,ends);
          thread207756(tdone,ends);
          int biggest207763 = 0;
          if(ends[2]>=biggest207763){
            biggest207763=ends[2];
          }
          if(ends[3]>=biggest207763){
            biggest207763=ends[3];
          }
          if(ends[4]>=biggest207763){
            biggest207763=ends[4];
          }
          if(ends[5]>=biggest207763){
            biggest207763=ends[5];
          }
          if(ends[6]>=biggest207763){
            biggest207763=ends[6];
          }
          if(ends[7]>=biggest207763){
            biggest207763=ends[7];
          }
          if(ends[10]>=biggest207763){
            biggest207763=ends[10];
          }
          if(ends[13]>=biggest207763){
            biggest207763=ends[13];
          }
          if(ends[16]>=biggest207763){
            biggest207763=ends[16];
          }
          if(ends[19]>=biggest207763){
            biggest207763=ends[19];
          }
          if(biggest207763 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest207763 == 0){
            S207358=0;
            active[1]=0;
            ends[1]=0;
            S207358=0;
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
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          zoneOneSevenFanONOFF.gethook();
          zoneOneSevenHeaterONOFF.gethook();
          zoneTwoThreeFanONOFF.gethook();
          zoneTwoThreeHeaterONOFF.gethook();
          zoneFourFiveSixACONOFF.gethook();
          df = true;
        }
        runClockDomain();
      }
      zoneOneSevenFanONOFF.setpreclear();
      zoneOneSevenHeaterONOFF.setpreclear();
      zoneTwoThreeFanONOFF.setpreclear();
      zoneTwoThreeHeaterONOFF.setpreclear();
      zoneFourFiveSixACONOFF.setpreclear();
      zoneOneSevenAtTempHumid.setpreclear();
      zoneTwoThreeAtTempHumid.setpreclear();
      zoneFourFiveSixAtTempHumid.setpreclear();
      zoneOneSevenFanONOFF_E.setpreclear();
      zoneOneSevenHeaterONOFF_E.setpreclear();
      zoneTwoThreeFanONOFF_E.setpreclear();
      zoneTwoThreeHeaterONOFF_E.setpreclear();
      zoneFourFiveSixACONOFF_E.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = zoneOneSevenFanONOFF.getStatus() ? zoneOneSevenFanONOFF.setprepresent() : zoneOneSevenFanONOFF.setpreclear();
      zoneOneSevenFanONOFF.setpreval(zoneOneSevenFanONOFF.getValue());
      zoneOneSevenFanONOFF.setClear();
      dummyint = zoneOneSevenHeaterONOFF.getStatus() ? zoneOneSevenHeaterONOFF.setprepresent() : zoneOneSevenHeaterONOFF.setpreclear();
      zoneOneSevenHeaterONOFF.setpreval(zoneOneSevenHeaterONOFF.getValue());
      zoneOneSevenHeaterONOFF.setClear();
      dummyint = zoneTwoThreeFanONOFF.getStatus() ? zoneTwoThreeFanONOFF.setprepresent() : zoneTwoThreeFanONOFF.setpreclear();
      zoneTwoThreeFanONOFF.setpreval(zoneTwoThreeFanONOFF.getValue());
      zoneTwoThreeFanONOFF.setClear();
      dummyint = zoneTwoThreeHeaterONOFF.getStatus() ? zoneTwoThreeHeaterONOFF.setprepresent() : zoneTwoThreeHeaterONOFF.setpreclear();
      zoneTwoThreeHeaterONOFF.setpreval(zoneTwoThreeHeaterONOFF.getValue());
      zoneTwoThreeHeaterONOFF.setClear();
      dummyint = zoneFourFiveSixACONOFF.getStatus() ? zoneFourFiveSixACONOFF.setprepresent() : zoneFourFiveSixACONOFF.setpreclear();
      zoneFourFiveSixACONOFF.setpreval(zoneFourFiveSixACONOFF.getValue());
      zoneFourFiveSixACONOFF.setClear();
      zoneOneSevenAtTempHumid.sethook();
      zoneOneSevenAtTempHumid.setClear();
      zoneTwoThreeAtTempHumid.sethook();
      zoneTwoThreeAtTempHumid.setClear();
      zoneFourFiveSixAtTempHumid.sethook();
      zoneFourFiveSixAtTempHumid.setClear();
      zoneOneSevenFanONOFF_E.sethook();
      zoneOneSevenFanONOFF_E.setClear();
      zoneOneSevenHeaterONOFF_E.sethook();
      zoneOneSevenHeaterONOFF_E.setClear();
      zoneTwoThreeFanONOFF_E.sethook();
      zoneTwoThreeFanONOFF_E.setClear();
      zoneTwoThreeHeaterONOFF_E.sethook();
      zoneTwoThreeHeaterONOFF_E.setClear();
      zoneFourFiveSixACONOFF_E.sethook();
      zoneFourFiveSixACONOFF_E.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        zoneOneSevenFanONOFF.gethook();
        zoneOneSevenHeaterONOFF.gethook();
        zoneTwoThreeFanONOFF.gethook();
        zoneTwoThreeHeaterONOFF.gethook();
        zoneFourFiveSixACONOFF.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

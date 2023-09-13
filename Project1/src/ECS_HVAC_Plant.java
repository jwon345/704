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
  private int S206991 = 1;
  private int S205271 = 1;
  private int S205121 = 1;
  private int S205123 = 1;
  private int S205423 = 1;
  private int S205273 = 1;
  private int S205575 = 1;
  private int S205425 = 1;
  private int S205727 = 1;
  private int S205577 = 1;
  private int S205879 = 1;
  private int S205729 = 1;
  private int S205914 = 1;
  private int S205890 = 1;
  private int S205884 = 1;
  private int S205887 = 1;
  private int S205949 = 1;
  private int S205925 = 1;
  private int S205919 = 1;
  private int S205922 = 1;
  private int S205984 = 1;
  private int S205960 = 1;
  private int S205954 = 1;
  private int S205957 = 1;
  private int S206019 = 1;
  private int S205995 = 1;
  private int S205989 = 1;
  private int S205992 = 1;
  private int S206054 = 1;
  private int S206030 = 1;
  private int S206024 = 1;
  private int S206027 = 1;
  
  private int[] ends = new int[54];
  private int[] tdone = new int[54];
  
  public void thread207388(int [] tdone, int [] ends){
        S206027=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread207387(int [] tdone, int [] ends){
        S206024=1;
    zoneFourFiveSixACONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 109, column: 13
    currsigs.addElement(zoneFourFiveSixACONOFF_E);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread207385(int [] tdone, int [] ends){
        switch(S206027){
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

  public void thread207384(int [] tdone, int [] ends){
        switch(S206024){
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

  public void thread207383(int [] tdone, int [] ends){
        switch(S206054){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S206030){
          case 0 : 
            thread207384(tdone,ends);
            thread207385(tdone,ends);
            int biggest207386 = 0;
            if(ends[20]>=biggest207386){
              biggest207386=ends[20];
            }
            if(ends[21]>=biggest207386){
              biggest207386=ends[21];
            }
            if(biggest207386 == 1){
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            if(biggest207386 == 2){
              ends[19]=2;
              ;//sysj\ECS_plant.sysj line: 108, column: 8
              S206030=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            //FINXME code
            if(biggest207386 == 0){
              S206030=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            S206030=1;
            S206030=0;
            if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 107, column: 26
              thread207387(tdone,ends);
              thread207388(tdone,ends);
              int biggest207389 = 0;
              if(ends[20]>=biggest207389){
                biggest207389=ends[20];
              }
              if(ends[21]>=biggest207389){
                biggest207389=ends[21];
              }
              if(biggest207389 == 1){
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            else {
              S206030=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207381(int [] tdone, int [] ends){
        S205992=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread207380(int [] tdone, int [] ends){
        S205989=1;
    zoneTwoThreeHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 100, column: 13
    currsigs.addElement(zoneTwoThreeHeaterONOFF_E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread207378(int [] tdone, int [] ends){
        switch(S205992){
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

  public void thread207377(int [] tdone, int [] ends){
        switch(S205989){
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

  public void thread207376(int [] tdone, int [] ends){
        switch(S206019){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S205995){
          case 0 : 
            thread207377(tdone,ends);
            thread207378(tdone,ends);
            int biggest207379 = 0;
            if(ends[17]>=biggest207379){
              biggest207379=ends[17];
            }
            if(ends[18]>=biggest207379){
              biggest207379=ends[18];
            }
            if(biggest207379 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            if(biggest207379 == 2){
              ends[16]=2;
              ;//sysj\ECS_plant.sysj line: 99, column: 8
              S205995=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest207379 == 0){
              S205995=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            S205995=1;
            S205995=0;
            if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 98, column: 26
              thread207380(tdone,ends);
              thread207381(tdone,ends);
              int biggest207382 = 0;
              if(ends[17]>=biggest207382){
                biggest207382=ends[17];
              }
              if(ends[18]>=biggest207382){
                biggest207382=ends[18];
              }
              if(biggest207382 == 1){
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
            }
            else {
              S205995=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207374(int [] tdone, int [] ends){
        S205957=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread207373(int [] tdone, int [] ends){
        S205954=1;
    zoneTwoThreeFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 91, column: 13
    currsigs.addElement(zoneTwoThreeFanONOFF_E);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread207371(int [] tdone, int [] ends){
        switch(S205957){
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

  public void thread207370(int [] tdone, int [] ends){
        switch(S205954){
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

  public void thread207369(int [] tdone, int [] ends){
        switch(S205984){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S205960){
          case 0 : 
            thread207370(tdone,ends);
            thread207371(tdone,ends);
            int biggest207372 = 0;
            if(ends[14]>=biggest207372){
              biggest207372=ends[14];
            }
            if(ends[15]>=biggest207372){
              biggest207372=ends[15];
            }
            if(biggest207372 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            if(biggest207372 == 2){
              ends[13]=2;
              ;//sysj\ECS_plant.sysj line: 90, column: 8
              S205960=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            //FINXME code
            if(biggest207372 == 0){
              S205960=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S205960=1;
            S205960=0;
            if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 89, column: 26
              thread207373(tdone,ends);
              thread207374(tdone,ends);
              int biggest207375 = 0;
              if(ends[14]>=biggest207375){
                biggest207375=ends[14];
              }
              if(ends[15]>=biggest207375){
                biggest207375=ends[15];
              }
              if(biggest207375 == 1){
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            else {
              S205960=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207367(int [] tdone, int [] ends){
        S205922=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread207366(int [] tdone, int [] ends){
        S205919=1;
    zoneOneSevenHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 82, column: 13
    currsigs.addElement(zoneOneSevenHeaterONOFF_E);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread207364(int [] tdone, int [] ends){
        switch(S205922){
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

  public void thread207363(int [] tdone, int [] ends){
        switch(S205919){
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

  public void thread207362(int [] tdone, int [] ends){
        switch(S205949){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S205925){
          case 0 : 
            thread207363(tdone,ends);
            thread207364(tdone,ends);
            int biggest207365 = 0;
            if(ends[11]>=biggest207365){
              biggest207365=ends[11];
            }
            if(ends[12]>=biggest207365){
              biggest207365=ends[12];
            }
            if(biggest207365 == 1){
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            if(biggest207365 == 2){
              ends[10]=2;
              ;//sysj\ECS_plant.sysj line: 81, column: 8
              S205925=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            //FINXME code
            if(biggest207365 == 0){
              S205925=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S205925=1;
            S205925=0;
            if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 80, column: 26
              thread207366(tdone,ends);
              thread207367(tdone,ends);
              int biggest207368 = 0;
              if(ends[11]>=biggest207368){
                biggest207368=ends[11];
              }
              if(ends[12]>=biggest207368){
                biggest207368=ends[12];
              }
              if(biggest207368 == 1){
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              S205925=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207360(int [] tdone, int [] ends){
        S205887=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread207359(int [] tdone, int [] ends){
        S205884=1;
    zoneOneSevenFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 73, column: 13
    currsigs.addElement(zoneOneSevenFanONOFF_E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread207357(int [] tdone, int [] ends){
        switch(S205887){
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

  public void thread207356(int [] tdone, int [] ends){
        switch(S205884){
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

  public void thread207355(int [] tdone, int [] ends){
        switch(S205914){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S205890){
          case 0 : 
            thread207356(tdone,ends);
            thread207357(tdone,ends);
            int biggest207358 = 0;
            if(ends[8]>=biggest207358){
              biggest207358=ends[8];
            }
            if(ends[9]>=biggest207358){
              biggest207358=ends[9];
            }
            if(biggest207358 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest207358 == 2){
              ends[7]=2;
              ;//sysj\ECS_plant.sysj line: 72, column: 8
              S205890=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest207358 == 0){
              S205890=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S205890=1;
            S205890=0;
            if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 71, column: 26
              thread207359(tdone,ends);
              thread207360(tdone,ends);
              int biggest207361 = 0;
              if(ends[8]>=biggest207361){
                biggest207361=ends[8];
              }
              if(ends[9]>=biggest207361){
                biggest207361=ends[9];
              }
              if(biggest207361 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              S205890=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207354(int [] tdone, int [] ends){
        switch(S205879){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S205729){
          case 0 : 
            if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 65, column: 13
              System.out.println("Zone(4,5,6) AC - On");//sysj\ECS_plant.sysj line: 66, column: 7
              S205729=1;
              __start_thread_6 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 63, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_6 >= (2) * 1000){//sysj\ECS_plant.sysj line: 63, column: 4
                ends[6]=2;
                ;//sysj\ECS_plant.sysj line: 63, column: 4
                zoneFourFiveSixAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 66, column: 60
                currsigs.addElement(zoneFourFiveSixAtTempHumid);
                S205729=0;
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
              S205729=0;
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

  public void thread207353(int [] tdone, int [] ends){
        switch(S205727){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S205577){
          case 0 : 
            if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 57, column: 13
              System.out.println("Zone(2,3) Heater - On");//sysj\ECS_plant.sysj line: 58, column: 7
              S205577=1;
              __start_thread_5 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 55, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_5 >= (2) * 1000){//sysj\ECS_plant.sysj line: 55, column: 4
                ends[5]=2;
                ;//sysj\ECS_plant.sysj line: 55, column: 4
                zoneTwoThreeAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 58, column: 62
                currsigs.addElement(zoneTwoThreeAtTempHumid);
                S205577=0;
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
              S205577=0;
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

  public void thread207352(int [] tdone, int [] ends){
        switch(S205575){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S205425){
          case 0 : 
            if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 45, column: 13
              System.out.println("Zone(2,3) Fan - On");//sysj\ECS_plant.sysj line: 47, column: 7
              S205425=1;
              __start_thread_4 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 42, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_4 >= (2) * 1000){//sysj\ECS_plant.sysj line: 42, column: 4
                ends[4]=2;
                ;//sysj\ECS_plant.sysj line: 42, column: 4
                zoneTwoThreeAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 49, column: 7
                currsigs.addElement(zoneTwoThreeAtTempHumid);
                S205425=0;
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
              S205425=0;
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

  public void thread207351(int [] tdone, int [] ends){
        switch(S205423){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S205273){
          case 0 : 
            if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 32, column: 13
              System.out.println("Zone(1,7) Heater - On");//sysj\ECS_plant.sysj line: 34, column: 7
              S205273=1;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 29, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_3 >= (2) * 1000){//sysj\ECS_plant.sysj line: 29, column: 4
                ends[3]=2;
                ;//sysj\ECS_plant.sysj line: 29, column: 4
                zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 36, column: 7
                currsigs.addElement(zoneOneSevenAtTempHumid);
                S205273=0;
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
              S205273=0;
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

  public void thread207350(int [] tdone, int [] ends){
        switch(S205271){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S205121){
          case 0 : 
            if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 19, column: 13
              System.out.println("Zone(1,7) Fan - On");//sysj\ECS_plant.sysj line: 21, column: 8
              S205121=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 16, column: 4
              S205123=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                ends[2]=2;
                ;//sysj\ECS_plant.sysj line: 16, column: 4
                zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                currsigs.addElement(zoneOneSevenAtTempHumid);
                S205121=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S205123=1;
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
            switch(S205123){
              case 0 : 
                S205123=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                  ends[2]=2;
                  ;//sysj\ECS_plant.sysj line: 16, column: 4
                  zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                  currsigs.addElement(zoneOneSevenAtTempHumid);
                  S205121=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S205123=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S205123=1;
                S205123=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                  ends[2]=2;
                  ;//sysj\ECS_plant.sysj line: 16, column: 4
                  zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                  currsigs.addElement(zoneOneSevenAtTempHumid);
                  S205121=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S205123=1;
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

  public void thread207347(int [] tdone, int [] ends){
        S206027=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread207346(int [] tdone, int [] ends){
        S206024=1;
    zoneFourFiveSixACONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 109, column: 13
    currsigs.addElement(zoneFourFiveSixACONOFF_E);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread207345(int [] tdone, int [] ends){
        S206054=1;
    S206030=0;
    if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 107, column: 26
      thread207346(tdone,ends);
      thread207347(tdone,ends);
      int biggest207348 = 0;
      if(ends[20]>=biggest207348){
        biggest207348=ends[20];
      }
      if(ends[21]>=biggest207348){
        biggest207348=ends[21];
      }
      if(biggest207348 == 1){
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
    else {
      S206030=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread207343(int [] tdone, int [] ends){
        S205992=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread207342(int [] tdone, int [] ends){
        S205989=1;
    zoneTwoThreeHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 100, column: 13
    currsigs.addElement(zoneTwoThreeHeaterONOFF_E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread207341(int [] tdone, int [] ends){
        S206019=1;
    S205995=0;
    if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 98, column: 26
      thread207342(tdone,ends);
      thread207343(tdone,ends);
      int biggest207344 = 0;
      if(ends[17]>=biggest207344){
        biggest207344=ends[17];
      }
      if(ends[18]>=biggest207344){
        biggest207344=ends[18];
      }
      if(biggest207344 == 1){
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
    }
    else {
      S205995=1;
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread207339(int [] tdone, int [] ends){
        S205957=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread207338(int [] tdone, int [] ends){
        S205954=1;
    zoneTwoThreeFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 91, column: 13
    currsigs.addElement(zoneTwoThreeFanONOFF_E);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread207337(int [] tdone, int [] ends){
        S205984=1;
    S205960=0;
    if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 89, column: 26
      thread207338(tdone,ends);
      thread207339(tdone,ends);
      int biggest207340 = 0;
      if(ends[14]>=biggest207340){
        biggest207340=ends[14];
      }
      if(ends[15]>=biggest207340){
        biggest207340=ends[15];
      }
      if(biggest207340 == 1){
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
    }
    else {
      S205960=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread207335(int [] tdone, int [] ends){
        S205922=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread207334(int [] tdone, int [] ends){
        S205919=1;
    zoneOneSevenHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 82, column: 13
    currsigs.addElement(zoneOneSevenHeaterONOFF_E);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread207333(int [] tdone, int [] ends){
        S205949=1;
    S205925=0;
    if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 80, column: 26
      thread207334(tdone,ends);
      thread207335(tdone,ends);
      int biggest207336 = 0;
      if(ends[11]>=biggest207336){
        biggest207336=ends[11];
      }
      if(ends[12]>=biggest207336){
        biggest207336=ends[12];
      }
      if(biggest207336 == 1){
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
    else {
      S205925=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread207331(int [] tdone, int [] ends){
        S205887=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread207330(int [] tdone, int [] ends){
        S205884=1;
    zoneOneSevenFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 73, column: 13
    currsigs.addElement(zoneOneSevenFanONOFF_E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread207329(int [] tdone, int [] ends){
        S205914=1;
    S205890=0;
    if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 71, column: 26
      thread207330(tdone,ends);
      thread207331(tdone,ends);
      int biggest207332 = 0;
      if(ends[8]>=biggest207332){
        biggest207332=ends[8];
      }
      if(ends[9]>=biggest207332){
        biggest207332=ends[9];
      }
      if(biggest207332 == 1){
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
    }
    else {
      S205890=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread207328(int [] tdone, int [] ends){
        S205879=1;
    S205729=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread207327(int [] tdone, int [] ends){
        S205727=1;
    S205577=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread207326(int [] tdone, int [] ends){
        S205575=1;
    S205425=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread207325(int [] tdone, int [] ends){
        S205423=1;
    S205273=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread207324(int [] tdone, int [] ends){
        S205271=1;
    S205121=0;
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
      switch(S206991){
        case 0 : 
          S206991=0;
          break RUN;
        
        case 1 : 
          S206991=2;
          S206991=2;
          new Thread(new ECS_GUI()).start();//sysj\ECS_plant.sysj line: 14, column: 4
          thread207324(tdone,ends);
          thread207325(tdone,ends);
          thread207326(tdone,ends);
          thread207327(tdone,ends);
          thread207328(tdone,ends);
          thread207329(tdone,ends);
          thread207333(tdone,ends);
          thread207337(tdone,ends);
          thread207341(tdone,ends);
          thread207345(tdone,ends);
          int biggest207349 = 0;
          if(ends[2]>=biggest207349){
            biggest207349=ends[2];
          }
          if(ends[3]>=biggest207349){
            biggest207349=ends[3];
          }
          if(ends[4]>=biggest207349){
            biggest207349=ends[4];
          }
          if(ends[5]>=biggest207349){
            biggest207349=ends[5];
          }
          if(ends[6]>=biggest207349){
            biggest207349=ends[6];
          }
          if(ends[7]>=biggest207349){
            biggest207349=ends[7];
          }
          if(ends[10]>=biggest207349){
            biggest207349=ends[10];
          }
          if(ends[13]>=biggest207349){
            biggest207349=ends[13];
          }
          if(ends[16]>=biggest207349){
            biggest207349=ends[16];
          }
          if(ends[19]>=biggest207349){
            biggest207349=ends[19];
          }
          if(biggest207349 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread207350(tdone,ends);
          thread207351(tdone,ends);
          thread207352(tdone,ends);
          thread207353(tdone,ends);
          thread207354(tdone,ends);
          thread207355(tdone,ends);
          thread207362(tdone,ends);
          thread207369(tdone,ends);
          thread207376(tdone,ends);
          thread207383(tdone,ends);
          int biggest207390 = 0;
          if(ends[2]>=biggest207390){
            biggest207390=ends[2];
          }
          if(ends[3]>=biggest207390){
            biggest207390=ends[3];
          }
          if(ends[4]>=biggest207390){
            biggest207390=ends[4];
          }
          if(ends[5]>=biggest207390){
            biggest207390=ends[5];
          }
          if(ends[6]>=biggest207390){
            biggest207390=ends[6];
          }
          if(ends[7]>=biggest207390){
            biggest207390=ends[7];
          }
          if(ends[10]>=biggest207390){
            biggest207390=ends[10];
          }
          if(ends[13]>=biggest207390){
            biggest207390=ends[13];
          }
          if(ends[16]>=biggest207390){
            biggest207390=ends[16];
          }
          if(ends[19]>=biggest207390){
            biggest207390=ends[19];
          }
          if(biggest207390 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest207390 == 0){
            S206991=0;
            active[1]=0;
            ends[1]=0;
            S206991=0;
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

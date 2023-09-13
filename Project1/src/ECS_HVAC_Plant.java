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
  private int S207016 = 1;
  private int S205296 = 1;
  private int S205146 = 1;
  private int S205148 = 1;
  private int S205448 = 1;
  private int S205298 = 1;
  private int S205600 = 1;
  private int S205450 = 1;
  private int S205752 = 1;
  private int S205602 = 1;
  private int S205904 = 1;
  private int S205754 = 1;
  private int S205939 = 1;
  private int S205915 = 1;
  private int S205909 = 1;
  private int S205912 = 1;
  private int S205974 = 1;
  private int S205950 = 1;
  private int S205944 = 1;
  private int S205947 = 1;
  private int S206009 = 1;
  private int S205985 = 1;
  private int S205979 = 1;
  private int S205982 = 1;
  private int S206044 = 1;
  private int S206020 = 1;
  private int S206014 = 1;
  private int S206017 = 1;
  private int S206079 = 1;
  private int S206055 = 1;
  private int S206049 = 1;
  private int S206052 = 1;
  
  private int[] ends = new int[54];
  private int[] tdone = new int[54];
  
  public void thread207413(int [] tdone, int [] ends){
        S206052=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread207412(int [] tdone, int [] ends){
        S206049=1;
    zoneFourFiveSixACONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 109, column: 13
    currsigs.addElement(zoneFourFiveSixACONOFF_E);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread207410(int [] tdone, int [] ends){
        switch(S206052){
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

  public void thread207409(int [] tdone, int [] ends){
        switch(S206049){
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

  public void thread207408(int [] tdone, int [] ends){
        switch(S206079){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S206055){
          case 0 : 
            thread207409(tdone,ends);
            thread207410(tdone,ends);
            int biggest207411 = 0;
            if(ends[20]>=biggest207411){
              biggest207411=ends[20];
            }
            if(ends[21]>=biggest207411){
              biggest207411=ends[21];
            }
            if(biggest207411 == 1){
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            if(biggest207411 == 2){
              ends[19]=2;
              ;//sysj\ECS_plant.sysj line: 108, column: 8
              S206055=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            //FINXME code
            if(biggest207411 == 0){
              S206055=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            S206055=1;
            S206055=0;
            if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 107, column: 26
              thread207412(tdone,ends);
              thread207413(tdone,ends);
              int biggest207414 = 0;
              if(ends[20]>=biggest207414){
                biggest207414=ends[20];
              }
              if(ends[21]>=biggest207414){
                biggest207414=ends[21];
              }
              if(biggest207414 == 1){
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            else {
              S206055=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207406(int [] tdone, int [] ends){
        S206017=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread207405(int [] tdone, int [] ends){
        S206014=1;
    zoneTwoThreeHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 100, column: 13
    currsigs.addElement(zoneTwoThreeHeaterONOFF_E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread207403(int [] tdone, int [] ends){
        switch(S206017){
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

  public void thread207402(int [] tdone, int [] ends){
        switch(S206014){
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

  public void thread207401(int [] tdone, int [] ends){
        switch(S206044){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S206020){
          case 0 : 
            thread207402(tdone,ends);
            thread207403(tdone,ends);
            int biggest207404 = 0;
            if(ends[17]>=biggest207404){
              biggest207404=ends[17];
            }
            if(ends[18]>=biggest207404){
              biggest207404=ends[18];
            }
            if(biggest207404 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            if(biggest207404 == 2){
              ends[16]=2;
              ;//sysj\ECS_plant.sysj line: 99, column: 8
              S206020=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest207404 == 0){
              S206020=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            S206020=1;
            S206020=0;
            if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 98, column: 26
              thread207405(tdone,ends);
              thread207406(tdone,ends);
              int biggest207407 = 0;
              if(ends[17]>=biggest207407){
                biggest207407=ends[17];
              }
              if(ends[18]>=biggest207407){
                biggest207407=ends[18];
              }
              if(biggest207407 == 1){
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
            }
            else {
              S206020=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207399(int [] tdone, int [] ends){
        S205982=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread207398(int [] tdone, int [] ends){
        S205979=1;
    zoneTwoThreeFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 91, column: 13
    currsigs.addElement(zoneTwoThreeFanONOFF_E);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread207396(int [] tdone, int [] ends){
        switch(S205982){
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

  public void thread207395(int [] tdone, int [] ends){
        switch(S205979){
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

  public void thread207394(int [] tdone, int [] ends){
        switch(S206009){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S205985){
          case 0 : 
            thread207395(tdone,ends);
            thread207396(tdone,ends);
            int biggest207397 = 0;
            if(ends[14]>=biggest207397){
              biggest207397=ends[14];
            }
            if(ends[15]>=biggest207397){
              biggest207397=ends[15];
            }
            if(biggest207397 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            if(biggest207397 == 2){
              ends[13]=2;
              ;//sysj\ECS_plant.sysj line: 90, column: 8
              S205985=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            //FINXME code
            if(biggest207397 == 0){
              S205985=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S205985=1;
            S205985=0;
            if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 89, column: 26
              thread207398(tdone,ends);
              thread207399(tdone,ends);
              int biggest207400 = 0;
              if(ends[14]>=biggest207400){
                biggest207400=ends[14];
              }
              if(ends[15]>=biggest207400){
                biggest207400=ends[15];
              }
              if(biggest207400 == 1){
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            else {
              S205985=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207392(int [] tdone, int [] ends){
        S205947=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread207391(int [] tdone, int [] ends){
        S205944=1;
    zoneOneSevenHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 82, column: 13
    currsigs.addElement(zoneOneSevenHeaterONOFF_E);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread207389(int [] tdone, int [] ends){
        switch(S205947){
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

  public void thread207388(int [] tdone, int [] ends){
        switch(S205944){
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

  public void thread207387(int [] tdone, int [] ends){
        switch(S205974){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S205950){
          case 0 : 
            thread207388(tdone,ends);
            thread207389(tdone,ends);
            int biggest207390 = 0;
            if(ends[11]>=biggest207390){
              biggest207390=ends[11];
            }
            if(ends[12]>=biggest207390){
              biggest207390=ends[12];
            }
            if(biggest207390 == 1){
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            if(biggest207390 == 2){
              ends[10]=2;
              ;//sysj\ECS_plant.sysj line: 81, column: 8
              S205950=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            //FINXME code
            if(biggest207390 == 0){
              S205950=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S205950=1;
            S205950=0;
            if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 80, column: 26
              thread207391(tdone,ends);
              thread207392(tdone,ends);
              int biggest207393 = 0;
              if(ends[11]>=biggest207393){
                biggest207393=ends[11];
              }
              if(ends[12]>=biggest207393){
                biggest207393=ends[12];
              }
              if(biggest207393 == 1){
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              S205950=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207385(int [] tdone, int [] ends){
        S205912=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread207384(int [] tdone, int [] ends){
        S205909=1;
    zoneOneSevenFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 73, column: 13
    currsigs.addElement(zoneOneSevenFanONOFF_E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread207382(int [] tdone, int [] ends){
        switch(S205912){
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

  public void thread207381(int [] tdone, int [] ends){
        switch(S205909){
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

  public void thread207380(int [] tdone, int [] ends){
        switch(S205939){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S205915){
          case 0 : 
            thread207381(tdone,ends);
            thread207382(tdone,ends);
            int biggest207383 = 0;
            if(ends[8]>=biggest207383){
              biggest207383=ends[8];
            }
            if(ends[9]>=biggest207383){
              biggest207383=ends[9];
            }
            if(biggest207383 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest207383 == 2){
              ends[7]=2;
              ;//sysj\ECS_plant.sysj line: 72, column: 8
              S205915=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest207383 == 0){
              S205915=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S205915=1;
            S205915=0;
            if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 71, column: 26
              thread207384(tdone,ends);
              thread207385(tdone,ends);
              int biggest207386 = 0;
              if(ends[8]>=biggest207386){
                biggest207386=ends[8];
              }
              if(ends[9]>=biggest207386){
                biggest207386=ends[9];
              }
              if(biggest207386 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              S205915=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207379(int [] tdone, int [] ends){
        switch(S205904){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S205754){
          case 0 : 
            if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 65, column: 13
              System.out.println("Zone(4,5,6) AC - On");//sysj\ECS_plant.sysj line: 66, column: 7
              S205754=1;
              __start_thread_6 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 63, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_6 >= (2) * 1000){//sysj\ECS_plant.sysj line: 63, column: 4
                ends[6]=2;
                ;//sysj\ECS_plant.sysj line: 63, column: 4
                zoneFourFiveSixAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 66, column: 60
                currsigs.addElement(zoneFourFiveSixAtTempHumid);
                S205754=0;
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
              S205754=0;
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

  public void thread207378(int [] tdone, int [] ends){
        switch(S205752){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S205602){
          case 0 : 
            if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 57, column: 13
              System.out.println("Zone(2,3) Heater - On");//sysj\ECS_plant.sysj line: 58, column: 7
              S205602=1;
              __start_thread_5 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 55, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_5 >= (2) * 1000){//sysj\ECS_plant.sysj line: 55, column: 4
                ends[5]=2;
                ;//sysj\ECS_plant.sysj line: 55, column: 4
                zoneTwoThreeAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 58, column: 62
                currsigs.addElement(zoneTwoThreeAtTempHumid);
                S205602=0;
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
              S205602=0;
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

  public void thread207377(int [] tdone, int [] ends){
        switch(S205600){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S205450){
          case 0 : 
            if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 45, column: 13
              System.out.println("Zone(2,3) Fan - On");//sysj\ECS_plant.sysj line: 47, column: 7
              S205450=1;
              __start_thread_4 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 42, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_4 >= (2) * 1000){//sysj\ECS_plant.sysj line: 42, column: 4
                ends[4]=2;
                ;//sysj\ECS_plant.sysj line: 42, column: 4
                zoneTwoThreeAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 49, column: 7
                currsigs.addElement(zoneTwoThreeAtTempHumid);
                S205450=0;
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
              S205450=0;
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

  public void thread207376(int [] tdone, int [] ends){
        switch(S205448){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S205298){
          case 0 : 
            if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 32, column: 13
              System.out.println("Zone(1,7) Heater - On");//sysj\ECS_plant.sysj line: 34, column: 7
              S205298=1;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 29, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_3 >= (2) * 1000){//sysj\ECS_plant.sysj line: 29, column: 4
                ends[3]=2;
                ;//sysj\ECS_plant.sysj line: 29, column: 4
                zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 36, column: 7
                currsigs.addElement(zoneOneSevenAtTempHumid);
                S205298=0;
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
              S205298=0;
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

  public void thread207375(int [] tdone, int [] ends){
        switch(S205296){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S205146){
          case 0 : 
            if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 19, column: 13
              System.out.println("Zone(1,7) Fan - On");//sysj\ECS_plant.sysj line: 21, column: 8
              S205146=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 16, column: 4
              S205148=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                ends[2]=2;
                ;//sysj\ECS_plant.sysj line: 16, column: 4
                zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                currsigs.addElement(zoneOneSevenAtTempHumid);
                S205146=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S205148=1;
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
            switch(S205148){
              case 0 : 
                S205148=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                  ends[2]=2;
                  ;//sysj\ECS_plant.sysj line: 16, column: 4
                  zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                  currsigs.addElement(zoneOneSevenAtTempHumid);
                  S205146=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S205148=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S205148=1;
                S205148=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                  ends[2]=2;
                  ;//sysj\ECS_plant.sysj line: 16, column: 4
                  zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                  currsigs.addElement(zoneOneSevenAtTempHumid);
                  S205146=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S205148=1;
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

  public void thread207372(int [] tdone, int [] ends){
        S206052=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread207371(int [] tdone, int [] ends){
        S206049=1;
    zoneFourFiveSixACONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 109, column: 13
    currsigs.addElement(zoneFourFiveSixACONOFF_E);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread207370(int [] tdone, int [] ends){
        S206079=1;
    S206055=0;
    if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 107, column: 26
      thread207371(tdone,ends);
      thread207372(tdone,ends);
      int biggest207373 = 0;
      if(ends[20]>=biggest207373){
        biggest207373=ends[20];
      }
      if(ends[21]>=biggest207373){
        biggest207373=ends[21];
      }
      if(biggest207373 == 1){
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
    else {
      S206055=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread207368(int [] tdone, int [] ends){
        S206017=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread207367(int [] tdone, int [] ends){
        S206014=1;
    zoneTwoThreeHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 100, column: 13
    currsigs.addElement(zoneTwoThreeHeaterONOFF_E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread207366(int [] tdone, int [] ends){
        S206044=1;
    S206020=0;
    if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 98, column: 26
      thread207367(tdone,ends);
      thread207368(tdone,ends);
      int biggest207369 = 0;
      if(ends[17]>=biggest207369){
        biggest207369=ends[17];
      }
      if(ends[18]>=biggest207369){
        biggest207369=ends[18];
      }
      if(biggest207369 == 1){
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
    }
    else {
      S206020=1;
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread207364(int [] tdone, int [] ends){
        S205982=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread207363(int [] tdone, int [] ends){
        S205979=1;
    zoneTwoThreeFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 91, column: 13
    currsigs.addElement(zoneTwoThreeFanONOFF_E);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread207362(int [] tdone, int [] ends){
        S206009=1;
    S205985=0;
    if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 89, column: 26
      thread207363(tdone,ends);
      thread207364(tdone,ends);
      int biggest207365 = 0;
      if(ends[14]>=biggest207365){
        biggest207365=ends[14];
      }
      if(ends[15]>=biggest207365){
        biggest207365=ends[15];
      }
      if(biggest207365 == 1){
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
    }
    else {
      S205985=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread207360(int [] tdone, int [] ends){
        S205947=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread207359(int [] tdone, int [] ends){
        S205944=1;
    zoneOneSevenHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 82, column: 13
    currsigs.addElement(zoneOneSevenHeaterONOFF_E);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread207358(int [] tdone, int [] ends){
        S205974=1;
    S205950=0;
    if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 80, column: 26
      thread207359(tdone,ends);
      thread207360(tdone,ends);
      int biggest207361 = 0;
      if(ends[11]>=biggest207361){
        biggest207361=ends[11];
      }
      if(ends[12]>=biggest207361){
        biggest207361=ends[12];
      }
      if(biggest207361 == 1){
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
    else {
      S205950=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread207356(int [] tdone, int [] ends){
        S205912=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread207355(int [] tdone, int [] ends){
        S205909=1;
    zoneOneSevenFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 73, column: 13
    currsigs.addElement(zoneOneSevenFanONOFF_E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread207354(int [] tdone, int [] ends){
        S205939=1;
    S205915=0;
    if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 71, column: 26
      thread207355(tdone,ends);
      thread207356(tdone,ends);
      int biggest207357 = 0;
      if(ends[8]>=biggest207357){
        biggest207357=ends[8];
      }
      if(ends[9]>=biggest207357){
        biggest207357=ends[9];
      }
      if(biggest207357 == 1){
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
    }
    else {
      S205915=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread207353(int [] tdone, int [] ends){
        S205904=1;
    S205754=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread207352(int [] tdone, int [] ends){
        S205752=1;
    S205602=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread207351(int [] tdone, int [] ends){
        S205600=1;
    S205450=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread207350(int [] tdone, int [] ends){
        S205448=1;
    S205298=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread207349(int [] tdone, int [] ends){
        S205296=1;
    S205146=0;
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
      switch(S207016){
        case 0 : 
          S207016=0;
          break RUN;
        
        case 1 : 
          S207016=2;
          S207016=2;
          new Thread(new ECS_GUI()).start();//sysj\ECS_plant.sysj line: 14, column: 4
          thread207349(tdone,ends);
          thread207350(tdone,ends);
          thread207351(tdone,ends);
          thread207352(tdone,ends);
          thread207353(tdone,ends);
          thread207354(tdone,ends);
          thread207358(tdone,ends);
          thread207362(tdone,ends);
          thread207366(tdone,ends);
          thread207370(tdone,ends);
          int biggest207374 = 0;
          if(ends[2]>=biggest207374){
            biggest207374=ends[2];
          }
          if(ends[3]>=biggest207374){
            biggest207374=ends[3];
          }
          if(ends[4]>=biggest207374){
            biggest207374=ends[4];
          }
          if(ends[5]>=biggest207374){
            biggest207374=ends[5];
          }
          if(ends[6]>=biggest207374){
            biggest207374=ends[6];
          }
          if(ends[7]>=biggest207374){
            biggest207374=ends[7];
          }
          if(ends[10]>=biggest207374){
            biggest207374=ends[10];
          }
          if(ends[13]>=biggest207374){
            biggest207374=ends[13];
          }
          if(ends[16]>=biggest207374){
            biggest207374=ends[16];
          }
          if(ends[19]>=biggest207374){
            biggest207374=ends[19];
          }
          if(biggest207374 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread207375(tdone,ends);
          thread207376(tdone,ends);
          thread207377(tdone,ends);
          thread207378(tdone,ends);
          thread207379(tdone,ends);
          thread207380(tdone,ends);
          thread207387(tdone,ends);
          thread207394(tdone,ends);
          thread207401(tdone,ends);
          thread207408(tdone,ends);
          int biggest207415 = 0;
          if(ends[2]>=biggest207415){
            biggest207415=ends[2];
          }
          if(ends[3]>=biggest207415){
            biggest207415=ends[3];
          }
          if(ends[4]>=biggest207415){
            biggest207415=ends[4];
          }
          if(ends[5]>=biggest207415){
            biggest207415=ends[5];
          }
          if(ends[6]>=biggest207415){
            biggest207415=ends[6];
          }
          if(ends[7]>=biggest207415){
            biggest207415=ends[7];
          }
          if(ends[10]>=biggest207415){
            biggest207415=ends[10];
          }
          if(ends[13]>=biggest207415){
            biggest207415=ends[13];
          }
          if(ends[16]>=biggest207415){
            biggest207415=ends[16];
          }
          if(ends[19]>=biggest207415){
            biggest207415=ends[19];
          }
          if(biggest207415 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest207415 == 0){
            S207016=0;
            active[1]=0;
            ends[1]=0;
            S207016=0;
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

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
  private int S226747 = 1;
  private int S225027 = 1;
  private int S224877 = 1;
  private int S224879 = 1;
  private int S225179 = 1;
  private int S225029 = 1;
  private int S225331 = 1;
  private int S225181 = 1;
  private int S225483 = 1;
  private int S225333 = 1;
  private int S225635 = 1;
  private int S225485 = 1;
  private int S225670 = 1;
  private int S225646 = 1;
  private int S225640 = 1;
  private int S225643 = 1;
  private int S225705 = 1;
  private int S225681 = 1;
  private int S225675 = 1;
  private int S225678 = 1;
  private int S225740 = 1;
  private int S225716 = 1;
  private int S225710 = 1;
  private int S225713 = 1;
  private int S225775 = 1;
  private int S225751 = 1;
  private int S225745 = 1;
  private int S225748 = 1;
  private int S225810 = 1;
  private int S225786 = 1;
  private int S225780 = 1;
  private int S225783 = 1;
  
  private int[] ends = new int[54];
  private int[] tdone = new int[54];
  
  public void thread227060(int [] tdone, int [] ends){
        S225783=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread227059(int [] tdone, int [] ends){
        S225780=1;
    zoneFourFiveSixACONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 109, column: 13
    currsigs.addElement(zoneFourFiveSixACONOFF_E);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread227057(int [] tdone, int [] ends){
        switch(S225783){
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

  public void thread227056(int [] tdone, int [] ends){
        switch(S225780){
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

  public void thread227055(int [] tdone, int [] ends){
        switch(S225810){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S225786){
          case 0 : 
            thread227056(tdone,ends);
            thread227057(tdone,ends);
            int biggest227058 = 0;
            if(ends[20]>=biggest227058){
              biggest227058=ends[20];
            }
            if(ends[21]>=biggest227058){
              biggest227058=ends[21];
            }
            if(biggest227058 == 1){
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            if(biggest227058 == 2){
              ends[19]=2;
              ;//sysj\ECS_plant.sysj line: 108, column: 8
              S225786=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            //FINXME code
            if(biggest227058 == 0){
              S225786=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            S225786=1;
            S225786=0;
            if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 107, column: 26
              thread227059(tdone,ends);
              thread227060(tdone,ends);
              int biggest227061 = 0;
              if(ends[20]>=biggest227061){
                biggest227061=ends[20];
              }
              if(ends[21]>=biggest227061){
                biggest227061=ends[21];
              }
              if(biggest227061 == 1){
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            else {
              S225786=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread227053(int [] tdone, int [] ends){
        S225748=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread227052(int [] tdone, int [] ends){
        S225745=1;
    zoneTwoThreeHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 100, column: 13
    currsigs.addElement(zoneTwoThreeHeaterONOFF_E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread227050(int [] tdone, int [] ends){
        switch(S225748){
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

  public void thread227049(int [] tdone, int [] ends){
        switch(S225745){
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

  public void thread227048(int [] tdone, int [] ends){
        switch(S225775){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S225751){
          case 0 : 
            thread227049(tdone,ends);
            thread227050(tdone,ends);
            int biggest227051 = 0;
            if(ends[17]>=biggest227051){
              biggest227051=ends[17];
            }
            if(ends[18]>=biggest227051){
              biggest227051=ends[18];
            }
            if(biggest227051 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            if(biggest227051 == 2){
              ends[16]=2;
              ;//sysj\ECS_plant.sysj line: 99, column: 8
              S225751=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest227051 == 0){
              S225751=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            S225751=1;
            S225751=0;
            if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 98, column: 26
              thread227052(tdone,ends);
              thread227053(tdone,ends);
              int biggest227054 = 0;
              if(ends[17]>=biggest227054){
                biggest227054=ends[17];
              }
              if(ends[18]>=biggest227054){
                biggest227054=ends[18];
              }
              if(biggest227054 == 1){
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
            }
            else {
              S225751=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread227046(int [] tdone, int [] ends){
        S225713=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread227045(int [] tdone, int [] ends){
        S225710=1;
    zoneTwoThreeFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 91, column: 13
    currsigs.addElement(zoneTwoThreeFanONOFF_E);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread227043(int [] tdone, int [] ends){
        switch(S225713){
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

  public void thread227042(int [] tdone, int [] ends){
        switch(S225710){
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

  public void thread227041(int [] tdone, int [] ends){
        switch(S225740){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S225716){
          case 0 : 
            thread227042(tdone,ends);
            thread227043(tdone,ends);
            int biggest227044 = 0;
            if(ends[14]>=biggest227044){
              biggest227044=ends[14];
            }
            if(ends[15]>=biggest227044){
              biggest227044=ends[15];
            }
            if(biggest227044 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            if(biggest227044 == 2){
              ends[13]=2;
              ;//sysj\ECS_plant.sysj line: 90, column: 8
              S225716=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            //FINXME code
            if(biggest227044 == 0){
              S225716=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S225716=1;
            S225716=0;
            if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 89, column: 26
              thread227045(tdone,ends);
              thread227046(tdone,ends);
              int biggest227047 = 0;
              if(ends[14]>=biggest227047){
                biggest227047=ends[14];
              }
              if(ends[15]>=biggest227047){
                biggest227047=ends[15];
              }
              if(biggest227047 == 1){
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            else {
              S225716=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread227039(int [] tdone, int [] ends){
        S225678=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread227038(int [] tdone, int [] ends){
        S225675=1;
    zoneOneSevenHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 82, column: 13
    currsigs.addElement(zoneOneSevenHeaterONOFF_E);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread227036(int [] tdone, int [] ends){
        switch(S225678){
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

  public void thread227035(int [] tdone, int [] ends){
        switch(S225675){
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

  public void thread227034(int [] tdone, int [] ends){
        switch(S225705){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S225681){
          case 0 : 
            thread227035(tdone,ends);
            thread227036(tdone,ends);
            int biggest227037 = 0;
            if(ends[11]>=biggest227037){
              biggest227037=ends[11];
            }
            if(ends[12]>=biggest227037){
              biggest227037=ends[12];
            }
            if(biggest227037 == 1){
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            if(biggest227037 == 2){
              ends[10]=2;
              ;//sysj\ECS_plant.sysj line: 81, column: 8
              S225681=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            //FINXME code
            if(biggest227037 == 0){
              S225681=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S225681=1;
            S225681=0;
            if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 80, column: 26
              thread227038(tdone,ends);
              thread227039(tdone,ends);
              int biggest227040 = 0;
              if(ends[11]>=biggest227040){
                biggest227040=ends[11];
              }
              if(ends[12]>=biggest227040){
                biggest227040=ends[12];
              }
              if(biggest227040 == 1){
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              S225681=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread227032(int [] tdone, int [] ends){
        S225643=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread227031(int [] tdone, int [] ends){
        S225640=1;
    zoneOneSevenFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 73, column: 13
    currsigs.addElement(zoneOneSevenFanONOFF_E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread227029(int [] tdone, int [] ends){
        switch(S225643){
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

  public void thread227028(int [] tdone, int [] ends){
        switch(S225640){
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

  public void thread227027(int [] tdone, int [] ends){
        switch(S225670){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S225646){
          case 0 : 
            thread227028(tdone,ends);
            thread227029(tdone,ends);
            int biggest227030 = 0;
            if(ends[8]>=biggest227030){
              biggest227030=ends[8];
            }
            if(ends[9]>=biggest227030){
              biggest227030=ends[9];
            }
            if(biggest227030 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest227030 == 2){
              ends[7]=2;
              ;//sysj\ECS_plant.sysj line: 72, column: 8
              S225646=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest227030 == 0){
              S225646=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S225646=1;
            S225646=0;
            if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 71, column: 26
              thread227031(tdone,ends);
              thread227032(tdone,ends);
              int biggest227033 = 0;
              if(ends[8]>=biggest227033){
                biggest227033=ends[8];
              }
              if(ends[9]>=biggest227033){
                biggest227033=ends[9];
              }
              if(biggest227033 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              S225646=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread227026(int [] tdone, int [] ends){
        switch(S225635){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S225485){
          case 0 : 
            if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 65, column: 13
              System.out.println("Zone(4,5,6) AC - On");//sysj\ECS_plant.sysj line: 66, column: 7
              S225485=1;
              __start_thread_6 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 63, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_6 >= (2) * 1000){//sysj\ECS_plant.sysj line: 63, column: 4
                ends[6]=2;
                ;//sysj\ECS_plant.sysj line: 63, column: 4
                zoneFourFiveSixAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 66, column: 60
                currsigs.addElement(zoneFourFiveSixAtTempHumid);
                S225485=0;
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
              S225485=0;
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

  public void thread227025(int [] tdone, int [] ends){
        switch(S225483){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S225333){
          case 0 : 
            if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 57, column: 13
              System.out.println("Zone(2,3) Heater - On");//sysj\ECS_plant.sysj line: 58, column: 7
              S225333=1;
              __start_thread_5 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 55, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_5 >= (2) * 1000){//sysj\ECS_plant.sysj line: 55, column: 4
                ends[5]=2;
                ;//sysj\ECS_plant.sysj line: 55, column: 4
                zoneTwoThreeAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 58, column: 62
                currsigs.addElement(zoneTwoThreeAtTempHumid);
                S225333=0;
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
              S225333=0;
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

  public void thread227024(int [] tdone, int [] ends){
        switch(S225331){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S225181){
          case 0 : 
            if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 45, column: 13
              System.out.println("Zone(2,3) Fan - On");//sysj\ECS_plant.sysj line: 47, column: 7
              S225181=1;
              __start_thread_4 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 42, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_4 >= (2) * 1000){//sysj\ECS_plant.sysj line: 42, column: 4
                ends[4]=2;
                ;//sysj\ECS_plant.sysj line: 42, column: 4
                zoneTwoThreeAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 49, column: 7
                currsigs.addElement(zoneTwoThreeAtTempHumid);
                S225181=0;
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
              S225181=0;
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

  public void thread227023(int [] tdone, int [] ends){
        switch(S225179){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S225029){
          case 0 : 
            if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 32, column: 13
              System.out.println("Zone(1,7) Heater - On");//sysj\ECS_plant.sysj line: 34, column: 7
              S225029=1;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 29, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_3 >= (2) * 1000){//sysj\ECS_plant.sysj line: 29, column: 4
                ends[3]=2;
                ;//sysj\ECS_plant.sysj line: 29, column: 4
                zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 36, column: 7
                currsigs.addElement(zoneOneSevenAtTempHumid);
                S225029=0;
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
              S225029=0;
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

  public void thread227022(int [] tdone, int [] ends){
        switch(S225027){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S224877){
          case 0 : 
            if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 19, column: 13
              System.out.println("Zone(1,7) Fan - On");//sysj\ECS_plant.sysj line: 21, column: 8
              S224877=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 16, column: 4
              S224879=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                ends[2]=2;
                ;//sysj\ECS_plant.sysj line: 16, column: 4
                zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                currsigs.addElement(zoneOneSevenAtTempHumid);
                S224877=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S224879=1;
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
            switch(S224879){
              case 0 : 
                S224879=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                  ends[2]=2;
                  ;//sysj\ECS_plant.sysj line: 16, column: 4
                  zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                  currsigs.addElement(zoneOneSevenAtTempHumid);
                  S224877=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S224879=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S224879=1;
                S224879=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                  ends[2]=2;
                  ;//sysj\ECS_plant.sysj line: 16, column: 4
                  zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                  currsigs.addElement(zoneOneSevenAtTempHumid);
                  S224877=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S224879=1;
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

  public void thread227019(int [] tdone, int [] ends){
        S225783=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread227018(int [] tdone, int [] ends){
        S225780=1;
    zoneFourFiveSixACONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 109, column: 13
    currsigs.addElement(zoneFourFiveSixACONOFF_E);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread227017(int [] tdone, int [] ends){
        S225810=1;
    S225786=0;
    if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 107, column: 26
      thread227018(tdone,ends);
      thread227019(tdone,ends);
      int biggest227020 = 0;
      if(ends[20]>=biggest227020){
        biggest227020=ends[20];
      }
      if(ends[21]>=biggest227020){
        biggest227020=ends[21];
      }
      if(biggest227020 == 1){
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
    else {
      S225786=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread227015(int [] tdone, int [] ends){
        S225748=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread227014(int [] tdone, int [] ends){
        S225745=1;
    zoneTwoThreeHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 100, column: 13
    currsigs.addElement(zoneTwoThreeHeaterONOFF_E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread227013(int [] tdone, int [] ends){
        S225775=1;
    S225751=0;
    if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 98, column: 26
      thread227014(tdone,ends);
      thread227015(tdone,ends);
      int biggest227016 = 0;
      if(ends[17]>=biggest227016){
        biggest227016=ends[17];
      }
      if(ends[18]>=biggest227016){
        biggest227016=ends[18];
      }
      if(biggest227016 == 1){
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
    }
    else {
      S225751=1;
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread227011(int [] tdone, int [] ends){
        S225713=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread227010(int [] tdone, int [] ends){
        S225710=1;
    zoneTwoThreeFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 91, column: 13
    currsigs.addElement(zoneTwoThreeFanONOFF_E);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread227009(int [] tdone, int [] ends){
        S225740=1;
    S225716=0;
    if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 89, column: 26
      thread227010(tdone,ends);
      thread227011(tdone,ends);
      int biggest227012 = 0;
      if(ends[14]>=biggest227012){
        biggest227012=ends[14];
      }
      if(ends[15]>=biggest227012){
        biggest227012=ends[15];
      }
      if(biggest227012 == 1){
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
    }
    else {
      S225716=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread227007(int [] tdone, int [] ends){
        S225678=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread227006(int [] tdone, int [] ends){
        S225675=1;
    zoneOneSevenHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 82, column: 13
    currsigs.addElement(zoneOneSevenHeaterONOFF_E);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread227005(int [] tdone, int [] ends){
        S225705=1;
    S225681=0;
    if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 80, column: 26
      thread227006(tdone,ends);
      thread227007(tdone,ends);
      int biggest227008 = 0;
      if(ends[11]>=biggest227008){
        biggest227008=ends[11];
      }
      if(ends[12]>=biggest227008){
        biggest227008=ends[12];
      }
      if(biggest227008 == 1){
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
    else {
      S225681=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread227003(int [] tdone, int [] ends){
        S225643=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread227002(int [] tdone, int [] ends){
        S225640=1;
    zoneOneSevenFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 73, column: 13
    currsigs.addElement(zoneOneSevenFanONOFF_E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread227001(int [] tdone, int [] ends){
        S225670=1;
    S225646=0;
    if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 71, column: 26
      thread227002(tdone,ends);
      thread227003(tdone,ends);
      int biggest227004 = 0;
      if(ends[8]>=biggest227004){
        biggest227004=ends[8];
      }
      if(ends[9]>=biggest227004){
        biggest227004=ends[9];
      }
      if(biggest227004 == 1){
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
    }
    else {
      S225646=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread227000(int [] tdone, int [] ends){
        S225635=1;
    S225485=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread226999(int [] tdone, int [] ends){
        S225483=1;
    S225333=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread226998(int [] tdone, int [] ends){
        S225331=1;
    S225181=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread226997(int [] tdone, int [] ends){
        S225179=1;
    S225029=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread226996(int [] tdone, int [] ends){
        S225027=1;
    S224877=0;
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
      switch(S226747){
        case 0 : 
          S226747=0;
          break RUN;
        
        case 1 : 
          S226747=2;
          S226747=2;
          new Thread(new ECS_GUI()).start();//sysj\ECS_plant.sysj line: 14, column: 4
          thread226996(tdone,ends);
          thread226997(tdone,ends);
          thread226998(tdone,ends);
          thread226999(tdone,ends);
          thread227000(tdone,ends);
          thread227001(tdone,ends);
          thread227005(tdone,ends);
          thread227009(tdone,ends);
          thread227013(tdone,ends);
          thread227017(tdone,ends);
          int biggest227021 = 0;
          if(ends[2]>=biggest227021){
            biggest227021=ends[2];
          }
          if(ends[3]>=biggest227021){
            biggest227021=ends[3];
          }
          if(ends[4]>=biggest227021){
            biggest227021=ends[4];
          }
          if(ends[5]>=biggest227021){
            biggest227021=ends[5];
          }
          if(ends[6]>=biggest227021){
            biggest227021=ends[6];
          }
          if(ends[7]>=biggest227021){
            biggest227021=ends[7];
          }
          if(ends[10]>=biggest227021){
            biggest227021=ends[10];
          }
          if(ends[13]>=biggest227021){
            biggest227021=ends[13];
          }
          if(ends[16]>=biggest227021){
            biggest227021=ends[16];
          }
          if(ends[19]>=biggest227021){
            biggest227021=ends[19];
          }
          if(biggest227021 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread227022(tdone,ends);
          thread227023(tdone,ends);
          thread227024(tdone,ends);
          thread227025(tdone,ends);
          thread227026(tdone,ends);
          thread227027(tdone,ends);
          thread227034(tdone,ends);
          thread227041(tdone,ends);
          thread227048(tdone,ends);
          thread227055(tdone,ends);
          int biggest227062 = 0;
          if(ends[2]>=biggest227062){
            biggest227062=ends[2];
          }
          if(ends[3]>=biggest227062){
            biggest227062=ends[3];
          }
          if(ends[4]>=biggest227062){
            biggest227062=ends[4];
          }
          if(ends[5]>=biggest227062){
            biggest227062=ends[5];
          }
          if(ends[6]>=biggest227062){
            biggest227062=ends[6];
          }
          if(ends[7]>=biggest227062){
            biggest227062=ends[7];
          }
          if(ends[10]>=biggest227062){
            biggest227062=ends[10];
          }
          if(ends[13]>=biggest227062){
            biggest227062=ends[13];
          }
          if(ends[16]>=biggest227062){
            biggest227062=ends[16];
          }
          if(ends[19]>=biggest227062){
            biggest227062=ends[19];
          }
          if(biggest227062 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest227062 == 0){
            S226747=0;
            active[1]=0;
            ends[1]=0;
            S226747=0;
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

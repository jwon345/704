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
  private int S209486 = 1;
  private int S207766 = 1;
  private int S207616 = 1;
  private int S207618 = 1;
  private int S207918 = 1;
  private int S207768 = 1;
  private int S208070 = 1;
  private int S207920 = 1;
  private int S208222 = 1;
  private int S208072 = 1;
  private int S208374 = 1;
  private int S208224 = 1;
  private int S208409 = 1;
  private int S208385 = 1;
  private int S208379 = 1;
  private int S208382 = 1;
  private int S208444 = 1;
  private int S208420 = 1;
  private int S208414 = 1;
  private int S208417 = 1;
  private int S208479 = 1;
  private int S208455 = 1;
  private int S208449 = 1;
  private int S208452 = 1;
  private int S208514 = 1;
  private int S208490 = 1;
  private int S208484 = 1;
  private int S208487 = 1;
  private int S208549 = 1;
  private int S208525 = 1;
  private int S208519 = 1;
  private int S208522 = 1;
  
  private int[] ends = new int[54];
  private int[] tdone = new int[54];
  
  public void thread209847(int [] tdone, int [] ends){
        S208522=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread209846(int [] tdone, int [] ends){
        S208519=1;
    zoneFourFiveSixACONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 109, column: 13
    currsigs.addElement(zoneFourFiveSixACONOFF_E);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread209844(int [] tdone, int [] ends){
        switch(S208522){
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

  public void thread209843(int [] tdone, int [] ends){
        switch(S208519){
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

  public void thread209842(int [] tdone, int [] ends){
        switch(S208549){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S208525){
          case 0 : 
            thread209843(tdone,ends);
            thread209844(tdone,ends);
            int biggest209845 = 0;
            if(ends[20]>=biggest209845){
              biggest209845=ends[20];
            }
            if(ends[21]>=biggest209845){
              biggest209845=ends[21];
            }
            if(biggest209845 == 1){
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            if(biggest209845 == 2){
              ends[19]=2;
              ;//sysj\ECS_plant.sysj line: 108, column: 8
              S208525=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            //FINXME code
            if(biggest209845 == 0){
              S208525=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 1 : 
            S208525=1;
            S208525=0;
            if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 107, column: 26
              thread209846(tdone,ends);
              thread209847(tdone,ends);
              int biggest209848 = 0;
              if(ends[20]>=biggest209848){
                biggest209848=ends[20];
              }
              if(ends[21]>=biggest209848){
                biggest209848=ends[21];
              }
              if(biggest209848 == 1){
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            else {
              S208525=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread209840(int [] tdone, int [] ends){
        S208487=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread209839(int [] tdone, int [] ends){
        S208484=1;
    zoneTwoThreeHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 100, column: 13
    currsigs.addElement(zoneTwoThreeHeaterONOFF_E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread209837(int [] tdone, int [] ends){
        switch(S208487){
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

  public void thread209836(int [] tdone, int [] ends){
        switch(S208484){
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

  public void thread209835(int [] tdone, int [] ends){
        switch(S208514){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S208490){
          case 0 : 
            thread209836(tdone,ends);
            thread209837(tdone,ends);
            int biggest209838 = 0;
            if(ends[17]>=biggest209838){
              biggest209838=ends[17];
            }
            if(ends[18]>=biggest209838){
              biggest209838=ends[18];
            }
            if(biggest209838 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            if(biggest209838 == 2){
              ends[16]=2;
              ;//sysj\ECS_plant.sysj line: 99, column: 8
              S208490=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest209838 == 0){
              S208490=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 1 : 
            S208490=1;
            S208490=0;
            if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 98, column: 26
              thread209839(tdone,ends);
              thread209840(tdone,ends);
              int biggest209841 = 0;
              if(ends[17]>=biggest209841){
                biggest209841=ends[17];
              }
              if(ends[18]>=biggest209841){
                biggest209841=ends[18];
              }
              if(biggest209841 == 1){
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
            }
            else {
              S208490=1;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread209833(int [] tdone, int [] ends){
        S208452=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread209832(int [] tdone, int [] ends){
        S208449=1;
    zoneTwoThreeFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 91, column: 13
    currsigs.addElement(zoneTwoThreeFanONOFF_E);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread209830(int [] tdone, int [] ends){
        switch(S208452){
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

  public void thread209829(int [] tdone, int [] ends){
        switch(S208449){
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

  public void thread209828(int [] tdone, int [] ends){
        switch(S208479){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S208455){
          case 0 : 
            thread209829(tdone,ends);
            thread209830(tdone,ends);
            int biggest209831 = 0;
            if(ends[14]>=biggest209831){
              biggest209831=ends[14];
            }
            if(ends[15]>=biggest209831){
              biggest209831=ends[15];
            }
            if(biggest209831 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            if(biggest209831 == 2){
              ends[13]=2;
              ;//sysj\ECS_plant.sysj line: 90, column: 8
              S208455=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            //FINXME code
            if(biggest209831 == 0){
              S208455=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S208455=1;
            S208455=0;
            if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 89, column: 26
              thread209832(tdone,ends);
              thread209833(tdone,ends);
              int biggest209834 = 0;
              if(ends[14]>=biggest209834){
                biggest209834=ends[14];
              }
              if(ends[15]>=biggest209834){
                biggest209834=ends[15];
              }
              if(biggest209834 == 1){
                active[13]=1;
                ends[13]=1;
                tdone[13]=1;
              }
            }
            else {
              S208455=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread209826(int [] tdone, int [] ends){
        S208417=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread209825(int [] tdone, int [] ends){
        S208414=1;
    zoneOneSevenHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 82, column: 13
    currsigs.addElement(zoneOneSevenHeaterONOFF_E);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread209823(int [] tdone, int [] ends){
        switch(S208417){
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

  public void thread209822(int [] tdone, int [] ends){
        switch(S208414){
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

  public void thread209821(int [] tdone, int [] ends){
        switch(S208444){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S208420){
          case 0 : 
            thread209822(tdone,ends);
            thread209823(tdone,ends);
            int biggest209824 = 0;
            if(ends[11]>=biggest209824){
              biggest209824=ends[11];
            }
            if(ends[12]>=biggest209824){
              biggest209824=ends[12];
            }
            if(biggest209824 == 1){
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            if(biggest209824 == 2){
              ends[10]=2;
              ;//sysj\ECS_plant.sysj line: 81, column: 8
              S208420=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            //FINXME code
            if(biggest209824 == 0){
              S208420=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S208420=1;
            S208420=0;
            if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 80, column: 26
              thread209825(tdone,ends);
              thread209826(tdone,ends);
              int biggest209827 = 0;
              if(ends[11]>=biggest209827){
                biggest209827=ends[11];
              }
              if(ends[12]>=biggest209827){
                biggest209827=ends[12];
              }
              if(biggest209827 == 1){
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            else {
              S208420=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread209819(int [] tdone, int [] ends){
        S208382=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread209818(int [] tdone, int [] ends){
        S208379=1;
    zoneOneSevenFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 73, column: 13
    currsigs.addElement(zoneOneSevenFanONOFF_E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread209816(int [] tdone, int [] ends){
        switch(S208382){
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

  public void thread209815(int [] tdone, int [] ends){
        switch(S208379){
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

  public void thread209814(int [] tdone, int [] ends){
        switch(S208409){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S208385){
          case 0 : 
            thread209815(tdone,ends);
            thread209816(tdone,ends);
            int biggest209817 = 0;
            if(ends[8]>=biggest209817){
              biggest209817=ends[8];
            }
            if(ends[9]>=biggest209817){
              biggest209817=ends[9];
            }
            if(biggest209817 == 1){
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            if(biggest209817 == 2){
              ends[7]=2;
              ;//sysj\ECS_plant.sysj line: 72, column: 8
              S208385=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            //FINXME code
            if(biggest209817 == 0){
              S208385=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
          case 1 : 
            S208385=1;
            S208385=0;
            if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 71, column: 26
              thread209818(tdone,ends);
              thread209819(tdone,ends);
              int biggest209820 = 0;
              if(ends[8]>=biggest209820){
                biggest209820=ends[8];
              }
              if(ends[9]>=biggest209820){
                biggest209820=ends[9];
              }
              if(biggest209820 == 1){
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
            }
            else {
              S208385=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread209813(int [] tdone, int [] ends){
        switch(S208374){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S208224){
          case 0 : 
            if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 65, column: 13
              System.out.println("Zone(4,5,6) AC - On");//sysj\ECS_plant.sysj line: 66, column: 7
              S208224=1;
              __start_thread_6 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 63, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_6 >= (2) * 1000){//sysj\ECS_plant.sysj line: 63, column: 4
                ends[6]=2;
                ;//sysj\ECS_plant.sysj line: 63, column: 4
                zoneFourFiveSixAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 66, column: 60
                currsigs.addElement(zoneFourFiveSixAtTempHumid);
                S208224=0;
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
              S208224=0;
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

  public void thread209812(int [] tdone, int [] ends){
        switch(S208222){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S208072){
          case 0 : 
            if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 57, column: 13
              System.out.println("Zone(2,3) Heater - On");//sysj\ECS_plant.sysj line: 58, column: 7
              S208072=1;
              __start_thread_5 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 55, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_5 >= (2) * 1000){//sysj\ECS_plant.sysj line: 55, column: 4
                ends[5]=2;
                ;//sysj\ECS_plant.sysj line: 55, column: 4
                zoneTwoThreeAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 58, column: 62
                currsigs.addElement(zoneTwoThreeAtTempHumid);
                S208072=0;
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
              S208072=0;
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

  public void thread209811(int [] tdone, int [] ends){
        switch(S208070){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S207920){
          case 0 : 
            if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 45, column: 13
              System.out.println("Zone(2,3) Fan - On");//sysj\ECS_plant.sysj line: 47, column: 7
              S207920=1;
              __start_thread_4 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 42, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_4 >= (2) * 1000){//sysj\ECS_plant.sysj line: 42, column: 4
                ends[4]=2;
                ;//sysj\ECS_plant.sysj line: 42, column: 4
                zoneTwoThreeAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 49, column: 7
                currsigs.addElement(zoneTwoThreeAtTempHumid);
                S207920=0;
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
              S207920=0;
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

  public void thread209810(int [] tdone, int [] ends){
        switch(S207918){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S207768){
          case 0 : 
            if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 32, column: 13
              System.out.println("Zone(1,7) Heater - On");//sysj\ECS_plant.sysj line: 34, column: 7
              S207768=1;
              __start_thread_3 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 29, column: 4
              if(com.systemj.Timer.getMs() - __start_thread_3 >= (2) * 1000){//sysj\ECS_plant.sysj line: 29, column: 4
                ends[3]=2;
                ;//sysj\ECS_plant.sysj line: 29, column: 4
                zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 36, column: 7
                currsigs.addElement(zoneOneSevenAtTempHumid);
                S207768=0;
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
              S207768=0;
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

  public void thread209809(int [] tdone, int [] ends){
        switch(S207766){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S207616){
          case 0 : 
            if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 19, column: 13
              System.out.println("Zone(1,7) Fan - On");//sysj\ECS_plant.sysj line: 21, column: 8
              S207616=1;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\ECS_plant.sysj line: 16, column: 4
              S207618=0;
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                ends[2]=2;
                ;//sysj\ECS_plant.sysj line: 16, column: 4
                zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                currsigs.addElement(zoneOneSevenAtTempHumid);
                S207616=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S207618=1;
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
            switch(S207618){
              case 0 : 
                S207618=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                  ends[2]=2;
                  ;//sysj\ECS_plant.sysj line: 16, column: 4
                  zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                  currsigs.addElement(zoneOneSevenAtTempHumid);
                  S207616=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S207618=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S207618=1;
                S207618=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\ECS_plant.sysj line: 16, column: 4
                  ends[2]=2;
                  ;//sysj\ECS_plant.sysj line: 16, column: 4
                  zoneOneSevenAtTempHumid.setPresent();//sysj\ECS_plant.sysj line: 23, column: 8
                  currsigs.addElement(zoneOneSevenAtTempHumid);
                  S207616=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S207618=1;
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

  public void thread209806(int [] tdone, int [] ends){
        S208522=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread209805(int [] tdone, int [] ends){
        S208519=1;
    zoneFourFiveSixACONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 109, column: 13
    currsigs.addElement(zoneFourFiveSixACONOFF_E);
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread209804(int [] tdone, int [] ends){
        S208549=1;
    S208525=0;
    if(zoneFourFiveSixACONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 107, column: 26
      thread209805(tdone,ends);
      thread209806(tdone,ends);
      int biggest209807 = 0;
      if(ends[20]>=biggest209807){
        biggest209807=ends[20];
      }
      if(ends[21]>=biggest209807){
        biggest209807=ends[21];
      }
      if(biggest209807 == 1){
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
    else {
      S208525=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread209802(int [] tdone, int [] ends){
        S208487=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread209801(int [] tdone, int [] ends){
        S208484=1;
    zoneTwoThreeHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 100, column: 13
    currsigs.addElement(zoneTwoThreeHeaterONOFF_E);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread209800(int [] tdone, int [] ends){
        S208514=1;
    S208490=0;
    if(zoneTwoThreeHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 98, column: 26
      thread209801(tdone,ends);
      thread209802(tdone,ends);
      int biggest209803 = 0;
      if(ends[17]>=biggest209803){
        biggest209803=ends[17];
      }
      if(ends[18]>=biggest209803){
        biggest209803=ends[18];
      }
      if(biggest209803 == 1){
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
    }
    else {
      S208490=1;
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread209798(int [] tdone, int [] ends){
        S208452=1;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread209797(int [] tdone, int [] ends){
        S208449=1;
    zoneTwoThreeFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 91, column: 13
    currsigs.addElement(zoneTwoThreeFanONOFF_E);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread209796(int [] tdone, int [] ends){
        S208479=1;
    S208455=0;
    if(zoneTwoThreeFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 89, column: 26
      thread209797(tdone,ends);
      thread209798(tdone,ends);
      int biggest209799 = 0;
      if(ends[14]>=biggest209799){
        biggest209799=ends[14];
      }
      if(ends[15]>=biggest209799){
        biggest209799=ends[15];
      }
      if(biggest209799 == 1){
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
      }
    }
    else {
      S208455=1;
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread209794(int [] tdone, int [] ends){
        S208417=1;
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread209793(int [] tdone, int [] ends){
        S208414=1;
    zoneOneSevenHeaterONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 82, column: 13
    currsigs.addElement(zoneOneSevenHeaterONOFF_E);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread209792(int [] tdone, int [] ends){
        S208444=1;
    S208420=0;
    if(zoneOneSevenHeaterONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 80, column: 26
      thread209793(tdone,ends);
      thread209794(tdone,ends);
      int biggest209795 = 0;
      if(ends[11]>=biggest209795){
        biggest209795=ends[11];
      }
      if(ends[12]>=biggest209795){
        biggest209795=ends[12];
      }
      if(biggest209795 == 1){
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
    else {
      S208420=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread209790(int [] tdone, int [] ends){
        S208382=1;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread209789(int [] tdone, int [] ends){
        S208379=1;
    zoneOneSevenFanONOFF_E.setPresent();//sysj\ECS_plant.sysj line: 73, column: 13
    currsigs.addElement(zoneOneSevenFanONOFF_E);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread209788(int [] tdone, int [] ends){
        S208409=1;
    S208385=0;
    if(zoneOneSevenFanONOFF.getprestatus()){//sysj\ECS_plant.sysj line: 71, column: 26
      thread209789(tdone,ends);
      thread209790(tdone,ends);
      int biggest209791 = 0;
      if(ends[8]>=biggest209791){
        biggest209791=ends[8];
      }
      if(ends[9]>=biggest209791){
        biggest209791=ends[9];
      }
      if(biggest209791 == 1){
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
    }
    else {
      S208385=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread209787(int [] tdone, int [] ends){
        S208374=1;
    S208224=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209786(int [] tdone, int [] ends){
        S208222=1;
    S208072=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209785(int [] tdone, int [] ends){
        S208070=1;
    S207920=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209784(int [] tdone, int [] ends){
        S207918=1;
    S207768=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209783(int [] tdone, int [] ends){
        S207766=1;
    S207616=0;
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
      switch(S209486){
        case 0 : 
          S209486=0;
          break RUN;
        
        case 1 : 
          S209486=2;
          S209486=2;
          new Thread(new ECS_GUI()).start();//sysj\ECS_plant.sysj line: 14, column: 4
          thread209783(tdone,ends);
          thread209784(tdone,ends);
          thread209785(tdone,ends);
          thread209786(tdone,ends);
          thread209787(tdone,ends);
          thread209788(tdone,ends);
          thread209792(tdone,ends);
          thread209796(tdone,ends);
          thread209800(tdone,ends);
          thread209804(tdone,ends);
          int biggest209808 = 0;
          if(ends[2]>=biggest209808){
            biggest209808=ends[2];
          }
          if(ends[3]>=biggest209808){
            biggest209808=ends[3];
          }
          if(ends[4]>=biggest209808){
            biggest209808=ends[4];
          }
          if(ends[5]>=biggest209808){
            biggest209808=ends[5];
          }
          if(ends[6]>=biggest209808){
            biggest209808=ends[6];
          }
          if(ends[7]>=biggest209808){
            biggest209808=ends[7];
          }
          if(ends[10]>=biggest209808){
            biggest209808=ends[10];
          }
          if(ends[13]>=biggest209808){
            biggest209808=ends[13];
          }
          if(ends[16]>=biggest209808){
            biggest209808=ends[16];
          }
          if(ends[19]>=biggest209808){
            biggest209808=ends[19];
          }
          if(biggest209808 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread209809(tdone,ends);
          thread209810(tdone,ends);
          thread209811(tdone,ends);
          thread209812(tdone,ends);
          thread209813(tdone,ends);
          thread209814(tdone,ends);
          thread209821(tdone,ends);
          thread209828(tdone,ends);
          thread209835(tdone,ends);
          thread209842(tdone,ends);
          int biggest209849 = 0;
          if(ends[2]>=biggest209849){
            biggest209849=ends[2];
          }
          if(ends[3]>=biggest209849){
            biggest209849=ends[3];
          }
          if(ends[4]>=biggest209849){
            biggest209849=ends[4];
          }
          if(ends[5]>=biggest209849){
            biggest209849=ends[5];
          }
          if(ends[6]>=biggest209849){
            biggest209849=ends[6];
          }
          if(ends[7]>=biggest209849){
            biggest209849=ends[7];
          }
          if(ends[10]>=biggest209849){
            biggest209849=ends[10];
          }
          if(ends[13]>=biggest209849){
            biggest209849=ends[13];
          }
          if(ends[16]>=biggest209849){
            biggest209849=ends[16];
          }
          if(ends[19]>=biggest209849){
            biggest209849=ends[19];
          }
          if(biggest209849 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest209849 == 0){
            S209486=0;
            active[1]=0;
            ends[1]=0;
            S209486=0;
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

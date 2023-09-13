import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ECS_HVACController extends ClockDomain{
  public ECS_HVACController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal currentTime = new Signal("currentTime", Signal.INPUT);
  public Signal zoneOneSevenTemp = new Signal("zoneOneSevenTemp", Signal.INPUT);
  public Signal zoneTwoThreeTemp = new Signal("zoneTwoThreeTemp", Signal.INPUT);
  public Signal zoneFourFiveSixTemp = new Signal("zoneFourFiveSixTemp", Signal.INPUT);
  public Signal zoneOneSevenHumid = new Signal("zoneOneSevenHumid", Signal.INPUT);
  public Signal zoneTwoThreeHumid = new Signal("zoneTwoThreeHumid", Signal.INPUT);
  public Signal zoneFourFiveSixHumid = new Signal("zoneFourFiveSixHumid", Signal.INPUT);
  public Signal zoneOneSevenAtTempHumid = new Signal("zoneOneSevenAtTempHumid", Signal.INPUT);
  public Signal zoneTwoThreeAtTempHumid = new Signal("zoneTwoThreeAtTempHumid", Signal.INPUT);
  public Signal zoneFourFiveSixAtTempHumid = new Signal("zoneFourFiveSixAtTempHumid", Signal.INPUT);
  public Signal zoneOneOccupancy_B = new Signal("zoneOneOccupancy_B", Signal.INPUT);
  public Signal zoneSevenOccupancy_B = new Signal("zoneSevenOccupancy_B", Signal.INPUT);
  public Signal zoneOneSevenFanONOFF = new Signal("zoneOneSevenFanONOFF", Signal.OUTPUT);
  public Signal zoneTwoThreeFanONOFF = new Signal("zoneTwoThreeFanONOFF", Signal.OUTPUT);
  public Signal zoneFourFiveSixACONOFF = new Signal("zoneFourFiveSixACONOFF", Signal.OUTPUT);
  public Signal zoneOneSevenHeaterONOFF = new Signal("zoneOneSevenHeaterONOFF", Signal.OUTPUT);
  public Signal zoneTwoThreeHeaterONOFF = new Signal("zoneTwoThreeHeaterONOFF", Signal.OUTPUT);
  private Signal workhrs_60;
  private Signal afterhrs_60;
  private int currentTemp_thread_60;//sysj\ECS.sysj line: 196, column: 2
  private int previousHour_thread_60;//sysj\ECS.sysj line: 197, column: 2
  private int currentTemp_thread_62;//sysj\ECS.sysj line: 216, column: 2
  private int currentHumidity_thread_62;//sysj\ECS.sysj line: 217, column: 2
  private int currentTemp_thread_63;//sysj\ECS.sysj line: 328, column: 2
  private int currentHumidity_thread_63;//sysj\ECS.sysj line: 329, column: 2
  private int currentTemp_thread_64;//sysj\ECS.sysj line: 385, column: 2
  private int currentHumidity_thread_64;//sysj\ECS.sysj line: 386, column: 2
  private int currentHour_thread_61;//sysj\ECS.sysj line: 201, column: 6
  private int tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 221, column: 4
  private int humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 222, column: 4
  private int zoneOneOcc_thread_62;//sysj\ECS.sysj line: 269, column: 14
  private int zoneSevenOcc_thread_62;//sysj\ECS.sysj line: 270, column: 14
  private int tempzoneTwoThree_thread_63;//sysj\ECS.sysj line: 335, column: 7
  private int humidityzoneTwoThree_thread_63;//sysj\ECS.sysj line: 336, column: 7
  private int tempzoneFourFiveSixTemp_thread_64;//sysj\ECS.sysj line: 392, column: 7
  private int humidityzoneFourFiveSix_thread_64;//sysj\ECS.sysj line: 393, column: 7
  private int S207278 = 1;
  private int S197683 = 1;
  private int S201807 = 1;
  private int S197685 = 1;
  private int S197726 = 1;
  private int S197693 = 1;
  private int S197701 = 1;
  private int S197811 = 1;
  private int S197778 = 1;
  private int S197786 = 1;
  private int S202139 = 1;
  private int S201863 = 1;
  private int S201809 = 1;
  private int S201837 = 1;
  private int S202471 = 1;
  private int S202195 = 1;
  private int S202141 = 1;
  private int S202169 = 1;
  
  private int[] ends = new int[69];
  private int[] tdone = new int[69];
  
  public void thread207601(int [] tdone, int [] ends){
        switch(S202471){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        switch(S202195){
          case 0 : 
            switch(S202141){
              case 0 : 
                if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 400, column: 14
                  System.out.println("Current Temp for Zone 4,5,6:" + currentTemp_thread_64 + "(°C)");//sysj\ECS.sysj line: 401, column: 8
                  System.out.println("\n-------------------------");//sysj\ECS.sysj line: 402, column: 8
                  S202141=1;
                  if(tempzoneFourFiveSixTemp_thread_64 < currentTemp_thread_64){//sysj\ECS.sysj line: 405, column: 11
                    System.out.println("Turning ON AC to Cool Down for Zone 4,5,6");//sysj\ECS.sysj line: 406, column: 8
                    zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 407, column: 8
                    currsigs.addElement(zoneFourFiveSixACONOFF);
                    currentTemp_thread_64 = tempzoneFourFiveSixTemp_thread_64;//sysj\ECS.sysj line: 408, column: 8
                    active[64]=1;
                    ends[64]=1;
                    tdone[64]=1;
                  }
                  else {
                    S202141=2;
                    if(humidityzoneFourFiveSix_thread_64 > currentHumidity_thread_64){//sysj\ECS.sysj line: 415, column: 11
                      S202169=0;
                      System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 416, column: 14
                      zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 417, column: 11
                      currsigs.addElement(zoneFourFiveSixACONOFF);
                      currentHumidity_thread_64 = humidityzoneFourFiveSix_thread_64;//sysj\ECS.sysj line: 418, column: 14
                      active[64]=1;
                      ends[64]=1;
                      tdone[64]=1;
                    }
                    else {
                      S202169=1;
                      if(humidityzoneFourFiveSix_thread_64 < currentHumidity_thread_64){//sysj\ECS.sysj line: 423, column: 21
                        System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 424, column: 14
                        zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 425, column: 11
                        currsigs.addElement(zoneFourFiveSixACONOFF);
                        currentHumidity_thread_64 = humidityzoneFourFiveSix_thread_64;//sysj\ECS.sysj line: 426, column: 14
                        active[64]=1;
                        ends[64]=1;
                        tdone[64]=1;
                      }
                      else {
                        S202195=1;
                        active[64]=1;
                        ends[64]=1;
                        tdone[64]=1;
                      }
                    }
                  }
                }
                else {
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
                break;
              
              case 1 : 
                if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 410, column: 14
                  System.out.println("Current Temp for Zone 4,5,6:" + currentTemp_thread_64 + "(°C)");//sysj\ECS.sysj line: 411, column: 8
                  System.out.println("\n-------------------------");//sysj\ECS.sysj line: 412, column: 8
                  S202141=2;
                  if(humidityzoneFourFiveSix_thread_64 > currentHumidity_thread_64){//sysj\ECS.sysj line: 415, column: 11
                    S202169=0;
                    System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 416, column: 14
                    zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 417, column: 11
                    currsigs.addElement(zoneFourFiveSixACONOFF);
                    currentHumidity_thread_64 = humidityzoneFourFiveSix_thread_64;//sysj\ECS.sysj line: 418, column: 14
                    active[64]=1;
                    ends[64]=1;
                    tdone[64]=1;
                  }
                  else {
                    S202169=1;
                    if(humidityzoneFourFiveSix_thread_64 < currentHumidity_thread_64){//sysj\ECS.sysj line: 423, column: 21
                      System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 424, column: 14
                      zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 425, column: 11
                      currsigs.addElement(zoneFourFiveSixACONOFF);
                      currentHumidity_thread_64 = humidityzoneFourFiveSix_thread_64;//sysj\ECS.sysj line: 426, column: 14
                      active[64]=1;
                      ends[64]=1;
                      tdone[64]=1;
                    }
                    else {
                      S202195=1;
                      active[64]=1;
                      ends[64]=1;
                      tdone[64]=1;
                    }
                  }
                }
                else {
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
                break;
              
              case 2 : 
                switch(S202169){
                  case 0 : 
                    if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 420, column: 17
                      System.out.println("Current Humidity For Zone 4,5,6: " + currentHumidity_thread_64 + "(%)");//sysj\ECS.sysj line: 421, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 422, column: 11
                      S202195=1;
                      active[64]=1;
                      ends[64]=1;
                      tdone[64]=1;
                    }
                    else {
                      active[64]=1;
                      ends[64]=1;
                      tdone[64]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 428, column: 17
                      System.out.println("Current Humidity For Zone 4,5,6: " + currentHumidity_thread_64 + "(%)");//sysj\ECS.sysj line: 429, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 430, column: 11
                      S202195=1;
                      active[64]=1;
                      ends[64]=1;
                      tdone[64]=1;
                    }
                    else {
                      active[64]=1;
                      ends[64]=1;
                      tdone[64]=1;
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 1 : 
            S202195=1;
            S202195=0;
            if(workhrs_60.getprestatus()){//sysj\ECS.sysj line: 391, column: 12
              tempzoneFourFiveSixTemp_thread_64 = (Integer)(zoneFourFiveSixTemp.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixTemp.getpreval()).intValue());//sysj\ECS.sysj line: 392, column: 7
              humidityzoneFourFiveSix_thread_64 = (Integer)(zoneFourFiveSixHumid.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixHumid.getpreval()).intValue());//sysj\ECS.sysj line: 393, column: 7
              S202141=0;
              if(tempzoneFourFiveSixTemp_thread_64 > currentTemp_thread_64){//sysj\ECS.sysj line: 395, column: 11
                System.out.println("Turning ON AC to Heat Up for Zone 4,5,6");//sysj\ECS.sysj line: 396, column: 8
                zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 397, column: 8
                currsigs.addElement(zoneFourFiveSixACONOFF);
                currentTemp_thread_64 = tempzoneFourFiveSixTemp_thread_64;//sysj\ECS.sysj line: 398, column: 8
                active[64]=1;
                ends[64]=1;
                tdone[64]=1;
              }
              else {
                S202141=1;
                if(tempzoneFourFiveSixTemp_thread_64 < currentTemp_thread_64){//sysj\ECS.sysj line: 405, column: 11
                  System.out.println("Turning ON AC to Cool Down for Zone 4,5,6");//sysj\ECS.sysj line: 406, column: 8
                  zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 407, column: 8
                  currsigs.addElement(zoneFourFiveSixACONOFF);
                  currentTemp_thread_64 = tempzoneFourFiveSixTemp_thread_64;//sysj\ECS.sysj line: 408, column: 8
                  active[64]=1;
                  ends[64]=1;
                  tdone[64]=1;
                }
                else {
                  S202141=2;
                  if(humidityzoneFourFiveSix_thread_64 > currentHumidity_thread_64){//sysj\ECS.sysj line: 415, column: 11
                    S202169=0;
                    System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 416, column: 14
                    zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 417, column: 11
                    currsigs.addElement(zoneFourFiveSixACONOFF);
                    currentHumidity_thread_64 = humidityzoneFourFiveSix_thread_64;//sysj\ECS.sysj line: 418, column: 14
                    active[64]=1;
                    ends[64]=1;
                    tdone[64]=1;
                  }
                  else {
                    S202169=1;
                    if(humidityzoneFourFiveSix_thread_64 < currentHumidity_thread_64){//sysj\ECS.sysj line: 423, column: 21
                      System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 424, column: 14
                      zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 425, column: 11
                      currsigs.addElement(zoneFourFiveSixACONOFF);
                      currentHumidity_thread_64 = humidityzoneFourFiveSix_thread_64;//sysj\ECS.sysj line: 426, column: 14
                      active[64]=1;
                      ends[64]=1;
                      tdone[64]=1;
                    }
                    else {
                      S202195=1;
                      active[64]=1;
                      ends[64]=1;
                      tdone[64]=1;
                    }
                  }
                }
              }
            }
            else {
              S202195=1;
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207600(int [] tdone, int [] ends){
        switch(S202139){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        switch(S201863){
          case 0 : 
            switch(S201809){
              case 0 : 
                if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 343, column: 15
                  System.out.println("Current Temp for Zone 2,3:" + currentTemp_thread_63 + "(°C)");//sysj\ECS.sysj line: 344, column: 8
                  System.out.println("\n-------------------------");//sysj\ECS.sysj line: 345, column: 8
                  S201809=1;
                  if(tempzoneTwoThree_thread_63 < currentTemp_thread_63){//sysj\ECS.sysj line: 348, column: 11
                    System.out.println("Turning ON Fan to Cool Down for Zone 2,3");//sysj\ECS.sysj line: 349, column: 8
                    zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 350, column: 8
                    currsigs.addElement(zoneTwoThreeFanONOFF);
                    currentTemp_thread_63 = tempzoneTwoThree_thread_63;//sysj\ECS.sysj line: 351, column: 8
                    active[63]=1;
                    ends[63]=1;
                    tdone[63]=1;
                  }
                  else {
                    S201809=2;
                    if(humidityzoneTwoThree_thread_63 > currentHumidity_thread_63){//sysj\ECS.sysj line: 359, column: 11
                      S201837=0;
                      System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 360, column: 14
                      zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 361, column: 8
                      currsigs.addElement(zoneTwoThreeHeaterONOFF);
                      currentHumidity_thread_63 = humidityzoneTwoThree_thread_63;//sysj\ECS.sysj line: 362, column: 14
                      active[63]=1;
                      ends[63]=1;
                      tdone[63]=1;
                    }
                    else {
                      S201837=1;
                      if(humidityzoneTwoThree_thread_63 < currentHumidity_thread_63){//sysj\ECS.sysj line: 367, column: 21
                        System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 368, column: 14
                        zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 369, column: 11
                        currsigs.addElement(zoneTwoThreeFanONOFF);
                        currentHumidity_thread_63 = humidityzoneTwoThree_thread_63;//sysj\ECS.sysj line: 370, column: 14
                        active[63]=1;
                        ends[63]=1;
                        tdone[63]=1;
                      }
                      else {
                        S201863=1;
                        active[63]=1;
                        ends[63]=1;
                        tdone[63]=1;
                      }
                    }
                  }
                }
                else {
                  active[63]=1;
                  ends[63]=1;
                  tdone[63]=1;
                }
                break;
              
              case 1 : 
                if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 354, column: 15
                  System.out.println("Current Temp for Zone 2,3:" + currentTemp_thread_63 + "(°C)");//sysj\ECS.sysj line: 355, column: 8
                  System.out.println("\n-------------------------");//sysj\ECS.sysj line: 356, column: 8
                  S201809=2;
                  if(humidityzoneTwoThree_thread_63 > currentHumidity_thread_63){//sysj\ECS.sysj line: 359, column: 11
                    S201837=0;
                    System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 360, column: 14
                    zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 361, column: 8
                    currsigs.addElement(zoneTwoThreeHeaterONOFF);
                    currentHumidity_thread_63 = humidityzoneTwoThree_thread_63;//sysj\ECS.sysj line: 362, column: 14
                    active[63]=1;
                    ends[63]=1;
                    tdone[63]=1;
                  }
                  else {
                    S201837=1;
                    if(humidityzoneTwoThree_thread_63 < currentHumidity_thread_63){//sysj\ECS.sysj line: 367, column: 21
                      System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 368, column: 14
                      zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 369, column: 11
                      currsigs.addElement(zoneTwoThreeFanONOFF);
                      currentHumidity_thread_63 = humidityzoneTwoThree_thread_63;//sysj\ECS.sysj line: 370, column: 14
                      active[63]=1;
                      ends[63]=1;
                      tdone[63]=1;
                    }
                    else {
                      S201863=1;
                      active[63]=1;
                      ends[63]=1;
                      tdone[63]=1;
                    }
                  }
                }
                else {
                  active[63]=1;
                  ends[63]=1;
                  tdone[63]=1;
                }
                break;
              
              case 2 : 
                switch(S201837){
                  case 0 : 
                    if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 364, column: 15
                      System.out.println("Current Humidity For Zone 2,3: " + currentHumidity_thread_63 + "(%)");//sysj\ECS.sysj line: 365, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 366, column: 11
                      S201863=1;
                      active[63]=1;
                      ends[63]=1;
                      tdone[63]=1;
                    }
                    else {
                      active[63]=1;
                      ends[63]=1;
                      tdone[63]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 373, column: 15
                      System.out.println("Current Humidity For Zone 2,3: " + currentHumidity_thread_63 + "(%)");//sysj\ECS.sysj line: 374, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 375, column: 11
                      S201863=1;
                      active[63]=1;
                      ends[63]=1;
                      tdone[63]=1;
                    }
                    else {
                      active[63]=1;
                      ends[63]=1;
                      tdone[63]=1;
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 1 : 
            S201863=1;
            S201863=0;
            if(workhrs_60.getprestatus()){//sysj\ECS.sysj line: 334, column: 12
              tempzoneTwoThree_thread_63 = (Integer)(zoneTwoThreeTemp.getpreval() == null ? 0 : ((Integer)zoneTwoThreeTemp.getpreval()).intValue());//sysj\ECS.sysj line: 335, column: 7
              humidityzoneTwoThree_thread_63 = (Integer)(zoneTwoThreeHumid.getpreval() == null ? 0 : ((Integer)zoneTwoThreeHumid.getpreval()).intValue());//sysj\ECS.sysj line: 336, column: 7
              S201809=0;
              if(tempzoneTwoThree_thread_63 > currentTemp_thread_63){//sysj\ECS.sysj line: 338, column: 11
                System.out.println("Turning ON Heater to Heat Up for Zone 2,3");//sysj\ECS.sysj line: 339, column: 8
                zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 340, column: 8
                currsigs.addElement(zoneTwoThreeHeaterONOFF);
                currentTemp_thread_63 = tempzoneTwoThree_thread_63;//sysj\ECS.sysj line: 341, column: 8
                active[63]=1;
                ends[63]=1;
                tdone[63]=1;
              }
              else {
                S201809=1;
                if(tempzoneTwoThree_thread_63 < currentTemp_thread_63){//sysj\ECS.sysj line: 348, column: 11
                  System.out.println("Turning ON Fan to Cool Down for Zone 2,3");//sysj\ECS.sysj line: 349, column: 8
                  zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 350, column: 8
                  currsigs.addElement(zoneTwoThreeFanONOFF);
                  currentTemp_thread_63 = tempzoneTwoThree_thread_63;//sysj\ECS.sysj line: 351, column: 8
                  active[63]=1;
                  ends[63]=1;
                  tdone[63]=1;
                }
                else {
                  S201809=2;
                  if(humidityzoneTwoThree_thread_63 > currentHumidity_thread_63){//sysj\ECS.sysj line: 359, column: 11
                    S201837=0;
                    System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 360, column: 14
                    zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 361, column: 8
                    currsigs.addElement(zoneTwoThreeHeaterONOFF);
                    currentHumidity_thread_63 = humidityzoneTwoThree_thread_63;//sysj\ECS.sysj line: 362, column: 14
                    active[63]=1;
                    ends[63]=1;
                    tdone[63]=1;
                  }
                  else {
                    S201837=1;
                    if(humidityzoneTwoThree_thread_63 < currentHumidity_thread_63){//sysj\ECS.sysj line: 367, column: 21
                      System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 368, column: 14
                      zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 369, column: 11
                      currsigs.addElement(zoneTwoThreeFanONOFF);
                      currentHumidity_thread_63 = humidityzoneTwoThree_thread_63;//sysj\ECS.sysj line: 370, column: 14
                      active[63]=1;
                      ends[63]=1;
                      tdone[63]=1;
                    }
                    else {
                      S201863=1;
                      active[63]=1;
                      ends[63]=1;
                      tdone[63]=1;
                    }
                  }
                }
              }
            }
            else {
              S201863=1;
              active[63]=1;
              ends[63]=1;
              tdone[63]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207599(int [] tdone, int [] ends){
        switch(S201807){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        switch(S197685){
          case 0 : 
            switch(S197726){
              case 0 : 
                switch(S197693){
                  case 0 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 232, column: 15
                      System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_62 + "(°C)");//sysj\ECS.sysj line: 233, column: 8
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 234, column: 8
                      S197726=1;
                      if(humidityZoneOneSeven_thread_62 > currentHumidity_thread_62){//sysj\ECS.sysj line: 248, column: 11
                        S197701=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 249, column: 14
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 250, column: 14
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 251, column: 14
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                      else {
                        S197701=1;
                        if(humidityZoneOneSeven_thread_62 < currentHumidity_thread_62){//sysj\ECS.sysj line: 256, column: 21
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 257, column: 14
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 258, column: 14
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 259, column: 14
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                        else {
                          S197685=1;
                          if(afterhrs_60.getprestatus()){//sysj\ECS.sysj line: 267, column: 15
                            zoneOneOcc_thread_62 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 269, column: 14
                            zoneSevenOcc_thread_62 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 270, column: 14
                            if(zoneOneOcc_thread_62 > 0 || zoneSevenOcc_thread_62 > 0){//sysj\ECS.sysj line: 272, column: 18
                              S197811=0;
                              if(tempZoneOneSeven_thread_62 > currentTemp_thread_62){//sysj\ECS.sysj line: 275, column: 22
                                S197778=0;
                                System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 276, column: 13
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 277, column: 13
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 278, column: 13
                                active[62]=1;
                                ends[62]=1;
                                tdone[62]=1;
                              }
                              else {
                                S197778=1;
                                if(tempZoneOneSeven_thread_62 < currentTemp_thread_62){//sysj\ECS.sysj line: 286, column: 21
                                  System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 287, column: 13
                                  currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 288, column: 13
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 289, column: 16
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  active[62]=1;
                                  ends[62]=1;
                                  tdone[62]=1;
                                }
                                else {
                                  S197811=1;
                                  if(humidityZoneOneSeven_thread_62 > currentHumidity_thread_62){//sysj\ECS.sysj line: 296, column: 16
                                    S197786=0;
                                    System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 297, column: 19
                                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 298, column: 19
                                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                                    currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 299, column: 19
                                    active[62]=1;
                                    ends[62]=1;
                                    tdone[62]=1;
                                  }
                                  else {
                                    S197786=1;
                                    if(humidityZoneOneSeven_thread_62 < currentHumidity_thread_62){//sysj\ECS.sysj line: 304, column: 26
                                      System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 305, column: 19
                                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 306, column: 19
                                      currsigs.addElement(zoneOneSevenFanONOFF);
                                      currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 307, column: 19
                                      active[62]=1;
                                      ends[62]=1;
                                      tdone[62]=1;
                                    }
                                    else {
                                      S197685=2;
                                      active[62]=1;
                                      ends[62]=1;
                                      tdone[62]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S197685=2;
                              active[62]=1;
                              ends[62]=1;
                              tdone[62]=1;
                            }
                          }
                          else {
                            S197685=2;
                            active[62]=1;
                            ends[62]=1;
                            tdone[62]=1;
                          }
                        }
                      }
                    }
                    else {
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 243, column: 18
                      System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_62 + "(°C)");//sysj\ECS.sysj line: 244, column: 8
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 245, column: 8
                      S197726=1;
                      if(humidityZoneOneSeven_thread_62 > currentHumidity_thread_62){//sysj\ECS.sysj line: 248, column: 11
                        S197701=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 249, column: 14
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 250, column: 14
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 251, column: 14
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                      else {
                        S197701=1;
                        if(humidityZoneOneSeven_thread_62 < currentHumidity_thread_62){//sysj\ECS.sysj line: 256, column: 21
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 257, column: 14
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 258, column: 14
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 259, column: 14
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                        else {
                          S197685=1;
                          if(afterhrs_60.getprestatus()){//sysj\ECS.sysj line: 267, column: 15
                            zoneOneOcc_thread_62 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 269, column: 14
                            zoneSevenOcc_thread_62 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 270, column: 14
                            if(zoneOneOcc_thread_62 > 0 || zoneSevenOcc_thread_62 > 0){//sysj\ECS.sysj line: 272, column: 18
                              S197811=0;
                              if(tempZoneOneSeven_thread_62 > currentTemp_thread_62){//sysj\ECS.sysj line: 275, column: 22
                                S197778=0;
                                System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 276, column: 13
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 277, column: 13
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 278, column: 13
                                active[62]=1;
                                ends[62]=1;
                                tdone[62]=1;
                              }
                              else {
                                S197778=1;
                                if(tempZoneOneSeven_thread_62 < currentTemp_thread_62){//sysj\ECS.sysj line: 286, column: 21
                                  System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 287, column: 13
                                  currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 288, column: 13
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 289, column: 16
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  active[62]=1;
                                  ends[62]=1;
                                  tdone[62]=1;
                                }
                                else {
                                  S197811=1;
                                  if(humidityZoneOneSeven_thread_62 > currentHumidity_thread_62){//sysj\ECS.sysj line: 296, column: 16
                                    S197786=0;
                                    System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 297, column: 19
                                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 298, column: 19
                                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                                    currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 299, column: 19
                                    active[62]=1;
                                    ends[62]=1;
                                    tdone[62]=1;
                                  }
                                  else {
                                    S197786=1;
                                    if(humidityZoneOneSeven_thread_62 < currentHumidity_thread_62){//sysj\ECS.sysj line: 304, column: 26
                                      System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 305, column: 19
                                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 306, column: 19
                                      currsigs.addElement(zoneOneSevenFanONOFF);
                                      currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 307, column: 19
                                      active[62]=1;
                                      ends[62]=1;
                                      tdone[62]=1;
                                    }
                                    else {
                                      S197685=2;
                                      active[62]=1;
                                      ends[62]=1;
                                      tdone[62]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S197685=2;
                              active[62]=1;
                              ends[62]=1;
                              tdone[62]=1;
                            }
                          }
                          else {
                            S197685=2;
                            active[62]=1;
                            ends[62]=1;
                            tdone[62]=1;
                          }
                        }
                      }
                    }
                    else {
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S197701){
                  case 0 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 253, column: 18
                      System.out.println("Current Humidity For Zone 1,7: " + currentHumidity_thread_62 + "(%)");//sysj\ECS.sysj line: 254, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 255, column: 11
                      S197685=1;
                      if(afterhrs_60.getprestatus()){//sysj\ECS.sysj line: 267, column: 15
                        zoneOneOcc_thread_62 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 269, column: 14
                        zoneSevenOcc_thread_62 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 270, column: 14
                        if(zoneOneOcc_thread_62 > 0 || zoneSevenOcc_thread_62 > 0){//sysj\ECS.sysj line: 272, column: 18
                          S197811=0;
                          if(tempZoneOneSeven_thread_62 > currentTemp_thread_62){//sysj\ECS.sysj line: 275, column: 22
                            S197778=0;
                            System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 276, column: 13
                            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 277, column: 13
                            currsigs.addElement(zoneOneSevenHeaterONOFF);
                            currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 278, column: 13
                            active[62]=1;
                            ends[62]=1;
                            tdone[62]=1;
                          }
                          else {
                            S197778=1;
                            if(tempZoneOneSeven_thread_62 < currentTemp_thread_62){//sysj\ECS.sysj line: 286, column: 21
                              System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 287, column: 13
                              currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 288, column: 13
                              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 289, column: 16
                              currsigs.addElement(zoneOneSevenFanONOFF);
                              active[62]=1;
                              ends[62]=1;
                              tdone[62]=1;
                            }
                            else {
                              S197811=1;
                              if(humidityZoneOneSeven_thread_62 > currentHumidity_thread_62){//sysj\ECS.sysj line: 296, column: 16
                                S197786=0;
                                System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 297, column: 19
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 298, column: 19
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 299, column: 19
                                active[62]=1;
                                ends[62]=1;
                                tdone[62]=1;
                              }
                              else {
                                S197786=1;
                                if(humidityZoneOneSeven_thread_62 < currentHumidity_thread_62){//sysj\ECS.sysj line: 304, column: 26
                                  System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 305, column: 19
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 306, column: 19
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 307, column: 19
                                  active[62]=1;
                                  ends[62]=1;
                                  tdone[62]=1;
                                }
                                else {
                                  S197685=2;
                                  active[62]=1;
                                  ends[62]=1;
                                  tdone[62]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S197685=2;
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                      }
                      else {
                        S197685=2;
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                    }
                    else {
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 261, column: 18
                      System.out.println("Current Humidity For Zone 1,7: " + currentHumidity_thread_62 + "(%)");//sysj\ECS.sysj line: 262, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 263, column: 11
                      S197685=1;
                      if(afterhrs_60.getprestatus()){//sysj\ECS.sysj line: 267, column: 15
                        zoneOneOcc_thread_62 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 269, column: 14
                        zoneSevenOcc_thread_62 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 270, column: 14
                        if(zoneOneOcc_thread_62 > 0 || zoneSevenOcc_thread_62 > 0){//sysj\ECS.sysj line: 272, column: 18
                          S197811=0;
                          if(tempZoneOneSeven_thread_62 > currentTemp_thread_62){//sysj\ECS.sysj line: 275, column: 22
                            S197778=0;
                            System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 276, column: 13
                            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 277, column: 13
                            currsigs.addElement(zoneOneSevenHeaterONOFF);
                            currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 278, column: 13
                            active[62]=1;
                            ends[62]=1;
                            tdone[62]=1;
                          }
                          else {
                            S197778=1;
                            if(tempZoneOneSeven_thread_62 < currentTemp_thread_62){//sysj\ECS.sysj line: 286, column: 21
                              System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 287, column: 13
                              currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 288, column: 13
                              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 289, column: 16
                              currsigs.addElement(zoneOneSevenFanONOFF);
                              active[62]=1;
                              ends[62]=1;
                              tdone[62]=1;
                            }
                            else {
                              S197811=1;
                              if(humidityZoneOneSeven_thread_62 > currentHumidity_thread_62){//sysj\ECS.sysj line: 296, column: 16
                                S197786=0;
                                System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 297, column: 19
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 298, column: 19
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 299, column: 19
                                active[62]=1;
                                ends[62]=1;
                                tdone[62]=1;
                              }
                              else {
                                S197786=1;
                                if(humidityZoneOneSeven_thread_62 < currentHumidity_thread_62){//sysj\ECS.sysj line: 304, column: 26
                                  System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 305, column: 19
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 306, column: 19
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 307, column: 19
                                  active[62]=1;
                                  ends[62]=1;
                                  tdone[62]=1;
                                }
                                else {
                                  S197685=2;
                                  active[62]=1;
                                  ends[62]=1;
                                  tdone[62]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S197685=2;
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                      }
                      else {
                        S197685=2;
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                    }
                    else {
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S197811){
              case 0 : 
                switch(S197778){
                  case 0 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 280, column: 20
                      System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_62 + "(°C)");//sysj\ECS.sysj line: 281, column: 13
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 282, column: 13
                      S197811=1;
                      if(humidityZoneOneSeven_thread_62 > currentHumidity_thread_62){//sysj\ECS.sysj line: 296, column: 16
                        S197786=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 297, column: 19
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 298, column: 19
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 299, column: 19
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                      else {
                        S197786=1;
                        if(humidityZoneOneSeven_thread_62 < currentHumidity_thread_62){//sysj\ECS.sysj line: 304, column: 26
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 305, column: 19
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 306, column: 19
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 307, column: 19
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                        else {
                          S197685=2;
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                      }
                    }
                    else {
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 291, column: 23
                      System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_62 + "(°C)");//sysj\ECS.sysj line: 292, column: 13
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 293, column: 13
                      S197811=1;
                      if(humidityZoneOneSeven_thread_62 > currentHumidity_thread_62){//sysj\ECS.sysj line: 296, column: 16
                        S197786=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 297, column: 19
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 298, column: 19
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 299, column: 19
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                      else {
                        S197786=1;
                        if(humidityZoneOneSeven_thread_62 < currentHumidity_thread_62){//sysj\ECS.sysj line: 304, column: 26
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 305, column: 19
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 306, column: 19
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 307, column: 19
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                        else {
                          S197685=2;
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                      }
                    }
                    else {
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S197786){
                  case 0 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 301, column: 23
                      System.out.println("Current Humidity For Zone 1,7: " + currentHumidity_thread_62 + "(%)");//sysj\ECS.sysj line: 302, column: 19
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 303, column: 16
                      S197685=2;
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    else {
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 309, column: 23
                      System.out.println("Current Humidity For Zone 1,7: " + currentHumidity_thread_62 + "(%)");//sysj\ECS.sysj line: 310, column: 19
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 311, column: 16
                      S197685=2;
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    else {
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 2 : 
            S197685=2;
            tempZoneOneSeven_thread_62 = (Integer)(zoneOneSevenTemp.getpreval() == null ? 0 : ((Integer)zoneOneSevenTemp.getpreval()).intValue());//sysj\ECS.sysj line: 221, column: 4
            humidityZoneOneSeven_thread_62 = (Integer)(zoneOneSevenHumid.getpreval() == null ? 0 : ((Integer)zoneOneSevenHumid.getpreval()).intValue());//sysj\ECS.sysj line: 222, column: 4
            S197685=0;
            if(workhrs_60.getprestatus()){//sysj\ECS.sysj line: 224, column: 15
              S197726=0;
              if(tempZoneOneSeven_thread_62 > currentTemp_thread_62){//sysj\ECS.sysj line: 227, column: 11
                S197693=0;
                System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 228, column: 8
                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 229, column: 8
                currsigs.addElement(zoneOneSevenHeaterONOFF);
                currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 230, column: 8
                active[62]=1;
                ends[62]=1;
                tdone[62]=1;
              }
              else {
                S197693=1;
                if(tempZoneOneSeven_thread_62 < currentTemp_thread_62){//sysj\ECS.sysj line: 238, column: 16
                  System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 239, column: 8
                  currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 240, column: 8
                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 241, column: 11
                  currsigs.addElement(zoneOneSevenFanONOFF);
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
                else {
                  S197726=1;
                  if(humidityZoneOneSeven_thread_62 > currentHumidity_thread_62){//sysj\ECS.sysj line: 248, column: 11
                    S197701=0;
                    System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 249, column: 14
                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 250, column: 14
                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                    currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 251, column: 14
                    active[62]=1;
                    ends[62]=1;
                    tdone[62]=1;
                  }
                  else {
                    S197701=1;
                    if(humidityZoneOneSeven_thread_62 < currentHumidity_thread_62){//sysj\ECS.sysj line: 256, column: 21
                      System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 257, column: 14
                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 258, column: 14
                      currsigs.addElement(zoneOneSevenFanONOFF);
                      currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 259, column: 14
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    else {
                      S197685=1;
                      if(afterhrs_60.getprestatus()){//sysj\ECS.sysj line: 267, column: 15
                        zoneOneOcc_thread_62 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 269, column: 14
                        zoneSevenOcc_thread_62 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 270, column: 14
                        if(zoneOneOcc_thread_62 > 0 || zoneSevenOcc_thread_62 > 0){//sysj\ECS.sysj line: 272, column: 18
                          S197811=0;
                          if(tempZoneOneSeven_thread_62 > currentTemp_thread_62){//sysj\ECS.sysj line: 275, column: 22
                            S197778=0;
                            System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 276, column: 13
                            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 277, column: 13
                            currsigs.addElement(zoneOneSevenHeaterONOFF);
                            currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 278, column: 13
                            active[62]=1;
                            ends[62]=1;
                            tdone[62]=1;
                          }
                          else {
                            S197778=1;
                            if(tempZoneOneSeven_thread_62 < currentTemp_thread_62){//sysj\ECS.sysj line: 286, column: 21
                              System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 287, column: 13
                              currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 288, column: 13
                              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 289, column: 16
                              currsigs.addElement(zoneOneSevenFanONOFF);
                              active[62]=1;
                              ends[62]=1;
                              tdone[62]=1;
                            }
                            else {
                              S197811=1;
                              if(humidityZoneOneSeven_thread_62 > currentHumidity_thread_62){//sysj\ECS.sysj line: 296, column: 16
                                S197786=0;
                                System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 297, column: 19
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 298, column: 19
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 299, column: 19
                                active[62]=1;
                                ends[62]=1;
                                tdone[62]=1;
                              }
                              else {
                                S197786=1;
                                if(humidityZoneOneSeven_thread_62 < currentHumidity_thread_62){//sysj\ECS.sysj line: 304, column: 26
                                  System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 305, column: 19
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 306, column: 19
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 307, column: 19
                                  active[62]=1;
                                  ends[62]=1;
                                  tdone[62]=1;
                                }
                                else {
                                  S197685=2;
                                  active[62]=1;
                                  ends[62]=1;
                                  tdone[62]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S197685=2;
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                      }
                      else {
                        S197685=2;
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                    }
                  }
                }
              }
            }
            else {
              S197685=1;
              if(afterhrs_60.getprestatus()){//sysj\ECS.sysj line: 267, column: 15
                zoneOneOcc_thread_62 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 269, column: 14
                zoneSevenOcc_thread_62 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 270, column: 14
                if(zoneOneOcc_thread_62 > 0 || zoneSevenOcc_thread_62 > 0){//sysj\ECS.sysj line: 272, column: 18
                  S197811=0;
                  if(tempZoneOneSeven_thread_62 > currentTemp_thread_62){//sysj\ECS.sysj line: 275, column: 22
                    S197778=0;
                    System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 276, column: 13
                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 277, column: 13
                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                    currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 278, column: 13
                    active[62]=1;
                    ends[62]=1;
                    tdone[62]=1;
                  }
                  else {
                    S197778=1;
                    if(tempZoneOneSeven_thread_62 < currentTemp_thread_62){//sysj\ECS.sysj line: 286, column: 21
                      System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 287, column: 13
                      currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 288, column: 13
                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 289, column: 16
                      currsigs.addElement(zoneOneSevenFanONOFF);
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    else {
                      S197811=1;
                      if(humidityZoneOneSeven_thread_62 > currentHumidity_thread_62){//sysj\ECS.sysj line: 296, column: 16
                        S197786=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 297, column: 19
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 298, column: 19
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 299, column: 19
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                      else {
                        S197786=1;
                        if(humidityZoneOneSeven_thread_62 < currentHumidity_thread_62){//sysj\ECS.sysj line: 304, column: 26
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 305, column: 19
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 306, column: 19
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 307, column: 19
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                        else {
                          S197685=2;
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  S197685=2;
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
              }
              else {
                S197685=2;
                active[62]=1;
                ends[62]=1;
                tdone[62]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread207598(int [] tdone, int [] ends){
        switch(S197683){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        if(currentTime.getprestatus()){//sysj\ECS.sysj line: 200, column: 12
          currentHour_thread_61 = (Integer)(currentTime.getpreval() == null ? 0 : ((Integer)currentTime.getpreval()).intValue());//sysj\ECS.sysj line: 201, column: 6
          if(currentHour_thread_61 >= 9 && currentHour_thread_61 <= 17){//sysj\ECS.sysj line: 203, column: 14
            workhrs_60.setPresent();//sysj\ECS.sysj line: 204, column: 14
            currsigs.addElement(workhrs_60);
            active[61]=1;
            ends[61]=1;
            tdone[61]=1;
          }
          else {
            afterhrs_60.setPresent();//sysj\ECS.sysj line: 206, column: 14
            currsigs.addElement(afterhrs_60);
            active[61]=1;
            ends[61]=1;
            tdone[61]=1;
          }
        }
        else {
          active[61]=1;
          ends[61]=1;
          tdone[61]=1;
        }
        break;
      
    }
  }

  public void thread207596(int [] tdone, int [] ends){
        S202471=1;
    currentTemp_thread_64 = 0;//sysj\ECS.sysj line: 385, column: 2
    currentHumidity_thread_64 = 0;//sysj\ECS.sysj line: 386, column: 2
    System.out.println("Current Temp For Zone 4,5,6: " + currentTemp_thread_64);//sysj\ECS.sysj line: 387, column: 2
    S202195=0;
    if(workhrs_60.getprestatus()){//sysj\ECS.sysj line: 391, column: 12
      tempzoneFourFiveSixTemp_thread_64 = (Integer)(zoneFourFiveSixTemp.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixTemp.getpreval()).intValue());//sysj\ECS.sysj line: 392, column: 7
      humidityzoneFourFiveSix_thread_64 = (Integer)(zoneFourFiveSixHumid.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixHumid.getpreval()).intValue());//sysj\ECS.sysj line: 393, column: 7
      S202141=0;
      if(tempzoneFourFiveSixTemp_thread_64 > currentTemp_thread_64){//sysj\ECS.sysj line: 395, column: 11
        System.out.println("Turning ON AC to Heat Up for Zone 4,5,6");//sysj\ECS.sysj line: 396, column: 8
        zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 397, column: 8
        currsigs.addElement(zoneFourFiveSixACONOFF);
        currentTemp_thread_64 = tempzoneFourFiveSixTemp_thread_64;//sysj\ECS.sysj line: 398, column: 8
        active[64]=1;
        ends[64]=1;
        tdone[64]=1;
      }
      else {
        S202141=1;
        if(tempzoneFourFiveSixTemp_thread_64 < currentTemp_thread_64){//sysj\ECS.sysj line: 405, column: 11
          System.out.println("Turning ON AC to Cool Down for Zone 4,5,6");//sysj\ECS.sysj line: 406, column: 8
          zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 407, column: 8
          currsigs.addElement(zoneFourFiveSixACONOFF);
          currentTemp_thread_64 = tempzoneFourFiveSixTemp_thread_64;//sysj\ECS.sysj line: 408, column: 8
          active[64]=1;
          ends[64]=1;
          tdone[64]=1;
        }
        else {
          S202141=2;
          if(humidityzoneFourFiveSix_thread_64 > currentHumidity_thread_64){//sysj\ECS.sysj line: 415, column: 11
            S202169=0;
            System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 416, column: 14
            zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 417, column: 11
            currsigs.addElement(zoneFourFiveSixACONOFF);
            currentHumidity_thread_64 = humidityzoneFourFiveSix_thread_64;//sysj\ECS.sysj line: 418, column: 14
            active[64]=1;
            ends[64]=1;
            tdone[64]=1;
          }
          else {
            S202169=1;
            if(humidityzoneFourFiveSix_thread_64 < currentHumidity_thread_64){//sysj\ECS.sysj line: 423, column: 21
              System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 424, column: 14
              zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 425, column: 11
              currsigs.addElement(zoneFourFiveSixACONOFF);
              currentHumidity_thread_64 = humidityzoneFourFiveSix_thread_64;//sysj\ECS.sysj line: 426, column: 14
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            else {
              S202195=1;
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
          }
        }
      }
    }
    else {
      S202195=1;
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
  }

  public void thread207595(int [] tdone, int [] ends){
        S202139=1;
    currentTemp_thread_63 = 0;//sysj\ECS.sysj line: 328, column: 2
    currentHumidity_thread_63 = 0;//sysj\ECS.sysj line: 329, column: 2
    System.out.println("Current Temp For Zone 2,3: " + currentTemp_thread_63);//sysj\ECS.sysj line: 330, column: 2
    S201863=0;
    if(workhrs_60.getprestatus()){//sysj\ECS.sysj line: 334, column: 12
      tempzoneTwoThree_thread_63 = (Integer)(zoneTwoThreeTemp.getpreval() == null ? 0 : ((Integer)zoneTwoThreeTemp.getpreval()).intValue());//sysj\ECS.sysj line: 335, column: 7
      humidityzoneTwoThree_thread_63 = (Integer)(zoneTwoThreeHumid.getpreval() == null ? 0 : ((Integer)zoneTwoThreeHumid.getpreval()).intValue());//sysj\ECS.sysj line: 336, column: 7
      S201809=0;
      if(tempzoneTwoThree_thread_63 > currentTemp_thread_63){//sysj\ECS.sysj line: 338, column: 11
        System.out.println("Turning ON Heater to Heat Up for Zone 2,3");//sysj\ECS.sysj line: 339, column: 8
        zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 340, column: 8
        currsigs.addElement(zoneTwoThreeHeaterONOFF);
        currentTemp_thread_63 = tempzoneTwoThree_thread_63;//sysj\ECS.sysj line: 341, column: 8
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
      }
      else {
        S201809=1;
        if(tempzoneTwoThree_thread_63 < currentTemp_thread_63){//sysj\ECS.sysj line: 348, column: 11
          System.out.println("Turning ON Fan to Cool Down for Zone 2,3");//sysj\ECS.sysj line: 349, column: 8
          zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 350, column: 8
          currsigs.addElement(zoneTwoThreeFanONOFF);
          currentTemp_thread_63 = tempzoneTwoThree_thread_63;//sysj\ECS.sysj line: 351, column: 8
          active[63]=1;
          ends[63]=1;
          tdone[63]=1;
        }
        else {
          S201809=2;
          if(humidityzoneTwoThree_thread_63 > currentHumidity_thread_63){//sysj\ECS.sysj line: 359, column: 11
            S201837=0;
            System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 360, column: 14
            zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 361, column: 8
            currsigs.addElement(zoneTwoThreeHeaterONOFF);
            currentHumidity_thread_63 = humidityzoneTwoThree_thread_63;//sysj\ECS.sysj line: 362, column: 14
            active[63]=1;
            ends[63]=1;
            tdone[63]=1;
          }
          else {
            S201837=1;
            if(humidityzoneTwoThree_thread_63 < currentHumidity_thread_63){//sysj\ECS.sysj line: 367, column: 21
              System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 368, column: 14
              zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 369, column: 11
              currsigs.addElement(zoneTwoThreeFanONOFF);
              currentHumidity_thread_63 = humidityzoneTwoThree_thread_63;//sysj\ECS.sysj line: 370, column: 14
              active[63]=1;
              ends[63]=1;
              tdone[63]=1;
            }
            else {
              S201863=1;
              active[63]=1;
              ends[63]=1;
              tdone[63]=1;
            }
          }
        }
      }
    }
    else {
      S201863=1;
      active[63]=1;
      ends[63]=1;
      tdone[63]=1;
    }
  }

  public void thread207594(int [] tdone, int [] ends){
        S201807=1;
    currentTemp_thread_62 = 0;//sysj\ECS.sysj line: 216, column: 2
    currentHumidity_thread_62 = 0;//sysj\ECS.sysj line: 217, column: 2
    System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_62);//sysj\ECS.sysj line: 218, column: 2
    tempZoneOneSeven_thread_62 = (Integer)(zoneOneSevenTemp.getpreval() == null ? 0 : ((Integer)zoneOneSevenTemp.getpreval()).intValue());//sysj\ECS.sysj line: 221, column: 4
    humidityZoneOneSeven_thread_62 = (Integer)(zoneOneSevenHumid.getpreval() == null ? 0 : ((Integer)zoneOneSevenHumid.getpreval()).intValue());//sysj\ECS.sysj line: 222, column: 4
    S197685=0;
    if(workhrs_60.getprestatus()){//sysj\ECS.sysj line: 224, column: 15
      S197726=0;
      if(tempZoneOneSeven_thread_62 > currentTemp_thread_62){//sysj\ECS.sysj line: 227, column: 11
        S197693=0;
        System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 228, column: 8
        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 229, column: 8
        currsigs.addElement(zoneOneSevenHeaterONOFF);
        currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 230, column: 8
        active[62]=1;
        ends[62]=1;
        tdone[62]=1;
      }
      else {
        S197693=1;
        if(tempZoneOneSeven_thread_62 < currentTemp_thread_62){//sysj\ECS.sysj line: 238, column: 16
          System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 239, column: 8
          currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 240, column: 8
          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 241, column: 11
          currsigs.addElement(zoneOneSevenFanONOFF);
          active[62]=1;
          ends[62]=1;
          tdone[62]=1;
        }
        else {
          S197726=1;
          if(humidityZoneOneSeven_thread_62 > currentHumidity_thread_62){//sysj\ECS.sysj line: 248, column: 11
            S197701=0;
            System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 249, column: 14
            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 250, column: 14
            currsigs.addElement(zoneOneSevenHeaterONOFF);
            currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 251, column: 14
            active[62]=1;
            ends[62]=1;
            tdone[62]=1;
          }
          else {
            S197701=1;
            if(humidityZoneOneSeven_thread_62 < currentHumidity_thread_62){//sysj\ECS.sysj line: 256, column: 21
              System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 257, column: 14
              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 258, column: 14
              currsigs.addElement(zoneOneSevenFanONOFF);
              currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 259, column: 14
              active[62]=1;
              ends[62]=1;
              tdone[62]=1;
            }
            else {
              S197685=1;
              if(afterhrs_60.getprestatus()){//sysj\ECS.sysj line: 267, column: 15
                zoneOneOcc_thread_62 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 269, column: 14
                zoneSevenOcc_thread_62 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 270, column: 14
                if(zoneOneOcc_thread_62 > 0 || zoneSevenOcc_thread_62 > 0){//sysj\ECS.sysj line: 272, column: 18
                  S197811=0;
                  if(tempZoneOneSeven_thread_62 > currentTemp_thread_62){//sysj\ECS.sysj line: 275, column: 22
                    S197778=0;
                    System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 276, column: 13
                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 277, column: 13
                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                    currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 278, column: 13
                    active[62]=1;
                    ends[62]=1;
                    tdone[62]=1;
                  }
                  else {
                    S197778=1;
                    if(tempZoneOneSeven_thread_62 < currentTemp_thread_62){//sysj\ECS.sysj line: 286, column: 21
                      System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 287, column: 13
                      currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 288, column: 13
                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 289, column: 16
                      currsigs.addElement(zoneOneSevenFanONOFF);
                      active[62]=1;
                      ends[62]=1;
                      tdone[62]=1;
                    }
                    else {
                      S197811=1;
                      if(humidityZoneOneSeven_thread_62 > currentHumidity_thread_62){//sysj\ECS.sysj line: 296, column: 16
                        S197786=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 297, column: 19
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 298, column: 19
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 299, column: 19
                        active[62]=1;
                        ends[62]=1;
                        tdone[62]=1;
                      }
                      else {
                        S197786=1;
                        if(humidityZoneOneSeven_thread_62 < currentHumidity_thread_62){//sysj\ECS.sysj line: 304, column: 26
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 305, column: 19
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 306, column: 19
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 307, column: 19
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                        else {
                          S197685=2;
                          active[62]=1;
                          ends[62]=1;
                          tdone[62]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  S197685=2;
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
              }
              else {
                S197685=2;
                active[62]=1;
                ends[62]=1;
                tdone[62]=1;
              }
            }
          }
        }
      }
    }
    else {
      S197685=1;
      if(afterhrs_60.getprestatus()){//sysj\ECS.sysj line: 267, column: 15
        zoneOneOcc_thread_62 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 269, column: 14
        zoneSevenOcc_thread_62 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 270, column: 14
        if(zoneOneOcc_thread_62 > 0 || zoneSevenOcc_thread_62 > 0){//sysj\ECS.sysj line: 272, column: 18
          S197811=0;
          if(tempZoneOneSeven_thread_62 > currentTemp_thread_62){//sysj\ECS.sysj line: 275, column: 22
            S197778=0;
            System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 276, column: 13
            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 277, column: 13
            currsigs.addElement(zoneOneSevenHeaterONOFF);
            currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 278, column: 13
            active[62]=1;
            ends[62]=1;
            tdone[62]=1;
          }
          else {
            S197778=1;
            if(tempZoneOneSeven_thread_62 < currentTemp_thread_62){//sysj\ECS.sysj line: 286, column: 21
              System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 287, column: 13
              currentTemp_thread_62 = tempZoneOneSeven_thread_62;//sysj\ECS.sysj line: 288, column: 13
              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 289, column: 16
              currsigs.addElement(zoneOneSevenFanONOFF);
              active[62]=1;
              ends[62]=1;
              tdone[62]=1;
            }
            else {
              S197811=1;
              if(humidityZoneOneSeven_thread_62 > currentHumidity_thread_62){//sysj\ECS.sysj line: 296, column: 16
                S197786=0;
                System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 297, column: 19
                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 298, column: 19
                currsigs.addElement(zoneOneSevenHeaterONOFF);
                currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 299, column: 19
                active[62]=1;
                ends[62]=1;
                tdone[62]=1;
              }
              else {
                S197786=1;
                if(humidityZoneOneSeven_thread_62 < currentHumidity_thread_62){//sysj\ECS.sysj line: 304, column: 26
                  System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 305, column: 19
                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 306, column: 19
                  currsigs.addElement(zoneOneSevenFanONOFF);
                  currentHumidity_thread_62 = humidityZoneOneSeven_thread_62;//sysj\ECS.sysj line: 307, column: 19
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
                else {
                  S197685=2;
                  active[62]=1;
                  ends[62]=1;
                  tdone[62]=1;
                }
              }
            }
          }
        }
        else {
          S197685=2;
          active[62]=1;
          ends[62]=1;
          tdone[62]=1;
        }
      }
      else {
        S197685=2;
        active[62]=1;
        ends[62]=1;
        tdone[62]=1;
      }
    }
  }

  public void thread207593(int [] tdone, int [] ends){
        S197683=1;
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S207278){
        case 0 : 
          S207278=0;
          break RUN;
        
        case 1 : 
          S207278=2;
          S207278=2;
          workhrs_60.setClear();//sysj\ECS.sysj line: 193, column: 2
          afterhrs_60.setClear();//sysj\ECS.sysj line: 193, column: 2
          currentTemp_thread_60 = 0;//sysj\ECS.sysj line: 196, column: 2
          previousHour_thread_60 = -1;//sysj\ECS.sysj line: 197, column: 2
          thread207593(tdone,ends);
          thread207594(tdone,ends);
          thread207595(tdone,ends);
          thread207596(tdone,ends);
          int biggest207597 = 0;
          if(ends[61]>=biggest207597){
            biggest207597=ends[61];
          }
          if(ends[62]>=biggest207597){
            biggest207597=ends[62];
          }
          if(ends[63]>=biggest207597){
            biggest207597=ends[63];
          }
          if(ends[64]>=biggest207597){
            biggest207597=ends[64];
          }
          if(biggest207597 == 1){
            active[60]=1;
            ends[60]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_60.setClear();//sysj\ECS.sysj line: 193, column: 2
          afterhrs_60.setClear();//sysj\ECS.sysj line: 193, column: 2
          thread207598(tdone,ends);
          thread207599(tdone,ends);
          thread207600(tdone,ends);
          thread207601(tdone,ends);
          int biggest207602 = 0;
          if(ends[61]>=biggest207602){
            biggest207602=ends[61];
          }
          if(ends[62]>=biggest207602){
            biggest207602=ends[62];
          }
          if(ends[63]>=biggest207602){
            biggest207602=ends[63];
          }
          if(ends[64]>=biggest207602){
            biggest207602=ends[64];
          }
          if(biggest207602 == 1){
            active[60]=1;
            ends[60]=1;
            break RUN;
          }
          //FINXME code
          if(biggest207602 == 0){
            S207278=0;
            active[60]=0;
            ends[60]=0;
            S207278=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    workhrs_60 = new Signal();
    afterhrs_60 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[60] != 0){
      int index = 60;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[60]!=0 || suspended[60]!=0 || active[60]!=1);
      else{
        if(!df){
          currentTime.gethook();
          zoneOneSevenTemp.gethook();
          zoneTwoThreeTemp.gethook();
          zoneFourFiveSixTemp.gethook();
          zoneOneSevenHumid.gethook();
          zoneTwoThreeHumid.gethook();
          zoneFourFiveSixHumid.gethook();
          zoneOneSevenAtTempHumid.gethook();
          zoneTwoThreeAtTempHumid.gethook();
          zoneFourFiveSixAtTempHumid.gethook();
          zoneOneOccupancy_B.gethook();
          zoneSevenOccupancy_B.gethook();
          df = true;
        }
        runClockDomain();
      }
      currentTime.setpreclear();
      zoneOneSevenTemp.setpreclear();
      zoneTwoThreeTemp.setpreclear();
      zoneFourFiveSixTemp.setpreclear();
      zoneOneSevenHumid.setpreclear();
      zoneTwoThreeHumid.setpreclear();
      zoneFourFiveSixHumid.setpreclear();
      zoneOneSevenAtTempHumid.setpreclear();
      zoneTwoThreeAtTempHumid.setpreclear();
      zoneFourFiveSixAtTempHumid.setpreclear();
      zoneOneOccupancy_B.setpreclear();
      zoneSevenOccupancy_B.setpreclear();
      zoneOneSevenFanONOFF.setpreclear();
      zoneTwoThreeFanONOFF.setpreclear();
      zoneFourFiveSixACONOFF.setpreclear();
      zoneOneSevenHeaterONOFF.setpreclear();
      zoneTwoThreeHeaterONOFF.setpreclear();
      workhrs_60.setpreclear();
      afterhrs_60.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = currentTime.getStatus() ? currentTime.setprepresent() : currentTime.setpreclear();
      currentTime.setpreval(currentTime.getValue());
      currentTime.setClear();
      dummyint = zoneOneSevenTemp.getStatus() ? zoneOneSevenTemp.setprepresent() : zoneOneSevenTemp.setpreclear();
      zoneOneSevenTemp.setpreval(zoneOneSevenTemp.getValue());
      zoneOneSevenTemp.setClear();
      dummyint = zoneTwoThreeTemp.getStatus() ? zoneTwoThreeTemp.setprepresent() : zoneTwoThreeTemp.setpreclear();
      zoneTwoThreeTemp.setpreval(zoneTwoThreeTemp.getValue());
      zoneTwoThreeTemp.setClear();
      dummyint = zoneFourFiveSixTemp.getStatus() ? zoneFourFiveSixTemp.setprepresent() : zoneFourFiveSixTemp.setpreclear();
      zoneFourFiveSixTemp.setpreval(zoneFourFiveSixTemp.getValue());
      zoneFourFiveSixTemp.setClear();
      dummyint = zoneOneSevenHumid.getStatus() ? zoneOneSevenHumid.setprepresent() : zoneOneSevenHumid.setpreclear();
      zoneOneSevenHumid.setpreval(zoneOneSevenHumid.getValue());
      zoneOneSevenHumid.setClear();
      dummyint = zoneTwoThreeHumid.getStatus() ? zoneTwoThreeHumid.setprepresent() : zoneTwoThreeHumid.setpreclear();
      zoneTwoThreeHumid.setpreval(zoneTwoThreeHumid.getValue());
      zoneTwoThreeHumid.setClear();
      dummyint = zoneFourFiveSixHumid.getStatus() ? zoneFourFiveSixHumid.setprepresent() : zoneFourFiveSixHumid.setpreclear();
      zoneFourFiveSixHumid.setpreval(zoneFourFiveSixHumid.getValue());
      zoneFourFiveSixHumid.setClear();
      dummyint = zoneOneSevenAtTempHumid.getStatus() ? zoneOneSevenAtTempHumid.setprepresent() : zoneOneSevenAtTempHumid.setpreclear();
      zoneOneSevenAtTempHumid.setpreval(zoneOneSevenAtTempHumid.getValue());
      zoneOneSevenAtTempHumid.setClear();
      dummyint = zoneTwoThreeAtTempHumid.getStatus() ? zoneTwoThreeAtTempHumid.setprepresent() : zoneTwoThreeAtTempHumid.setpreclear();
      zoneTwoThreeAtTempHumid.setpreval(zoneTwoThreeAtTempHumid.getValue());
      zoneTwoThreeAtTempHumid.setClear();
      dummyint = zoneFourFiveSixAtTempHumid.getStatus() ? zoneFourFiveSixAtTempHumid.setprepresent() : zoneFourFiveSixAtTempHumid.setpreclear();
      zoneFourFiveSixAtTempHumid.setpreval(zoneFourFiveSixAtTempHumid.getValue());
      zoneFourFiveSixAtTempHumid.setClear();
      dummyint = zoneOneOccupancy_B.getStatus() ? zoneOneOccupancy_B.setprepresent() : zoneOneOccupancy_B.setpreclear();
      zoneOneOccupancy_B.setpreval(zoneOneOccupancy_B.getValue());
      zoneOneOccupancy_B.setClear();
      dummyint = zoneSevenOccupancy_B.getStatus() ? zoneSevenOccupancy_B.setprepresent() : zoneSevenOccupancy_B.setpreclear();
      zoneSevenOccupancy_B.setpreval(zoneSevenOccupancy_B.getValue());
      zoneSevenOccupancy_B.setClear();
      zoneOneSevenFanONOFF.sethook();
      zoneOneSevenFanONOFF.setClear();
      zoneTwoThreeFanONOFF.sethook();
      zoneTwoThreeFanONOFF.setClear();
      zoneFourFiveSixACONOFF.sethook();
      zoneFourFiveSixACONOFF.setClear();
      zoneOneSevenHeaterONOFF.sethook();
      zoneOneSevenHeaterONOFF.setClear();
      zoneTwoThreeHeaterONOFF.sethook();
      zoneTwoThreeHeaterONOFF.setClear();
      workhrs_60.setClear();
      afterhrs_60.setClear();
      if(paused[60]!=0 || suspended[60]!=0 || active[60]!=1);
      else{
        currentTime.gethook();
        zoneOneSevenTemp.gethook();
        zoneTwoThreeTemp.gethook();
        zoneFourFiveSixTemp.gethook();
        zoneOneSevenHumid.gethook();
        zoneTwoThreeHumid.gethook();
        zoneFourFiveSixHumid.gethook();
        zoneOneSevenAtTempHumid.gethook();
        zoneTwoThreeAtTempHumid.gethook();
        zoneFourFiveSixAtTempHumid.gethook();
        zoneOneOccupancy_B.gethook();
        zoneSevenOccupancy_B.gethook();
      }
      runFinisher();
      if(active[60] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

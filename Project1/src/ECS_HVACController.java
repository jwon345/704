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
  private Signal workhrs_1;
  private Signal afterhrs_1;
  private int currentTemp_thread_1;//sysj\ECS.sysj line: 46, column: 2
  private int previousHour_thread_1;//sysj\ECS.sysj line: 47, column: 2
  private int currentTemp_thread_3;//sysj\ECS.sysj line: 66, column: 2
  private int currentHumidity_thread_3;//sysj\ECS.sysj line: 67, column: 2
  private int currentTemp_thread_4;//sysj\ECS.sysj line: 178, column: 2
  private int currentHumidity_thread_4;//sysj\ECS.sysj line: 179, column: 2
  private int currentTemp_thread_5;//sysj\ECS.sysj line: 235, column: 2
  private int currentHumidity_thread_5;//sysj\ECS.sysj line: 236, column: 2
  private int currentHour_thread_2;//sysj\ECS.sysj line: 51, column: 6
  private int tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 71, column: 4
  private int humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 72, column: 4
  private int zoneOneOcc_thread_3;//sysj\ECS.sysj line: 119, column: 14
  private int zoneSevenOcc_thread_3;//sysj\ECS.sysj line: 120, column: 14
  private int tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 185, column: 7
  private int humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 186, column: 7
  private int tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 242, column: 7
  private int humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 243, column: 7
  private int S224286 = 1;
  private int S214691 = 1;
  private int S214675 = 1;
  private int S218815 = 1;
  private int S214693 = 1;
  private int S214734 = 1;
  private int S214701 = 1;
  private int S214709 = 1;
  private int S214819 = 1;
  private int S214786 = 1;
  private int S214794 = 1;
  private int S219147 = 1;
  private int S218871 = 1;
  private int S218817 = 1;
  private int S218845 = 1;
  private int S219479 = 1;
  private int S219203 = 1;
  private int S219149 = 1;
  private int S219177 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread224812(int [] tdone, int [] ends){
        switch(S219479){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S219203){
          case 0 : 
            switch(S219149){
              case 0 : 
                if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 250, column: 14
                  System.out.println("Current Temp for Zone 4,5,6:" + currentTemp_thread_5 + "(°C)");//sysj\ECS.sysj line: 251, column: 8
                  System.out.println("\n-------------------------");//sysj\ECS.sysj line: 252, column: 8
                  S219149=1;
                  if(tempzoneFourFiveSixTemp_thread_5 < currentTemp_thread_5){//sysj\ECS.sysj line: 255, column: 11
                    System.out.println("Turning ON AC to Cool Down for Zone 4,5,6");//sysj\ECS.sysj line: 256, column: 8
                    zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 257, column: 8
                    currsigs.addElement(zoneFourFiveSixACONOFF);
                    currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 258, column: 8
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S219149=2;
                    if(humidityzoneFourFiveSix_thread_5 > currentHumidity_thread_5){//sysj\ECS.sysj line: 265, column: 11
                      S219177=0;
                      System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 266, column: 14
                      zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 267, column: 11
                      currsigs.addElement(zoneFourFiveSixACONOFF);
                      currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 268, column: 14
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S219177=1;
                      if(humidityzoneFourFiveSix_thread_5 < currentHumidity_thread_5){//sysj\ECS.sysj line: 273, column: 21
                        System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 274, column: 14
                        zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 275, column: 11
                        currsigs.addElement(zoneFourFiveSixACONOFF);
                        currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 276, column: 14
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S219203=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                  }
                }
                else {
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                break;
              
              case 1 : 
                if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 260, column: 14
                  System.out.println("Current Temp for Zone 4,5,6:" + currentTemp_thread_5 + "(°C)");//sysj\ECS.sysj line: 261, column: 8
                  System.out.println("\n-------------------------");//sysj\ECS.sysj line: 262, column: 8
                  S219149=2;
                  if(humidityzoneFourFiveSix_thread_5 > currentHumidity_thread_5){//sysj\ECS.sysj line: 265, column: 11
                    S219177=0;
                    System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 266, column: 14
                    zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 267, column: 11
                    currsigs.addElement(zoneFourFiveSixACONOFF);
                    currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 268, column: 14
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S219177=1;
                    if(humidityzoneFourFiveSix_thread_5 < currentHumidity_thread_5){//sysj\ECS.sysj line: 273, column: 21
                      System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 274, column: 14
                      zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 275, column: 11
                      currsigs.addElement(zoneFourFiveSixACONOFF);
                      currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 276, column: 14
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S219203=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                }
                else {
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                break;
              
              case 2 : 
                switch(S219177){
                  case 0 : 
                    if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 270, column: 17
                      System.out.println("Current Humidity For Zone 4,5,6: " + currentHumidity_thread_5 + "(%)");//sysj\ECS.sysj line: 271, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 272, column: 11
                      S219203=1;
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
                  
                  case 1 : 
                    if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 278, column: 17
                      System.out.println("Current Humidity For Zone 4,5,6: " + currentHumidity_thread_5 + "(%)");//sysj\ECS.sysj line: 279, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 280, column: 11
                      S219203=1;
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
            break;
          
          case 1 : 
            S219203=1;
            S219203=0;
            if(workhrs_1.getprestatus()){//sysj\ECS.sysj line: 241, column: 12
              tempzoneFourFiveSixTemp_thread_5 = (Integer)(zoneFourFiveSixTemp.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixTemp.getpreval()).intValue());//sysj\ECS.sysj line: 242, column: 7
              humidityzoneFourFiveSix_thread_5 = (Integer)(zoneFourFiveSixHumid.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixHumid.getpreval()).intValue());//sysj\ECS.sysj line: 243, column: 7
              S219149=0;
              if(tempzoneFourFiveSixTemp_thread_5 > currentTemp_thread_5){//sysj\ECS.sysj line: 245, column: 11
                System.out.println("Turning ON AC to Heat Up for Zone 4,5,6");//sysj\ECS.sysj line: 246, column: 8
                zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 247, column: 8
                currsigs.addElement(zoneFourFiveSixACONOFF);
                currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 248, column: 8
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S219149=1;
                if(tempzoneFourFiveSixTemp_thread_5 < currentTemp_thread_5){//sysj\ECS.sysj line: 255, column: 11
                  System.out.println("Turning ON AC to Cool Down for Zone 4,5,6");//sysj\ECS.sysj line: 256, column: 8
                  zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 257, column: 8
                  currsigs.addElement(zoneFourFiveSixACONOFF);
                  currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 258, column: 8
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S219149=2;
                  if(humidityzoneFourFiveSix_thread_5 > currentHumidity_thread_5){//sysj\ECS.sysj line: 265, column: 11
                    S219177=0;
                    System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 266, column: 14
                    zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 267, column: 11
                    currsigs.addElement(zoneFourFiveSixACONOFF);
                    currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 268, column: 14
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S219177=1;
                    if(humidityzoneFourFiveSix_thread_5 < currentHumidity_thread_5){//sysj\ECS.sysj line: 273, column: 21
                      System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 274, column: 14
                      zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 275, column: 11
                      currsigs.addElement(zoneFourFiveSixACONOFF);
                      currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 276, column: 14
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S219203=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                }
              }
            }
            else {
              S219203=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread224811(int [] tdone, int [] ends){
        switch(S219147){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S218871){
          case 0 : 
            switch(S218817){
              case 0 : 
                if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 193, column: 15
                  System.out.println("Current Temp for Zone 2,3:" + currentTemp_thread_4 + "(°C)");//sysj\ECS.sysj line: 194, column: 8
                  System.out.println("\n-------------------------");//sysj\ECS.sysj line: 195, column: 8
                  S218817=1;
                  if(tempzoneTwoThree_thread_4 < currentTemp_thread_4){//sysj\ECS.sysj line: 198, column: 11
                    System.out.println("Turning ON Fan to Cool Down for Zone 2,3");//sysj\ECS.sysj line: 199, column: 8
                    zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 200, column: 8
                    currsigs.addElement(zoneTwoThreeFanONOFF);
                    currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 201, column: 8
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S218817=2;
                    if(humidityzoneTwoThree_thread_4 > currentHumidity_thread_4){//sysj\ECS.sysj line: 209, column: 11
                      S218845=0;
                      System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 210, column: 14
                      zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 211, column: 8
                      currsigs.addElement(zoneTwoThreeHeaterONOFF);
                      currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 212, column: 14
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S218845=1;
                      if(humidityzoneTwoThree_thread_4 < currentHumidity_thread_4){//sysj\ECS.sysj line: 217, column: 21
                        System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 218, column: 14
                        zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 219, column: 11
                        currsigs.addElement(zoneTwoThreeFanONOFF);
                        currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 220, column: 14
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S218871=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                    }
                  }
                }
                else {
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 1 : 
                if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 204, column: 15
                  System.out.println("Current Temp for Zone 2,3:" + currentTemp_thread_4 + "(°C)");//sysj\ECS.sysj line: 205, column: 8
                  System.out.println("\n-------------------------");//sysj\ECS.sysj line: 206, column: 8
                  S218817=2;
                  if(humidityzoneTwoThree_thread_4 > currentHumidity_thread_4){//sysj\ECS.sysj line: 209, column: 11
                    S218845=0;
                    System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 210, column: 14
                    zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 211, column: 8
                    currsigs.addElement(zoneTwoThreeHeaterONOFF);
                    currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 212, column: 14
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S218845=1;
                    if(humidityzoneTwoThree_thread_4 < currentHumidity_thread_4){//sysj\ECS.sysj line: 217, column: 21
                      System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 218, column: 14
                      zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 219, column: 11
                      currsigs.addElement(zoneTwoThreeFanONOFF);
                      currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 220, column: 14
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S218871=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                }
                else {
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 2 : 
                switch(S218845){
                  case 0 : 
                    if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 214, column: 15
                      System.out.println("Current Humidity For Zone 2,3: " + currentHumidity_thread_4 + "(%)");//sysj\ECS.sysj line: 215, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 216, column: 11
                      S218871=1;
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
                  
                  case 1 : 
                    if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 223, column: 15
                      System.out.println("Current Humidity For Zone 2,3: " + currentHumidity_thread_4 + "(%)");//sysj\ECS.sysj line: 224, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 225, column: 11
                      S218871=1;
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
            break;
          
          case 1 : 
            S218871=1;
            S218871=0;
            if(workhrs_1.getprestatus()){//sysj\ECS.sysj line: 184, column: 12
              tempzoneTwoThree_thread_4 = (Integer)(zoneTwoThreeTemp.getpreval() == null ? 0 : ((Integer)zoneTwoThreeTemp.getpreval()).intValue());//sysj\ECS.sysj line: 185, column: 7
              humidityzoneTwoThree_thread_4 = (Integer)(zoneTwoThreeHumid.getpreval() == null ? 0 : ((Integer)zoneTwoThreeHumid.getpreval()).intValue());//sysj\ECS.sysj line: 186, column: 7
              S218817=0;
              if(tempzoneTwoThree_thread_4 > currentTemp_thread_4){//sysj\ECS.sysj line: 188, column: 11
                System.out.println("Turning ON Heater to Heat Up for Zone 2,3");//sysj\ECS.sysj line: 189, column: 8
                zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 190, column: 8
                currsigs.addElement(zoneTwoThreeHeaterONOFF);
                currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 191, column: 8
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S218817=1;
                if(tempzoneTwoThree_thread_4 < currentTemp_thread_4){//sysj\ECS.sysj line: 198, column: 11
                  System.out.println("Turning ON Fan to Cool Down for Zone 2,3");//sysj\ECS.sysj line: 199, column: 8
                  zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 200, column: 8
                  currsigs.addElement(zoneTwoThreeFanONOFF);
                  currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 201, column: 8
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S218817=2;
                  if(humidityzoneTwoThree_thread_4 > currentHumidity_thread_4){//sysj\ECS.sysj line: 209, column: 11
                    S218845=0;
                    System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 210, column: 14
                    zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 211, column: 8
                    currsigs.addElement(zoneTwoThreeHeaterONOFF);
                    currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 212, column: 14
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S218845=1;
                    if(humidityzoneTwoThree_thread_4 < currentHumidity_thread_4){//sysj\ECS.sysj line: 217, column: 21
                      System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 218, column: 14
                      zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 219, column: 11
                      currsigs.addElement(zoneTwoThreeFanONOFF);
                      currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 220, column: 14
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S218871=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                }
              }
            }
            else {
              S218871=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread224810(int [] tdone, int [] ends){
        switch(S218815){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S214693){
          case 0 : 
            switch(S214734){
              case 0 : 
                switch(S214701){
                  case 0 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 82, column: 15
                      System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_3 + "(°C)");//sysj\ECS.sysj line: 83, column: 8
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 84, column: 8
                      S214734=1;
                      if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 98, column: 11
                        S214709=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 99, column: 14
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 100, column: 14
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 101, column: 14
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S214709=1;
                        if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 106, column: 21
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 107, column: 14
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 108, column: 14
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 109, column: 14
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S214693=1;
                          if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 117, column: 15
                            zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 119, column: 14
                            zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 120, column: 14
                            if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 122, column: 18
                              S214819=0;
                              if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 125, column: 22
                                S214786=0;
                                System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 126, column: 13
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 127, column: 13
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 128, column: 13
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S214786=1;
                                if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 136, column: 21
                                  System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 137, column: 13
                                  currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 138, column: 13
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 139, column: 16
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S214819=1;
                                  if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 146, column: 16
                                    S214794=0;
                                    System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 147, column: 19
                                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 148, column: 19
                                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                                    currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 149, column: 19
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S214794=1;
                                    if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 154, column: 26
                                      System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 155, column: 19
                                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 156, column: 19
                                      currsigs.addElement(zoneOneSevenFanONOFF);
                                      currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 157, column: 19
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S214693=2;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S214693=2;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                          else {
                            S214693=2;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                        }
                      }
                    }
                    else {
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 93, column: 18
                      System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_3 + "(°C)");//sysj\ECS.sysj line: 94, column: 8
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 95, column: 8
                      S214734=1;
                      if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 98, column: 11
                        S214709=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 99, column: 14
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 100, column: 14
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 101, column: 14
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S214709=1;
                        if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 106, column: 21
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 107, column: 14
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 108, column: 14
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 109, column: 14
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S214693=1;
                          if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 117, column: 15
                            zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 119, column: 14
                            zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 120, column: 14
                            if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 122, column: 18
                              S214819=0;
                              if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 125, column: 22
                                S214786=0;
                                System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 126, column: 13
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 127, column: 13
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 128, column: 13
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S214786=1;
                                if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 136, column: 21
                                  System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 137, column: 13
                                  currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 138, column: 13
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 139, column: 16
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S214819=1;
                                  if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 146, column: 16
                                    S214794=0;
                                    System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 147, column: 19
                                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 148, column: 19
                                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                                    currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 149, column: 19
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S214794=1;
                                    if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 154, column: 26
                                      System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 155, column: 19
                                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 156, column: 19
                                      currsigs.addElement(zoneOneSevenFanONOFF);
                                      currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 157, column: 19
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S214693=2;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S214693=2;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                          else {
                            S214693=2;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                        }
                      }
                    }
                    else {
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S214709){
                  case 0 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 103, column: 18
                      System.out.println("Current Humidity For Zone 1,7: " + currentHumidity_thread_3 + "(%)");//sysj\ECS.sysj line: 104, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 105, column: 11
                      S214693=1;
                      if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 117, column: 15
                        zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 119, column: 14
                        zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 120, column: 14
                        if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 122, column: 18
                          S214819=0;
                          if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 125, column: 22
                            S214786=0;
                            System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 126, column: 13
                            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 127, column: 13
                            currsigs.addElement(zoneOneSevenHeaterONOFF);
                            currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 128, column: 13
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S214786=1;
                            if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 136, column: 21
                              System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 137, column: 13
                              currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 138, column: 13
                              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 139, column: 16
                              currsigs.addElement(zoneOneSevenFanONOFF);
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S214819=1;
                              if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 146, column: 16
                                S214794=0;
                                System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 147, column: 19
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 148, column: 19
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 149, column: 19
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S214794=1;
                                if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 154, column: 26
                                  System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 155, column: 19
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 156, column: 19
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 157, column: 19
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S214693=2;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S214693=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        S214693=2;
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
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 111, column: 18
                      System.out.println("Current Humidity For Zone 1,7: " + currentHumidity_thread_3 + "(%)");//sysj\ECS.sysj line: 112, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 113, column: 11
                      S214693=1;
                      if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 117, column: 15
                        zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 119, column: 14
                        zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 120, column: 14
                        if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 122, column: 18
                          S214819=0;
                          if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 125, column: 22
                            S214786=0;
                            System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 126, column: 13
                            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 127, column: 13
                            currsigs.addElement(zoneOneSevenHeaterONOFF);
                            currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 128, column: 13
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S214786=1;
                            if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 136, column: 21
                              System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 137, column: 13
                              currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 138, column: 13
                              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 139, column: 16
                              currsigs.addElement(zoneOneSevenFanONOFF);
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S214819=1;
                              if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 146, column: 16
                                S214794=0;
                                System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 147, column: 19
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 148, column: 19
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 149, column: 19
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S214794=1;
                                if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 154, column: 26
                                  System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 155, column: 19
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 156, column: 19
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 157, column: 19
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S214693=2;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S214693=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        S214693=2;
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
                  
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S214819){
              case 0 : 
                switch(S214786){
                  case 0 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 130, column: 20
                      System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_3 + "(°C)");//sysj\ECS.sysj line: 131, column: 13
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 132, column: 13
                      S214819=1;
                      if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 146, column: 16
                        S214794=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 147, column: 19
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 148, column: 19
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 149, column: 19
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S214794=1;
                        if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 154, column: 26
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 155, column: 19
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 156, column: 19
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 157, column: 19
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S214693=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                    }
                    else {
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                  case 1 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 141, column: 23
                      System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_3 + "(°C)");//sysj\ECS.sysj line: 142, column: 13
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 143, column: 13
                      S214819=1;
                      if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 146, column: 16
                        S214794=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 147, column: 19
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 148, column: 19
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 149, column: 19
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S214794=1;
                        if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 154, column: 26
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 155, column: 19
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 156, column: 19
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 157, column: 19
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S214693=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                    }
                    else {
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                switch(S214794){
                  case 0 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 151, column: 23
                      System.out.println("Current Humidity For Zone 1,7: " + currentHumidity_thread_3 + "(%)");//sysj\ECS.sysj line: 152, column: 19
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 153, column: 16
                      S214693=2;
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
                  
                  case 1 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 159, column: 23
                      System.out.println("Current Humidity For Zone 1,7: " + currentHumidity_thread_3 + "(%)");//sysj\ECS.sysj line: 160, column: 19
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 161, column: 16
                      S214693=2;
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
            break;
          
          case 2 : 
            S214693=2;
            tempZoneOneSeven_thread_3 = (Integer)(zoneOneSevenTemp.getpreval() == null ? 0 : ((Integer)zoneOneSevenTemp.getpreval()).intValue());//sysj\ECS.sysj line: 71, column: 4
            humidityZoneOneSeven_thread_3 = (Integer)(zoneOneSevenHumid.getpreval() == null ? 0 : ((Integer)zoneOneSevenHumid.getpreval()).intValue());//sysj\ECS.sysj line: 72, column: 4
            S214693=0;
            if(workhrs_1.getprestatus()){//sysj\ECS.sysj line: 74, column: 15
              S214734=0;
              if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 77, column: 11
                S214701=0;
                System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 78, column: 8
                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 79, column: 8
                currsigs.addElement(zoneOneSevenHeaterONOFF);
                currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 80, column: 8
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S214701=1;
                if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 88, column: 16
                  System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 89, column: 8
                  currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 90, column: 8
                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 91, column: 11
                  currsigs.addElement(zoneOneSevenFanONOFF);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S214734=1;
                  if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 98, column: 11
                    S214709=0;
                    System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 99, column: 14
                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 100, column: 14
                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                    currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 101, column: 14
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S214709=1;
                    if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 106, column: 21
                      System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 107, column: 14
                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 108, column: 14
                      currsigs.addElement(zoneOneSevenFanONOFF);
                      currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 109, column: 14
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S214693=1;
                      if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 117, column: 15
                        zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 119, column: 14
                        zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 120, column: 14
                        if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 122, column: 18
                          S214819=0;
                          if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 125, column: 22
                            S214786=0;
                            System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 126, column: 13
                            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 127, column: 13
                            currsigs.addElement(zoneOneSevenHeaterONOFF);
                            currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 128, column: 13
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S214786=1;
                            if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 136, column: 21
                              System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 137, column: 13
                              currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 138, column: 13
                              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 139, column: 16
                              currsigs.addElement(zoneOneSevenFanONOFF);
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S214819=1;
                              if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 146, column: 16
                                S214794=0;
                                System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 147, column: 19
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 148, column: 19
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 149, column: 19
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S214794=1;
                                if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 154, column: 26
                                  System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 155, column: 19
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 156, column: 19
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 157, column: 19
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S214693=2;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S214693=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        S214693=2;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                    }
                  }
                }
              }
            }
            else {
              S214693=1;
              if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 117, column: 15
                zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 119, column: 14
                zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 120, column: 14
                if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 122, column: 18
                  S214819=0;
                  if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 125, column: 22
                    S214786=0;
                    System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 126, column: 13
                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 127, column: 13
                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                    currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 128, column: 13
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S214786=1;
                    if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 136, column: 21
                      System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 137, column: 13
                      currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 138, column: 13
                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 139, column: 16
                      currsigs.addElement(zoneOneSevenFanONOFF);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S214819=1;
                      if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 146, column: 16
                        S214794=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 147, column: 19
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 148, column: 19
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 149, column: 19
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S214794=1;
                        if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 154, column: 26
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 155, column: 19
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 156, column: 19
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 157, column: 19
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S214693=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  S214693=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                S214693=2;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread224809(int [] tdone, int [] ends){
        switch(S214691){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S214675){
          case 0 : 
            if(currentTime.getprestatus()){//sysj\ECS.sysj line: 50, column: 12
              currentHour_thread_2 = (Integer)(currentTime.getpreval() == null ? 0 : ((Integer)currentTime.getpreval()).intValue());//sysj\ECS.sysj line: 51, column: 6
              S214675=1;
              if(currentHour_thread_2 >= 9 && currentHour_thread_2 <= 17){//sysj\ECS.sysj line: 53, column: 14
                workhrs_1.setPresent();//sysj\ECS.sysj line: 54, column: 14
                currsigs.addElement(workhrs_1);
                S214675=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                afterhrs_1.setPresent();//sysj\ECS.sysj line: 56, column: 14
                currsigs.addElement(afterhrs_1);
                S214675=0;
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
            S214675=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread224807(int [] tdone, int [] ends){
        S219479=1;
    currentTemp_thread_5 = 30;//sysj\ECS.sysj line: 235, column: 2
    currentHumidity_thread_5 = 50;//sysj\ECS.sysj line: 236, column: 2
    System.out.println("Current Temp For Zone 4,5,6: " + currentTemp_thread_5);//sysj\ECS.sysj line: 237, column: 2
    S219203=0;
    if(workhrs_1.getprestatus()){//sysj\ECS.sysj line: 241, column: 12
      tempzoneFourFiveSixTemp_thread_5 = (Integer)(zoneFourFiveSixTemp.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixTemp.getpreval()).intValue());//sysj\ECS.sysj line: 242, column: 7
      humidityzoneFourFiveSix_thread_5 = (Integer)(zoneFourFiveSixHumid.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixHumid.getpreval()).intValue());//sysj\ECS.sysj line: 243, column: 7
      S219149=0;
      if(tempzoneFourFiveSixTemp_thread_5 > currentTemp_thread_5){//sysj\ECS.sysj line: 245, column: 11
        System.out.println("Turning ON AC to Heat Up for Zone 4,5,6");//sysj\ECS.sysj line: 246, column: 8
        zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 247, column: 8
        currsigs.addElement(zoneFourFiveSixACONOFF);
        currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 248, column: 8
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S219149=1;
        if(tempzoneFourFiveSixTemp_thread_5 < currentTemp_thread_5){//sysj\ECS.sysj line: 255, column: 11
          System.out.println("Turning ON AC to Cool Down for Zone 4,5,6");//sysj\ECS.sysj line: 256, column: 8
          zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 257, column: 8
          currsigs.addElement(zoneFourFiveSixACONOFF);
          currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 258, column: 8
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S219149=2;
          if(humidityzoneFourFiveSix_thread_5 > currentHumidity_thread_5){//sysj\ECS.sysj line: 265, column: 11
            S219177=0;
            System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 266, column: 14
            zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 267, column: 11
            currsigs.addElement(zoneFourFiveSixACONOFF);
            currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 268, column: 14
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
          }
          else {
            S219177=1;
            if(humidityzoneFourFiveSix_thread_5 < currentHumidity_thread_5){//sysj\ECS.sysj line: 273, column: 21
              System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 274, column: 14
              zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 275, column: 11
              currsigs.addElement(zoneFourFiveSixACONOFF);
              currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 276, column: 14
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S219203=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
          }
        }
      }
    }
    else {
      S219203=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread224806(int [] tdone, int [] ends){
        S219147=1;
    currentTemp_thread_4 = 30;//sysj\ECS.sysj line: 178, column: 2
    currentHumidity_thread_4 = 50;//sysj\ECS.sysj line: 179, column: 2
    System.out.println("Current Temp For Zone 2,3: " + currentTemp_thread_4);//sysj\ECS.sysj line: 180, column: 2
    S218871=0;
    if(workhrs_1.getprestatus()){//sysj\ECS.sysj line: 184, column: 12
      tempzoneTwoThree_thread_4 = (Integer)(zoneTwoThreeTemp.getpreval() == null ? 0 : ((Integer)zoneTwoThreeTemp.getpreval()).intValue());//sysj\ECS.sysj line: 185, column: 7
      humidityzoneTwoThree_thread_4 = (Integer)(zoneTwoThreeHumid.getpreval() == null ? 0 : ((Integer)zoneTwoThreeHumid.getpreval()).intValue());//sysj\ECS.sysj line: 186, column: 7
      S218817=0;
      if(tempzoneTwoThree_thread_4 > currentTemp_thread_4){//sysj\ECS.sysj line: 188, column: 11
        System.out.println("Turning ON Heater to Heat Up for Zone 2,3");//sysj\ECS.sysj line: 189, column: 8
        zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 190, column: 8
        currsigs.addElement(zoneTwoThreeHeaterONOFF);
        currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 191, column: 8
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S218817=1;
        if(tempzoneTwoThree_thread_4 < currentTemp_thread_4){//sysj\ECS.sysj line: 198, column: 11
          System.out.println("Turning ON Fan to Cool Down for Zone 2,3");//sysj\ECS.sysj line: 199, column: 8
          zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 200, column: 8
          currsigs.addElement(zoneTwoThreeFanONOFF);
          currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 201, column: 8
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          S218817=2;
          if(humidityzoneTwoThree_thread_4 > currentHumidity_thread_4){//sysj\ECS.sysj line: 209, column: 11
            S218845=0;
            System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 210, column: 14
            zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 211, column: 8
            currsigs.addElement(zoneTwoThreeHeaterONOFF);
            currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 212, column: 14
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            S218845=1;
            if(humidityzoneTwoThree_thread_4 < currentHumidity_thread_4){//sysj\ECS.sysj line: 217, column: 21
              System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 218, column: 14
              zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 219, column: 11
              currsigs.addElement(zoneTwoThreeFanONOFF);
              currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 220, column: 14
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S218871=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
          }
        }
      }
    }
    else {
      S218871=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread224805(int [] tdone, int [] ends){
        S218815=1;
    currentTemp_thread_3 = 30;//sysj\ECS.sysj line: 66, column: 2
    currentHumidity_thread_3 = 50;//sysj\ECS.sysj line: 67, column: 2
    System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_3);//sysj\ECS.sysj line: 68, column: 2
    tempZoneOneSeven_thread_3 = (Integer)(zoneOneSevenTemp.getpreval() == null ? 0 : ((Integer)zoneOneSevenTemp.getpreval()).intValue());//sysj\ECS.sysj line: 71, column: 4
    humidityZoneOneSeven_thread_3 = (Integer)(zoneOneSevenHumid.getpreval() == null ? 0 : ((Integer)zoneOneSevenHumid.getpreval()).intValue());//sysj\ECS.sysj line: 72, column: 4
    S214693=0;
    if(workhrs_1.getprestatus()){//sysj\ECS.sysj line: 74, column: 15
      S214734=0;
      if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 77, column: 11
        S214701=0;
        System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 78, column: 8
        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 79, column: 8
        currsigs.addElement(zoneOneSevenHeaterONOFF);
        currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 80, column: 8
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
      else {
        S214701=1;
        if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 88, column: 16
          System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 89, column: 8
          currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 90, column: 8
          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 91, column: 11
          currsigs.addElement(zoneOneSevenFanONOFF);
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          S214734=1;
          if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 98, column: 11
            S214709=0;
            System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 99, column: 14
            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 100, column: 14
            currsigs.addElement(zoneOneSevenHeaterONOFF);
            currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 101, column: 14
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
          else {
            S214709=1;
            if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 106, column: 21
              System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 107, column: 14
              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 108, column: 14
              currsigs.addElement(zoneOneSevenFanONOFF);
              currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 109, column: 14
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S214693=1;
              if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 117, column: 15
                zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 119, column: 14
                zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 120, column: 14
                if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 122, column: 18
                  S214819=0;
                  if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 125, column: 22
                    S214786=0;
                    System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 126, column: 13
                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 127, column: 13
                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                    currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 128, column: 13
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S214786=1;
                    if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 136, column: 21
                      System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 137, column: 13
                      currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 138, column: 13
                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 139, column: 16
                      currsigs.addElement(zoneOneSevenFanONOFF);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S214819=1;
                      if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 146, column: 16
                        S214794=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 147, column: 19
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 148, column: 19
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 149, column: 19
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S214794=1;
                        if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 154, column: 26
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 155, column: 19
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 156, column: 19
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 157, column: 19
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S214693=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  S214693=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                S214693=2;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
          }
        }
      }
    }
    else {
      S214693=1;
      if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 117, column: 15
        zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 119, column: 14
        zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 120, column: 14
        if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 122, column: 18
          S214819=0;
          if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 125, column: 22
            S214786=0;
            System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 126, column: 13
            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 127, column: 13
            currsigs.addElement(zoneOneSevenHeaterONOFF);
            currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 128, column: 13
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
          else {
            S214786=1;
            if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 136, column: 21
              System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 137, column: 13
              currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 138, column: 13
              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 139, column: 16
              currsigs.addElement(zoneOneSevenFanONOFF);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S214819=1;
              if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 146, column: 16
                S214794=0;
                System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 147, column: 19
                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 148, column: 19
                currsigs.addElement(zoneOneSevenHeaterONOFF);
                currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 149, column: 19
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S214794=1;
                if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 154, column: 26
                  System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 155, column: 19
                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 156, column: 19
                  currsigs.addElement(zoneOneSevenFanONOFF);
                  currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 157, column: 19
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S214693=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
          }
        }
        else {
          S214693=2;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
      }
      else {
        S214693=2;
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
    }
  }

  public void thread224804(int [] tdone, int [] ends){
        S214691=1;
    S214675=0;
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
      switch(S224286){
        case 0 : 
          S224286=0;
          break RUN;
        
        case 1 : 
          S224286=2;
          S224286=2;
          workhrs_1.setClear();//sysj\ECS.sysj line: 43, column: 2
          afterhrs_1.setClear();//sysj\ECS.sysj line: 43, column: 2
          currentTemp_thread_1 = 30;//sysj\ECS.sysj line: 46, column: 2
          previousHour_thread_1 = -1;//sysj\ECS.sysj line: 47, column: 2
          thread224804(tdone,ends);
          thread224805(tdone,ends);
          thread224806(tdone,ends);
          thread224807(tdone,ends);
          int biggest224808 = 0;
          if(ends[2]>=biggest224808){
            biggest224808=ends[2];
          }
          if(ends[3]>=biggest224808){
            biggest224808=ends[3];
          }
          if(ends[4]>=biggest224808){
            biggest224808=ends[4];
          }
          if(ends[5]>=biggest224808){
            biggest224808=ends[5];
          }
          if(biggest224808 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_1.setClear();//sysj\ECS.sysj line: 43, column: 2
          afterhrs_1.setClear();//sysj\ECS.sysj line: 43, column: 2
          thread224809(tdone,ends);
          thread224810(tdone,ends);
          thread224811(tdone,ends);
          thread224812(tdone,ends);
          int biggest224813 = 0;
          if(ends[2]>=biggest224813){
            biggest224813=ends[2];
          }
          if(ends[3]>=biggest224813){
            biggest224813=ends[3];
          }
          if(ends[4]>=biggest224813){
            biggest224813=ends[4];
          }
          if(ends[5]>=biggest224813){
            biggest224813=ends[5];
          }
          if(biggest224813 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest224813 == 0){
            S224286=0;
            active[1]=0;
            ends[1]=0;
            S224286=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    workhrs_1 = new Signal();
    afterhrs_1 = new Signal();
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
      workhrs_1.setpreclear();
      afterhrs_1.setpreclear();
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
      workhrs_1.setClear();
      afterhrs_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
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
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

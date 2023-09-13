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
  private int currentTemp_thread_1;//sysj\ECS.sysj line: 86, column: 2
  private int previousHour_thread_1;//sysj\ECS.sysj line: 87, column: 2
  private int currentTemp_thread_3;//sysj\ECS.sysj line: 106, column: 2
  private int currentHumidity_thread_3;//sysj\ECS.sysj line: 107, column: 2
  private int currentTemp_thread_4;//sysj\ECS.sysj line: 218, column: 2
  private int currentHumidity_thread_4;//sysj\ECS.sysj line: 219, column: 2
  private int currentTemp_thread_5;//sysj\ECS.sysj line: 275, column: 2
  private int currentHumidity_thread_5;//sysj\ECS.sysj line: 276, column: 2
  private int currentHour_thread_2;//sysj\ECS.sysj line: 91, column: 6
  private int tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 111, column: 4
  private int humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 112, column: 4
  private int zoneOneOcc_thread_3;//sysj\ECS.sysj line: 159, column: 14
  private int zoneSevenOcc_thread_3;//sysj\ECS.sysj line: 160, column: 14
  private int tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 225, column: 7
  private int humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 226, column: 7
  private int tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 282, column: 7
  private int humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 283, column: 7
  private int S203491 = 1;
  private int S193896 = 1;
  private int S193880 = 1;
  private int S198020 = 1;
  private int S193898 = 1;
  private int S193939 = 1;
  private int S193906 = 1;
  private int S193914 = 1;
  private int S194024 = 1;
  private int S193991 = 1;
  private int S193999 = 1;
  private int S198352 = 1;
  private int S198076 = 1;
  private int S198022 = 1;
  private int S198050 = 1;
  private int S198684 = 1;
  private int S198408 = 1;
  private int S198354 = 1;
  private int S198382 = 1;
  
  private int[] ends = new int[66];
  private int[] tdone = new int[66];
  
  public void thread204858(int [] tdone, int [] ends){
        switch(S198684){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S198408){
          case 0 : 
            switch(S198354){
              case 0 : 
                if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 290, column: 14
                  System.out.println("Current Temp for Zone 4,5,6:" + currentTemp_thread_5 + "(°C)");//sysj\ECS.sysj line: 291, column: 8
                  System.out.println("\n-------------------------");//sysj\ECS.sysj line: 292, column: 8
                  S198354=1;
                  if(tempzoneFourFiveSixTemp_thread_5 < currentTemp_thread_5){//sysj\ECS.sysj line: 295, column: 11
                    System.out.println("Turning ON AC to Cool Down for Zone 4,5,6");//sysj\ECS.sysj line: 296, column: 8
                    zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 297, column: 8
                    currsigs.addElement(zoneFourFiveSixACONOFF);
                    currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 298, column: 8
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S198354=2;
                    if(humidityzoneFourFiveSix_thread_5 > currentHumidity_thread_5){//sysj\ECS.sysj line: 305, column: 11
                      S198382=0;
                      System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 306, column: 14
                      zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 307, column: 11
                      currsigs.addElement(zoneFourFiveSixACONOFF);
                      currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 308, column: 14
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S198382=1;
                      if(humidityzoneFourFiveSix_thread_5 < currentHumidity_thread_5){//sysj\ECS.sysj line: 313, column: 21
                        System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 314, column: 14
                        zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 315, column: 11
                        currsigs.addElement(zoneFourFiveSixACONOFF);
                        currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 316, column: 14
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S198408=1;
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
                if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 300, column: 14
                  System.out.println("Current Temp for Zone 4,5,6:" + currentTemp_thread_5 + "(°C)");//sysj\ECS.sysj line: 301, column: 8
                  System.out.println("\n-------------------------");//sysj\ECS.sysj line: 302, column: 8
                  S198354=2;
                  if(humidityzoneFourFiveSix_thread_5 > currentHumidity_thread_5){//sysj\ECS.sysj line: 305, column: 11
                    S198382=0;
                    System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 306, column: 14
                    zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 307, column: 11
                    currsigs.addElement(zoneFourFiveSixACONOFF);
                    currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 308, column: 14
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S198382=1;
                    if(humidityzoneFourFiveSix_thread_5 < currentHumidity_thread_5){//sysj\ECS.sysj line: 313, column: 21
                      System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 314, column: 14
                      zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 315, column: 11
                      currsigs.addElement(zoneFourFiveSixACONOFF);
                      currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 316, column: 14
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S198408=1;
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
                switch(S198382){
                  case 0 : 
                    if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 310, column: 17
                      System.out.println("Current Humidity For Zone 4,5,6: " + currentHumidity_thread_5 + "(%)");//sysj\ECS.sysj line: 311, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 312, column: 11
                      S198408=1;
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
                    if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 318, column: 17
                      System.out.println("Current Humidity For Zone 4,5,6: " + currentHumidity_thread_5 + "(%)");//sysj\ECS.sysj line: 319, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 320, column: 11
                      S198408=1;
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
            S198408=1;
            S198408=0;
            if(workhrs_1.getprestatus()){//sysj\ECS.sysj line: 281, column: 12
              tempzoneFourFiveSixTemp_thread_5 = (Integer)(zoneFourFiveSixTemp.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixTemp.getpreval()).intValue());//sysj\ECS.sysj line: 282, column: 7
              humidityzoneFourFiveSix_thread_5 = (Integer)(zoneFourFiveSixHumid.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixHumid.getpreval()).intValue());//sysj\ECS.sysj line: 283, column: 7
              S198354=0;
              if(tempzoneFourFiveSixTemp_thread_5 > currentTemp_thread_5){//sysj\ECS.sysj line: 285, column: 11
                System.out.println("Turning ON AC to Heat Up for Zone 4,5,6");//sysj\ECS.sysj line: 286, column: 8
                zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 287, column: 8
                currsigs.addElement(zoneFourFiveSixACONOFF);
                currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 288, column: 8
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S198354=1;
                if(tempzoneFourFiveSixTemp_thread_5 < currentTemp_thread_5){//sysj\ECS.sysj line: 295, column: 11
                  System.out.println("Turning ON AC to Cool Down for Zone 4,5,6");//sysj\ECS.sysj line: 296, column: 8
                  zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 297, column: 8
                  currsigs.addElement(zoneFourFiveSixACONOFF);
                  currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 298, column: 8
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S198354=2;
                  if(humidityzoneFourFiveSix_thread_5 > currentHumidity_thread_5){//sysj\ECS.sysj line: 305, column: 11
                    S198382=0;
                    System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 306, column: 14
                    zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 307, column: 11
                    currsigs.addElement(zoneFourFiveSixACONOFF);
                    currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 308, column: 14
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S198382=1;
                    if(humidityzoneFourFiveSix_thread_5 < currentHumidity_thread_5){//sysj\ECS.sysj line: 313, column: 21
                      System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 314, column: 14
                      zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 315, column: 11
                      currsigs.addElement(zoneFourFiveSixACONOFF);
                      currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 316, column: 14
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S198408=1;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                }
              }
            }
            else {
              S198408=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread204857(int [] tdone, int [] ends){
        switch(S198352){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S198076){
          case 0 : 
            switch(S198022){
              case 0 : 
                if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 233, column: 15
                  System.out.println("Current Temp for Zone 2,3:" + currentTemp_thread_4 + "(°C)");//sysj\ECS.sysj line: 234, column: 8
                  System.out.println("\n-------------------------");//sysj\ECS.sysj line: 235, column: 8
                  S198022=1;
                  if(tempzoneTwoThree_thread_4 < currentTemp_thread_4){//sysj\ECS.sysj line: 238, column: 11
                    System.out.println("Turning ON Fan to Cool Down for Zone 2,3");//sysj\ECS.sysj line: 239, column: 8
                    zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 240, column: 8
                    currsigs.addElement(zoneTwoThreeFanONOFF);
                    currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 241, column: 8
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S198022=2;
                    if(humidityzoneTwoThree_thread_4 > currentHumidity_thread_4){//sysj\ECS.sysj line: 249, column: 11
                      S198050=0;
                      System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 250, column: 14
                      zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 251, column: 8
                      currsigs.addElement(zoneTwoThreeHeaterONOFF);
                      currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 252, column: 14
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S198050=1;
                      if(humidityzoneTwoThree_thread_4 < currentHumidity_thread_4){//sysj\ECS.sysj line: 257, column: 21
                        System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 258, column: 14
                        zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 259, column: 11
                        currsigs.addElement(zoneTwoThreeFanONOFF);
                        currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 260, column: 14
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S198076=1;
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
                if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 244, column: 15
                  System.out.println("Current Temp for Zone 2,3:" + currentTemp_thread_4 + "(°C)");//sysj\ECS.sysj line: 245, column: 8
                  System.out.println("\n-------------------------");//sysj\ECS.sysj line: 246, column: 8
                  S198022=2;
                  if(humidityzoneTwoThree_thread_4 > currentHumidity_thread_4){//sysj\ECS.sysj line: 249, column: 11
                    S198050=0;
                    System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 250, column: 14
                    zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 251, column: 8
                    currsigs.addElement(zoneTwoThreeHeaterONOFF);
                    currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 252, column: 14
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S198050=1;
                    if(humidityzoneTwoThree_thread_4 < currentHumidity_thread_4){//sysj\ECS.sysj line: 257, column: 21
                      System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 258, column: 14
                      zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 259, column: 11
                      currsigs.addElement(zoneTwoThreeFanONOFF);
                      currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 260, column: 14
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S198076=1;
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
                switch(S198050){
                  case 0 : 
                    if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 254, column: 15
                      System.out.println("Current Humidity For Zone 2,3: " + currentHumidity_thread_4 + "(%)");//sysj\ECS.sysj line: 255, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 256, column: 11
                      S198076=1;
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
                    if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 263, column: 15
                      System.out.println("Current Humidity For Zone 2,3: " + currentHumidity_thread_4 + "(%)");//sysj\ECS.sysj line: 264, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 265, column: 11
                      S198076=1;
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
            S198076=1;
            S198076=0;
            if(workhrs_1.getprestatus()){//sysj\ECS.sysj line: 224, column: 12
              tempzoneTwoThree_thread_4 = (Integer)(zoneTwoThreeTemp.getpreval() == null ? 0 : ((Integer)zoneTwoThreeTemp.getpreval()).intValue());//sysj\ECS.sysj line: 225, column: 7
              humidityzoneTwoThree_thread_4 = (Integer)(zoneTwoThreeHumid.getpreval() == null ? 0 : ((Integer)zoneTwoThreeHumid.getpreval()).intValue());//sysj\ECS.sysj line: 226, column: 7
              S198022=0;
              if(tempzoneTwoThree_thread_4 > currentTemp_thread_4){//sysj\ECS.sysj line: 228, column: 11
                System.out.println("Turning ON Heater to Heat Up for Zone 2,3");//sysj\ECS.sysj line: 229, column: 8
                zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 230, column: 8
                currsigs.addElement(zoneTwoThreeHeaterONOFF);
                currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 231, column: 8
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S198022=1;
                if(tempzoneTwoThree_thread_4 < currentTemp_thread_4){//sysj\ECS.sysj line: 238, column: 11
                  System.out.println("Turning ON Fan to Cool Down for Zone 2,3");//sysj\ECS.sysj line: 239, column: 8
                  zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 240, column: 8
                  currsigs.addElement(zoneTwoThreeFanONOFF);
                  currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 241, column: 8
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S198022=2;
                  if(humidityzoneTwoThree_thread_4 > currentHumidity_thread_4){//sysj\ECS.sysj line: 249, column: 11
                    S198050=0;
                    System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 250, column: 14
                    zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 251, column: 8
                    currsigs.addElement(zoneTwoThreeHeaterONOFF);
                    currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 252, column: 14
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S198050=1;
                    if(humidityzoneTwoThree_thread_4 < currentHumidity_thread_4){//sysj\ECS.sysj line: 257, column: 21
                      System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 258, column: 14
                      zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 259, column: 11
                      currsigs.addElement(zoneTwoThreeFanONOFF);
                      currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 260, column: 14
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S198076=1;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                }
              }
            }
            else {
              S198076=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread204856(int [] tdone, int [] ends){
        switch(S198020){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S193898){
          case 0 : 
            switch(S193939){
              case 0 : 
                switch(S193906){
                  case 0 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 122, column: 15
                      System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_3 + "(°C)");//sysj\ECS.sysj line: 123, column: 8
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 124, column: 8
                      S193939=1;
                      if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 138, column: 11
                        S193914=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 139, column: 14
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 140, column: 14
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 141, column: 14
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S193914=1;
                        if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 146, column: 21
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 147, column: 14
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 148, column: 14
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 149, column: 14
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S193898=1;
                          if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 157, column: 15
                            zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 159, column: 14
                            zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 160, column: 14
                            if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 162, column: 18
                              S194024=0;
                              if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 165, column: 22
                                S193991=0;
                                System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 166, column: 13
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 167, column: 13
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 168, column: 13
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S193991=1;
                                if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 176, column: 21
                                  System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 177, column: 13
                                  currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 178, column: 13
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 179, column: 16
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S194024=1;
                                  if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 186, column: 16
                                    S193999=0;
                                    System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 187, column: 19
                                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 188, column: 19
                                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                                    currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 189, column: 19
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S193999=1;
                                    if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 194, column: 26
                                      System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 195, column: 19
                                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 196, column: 19
                                      currsigs.addElement(zoneOneSevenFanONOFF);
                                      currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 197, column: 19
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S193898=2;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S193898=2;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                          else {
                            S193898=2;
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
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 133, column: 18
                      System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_3 + "(°C)");//sysj\ECS.sysj line: 134, column: 8
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 135, column: 8
                      S193939=1;
                      if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 138, column: 11
                        S193914=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 139, column: 14
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 140, column: 14
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 141, column: 14
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S193914=1;
                        if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 146, column: 21
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 147, column: 14
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 148, column: 14
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 149, column: 14
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S193898=1;
                          if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 157, column: 15
                            zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 159, column: 14
                            zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 160, column: 14
                            if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 162, column: 18
                              S194024=0;
                              if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 165, column: 22
                                S193991=0;
                                System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 166, column: 13
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 167, column: 13
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 168, column: 13
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S193991=1;
                                if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 176, column: 21
                                  System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 177, column: 13
                                  currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 178, column: 13
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 179, column: 16
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S194024=1;
                                  if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 186, column: 16
                                    S193999=0;
                                    System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 187, column: 19
                                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 188, column: 19
                                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                                    currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 189, column: 19
                                    active[3]=1;
                                    ends[3]=1;
                                    tdone[3]=1;
                                  }
                                  else {
                                    S193999=1;
                                    if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 194, column: 26
                                      System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 195, column: 19
                                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 196, column: 19
                                      currsigs.addElement(zoneOneSevenFanONOFF);
                                      currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 197, column: 19
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                    else {
                                      S193898=2;
                                      active[3]=1;
                                      ends[3]=1;
                                      tdone[3]=1;
                                    }
                                  }
                                }
                              }
                            }
                            else {
                              S193898=2;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                          }
                          else {
                            S193898=2;
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
                switch(S193914){
                  case 0 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 143, column: 18
                      System.out.println("Current Humidity For Zone 1,7: " + currentHumidity_thread_3 + "(%)");//sysj\ECS.sysj line: 144, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 145, column: 11
                      S193898=1;
                      if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 157, column: 15
                        zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 159, column: 14
                        zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 160, column: 14
                        if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 162, column: 18
                          S194024=0;
                          if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 165, column: 22
                            S193991=0;
                            System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 166, column: 13
                            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 167, column: 13
                            currsigs.addElement(zoneOneSevenHeaterONOFF);
                            currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 168, column: 13
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S193991=1;
                            if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 176, column: 21
                              System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 177, column: 13
                              currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 178, column: 13
                              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 179, column: 16
                              currsigs.addElement(zoneOneSevenFanONOFF);
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S194024=1;
                              if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 186, column: 16
                                S193999=0;
                                System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 187, column: 19
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 188, column: 19
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 189, column: 19
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S193999=1;
                                if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 194, column: 26
                                  System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 195, column: 19
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 196, column: 19
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 197, column: 19
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S193898=2;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S193898=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        S193898=2;
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
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 151, column: 18
                      System.out.println("Current Humidity For Zone 1,7: " + currentHumidity_thread_3 + "(%)");//sysj\ECS.sysj line: 152, column: 14
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 153, column: 11
                      S193898=1;
                      if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 157, column: 15
                        zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 159, column: 14
                        zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 160, column: 14
                        if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 162, column: 18
                          S194024=0;
                          if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 165, column: 22
                            S193991=0;
                            System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 166, column: 13
                            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 167, column: 13
                            currsigs.addElement(zoneOneSevenHeaterONOFF);
                            currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 168, column: 13
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S193991=1;
                            if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 176, column: 21
                              System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 177, column: 13
                              currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 178, column: 13
                              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 179, column: 16
                              currsigs.addElement(zoneOneSevenFanONOFF);
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S194024=1;
                              if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 186, column: 16
                                S193999=0;
                                System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 187, column: 19
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 188, column: 19
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 189, column: 19
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S193999=1;
                                if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 194, column: 26
                                  System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 195, column: 19
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 196, column: 19
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 197, column: 19
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S193898=2;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S193898=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        S193898=2;
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
            switch(S194024){
              case 0 : 
                switch(S193991){
                  case 0 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 170, column: 20
                      System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_3 + "(°C)");//sysj\ECS.sysj line: 171, column: 13
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 172, column: 13
                      S194024=1;
                      if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 186, column: 16
                        S193999=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 187, column: 19
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 188, column: 19
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 189, column: 19
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S193999=1;
                        if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 194, column: 26
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 195, column: 19
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 196, column: 19
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 197, column: 19
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S193898=2;
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
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 181, column: 23
                      System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_3 + "(°C)");//sysj\ECS.sysj line: 182, column: 13
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 183, column: 13
                      S194024=1;
                      if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 186, column: 16
                        S193999=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 187, column: 19
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 188, column: 19
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 189, column: 19
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S193999=1;
                        if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 194, column: 26
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 195, column: 19
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 196, column: 19
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 197, column: 19
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S193898=2;
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
                switch(S193999){
                  case 0 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 191, column: 23
                      System.out.println("Current Humidity For Zone 1,7: " + currentHumidity_thread_3 + "(%)");//sysj\ECS.sysj line: 192, column: 19
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 193, column: 16
                      S193898=2;
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
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 199, column: 23
                      System.out.println("Current Humidity For Zone 1,7: " + currentHumidity_thread_3 + "(%)");//sysj\ECS.sysj line: 200, column: 19
                      System.out.println("\n-------------------------");//sysj\ECS.sysj line: 201, column: 16
                      S193898=2;
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
            S193898=2;
            tempZoneOneSeven_thread_3 = (Integer)(zoneOneSevenTemp.getpreval() == null ? 0 : ((Integer)zoneOneSevenTemp.getpreval()).intValue());//sysj\ECS.sysj line: 111, column: 4
            humidityZoneOneSeven_thread_3 = (Integer)(zoneOneSevenHumid.getpreval() == null ? 0 : ((Integer)zoneOneSevenHumid.getpreval()).intValue());//sysj\ECS.sysj line: 112, column: 4
            S193898=0;
            if(workhrs_1.getprestatus()){//sysj\ECS.sysj line: 114, column: 15
              S193939=0;
              if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 117, column: 11
                S193906=0;
                System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 118, column: 8
                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 119, column: 8
                currsigs.addElement(zoneOneSevenHeaterONOFF);
                currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 120, column: 8
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S193906=1;
                if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 128, column: 16
                  System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 129, column: 8
                  currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 130, column: 8
                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 131, column: 11
                  currsigs.addElement(zoneOneSevenFanONOFF);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S193939=1;
                  if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 138, column: 11
                    S193914=0;
                    System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 139, column: 14
                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 140, column: 14
                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                    currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 141, column: 14
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S193914=1;
                    if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 146, column: 21
                      System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 147, column: 14
                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 148, column: 14
                      currsigs.addElement(zoneOneSevenFanONOFF);
                      currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 149, column: 14
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S193898=1;
                      if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 157, column: 15
                        zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 159, column: 14
                        zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 160, column: 14
                        if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 162, column: 18
                          S194024=0;
                          if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 165, column: 22
                            S193991=0;
                            System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 166, column: 13
                            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 167, column: 13
                            currsigs.addElement(zoneOneSevenHeaterONOFF);
                            currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 168, column: 13
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S193991=1;
                            if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 176, column: 21
                              System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 177, column: 13
                              currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 178, column: 13
                              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 179, column: 16
                              currsigs.addElement(zoneOneSevenFanONOFF);
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S194024=1;
                              if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 186, column: 16
                                S193999=0;
                                System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 187, column: 19
                                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 188, column: 19
                                currsigs.addElement(zoneOneSevenHeaterONOFF);
                                currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 189, column: 19
                                active[3]=1;
                                ends[3]=1;
                                tdone[3]=1;
                              }
                              else {
                                S193999=1;
                                if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 194, column: 26
                                  System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 195, column: 19
                                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 196, column: 19
                                  currsigs.addElement(zoneOneSevenFanONOFF);
                                  currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 197, column: 19
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                                else {
                                  S193898=2;
                                  active[3]=1;
                                  ends[3]=1;
                                  tdone[3]=1;
                                }
                              }
                            }
                          }
                        }
                        else {
                          S193898=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                      else {
                        S193898=2;
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
              S193898=1;
              if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 157, column: 15
                zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 159, column: 14
                zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 160, column: 14
                if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 162, column: 18
                  S194024=0;
                  if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 165, column: 22
                    S193991=0;
                    System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 166, column: 13
                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 167, column: 13
                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                    currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 168, column: 13
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S193991=1;
                    if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 176, column: 21
                      System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 177, column: 13
                      currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 178, column: 13
                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 179, column: 16
                      currsigs.addElement(zoneOneSevenFanONOFF);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S194024=1;
                      if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 186, column: 16
                        S193999=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 187, column: 19
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 188, column: 19
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 189, column: 19
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S193999=1;
                        if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 194, column: 26
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 195, column: 19
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 196, column: 19
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 197, column: 19
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S193898=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  S193898=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                S193898=2;
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

  public void thread204855(int [] tdone, int [] ends){
        switch(S193896){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S193880){
          case 0 : 
            if(currentTime.getprestatus()){//sysj\ECS.sysj line: 90, column: 12
              currentHour_thread_2 = (Integer)(currentTime.getpreval() == null ? 0 : ((Integer)currentTime.getpreval()).intValue());//sysj\ECS.sysj line: 91, column: 6
              S193880=1;
              if(currentHour_thread_2 >= 9 && currentHour_thread_2 <= 17){//sysj\ECS.sysj line: 93, column: 14
                workhrs_1.setPresent();//sysj\ECS.sysj line: 94, column: 14
                currsigs.addElement(workhrs_1);
                S193880=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                afterhrs_1.setPresent();//sysj\ECS.sysj line: 96, column: 14
                currsigs.addElement(afterhrs_1);
                S193880=0;
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
            S193880=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread204853(int [] tdone, int [] ends){
        S198684=1;
    currentTemp_thread_5 = 30;//sysj\ECS.sysj line: 275, column: 2
    currentHumidity_thread_5 = 50;//sysj\ECS.sysj line: 276, column: 2
    System.out.println("Current Temp For Zone 4,5,6: " + currentTemp_thread_5);//sysj\ECS.sysj line: 277, column: 2
    S198408=0;
    if(workhrs_1.getprestatus()){//sysj\ECS.sysj line: 281, column: 12
      tempzoneFourFiveSixTemp_thread_5 = (Integer)(zoneFourFiveSixTemp.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixTemp.getpreval()).intValue());//sysj\ECS.sysj line: 282, column: 7
      humidityzoneFourFiveSix_thread_5 = (Integer)(zoneFourFiveSixHumid.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixHumid.getpreval()).intValue());//sysj\ECS.sysj line: 283, column: 7
      S198354=0;
      if(tempzoneFourFiveSixTemp_thread_5 > currentTemp_thread_5){//sysj\ECS.sysj line: 285, column: 11
        System.out.println("Turning ON AC to Heat Up for Zone 4,5,6");//sysj\ECS.sysj line: 286, column: 8
        zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 287, column: 8
        currsigs.addElement(zoneFourFiveSixACONOFF);
        currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 288, column: 8
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S198354=1;
        if(tempzoneFourFiveSixTemp_thread_5 < currentTemp_thread_5){//sysj\ECS.sysj line: 295, column: 11
          System.out.println("Turning ON AC to Cool Down for Zone 4,5,6");//sysj\ECS.sysj line: 296, column: 8
          zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 297, column: 8
          currsigs.addElement(zoneFourFiveSixACONOFF);
          currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 298, column: 8
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          S198354=2;
          if(humidityzoneFourFiveSix_thread_5 > currentHumidity_thread_5){//sysj\ECS.sysj line: 305, column: 11
            S198382=0;
            System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 306, column: 14
            zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 307, column: 11
            currsigs.addElement(zoneFourFiveSixACONOFF);
            currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 308, column: 14
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
          }
          else {
            S198382=1;
            if(humidityzoneFourFiveSix_thread_5 < currentHumidity_thread_5){//sysj\ECS.sysj line: 313, column: 21
              System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 314, column: 14
              zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 315, column: 11
              currsigs.addElement(zoneFourFiveSixACONOFF);
              currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 316, column: 14
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S198408=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
          }
        }
      }
    }
    else {
      S198408=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread204852(int [] tdone, int [] ends){
        S198352=1;
    currentTemp_thread_4 = 30;//sysj\ECS.sysj line: 218, column: 2
    currentHumidity_thread_4 = 50;//sysj\ECS.sysj line: 219, column: 2
    System.out.println("Current Temp For Zone 2,3: " + currentTemp_thread_4);//sysj\ECS.sysj line: 220, column: 2
    S198076=0;
    if(workhrs_1.getprestatus()){//sysj\ECS.sysj line: 224, column: 12
      tempzoneTwoThree_thread_4 = (Integer)(zoneTwoThreeTemp.getpreval() == null ? 0 : ((Integer)zoneTwoThreeTemp.getpreval()).intValue());//sysj\ECS.sysj line: 225, column: 7
      humidityzoneTwoThree_thread_4 = (Integer)(zoneTwoThreeHumid.getpreval() == null ? 0 : ((Integer)zoneTwoThreeHumid.getpreval()).intValue());//sysj\ECS.sysj line: 226, column: 7
      S198022=0;
      if(tempzoneTwoThree_thread_4 > currentTemp_thread_4){//sysj\ECS.sysj line: 228, column: 11
        System.out.println("Turning ON Heater to Heat Up for Zone 2,3");//sysj\ECS.sysj line: 229, column: 8
        zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 230, column: 8
        currsigs.addElement(zoneTwoThreeHeaterONOFF);
        currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 231, column: 8
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S198022=1;
        if(tempzoneTwoThree_thread_4 < currentTemp_thread_4){//sysj\ECS.sysj line: 238, column: 11
          System.out.println("Turning ON Fan to Cool Down for Zone 2,3");//sysj\ECS.sysj line: 239, column: 8
          zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 240, column: 8
          currsigs.addElement(zoneTwoThreeFanONOFF);
          currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 241, column: 8
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          S198022=2;
          if(humidityzoneTwoThree_thread_4 > currentHumidity_thread_4){//sysj\ECS.sysj line: 249, column: 11
            S198050=0;
            System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 250, column: 14
            zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 251, column: 8
            currsigs.addElement(zoneTwoThreeHeaterONOFF);
            currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 252, column: 14
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            S198050=1;
            if(humidityzoneTwoThree_thread_4 < currentHumidity_thread_4){//sysj\ECS.sysj line: 257, column: 21
              System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 258, column: 14
              zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 259, column: 11
              currsigs.addElement(zoneTwoThreeFanONOFF);
              currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 260, column: 14
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S198076=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
          }
        }
      }
    }
    else {
      S198076=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread204851(int [] tdone, int [] ends){
        S198020=1;
    currentTemp_thread_3 = 30;//sysj\ECS.sysj line: 106, column: 2
    currentHumidity_thread_3 = 50;//sysj\ECS.sysj line: 107, column: 2
    System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_3);//sysj\ECS.sysj line: 108, column: 2
    tempZoneOneSeven_thread_3 = (Integer)(zoneOneSevenTemp.getpreval() == null ? 0 : ((Integer)zoneOneSevenTemp.getpreval()).intValue());//sysj\ECS.sysj line: 111, column: 4
    humidityZoneOneSeven_thread_3 = (Integer)(zoneOneSevenHumid.getpreval() == null ? 0 : ((Integer)zoneOneSevenHumid.getpreval()).intValue());//sysj\ECS.sysj line: 112, column: 4
    S193898=0;
    if(workhrs_1.getprestatus()){//sysj\ECS.sysj line: 114, column: 15
      S193939=0;
      if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 117, column: 11
        S193906=0;
        System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 118, column: 8
        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 119, column: 8
        currsigs.addElement(zoneOneSevenHeaterONOFF);
        currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 120, column: 8
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
      else {
        S193906=1;
        if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 128, column: 16
          System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 129, column: 8
          currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 130, column: 8
          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 131, column: 11
          currsigs.addElement(zoneOneSevenFanONOFF);
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          S193939=1;
          if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 138, column: 11
            S193914=0;
            System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 139, column: 14
            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 140, column: 14
            currsigs.addElement(zoneOneSevenHeaterONOFF);
            currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 141, column: 14
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
          else {
            S193914=1;
            if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 146, column: 21
              System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 147, column: 14
              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 148, column: 14
              currsigs.addElement(zoneOneSevenFanONOFF);
              currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 149, column: 14
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S193898=1;
              if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 157, column: 15
                zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 159, column: 14
                zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 160, column: 14
                if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 162, column: 18
                  S194024=0;
                  if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 165, column: 22
                    S193991=0;
                    System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 166, column: 13
                    zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 167, column: 13
                    currsigs.addElement(zoneOneSevenHeaterONOFF);
                    currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 168, column: 13
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S193991=1;
                    if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 176, column: 21
                      System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 177, column: 13
                      currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 178, column: 13
                      zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 179, column: 16
                      currsigs.addElement(zoneOneSevenFanONOFF);
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S194024=1;
                      if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 186, column: 16
                        S193999=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 187, column: 19
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 188, column: 19
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 189, column: 19
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S193999=1;
                        if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 194, column: 26
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 195, column: 19
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 196, column: 19
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 197, column: 19
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S193898=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  S193898=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                S193898=2;
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
      S193898=1;
      if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 157, column: 15
        zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 159, column: 14
        zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 160, column: 14
        if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0){//sysj\ECS.sysj line: 162, column: 18
          S194024=0;
          if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 165, column: 22
            S193991=0;
            System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 166, column: 13
            zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 167, column: 13
            currsigs.addElement(zoneOneSevenHeaterONOFF);
            currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 168, column: 13
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
          else {
            S193991=1;
            if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 176, column: 21
              System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 177, column: 13
              currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 178, column: 13
              zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 179, column: 16
              currsigs.addElement(zoneOneSevenFanONOFF);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S194024=1;
              if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 186, column: 16
                S193999=0;
                System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 187, column: 19
                zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 188, column: 19
                currsigs.addElement(zoneOneSevenHeaterONOFF);
                currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 189, column: 19
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S193999=1;
                if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 194, column: 26
                  System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 195, column: 19
                  zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 196, column: 19
                  currsigs.addElement(zoneOneSevenFanONOFF);
                  currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 197, column: 19
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S193898=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
          }
        }
        else {
          S193898=2;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
      }
      else {
        S193898=2;
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
    }
  }

  public void thread204850(int [] tdone, int [] ends){
        S193896=1;
    S193880=0;
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
      switch(S203491){
        case 0 : 
          S203491=0;
          break RUN;
        
        case 1 : 
          S203491=2;
          S203491=2;
          workhrs_1.setClear();//sysj\ECS.sysj line: 83, column: 2
          afterhrs_1.setClear();//sysj\ECS.sysj line: 83, column: 2
          currentTemp_thread_1 = 30;//sysj\ECS.sysj line: 86, column: 2
          previousHour_thread_1 = -1;//sysj\ECS.sysj line: 87, column: 2
          thread204850(tdone,ends);
          thread204851(tdone,ends);
          thread204852(tdone,ends);
          thread204853(tdone,ends);
          int biggest204854 = 0;
          if(ends[2]>=biggest204854){
            biggest204854=ends[2];
          }
          if(ends[3]>=biggest204854){
            biggest204854=ends[3];
          }
          if(ends[4]>=biggest204854){
            biggest204854=ends[4];
          }
          if(ends[5]>=biggest204854){
            biggest204854=ends[5];
          }
          if(biggest204854 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_1.setClear();//sysj\ECS.sysj line: 83, column: 2
          afterhrs_1.setClear();//sysj\ECS.sysj line: 83, column: 2
          thread204855(tdone,ends);
          thread204856(tdone,ends);
          thread204857(tdone,ends);
          thread204858(tdone,ends);
          int biggest204859 = 0;
          if(ends[2]>=biggest204859){
            biggest204859=ends[2];
          }
          if(ends[3]>=biggest204859){
            biggest204859=ends[3];
          }
          if(ends[4]>=biggest204859){
            biggest204859=ends[4];
          }
          if(ends[5]>=biggest204859){
            biggest204859=ends[5];
          }
          if(biggest204859 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest204859 == 0){
            S203491=0;
            active[1]=0;
            ends[1]=0;
            S203491=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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

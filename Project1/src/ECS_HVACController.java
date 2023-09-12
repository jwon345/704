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
  private int currentTemp_thread_1;//sysj\ECS.sysj line: 50, column: 2
  private int previousHour_thread_1;//sysj\ECS.sysj line: 51, column: 2
  private int currentTemp_thread_3;//sysj\ECS.sysj line: 70, column: 2
  private int currentHumidity_thread_3;//sysj\ECS.sysj line: 71, column: 2
  private int currentTemp_thread_4;//sysj\ECS.sysj line: 135, column: 2
  private int currentHumidity_thread_4;//sysj\ECS.sysj line: 136, column: 2
  private int currentTemp_thread_5;//sysj\ECS.sysj line: 186, column: 2
  private int currentHumidity_thread_5;//sysj\ECS.sysj line: 187, column: 2
  private int currentHour_thread_2;//sysj\ECS.sysj line: 55, column: 6
  private int tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 79, column: 7
  private int humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 80, column: 7
  private int zoneOneOcc_thread_3;//sysj\ECS.sysj line: 121, column: 14
  private int zoneSevenOcc_thread_3;//sysj\ECS.sysj line: 122, column: 14
  private int tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 142, column: 7
  private int humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 143, column: 7
  private int tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 193, column: 7
  private int humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 194, column: 7
  private int S107055 = 1;
  private int S97504 = 1;
  private int S97488 = 1;
  private int S100754 = 1;
  private int S97607 = 1;
  private int S97507 = 1;
  private int S97515 = 1;
  private int S97531 = 1;
  private int S101512 = 1;
  private int S100757 = 1;
  private int S100785 = 1;
  private int S102270 = 1;
  private int S101515 = 1;
  private int S101543 = 1;
  
  private int[] ends = new int[24];
  private int[] tdone = new int[24];
  
  public void thread108123(int [] tdone, int [] ends){
        switch(S102270){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S101515){
          case 0 : 
            if(zoneFourFiveSixTemp.getprestatus()){//sysj\ECS.sysj line: 192, column: 13
              tempzoneFourFiveSixTemp_thread_5 = (Integer)(zoneFourFiveSixTemp.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixTemp.getpreval()).intValue());//sysj\ECS.sysj line: 193, column: 7
              humidityzoneFourFiveSix_thread_5 = (Integer)(zoneFourFiveSixHumid.getpreval() == null ? 0 : ((Integer)zoneFourFiveSixHumid.getpreval()).intValue());//sysj\ECS.sysj line: 194, column: 7
              S101515=1;
              if(tempzoneFourFiveSixTemp_thread_5 > currentTemp_thread_5){//sysj\ECS.sysj line: 196, column: 11
                System.out.println("Turning ON AC to Heat Up for Zone 4,5,6");//sysj\ECS.sysj line: 197, column: 8
                zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 198, column: 8
                currsigs.addElement(zoneFourFiveSixACONOFF);
                currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 199, column: 8
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S101515=2;
                if(tempzoneFourFiveSixTemp_thread_5 < currentTemp_thread_5){//sysj\ECS.sysj line: 205, column: 11
                  System.out.println("Turning ON AC to Cool Down for Zone 4,5,6");//sysj\ECS.sysj line: 206, column: 8
                  zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 207, column: 8
                  currsigs.addElement(zoneFourFiveSixACONOFF);
                  currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 208, column: 8
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S101515=3;
                  if(humidityzoneFourFiveSix_thread_5 > currentHumidity_thread_5){//sysj\ECS.sysj line: 214, column: 11
                    S101543=0;
                    System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 215, column: 14
                    zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 216, column: 11
                    currsigs.addElement(zoneFourFiveSixACONOFF);
                    currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 217, column: 14
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S101543=1;
                    if(humidityzoneFourFiveSix_thread_5 < currentHumidity_thread_5){//sysj\ECS.sysj line: 221, column: 21
                      System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 222, column: 14
                      zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 223, column: 11
                      currsigs.addElement(zoneFourFiveSixACONOFF);
                      currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 224, column: 14
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                    else {
                      S101515=0;
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
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
            if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 201, column: 14
              System.out.println("Current Temp:" + currentTemp_thread_5);//sysj\ECS.sysj line: 202, column: 8
              S101515=2;
              if(tempzoneFourFiveSixTemp_thread_5 < currentTemp_thread_5){//sysj\ECS.sysj line: 205, column: 11
                System.out.println("Turning ON AC to Cool Down for Zone 4,5,6");//sysj\ECS.sysj line: 206, column: 8
                zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 207, column: 8
                currsigs.addElement(zoneFourFiveSixACONOFF);
                currentTemp_thread_5 = tempzoneFourFiveSixTemp_thread_5;//sysj\ECS.sysj line: 208, column: 8
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S101515=3;
                if(humidityzoneFourFiveSix_thread_5 > currentHumidity_thread_5){//sysj\ECS.sysj line: 214, column: 11
                  S101543=0;
                  System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 215, column: 14
                  zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 216, column: 11
                  currsigs.addElement(zoneFourFiveSixACONOFF);
                  currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 217, column: 14
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S101543=1;
                  if(humidityzoneFourFiveSix_thread_5 < currentHumidity_thread_5){//sysj\ECS.sysj line: 221, column: 21
                    System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 222, column: 14
                    zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 223, column: 11
                    currsigs.addElement(zoneFourFiveSixACONOFF);
                    currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 224, column: 14
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S101515=0;
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
          
          case 2 : 
            if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 210, column: 14
              System.out.println("Current Temp:" + currentTemp_thread_5);//sysj\ECS.sysj line: 211, column: 8
              S101515=3;
              if(humidityzoneFourFiveSix_thread_5 > currentHumidity_thread_5){//sysj\ECS.sysj line: 214, column: 11
                S101543=0;
                System.out.println("Turning ON AC to increase humidity for Zone 4,5,6");//sysj\ECS.sysj line: 215, column: 14
                zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 216, column: 11
                currsigs.addElement(zoneFourFiveSixACONOFF);
                currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 217, column: 14
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S101543=1;
                if(humidityzoneFourFiveSix_thread_5 < currentHumidity_thread_5){//sysj\ECS.sysj line: 221, column: 21
                  System.out.println("Turning ON AC to reduce humidity for Zone 4,5,6");//sysj\ECS.sysj line: 222, column: 14
                  zoneFourFiveSixACONOFF.setPresent();//sysj\ECS.sysj line: 223, column: 11
                  currsigs.addElement(zoneFourFiveSixACONOFF);
                  currentHumidity_thread_5 = humidityzoneFourFiveSix_thread_5;//sysj\ECS.sysj line: 224, column: 14
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S101515=0;
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
          
          case 3 : 
            switch(S101543){
              case 0 : 
                if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 219, column: 17
                  System.out.println("Current Humidity For Zone 4,5,6: " + currentHumidity_thread_5);//sysj\ECS.sysj line: 220, column: 14
                  S101515=0;
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
                if(zoneFourFiveSixAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 226, column: 17
                  System.out.println("Current Humidity For Zone 4,5,6: " + currentHumidity_thread_5);//sysj\ECS.sysj line: 227, column: 14
                  S101515=0;
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
      
    }
  }

  public void thread108122(int [] tdone, int [] ends){
        switch(S101512){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S100757){
          case 0 : 
            if(zoneTwoThreeTemp.getprestatus()){//sysj\ECS.sysj line: 141, column: 13
              tempzoneTwoThree_thread_4 = (Integer)(zoneTwoThreeTemp.getpreval() == null ? 0 : ((Integer)zoneTwoThreeTemp.getpreval()).intValue());//sysj\ECS.sysj line: 142, column: 7
              humidityzoneTwoThree_thread_4 = (Integer)(zoneTwoThreeHumid.getpreval() == null ? 0 : ((Integer)zoneTwoThreeHumid.getpreval()).intValue());//sysj\ECS.sysj line: 143, column: 7
              S100757=1;
              if(tempzoneTwoThree_thread_4 > currentTemp_thread_4){//sysj\ECS.sysj line: 145, column: 11
                System.out.println("Turning ON Heater to Heat Up for Zone 2,3");//sysj\ECS.sysj line: 146, column: 8
                zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 147, column: 8
                currsigs.addElement(zoneTwoThreeHeaterONOFF);
                currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 148, column: 8
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S100757=2;
                if(tempzoneTwoThree_thread_4 < currentTemp_thread_4){//sysj\ECS.sysj line: 154, column: 11
                  System.out.println("Turning ON Fan to Cool Down for Zone 2,3");//sysj\ECS.sysj line: 155, column: 8
                  zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 156, column: 8
                  currsigs.addElement(zoneTwoThreeFanONOFF);
                  currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 157, column: 8
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S100757=3;
                  if(humidityzoneTwoThree_thread_4 > currentHumidity_thread_4){//sysj\ECS.sysj line: 164, column: 11
                    S100785=0;
                    System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 165, column: 14
                    zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 166, column: 8
                    currsigs.addElement(zoneTwoThreeHeaterONOFF);
                    currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 167, column: 14
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S100785=1;
                    if(humidityzoneTwoThree_thread_4 < currentHumidity_thread_4){//sysj\ECS.sysj line: 171, column: 21
                      System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 172, column: 14
                      zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 173, column: 11
                      currsigs.addElement(zoneTwoThreeFanONOFF);
                      currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 174, column: 14
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S100757=0;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
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
            if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 150, column: 15
              System.out.println("Current Temp:" + currentTemp_thread_4);//sysj\ECS.sysj line: 151, column: 8
              S100757=2;
              if(tempzoneTwoThree_thread_4 < currentTemp_thread_4){//sysj\ECS.sysj line: 154, column: 11
                System.out.println("Turning ON Fan to Cool Down for Zone 2,3");//sysj\ECS.sysj line: 155, column: 8
                zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 156, column: 8
                currsigs.addElement(zoneTwoThreeFanONOFF);
                currentTemp_thread_4 = tempzoneTwoThree_thread_4;//sysj\ECS.sysj line: 157, column: 8
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S100757=3;
                if(humidityzoneTwoThree_thread_4 > currentHumidity_thread_4){//sysj\ECS.sysj line: 164, column: 11
                  S100785=0;
                  System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 165, column: 14
                  zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 166, column: 8
                  currsigs.addElement(zoneTwoThreeHeaterONOFF);
                  currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 167, column: 14
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S100785=1;
                  if(humidityzoneTwoThree_thread_4 < currentHumidity_thread_4){//sysj\ECS.sysj line: 171, column: 21
                    System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 172, column: 14
                    zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 173, column: 11
                    currsigs.addElement(zoneTwoThreeFanONOFF);
                    currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 174, column: 14
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S100757=0;
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
          
          case 2 : 
            if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 160, column: 15
              System.out.println("Current Temp:" + currentTemp_thread_4);//sysj\ECS.sysj line: 161, column: 8
              S100757=3;
              if(humidityzoneTwoThree_thread_4 > currentHumidity_thread_4){//sysj\ECS.sysj line: 164, column: 11
                S100785=0;
                System.out.println("Turning ON Heater to increase humidity for Zone 2,3");//sysj\ECS.sysj line: 165, column: 14
                zoneTwoThreeHeaterONOFF.setPresent();//sysj\ECS.sysj line: 166, column: 8
                currsigs.addElement(zoneTwoThreeHeaterONOFF);
                currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 167, column: 14
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S100785=1;
                if(humidityzoneTwoThree_thread_4 < currentHumidity_thread_4){//sysj\ECS.sysj line: 171, column: 21
                  System.out.println("Turning ON Fan to reduce humidity for Zone 2,3");//sysj\ECS.sysj line: 172, column: 14
                  zoneTwoThreeFanONOFF.setPresent();//sysj\ECS.sysj line: 173, column: 11
                  currsigs.addElement(zoneTwoThreeFanONOFF);
                  currentHumidity_thread_4 = humidityzoneTwoThree_thread_4;//sysj\ECS.sysj line: 174, column: 14
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S100757=0;
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
          
          case 3 : 
            switch(S100785){
              case 0 : 
                if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 169, column: 15
                  System.out.println("Current Humidity For Zone 2,3: " + currentHumidity_thread_4);//sysj\ECS.sysj line: 170, column: 14
                  S100757=0;
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
                if(zoneTwoThreeAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 177, column: 15
                  System.out.println("Current Humidity For Zone 2,3: " + currentHumidity_thread_4);//sysj\ECS.sysj line: 178, column: 14
                  S100757=0;
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
      
    }
  }

  public void thread108121(int [] tdone, int [] ends){
        switch(S100754){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S97607){
          case 0 : 
            if(zoneOneSevenTemp.getprestatus()){//sysj\ECS.sysj line: 76, column: 13
              S97607=1;
              if(workhrs_1.getprestatus()){//sysj\ECS.sysj line: 78, column: 15
                tempZoneOneSeven_thread_3 = (Integer)(zoneOneSevenTemp.getpreval() == null ? 0 : ((Integer)zoneOneSevenTemp.getpreval()).intValue());//sysj\ECS.sysj line: 79, column: 7
                humidityZoneOneSeven_thread_3 = (Integer)(zoneOneSevenHumid.getpreval() == null ? 0 : ((Integer)zoneOneSevenHumid.getpreval()).intValue());//sysj\ECS.sysj line: 80, column: 7
                S97507=0;
                if(tempZoneOneSeven_thread_3 > currentTemp_thread_3){//sysj\ECS.sysj line: 82, column: 11
                  S97515=0;
                  System.out.println("Turning ON Heater to Heat Up for Zone 1,7");//sysj\ECS.sysj line: 83, column: 8
                  zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 84, column: 8
                  currsigs.addElement(zoneOneSevenHeaterONOFF);
                  currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 85, column: 8
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S97515=1;
                  if(tempZoneOneSeven_thread_3 < currentTemp_thread_3){//sysj\ECS.sysj line: 92, column: 16
                    System.out.println("Turning ON Fan to Cool Down for Zone 1,7");//sysj\ECS.sysj line: 93, column: 8
                    currentTemp_thread_3 = tempZoneOneSeven_thread_3;//sysj\ECS.sysj line: 94, column: 8
                    zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 95, column: 11
                    currsigs.addElement(zoneOneSevenFanONOFF);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S97507=1;
                    if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 101, column: 11
                      S97531=0;
                      System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 102, column: 14
                      zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 103, column: 14
                      currsigs.addElement(zoneOneSevenHeaterONOFF);
                      currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 104, column: 14
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    else {
                      S97531=1;
                      if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 108, column: 21
                        System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 109, column: 14
                        zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 110, column: 14
                        currsigs.addElement(zoneOneSevenFanONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 111, column: 14
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 118, column: 15
                          System.out.println("Current Non Working Hours");//sysj\ECS.sysj line: 119, column: 14
                          zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 121, column: 14
                          zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 122, column: 14
                          if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0) {//sysj\ECS.sysj line: 124, column: 54
                            System.out.println("Someone detected in Zone 1 or Zone 7 during non-working hours");//sysj\ECS.sysj line: 125, column: 18
                          }
                          S97607=0;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          S97607=0;
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
                if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 118, column: 15
                  System.out.println("Current Non Working Hours");//sysj\ECS.sysj line: 119, column: 14
                  zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 121, column: 14
                  zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 122, column: 14
                  if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0) {//sysj\ECS.sysj line: 124, column: 54
                    System.out.println("Someone detected in Zone 1 or Zone 7 during non-working hours");//sysj\ECS.sysj line: 125, column: 18
                  }
                  S97607=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S97607=0;
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
            switch(S97507){
              case 0 : 
                switch(S97515){
                  case 0 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 87, column: 15
                      System.out.println("Current Temp For Zone 1,7:" + currentTemp_thread_3);//sysj\ECS.sysj line: 88, column: 8
                      S97507=1;
                      if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 101, column: 11
                        S97531=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 102, column: 14
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 103, column: 14
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 104, column: 14
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S97531=1;
                        if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 108, column: 21
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 109, column: 14
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 110, column: 14
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 111, column: 14
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 118, column: 15
                            System.out.println("Current Non Working Hours");//sysj\ECS.sysj line: 119, column: 14
                            zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 121, column: 14
                            zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 122, column: 14
                            if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0) {//sysj\ECS.sysj line: 124, column: 54
                              System.out.println("Someone detected in Zone 1 or Zone 7 during non-working hours");//sysj\ECS.sysj line: 125, column: 18
                            }
                            S97607=0;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S97607=0;
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
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 97, column: 18
                      System.out.println("Current Temp For Zone 1,7:" + currentTemp_thread_3);//sysj\ECS.sysj line: 98, column: 8
                      S97507=1;
                      if(humidityZoneOneSeven_thread_3 > currentHumidity_thread_3){//sysj\ECS.sysj line: 101, column: 11
                        S97531=0;
                        System.out.println("Turning ON Heater to increase humidity for Zone 1,7");//sysj\ECS.sysj line: 102, column: 14
                        zoneOneSevenHeaterONOFF.setPresent();//sysj\ECS.sysj line: 103, column: 14
                        currsigs.addElement(zoneOneSevenHeaterONOFF);
                        currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 104, column: 14
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S97531=1;
                        if(humidityZoneOneSeven_thread_3 < currentHumidity_thread_3){//sysj\ECS.sysj line: 108, column: 21
                          System.out.println("Turning ON Fan to reduce humidity for Zone 1,7");//sysj\ECS.sysj line: 109, column: 14
                          zoneOneSevenFanONOFF.setPresent();//sysj\ECS.sysj line: 110, column: 14
                          currsigs.addElement(zoneOneSevenFanONOFF);
                          currentHumidity_thread_3 = humidityZoneOneSeven_thread_3;//sysj\ECS.sysj line: 111, column: 14
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 118, column: 15
                            System.out.println("Current Non Working Hours");//sysj\ECS.sysj line: 119, column: 14
                            zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 121, column: 14
                            zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 122, column: 14
                            if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0) {//sysj\ECS.sysj line: 124, column: 54
                              System.out.println("Someone detected in Zone 1 or Zone 7 during non-working hours");//sysj\ECS.sysj line: 125, column: 18
                            }
                            S97607=0;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            S97607=0;
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
                switch(S97531){
                  case 0 : 
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 106, column: 18
                      System.out.println("Current Humidity For Zone 1,7:" + currentHumidity_thread_3);//sysj\ECS.sysj line: 107, column: 14
                      if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 118, column: 15
                        System.out.println("Current Non Working Hours");//sysj\ECS.sysj line: 119, column: 14
                        zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 121, column: 14
                        zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 122, column: 14
                        if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0) {//sysj\ECS.sysj line: 124, column: 54
                          System.out.println("Someone detected in Zone 1 or Zone 7 during non-working hours");//sysj\ECS.sysj line: 125, column: 18
                        }
                        S97607=0;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S97607=0;
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
                    if(zoneOneSevenAtTempHumid.getprestatus()){//sysj\ECS.sysj line: 113, column: 18
                      System.out.println("Current Humidity For Zone 1,7:" + currentHumidity_thread_3);//sysj\ECS.sysj line: 114, column: 14
                      if(afterhrs_1.getprestatus()){//sysj\ECS.sysj line: 118, column: 15
                        System.out.println("Current Non Working Hours");//sysj\ECS.sysj line: 119, column: 14
                        zoneOneOcc_thread_3 = (Integer)(zoneOneOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneOneOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 121, column: 14
                        zoneSevenOcc_thread_3 = (Integer)(zoneSevenOccupancy_B.getpreval() == null ? 0 : ((Integer)zoneSevenOccupancy_B.getpreval()).intValue());//sysj\ECS.sysj line: 122, column: 14
                        if(zoneOneOcc_thread_3 > 0 || zoneSevenOcc_thread_3 > 0) {//sysj\ECS.sysj line: 124, column: 54
                          System.out.println("Someone detected in Zone 1 or Zone 7 during non-working hours");//sysj\ECS.sysj line: 125, column: 18
                        }
                        S97607=0;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S97607=0;
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
          
        }
        break;
      
    }
  }

  public void thread108120(int [] tdone, int [] ends){
        switch(S97504){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S97488){
          case 0 : 
            if(currentTime.getprestatus()){//sysj\ECS.sysj line: 54, column: 12
              currentHour_thread_2 = (Integer)(currentTime.getpreval() == null ? 0 : ((Integer)currentTime.getpreval()).intValue());//sysj\ECS.sysj line: 55, column: 6
              S97488=1;
              if(currentHour_thread_2 >= 9 && currentHour_thread_2 <= 17){//sysj\ECS.sysj line: 57, column: 14
                workhrs_1.setPresent();//sysj\ECS.sysj line: 58, column: 14
                currsigs.addElement(workhrs_1);
                S97488=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                afterhrs_1.setPresent();//sysj\ECS.sysj line: 60, column: 14
                currsigs.addElement(afterhrs_1);
                S97488=0;
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
            S97488=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread108118(int [] tdone, int [] ends){
        S102270=1;
    currentTemp_thread_5 = 30;//sysj\ECS.sysj line: 186, column: 2
    currentHumidity_thread_5 = 50;//sysj\ECS.sysj line: 187, column: 2
    System.out.println("Current Temp For Zone 4,5,6: " + currentTemp_thread_5);//sysj\ECS.sysj line: 188, column: 2
    S101515=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread108117(int [] tdone, int [] ends){
        S101512=1;
    currentTemp_thread_4 = 30;//sysj\ECS.sysj line: 135, column: 2
    currentHumidity_thread_4 = 50;//sysj\ECS.sysj line: 136, column: 2
    System.out.println("Current Temp For Zone 2,3: " + currentTemp_thread_4);//sysj\ECS.sysj line: 137, column: 2
    S100757=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread108116(int [] tdone, int [] ends){
        S100754=1;
    currentTemp_thread_3 = 30;//sysj\ECS.sysj line: 70, column: 2
    currentHumidity_thread_3 = 50;//sysj\ECS.sysj line: 71, column: 2
    System.out.println("Current Temp For Zone 1,7: " + currentTemp_thread_3);//sysj\ECS.sysj line: 72, column: 2
    S97607=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread108115(int [] tdone, int [] ends){
        S97504=1;
    S97488=0;
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
      switch(S107055){
        case 0 : 
          S107055=0;
          break RUN;
        
        case 1 : 
          S107055=2;
          S107055=2;
          workhrs_1.setClear();//sysj\ECS.sysj line: 47, column: 2
          afterhrs_1.setClear();//sysj\ECS.sysj line: 47, column: 2
          currentTemp_thread_1 = 30;//sysj\ECS.sysj line: 50, column: 2
          previousHour_thread_1 = -1;//sysj\ECS.sysj line: 51, column: 2
          thread108115(tdone,ends);
          thread108116(tdone,ends);
          thread108117(tdone,ends);
          thread108118(tdone,ends);
          int biggest108119 = 0;
          if(ends[2]>=biggest108119){
            biggest108119=ends[2];
          }
          if(ends[3]>=biggest108119){
            biggest108119=ends[3];
          }
          if(ends[4]>=biggest108119){
            biggest108119=ends[4];
          }
          if(ends[5]>=biggest108119){
            biggest108119=ends[5];
          }
          if(biggest108119 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          workhrs_1.setClear();//sysj\ECS.sysj line: 47, column: 2
          afterhrs_1.setClear();//sysj\ECS.sysj line: 47, column: 2
          thread108120(tdone,ends);
          thread108121(tdone,ends);
          thread108122(tdone,ends);
          thread108123(tdone,ends);
          int biggest108124 = 0;
          if(ends[2]>=biggest108124){
            biggest108124=ends[2];
          }
          if(ends[3]>=biggest108124){
            biggest108124=ends[3];
          }
          if(ends[4]>=biggest108124){
            biggest108124=ends[4];
          }
          if(ends[5]>=biggest108124){
            biggest108124=ends[5];
          }
          if(biggest108124 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest108124 == 0){
            S107055=0;
            active[1]=0;
            ends[1]=0;
            S107055=0;
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

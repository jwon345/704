import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class RotaryController extends ClockDomain{
  public RotaryController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public input_Channel convReady_in = new input_Channel();
  public input_Channel fillerReady_in = new input_Channel();
  public input_Channel capperReady_in = new input_Channel();
  public output_Channel rotated_o = new output_Channel();
  private Signal cvR_14;
  private Signal fR_14;
  private Signal cR_14;
  private long __start_thread_19;//sysj\conveyor_controller.sysj line: 207, column: 44
  private int S10733 = 1;
  private int S4000 = 1;
  private int S3896 = 1;
  private int S3891 = 1;
  private int S3918 = 1;
  private int S3913 = 1;
  private int S4922 = 1;
  private int S4007 = 1;
  private int S4003 = 1;
  private int S4006 = 1;
  private int S4028 = 1;
  private int S4044 = 1;
  private int S4147 = 1;
  private int S4142 = 1;
  private int S5122 = 1;
  private int S5021 = 1;
  private int S4955 = 1;
  private int S4947 = 1;
  private int S4946 = 1;
  private int S4930 = 1;
  private int S4925 = 1;
  private int S4953 = 1;
  private int S5120 = 1;
  private int S5054 = 1;
  private int S5046 = 1;
  private int S5045 = 1;
  private int S5029 = 1;
  private int S5024 = 1;
  private int S5052 = 1;
  
  private int[] ends = new int[37];
  private int[] tdone = new int[37];
  
  public void thread18887(int [] tdone, int [] ends){
        S5052=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S5052=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18886(int [] tdone, int [] ends){
        S5046=1;
    S5045=0;
    S5029=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S5029=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S5024=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S5024=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S5045=1;
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
      else {
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
  }

  public void thread18884(int [] tdone, int [] ends){
        switch(S5052){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
        currsigs.addElement(fR_14);
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
        break;
      
    }
  }

  public void thread18883(int [] tdone, int [] ends){
        switch(S5046){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S5045){
          case 0 : 
            switch(S5029){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                  S5029=1;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  switch(S5024){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
                        S5024=1;
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                          ends[25]=2;
                          ;//sysj\conveyor_controller.sysj line: 56, column: 5
                          S5045=1;
                          active[25]=1;
                          ends[25]=1;
                          tdone[25]=1;
                        }
                        else {
                          active[25]=1;
                          ends[25]=1;
                          tdone[25]=1;
                        }
                      }
                      else {
                        active[25]=1;
                        ends[25]=1;
                        tdone[25]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                        ends[25]=2;
                        ;//sysj\conveyor_controller.sysj line: 56, column: 5
                        S5045=1;
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
                }
                break;
              
              case 1 : 
                S5029=1;
                S5029=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                  S5029=1;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S5024=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
                    S5024=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                      ends[25]=2;
                      ;//sysj\conveyor_controller.sysj line: 56, column: 5
                      S5045=1;
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                    else {
                      active[25]=1;
                      ends[25]=1;
                      tdone[25]=1;
                    }
                  }
                  else {
                    active[25]=1;
                    ends[25]=1;
                    tdone[25]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5045=1;
            S5045=2;
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
            break;
          
          case 2 : 
            S5045=2;
            fillerReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 56, column: 36
            ends[25]=2;
            tdone[25]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread18882(int [] tdone, int [] ends){
        switch(S5120){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S5054){
          case 0 : 
            thread18883(tdone,ends);
            thread18884(tdone,ends);
            int biggest18885 = 0;
            if(ends[25]>=biggest18885){
              biggest18885=ends[25];
            }
            if(ends[26]>=biggest18885){
              biggest18885=ends[26];
            }
            if(biggest18885 == 1){
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            if(biggest18885 == 2){
              ends[24]=2;
              ;//sysj\conveyor_controller.sysj line: 55, column: 3
              S5054=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            //FINXME code
            if(biggest18885 == 0){
              S5054=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 1 : 
            S5054=1;
            S5054=0;
            thread18886(tdone,ends);
            thread18887(tdone,ends);
            int biggest18888 = 0;
            if(ends[25]>=biggest18888){
              biggest18888=ends[25];
            }
            if(ends[26]>=biggest18888){
              biggest18888=ends[26];
            }
            if(biggest18888 == 1){
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18880(int [] tdone, int [] ends){
        S4953=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4953=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18879(int [] tdone, int [] ends){
        S4947=1;
    S4946=0;
    S4930=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4930=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4925=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4925=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4946=1;
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
      }
      else {
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
    }
  }

  public void thread18877(int [] tdone, int [] ends){
        switch(S4953){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
        currsigs.addElement(cvR_14);
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
        break;
      
    }
  }

  public void thread18876(int [] tdone, int [] ends){
        switch(S4947){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S4946){
          case 0 : 
            switch(S4930){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                  S4930=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  switch(S4925){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
                        S4925=1;
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                          ends[22]=2;
                          ;//sysj\conveyor_controller.sysj line: 56, column: 5
                          S4946=1;
                          active[22]=1;
                          ends[22]=1;
                          tdone[22]=1;
                        }
                        else {
                          active[22]=1;
                          ends[22]=1;
                          tdone[22]=1;
                        }
                      }
                      else {
                        active[22]=1;
                        ends[22]=1;
                        tdone[22]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                        ends[22]=2;
                        ;//sysj\conveyor_controller.sysj line: 56, column: 5
                        S4946=1;
                        active[22]=1;
                        ends[22]=1;
                        tdone[22]=1;
                      }
                      else {
                        active[22]=1;
                        ends[22]=1;
                        tdone[22]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4930=1;
                S4930=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                  S4930=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  S4925=0;
                  if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                    convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
                    S4925=1;
                    if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                      ends[22]=2;
                      ;//sysj\conveyor_controller.sysj line: 56, column: 5
                      S4946=1;
                      active[22]=1;
                      ends[22]=1;
                      tdone[22]=1;
                    }
                    else {
                      active[22]=1;
                      ends[22]=1;
                      tdone[22]=1;
                    }
                  }
                  else {
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S4946=1;
            S4946=2;
            active[22]=1;
            ends[22]=1;
            tdone[22]=1;
            break;
          
          case 2 : 
            S4946=2;
            convReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 56, column: 36
            ends[22]=2;
            tdone[22]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread18875(int [] tdone, int [] ends){
        switch(S5021){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S4955){
          case 0 : 
            thread18876(tdone,ends);
            thread18877(tdone,ends);
            int biggest18878 = 0;
            if(ends[22]>=biggest18878){
              biggest18878=ends[22];
            }
            if(ends[23]>=biggest18878){
              biggest18878=ends[23];
            }
            if(biggest18878 == 1){
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            if(biggest18878 == 2){
              ends[21]=2;
              ;//sysj\conveyor_controller.sysj line: 55, column: 3
              S4955=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            //FINXME code
            if(biggest18878 == 0){
              S4955=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            S4955=1;
            S4955=0;
            thread18879(tdone,ends);
            thread18880(tdone,ends);
            int biggest18881 = 0;
            if(ends[22]>=biggest18881){
              biggest18881=ends[22];
            }
            if(ends[23]>=biggest18881){
              biggest18881=ends[23];
            }
            if(biggest18881 == 1){
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18874(int [] tdone, int [] ends){
        switch(S5122){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        thread18875(tdone,ends);
        thread18882(tdone,ends);
        int biggest18889 = 0;
        if(ends[21]>=biggest18889){
          biggest18889=ends[21];
        }
        if(ends[24]>=biggest18889){
          biggest18889=ends[24];
        }
        if(biggest18889 == 1){
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        //FINXME code
        if(biggest18889 == 0){
          S5122=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread18872(int [] tdone, int [] ends){
        S4006=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18871(int [] tdone, int [] ends){
        S4003=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18869(int [] tdone, int [] ends){
        S4006=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18868(int [] tdone, int [] ends){
        S4003=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18866(int [] tdone, int [] ends){
        S4006=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18865(int [] tdone, int [] ends){
        S4003=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18863(int [] tdone, int [] ends){
        S4006=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18862(int [] tdone, int [] ends){
        S4003=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18860(int [] tdone, int [] ends){
        switch(S4044){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\conveyor_controller.sysj line: 207, column: 44
          ends[19]=3;
          ;//sysj\conveyor_controller.sysj line: 207, column: 44
          ends[19]=2;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread18859(int [] tdone, int [] ends){
        switch(S4028){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 207, column: 14
        currsigs.addElement(rotaryTableTrigger);
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
        break;
      
    }
  }

  public void thread18857(int [] tdone, int [] ends){
        S4044=1;
    __start_thread_19 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 207, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\conveyor_controller.sysj line: 207, column: 44
      ends[19]=3;
      ;//sysj\conveyor_controller.sysj line: 207, column: 44
      ends[19]=2;
      tdone[19]=1;
    }
    else {
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread18856(int [] tdone, int [] ends){
        S4028=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 207, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread18854(int [] tdone, int [] ends){
        S4044=1;
    __start_thread_19 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 207, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\conveyor_controller.sysj line: 207, column: 44
      ends[19]=3;
      ;//sysj\conveyor_controller.sysj line: 207, column: 44
      ends[19]=2;
      tdone[19]=1;
    }
    else {
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread18853(int [] tdone, int [] ends){
        S4028=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 207, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread18851(int [] tdone, int [] ends){
        S4044=1;
    __start_thread_19 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 207, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\conveyor_controller.sysj line: 207, column: 44
      ends[19]=3;
      ;//sysj\conveyor_controller.sysj line: 207, column: 44
      ends[19]=2;
      tdone[19]=1;
    }
    else {
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread18850(int [] tdone, int [] ends){
        S4028=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 207, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread18848(int [] tdone, int [] ends){
        switch(S4006){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(cvR_14.getprestatus()){//sysj\conveyor_controller.sysj line: 186, column: 17
          System.out.println("*Rotary - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 187, column: 11
          S4006=0;
          active[17]=0;
          ends[17]=0;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread18847(int [] tdone, int [] ends){
        switch(S4003){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(fR_14.getprestatus()){//sysj\conveyor_controller.sysj line: 181, column: 17
          System.out.println("*Rotary - Filler Ready*");//sysj\conveyor_controller.sysj line: 182, column: 11
          S4003=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread18846(int [] tdone, int [] ends){
        switch(S4922){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S4007){
          case 0 : 
            thread18847(tdone,ends);
            thread18848(tdone,ends);
            int biggest18849 = 0;
            if(ends[16]>=biggest18849){
              biggest18849=ends[16];
            }
            if(ends[17]>=biggest18849){
              biggest18849=ends[17];
            }
            if(biggest18849 == 1){
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            //FINXME code
            if(biggest18849 == 0){
              System.out.println("*Rotary - All controllers are ready*");//sysj\conveyor_controller.sysj line: 192, column: 10
              S4007=1;
              if(bottleAtPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 195, column: 18
                if(bottleAtPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 199, column: 23
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  ends[15]=2;
                  ;//sysj\conveyor_controller.sysj line: 197, column: 13
                  S4007=2;
                  thread18850(tdone,ends);
                  thread18851(tdone,ends);
                  int biggest18852 = 0;
                  if(ends[18]>=biggest18852){
                    biggest18852=ends[18];
                  }
                  if(ends[19]>=biggest18852){
                    biggest18852=ends[19];
                  }
                  if(biggest18852 == 1){
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                  if(biggest18852 == 2){
                    ends[15]=2;
                    ;//sysj\conveyor_controller.sysj line: 206, column: 12
                    System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 210, column: 16
                    S4007=3;
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
              }
              else {
                S4007=2;
                thread18853(tdone,ends);
                thread18854(tdone,ends);
                int biggest18855 = 0;
                if(ends[18]>=biggest18855){
                  biggest18855=ends[18];
                }
                if(ends[19]>=biggest18855){
                  biggest18855=ends[19];
                }
                if(biggest18855 == 1){
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                if(biggest18855 == 2){
                  ends[15]=2;
                  ;//sysj\conveyor_controller.sysj line: 206, column: 12
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 210, column: 16
                  S4007=3;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
              }
            }
            break;
          
          case 1 : 
            if(bottleAtPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 199, column: 23
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              ends[15]=2;
              ;//sysj\conveyor_controller.sysj line: 197, column: 13
              S4007=2;
              thread18856(tdone,ends);
              thread18857(tdone,ends);
              int biggest18858 = 0;
              if(ends[18]>=biggest18858){
                biggest18858=ends[18];
              }
              if(ends[19]>=biggest18858){
                biggest18858=ends[19];
              }
              if(biggest18858 == 1){
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              if(biggest18858 == 2){
                ends[15]=2;
                ;//sysj\conveyor_controller.sysj line: 206, column: 12
                System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 210, column: 16
                S4007=3;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            break;
          
          case 2 : 
            thread18859(tdone,ends);
            thread18860(tdone,ends);
            int biggest18861 = 0;
            if(ends[18]>=biggest18861){
              biggest18861=ends[18];
            }
            if(ends[19]>=biggest18861){
              biggest18861=ends[19];
            }
            if(biggest18861 == 1){
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            if(biggest18861 == 2){
              ends[15]=2;
              ;//sysj\conveyor_controller.sysj line: 206, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 210, column: 16
              S4007=3;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            //FINXME code
            if(biggest18861 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 210, column: 16
              S4007=3;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_controller.sysj line: 211, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\conveyor_controller.sysj line: 213, column: 16
              S4007=4;
              S4147=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 214, column: 13
                rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 214, column: 13
                S4147=1;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                S4142=0;
                if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 214, column: 13
                  rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 214, column: 13
                  S4142=1;
                  if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 214, column: 13
                    rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 214, column: 13
                    ends[15]=2;
                    ;//sysj\conveyor_controller.sysj line: 214, column: 13
                    S4007=0;
                    thread18862(tdone,ends);
                    thread18863(tdone,ends);
                    int biggest18864 = 0;
                    if(ends[16]>=biggest18864){
                      biggest18864=ends[16];
                    }
                    if(ends[17]>=biggest18864){
                      biggest18864=ends[17];
                    }
                    if(biggest18864 == 1){
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                  }
                  else {
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
                else {
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
              }
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 4 : 
            switch(S4147){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 214, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 214, column: 13
                  S4147=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  switch(S4142){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 214, column: 13
                        rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 214, column: 13
                        S4142=1;
                        if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 214, column: 13
                          rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 214, column: 13
                          ends[15]=2;
                          ;//sysj\conveyor_controller.sysj line: 214, column: 13
                          S4007=0;
                          thread18865(tdone,ends);
                          thread18866(tdone,ends);
                          int biggest18867 = 0;
                          if(ends[16]>=biggest18867){
                            biggest18867=ends[16];
                          }
                          if(ends[17]>=biggest18867){
                            biggest18867=ends[17];
                          }
                          if(biggest18867 == 1){
                            active[15]=1;
                            ends[15]=1;
                            tdone[15]=1;
                          }
                        }
                        else {
                          active[15]=1;
                          ends[15]=1;
                          tdone[15]=1;
                        }
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 214, column: 13
                        rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 214, column: 13
                        ends[15]=2;
                        ;//sysj\conveyor_controller.sysj line: 214, column: 13
                        S4007=0;
                        thread18868(tdone,ends);
                        thread18869(tdone,ends);
                        int biggest18870 = 0;
                        if(ends[16]>=biggest18870){
                          biggest18870=ends[16];
                        }
                        if(ends[17]>=biggest18870){
                          biggest18870=ends[17];
                        }
                        if(biggest18870 == 1){
                          active[15]=1;
                          ends[15]=1;
                          tdone[15]=1;
                        }
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4147=1;
                S4147=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 214, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 214, column: 13
                  S4147=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  S4142=0;
                  if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 214, column: 13
                    rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 214, column: 13
                    S4142=1;
                    if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 214, column: 13
                      rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 214, column: 13
                      ends[15]=2;
                      ;//sysj\conveyor_controller.sysj line: 214, column: 13
                      S4007=0;
                      thread18871(tdone,ends);
                      thread18872(tdone,ends);
                      int biggest18873 = 0;
                      if(ends[16]>=biggest18873){
                        biggest18873=ends[16];
                      }
                      if(ends[17]>=biggest18873){
                        biggest18873=ends[17];
                      }
                      if(biggest18873 == 1){
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                    }
                    else {
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                  }
                  else {
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18842(int [] tdone, int [] ends){
        S5052=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S5052=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18841(int [] tdone, int [] ends){
        S5046=1;
    S5045=0;
    S5029=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S5029=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S5024=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S5024=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S5045=1;
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
      else {
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
  }

  public void thread18840(int [] tdone, int [] ends){
        S5120=1;
    S5054=0;
    thread18841(tdone,ends);
    thread18842(tdone,ends);
    int biggest18843 = 0;
    if(ends[25]>=biggest18843){
      biggest18843=ends[25];
    }
    if(ends[26]>=biggest18843){
      biggest18843=ends[26];
    }
    if(biggest18843 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread18838(int [] tdone, int [] ends){
        S4953=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4953=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18837(int [] tdone, int [] ends){
        S4947=1;
    S4946=0;
    S4930=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4930=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4925=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4925=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4946=1;
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
      }
      else {
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
    }
  }

  public void thread18836(int [] tdone, int [] ends){
        S5021=1;
    S4955=0;
    thread18837(tdone,ends);
    thread18838(tdone,ends);
    int biggest18839 = 0;
    if(ends[22]>=biggest18839){
      biggest18839=ends[22];
    }
    if(ends[23]>=biggest18839){
      biggest18839=ends[23];
    }
    if(biggest18839 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread18835(int [] tdone, int [] ends){
        S5122=1;
    thread18836(tdone,ends);
    thread18840(tdone,ends);
    int biggest18844 = 0;
    if(ends[21]>=biggest18844){
      biggest18844=ends[21];
    }
    if(ends[24]>=biggest18844){
      biggest18844=ends[24];
    }
    if(biggest18844 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    if(biggest18844 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread18833(int [] tdone, int [] ends){
        S4006=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18832(int [] tdone, int [] ends){
        S4003=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18831(int [] tdone, int [] ends){
        S4922=1;
    S4007=0;
    thread18832(tdone,ends);
    thread18833(tdone,ends);
    int biggest18834 = 0;
    if(ends[16]>=biggest18834){
      biggest18834=ends[16];
    }
    if(ends[17]>=biggest18834){
      biggest18834=ends[17];
    }
    if(biggest18834 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread18827(int [] tdone, int [] ends){
        S5052=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S5052=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18826(int [] tdone, int [] ends){
        S5046=1;
    S5045=0;
    S5029=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S5029=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S5024=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S5024=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S5045=1;
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
      else {
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
  }

  public void thread18825(int [] tdone, int [] ends){
        S5120=1;
    S5054=0;
    thread18826(tdone,ends);
    thread18827(tdone,ends);
    int biggest18828 = 0;
    if(ends[25]>=biggest18828){
      biggest18828=ends[25];
    }
    if(ends[26]>=biggest18828){
      biggest18828=ends[26];
    }
    if(biggest18828 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread18823(int [] tdone, int [] ends){
        S4953=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4953=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18822(int [] tdone, int [] ends){
        S4947=1;
    S4946=0;
    S4930=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4930=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4925=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4925=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4946=1;
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
      }
      else {
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
    }
  }

  public void thread18821(int [] tdone, int [] ends){
        S5021=1;
    S4955=0;
    thread18822(tdone,ends);
    thread18823(tdone,ends);
    int biggest18824 = 0;
    if(ends[22]>=biggest18824){
      biggest18824=ends[22];
    }
    if(ends[23]>=biggest18824){
      biggest18824=ends[23];
    }
    if(biggest18824 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread18820(int [] tdone, int [] ends){
        S5122=1;
    thread18821(tdone,ends);
    thread18825(tdone,ends);
    int biggest18829 = 0;
    if(ends[21]>=biggest18829){
      biggest18829=ends[21];
    }
    if(ends[24]>=biggest18829){
      biggest18829=ends[24];
    }
    if(biggest18829 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    if(biggest18829 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread18818(int [] tdone, int [] ends){
        S4006=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18817(int [] tdone, int [] ends){
        S4003=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18816(int [] tdone, int [] ends){
        S4922=1;
    S4007=0;
    thread18817(tdone,ends);
    thread18818(tdone,ends);
    int biggest18819 = 0;
    if(ends[16]>=biggest18819){
      biggest18819=ends[16];
    }
    if(ends[17]>=biggest18819){
      biggest18819=ends[17];
    }
    if(biggest18819 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread18812(int [] tdone, int [] ends){
        S5052=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S5052=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18811(int [] tdone, int [] ends){
        S5046=1;
    S5045=0;
    S5029=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S5029=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S5024=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S5024=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S5045=1;
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
      else {
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
  }

  public void thread18810(int [] tdone, int [] ends){
        S5120=1;
    S5054=0;
    thread18811(tdone,ends);
    thread18812(tdone,ends);
    int biggest18813 = 0;
    if(ends[25]>=biggest18813){
      biggest18813=ends[25];
    }
    if(ends[26]>=biggest18813){
      biggest18813=ends[26];
    }
    if(biggest18813 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread18808(int [] tdone, int [] ends){
        S4953=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4953=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18807(int [] tdone, int [] ends){
        S4947=1;
    S4946=0;
    S4930=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4930=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4925=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4925=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4946=1;
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
      }
      else {
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
    }
  }

  public void thread18806(int [] tdone, int [] ends){
        S5021=1;
    S4955=0;
    thread18807(tdone,ends);
    thread18808(tdone,ends);
    int biggest18809 = 0;
    if(ends[22]>=biggest18809){
      biggest18809=ends[22];
    }
    if(ends[23]>=biggest18809){
      biggest18809=ends[23];
    }
    if(biggest18809 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread18805(int [] tdone, int [] ends){
        S5122=1;
    thread18806(tdone,ends);
    thread18810(tdone,ends);
    int biggest18814 = 0;
    if(ends[21]>=biggest18814){
      biggest18814=ends[21];
    }
    if(ends[24]>=biggest18814){
      biggest18814=ends[24];
    }
    if(biggest18814 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    if(biggest18814 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread18803(int [] tdone, int [] ends){
        S4006=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18802(int [] tdone, int [] ends){
        S4003=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18801(int [] tdone, int [] ends){
        S4922=1;
    S4007=0;
    thread18802(tdone,ends);
    thread18803(tdone,ends);
    int biggest18804 = 0;
    if(ends[16]>=biggest18804){
      biggest18804=ends[16];
    }
    if(ends[17]>=biggest18804){
      biggest18804=ends[17];
    }
    if(biggest18804 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread18797(int [] tdone, int [] ends){
        S5052=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S5052=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18796(int [] tdone, int [] ends){
        S5046=1;
    S5045=0;
    S5029=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S5029=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S5024=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S5024=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S5045=1;
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
      else {
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
  }

  public void thread18795(int [] tdone, int [] ends){
        S5120=1;
    S5054=0;
    thread18796(tdone,ends);
    thread18797(tdone,ends);
    int biggest18798 = 0;
    if(ends[25]>=biggest18798){
      biggest18798=ends[25];
    }
    if(ends[26]>=biggest18798){
      biggest18798=ends[26];
    }
    if(biggest18798 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread18793(int [] tdone, int [] ends){
        S4953=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4953=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18792(int [] tdone, int [] ends){
        S4947=1;
    S4946=0;
    S4930=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4930=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4925=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4925=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4946=1;
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
      }
      else {
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
    }
  }

  public void thread18791(int [] tdone, int [] ends){
        S5021=1;
    S4955=0;
    thread18792(tdone,ends);
    thread18793(tdone,ends);
    int biggest18794 = 0;
    if(ends[22]>=biggest18794){
      biggest18794=ends[22];
    }
    if(ends[23]>=biggest18794){
      biggest18794=ends[23];
    }
    if(biggest18794 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread18790(int [] tdone, int [] ends){
        S5122=1;
    thread18791(tdone,ends);
    thread18795(tdone,ends);
    int biggest18799 = 0;
    if(ends[21]>=biggest18799){
      biggest18799=ends[21];
    }
    if(ends[24]>=biggest18799){
      biggest18799=ends[24];
    }
    if(biggest18799 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    if(biggest18799 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread18788(int [] tdone, int [] ends){
        S4006=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18787(int [] tdone, int [] ends){
        S4003=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18786(int [] tdone, int [] ends){
        S4922=1;
    S4007=0;
    thread18787(tdone,ends);
    thread18788(tdone,ends);
    int biggest18789 = 0;
    if(ends[16]>=biggest18789){
      biggest18789=ends[16];
    }
    if(ends[17]>=biggest18789){
      biggest18789=ends[17];
    }
    if(biggest18789 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread18782(int [] tdone, int [] ends){
        S5052=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S5052=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18781(int [] tdone, int [] ends){
        S5046=1;
    S5045=0;
    S5029=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S5029=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S5024=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S5024=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S5045=1;
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
      else {
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
  }

  public void thread18780(int [] tdone, int [] ends){
        S5120=1;
    S5054=0;
    thread18781(tdone,ends);
    thread18782(tdone,ends);
    int biggest18783 = 0;
    if(ends[25]>=biggest18783){
      biggest18783=ends[25];
    }
    if(ends[26]>=biggest18783){
      biggest18783=ends[26];
    }
    if(biggest18783 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread18778(int [] tdone, int [] ends){
        S4953=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4953=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18777(int [] tdone, int [] ends){
        S4947=1;
    S4946=0;
    S4930=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4930=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4925=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4925=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4946=1;
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
      }
      else {
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
    }
  }

  public void thread18776(int [] tdone, int [] ends){
        S5021=1;
    S4955=0;
    thread18777(tdone,ends);
    thread18778(tdone,ends);
    int biggest18779 = 0;
    if(ends[22]>=biggest18779){
      biggest18779=ends[22];
    }
    if(ends[23]>=biggest18779){
      biggest18779=ends[23];
    }
    if(biggest18779 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread18775(int [] tdone, int [] ends){
        S5122=1;
    thread18776(tdone,ends);
    thread18780(tdone,ends);
    int biggest18784 = 0;
    if(ends[21]>=biggest18784){
      biggest18784=ends[21];
    }
    if(ends[24]>=biggest18784){
      biggest18784=ends[24];
    }
    if(biggest18784 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    if(biggest18784 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread18773(int [] tdone, int [] ends){
        S4006=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18772(int [] tdone, int [] ends){
        S4003=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18771(int [] tdone, int [] ends){
        S4922=1;
    S4007=0;
    thread18772(tdone,ends);
    thread18773(tdone,ends);
    int biggest18774 = 0;
    if(ends[16]>=biggest18774){
      biggest18774=ends[16];
    }
    if(ends[17]>=biggest18774){
      biggest18774=ends[17];
    }
    if(biggest18774 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread18767(int [] tdone, int [] ends){
        S5052=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S5052=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18766(int [] tdone, int [] ends){
        S5046=1;
    S5045=0;
    S5029=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S5029=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S5024=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S5024=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S5045=1;
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
      else {
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
  }

  public void thread18765(int [] tdone, int [] ends){
        S5120=1;
    S5054=0;
    thread18766(tdone,ends);
    thread18767(tdone,ends);
    int biggest18768 = 0;
    if(ends[25]>=biggest18768){
      biggest18768=ends[25];
    }
    if(ends[26]>=biggest18768){
      biggest18768=ends[26];
    }
    if(biggest18768 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread18763(int [] tdone, int [] ends){
        S4953=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4953=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18762(int [] tdone, int [] ends){
        S4947=1;
    S4946=0;
    S4930=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4930=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4925=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4925=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4946=1;
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
      }
      else {
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
    }
  }

  public void thread18761(int [] tdone, int [] ends){
        S5021=1;
    S4955=0;
    thread18762(tdone,ends);
    thread18763(tdone,ends);
    int biggest18764 = 0;
    if(ends[22]>=biggest18764){
      biggest18764=ends[22];
    }
    if(ends[23]>=biggest18764){
      biggest18764=ends[23];
    }
    if(biggest18764 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread18760(int [] tdone, int [] ends){
        S5122=1;
    thread18761(tdone,ends);
    thread18765(tdone,ends);
    int biggest18769 = 0;
    if(ends[21]>=biggest18769){
      biggest18769=ends[21];
    }
    if(ends[24]>=biggest18769){
      biggest18769=ends[24];
    }
    if(biggest18769 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    if(biggest18769 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread18758(int [] tdone, int [] ends){
        S4006=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18757(int [] tdone, int [] ends){
        S4003=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18756(int [] tdone, int [] ends){
        S4922=1;
    S4007=0;
    thread18757(tdone,ends);
    thread18758(tdone,ends);
    int biggest18759 = 0;
    if(ends[16]>=biggest18759){
      biggest18759=ends[16];
    }
    if(ends[17]>=biggest18759){
      biggest18759=ends[17];
    }
    if(biggest18759 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread18752(int [] tdone, int [] ends){
        S5052=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S5052=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18751(int [] tdone, int [] ends){
        S5046=1;
    S5045=0;
    S5029=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S5029=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S5024=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S5024=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S5045=1;
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
      else {
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
  }

  public void thread18750(int [] tdone, int [] ends){
        S5120=1;
    S5054=0;
    thread18751(tdone,ends);
    thread18752(tdone,ends);
    int biggest18753 = 0;
    if(ends[25]>=biggest18753){
      biggest18753=ends[25];
    }
    if(ends[26]>=biggest18753){
      biggest18753=ends[26];
    }
    if(biggest18753 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread18748(int [] tdone, int [] ends){
        S4953=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4953=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18747(int [] tdone, int [] ends){
        S4947=1;
    S4946=0;
    S4930=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4930=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4925=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4925=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4946=1;
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
      }
      else {
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
    }
  }

  public void thread18746(int [] tdone, int [] ends){
        S5021=1;
    S4955=0;
    thread18747(tdone,ends);
    thread18748(tdone,ends);
    int biggest18749 = 0;
    if(ends[22]>=biggest18749){
      biggest18749=ends[22];
    }
    if(ends[23]>=biggest18749){
      biggest18749=ends[23];
    }
    if(biggest18749 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread18745(int [] tdone, int [] ends){
        S5122=1;
    thread18746(tdone,ends);
    thread18750(tdone,ends);
    int biggest18754 = 0;
    if(ends[21]>=biggest18754){
      biggest18754=ends[21];
    }
    if(ends[24]>=biggest18754){
      biggest18754=ends[24];
    }
    if(biggest18754 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    if(biggest18754 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread18743(int [] tdone, int [] ends){
        S4006=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18742(int [] tdone, int [] ends){
        S4003=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18741(int [] tdone, int [] ends){
        S4922=1;
    S4007=0;
    thread18742(tdone,ends);
    thread18743(tdone,ends);
    int biggest18744 = 0;
    if(ends[16]>=biggest18744){
      biggest18744=ends[16];
    }
    if(ends[17]>=biggest18744){
      biggest18744=ends[17];
    }
    if(biggest18744 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S10733){
        case 0 : 
          S10733=0;
          break RUN;
        
        case 1 : 
          S10733=2;
          S10733=2;
          cvR_14.setClear();//sysj\conveyor_controller.sysj line: 174, column: 7
          fR_14.setClear();//sysj\conveyor_controller.sysj line: 174, column: 7
          cR_14.setClear();//sysj\conveyor_controller.sysj line: 174, column: 7
          S4000=0;
          S3896=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 175, column: 7
            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 175, column: 7
            S3896=1;
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
          else {
            S3891=0;
            if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 175, column: 7
              convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 175, column: 7
              S3891=1;
              if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 175, column: 7
                convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 175, column: 7
                ends[14]=2;
                ;//sysj\conveyor_controller.sysj line: 175, column: 7
                S4000=1;
                S3918=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 176, column: 7
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                  S3918=1;
                  active[14]=1;
                  ends[14]=1;
                  break RUN;
                }
                else {
                  S3913=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 176, column: 7
                    S3913=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                      ends[14]=2;
                      ;//sysj\conveyor_controller.sysj line: 176, column: 7
                      S4000=2;
                      thread18741(tdone,ends);
                      thread18745(tdone,ends);
                      int biggest18755 = 0;
                      if(ends[15]>=biggest18755){
                        biggest18755=ends[15];
                      }
                      if(ends[20]>=biggest18755){
                        biggest18755=ends[20];
                      }
                      if(biggest18755 == 1){
                        active[14]=1;
                        ends[14]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[14]=1;
                      ends[14]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[14]=1;
                    ends[14]=1;
                    break RUN;
                  }
                }
              }
              else {
                active[14]=1;
                ends[14]=1;
                break RUN;
              }
            }
            else {
              active[14]=1;
              ends[14]=1;
              break RUN;
            }
          }
        
        case 2 : 
          cvR_14.setClear();//sysj\conveyor_controller.sysj line: 174, column: 7
          fR_14.setClear();//sysj\conveyor_controller.sysj line: 174, column: 7
          cR_14.setClear();//sysj\conveyor_controller.sysj line: 174, column: 7
          switch(S4000){
            case 0 : 
              switch(S3896){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 175, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 175, column: 7
                    S3896=1;
                    active[14]=1;
                    ends[14]=1;
                    break RUN;
                  }
                  else {
                    switch(S3891){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 175, column: 7
                          convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 175, column: 7
                          S3891=1;
                          if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 175, column: 7
                            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 175, column: 7
                            ends[14]=2;
                            ;//sysj\conveyor_controller.sysj line: 175, column: 7
                            S4000=1;
                            S3918=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 176, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                              S3918=1;
                              active[14]=1;
                              ends[14]=1;
                              break RUN;
                            }
                            else {
                              S3913=0;
                              if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                                fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 176, column: 7
                                S3913=1;
                                if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                                  ends[14]=2;
                                  ;//sysj\conveyor_controller.sysj line: 176, column: 7
                                  S4000=2;
                                  thread18756(tdone,ends);
                                  thread18760(tdone,ends);
                                  int biggest18770 = 0;
                                  if(ends[15]>=biggest18770){
                                    biggest18770=ends[15];
                                  }
                                  if(ends[20]>=biggest18770){
                                    biggest18770=ends[20];
                                  }
                                  if(biggest18770 == 1){
                                    active[14]=1;
                                    ends[14]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[14]=1;
                                  ends[14]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[14]=1;
                                ends[14]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[14]=1;
                            ends[14]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[14]=1;
                          ends[14]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 175, column: 7
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 175, column: 7
                          ends[14]=2;
                          ;//sysj\conveyor_controller.sysj line: 175, column: 7
                          S4000=1;
                          S3918=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 176, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                            S3918=1;
                            active[14]=1;
                            ends[14]=1;
                            break RUN;
                          }
                          else {
                            S3913=0;
                            if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                              fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 176, column: 7
                              S3913=1;
                              if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                                fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                                ends[14]=2;
                                ;//sysj\conveyor_controller.sysj line: 176, column: 7
                                S4000=2;
                                thread18771(tdone,ends);
                                thread18775(tdone,ends);
                                int biggest18785 = 0;
                                if(ends[15]>=biggest18785){
                                  biggest18785=ends[15];
                                }
                                if(ends[20]>=biggest18785){
                                  biggest18785=ends[20];
                                }
                                if(biggest18785 == 1){
                                  active[14]=1;
                                  ends[14]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[14]=1;
                                ends[14]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[14]=1;
                              ends[14]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[14]=1;
                          ends[14]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3896=1;
                  S3896=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 175, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 175, column: 7
                    S3896=1;
                    active[14]=1;
                    ends[14]=1;
                    break RUN;
                  }
                  else {
                    S3891=0;
                    if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 175, column: 7
                      convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 175, column: 7
                      S3891=1;
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 175, column: 7
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 175, column: 7
                        ends[14]=2;
                        ;//sysj\conveyor_controller.sysj line: 175, column: 7
                        S4000=1;
                        S3918=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 176, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                          S3918=1;
                          active[14]=1;
                          ends[14]=1;
                          break RUN;
                        }
                        else {
                          S3913=0;
                          if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                            fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 176, column: 7
                            S3913=1;
                            if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                              ends[14]=2;
                              ;//sysj\conveyor_controller.sysj line: 176, column: 7
                              S4000=2;
                              thread18786(tdone,ends);
                              thread18790(tdone,ends);
                              int biggest18800 = 0;
                              if(ends[15]>=biggest18800){
                                biggest18800=ends[15];
                              }
                              if(ends[20]>=biggest18800){
                                biggest18800=ends[20];
                              }
                              if(biggest18800 == 1){
                                active[14]=1;
                                ends[14]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[14]=1;
                              ends[14]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[14]=1;
                            ends[14]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[14]=1;
                        ends[14]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[14]=1;
                      ends[14]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S3918){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 176, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                    S3918=1;
                    active[14]=1;
                    ends[14]=1;
                    break RUN;
                  }
                  else {
                    switch(S3913){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                          fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 176, column: 7
                          S3913=1;
                          if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                            ends[14]=2;
                            ;//sysj\conveyor_controller.sysj line: 176, column: 7
                            S4000=2;
                            thread18801(tdone,ends);
                            thread18805(tdone,ends);
                            int biggest18815 = 0;
                            if(ends[15]>=biggest18815){
                              biggest18815=ends[15];
                            }
                            if(ends[20]>=biggest18815){
                              biggest18815=ends[20];
                            }
                            if(biggest18815 == 1){
                              active[14]=1;
                              ends[14]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[14]=1;
                            ends[14]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[14]=1;
                          ends[14]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                          ends[14]=2;
                          ;//sysj\conveyor_controller.sysj line: 176, column: 7
                          S4000=2;
                          thread18816(tdone,ends);
                          thread18820(tdone,ends);
                          int biggest18830 = 0;
                          if(ends[15]>=biggest18830){
                            biggest18830=ends[15];
                          }
                          if(ends[20]>=biggest18830){
                            biggest18830=ends[20];
                          }
                          if(biggest18830 == 1){
                            active[14]=1;
                            ends[14]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[14]=1;
                          ends[14]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3918=1;
                  S3918=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 176, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                    S3918=1;
                    active[14]=1;
                    ends[14]=1;
                    break RUN;
                  }
                  else {
                    S3913=0;
                    if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                      fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 176, column: 7
                      S3913=1;
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                        ends[14]=2;
                        ;//sysj\conveyor_controller.sysj line: 176, column: 7
                        S4000=2;
                        thread18831(tdone,ends);
                        thread18835(tdone,ends);
                        int biggest18845 = 0;
                        if(ends[15]>=biggest18845){
                          biggest18845=ends[15];
                        }
                        if(ends[20]>=biggest18845){
                          biggest18845=ends[20];
                        }
                        if(biggest18845 == 1){
                          active[14]=1;
                          ends[14]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[14]=1;
                        ends[14]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[14]=1;
                      ends[14]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 2 : 
              thread18846(tdone,ends);
              thread18874(tdone,ends);
              int biggest18890 = 0;
              if(ends[15]>=biggest18890){
                biggest18890=ends[15];
              }
              if(ends[20]>=biggest18890){
                biggest18890=ends[20];
              }
              if(biggest18890 == 1){
                active[14]=1;
                ends[14]=1;
                break RUN;
              }
              //FINXME code
              if(biggest18890 == 0){
                S10733=0;
                active[14]=0;
                ends[14]=0;
                S10733=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    cvR_14 = new Signal();
    fR_14 = new Signal();
    cR_14 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[14] != 0){
      int index = 14;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[14]!=0 || suspended[14]!=0 || active[14]!=1);
      else{
        if(!df){
          convReady_in.gethook();
          fillerReady_in.gethook();
          capperReady_in.gethook();
          rotated_o.gethook();
          tableAlignedWithSensor.gethook();
          bottleAtPos5.gethook();
          capOnBottleAtPos1.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      rotaryTableTrigger.setpreclear();
      cvR_14.setpreclear();
      fR_14.setpreclear();
      cR_14.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      cvR_14.setClear();
      fR_14.setClear();
      cR_14.setClear();
      convReady_in.sethook();
      fillerReady_in.sethook();
      capperReady_in.sethook();
      rotated_o.sethook();
      if(paused[14]!=0 || suspended[14]!=0 || active[14]!=1);
      else{
        convReady_in.gethook();
        fillerReady_in.gethook();
        capperReady_in.gethook();
        rotated_o.gethook();
        tableAlignedWithSensor.gethook();
        bottleAtPos5.gethook();
        capOnBottleAtPos1.gethook();
      }
      runFinisher();
      if(active[14] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

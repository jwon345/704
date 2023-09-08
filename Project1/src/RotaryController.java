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
  private int S10599 = 1;
  private int S3866 = 1;
  private int S3762 = 1;
  private int S3757 = 1;
  private int S3784 = 1;
  private int S3779 = 1;
  private int S4788 = 1;
  private int S3873 = 1;
  private int S3869 = 1;
  private int S3872 = 1;
  private int S3894 = 1;
  private int S3910 = 1;
  private int S4013 = 1;
  private int S4008 = 1;
  private int S4988 = 1;
  private int S4887 = 1;
  private int S4821 = 1;
  private int S4813 = 1;
  private int S4812 = 1;
  private int S4796 = 1;
  private int S4791 = 1;
  private int S4819 = 1;
  private int S4986 = 1;
  private int S4920 = 1;
  private int S4912 = 1;
  private int S4911 = 1;
  private int S4895 = 1;
  private int S4890 = 1;
  private int S4918 = 1;
  
  private int[] ends = new int[35];
  private int[] tdone = new int[35];
  
  public void thread18657(int [] tdone, int [] ends){
        S4918=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4918=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18656(int [] tdone, int [] ends){
        S4912=1;
    S4911=0;
    S4895=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4895=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S4890=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4890=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4911=1;
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

  public void thread18654(int [] tdone, int [] ends){
        switch(S4918){
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

  public void thread18653(int [] tdone, int [] ends){
        switch(S4912){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S4911){
          case 0 : 
            switch(S4895){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                  S4895=1;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  switch(S4890){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
                        S4890=1;
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                          ends[25]=2;
                          ;//sysj\conveyor_controller.sysj line: 56, column: 5
                          S4911=1;
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
                        S4911=1;
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
                S4895=1;
                S4895=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                  S4895=1;
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  S4890=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
                    S4890=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                      ends[25]=2;
                      ;//sysj\conveyor_controller.sysj line: 56, column: 5
                      S4911=1;
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
            S4911=1;
            S4911=2;
            active[25]=1;
            ends[25]=1;
            tdone[25]=1;
            break;
          
          case 2 : 
            S4911=2;
            fillerReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 56, column: 36
            ends[25]=2;
            tdone[25]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread18652(int [] tdone, int [] ends){
        switch(S4986){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S4920){
          case 0 : 
            thread18653(tdone,ends);
            thread18654(tdone,ends);
            int biggest18655 = 0;
            if(ends[25]>=biggest18655){
              biggest18655=ends[25];
            }
            if(ends[26]>=biggest18655){
              biggest18655=ends[26];
            }
            if(biggest18655 == 1){
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            if(biggest18655 == 2){
              ends[24]=2;
              ;//sysj\conveyor_controller.sysj line: 55, column: 3
              S4920=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            //FINXME code
            if(biggest18655 == 0){
              S4920=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 1 : 
            S4920=1;
            S4920=0;
            thread18656(tdone,ends);
            thread18657(tdone,ends);
            int biggest18658 = 0;
            if(ends[25]>=biggest18658){
              biggest18658=ends[25];
            }
            if(ends[26]>=biggest18658){
              biggest18658=ends[26];
            }
            if(biggest18658 == 1){
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18650(int [] tdone, int [] ends){
        S4819=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4819=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18649(int [] tdone, int [] ends){
        S4813=1;
    S4812=0;
    S4796=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4796=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4791=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4791=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4812=1;
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

  public void thread18647(int [] tdone, int [] ends){
        switch(S4819){
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

  public void thread18646(int [] tdone, int [] ends){
        switch(S4813){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S4812){
          case 0 : 
            switch(S4796){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                  S4796=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  switch(S4791){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
                        S4791=1;
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                          ends[22]=2;
                          ;//sysj\conveyor_controller.sysj line: 56, column: 5
                          S4812=1;
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
                        S4812=1;
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
                S4796=1;
                S4796=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                  S4796=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  S4791=0;
                  if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                    convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
                    S4791=1;
                    if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
                      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
                      ends[22]=2;
                      ;//sysj\conveyor_controller.sysj line: 56, column: 5
                      S4812=1;
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
            S4812=1;
            S4812=2;
            active[22]=1;
            ends[22]=1;
            tdone[22]=1;
            break;
          
          case 2 : 
            S4812=2;
            convReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 56, column: 36
            ends[22]=2;
            tdone[22]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread18645(int [] tdone, int [] ends){
        switch(S4887){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S4821){
          case 0 : 
            thread18646(tdone,ends);
            thread18647(tdone,ends);
            int biggest18648 = 0;
            if(ends[22]>=biggest18648){
              biggest18648=ends[22];
            }
            if(ends[23]>=biggest18648){
              biggest18648=ends[23];
            }
            if(biggest18648 == 1){
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            if(biggest18648 == 2){
              ends[21]=2;
              ;//sysj\conveyor_controller.sysj line: 55, column: 3
              S4821=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            //FINXME code
            if(biggest18648 == 0){
              S4821=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            S4821=1;
            S4821=0;
            thread18649(tdone,ends);
            thread18650(tdone,ends);
            int biggest18651 = 0;
            if(ends[22]>=biggest18651){
              biggest18651=ends[22];
            }
            if(ends[23]>=biggest18651){
              biggest18651=ends[23];
            }
            if(biggest18651 == 1){
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18644(int [] tdone, int [] ends){
        switch(S4988){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        thread18645(tdone,ends);
        thread18652(tdone,ends);
        int biggest18659 = 0;
        if(ends[21]>=biggest18659){
          biggest18659=ends[21];
        }
        if(ends[24]>=biggest18659){
          biggest18659=ends[24];
        }
        if(biggest18659 == 1){
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        //FINXME code
        if(biggest18659 == 0){
          S4988=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread18642(int [] tdone, int [] ends){
        S3872=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18641(int [] tdone, int [] ends){
        S3869=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18639(int [] tdone, int [] ends){
        S3872=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18638(int [] tdone, int [] ends){
        S3869=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18636(int [] tdone, int [] ends){
        S3872=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18635(int [] tdone, int [] ends){
        S3869=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18633(int [] tdone, int [] ends){
        S3872=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18632(int [] tdone, int [] ends){
        S3869=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18630(int [] tdone, int [] ends){
        switch(S3910){
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

  public void thread18629(int [] tdone, int [] ends){
        switch(S3894){
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

  public void thread18627(int [] tdone, int [] ends){
        S3910=1;
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

  public void thread18626(int [] tdone, int [] ends){
        S3894=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 207, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread18624(int [] tdone, int [] ends){
        S3910=1;
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

  public void thread18623(int [] tdone, int [] ends){
        S3894=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 207, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread18621(int [] tdone, int [] ends){
        S3910=1;
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

  public void thread18620(int [] tdone, int [] ends){
        S3894=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 207, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread18618(int [] tdone, int [] ends){
        switch(S3872){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(cvR_14.getprestatus()){//sysj\conveyor_controller.sysj line: 186, column: 17
          System.out.println("*Rotary - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 187, column: 11
          S3872=0;
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

  public void thread18617(int [] tdone, int [] ends){
        switch(S3869){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(fR_14.getprestatus()){//sysj\conveyor_controller.sysj line: 181, column: 17
          System.out.println("*Rotary - Filler Ready*");//sysj\conveyor_controller.sysj line: 182, column: 11
          S3869=0;
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

  public void thread18616(int [] tdone, int [] ends){
        switch(S4788){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S3873){
          case 0 : 
            thread18617(tdone,ends);
            thread18618(tdone,ends);
            int biggest18619 = 0;
            if(ends[16]>=biggest18619){
              biggest18619=ends[16];
            }
            if(ends[17]>=biggest18619){
              biggest18619=ends[17];
            }
            if(biggest18619 == 1){
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            //FINXME code
            if(biggest18619 == 0){
              System.out.println("*Rotary - All controllers are ready*");//sysj\conveyor_controller.sysj line: 192, column: 10
              S3873=1;
              if(bottleAtPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 195, column: 18
                if(bottleAtPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 199, column: 23
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  ends[15]=2;
                  ;//sysj\conveyor_controller.sysj line: 197, column: 13
                  S3873=2;
                  thread18620(tdone,ends);
                  thread18621(tdone,ends);
                  int biggest18622 = 0;
                  if(ends[18]>=biggest18622){
                    biggest18622=ends[18];
                  }
                  if(ends[19]>=biggest18622){
                    biggest18622=ends[19];
                  }
                  if(biggest18622 == 1){
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                  if(biggest18622 == 2){
                    ends[15]=2;
                    ;//sysj\conveyor_controller.sysj line: 206, column: 12
                    System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 210, column: 16
                    S3873=3;
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
              }
              else {
                S3873=2;
                thread18623(tdone,ends);
                thread18624(tdone,ends);
                int biggest18625 = 0;
                if(ends[18]>=biggest18625){
                  biggest18625=ends[18];
                }
                if(ends[19]>=biggest18625){
                  biggest18625=ends[19];
                }
                if(biggest18625 == 1){
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                if(biggest18625 == 2){
                  ends[15]=2;
                  ;//sysj\conveyor_controller.sysj line: 206, column: 12
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 210, column: 16
                  S3873=3;
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
              S3873=2;
              thread18626(tdone,ends);
              thread18627(tdone,ends);
              int biggest18628 = 0;
              if(ends[18]>=biggest18628){
                biggest18628=ends[18];
              }
              if(ends[19]>=biggest18628){
                biggest18628=ends[19];
              }
              if(biggest18628 == 1){
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              if(biggest18628 == 2){
                ends[15]=2;
                ;//sysj\conveyor_controller.sysj line: 206, column: 12
                System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 210, column: 16
                S3873=3;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
            }
            break;
          
          case 2 : 
            thread18629(tdone,ends);
            thread18630(tdone,ends);
            int biggest18631 = 0;
            if(ends[18]>=biggest18631){
              biggest18631=ends[18];
            }
            if(ends[19]>=biggest18631){
              biggest18631=ends[19];
            }
            if(biggest18631 == 1){
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            if(biggest18631 == 2){
              ends[15]=2;
              ;//sysj\conveyor_controller.sysj line: 206, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 210, column: 16
              S3873=3;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            //FINXME code
            if(biggest18631 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 210, column: 16
              S3873=3;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_controller.sysj line: 211, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\conveyor_controller.sysj line: 213, column: 16
              S3873=4;
              S4013=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 214, column: 13
                rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 214, column: 13
                S4013=1;
                active[15]=1;
                ends[15]=1;
                tdone[15]=1;
              }
              else {
                S4008=0;
                if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 214, column: 13
                  rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 214, column: 13
                  S4008=1;
                  if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 214, column: 13
                    rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 214, column: 13
                    ends[15]=2;
                    ;//sysj\conveyor_controller.sysj line: 214, column: 13
                    S3873=0;
                    thread18632(tdone,ends);
                    thread18633(tdone,ends);
                    int biggest18634 = 0;
                    if(ends[16]>=biggest18634){
                      biggest18634=ends[16];
                    }
                    if(ends[17]>=biggest18634){
                      biggest18634=ends[17];
                    }
                    if(biggest18634 == 1){
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
            switch(S4013){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 214, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 214, column: 13
                  S4013=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  switch(S4008){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 214, column: 13
                        rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 214, column: 13
                        S4008=1;
                        if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 214, column: 13
                          rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 214, column: 13
                          ends[15]=2;
                          ;//sysj\conveyor_controller.sysj line: 214, column: 13
                          S3873=0;
                          thread18635(tdone,ends);
                          thread18636(tdone,ends);
                          int biggest18637 = 0;
                          if(ends[16]>=biggest18637){
                            biggest18637=ends[16];
                          }
                          if(ends[17]>=biggest18637){
                            biggest18637=ends[17];
                          }
                          if(biggest18637 == 1){
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
                        S3873=0;
                        thread18638(tdone,ends);
                        thread18639(tdone,ends);
                        int biggest18640 = 0;
                        if(ends[16]>=biggest18640){
                          biggest18640=ends[16];
                        }
                        if(ends[17]>=biggest18640){
                          biggest18640=ends[17];
                        }
                        if(biggest18640 == 1){
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
                S4013=1;
                S4013=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 214, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 214, column: 13
                  S4013=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  S4008=0;
                  if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 214, column: 13
                    rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 214, column: 13
                    S4008=1;
                    if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 214, column: 13
                      rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 214, column: 13
                      ends[15]=2;
                      ;//sysj\conveyor_controller.sysj line: 214, column: 13
                      S3873=0;
                      thread18641(tdone,ends);
                      thread18642(tdone,ends);
                      int biggest18643 = 0;
                      if(ends[16]>=biggest18643){
                        biggest18643=ends[16];
                      }
                      if(ends[17]>=biggest18643){
                        biggest18643=ends[17];
                      }
                      if(biggest18643 == 1){
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

  public void thread18612(int [] tdone, int [] ends){
        S4918=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4918=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18611(int [] tdone, int [] ends){
        S4912=1;
    S4911=0;
    S4895=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4895=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S4890=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4890=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4911=1;
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

  public void thread18610(int [] tdone, int [] ends){
        S4986=1;
    S4920=0;
    thread18611(tdone,ends);
    thread18612(tdone,ends);
    int biggest18613 = 0;
    if(ends[25]>=biggest18613){
      biggest18613=ends[25];
    }
    if(ends[26]>=biggest18613){
      biggest18613=ends[26];
    }
    if(biggest18613 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread18608(int [] tdone, int [] ends){
        S4819=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4819=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18607(int [] tdone, int [] ends){
        S4813=1;
    S4812=0;
    S4796=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4796=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4791=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4791=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4812=1;
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

  public void thread18606(int [] tdone, int [] ends){
        S4887=1;
    S4821=0;
    thread18607(tdone,ends);
    thread18608(tdone,ends);
    int biggest18609 = 0;
    if(ends[22]>=biggest18609){
      biggest18609=ends[22];
    }
    if(ends[23]>=biggest18609){
      biggest18609=ends[23];
    }
    if(biggest18609 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread18605(int [] tdone, int [] ends){
        S4988=1;
    thread18606(tdone,ends);
    thread18610(tdone,ends);
    int biggest18614 = 0;
    if(ends[21]>=biggest18614){
      biggest18614=ends[21];
    }
    if(ends[24]>=biggest18614){
      biggest18614=ends[24];
    }
    if(biggest18614 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    if(biggest18614 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread18603(int [] tdone, int [] ends){
        S3872=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18602(int [] tdone, int [] ends){
        S3869=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18601(int [] tdone, int [] ends){
        S4788=1;
    S3873=0;
    thread18602(tdone,ends);
    thread18603(tdone,ends);
    int biggest18604 = 0;
    if(ends[16]>=biggest18604){
      biggest18604=ends[16];
    }
    if(ends[17]>=biggest18604){
      biggest18604=ends[17];
    }
    if(biggest18604 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread18597(int [] tdone, int [] ends){
        S4918=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4918=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18596(int [] tdone, int [] ends){
        S4912=1;
    S4911=0;
    S4895=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4895=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S4890=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4890=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4911=1;
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

  public void thread18595(int [] tdone, int [] ends){
        S4986=1;
    S4920=0;
    thread18596(tdone,ends);
    thread18597(tdone,ends);
    int biggest18598 = 0;
    if(ends[25]>=biggest18598){
      biggest18598=ends[25];
    }
    if(ends[26]>=biggest18598){
      biggest18598=ends[26];
    }
    if(biggest18598 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread18593(int [] tdone, int [] ends){
        S4819=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4819=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18592(int [] tdone, int [] ends){
        S4813=1;
    S4812=0;
    S4796=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4796=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4791=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4791=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4812=1;
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

  public void thread18591(int [] tdone, int [] ends){
        S4887=1;
    S4821=0;
    thread18592(tdone,ends);
    thread18593(tdone,ends);
    int biggest18594 = 0;
    if(ends[22]>=biggest18594){
      biggest18594=ends[22];
    }
    if(ends[23]>=biggest18594){
      biggest18594=ends[23];
    }
    if(biggest18594 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread18590(int [] tdone, int [] ends){
        S4988=1;
    thread18591(tdone,ends);
    thread18595(tdone,ends);
    int biggest18599 = 0;
    if(ends[21]>=biggest18599){
      biggest18599=ends[21];
    }
    if(ends[24]>=biggest18599){
      biggest18599=ends[24];
    }
    if(biggest18599 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    if(biggest18599 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread18588(int [] tdone, int [] ends){
        S3872=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18587(int [] tdone, int [] ends){
        S3869=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18586(int [] tdone, int [] ends){
        S4788=1;
    S3873=0;
    thread18587(tdone,ends);
    thread18588(tdone,ends);
    int biggest18589 = 0;
    if(ends[16]>=biggest18589){
      biggest18589=ends[16];
    }
    if(ends[17]>=biggest18589){
      biggest18589=ends[17];
    }
    if(biggest18589 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread18582(int [] tdone, int [] ends){
        S4918=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4918=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18581(int [] tdone, int [] ends){
        S4912=1;
    S4911=0;
    S4895=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4895=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S4890=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4890=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4911=1;
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

  public void thread18580(int [] tdone, int [] ends){
        S4986=1;
    S4920=0;
    thread18581(tdone,ends);
    thread18582(tdone,ends);
    int biggest18583 = 0;
    if(ends[25]>=biggest18583){
      biggest18583=ends[25];
    }
    if(ends[26]>=biggest18583){
      biggest18583=ends[26];
    }
    if(biggest18583 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread18578(int [] tdone, int [] ends){
        S4819=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4819=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18577(int [] tdone, int [] ends){
        S4813=1;
    S4812=0;
    S4796=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4796=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4791=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4791=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4812=1;
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

  public void thread18576(int [] tdone, int [] ends){
        S4887=1;
    S4821=0;
    thread18577(tdone,ends);
    thread18578(tdone,ends);
    int biggest18579 = 0;
    if(ends[22]>=biggest18579){
      biggest18579=ends[22];
    }
    if(ends[23]>=biggest18579){
      biggest18579=ends[23];
    }
    if(biggest18579 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread18575(int [] tdone, int [] ends){
        S4988=1;
    thread18576(tdone,ends);
    thread18580(tdone,ends);
    int biggest18584 = 0;
    if(ends[21]>=biggest18584){
      biggest18584=ends[21];
    }
    if(ends[24]>=biggest18584){
      biggest18584=ends[24];
    }
    if(biggest18584 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    if(biggest18584 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread18573(int [] tdone, int [] ends){
        S3872=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18572(int [] tdone, int [] ends){
        S3869=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18571(int [] tdone, int [] ends){
        S4788=1;
    S3873=0;
    thread18572(tdone,ends);
    thread18573(tdone,ends);
    int biggest18574 = 0;
    if(ends[16]>=biggest18574){
      biggest18574=ends[16];
    }
    if(ends[17]>=biggest18574){
      biggest18574=ends[17];
    }
    if(biggest18574 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread18567(int [] tdone, int [] ends){
        S4918=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4918=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18566(int [] tdone, int [] ends){
        S4912=1;
    S4911=0;
    S4895=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4895=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S4890=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4890=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4911=1;
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

  public void thread18565(int [] tdone, int [] ends){
        S4986=1;
    S4920=0;
    thread18566(tdone,ends);
    thread18567(tdone,ends);
    int biggest18568 = 0;
    if(ends[25]>=biggest18568){
      biggest18568=ends[25];
    }
    if(ends[26]>=biggest18568){
      biggest18568=ends[26];
    }
    if(biggest18568 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread18563(int [] tdone, int [] ends){
        S4819=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4819=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18562(int [] tdone, int [] ends){
        S4813=1;
    S4812=0;
    S4796=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4796=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4791=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4791=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4812=1;
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

  public void thread18561(int [] tdone, int [] ends){
        S4887=1;
    S4821=0;
    thread18562(tdone,ends);
    thread18563(tdone,ends);
    int biggest18564 = 0;
    if(ends[22]>=biggest18564){
      biggest18564=ends[22];
    }
    if(ends[23]>=biggest18564){
      biggest18564=ends[23];
    }
    if(biggest18564 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread18560(int [] tdone, int [] ends){
        S4988=1;
    thread18561(tdone,ends);
    thread18565(tdone,ends);
    int biggest18569 = 0;
    if(ends[21]>=biggest18569){
      biggest18569=ends[21];
    }
    if(ends[24]>=biggest18569){
      biggest18569=ends[24];
    }
    if(biggest18569 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    if(biggest18569 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread18558(int [] tdone, int [] ends){
        S3872=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18557(int [] tdone, int [] ends){
        S3869=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18556(int [] tdone, int [] ends){
        S4788=1;
    S3873=0;
    thread18557(tdone,ends);
    thread18558(tdone,ends);
    int biggest18559 = 0;
    if(ends[16]>=biggest18559){
      biggest18559=ends[16];
    }
    if(ends[17]>=biggest18559){
      biggest18559=ends[17];
    }
    if(biggest18559 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread18552(int [] tdone, int [] ends){
        S4918=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4918=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18551(int [] tdone, int [] ends){
        S4912=1;
    S4911=0;
    S4895=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4895=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S4890=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4890=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4911=1;
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

  public void thread18550(int [] tdone, int [] ends){
        S4986=1;
    S4920=0;
    thread18551(tdone,ends);
    thread18552(tdone,ends);
    int biggest18553 = 0;
    if(ends[25]>=biggest18553){
      biggest18553=ends[25];
    }
    if(ends[26]>=biggest18553){
      biggest18553=ends[26];
    }
    if(biggest18553 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread18548(int [] tdone, int [] ends){
        S4819=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4819=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18547(int [] tdone, int [] ends){
        S4813=1;
    S4812=0;
    S4796=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4796=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4791=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4791=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4812=1;
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

  public void thread18546(int [] tdone, int [] ends){
        S4887=1;
    S4821=0;
    thread18547(tdone,ends);
    thread18548(tdone,ends);
    int biggest18549 = 0;
    if(ends[22]>=biggest18549){
      biggest18549=ends[22];
    }
    if(ends[23]>=biggest18549){
      biggest18549=ends[23];
    }
    if(biggest18549 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread18545(int [] tdone, int [] ends){
        S4988=1;
    thread18546(tdone,ends);
    thread18550(tdone,ends);
    int biggest18554 = 0;
    if(ends[21]>=biggest18554){
      biggest18554=ends[21];
    }
    if(ends[24]>=biggest18554){
      biggest18554=ends[24];
    }
    if(biggest18554 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    if(biggest18554 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread18543(int [] tdone, int [] ends){
        S3872=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18542(int [] tdone, int [] ends){
        S3869=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18541(int [] tdone, int [] ends){
        S4788=1;
    S3873=0;
    thread18542(tdone,ends);
    thread18543(tdone,ends);
    int biggest18544 = 0;
    if(ends[16]>=biggest18544){
      biggest18544=ends[16];
    }
    if(ends[17]>=biggest18544){
      biggest18544=ends[17];
    }
    if(biggest18544 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread18537(int [] tdone, int [] ends){
        S4918=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4918=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18536(int [] tdone, int [] ends){
        S4912=1;
    S4911=0;
    S4895=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4895=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S4890=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4890=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4911=1;
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

  public void thread18535(int [] tdone, int [] ends){
        S4986=1;
    S4920=0;
    thread18536(tdone,ends);
    thread18537(tdone,ends);
    int biggest18538 = 0;
    if(ends[25]>=biggest18538){
      biggest18538=ends[25];
    }
    if(ends[26]>=biggest18538){
      biggest18538=ends[26];
    }
    if(biggest18538 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread18533(int [] tdone, int [] ends){
        S4819=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4819=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18532(int [] tdone, int [] ends){
        S4813=1;
    S4812=0;
    S4796=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4796=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4791=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4791=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4812=1;
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

  public void thread18531(int [] tdone, int [] ends){
        S4887=1;
    S4821=0;
    thread18532(tdone,ends);
    thread18533(tdone,ends);
    int biggest18534 = 0;
    if(ends[22]>=biggest18534){
      biggest18534=ends[22];
    }
    if(ends[23]>=biggest18534){
      biggest18534=ends[23];
    }
    if(biggest18534 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread18530(int [] tdone, int [] ends){
        S4988=1;
    thread18531(tdone,ends);
    thread18535(tdone,ends);
    int biggest18539 = 0;
    if(ends[21]>=biggest18539){
      biggest18539=ends[21];
    }
    if(ends[24]>=biggest18539){
      biggest18539=ends[24];
    }
    if(biggest18539 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    if(biggest18539 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread18528(int [] tdone, int [] ends){
        S3872=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18527(int [] tdone, int [] ends){
        S3869=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18526(int [] tdone, int [] ends){
        S4788=1;
    S3873=0;
    thread18527(tdone,ends);
    thread18528(tdone,ends);
    int biggest18529 = 0;
    if(ends[16]>=biggest18529){
      biggest18529=ends[16];
    }
    if(ends[17]>=biggest18529){
      biggest18529=ends[17];
    }
    if(biggest18529 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread18522(int [] tdone, int [] ends){
        S4918=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      fR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(fR_14);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4918=0;
      active[26]=0;
      ends[26]=0;
      tdone[26]=1;
    }
  }

  public void thread18521(int [] tdone, int [] ends){
        S4912=1;
    S4911=0;
    S4895=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4895=1;
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S4890=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4890=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[25]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4911=1;
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

  public void thread18520(int [] tdone, int [] ends){
        S4986=1;
    S4920=0;
    thread18521(tdone,ends);
    thread18522(tdone,ends);
    int biggest18523 = 0;
    if(ends[25]>=biggest18523){
      biggest18523=ends[25];
    }
    if(ends[26]>=biggest18523){
      biggest18523=ends[26];
    }
    if(biggest18523 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread18518(int [] tdone, int [] ends){
        S4819=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 58, column: 9
      cvR_14.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 20
      currsigs.addElement(cvR_14);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4819=0;
      active[23]=0;
      ends[23]=0;
      tdone[23]=1;
    }
  }

  public void thread18517(int [] tdone, int [] ends){
        S4813=1;
    S4812=0;
    S4796=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 56, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
      S4796=1;
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S4791=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 56, column: 5
        S4791=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 56, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 56, column: 5
          ends[22]=2;
          ;//sysj\conveyor_controller.sysj line: 56, column: 5
          S4812=1;
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

  public void thread18516(int [] tdone, int [] ends){
        S4887=1;
    S4821=0;
    thread18517(tdone,ends);
    thread18518(tdone,ends);
    int biggest18519 = 0;
    if(ends[22]>=biggest18519){
      biggest18519=ends[22];
    }
    if(ends[23]>=biggest18519){
      biggest18519=ends[23];
    }
    if(biggest18519 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread18515(int [] tdone, int [] ends){
        S4988=1;
    thread18516(tdone,ends);
    thread18520(tdone,ends);
    int biggest18524 = 0;
    if(ends[21]>=biggest18524){
      biggest18524=ends[21];
    }
    if(ends[24]>=biggest18524){
      biggest18524=ends[24];
    }
    if(biggest18524 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    if(biggest18524 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread18513(int [] tdone, int [] ends){
        S3872=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread18512(int [] tdone, int [] ends){
        S3869=1;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread18511(int [] tdone, int [] ends){
        S4788=1;
    S3873=0;
    thread18512(tdone,ends);
    thread18513(tdone,ends);
    int biggest18514 = 0;
    if(ends[16]>=biggest18514){
      biggest18514=ends[16];
    }
    if(ends[17]>=biggest18514){
      biggest18514=ends[17];
    }
    if(biggest18514 == 1){
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
      switch(S10599){
        case 0 : 
          S10599=0;
          break RUN;
        
        case 1 : 
          S10599=2;
          S10599=2;
          cvR_14.setClear();//sysj\conveyor_controller.sysj line: 174, column: 7
          fR_14.setClear();//sysj\conveyor_controller.sysj line: 174, column: 7
          cR_14.setClear();//sysj\conveyor_controller.sysj line: 174, column: 7
          S3866=0;
          S3762=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 175, column: 7
            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 175, column: 7
            S3762=1;
            active[14]=1;
            ends[14]=1;
            break RUN;
          }
          else {
            S3757=0;
            if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 175, column: 7
              convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 175, column: 7
              S3757=1;
              if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 175, column: 7
                convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 175, column: 7
                ends[14]=2;
                ;//sysj\conveyor_controller.sysj line: 175, column: 7
                S3866=1;
                S3784=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 176, column: 7
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                  S3784=1;
                  active[14]=1;
                  ends[14]=1;
                  break RUN;
                }
                else {
                  S3779=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 176, column: 7
                    S3779=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                      ends[14]=2;
                      ;//sysj\conveyor_controller.sysj line: 176, column: 7
                      S3866=2;
                      thread18511(tdone,ends);
                      thread18515(tdone,ends);
                      int biggest18525 = 0;
                      if(ends[15]>=biggest18525){
                        biggest18525=ends[15];
                      }
                      if(ends[20]>=biggest18525){
                        biggest18525=ends[20];
                      }
                      if(biggest18525 == 1){
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
          switch(S3866){
            case 0 : 
              switch(S3762){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 175, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 175, column: 7
                    S3762=1;
                    active[14]=1;
                    ends[14]=1;
                    break RUN;
                  }
                  else {
                    switch(S3757){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 175, column: 7
                          convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 175, column: 7
                          S3757=1;
                          if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 175, column: 7
                            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 175, column: 7
                            ends[14]=2;
                            ;//sysj\conveyor_controller.sysj line: 175, column: 7
                            S3866=1;
                            S3784=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 176, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                              S3784=1;
                              active[14]=1;
                              ends[14]=1;
                              break RUN;
                            }
                            else {
                              S3779=0;
                              if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                                fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 176, column: 7
                                S3779=1;
                                if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                                  ends[14]=2;
                                  ;//sysj\conveyor_controller.sysj line: 176, column: 7
                                  S3866=2;
                                  thread18526(tdone,ends);
                                  thread18530(tdone,ends);
                                  int biggest18540 = 0;
                                  if(ends[15]>=biggest18540){
                                    biggest18540=ends[15];
                                  }
                                  if(ends[20]>=biggest18540){
                                    biggest18540=ends[20];
                                  }
                                  if(biggest18540 == 1){
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
                          S3866=1;
                          S3784=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 176, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                            S3784=1;
                            active[14]=1;
                            ends[14]=1;
                            break RUN;
                          }
                          else {
                            S3779=0;
                            if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                              fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 176, column: 7
                              S3779=1;
                              if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                                fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                                ends[14]=2;
                                ;//sysj\conveyor_controller.sysj line: 176, column: 7
                                S3866=2;
                                thread18541(tdone,ends);
                                thread18545(tdone,ends);
                                int biggest18555 = 0;
                                if(ends[15]>=biggest18555){
                                  biggest18555=ends[15];
                                }
                                if(ends[20]>=biggest18555){
                                  biggest18555=ends[20];
                                }
                                if(biggest18555 == 1){
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
                  S3762=1;
                  S3762=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 175, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 175, column: 7
                    S3762=1;
                    active[14]=1;
                    ends[14]=1;
                    break RUN;
                  }
                  else {
                    S3757=0;
                    if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 175, column: 7
                      convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 175, column: 7
                      S3757=1;
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 175, column: 7
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 175, column: 7
                        ends[14]=2;
                        ;//sysj\conveyor_controller.sysj line: 175, column: 7
                        S3866=1;
                        S3784=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 176, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                          S3784=1;
                          active[14]=1;
                          ends[14]=1;
                          break RUN;
                        }
                        else {
                          S3779=0;
                          if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                            fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 176, column: 7
                            S3779=1;
                            if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                              ends[14]=2;
                              ;//sysj\conveyor_controller.sysj line: 176, column: 7
                              S3866=2;
                              thread18556(tdone,ends);
                              thread18560(tdone,ends);
                              int biggest18570 = 0;
                              if(ends[15]>=biggest18570){
                                biggest18570=ends[15];
                              }
                              if(ends[20]>=biggest18570){
                                biggest18570=ends[20];
                              }
                              if(biggest18570 == 1){
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
              switch(S3784){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 176, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                    S3784=1;
                    active[14]=1;
                    ends[14]=1;
                    break RUN;
                  }
                  else {
                    switch(S3779){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                          fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 176, column: 7
                          S3779=1;
                          if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                            ends[14]=2;
                            ;//sysj\conveyor_controller.sysj line: 176, column: 7
                            S3866=2;
                            thread18571(tdone,ends);
                            thread18575(tdone,ends);
                            int biggest18585 = 0;
                            if(ends[15]>=biggest18585){
                              biggest18585=ends[15];
                            }
                            if(ends[20]>=biggest18585){
                              biggest18585=ends[20];
                            }
                            if(biggest18585 == 1){
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
                          S3866=2;
                          thread18586(tdone,ends);
                          thread18590(tdone,ends);
                          int biggest18600 = 0;
                          if(ends[15]>=biggest18600){
                            biggest18600=ends[15];
                          }
                          if(ends[20]>=biggest18600){
                            biggest18600=ends[20];
                          }
                          if(biggest18600 == 1){
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
                  S3784=1;
                  S3784=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 176, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                    S3784=1;
                    active[14]=1;
                    ends[14]=1;
                    break RUN;
                  }
                  else {
                    S3779=0;
                    if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                      fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 176, column: 7
                      S3779=1;
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 176, column: 7
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 176, column: 7
                        ends[14]=2;
                        ;//sysj\conveyor_controller.sysj line: 176, column: 7
                        S3866=2;
                        thread18601(tdone,ends);
                        thread18605(tdone,ends);
                        int biggest18615 = 0;
                        if(ends[15]>=biggest18615){
                          biggest18615=ends[15];
                        }
                        if(ends[20]>=biggest18615){
                          biggest18615=ends[20];
                        }
                        if(biggest18615 == 1){
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
              thread18616(tdone,ends);
              thread18644(tdone,ends);
              int biggest18660 = 0;
              if(ends[15]>=biggest18660){
                biggest18660=ends[15];
              }
              if(ends[20]>=biggest18660){
                biggest18660=ends[20];
              }
              if(biggest18660 == 1){
                active[14]=1;
                ends[14]=1;
                break RUN;
              }
              //FINXME code
              if(biggest18660 == 0){
                S10599=0;
                active[14]=0;
                ends[14]=0;
                S10599=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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

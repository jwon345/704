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
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public input_Channel convReady_in = new input_Channel();
  public input_Channel fillerReady_in = new input_Channel();
  public input_Channel capperReady_in = new input_Channel();
  public input_Channel checkFive_in = new input_Channel();
  public output_Channel rotated_o = new output_Channel();
  private Signal cvR_18;
  private Signal fR_18;
  private Signal cR_18;
  private Signal bottleAtPos5_18;
  private long __start_thread_24;//sysj\conveyor_controller.sysj line: 228, column: 44
  private int i_thread_19;//sysj\conveyor_controller.sysj line: 237, column: 10
  private int S15973 = 1;
  private int S3848 = 1;
  private int S3744 = 1;
  private int S3739 = 1;
  private int S3766 = 1;
  private int S3761 = 1;
  private int S3855 = 1;
  private int S3850 = 1;
  private int S5097 = 1;
  private int S3990 = 1;
  private int S3983 = 1;
  private int S3986 = 1;
  private int S3989 = 1;
  private int S4004 = 1;
  private int S4027 = 1;
  private int S4043 = 1;
  private int S4146 = 1;
  private int S4141 = 1;
  private int S5396 = 1;
  private int S5196 = 1;
  private int S5130 = 1;
  private int S5122 = 1;
  private int S5121 = 1;
  private int S5105 = 1;
  private int S5100 = 1;
  private int S5128 = 1;
  private int S5295 = 1;
  private int S5229 = 1;
  private int S5221 = 1;
  private int S5220 = 1;
  private int S5204 = 1;
  private int S5199 = 1;
  private int S5227 = 1;
  private int S5394 = 1;
  private int S5328 = 1;
  private int S5320 = 1;
  private int S5319 = 1;
  private int S5303 = 1;
  private int S5298 = 1;
  private int S5326 = 1;
  private int S5479 = 1;
  private int S5423 = 1;
  private int S5403 = 1;
  private int S5398 = 1;
  
  private int[] ends = new int[60];
  private int[] tdone = new int[60];
  
  public void thread29959(int [] tdone, int [] ends){
        switch(S5479){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        switch(S5423){
          case 0 : 
            switch(S5403){
              case 0 : 
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 262, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
                  S5403=1;
                  active[35]=1;
                  ends[35]=1;
                  tdone[35]=1;
                }
                else {
                  switch(S5398){
                    case 0 : 
                      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
                        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 262, column: 7
                        S5398=1;
                        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
                          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
                          ends[35]=2;
                          ;//sysj\conveyor_controller.sysj line: 262, column: 7
                          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 263, column: 10
                            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 8
                            currsigs.addElement(bottleAtPos5_18);
                            S5423=1;
                            active[35]=1;
                            ends[35]=1;
                            tdone[35]=1;
                          }
                          else {
                            S5423=1;
                            active[35]=1;
                            ends[35]=1;
                            tdone[35]=1;
                          }
                        }
                        else {
                          active[35]=1;
                          ends[35]=1;
                          tdone[35]=1;
                        }
                      }
                      else {
                        active[35]=1;
                        ends[35]=1;
                        tdone[35]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
                        checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
                        ends[35]=2;
                        ;//sysj\conveyor_controller.sysj line: 262, column: 7
                        if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 263, column: 10
                          bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 8
                          currsigs.addElement(bottleAtPos5_18);
                          S5423=1;
                          active[35]=1;
                          ends[35]=1;
                          tdone[35]=1;
                        }
                        else {
                          S5423=1;
                          active[35]=1;
                          ends[35]=1;
                          tdone[35]=1;
                        }
                      }
                      else {
                        active[35]=1;
                        ends[35]=1;
                        tdone[35]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S5403=1;
                S5403=0;
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 262, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
                  S5403=1;
                  active[35]=1;
                  ends[35]=1;
                  tdone[35]=1;
                }
                else {
                  S5398=0;
                  if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
                    checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 262, column: 7
                    S5398=1;
                    if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
                      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
                      ends[35]=2;
                      ;//sysj\conveyor_controller.sysj line: 262, column: 7
                      if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 263, column: 10
                        bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 8
                        currsigs.addElement(bottleAtPos5_18);
                        S5423=1;
                        active[35]=1;
                        ends[35]=1;
                        tdone[35]=1;
                      }
                      else {
                        S5423=1;
                        active[35]=1;
                        ends[35]=1;
                        tdone[35]=1;
                      }
                    }
                    else {
                      active[35]=1;
                      ends[35]=1;
                      tdone[35]=1;
                    }
                  }
                  else {
                    active[35]=1;
                    ends[35]=1;
                    tdone[35]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5423=1;
            S5423=0;
            S5403=0;
            if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 262, column: 7
              checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
              S5403=1;
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            else {
              S5398=0;
              if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
                checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 262, column: 7
                S5398=1;
                if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
                  ends[35]=2;
                  ;//sysj\conveyor_controller.sysj line: 262, column: 7
                  if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 263, column: 10
                    bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 8
                    currsigs.addElement(bottleAtPos5_18);
                    S5423=1;
                    active[35]=1;
                    ends[35]=1;
                    tdone[35]=1;
                  }
                  else {
                    S5423=1;
                    active[35]=1;
                    ends[35]=1;
                    tdone[35]=1;
                  }
                }
                else {
                  active[35]=1;
                  ends[35]=1;
                  tdone[35]=1;
                }
              }
              else {
                active[35]=1;
                ends[35]=1;
                tdone[35]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread29956(int [] tdone, int [] ends){
        S5326=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5326=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread29955(int [] tdone, int [] ends){
        S5320=1;
    S5319=0;
    S5303=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5303=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5298=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5298=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5319=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread29953(int [] tdone, int [] ends){
        switch(S5326){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
        currsigs.addElement(cR_18);
        active[34]=1;
        ends[34]=1;
        tdone[34]=1;
        break;
      
    }
  }

  public void thread29952(int [] tdone, int [] ends){
        switch(S5320){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        switch(S5319){
          case 0 : 
            switch(S5303){
              case 0 : 
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                  S5303=1;
                  active[33]=1;
                  ends[33]=1;
                  tdone[33]=1;
                }
                else {
                  switch(S5298){
                    case 0 : 
                      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
                        S5298=1;
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                          ends[33]=2;
                          ;//sysj\conveyor_controller.sysj line: 61, column: 5
                          S5319=1;
                          active[33]=1;
                          ends[33]=1;
                          tdone[33]=1;
                        }
                        else {
                          active[33]=1;
                          ends[33]=1;
                          tdone[33]=1;
                        }
                      }
                      else {
                        active[33]=1;
                        ends[33]=1;
                        tdone[33]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                        ends[33]=2;
                        ;//sysj\conveyor_controller.sysj line: 61, column: 5
                        S5319=1;
                        active[33]=1;
                        ends[33]=1;
                        tdone[33]=1;
                      }
                      else {
                        active[33]=1;
                        ends[33]=1;
                        tdone[33]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S5303=1;
                S5303=0;
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                  S5303=1;
                  active[33]=1;
                  ends[33]=1;
                  tdone[33]=1;
                }
                else {
                  S5298=0;
                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
                    S5298=1;
                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                      ends[33]=2;
                      ;//sysj\conveyor_controller.sysj line: 61, column: 5
                      S5319=1;
                      active[33]=1;
                      ends[33]=1;
                      tdone[33]=1;
                    }
                    else {
                      active[33]=1;
                      ends[33]=1;
                      tdone[33]=1;
                    }
                  }
                  else {
                    active[33]=1;
                    ends[33]=1;
                    tdone[33]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5319=1;
            S5319=2;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
            break;
          
          case 2 : 
            S5319=2;
            capperReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 61, column: 36
            ends[33]=2;
            tdone[33]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread29951(int [] tdone, int [] ends){
        switch(S5394){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        switch(S5328){
          case 0 : 
            thread29952(tdone,ends);
            thread29953(tdone,ends);
            int biggest29954 = 0;
            if(ends[33]>=biggest29954){
              biggest29954=ends[33];
            }
            if(ends[34]>=biggest29954){
              biggest29954=ends[34];
            }
            if(biggest29954 == 1){
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            if(biggest29954 == 2){
              ends[32]=2;
              ;//sysj\conveyor_controller.sysj line: 60, column: 3
              S5328=1;
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            //FINXME code
            if(biggest29954 == 0){
              S5328=1;
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
          case 1 : 
            S5328=1;
            S5328=0;
            thread29955(tdone,ends);
            thread29956(tdone,ends);
            int biggest29957 = 0;
            if(ends[33]>=biggest29957){
              biggest29957=ends[33];
            }
            if(ends[34]>=biggest29957){
              biggest29957=ends[34];
            }
            if(biggest29957 == 1){
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread29949(int [] tdone, int [] ends){
        S5227=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5227=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread29948(int [] tdone, int [] ends){
        S5221=1;
    S5220=0;
    S5204=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5204=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5199=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5199=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5220=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread29946(int [] tdone, int [] ends){
        switch(S5227){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
        currsigs.addElement(fR_18);
        active[31]=1;
        ends[31]=1;
        tdone[31]=1;
        break;
      
    }
  }

  public void thread29945(int [] tdone, int [] ends){
        switch(S5221){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S5220){
          case 0 : 
            switch(S5204){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                  S5204=1;
                  active[30]=1;
                  ends[30]=1;
                  tdone[30]=1;
                }
                else {
                  switch(S5199){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
                        S5199=1;
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                          ends[30]=2;
                          ;//sysj\conveyor_controller.sysj line: 61, column: 5
                          S5220=1;
                          active[30]=1;
                          ends[30]=1;
                          tdone[30]=1;
                        }
                        else {
                          active[30]=1;
                          ends[30]=1;
                          tdone[30]=1;
                        }
                      }
                      else {
                        active[30]=1;
                        ends[30]=1;
                        tdone[30]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                        ends[30]=2;
                        ;//sysj\conveyor_controller.sysj line: 61, column: 5
                        S5220=1;
                        active[30]=1;
                        ends[30]=1;
                        tdone[30]=1;
                      }
                      else {
                        active[30]=1;
                        ends[30]=1;
                        tdone[30]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S5204=1;
                S5204=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                  S5204=1;
                  active[30]=1;
                  ends[30]=1;
                  tdone[30]=1;
                }
                else {
                  S5199=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
                    S5199=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                      ends[30]=2;
                      ;//sysj\conveyor_controller.sysj line: 61, column: 5
                      S5220=1;
                      active[30]=1;
                      ends[30]=1;
                      tdone[30]=1;
                    }
                    else {
                      active[30]=1;
                      ends[30]=1;
                      tdone[30]=1;
                    }
                  }
                  else {
                    active[30]=1;
                    ends[30]=1;
                    tdone[30]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5220=1;
            S5220=2;
            active[30]=1;
            ends[30]=1;
            tdone[30]=1;
            break;
          
          case 2 : 
            S5220=2;
            fillerReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 61, column: 36
            ends[30]=2;
            tdone[30]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread29944(int [] tdone, int [] ends){
        switch(S5295){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S5229){
          case 0 : 
            thread29945(tdone,ends);
            thread29946(tdone,ends);
            int biggest29947 = 0;
            if(ends[30]>=biggest29947){
              biggest29947=ends[30];
            }
            if(ends[31]>=biggest29947){
              biggest29947=ends[31];
            }
            if(biggest29947 == 1){
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            if(biggest29947 == 2){
              ends[29]=2;
              ;//sysj\conveyor_controller.sysj line: 60, column: 3
              S5229=1;
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            //FINXME code
            if(biggest29947 == 0){
              S5229=1;
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            break;
          
          case 1 : 
            S5229=1;
            S5229=0;
            thread29948(tdone,ends);
            thread29949(tdone,ends);
            int biggest29950 = 0;
            if(ends[30]>=biggest29950){
              biggest29950=ends[30];
            }
            if(ends[31]>=biggest29950){
              biggest29950=ends[31];
            }
            if(biggest29950 == 1){
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread29942(int [] tdone, int [] ends){
        S5128=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5128=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread29941(int [] tdone, int [] ends){
        S5122=1;
    S5121=0;
    S5105=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5105=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5100=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5100=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5121=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread29939(int [] tdone, int [] ends){
        switch(S5128){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
        currsigs.addElement(cvR_18);
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
        break;
      
    }
  }

  public void thread29938(int [] tdone, int [] ends){
        switch(S5122){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S5121){
          case 0 : 
            switch(S5105){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                  S5105=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  switch(S5100){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
                        S5100=1;
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 61, column: 5
                          S5121=1;
                          active[27]=1;
                          ends[27]=1;
                          tdone[27]=1;
                        }
                        else {
                          active[27]=1;
                          ends[27]=1;
                          tdone[27]=1;
                        }
                      }
                      else {
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 61, column: 5
                        S5121=1;
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      else {
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S5105=1;
                S5105=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                  S5105=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  S5100=0;
                  if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                    convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
                    S5100=1;
                    if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
                      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 61, column: 5
                      S5121=1;
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                    else {
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                  }
                  else {
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5121=1;
            S5121=2;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
            break;
          
          case 2 : 
            S5121=2;
            convReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 61, column: 36
            ends[27]=2;
            tdone[27]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread29937(int [] tdone, int [] ends){
        switch(S5196){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S5130){
          case 0 : 
            thread29938(tdone,ends);
            thread29939(tdone,ends);
            int biggest29940 = 0;
            if(ends[27]>=biggest29940){
              biggest29940=ends[27];
            }
            if(ends[28]>=biggest29940){
              biggest29940=ends[28];
            }
            if(biggest29940 == 1){
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            if(biggest29940 == 2){
              ends[26]=2;
              ;//sysj\conveyor_controller.sysj line: 60, column: 3
              S5130=1;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            //FINXME code
            if(biggest29940 == 0){
              S5130=1;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
          case 1 : 
            S5130=1;
            S5130=0;
            thread29941(tdone,ends);
            thread29942(tdone,ends);
            int biggest29943 = 0;
            if(ends[27]>=biggest29943){
              biggest29943=ends[27];
            }
            if(ends[28]>=biggest29943){
              biggest29943=ends[28];
            }
            if(biggest29943 == 1){
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread29936(int [] tdone, int [] ends){
        switch(S5396){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        thread29937(tdone,ends);
        thread29944(tdone,ends);
        thread29951(tdone,ends);
        int biggest29958 = 0;
        if(ends[26]>=biggest29958){
          biggest29958=ends[26];
        }
        if(ends[29]>=biggest29958){
          biggest29958=ends[29];
        }
        if(ends[32]>=biggest29958){
          biggest29958=ends[32];
        }
        if(biggest29958 == 1){
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        //FINXME code
        if(biggest29958 == 0){
          S5396=0;
          active[25]=0;
          ends[25]=0;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread29934(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread29933(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread29932(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread29930(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread29929(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread29928(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread29926(int [] tdone, int [] ends){
        switch(S4043){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_24 >= 500){//sysj\conveyor_controller.sysj line: 228, column: 44
          ends[24]=3;
          ;//sysj\conveyor_controller.sysj line: 228, column: 44
          ends[24]=2;
          tdone[24]=1;
        }
        else {
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread29925(int [] tdone, int [] ends){
        switch(S4027){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 228, column: 14
        currsigs.addElement(rotaryTableTrigger);
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
        break;
      
    }
  }

  public void thread29923(int [] tdone, int [] ends){
        S4043=1;
    __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 228, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_24 >= 500){//sysj\conveyor_controller.sysj line: 228, column: 44
      ends[24]=3;
      ;//sysj\conveyor_controller.sysj line: 228, column: 44
      ends[24]=2;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread29922(int [] tdone, int [] ends){
        S4027=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 228, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread29920(int [] tdone, int [] ends){
        S4043=1;
    __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 228, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_24 >= 500){//sysj\conveyor_controller.sysj line: 228, column: 44
      ends[24]=3;
      ;//sysj\conveyor_controller.sysj line: 228, column: 44
      ends[24]=2;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread29919(int [] tdone, int [] ends){
        S4027=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 228, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread29917(int [] tdone, int [] ends){
        S4043=1;
    __start_thread_24 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 228, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_24 >= 500){//sysj\conveyor_controller.sysj line: 228, column: 44
      ends[24]=3;
      ;//sysj\conveyor_controller.sysj line: 228, column: 44
      ends[24]=2;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread29916(int [] tdone, int [] ends){
        S4027=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 228, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread29914(int [] tdone, int [] ends){
        switch(S3989){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        if(cR_18.getprestatus()){//sysj\conveyor_controller.sysj line: 205, column: 17
          System.out.println("*Rotary - Capper Ready*");//sysj\conveyor_controller.sysj line: 206, column: 11
          S3989=0;
          active[22]=0;
          ends[22]=0;
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

  public void thread29913(int [] tdone, int [] ends){
        switch(S3986){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(cvR_18.getprestatus()){//sysj\conveyor_controller.sysj line: 199, column: 17
          System.out.println("*Rotary - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 200, column: 11
          S3986=0;
          active[21]=0;
          ends[21]=0;
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

  public void thread29912(int [] tdone, int [] ends){
        switch(S3983){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(fR_18.getprestatus()){//sysj\conveyor_controller.sysj line: 194, column: 17
          System.out.println("*Rotary - Filler Ready*");//sysj\conveyor_controller.sysj line: 195, column: 11
          S3983=0;
          active[20]=0;
          ends[20]=0;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread29911(int [] tdone, int [] ends){
        switch(S5097){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S3990){
          case 0 : 
            thread29912(tdone,ends);
            thread29913(tdone,ends);
            thread29914(tdone,ends);
            int biggest29915 = 0;
            if(ends[20]>=biggest29915){
              biggest29915=ends[20];
            }
            if(ends[21]>=biggest29915){
              biggest29915=ends[21];
            }
            if(ends[22]>=biggest29915){
              biggest29915=ends[22];
            }
            if(biggest29915 == 1){
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            //FINXME code
            if(biggest29915 == 0){
              System.out.println("*Rotary - All controllers are ready*");//sysj\conveyor_controller.sysj line: 211, column: 10
              S3990=1;
              if(bottleAtPos5_18.getprestatus()){//sysj\conveyor_controller.sysj line: 214, column: 18
                S4004=0;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S3990=2;
                thread29916(tdone,ends);
                thread29917(tdone,ends);
                int biggest29918 = 0;
                if(ends[23]>=biggest29918){
                  biggest29918=ends[23];
                }
                if(ends[24]>=biggest29918){
                  biggest29918=ends[24];
                }
                if(biggest29918 == 1){
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                if(biggest29918 == 2){
                  ends[19]=2;
                  ;//sysj\conveyor_controller.sysj line: 227, column: 12
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 231, column: 16
                  S3990=3;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
              }
            }
            break;
          
          case 1 : 
            switch(S4004){
              case 0 : 
                if(!bottleAtPos5_18.getprestatus()){//sysj\conveyor_controller.sysj line: 216, column: 20
                  S4004=1;
                  if(bottleAtPos5_18.getprestatus()){//sysj\conveyor_controller.sysj line: 218, column: 23
                    System.out.println("*at pos5*");//sysj\conveyor_controller.sysj line: 219, column: 17
                    active[19]=1;
                    ends[19]=1;
                    tdone[19]=1;
                  }
                  else {
                    ends[19]=2;
                    ;//sysj\conveyor_controller.sysj line: 215, column: 13
                    S3990=2;
                    thread29919(tdone,ends);
                    thread29920(tdone,ends);
                    int biggest29921 = 0;
                    if(ends[23]>=biggest29921){
                      biggest29921=ends[23];
                    }
                    if(ends[24]>=biggest29921){
                      biggest29921=ends[24];
                    }
                    if(biggest29921 == 1){
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                    if(biggest29921 == 2){
                      ends[19]=2;
                      ;//sysj\conveyor_controller.sysj line: 227, column: 12
                      System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 231, column: 16
                      S3990=3;
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                  }
                }
                else {
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos5_18.getprestatus()){//sysj\conveyor_controller.sysj line: 218, column: 23
                  System.out.println("*at pos5*");//sysj\conveyor_controller.sysj line: 219, column: 17
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  ends[19]=2;
                  ;//sysj\conveyor_controller.sysj line: 215, column: 13
                  S3990=2;
                  thread29922(tdone,ends);
                  thread29923(tdone,ends);
                  int biggest29924 = 0;
                  if(ends[23]>=biggest29924){
                    biggest29924=ends[23];
                  }
                  if(ends[24]>=biggest29924){
                    biggest29924=ends[24];
                  }
                  if(biggest29924 == 1){
                    active[19]=1;
                    ends[19]=1;
                    tdone[19]=1;
                  }
                  if(biggest29924 == 2){
                    ends[19]=2;
                    ;//sysj\conveyor_controller.sysj line: 227, column: 12
                    System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 231, column: 16
                    S3990=3;
                    active[19]=1;
                    ends[19]=1;
                    tdone[19]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread29925(tdone,ends);
            thread29926(tdone,ends);
            int biggest29927 = 0;
            if(ends[23]>=biggest29927){
              biggest29927=ends[23];
            }
            if(ends[24]>=biggest29927){
              biggest29927=ends[24];
            }
            if(biggest29927 == 1){
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            if(biggest29927 == 2){
              ends[19]=2;
              ;//sysj\conveyor_controller.sysj line: 227, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 231, column: 16
              S3990=3;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            //FINXME code
            if(biggest29927 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 231, column: 16
              S3990=3;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_controller.sysj line: 232, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\conveyor_controller.sysj line: 234, column: 16
              S3990=4;
              S4146=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 235, column: 13
                rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 235, column: 13
                S4146=1;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S4141=0;
                if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 235, column: 13
                  rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 235, column: 13
                  S4141=1;
                  if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 235, column: 13
                    rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 235, column: 13
                    ends[19]=2;
                    ;//sysj\conveyor_controller.sysj line: 235, column: 13
                    S3990=5;
                    active[19]=1;
                    ends[19]=1;
                    tdone[19]=1;
                  }
                  else {
                    active[19]=1;
                    ends[19]=1;
                    tdone[19]=1;
                  }
                }
                else {
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
              }
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 4 : 
            switch(S4146){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 235, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 235, column: 13
                  S4146=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  switch(S4141){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 235, column: 13
                        rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 235, column: 13
                        S4141=1;
                        if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 235, column: 13
                          rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 235, column: 13
                          ends[19]=2;
                          ;//sysj\conveyor_controller.sysj line: 235, column: 13
                          S3990=5;
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                        else {
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 235, column: 13
                        rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 235, column: 13
                        ends[19]=2;
                        ;//sysj\conveyor_controller.sysj line: 235, column: 13
                        S3990=5;
                        active[19]=1;
                        ends[19]=1;
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
                break;
              
              case 1 : 
                S4146=1;
                S4146=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 235, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 235, column: 13
                  S4146=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S4141=0;
                  if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 235, column: 13
                    rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 235, column: 13
                    S4141=1;
                    if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 235, column: 13
                      rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 235, column: 13
                      ends[19]=2;
                      ;//sysj\conveyor_controller.sysj line: 235, column: 13
                      S3990=5;
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                    else {
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                  }
                  else {
                    active[19]=1;
                    ends[19]=1;
                    tdone[19]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 5 : 
            S3990=5;
            i_thread_19 = 0;//sysj\conveyor_controller.sysj line: 237, column: 10
            S3990=6;
            i_thread_19 = i_thread_19 + 1;//sysj\conveyor_controller.sysj line: 240, column: 12
            if(i_thread_19 > 12){//sysj\conveyor_controller.sysj line: 241, column: 15
              ends[19]=2;
              ;//sysj\conveyor_controller.sysj line: 238, column: 10
              S3990=0;
              thread29928(tdone,ends);
              thread29929(tdone,ends);
              thread29930(tdone,ends);
              int biggest29931 = 0;
              if(ends[20]>=biggest29931){
                biggest29931=ends[20];
              }
              if(ends[21]>=biggest29931){
                biggest29931=ends[21];
              }
              if(ends[22]>=biggest29931){
                biggest29931=ends[22];
              }
              if(biggest29931 == 1){
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
          case 6 : 
            i_thread_19 = i_thread_19 + 1;//sysj\conveyor_controller.sysj line: 240, column: 12
            if(i_thread_19 > 12){//sysj\conveyor_controller.sysj line: 241, column: 15
              ends[19]=2;
              ;//sysj\conveyor_controller.sysj line: 238, column: 10
              S3990=0;
              thread29932(tdone,ends);
              thread29933(tdone,ends);
              thread29934(tdone,ends);
              int biggest29935 = 0;
              if(ends[20]>=biggest29935){
                biggest29935=ends[20];
              }
              if(ends[21]>=biggest29935){
                biggest29935=ends[21];
              }
              if(ends[22]>=biggest29935){
                biggest29935=ends[22];
              }
              if(biggest29935 == 1){
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            else {
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread29909(int [] tdone, int [] ends){
        S5479=1;
    S5423=0;
    S5403=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 262, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
      S5403=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5398=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 262, column: 7
        S5398=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 262, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 263, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread29906(int [] tdone, int [] ends){
        S5326=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5326=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread29905(int [] tdone, int [] ends){
        S5320=1;
    S5319=0;
    S5303=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5303=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5298=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5298=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5319=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread29904(int [] tdone, int [] ends){
        S5394=1;
    S5328=0;
    thread29905(tdone,ends);
    thread29906(tdone,ends);
    int biggest29907 = 0;
    if(ends[33]>=biggest29907){
      biggest29907=ends[33];
    }
    if(ends[34]>=biggest29907){
      biggest29907=ends[34];
    }
    if(biggest29907 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread29902(int [] tdone, int [] ends){
        S5227=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5227=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread29901(int [] tdone, int [] ends){
        S5221=1;
    S5220=0;
    S5204=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5204=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5199=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5199=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5220=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread29900(int [] tdone, int [] ends){
        S5295=1;
    S5229=0;
    thread29901(tdone,ends);
    thread29902(tdone,ends);
    int biggest29903 = 0;
    if(ends[30]>=biggest29903){
      biggest29903=ends[30];
    }
    if(ends[31]>=biggest29903){
      biggest29903=ends[31];
    }
    if(biggest29903 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread29898(int [] tdone, int [] ends){
        S5128=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5128=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread29897(int [] tdone, int [] ends){
        S5122=1;
    S5121=0;
    S5105=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5105=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5100=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5100=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5121=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread29896(int [] tdone, int [] ends){
        S5196=1;
    S5130=0;
    thread29897(tdone,ends);
    thread29898(tdone,ends);
    int biggest29899 = 0;
    if(ends[27]>=biggest29899){
      biggest29899=ends[27];
    }
    if(ends[28]>=biggest29899){
      biggest29899=ends[28];
    }
    if(biggest29899 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread29895(int [] tdone, int [] ends){
        S5396=1;
    thread29896(tdone,ends);
    thread29900(tdone,ends);
    thread29904(tdone,ends);
    int biggest29908 = 0;
    if(ends[26]>=biggest29908){
      biggest29908=ends[26];
    }
    if(ends[29]>=biggest29908){
      biggest29908=ends[29];
    }
    if(ends[32]>=biggest29908){
      biggest29908=ends[32];
    }
    if(biggest29908 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29908 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29908 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread29893(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread29892(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread29891(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread29890(int [] tdone, int [] ends){
        S5097=1;
    S3990=0;
    thread29891(tdone,ends);
    thread29892(tdone,ends);
    thread29893(tdone,ends);
    int biggest29894 = 0;
    if(ends[20]>=biggest29894){
      biggest29894=ends[20];
    }
    if(ends[21]>=biggest29894){
      biggest29894=ends[21];
    }
    if(ends[22]>=biggest29894){
      biggest29894=ends[22];
    }
    if(biggest29894 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread29888(int [] tdone, int [] ends){
        S5479=1;
    S5423=0;
    S5403=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 262, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
      S5403=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5398=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 262, column: 7
        S5398=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 262, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 263, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread29885(int [] tdone, int [] ends){
        S5326=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5326=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread29884(int [] tdone, int [] ends){
        S5320=1;
    S5319=0;
    S5303=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5303=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5298=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5298=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5319=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread29883(int [] tdone, int [] ends){
        S5394=1;
    S5328=0;
    thread29884(tdone,ends);
    thread29885(tdone,ends);
    int biggest29886 = 0;
    if(ends[33]>=biggest29886){
      biggest29886=ends[33];
    }
    if(ends[34]>=biggest29886){
      biggest29886=ends[34];
    }
    if(biggest29886 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread29881(int [] tdone, int [] ends){
        S5227=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5227=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread29880(int [] tdone, int [] ends){
        S5221=1;
    S5220=0;
    S5204=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5204=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5199=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5199=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5220=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread29879(int [] tdone, int [] ends){
        S5295=1;
    S5229=0;
    thread29880(tdone,ends);
    thread29881(tdone,ends);
    int biggest29882 = 0;
    if(ends[30]>=biggest29882){
      biggest29882=ends[30];
    }
    if(ends[31]>=biggest29882){
      biggest29882=ends[31];
    }
    if(biggest29882 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread29877(int [] tdone, int [] ends){
        S5128=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5128=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread29876(int [] tdone, int [] ends){
        S5122=1;
    S5121=0;
    S5105=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5105=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5100=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5100=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5121=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread29875(int [] tdone, int [] ends){
        S5196=1;
    S5130=0;
    thread29876(tdone,ends);
    thread29877(tdone,ends);
    int biggest29878 = 0;
    if(ends[27]>=biggest29878){
      biggest29878=ends[27];
    }
    if(ends[28]>=biggest29878){
      biggest29878=ends[28];
    }
    if(biggest29878 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread29874(int [] tdone, int [] ends){
        S5396=1;
    thread29875(tdone,ends);
    thread29879(tdone,ends);
    thread29883(tdone,ends);
    int biggest29887 = 0;
    if(ends[26]>=biggest29887){
      biggest29887=ends[26];
    }
    if(ends[29]>=biggest29887){
      biggest29887=ends[29];
    }
    if(ends[32]>=biggest29887){
      biggest29887=ends[32];
    }
    if(biggest29887 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29887 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29887 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread29872(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread29871(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread29870(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread29869(int [] tdone, int [] ends){
        S5097=1;
    S3990=0;
    thread29870(tdone,ends);
    thread29871(tdone,ends);
    thread29872(tdone,ends);
    int biggest29873 = 0;
    if(ends[20]>=biggest29873){
      biggest29873=ends[20];
    }
    if(ends[21]>=biggest29873){
      biggest29873=ends[21];
    }
    if(ends[22]>=biggest29873){
      biggest29873=ends[22];
    }
    if(biggest29873 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread29867(int [] tdone, int [] ends){
        S5479=1;
    S5423=0;
    S5403=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 262, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
      S5403=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5398=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 262, column: 7
        S5398=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 262, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 263, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread29864(int [] tdone, int [] ends){
        S5326=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5326=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread29863(int [] tdone, int [] ends){
        S5320=1;
    S5319=0;
    S5303=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5303=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5298=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5298=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5319=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread29862(int [] tdone, int [] ends){
        S5394=1;
    S5328=0;
    thread29863(tdone,ends);
    thread29864(tdone,ends);
    int biggest29865 = 0;
    if(ends[33]>=biggest29865){
      biggest29865=ends[33];
    }
    if(ends[34]>=biggest29865){
      biggest29865=ends[34];
    }
    if(biggest29865 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread29860(int [] tdone, int [] ends){
        S5227=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5227=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread29859(int [] tdone, int [] ends){
        S5221=1;
    S5220=0;
    S5204=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5204=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5199=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5199=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5220=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread29858(int [] tdone, int [] ends){
        S5295=1;
    S5229=0;
    thread29859(tdone,ends);
    thread29860(tdone,ends);
    int biggest29861 = 0;
    if(ends[30]>=biggest29861){
      biggest29861=ends[30];
    }
    if(ends[31]>=biggest29861){
      biggest29861=ends[31];
    }
    if(biggest29861 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread29856(int [] tdone, int [] ends){
        S5128=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5128=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread29855(int [] tdone, int [] ends){
        S5122=1;
    S5121=0;
    S5105=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5105=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5100=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5100=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5121=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread29854(int [] tdone, int [] ends){
        S5196=1;
    S5130=0;
    thread29855(tdone,ends);
    thread29856(tdone,ends);
    int biggest29857 = 0;
    if(ends[27]>=biggest29857){
      biggest29857=ends[27];
    }
    if(ends[28]>=biggest29857){
      biggest29857=ends[28];
    }
    if(biggest29857 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread29853(int [] tdone, int [] ends){
        S5396=1;
    thread29854(tdone,ends);
    thread29858(tdone,ends);
    thread29862(tdone,ends);
    int biggest29866 = 0;
    if(ends[26]>=biggest29866){
      biggest29866=ends[26];
    }
    if(ends[29]>=biggest29866){
      biggest29866=ends[29];
    }
    if(ends[32]>=biggest29866){
      biggest29866=ends[32];
    }
    if(biggest29866 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29866 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29866 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread29851(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread29850(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread29849(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread29848(int [] tdone, int [] ends){
        S5097=1;
    S3990=0;
    thread29849(tdone,ends);
    thread29850(tdone,ends);
    thread29851(tdone,ends);
    int biggest29852 = 0;
    if(ends[20]>=biggest29852){
      biggest29852=ends[20];
    }
    if(ends[21]>=biggest29852){
      biggest29852=ends[21];
    }
    if(ends[22]>=biggest29852){
      biggest29852=ends[22];
    }
    if(biggest29852 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread29846(int [] tdone, int [] ends){
        S5479=1;
    S5423=0;
    S5403=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 262, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
      S5403=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5398=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 262, column: 7
        S5398=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 262, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 263, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread29843(int [] tdone, int [] ends){
        S5326=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5326=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread29842(int [] tdone, int [] ends){
        S5320=1;
    S5319=0;
    S5303=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5303=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5298=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5298=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5319=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread29841(int [] tdone, int [] ends){
        S5394=1;
    S5328=0;
    thread29842(tdone,ends);
    thread29843(tdone,ends);
    int biggest29844 = 0;
    if(ends[33]>=biggest29844){
      biggest29844=ends[33];
    }
    if(ends[34]>=biggest29844){
      biggest29844=ends[34];
    }
    if(biggest29844 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread29839(int [] tdone, int [] ends){
        S5227=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5227=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread29838(int [] tdone, int [] ends){
        S5221=1;
    S5220=0;
    S5204=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5204=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5199=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5199=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5220=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread29837(int [] tdone, int [] ends){
        S5295=1;
    S5229=0;
    thread29838(tdone,ends);
    thread29839(tdone,ends);
    int biggest29840 = 0;
    if(ends[30]>=biggest29840){
      biggest29840=ends[30];
    }
    if(ends[31]>=biggest29840){
      biggest29840=ends[31];
    }
    if(biggest29840 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread29835(int [] tdone, int [] ends){
        S5128=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5128=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread29834(int [] tdone, int [] ends){
        S5122=1;
    S5121=0;
    S5105=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5105=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5100=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5100=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5121=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread29833(int [] tdone, int [] ends){
        S5196=1;
    S5130=0;
    thread29834(tdone,ends);
    thread29835(tdone,ends);
    int biggest29836 = 0;
    if(ends[27]>=biggest29836){
      biggest29836=ends[27];
    }
    if(ends[28]>=biggest29836){
      biggest29836=ends[28];
    }
    if(biggest29836 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread29832(int [] tdone, int [] ends){
        S5396=1;
    thread29833(tdone,ends);
    thread29837(tdone,ends);
    thread29841(tdone,ends);
    int biggest29845 = 0;
    if(ends[26]>=biggest29845){
      biggest29845=ends[26];
    }
    if(ends[29]>=biggest29845){
      biggest29845=ends[29];
    }
    if(ends[32]>=biggest29845){
      biggest29845=ends[32];
    }
    if(biggest29845 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29845 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29845 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread29830(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread29829(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread29828(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread29827(int [] tdone, int [] ends){
        S5097=1;
    S3990=0;
    thread29828(tdone,ends);
    thread29829(tdone,ends);
    thread29830(tdone,ends);
    int biggest29831 = 0;
    if(ends[20]>=biggest29831){
      biggest29831=ends[20];
    }
    if(ends[21]>=biggest29831){
      biggest29831=ends[21];
    }
    if(ends[22]>=biggest29831){
      biggest29831=ends[22];
    }
    if(biggest29831 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread29825(int [] tdone, int [] ends){
        S5479=1;
    S5423=0;
    S5403=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 262, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
      S5403=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5398=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 262, column: 7
        S5398=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 262, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 263, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread29822(int [] tdone, int [] ends){
        S5326=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5326=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread29821(int [] tdone, int [] ends){
        S5320=1;
    S5319=0;
    S5303=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5303=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5298=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5298=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5319=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread29820(int [] tdone, int [] ends){
        S5394=1;
    S5328=0;
    thread29821(tdone,ends);
    thread29822(tdone,ends);
    int biggest29823 = 0;
    if(ends[33]>=biggest29823){
      biggest29823=ends[33];
    }
    if(ends[34]>=biggest29823){
      biggest29823=ends[34];
    }
    if(biggest29823 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread29818(int [] tdone, int [] ends){
        S5227=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5227=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread29817(int [] tdone, int [] ends){
        S5221=1;
    S5220=0;
    S5204=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5204=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5199=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5199=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5220=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread29816(int [] tdone, int [] ends){
        S5295=1;
    S5229=0;
    thread29817(tdone,ends);
    thread29818(tdone,ends);
    int biggest29819 = 0;
    if(ends[30]>=biggest29819){
      biggest29819=ends[30];
    }
    if(ends[31]>=biggest29819){
      biggest29819=ends[31];
    }
    if(biggest29819 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread29814(int [] tdone, int [] ends){
        S5128=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5128=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread29813(int [] tdone, int [] ends){
        S5122=1;
    S5121=0;
    S5105=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5105=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5100=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5100=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5121=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread29812(int [] tdone, int [] ends){
        S5196=1;
    S5130=0;
    thread29813(tdone,ends);
    thread29814(tdone,ends);
    int biggest29815 = 0;
    if(ends[27]>=biggest29815){
      biggest29815=ends[27];
    }
    if(ends[28]>=biggest29815){
      biggest29815=ends[28];
    }
    if(biggest29815 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread29811(int [] tdone, int [] ends){
        S5396=1;
    thread29812(tdone,ends);
    thread29816(tdone,ends);
    thread29820(tdone,ends);
    int biggest29824 = 0;
    if(ends[26]>=biggest29824){
      biggest29824=ends[26];
    }
    if(ends[29]>=biggest29824){
      biggest29824=ends[29];
    }
    if(ends[32]>=biggest29824){
      biggest29824=ends[32];
    }
    if(biggest29824 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29824 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29824 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread29809(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread29808(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread29807(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread29806(int [] tdone, int [] ends){
        S5097=1;
    S3990=0;
    thread29807(tdone,ends);
    thread29808(tdone,ends);
    thread29809(tdone,ends);
    int biggest29810 = 0;
    if(ends[20]>=biggest29810){
      biggest29810=ends[20];
    }
    if(ends[21]>=biggest29810){
      biggest29810=ends[21];
    }
    if(ends[22]>=biggest29810){
      biggest29810=ends[22];
    }
    if(biggest29810 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread29804(int [] tdone, int [] ends){
        S5479=1;
    S5423=0;
    S5403=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 262, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
      S5403=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5398=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 262, column: 7
        S5398=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 262, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 263, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread29801(int [] tdone, int [] ends){
        S5326=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5326=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread29800(int [] tdone, int [] ends){
        S5320=1;
    S5319=0;
    S5303=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5303=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5298=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5298=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5319=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread29799(int [] tdone, int [] ends){
        S5394=1;
    S5328=0;
    thread29800(tdone,ends);
    thread29801(tdone,ends);
    int biggest29802 = 0;
    if(ends[33]>=biggest29802){
      biggest29802=ends[33];
    }
    if(ends[34]>=biggest29802){
      biggest29802=ends[34];
    }
    if(biggest29802 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread29797(int [] tdone, int [] ends){
        S5227=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5227=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread29796(int [] tdone, int [] ends){
        S5221=1;
    S5220=0;
    S5204=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5204=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5199=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5199=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5220=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread29795(int [] tdone, int [] ends){
        S5295=1;
    S5229=0;
    thread29796(tdone,ends);
    thread29797(tdone,ends);
    int biggest29798 = 0;
    if(ends[30]>=biggest29798){
      biggest29798=ends[30];
    }
    if(ends[31]>=biggest29798){
      biggest29798=ends[31];
    }
    if(biggest29798 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread29793(int [] tdone, int [] ends){
        S5128=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5128=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread29792(int [] tdone, int [] ends){
        S5122=1;
    S5121=0;
    S5105=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5105=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5100=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5100=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5121=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread29791(int [] tdone, int [] ends){
        S5196=1;
    S5130=0;
    thread29792(tdone,ends);
    thread29793(tdone,ends);
    int biggest29794 = 0;
    if(ends[27]>=biggest29794){
      biggest29794=ends[27];
    }
    if(ends[28]>=biggest29794){
      biggest29794=ends[28];
    }
    if(biggest29794 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread29790(int [] tdone, int [] ends){
        S5396=1;
    thread29791(tdone,ends);
    thread29795(tdone,ends);
    thread29799(tdone,ends);
    int biggest29803 = 0;
    if(ends[26]>=biggest29803){
      biggest29803=ends[26];
    }
    if(ends[29]>=biggest29803){
      biggest29803=ends[29];
    }
    if(ends[32]>=biggest29803){
      biggest29803=ends[32];
    }
    if(biggest29803 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29803 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29803 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread29788(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread29787(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread29786(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread29785(int [] tdone, int [] ends){
        S5097=1;
    S3990=0;
    thread29786(tdone,ends);
    thread29787(tdone,ends);
    thread29788(tdone,ends);
    int biggest29789 = 0;
    if(ends[20]>=biggest29789){
      biggest29789=ends[20];
    }
    if(ends[21]>=biggest29789){
      biggest29789=ends[21];
    }
    if(ends[22]>=biggest29789){
      biggest29789=ends[22];
    }
    if(biggest29789 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread29783(int [] tdone, int [] ends){
        S5479=1;
    S5423=0;
    S5403=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 262, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
      S5403=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5398=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 262, column: 7
        S5398=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 262, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 263, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread29780(int [] tdone, int [] ends){
        S5326=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5326=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread29779(int [] tdone, int [] ends){
        S5320=1;
    S5319=0;
    S5303=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5303=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5298=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5298=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5319=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread29778(int [] tdone, int [] ends){
        S5394=1;
    S5328=0;
    thread29779(tdone,ends);
    thread29780(tdone,ends);
    int biggest29781 = 0;
    if(ends[33]>=biggest29781){
      biggest29781=ends[33];
    }
    if(ends[34]>=biggest29781){
      biggest29781=ends[34];
    }
    if(biggest29781 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread29776(int [] tdone, int [] ends){
        S5227=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5227=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread29775(int [] tdone, int [] ends){
        S5221=1;
    S5220=0;
    S5204=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5204=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5199=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5199=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5220=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread29774(int [] tdone, int [] ends){
        S5295=1;
    S5229=0;
    thread29775(tdone,ends);
    thread29776(tdone,ends);
    int biggest29777 = 0;
    if(ends[30]>=biggest29777){
      biggest29777=ends[30];
    }
    if(ends[31]>=biggest29777){
      biggest29777=ends[31];
    }
    if(biggest29777 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread29772(int [] tdone, int [] ends){
        S5128=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5128=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread29771(int [] tdone, int [] ends){
        S5122=1;
    S5121=0;
    S5105=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5105=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5100=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5100=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5121=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread29770(int [] tdone, int [] ends){
        S5196=1;
    S5130=0;
    thread29771(tdone,ends);
    thread29772(tdone,ends);
    int biggest29773 = 0;
    if(ends[27]>=biggest29773){
      biggest29773=ends[27];
    }
    if(ends[28]>=biggest29773){
      biggest29773=ends[28];
    }
    if(biggest29773 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread29769(int [] tdone, int [] ends){
        S5396=1;
    thread29770(tdone,ends);
    thread29774(tdone,ends);
    thread29778(tdone,ends);
    int biggest29782 = 0;
    if(ends[26]>=biggest29782){
      biggest29782=ends[26];
    }
    if(ends[29]>=biggest29782){
      biggest29782=ends[29];
    }
    if(ends[32]>=biggest29782){
      biggest29782=ends[32];
    }
    if(biggest29782 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29782 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29782 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread29767(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread29766(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread29765(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread29764(int [] tdone, int [] ends){
        S5097=1;
    S3990=0;
    thread29765(tdone,ends);
    thread29766(tdone,ends);
    thread29767(tdone,ends);
    int biggest29768 = 0;
    if(ends[20]>=biggest29768){
      biggest29768=ends[20];
    }
    if(ends[21]>=biggest29768){
      biggest29768=ends[21];
    }
    if(ends[22]>=biggest29768){
      biggest29768=ends[22];
    }
    if(biggest29768 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread29762(int [] tdone, int [] ends){
        S5479=1;
    S5423=0;
    S5403=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 262, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
      S5403=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5398=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 262, column: 7
        S5398=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 262, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 263, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread29759(int [] tdone, int [] ends){
        S5326=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5326=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread29758(int [] tdone, int [] ends){
        S5320=1;
    S5319=0;
    S5303=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5303=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5298=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5298=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5319=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread29757(int [] tdone, int [] ends){
        S5394=1;
    S5328=0;
    thread29758(tdone,ends);
    thread29759(tdone,ends);
    int biggest29760 = 0;
    if(ends[33]>=biggest29760){
      biggest29760=ends[33];
    }
    if(ends[34]>=biggest29760){
      biggest29760=ends[34];
    }
    if(biggest29760 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread29755(int [] tdone, int [] ends){
        S5227=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5227=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread29754(int [] tdone, int [] ends){
        S5221=1;
    S5220=0;
    S5204=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5204=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5199=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5199=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5220=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread29753(int [] tdone, int [] ends){
        S5295=1;
    S5229=0;
    thread29754(tdone,ends);
    thread29755(tdone,ends);
    int biggest29756 = 0;
    if(ends[30]>=biggest29756){
      biggest29756=ends[30];
    }
    if(ends[31]>=biggest29756){
      biggest29756=ends[31];
    }
    if(biggest29756 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread29751(int [] tdone, int [] ends){
        S5128=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5128=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread29750(int [] tdone, int [] ends){
        S5122=1;
    S5121=0;
    S5105=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5105=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5100=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5100=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5121=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread29749(int [] tdone, int [] ends){
        S5196=1;
    S5130=0;
    thread29750(tdone,ends);
    thread29751(tdone,ends);
    int biggest29752 = 0;
    if(ends[27]>=biggest29752){
      biggest29752=ends[27];
    }
    if(ends[28]>=biggest29752){
      biggest29752=ends[28];
    }
    if(biggest29752 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread29748(int [] tdone, int [] ends){
        S5396=1;
    thread29749(tdone,ends);
    thread29753(tdone,ends);
    thread29757(tdone,ends);
    int biggest29761 = 0;
    if(ends[26]>=biggest29761){
      biggest29761=ends[26];
    }
    if(ends[29]>=biggest29761){
      biggest29761=ends[29];
    }
    if(ends[32]>=biggest29761){
      biggest29761=ends[32];
    }
    if(biggest29761 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29761 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29761 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread29746(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread29745(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread29744(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread29743(int [] tdone, int [] ends){
        S5097=1;
    S3990=0;
    thread29744(tdone,ends);
    thread29745(tdone,ends);
    thread29746(tdone,ends);
    int biggest29747 = 0;
    if(ends[20]>=biggest29747){
      biggest29747=ends[20];
    }
    if(ends[21]>=biggest29747){
      biggest29747=ends[21];
    }
    if(ends[22]>=biggest29747){
      biggest29747=ends[22];
    }
    if(biggest29747 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread29741(int [] tdone, int [] ends){
        S5479=1;
    S5423=0;
    S5403=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 262, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
      S5403=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5398=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 262, column: 7
        S5398=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 262, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 263, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread29738(int [] tdone, int [] ends){
        S5326=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5326=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread29737(int [] tdone, int [] ends){
        S5320=1;
    S5319=0;
    S5303=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5303=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5298=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5298=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5319=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread29736(int [] tdone, int [] ends){
        S5394=1;
    S5328=0;
    thread29737(tdone,ends);
    thread29738(tdone,ends);
    int biggest29739 = 0;
    if(ends[33]>=biggest29739){
      biggest29739=ends[33];
    }
    if(ends[34]>=biggest29739){
      biggest29739=ends[34];
    }
    if(biggest29739 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread29734(int [] tdone, int [] ends){
        S5227=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5227=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread29733(int [] tdone, int [] ends){
        S5221=1;
    S5220=0;
    S5204=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5204=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5199=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5199=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5220=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread29732(int [] tdone, int [] ends){
        S5295=1;
    S5229=0;
    thread29733(tdone,ends);
    thread29734(tdone,ends);
    int biggest29735 = 0;
    if(ends[30]>=biggest29735){
      biggest29735=ends[30];
    }
    if(ends[31]>=biggest29735){
      biggest29735=ends[31];
    }
    if(biggest29735 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread29730(int [] tdone, int [] ends){
        S5128=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5128=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread29729(int [] tdone, int [] ends){
        S5122=1;
    S5121=0;
    S5105=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5105=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5100=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5100=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5121=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread29728(int [] tdone, int [] ends){
        S5196=1;
    S5130=0;
    thread29729(tdone,ends);
    thread29730(tdone,ends);
    int biggest29731 = 0;
    if(ends[27]>=biggest29731){
      biggest29731=ends[27];
    }
    if(ends[28]>=biggest29731){
      biggest29731=ends[28];
    }
    if(biggest29731 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread29727(int [] tdone, int [] ends){
        S5396=1;
    thread29728(tdone,ends);
    thread29732(tdone,ends);
    thread29736(tdone,ends);
    int biggest29740 = 0;
    if(ends[26]>=biggest29740){
      biggest29740=ends[26];
    }
    if(ends[29]>=biggest29740){
      biggest29740=ends[29];
    }
    if(ends[32]>=biggest29740){
      biggest29740=ends[32];
    }
    if(biggest29740 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29740 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29740 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread29725(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread29724(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread29723(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread29722(int [] tdone, int [] ends){
        S5097=1;
    S3990=0;
    thread29723(tdone,ends);
    thread29724(tdone,ends);
    thread29725(tdone,ends);
    int biggest29726 = 0;
    if(ends[20]>=biggest29726){
      biggest29726=ends[20];
    }
    if(ends[21]>=biggest29726){
      biggest29726=ends[21];
    }
    if(ends[22]>=biggest29726){
      biggest29726=ends[22];
    }
    if(biggest29726 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread29720(int [] tdone, int [] ends){
        S5479=1;
    S5423=0;
    S5403=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 262, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
      S5403=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S5398=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 262, column: 7
        S5398=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 262, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 262, column: 7
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 262, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 263, column: 10
            bottleAtPos5_18.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 8
            currsigs.addElement(bottleAtPos5_18);
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
          else {
            S5423=1;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
          }
        }
        else {
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
      }
      else {
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
      }
    }
  }

  public void thread29717(int [] tdone, int [] ends){
        S5326=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cR_18);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S5326=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread29716(int [] tdone, int [] ends){
        S5320=1;
    S5319=0;
    S5303=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5303=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S5298=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5298=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5319=1;
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
      }
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread29715(int [] tdone, int [] ends){
        S5394=1;
    S5328=0;
    thread29716(tdone,ends);
    thread29717(tdone,ends);
    int biggest29718 = 0;
    if(ends[33]>=biggest29718){
      biggest29718=ends[33];
    }
    if(ends[34]>=biggest29718){
      biggest29718=ends[34];
    }
    if(biggest29718 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread29713(int [] tdone, int [] ends){
        S5227=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      fR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(fR_18);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S5227=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread29712(int [] tdone, int [] ends){
        S5221=1;
    S5220=0;
    S5204=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5204=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S5199=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5199=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5220=1;
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
      }
      else {
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
      }
    }
  }

  public void thread29711(int [] tdone, int [] ends){
        S5295=1;
    S5229=0;
    thread29712(tdone,ends);
    thread29713(tdone,ends);
    int biggest29714 = 0;
    if(ends[30]>=biggest29714){
      biggest29714=ends[30];
    }
    if(ends[31]>=biggest29714){
      biggest29714=ends[31];
    }
    if(biggest29714 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread29709(int [] tdone, int [] ends){
        S5128=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 63, column: 9
      cvR_18.setPresent();//sysj\conveyor_controller.sysj line: 63, column: 20
      currsigs.addElement(cvR_18);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      S5128=0;
      active[28]=0;
      ends[28]=0;
      tdone[28]=1;
    }
  }

  public void thread29708(int [] tdone, int [] ends){
        S5122=1;
    S5121=0;
    S5105=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 61, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
      S5105=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S5100=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 61, column: 5
        S5100=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 61, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 61, column: 5
          ends[27]=2;
          ;//sysj\conveyor_controller.sysj line: 61, column: 5
          S5121=1;
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread29707(int [] tdone, int [] ends){
        S5196=1;
    S5130=0;
    thread29708(tdone,ends);
    thread29709(tdone,ends);
    int biggest29710 = 0;
    if(ends[27]>=biggest29710){
      biggest29710=ends[27];
    }
    if(ends[28]>=biggest29710){
      biggest29710=ends[28];
    }
    if(biggest29710 == 1){
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread29706(int [] tdone, int [] ends){
        S5396=1;
    thread29707(tdone,ends);
    thread29711(tdone,ends);
    thread29715(tdone,ends);
    int biggest29719 = 0;
    if(ends[26]>=biggest29719){
      biggest29719=ends[26];
    }
    if(ends[29]>=biggest29719){
      biggest29719=ends[29];
    }
    if(ends[32]>=biggest29719){
      biggest29719=ends[32];
    }
    if(biggest29719 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29719 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    if(biggest29719 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread29704(int [] tdone, int [] ends){
        S3989=1;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread29703(int [] tdone, int [] ends){
        S3986=1;
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread29702(int [] tdone, int [] ends){
        S3983=1;
    active[20]=1;
    ends[20]=1;
    tdone[20]=1;
  }

  public void thread29701(int [] tdone, int [] ends){
        S5097=1;
    S3990=0;
    thread29702(tdone,ends);
    thread29703(tdone,ends);
    thread29704(tdone,ends);
    int biggest29705 = 0;
    if(ends[20]>=biggest29705){
      biggest29705=ends[20];
    }
    if(ends[21]>=biggest29705){
      biggest29705=ends[21];
    }
    if(ends[22]>=biggest29705){
      biggest29705=ends[22];
    }
    if(biggest29705 == 1){
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S15973){
        case 0 : 
          S15973=0;
          break RUN;
        
        case 1 : 
          S15973=2;
          S15973=2;
          cvR_18.setClear();//sysj\conveyor_controller.sysj line: 185, column: 7
          fR_18.setClear();//sysj\conveyor_controller.sysj line: 185, column: 7
          cR_18.setClear();//sysj\conveyor_controller.sysj line: 185, column: 7
          bottleAtPos5_18.setClear();//sysj\conveyor_controller.sysj line: 186, column: 7
          S3848=0;
          S3744=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 187, column: 7
            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 187, column: 7
            S3744=1;
            active[18]=1;
            ends[18]=1;
            break RUN;
          }
          else {
            S3739=0;
            if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 187, column: 7
              convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 187, column: 7
              S3739=1;
              if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 187, column: 7
                convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 187, column: 7
                ends[18]=2;
                ;//sysj\conveyor_controller.sysj line: 187, column: 7
                S3848=1;
                S3766=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 188, column: 7
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                  S3766=1;
                  active[18]=1;
                  ends[18]=1;
                  break RUN;
                }
                else {
                  S3761=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 188, column: 7
                    S3761=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                      ends[18]=2;
                      ;//sysj\conveyor_controller.sysj line: 188, column: 7
                      S3848=2;
                      S3855=0;
                      if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                        S3855=1;
                        active[18]=1;
                        ends[18]=1;
                        break RUN;
                      }
                      else {
                        S3850=0;
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                          S3850=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                            ends[18]=2;
                            ;//sysj\conveyor_controller.sysj line: 189, column: 7
                            S3848=3;
                            thread29701(tdone,ends);
                            thread29706(tdone,ends);
                            thread29720(tdone,ends);
                            int biggest29721 = 0;
                            if(ends[19]>=biggest29721){
                              biggest29721=ends[19];
                            }
                            if(ends[25]>=biggest29721){
                              biggest29721=ends[25];
                            }
                            if(ends[35]>=biggest29721){
                              biggest29721=ends[35];
                            }
                            if(biggest29721 == 1){
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      active[18]=1;
                      ends[18]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[18]=1;
                    ends[18]=1;
                    break RUN;
                  }
                }
              }
              else {
                active[18]=1;
                ends[18]=1;
                break RUN;
              }
            }
            else {
              active[18]=1;
              ends[18]=1;
              break RUN;
            }
          }
        
        case 2 : 
          cvR_18.setClear();//sysj\conveyor_controller.sysj line: 185, column: 7
          fR_18.setClear();//sysj\conveyor_controller.sysj line: 185, column: 7
          cR_18.setClear();//sysj\conveyor_controller.sysj line: 185, column: 7
          bottleAtPos5_18.setClear();//sysj\conveyor_controller.sysj line: 186, column: 7
          switch(S3848){
            case 0 : 
              switch(S3744){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 187, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 187, column: 7
                    S3744=1;
                    active[18]=1;
                    ends[18]=1;
                    break RUN;
                  }
                  else {
                    switch(S3739){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 187, column: 7
                          convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 187, column: 7
                          S3739=1;
                          if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 187, column: 7
                            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 187, column: 7
                            ends[18]=2;
                            ;//sysj\conveyor_controller.sysj line: 187, column: 7
                            S3848=1;
                            S3766=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 188, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                              S3766=1;
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                            else {
                              S3761=0;
                              if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                                fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 188, column: 7
                                S3761=1;
                                if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                                  ends[18]=2;
                                  ;//sysj\conveyor_controller.sysj line: 188, column: 7
                                  S3848=2;
                                  S3855=0;
                                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                    S3855=1;
                                    active[18]=1;
                                    ends[18]=1;
                                    break RUN;
                                  }
                                  else {
                                    S3850=0;
                                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                                      S3850=1;
                                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                        ends[18]=2;
                                        ;//sysj\conveyor_controller.sysj line: 189, column: 7
                                        S3848=3;
                                        thread29722(tdone,ends);
                                        thread29727(tdone,ends);
                                        thread29741(tdone,ends);
                                        int biggest29742 = 0;
                                        if(ends[19]>=biggest29742){
                                          biggest29742=ends[19];
                                        }
                                        if(ends[25]>=biggest29742){
                                          biggest29742=ends[25];
                                        }
                                        if(ends[35]>=biggest29742){
                                          biggest29742=ends[35];
                                        }
                                        if(biggest29742 == 1){
                                          active[18]=1;
                                          ends[18]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[18]=1;
                                        ends[18]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[18]=1;
                                      ends[18]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[18]=1;
                                  ends[18]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[18]=1;
                                ends[18]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 187, column: 7
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 187, column: 7
                          ends[18]=2;
                          ;//sysj\conveyor_controller.sysj line: 187, column: 7
                          S3848=1;
                          S3766=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 188, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                            S3766=1;
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                          else {
                            S3761=0;
                            if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                              fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 188, column: 7
                              S3761=1;
                              if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                                fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                                ends[18]=2;
                                ;//sysj\conveyor_controller.sysj line: 188, column: 7
                                S3848=2;
                                S3855=0;
                                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                  S3855=1;
                                  active[18]=1;
                                  ends[18]=1;
                                  break RUN;
                                }
                                else {
                                  S3850=0;
                                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                                    S3850=1;
                                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                      ends[18]=2;
                                      ;//sysj\conveyor_controller.sysj line: 189, column: 7
                                      S3848=3;
                                      thread29743(tdone,ends);
                                      thread29748(tdone,ends);
                                      thread29762(tdone,ends);
                                      int biggest29763 = 0;
                                      if(ends[19]>=biggest29763){
                                        biggest29763=ends[19];
                                      }
                                      if(ends[25]>=biggest29763){
                                        biggest29763=ends[25];
                                      }
                                      if(ends[35]>=biggest29763){
                                        biggest29763=ends[35];
                                      }
                                      if(biggest29763 == 1){
                                        active[18]=1;
                                        ends[18]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[18]=1;
                                      ends[18]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[18]=1;
                                    ends[18]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[18]=1;
                                ends[18]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3744=1;
                  S3744=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 187, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 187, column: 7
                    S3744=1;
                    active[18]=1;
                    ends[18]=1;
                    break RUN;
                  }
                  else {
                    S3739=0;
                    if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 187, column: 7
                      convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 187, column: 7
                      S3739=1;
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 187, column: 7
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 187, column: 7
                        ends[18]=2;
                        ;//sysj\conveyor_controller.sysj line: 187, column: 7
                        S3848=1;
                        S3766=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 188, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                          S3766=1;
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                        else {
                          S3761=0;
                          if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                            fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 188, column: 7
                            S3761=1;
                            if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                              ends[18]=2;
                              ;//sysj\conveyor_controller.sysj line: 188, column: 7
                              S3848=2;
                              S3855=0;
                              if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                S3855=1;
                                active[18]=1;
                                ends[18]=1;
                                break RUN;
                              }
                              else {
                                S3850=0;
                                if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                  capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                                  S3850=1;
                                  if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                    ends[18]=2;
                                    ;//sysj\conveyor_controller.sysj line: 189, column: 7
                                    S3848=3;
                                    thread29764(tdone,ends);
                                    thread29769(tdone,ends);
                                    thread29783(tdone,ends);
                                    int biggest29784 = 0;
                                    if(ends[19]>=biggest29784){
                                      biggest29784=ends[19];
                                    }
                                    if(ends[25]>=biggest29784){
                                      biggest29784=ends[25];
                                    }
                                    if(ends[35]>=biggest29784){
                                      biggest29784=ends[35];
                                    }
                                    if(biggest29784 == 1){
                                      active[18]=1;
                                      ends[18]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[18]=1;
                                    ends[18]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[18]=1;
                                  ends[18]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[18]=1;
                        ends[18]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[18]=1;
                      ends[18]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S3766){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 188, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                    S3766=1;
                    active[18]=1;
                    ends[18]=1;
                    break RUN;
                  }
                  else {
                    switch(S3761){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                          fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 188, column: 7
                          S3761=1;
                          if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                            ends[18]=2;
                            ;//sysj\conveyor_controller.sysj line: 188, column: 7
                            S3848=2;
                            S3855=0;
                            if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                              S3855=1;
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                            else {
                              S3850=0;
                              if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                                S3850=1;
                                if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                  ends[18]=2;
                                  ;//sysj\conveyor_controller.sysj line: 189, column: 7
                                  S3848=3;
                                  thread29785(tdone,ends);
                                  thread29790(tdone,ends);
                                  thread29804(tdone,ends);
                                  int biggest29805 = 0;
                                  if(ends[19]>=biggest29805){
                                    biggest29805=ends[19];
                                  }
                                  if(ends[25]>=biggest29805){
                                    biggest29805=ends[25];
                                  }
                                  if(ends[35]>=biggest29805){
                                    biggest29805=ends[35];
                                  }
                                  if(biggest29805 == 1){
                                    active[18]=1;
                                    ends[18]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[18]=1;
                                  ends[18]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[18]=1;
                                ends[18]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                          ends[18]=2;
                          ;//sysj\conveyor_controller.sysj line: 188, column: 7
                          S3848=2;
                          S3855=0;
                          if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                            S3855=1;
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                          else {
                            S3850=0;
                            if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                              capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                              S3850=1;
                              if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                                ends[18]=2;
                                ;//sysj\conveyor_controller.sysj line: 189, column: 7
                                S3848=3;
                                thread29806(tdone,ends);
                                thread29811(tdone,ends);
                                thread29825(tdone,ends);
                                int biggest29826 = 0;
                                if(ends[19]>=biggest29826){
                                  biggest29826=ends[19];
                                }
                                if(ends[25]>=biggest29826){
                                  biggest29826=ends[25];
                                }
                                if(ends[35]>=biggest29826){
                                  biggest29826=ends[35];
                                }
                                if(biggest29826 == 1){
                                  active[18]=1;
                                  ends[18]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[18]=1;
                                ends[18]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3766=1;
                  S3766=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 188, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                    S3766=1;
                    active[18]=1;
                    ends[18]=1;
                    break RUN;
                  }
                  else {
                    S3761=0;
                    if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                      fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 188, column: 7
                      S3761=1;
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 188, column: 7
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 188, column: 7
                        ends[18]=2;
                        ;//sysj\conveyor_controller.sysj line: 188, column: 7
                        S3848=2;
                        S3855=0;
                        if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                          S3855=1;
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                        else {
                          S3850=0;
                          if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                            capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                            S3850=1;
                            if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                              ends[18]=2;
                              ;//sysj\conveyor_controller.sysj line: 189, column: 7
                              S3848=3;
                              thread29827(tdone,ends);
                              thread29832(tdone,ends);
                              thread29846(tdone,ends);
                              int biggest29847 = 0;
                              if(ends[19]>=biggest29847){
                                biggest29847=ends[19];
                              }
                              if(ends[25]>=biggest29847){
                                biggest29847=ends[25];
                              }
                              if(ends[35]>=biggest29847){
                                biggest29847=ends[35];
                              }
                              if(biggest29847 == 1){
                                active[18]=1;
                                ends[18]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[18]=1;
                        ends[18]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[18]=1;
                      ends[18]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 2 : 
              switch(S3855){
                case 0 : 
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                    S3855=1;
                    active[18]=1;
                    ends[18]=1;
                    break RUN;
                  }
                  else {
                    switch(S3850){
                      case 0 : 
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                          S3850=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                            ends[18]=2;
                            ;//sysj\conveyor_controller.sysj line: 189, column: 7
                            S3848=3;
                            thread29848(tdone,ends);
                            thread29853(tdone,ends);
                            thread29867(tdone,ends);
                            int biggest29868 = 0;
                            if(ends[19]>=biggest29868){
                              biggest29868=ends[19];
                            }
                            if(ends[25]>=biggest29868){
                              biggest29868=ends[25];
                            }
                            if(ends[35]>=biggest29868){
                              biggest29868=ends[35];
                            }
                            if(biggest29868 == 1){
                              active[18]=1;
                              ends[18]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                          ends[18]=2;
                          ;//sysj\conveyor_controller.sysj line: 189, column: 7
                          S3848=3;
                          thread29869(tdone,ends);
                          thread29874(tdone,ends);
                          thread29888(tdone,ends);
                          int biggest29889 = 0;
                          if(ends[19]>=biggest29889){
                            biggest29889=ends[19];
                          }
                          if(ends[25]>=biggest29889){
                            biggest29889=ends[25];
                          }
                          if(ends[35]>=biggest29889){
                            biggest29889=ends[35];
                          }
                          if(biggest29889 == 1){
                            active[18]=1;
                            ends[18]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3855=1;
                  S3855=0;
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 189, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                    S3855=1;
                    active[18]=1;
                    ends[18]=1;
                    break RUN;
                  }
                  else {
                    S3850=0;
                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 189, column: 7
                      S3850=1;
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 189, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 189, column: 7
                        ends[18]=2;
                        ;//sysj\conveyor_controller.sysj line: 189, column: 7
                        S3848=3;
                        thread29890(tdone,ends);
                        thread29895(tdone,ends);
                        thread29909(tdone,ends);
                        int biggest29910 = 0;
                        if(ends[19]>=biggest29910){
                          biggest29910=ends[19];
                        }
                        if(ends[25]>=biggest29910){
                          biggest29910=ends[25];
                        }
                        if(ends[35]>=biggest29910){
                          biggest29910=ends[35];
                        }
                        if(biggest29910 == 1){
                          active[18]=1;
                          ends[18]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[18]=1;
                        ends[18]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[18]=1;
                      ends[18]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 3 : 
              thread29911(tdone,ends);
              thread29936(tdone,ends);
              thread29959(tdone,ends);
              int biggest29960 = 0;
              if(ends[19]>=biggest29960){
                biggest29960=ends[19];
              }
              if(ends[25]>=biggest29960){
                biggest29960=ends[25];
              }
              if(ends[35]>=biggest29960){
                biggest29960=ends[35];
              }
              if(biggest29960 == 1){
                active[18]=1;
                ends[18]=1;
                break RUN;
              }
              //FINXME code
              if(biggest29960 == 0){
                S15973=0;
                active[18]=0;
                ends[18]=0;
                S15973=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    cvR_18 = new Signal();
    fR_18 = new Signal();
    cR_18 = new Signal();
    bottleAtPos5_18 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[18] != 0){
      int index = 18;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[18]!=0 || suspended[18]!=0 || active[18]!=1);
      else{
        if(!df){
          convReady_in.gethook();
          fillerReady_in.gethook();
          capperReady_in.gethook();
          checkFive_in.gethook();
          rotated_o.gethook();
          tableAlignedWithSensor.gethook();
          capOnBottleAtPos1.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      capOnBottleAtPos1.setpreclear();
      rotaryTableTrigger.setpreclear();
      cvR_18.setpreclear();
      fR_18.setpreclear();
      cR_18.setpreclear();
      bottleAtPos5_18.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      cvR_18.setClear();
      fR_18.setClear();
      cR_18.setClear();
      bottleAtPos5_18.setClear();
      convReady_in.sethook();
      fillerReady_in.sethook();
      capperReady_in.sethook();
      checkFive_in.sethook();
      rotated_o.sethook();
      if(paused[18]!=0 || suspended[18]!=0 || active[18]!=1);
      else{
        convReady_in.gethook();
        fillerReady_in.gethook();
        capperReady_in.gethook();
        checkFive_in.gethook();
        rotated_o.gethook();
        tableAlignedWithSensor.gethook();
        capOnBottleAtPos1.gethook();
      }
      runFinisher();
      if(active[18] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

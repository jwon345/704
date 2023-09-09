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
  private Signal cvR_15;
  private Signal fR_15;
  private Signal cR_15;
  private long __start_thread_20;//sysj\conveyor_controller.sysj line: 210, column: 44
  private int S13377 = 1;
  private int S3476 = 1;
  private int S3372 = 1;
  private int S3367 = 1;
  private int S3394 = 1;
  private int S3389 = 1;
  private int S3483 = 1;
  private int S3478 = 1;
  private int S4530 = 1;
  private int S3615 = 1;
  private int S3611 = 1;
  private int S3614 = 1;
  private int S3636 = 1;
  private int S3652 = 1;
  private int S3755 = 1;
  private int S3750 = 1;
  private int S4829 = 1;
  private int S4629 = 1;
  private int S4563 = 1;
  private int S4555 = 1;
  private int S4554 = 1;
  private int S4538 = 1;
  private int S4533 = 1;
  private int S4561 = 1;
  private int S4728 = 1;
  private int S4662 = 1;
  private int S4654 = 1;
  private int S4653 = 1;
  private int S4637 = 1;
  private int S4632 = 1;
  private int S4660 = 1;
  private int S4827 = 1;
  private int S4761 = 1;
  private int S4753 = 1;
  private int S4752 = 1;
  private int S4736 = 1;
  private int S4731 = 1;
  private int S4759 = 1;
  
  private int[] ends = new int[55];
  private int[] tdone = new int[55];
  
  public void thread24670(int [] tdone, int [] ends){
        S4759=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cR_15);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S4759=0;
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread24669(int [] tdone, int [] ends){
        S4753=1;
    S4752=0;
    S4736=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4736=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      S4731=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4731=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[29]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4752=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
      else {
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
      }
    }
  }

  public void thread24667(int [] tdone, int [] ends){
        switch(S4759){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        cR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
        currsigs.addElement(cR_15);
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
        break;
      
    }
  }

  public void thread24666(int [] tdone, int [] ends){
        switch(S4753){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S4752){
          case 0 : 
            switch(S4736){
              case 0 : 
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                  S4736=1;
                  active[29]=1;
                  ends[29]=1;
                  tdone[29]=1;
                }
                else {
                  switch(S4731){
                    case 0 : 
                      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
                        S4731=1;
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                          ends[29]=2;
                          ;//sysj\conveyor_controller.sysj line: 57, column: 5
                          S4752=1;
                          active[29]=1;
                          ends[29]=1;
                          tdone[29]=1;
                        }
                        else {
                          active[29]=1;
                          ends[29]=1;
                          tdone[29]=1;
                        }
                      }
                      else {
                        active[29]=1;
                        ends[29]=1;
                        tdone[29]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                        ends[29]=2;
                        ;//sysj\conveyor_controller.sysj line: 57, column: 5
                        S4752=1;
                        active[29]=1;
                        ends[29]=1;
                        tdone[29]=1;
                      }
                      else {
                        active[29]=1;
                        ends[29]=1;
                        tdone[29]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4736=1;
                S4736=0;
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                  S4736=1;
                  active[29]=1;
                  ends[29]=1;
                  tdone[29]=1;
                }
                else {
                  S4731=0;
                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
                    S4731=1;
                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                      ends[29]=2;
                      ;//sysj\conveyor_controller.sysj line: 57, column: 5
                      S4752=1;
                      active[29]=1;
                      ends[29]=1;
                      tdone[29]=1;
                    }
                    else {
                      active[29]=1;
                      ends[29]=1;
                      tdone[29]=1;
                    }
                  }
                  else {
                    active[29]=1;
                    ends[29]=1;
                    tdone[29]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S4752=1;
            S4752=2;
            active[29]=1;
            ends[29]=1;
            tdone[29]=1;
            break;
          
          case 2 : 
            S4752=2;
            capperReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 57, column: 36
            ends[29]=2;
            tdone[29]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread24665(int [] tdone, int [] ends){
        switch(S4827){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        switch(S4761){
          case 0 : 
            thread24666(tdone,ends);
            thread24667(tdone,ends);
            int biggest24668 = 0;
            if(ends[29]>=biggest24668){
              biggest24668=ends[29];
            }
            if(ends[30]>=biggest24668){
              biggest24668=ends[30];
            }
            if(biggest24668 == 1){
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            if(biggest24668 == 2){
              ends[28]=2;
              ;//sysj\conveyor_controller.sysj line: 56, column: 3
              S4761=1;
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            //FINXME code
            if(biggest24668 == 0){
              S4761=1;
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            break;
          
          case 1 : 
            S4761=1;
            S4761=0;
            thread24669(tdone,ends);
            thread24670(tdone,ends);
            int biggest24671 = 0;
            if(ends[29]>=biggest24671){
              biggest24671=ends[29];
            }
            if(ends[30]>=biggest24671){
              biggest24671=ends[30];
            }
            if(biggest24671 == 1){
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread24663(int [] tdone, int [] ends){
        S4660=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      fR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(fR_15);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S4660=0;
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread24662(int [] tdone, int [] ends){
        S4654=1;
    S4653=0;
    S4637=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4637=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4632=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4632=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[26]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4653=1;
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
      }
      else {
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
    }
  }

  public void thread24660(int [] tdone, int [] ends){
        switch(S4660){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        fR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
        currsigs.addElement(fR_15);
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
        break;
      
    }
  }

  public void thread24659(int [] tdone, int [] ends){
        switch(S4654){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S4653){
          case 0 : 
            switch(S4637){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                  S4637=1;
                  active[26]=1;
                  ends[26]=1;
                  tdone[26]=1;
                }
                else {
                  switch(S4632){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
                        S4632=1;
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 57, column: 5
                          S4653=1;
                          active[26]=1;
                          ends[26]=1;
                          tdone[26]=1;
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          tdone[26]=1;
                        }
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        tdone[26]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 57, column: 5
                        S4653=1;
                        active[26]=1;
                        ends[26]=1;
                        tdone[26]=1;
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        tdone[26]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4637=1;
                S4637=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                  S4637=1;
                  active[26]=1;
                  ends[26]=1;
                  tdone[26]=1;
                }
                else {
                  S4632=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
                    S4632=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                      ends[26]=2;
                      ;//sysj\conveyor_controller.sysj line: 57, column: 5
                      S4653=1;
                      active[26]=1;
                      ends[26]=1;
                      tdone[26]=1;
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      tdone[26]=1;
                    }
                  }
                  else {
                    active[26]=1;
                    ends[26]=1;
                    tdone[26]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S4653=1;
            S4653=2;
            active[26]=1;
            ends[26]=1;
            tdone[26]=1;
            break;
          
          case 2 : 
            S4653=2;
            fillerReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 57, column: 36
            ends[26]=2;
            tdone[26]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread24658(int [] tdone, int [] ends){
        switch(S4728){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S4662){
          case 0 : 
            thread24659(tdone,ends);
            thread24660(tdone,ends);
            int biggest24661 = 0;
            if(ends[26]>=biggest24661){
              biggest24661=ends[26];
            }
            if(ends[27]>=biggest24661){
              biggest24661=ends[27];
            }
            if(biggest24661 == 1){
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            if(biggest24661 == 2){
              ends[25]=2;
              ;//sysj\conveyor_controller.sysj line: 56, column: 3
              S4662=1;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            //FINXME code
            if(biggest24661 == 0){
              S4662=1;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
          case 1 : 
            S4662=1;
            S4662=0;
            thread24662(tdone,ends);
            thread24663(tdone,ends);
            int biggest24664 = 0;
            if(ends[26]>=biggest24664){
              biggest24664=ends[26];
            }
            if(ends[27]>=biggest24664){
              biggest24664=ends[27];
            }
            if(biggest24664 == 1){
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread24656(int [] tdone, int [] ends){
        S4561=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cvR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cvR_15);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S4561=0;
      active[24]=0;
      ends[24]=0;
      tdone[24]=1;
    }
  }

  public void thread24655(int [] tdone, int [] ends){
        S4555=1;
    S4554=0;
    S4538=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4538=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4533=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4533=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[23]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4554=1;
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread24653(int [] tdone, int [] ends){
        switch(S4561){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        cvR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
        currsigs.addElement(cvR_15);
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
        break;
      
    }
  }

  public void thread24652(int [] tdone, int [] ends){
        switch(S4555){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S4554){
          case 0 : 
            switch(S4538){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                  S4538=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  switch(S4533){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
                        S4533=1;
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                          ends[23]=2;
                          ;//sysj\conveyor_controller.sysj line: 57, column: 5
                          S4554=1;
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                        else {
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                        ends[23]=2;
                        ;//sysj\conveyor_controller.sysj line: 57, column: 5
                        S4554=1;
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4538=1;
                S4538=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                  S4538=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  S4533=0;
                  if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                    convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
                    S4533=1;
                    if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
                      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
                      ends[23]=2;
                      ;//sysj\conveyor_controller.sysj line: 57, column: 5
                      S4554=1;
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                    else {
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                  }
                  else {
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S4554=1;
            S4554=2;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
            break;
          
          case 2 : 
            S4554=2;
            convReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 57, column: 36
            ends[23]=2;
            tdone[23]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread24651(int [] tdone, int [] ends){
        switch(S4629){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S4563){
          case 0 : 
            thread24652(tdone,ends);
            thread24653(tdone,ends);
            int biggest24654 = 0;
            if(ends[23]>=biggest24654){
              biggest24654=ends[23];
            }
            if(ends[24]>=biggest24654){
              biggest24654=ends[24];
            }
            if(biggest24654 == 1){
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            if(biggest24654 == 2){
              ends[22]=2;
              ;//sysj\conveyor_controller.sysj line: 56, column: 3
              S4563=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            //FINXME code
            if(biggest24654 == 0){
              S4563=1;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
          case 1 : 
            S4563=1;
            S4563=0;
            thread24655(tdone,ends);
            thread24656(tdone,ends);
            int biggest24657 = 0;
            if(ends[23]>=biggest24657){
              biggest24657=ends[23];
            }
            if(ends[24]>=biggest24657){
              biggest24657=ends[24];
            }
            if(biggest24657 == 1){
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread24650(int [] tdone, int [] ends){
        switch(S4829){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread24651(tdone,ends);
        thread24658(tdone,ends);
        thread24665(tdone,ends);
        int biggest24672 = 0;
        if(ends[22]>=biggest24672){
          biggest24672=ends[22];
        }
        if(ends[25]>=biggest24672){
          biggest24672=ends[25];
        }
        if(ends[28]>=biggest24672){
          biggest24672=ends[28];
        }
        if(biggest24672 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest24672 == 0){
          S4829=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread24648(int [] tdone, int [] ends){
        S3614=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread24647(int [] tdone, int [] ends){
        S3611=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread24645(int [] tdone, int [] ends){
        S3614=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread24644(int [] tdone, int [] ends){
        S3611=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread24642(int [] tdone, int [] ends){
        S3614=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread24641(int [] tdone, int [] ends){
        S3611=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread24639(int [] tdone, int [] ends){
        S3614=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread24638(int [] tdone, int [] ends){
        S3611=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread24636(int [] tdone, int [] ends){
        switch(S3652){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_20 >= 100){//sysj\conveyor_controller.sysj line: 210, column: 44
          ends[20]=3;
          ;//sysj\conveyor_controller.sysj line: 210, column: 44
          ends[20]=2;
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

  public void thread24635(int [] tdone, int [] ends){
        switch(S3636){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 210, column: 14
        currsigs.addElement(rotaryTableTrigger);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
        break;
      
    }
  }

  public void thread24633(int [] tdone, int [] ends){
        S3652=1;
    __start_thread_20 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 210, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_20 >= 100){//sysj\conveyor_controller.sysj line: 210, column: 44
      ends[20]=3;
      ;//sysj\conveyor_controller.sysj line: 210, column: 44
      ends[20]=2;
      tdone[20]=1;
    }
    else {
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread24632(int [] tdone, int [] ends){
        S3636=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 210, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread24630(int [] tdone, int [] ends){
        S3652=1;
    __start_thread_20 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 210, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_20 >= 100){//sysj\conveyor_controller.sysj line: 210, column: 44
      ends[20]=3;
      ;//sysj\conveyor_controller.sysj line: 210, column: 44
      ends[20]=2;
      tdone[20]=1;
    }
    else {
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread24629(int [] tdone, int [] ends){
        S3636=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 210, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread24627(int [] tdone, int [] ends){
        S3652=1;
    __start_thread_20 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 210, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_20 >= 100){//sysj\conveyor_controller.sysj line: 210, column: 44
      ends[20]=3;
      ;//sysj\conveyor_controller.sysj line: 210, column: 44
      ends[20]=2;
      tdone[20]=1;
    }
    else {
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread24626(int [] tdone, int [] ends){
        S3636=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 210, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread24624(int [] tdone, int [] ends){
        switch(S3614){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(cvR_15.getprestatus()){//sysj\conveyor_controller.sysj line: 189, column: 17
          System.out.println("*Rotary - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 190, column: 11
          S3614=0;
          active[18]=0;
          ends[18]=0;
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

  public void thread24623(int [] tdone, int [] ends){
        switch(S3611){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(fR_15.getprestatus()){//sysj\conveyor_controller.sysj line: 184, column: 17
          System.out.println("*Rotary - Filler Ready*");//sysj\conveyor_controller.sysj line: 185, column: 11
          S3611=0;
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

  public void thread24622(int [] tdone, int [] ends){
        switch(S4530){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S3615){
          case 0 : 
            thread24623(tdone,ends);
            thread24624(tdone,ends);
            int biggest24625 = 0;
            if(ends[17]>=biggest24625){
              biggest24625=ends[17];
            }
            if(ends[18]>=biggest24625){
              biggest24625=ends[18];
            }
            if(biggest24625 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest24625 == 0){
              System.out.println("*Rotary - All controllers are ready*");//sysj\conveyor_controller.sysj line: 195, column: 10
              S3615=1;
              if(bottleAtPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 198, column: 18
                if(bottleAtPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 202, column: 23
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
                else {
                  ends[16]=2;
                  ;//sysj\conveyor_controller.sysj line: 200, column: 13
                  S3615=2;
                  thread24626(tdone,ends);
                  thread24627(tdone,ends);
                  int biggest24628 = 0;
                  if(ends[19]>=biggest24628){
                    biggest24628=ends[19];
                  }
                  if(ends[20]>=biggest24628){
                    biggest24628=ends[20];
                  }
                  if(biggest24628 == 1){
                    active[16]=1;
                    ends[16]=1;
                    tdone[16]=1;
                  }
                  if(biggest24628 == 2){
                    ends[16]=2;
                    ;//sysj\conveyor_controller.sysj line: 209, column: 12
                    System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 213, column: 16
                    S3615=3;
                    active[16]=1;
                    ends[16]=1;
                    tdone[16]=1;
                  }
                }
              }
              else {
                S3615=2;
                thread24629(tdone,ends);
                thread24630(tdone,ends);
                int biggest24631 = 0;
                if(ends[19]>=biggest24631){
                  biggest24631=ends[19];
                }
                if(ends[20]>=biggest24631){
                  biggest24631=ends[20];
                }
                if(biggest24631 == 1){
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
                if(biggest24631 == 2){
                  ends[16]=2;
                  ;//sysj\conveyor_controller.sysj line: 209, column: 12
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 213, column: 16
                  S3615=3;
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
              }
            }
            break;
          
          case 1 : 
            if(bottleAtPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 202, column: 23
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              ends[16]=2;
              ;//sysj\conveyor_controller.sysj line: 200, column: 13
              S3615=2;
              thread24632(tdone,ends);
              thread24633(tdone,ends);
              int biggest24634 = 0;
              if(ends[19]>=biggest24634){
                biggest24634=ends[19];
              }
              if(ends[20]>=biggest24634){
                biggest24634=ends[20];
              }
              if(biggest24634 == 1){
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              if(biggest24634 == 2){
                ends[16]=2;
                ;//sysj\conveyor_controller.sysj line: 209, column: 12
                System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 213, column: 16
                S3615=3;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
            }
            break;
          
          case 2 : 
            thread24635(tdone,ends);
            thread24636(tdone,ends);
            int biggest24637 = 0;
            if(ends[19]>=biggest24637){
              biggest24637=ends[19];
            }
            if(ends[20]>=biggest24637){
              biggest24637=ends[20];
            }
            if(biggest24637 == 1){
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            if(biggest24637 == 2){
              ends[16]=2;
              ;//sysj\conveyor_controller.sysj line: 209, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 213, column: 16
              S3615=3;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            //FINXME code
            if(biggest24637 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 213, column: 16
              S3615=3;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_controller.sysj line: 214, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\conveyor_controller.sysj line: 216, column: 16
              S3615=4;
              S3755=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 217, column: 13
                rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 217, column: 13
                S3755=1;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                S3750=0;
                if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 217, column: 13
                  rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 217, column: 13
                  S3750=1;
                  if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 217, column: 13
                    rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 217, column: 13
                    ends[16]=2;
                    ;//sysj\conveyor_controller.sysj line: 217, column: 13
                    S3615=0;
                    thread24638(tdone,ends);
                    thread24639(tdone,ends);
                    int biggest24640 = 0;
                    if(ends[17]>=biggest24640){
                      biggest24640=ends[17];
                    }
                    if(ends[18]>=biggest24640){
                      biggest24640=ends[18];
                    }
                    if(biggest24640 == 1){
                      active[16]=1;
                      ends[16]=1;
                      tdone[16]=1;
                    }
                  }
                  else {
                    active[16]=1;
                    ends[16]=1;
                    tdone[16]=1;
                  }
                }
                else {
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
              }
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
          case 4 : 
            switch(S3755){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 217, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 217, column: 13
                  S3755=1;
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
                else {
                  switch(S3750){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 217, column: 13
                        rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 217, column: 13
                        S3750=1;
                        if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 217, column: 13
                          rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 217, column: 13
                          ends[16]=2;
                          ;//sysj\conveyor_controller.sysj line: 217, column: 13
                          S3615=0;
                          thread24641(tdone,ends);
                          thread24642(tdone,ends);
                          int biggest24643 = 0;
                          if(ends[17]>=biggest24643){
                            biggest24643=ends[17];
                          }
                          if(ends[18]>=biggest24643){
                            biggest24643=ends[18];
                          }
                          if(biggest24643 == 1){
                            active[16]=1;
                            ends[16]=1;
                            tdone[16]=1;
                          }
                        }
                        else {
                          active[16]=1;
                          ends[16]=1;
                          tdone[16]=1;
                        }
                      }
                      else {
                        active[16]=1;
                        ends[16]=1;
                        tdone[16]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 217, column: 13
                        rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 217, column: 13
                        ends[16]=2;
                        ;//sysj\conveyor_controller.sysj line: 217, column: 13
                        S3615=0;
                        thread24644(tdone,ends);
                        thread24645(tdone,ends);
                        int biggest24646 = 0;
                        if(ends[17]>=biggest24646){
                          biggest24646=ends[17];
                        }
                        if(ends[18]>=biggest24646){
                          biggest24646=ends[18];
                        }
                        if(biggest24646 == 1){
                          active[16]=1;
                          ends[16]=1;
                          tdone[16]=1;
                        }
                      }
                      else {
                        active[16]=1;
                        ends[16]=1;
                        tdone[16]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S3755=1;
                S3755=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 217, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 217, column: 13
                  S3755=1;
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
                else {
                  S3750=0;
                  if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 217, column: 13
                    rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 217, column: 13
                    S3750=1;
                    if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 217, column: 13
                      rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 217, column: 13
                      ends[16]=2;
                      ;//sysj\conveyor_controller.sysj line: 217, column: 13
                      S3615=0;
                      thread24647(tdone,ends);
                      thread24648(tdone,ends);
                      int biggest24649 = 0;
                      if(ends[17]>=biggest24649){
                        biggest24649=ends[17];
                      }
                      if(ends[18]>=biggest24649){
                        biggest24649=ends[18];
                      }
                      if(biggest24649 == 1){
                        active[16]=1;
                        ends[16]=1;
                        tdone[16]=1;
                      }
                    }
                    else {
                      active[16]=1;
                      ends[16]=1;
                      tdone[16]=1;
                    }
                  }
                  else {
                    active[16]=1;
                    ends[16]=1;
                    tdone[16]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread24618(int [] tdone, int [] ends){
        S4759=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cR_15);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S4759=0;
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread24617(int [] tdone, int [] ends){
        S4753=1;
    S4752=0;
    S4736=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4736=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      S4731=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4731=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[29]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4752=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
      else {
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
      }
    }
  }

  public void thread24616(int [] tdone, int [] ends){
        S4827=1;
    S4761=0;
    thread24617(tdone,ends);
    thread24618(tdone,ends);
    int biggest24619 = 0;
    if(ends[29]>=biggest24619){
      biggest24619=ends[29];
    }
    if(ends[30]>=biggest24619){
      biggest24619=ends[30];
    }
    if(biggest24619 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread24614(int [] tdone, int [] ends){
        S4660=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      fR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(fR_15);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S4660=0;
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread24613(int [] tdone, int [] ends){
        S4654=1;
    S4653=0;
    S4637=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4637=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4632=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4632=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[26]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4653=1;
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
      }
      else {
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
    }
  }

  public void thread24612(int [] tdone, int [] ends){
        S4728=1;
    S4662=0;
    thread24613(tdone,ends);
    thread24614(tdone,ends);
    int biggest24615 = 0;
    if(ends[26]>=biggest24615){
      biggest24615=ends[26];
    }
    if(ends[27]>=biggest24615){
      biggest24615=ends[27];
    }
    if(biggest24615 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread24610(int [] tdone, int [] ends){
        S4561=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cvR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cvR_15);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S4561=0;
      active[24]=0;
      ends[24]=0;
      tdone[24]=1;
    }
  }

  public void thread24609(int [] tdone, int [] ends){
        S4555=1;
    S4554=0;
    S4538=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4538=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4533=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4533=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[23]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4554=1;
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread24608(int [] tdone, int [] ends){
        S4629=1;
    S4563=0;
    thread24609(tdone,ends);
    thread24610(tdone,ends);
    int biggest24611 = 0;
    if(ends[23]>=biggest24611){
      biggest24611=ends[23];
    }
    if(ends[24]>=biggest24611){
      biggest24611=ends[24];
    }
    if(biggest24611 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread24607(int [] tdone, int [] ends){
        S4829=1;
    thread24608(tdone,ends);
    thread24612(tdone,ends);
    thread24616(tdone,ends);
    int biggest24620 = 0;
    if(ends[22]>=biggest24620){
      biggest24620=ends[22];
    }
    if(ends[25]>=biggest24620){
      biggest24620=ends[25];
    }
    if(ends[28]>=biggest24620){
      biggest24620=ends[28];
    }
    if(biggest24620 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24620 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24620 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread24605(int [] tdone, int [] ends){
        S3614=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread24604(int [] tdone, int [] ends){
        S3611=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread24603(int [] tdone, int [] ends){
        S4530=1;
    S3615=0;
    thread24604(tdone,ends);
    thread24605(tdone,ends);
    int biggest24606 = 0;
    if(ends[17]>=biggest24606){
      biggest24606=ends[17];
    }
    if(ends[18]>=biggest24606){
      biggest24606=ends[18];
    }
    if(biggest24606 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread24599(int [] tdone, int [] ends){
        S4759=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cR_15);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S4759=0;
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread24598(int [] tdone, int [] ends){
        S4753=1;
    S4752=0;
    S4736=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4736=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      S4731=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4731=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[29]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4752=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
      else {
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
      }
    }
  }

  public void thread24597(int [] tdone, int [] ends){
        S4827=1;
    S4761=0;
    thread24598(tdone,ends);
    thread24599(tdone,ends);
    int biggest24600 = 0;
    if(ends[29]>=biggest24600){
      biggest24600=ends[29];
    }
    if(ends[30]>=biggest24600){
      biggest24600=ends[30];
    }
    if(biggest24600 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread24595(int [] tdone, int [] ends){
        S4660=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      fR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(fR_15);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S4660=0;
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread24594(int [] tdone, int [] ends){
        S4654=1;
    S4653=0;
    S4637=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4637=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4632=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4632=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[26]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4653=1;
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
      }
      else {
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
    }
  }

  public void thread24593(int [] tdone, int [] ends){
        S4728=1;
    S4662=0;
    thread24594(tdone,ends);
    thread24595(tdone,ends);
    int biggest24596 = 0;
    if(ends[26]>=biggest24596){
      biggest24596=ends[26];
    }
    if(ends[27]>=biggest24596){
      biggest24596=ends[27];
    }
    if(biggest24596 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread24591(int [] tdone, int [] ends){
        S4561=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cvR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cvR_15);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S4561=0;
      active[24]=0;
      ends[24]=0;
      tdone[24]=1;
    }
  }

  public void thread24590(int [] tdone, int [] ends){
        S4555=1;
    S4554=0;
    S4538=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4538=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4533=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4533=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[23]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4554=1;
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread24589(int [] tdone, int [] ends){
        S4629=1;
    S4563=0;
    thread24590(tdone,ends);
    thread24591(tdone,ends);
    int biggest24592 = 0;
    if(ends[23]>=biggest24592){
      biggest24592=ends[23];
    }
    if(ends[24]>=biggest24592){
      biggest24592=ends[24];
    }
    if(biggest24592 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread24588(int [] tdone, int [] ends){
        S4829=1;
    thread24589(tdone,ends);
    thread24593(tdone,ends);
    thread24597(tdone,ends);
    int biggest24601 = 0;
    if(ends[22]>=biggest24601){
      biggest24601=ends[22];
    }
    if(ends[25]>=biggest24601){
      biggest24601=ends[25];
    }
    if(ends[28]>=biggest24601){
      biggest24601=ends[28];
    }
    if(biggest24601 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24601 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24601 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread24586(int [] tdone, int [] ends){
        S3614=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread24585(int [] tdone, int [] ends){
        S3611=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread24584(int [] tdone, int [] ends){
        S4530=1;
    S3615=0;
    thread24585(tdone,ends);
    thread24586(tdone,ends);
    int biggest24587 = 0;
    if(ends[17]>=biggest24587){
      biggest24587=ends[17];
    }
    if(ends[18]>=biggest24587){
      biggest24587=ends[18];
    }
    if(biggest24587 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread24580(int [] tdone, int [] ends){
        S4759=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cR_15);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S4759=0;
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread24579(int [] tdone, int [] ends){
        S4753=1;
    S4752=0;
    S4736=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4736=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      S4731=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4731=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[29]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4752=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
      else {
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
      }
    }
  }

  public void thread24578(int [] tdone, int [] ends){
        S4827=1;
    S4761=0;
    thread24579(tdone,ends);
    thread24580(tdone,ends);
    int biggest24581 = 0;
    if(ends[29]>=biggest24581){
      biggest24581=ends[29];
    }
    if(ends[30]>=biggest24581){
      biggest24581=ends[30];
    }
    if(biggest24581 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread24576(int [] tdone, int [] ends){
        S4660=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      fR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(fR_15);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S4660=0;
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread24575(int [] tdone, int [] ends){
        S4654=1;
    S4653=0;
    S4637=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4637=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4632=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4632=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[26]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4653=1;
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
      }
      else {
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
    }
  }

  public void thread24574(int [] tdone, int [] ends){
        S4728=1;
    S4662=0;
    thread24575(tdone,ends);
    thread24576(tdone,ends);
    int biggest24577 = 0;
    if(ends[26]>=biggest24577){
      biggest24577=ends[26];
    }
    if(ends[27]>=biggest24577){
      biggest24577=ends[27];
    }
    if(biggest24577 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread24572(int [] tdone, int [] ends){
        S4561=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cvR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cvR_15);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S4561=0;
      active[24]=0;
      ends[24]=0;
      tdone[24]=1;
    }
  }

  public void thread24571(int [] tdone, int [] ends){
        S4555=1;
    S4554=0;
    S4538=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4538=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4533=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4533=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[23]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4554=1;
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread24570(int [] tdone, int [] ends){
        S4629=1;
    S4563=0;
    thread24571(tdone,ends);
    thread24572(tdone,ends);
    int biggest24573 = 0;
    if(ends[23]>=biggest24573){
      biggest24573=ends[23];
    }
    if(ends[24]>=biggest24573){
      biggest24573=ends[24];
    }
    if(biggest24573 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread24569(int [] tdone, int [] ends){
        S4829=1;
    thread24570(tdone,ends);
    thread24574(tdone,ends);
    thread24578(tdone,ends);
    int biggest24582 = 0;
    if(ends[22]>=biggest24582){
      biggest24582=ends[22];
    }
    if(ends[25]>=biggest24582){
      biggest24582=ends[25];
    }
    if(ends[28]>=biggest24582){
      biggest24582=ends[28];
    }
    if(biggest24582 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24582 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24582 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread24567(int [] tdone, int [] ends){
        S3614=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread24566(int [] tdone, int [] ends){
        S3611=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread24565(int [] tdone, int [] ends){
        S4530=1;
    S3615=0;
    thread24566(tdone,ends);
    thread24567(tdone,ends);
    int biggest24568 = 0;
    if(ends[17]>=biggest24568){
      biggest24568=ends[17];
    }
    if(ends[18]>=biggest24568){
      biggest24568=ends[18];
    }
    if(biggest24568 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread24561(int [] tdone, int [] ends){
        S4759=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cR_15);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S4759=0;
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread24560(int [] tdone, int [] ends){
        S4753=1;
    S4752=0;
    S4736=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4736=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      S4731=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4731=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[29]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4752=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
      else {
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
      }
    }
  }

  public void thread24559(int [] tdone, int [] ends){
        S4827=1;
    S4761=0;
    thread24560(tdone,ends);
    thread24561(tdone,ends);
    int biggest24562 = 0;
    if(ends[29]>=biggest24562){
      biggest24562=ends[29];
    }
    if(ends[30]>=biggest24562){
      biggest24562=ends[30];
    }
    if(biggest24562 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread24557(int [] tdone, int [] ends){
        S4660=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      fR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(fR_15);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S4660=0;
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread24556(int [] tdone, int [] ends){
        S4654=1;
    S4653=0;
    S4637=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4637=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4632=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4632=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[26]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4653=1;
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
      }
      else {
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
    }
  }

  public void thread24555(int [] tdone, int [] ends){
        S4728=1;
    S4662=0;
    thread24556(tdone,ends);
    thread24557(tdone,ends);
    int biggest24558 = 0;
    if(ends[26]>=biggest24558){
      biggest24558=ends[26];
    }
    if(ends[27]>=biggest24558){
      biggest24558=ends[27];
    }
    if(biggest24558 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread24553(int [] tdone, int [] ends){
        S4561=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cvR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cvR_15);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S4561=0;
      active[24]=0;
      ends[24]=0;
      tdone[24]=1;
    }
  }

  public void thread24552(int [] tdone, int [] ends){
        S4555=1;
    S4554=0;
    S4538=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4538=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4533=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4533=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[23]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4554=1;
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread24551(int [] tdone, int [] ends){
        S4629=1;
    S4563=0;
    thread24552(tdone,ends);
    thread24553(tdone,ends);
    int biggest24554 = 0;
    if(ends[23]>=biggest24554){
      biggest24554=ends[23];
    }
    if(ends[24]>=biggest24554){
      biggest24554=ends[24];
    }
    if(biggest24554 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread24550(int [] tdone, int [] ends){
        S4829=1;
    thread24551(tdone,ends);
    thread24555(tdone,ends);
    thread24559(tdone,ends);
    int biggest24563 = 0;
    if(ends[22]>=biggest24563){
      biggest24563=ends[22];
    }
    if(ends[25]>=biggest24563){
      biggest24563=ends[25];
    }
    if(ends[28]>=biggest24563){
      biggest24563=ends[28];
    }
    if(biggest24563 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24563 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24563 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread24548(int [] tdone, int [] ends){
        S3614=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread24547(int [] tdone, int [] ends){
        S3611=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread24546(int [] tdone, int [] ends){
        S4530=1;
    S3615=0;
    thread24547(tdone,ends);
    thread24548(tdone,ends);
    int biggest24549 = 0;
    if(ends[17]>=biggest24549){
      biggest24549=ends[17];
    }
    if(ends[18]>=biggest24549){
      biggest24549=ends[18];
    }
    if(biggest24549 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread24542(int [] tdone, int [] ends){
        S4759=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cR_15);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S4759=0;
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread24541(int [] tdone, int [] ends){
        S4753=1;
    S4752=0;
    S4736=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4736=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      S4731=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4731=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[29]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4752=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
      else {
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
      }
    }
  }

  public void thread24540(int [] tdone, int [] ends){
        S4827=1;
    S4761=0;
    thread24541(tdone,ends);
    thread24542(tdone,ends);
    int biggest24543 = 0;
    if(ends[29]>=biggest24543){
      biggest24543=ends[29];
    }
    if(ends[30]>=biggest24543){
      biggest24543=ends[30];
    }
    if(biggest24543 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread24538(int [] tdone, int [] ends){
        S4660=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      fR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(fR_15);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S4660=0;
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread24537(int [] tdone, int [] ends){
        S4654=1;
    S4653=0;
    S4637=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4637=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4632=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4632=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[26]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4653=1;
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
      }
      else {
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
    }
  }

  public void thread24536(int [] tdone, int [] ends){
        S4728=1;
    S4662=0;
    thread24537(tdone,ends);
    thread24538(tdone,ends);
    int biggest24539 = 0;
    if(ends[26]>=biggest24539){
      biggest24539=ends[26];
    }
    if(ends[27]>=biggest24539){
      biggest24539=ends[27];
    }
    if(biggest24539 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread24534(int [] tdone, int [] ends){
        S4561=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cvR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cvR_15);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S4561=0;
      active[24]=0;
      ends[24]=0;
      tdone[24]=1;
    }
  }

  public void thread24533(int [] tdone, int [] ends){
        S4555=1;
    S4554=0;
    S4538=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4538=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4533=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4533=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[23]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4554=1;
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread24532(int [] tdone, int [] ends){
        S4629=1;
    S4563=0;
    thread24533(tdone,ends);
    thread24534(tdone,ends);
    int biggest24535 = 0;
    if(ends[23]>=biggest24535){
      biggest24535=ends[23];
    }
    if(ends[24]>=biggest24535){
      biggest24535=ends[24];
    }
    if(biggest24535 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread24531(int [] tdone, int [] ends){
        S4829=1;
    thread24532(tdone,ends);
    thread24536(tdone,ends);
    thread24540(tdone,ends);
    int biggest24544 = 0;
    if(ends[22]>=biggest24544){
      biggest24544=ends[22];
    }
    if(ends[25]>=biggest24544){
      biggest24544=ends[25];
    }
    if(ends[28]>=biggest24544){
      biggest24544=ends[28];
    }
    if(biggest24544 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24544 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24544 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread24529(int [] tdone, int [] ends){
        S3614=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread24528(int [] tdone, int [] ends){
        S3611=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread24527(int [] tdone, int [] ends){
        S4530=1;
    S3615=0;
    thread24528(tdone,ends);
    thread24529(tdone,ends);
    int biggest24530 = 0;
    if(ends[17]>=biggest24530){
      biggest24530=ends[17];
    }
    if(ends[18]>=biggest24530){
      biggest24530=ends[18];
    }
    if(biggest24530 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread24523(int [] tdone, int [] ends){
        S4759=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cR_15);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S4759=0;
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread24522(int [] tdone, int [] ends){
        S4753=1;
    S4752=0;
    S4736=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4736=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      S4731=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4731=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[29]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4752=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
      else {
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
      }
    }
  }

  public void thread24521(int [] tdone, int [] ends){
        S4827=1;
    S4761=0;
    thread24522(tdone,ends);
    thread24523(tdone,ends);
    int biggest24524 = 0;
    if(ends[29]>=biggest24524){
      biggest24524=ends[29];
    }
    if(ends[30]>=biggest24524){
      biggest24524=ends[30];
    }
    if(biggest24524 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread24519(int [] tdone, int [] ends){
        S4660=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      fR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(fR_15);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S4660=0;
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread24518(int [] tdone, int [] ends){
        S4654=1;
    S4653=0;
    S4637=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4637=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4632=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4632=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[26]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4653=1;
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
      }
      else {
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
    }
  }

  public void thread24517(int [] tdone, int [] ends){
        S4728=1;
    S4662=0;
    thread24518(tdone,ends);
    thread24519(tdone,ends);
    int biggest24520 = 0;
    if(ends[26]>=biggest24520){
      biggest24520=ends[26];
    }
    if(ends[27]>=biggest24520){
      biggest24520=ends[27];
    }
    if(biggest24520 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread24515(int [] tdone, int [] ends){
        S4561=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cvR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cvR_15);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S4561=0;
      active[24]=0;
      ends[24]=0;
      tdone[24]=1;
    }
  }

  public void thread24514(int [] tdone, int [] ends){
        S4555=1;
    S4554=0;
    S4538=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4538=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4533=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4533=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[23]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4554=1;
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread24513(int [] tdone, int [] ends){
        S4629=1;
    S4563=0;
    thread24514(tdone,ends);
    thread24515(tdone,ends);
    int biggest24516 = 0;
    if(ends[23]>=biggest24516){
      biggest24516=ends[23];
    }
    if(ends[24]>=biggest24516){
      biggest24516=ends[24];
    }
    if(biggest24516 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread24512(int [] tdone, int [] ends){
        S4829=1;
    thread24513(tdone,ends);
    thread24517(tdone,ends);
    thread24521(tdone,ends);
    int biggest24525 = 0;
    if(ends[22]>=biggest24525){
      biggest24525=ends[22];
    }
    if(ends[25]>=biggest24525){
      biggest24525=ends[25];
    }
    if(ends[28]>=biggest24525){
      biggest24525=ends[28];
    }
    if(biggest24525 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24525 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24525 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread24510(int [] tdone, int [] ends){
        S3614=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread24509(int [] tdone, int [] ends){
        S3611=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread24508(int [] tdone, int [] ends){
        S4530=1;
    S3615=0;
    thread24509(tdone,ends);
    thread24510(tdone,ends);
    int biggest24511 = 0;
    if(ends[17]>=biggest24511){
      biggest24511=ends[17];
    }
    if(ends[18]>=biggest24511){
      biggest24511=ends[18];
    }
    if(biggest24511 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread24504(int [] tdone, int [] ends){
        S4759=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cR_15);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S4759=0;
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread24503(int [] tdone, int [] ends){
        S4753=1;
    S4752=0;
    S4736=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4736=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      S4731=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4731=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[29]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4752=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
      else {
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
      }
    }
  }

  public void thread24502(int [] tdone, int [] ends){
        S4827=1;
    S4761=0;
    thread24503(tdone,ends);
    thread24504(tdone,ends);
    int biggest24505 = 0;
    if(ends[29]>=biggest24505){
      biggest24505=ends[29];
    }
    if(ends[30]>=biggest24505){
      biggest24505=ends[30];
    }
    if(biggest24505 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread24500(int [] tdone, int [] ends){
        S4660=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      fR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(fR_15);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S4660=0;
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread24499(int [] tdone, int [] ends){
        S4654=1;
    S4653=0;
    S4637=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4637=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4632=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4632=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[26]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4653=1;
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
      }
      else {
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
    }
  }

  public void thread24498(int [] tdone, int [] ends){
        S4728=1;
    S4662=0;
    thread24499(tdone,ends);
    thread24500(tdone,ends);
    int biggest24501 = 0;
    if(ends[26]>=biggest24501){
      biggest24501=ends[26];
    }
    if(ends[27]>=biggest24501){
      biggest24501=ends[27];
    }
    if(biggest24501 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread24496(int [] tdone, int [] ends){
        S4561=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cvR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cvR_15);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S4561=0;
      active[24]=0;
      ends[24]=0;
      tdone[24]=1;
    }
  }

  public void thread24495(int [] tdone, int [] ends){
        S4555=1;
    S4554=0;
    S4538=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4538=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4533=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4533=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[23]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4554=1;
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread24494(int [] tdone, int [] ends){
        S4629=1;
    S4563=0;
    thread24495(tdone,ends);
    thread24496(tdone,ends);
    int biggest24497 = 0;
    if(ends[23]>=biggest24497){
      biggest24497=ends[23];
    }
    if(ends[24]>=biggest24497){
      biggest24497=ends[24];
    }
    if(biggest24497 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread24493(int [] tdone, int [] ends){
        S4829=1;
    thread24494(tdone,ends);
    thread24498(tdone,ends);
    thread24502(tdone,ends);
    int biggest24506 = 0;
    if(ends[22]>=biggest24506){
      biggest24506=ends[22];
    }
    if(ends[25]>=biggest24506){
      biggest24506=ends[25];
    }
    if(ends[28]>=biggest24506){
      biggest24506=ends[28];
    }
    if(biggest24506 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24506 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24506 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread24491(int [] tdone, int [] ends){
        S3614=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread24490(int [] tdone, int [] ends){
        S3611=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread24489(int [] tdone, int [] ends){
        S4530=1;
    S3615=0;
    thread24490(tdone,ends);
    thread24491(tdone,ends);
    int biggest24492 = 0;
    if(ends[17]>=biggest24492){
      biggest24492=ends[17];
    }
    if(ends[18]>=biggest24492){
      biggest24492=ends[18];
    }
    if(biggest24492 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread24485(int [] tdone, int [] ends){
        S4759=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cR_15);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S4759=0;
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread24484(int [] tdone, int [] ends){
        S4753=1;
    S4752=0;
    S4736=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4736=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      S4731=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4731=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[29]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4752=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
      else {
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
      }
    }
  }

  public void thread24483(int [] tdone, int [] ends){
        S4827=1;
    S4761=0;
    thread24484(tdone,ends);
    thread24485(tdone,ends);
    int biggest24486 = 0;
    if(ends[29]>=biggest24486){
      biggest24486=ends[29];
    }
    if(ends[30]>=biggest24486){
      biggest24486=ends[30];
    }
    if(biggest24486 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread24481(int [] tdone, int [] ends){
        S4660=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      fR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(fR_15);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S4660=0;
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread24480(int [] tdone, int [] ends){
        S4654=1;
    S4653=0;
    S4637=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4637=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4632=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4632=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[26]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4653=1;
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
      }
      else {
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
    }
  }

  public void thread24479(int [] tdone, int [] ends){
        S4728=1;
    S4662=0;
    thread24480(tdone,ends);
    thread24481(tdone,ends);
    int biggest24482 = 0;
    if(ends[26]>=biggest24482){
      biggest24482=ends[26];
    }
    if(ends[27]>=biggest24482){
      biggest24482=ends[27];
    }
    if(biggest24482 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread24477(int [] tdone, int [] ends){
        S4561=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cvR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cvR_15);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S4561=0;
      active[24]=0;
      ends[24]=0;
      tdone[24]=1;
    }
  }

  public void thread24476(int [] tdone, int [] ends){
        S4555=1;
    S4554=0;
    S4538=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4538=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4533=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4533=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[23]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4554=1;
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread24475(int [] tdone, int [] ends){
        S4629=1;
    S4563=0;
    thread24476(tdone,ends);
    thread24477(tdone,ends);
    int biggest24478 = 0;
    if(ends[23]>=biggest24478){
      biggest24478=ends[23];
    }
    if(ends[24]>=biggest24478){
      biggest24478=ends[24];
    }
    if(biggest24478 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread24474(int [] tdone, int [] ends){
        S4829=1;
    thread24475(tdone,ends);
    thread24479(tdone,ends);
    thread24483(tdone,ends);
    int biggest24487 = 0;
    if(ends[22]>=biggest24487){
      biggest24487=ends[22];
    }
    if(ends[25]>=biggest24487){
      biggest24487=ends[25];
    }
    if(ends[28]>=biggest24487){
      biggest24487=ends[28];
    }
    if(biggest24487 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24487 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24487 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread24472(int [] tdone, int [] ends){
        S3614=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread24471(int [] tdone, int [] ends){
        S3611=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread24470(int [] tdone, int [] ends){
        S4530=1;
    S3615=0;
    thread24471(tdone,ends);
    thread24472(tdone,ends);
    int biggest24473 = 0;
    if(ends[17]>=biggest24473){
      biggest24473=ends[17];
    }
    if(ends[18]>=biggest24473){
      biggest24473=ends[18];
    }
    if(biggest24473 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread24466(int [] tdone, int [] ends){
        S4759=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cR_15);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S4759=0;
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread24465(int [] tdone, int [] ends){
        S4753=1;
    S4752=0;
    S4736=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4736=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      S4731=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4731=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[29]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4752=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
      else {
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
      }
    }
  }

  public void thread24464(int [] tdone, int [] ends){
        S4827=1;
    S4761=0;
    thread24465(tdone,ends);
    thread24466(tdone,ends);
    int biggest24467 = 0;
    if(ends[29]>=biggest24467){
      biggest24467=ends[29];
    }
    if(ends[30]>=biggest24467){
      biggest24467=ends[30];
    }
    if(biggest24467 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread24462(int [] tdone, int [] ends){
        S4660=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      fR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(fR_15);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S4660=0;
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread24461(int [] tdone, int [] ends){
        S4654=1;
    S4653=0;
    S4637=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4637=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4632=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4632=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[26]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4653=1;
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
      }
      else {
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
    }
  }

  public void thread24460(int [] tdone, int [] ends){
        S4728=1;
    S4662=0;
    thread24461(tdone,ends);
    thread24462(tdone,ends);
    int biggest24463 = 0;
    if(ends[26]>=biggest24463){
      biggest24463=ends[26];
    }
    if(ends[27]>=biggest24463){
      biggest24463=ends[27];
    }
    if(biggest24463 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread24458(int [] tdone, int [] ends){
        S4561=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cvR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cvR_15);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S4561=0;
      active[24]=0;
      ends[24]=0;
      tdone[24]=1;
    }
  }

  public void thread24457(int [] tdone, int [] ends){
        S4555=1;
    S4554=0;
    S4538=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4538=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4533=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4533=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[23]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4554=1;
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread24456(int [] tdone, int [] ends){
        S4629=1;
    S4563=0;
    thread24457(tdone,ends);
    thread24458(tdone,ends);
    int biggest24459 = 0;
    if(ends[23]>=biggest24459){
      biggest24459=ends[23];
    }
    if(ends[24]>=biggest24459){
      biggest24459=ends[24];
    }
    if(biggest24459 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread24455(int [] tdone, int [] ends){
        S4829=1;
    thread24456(tdone,ends);
    thread24460(tdone,ends);
    thread24464(tdone,ends);
    int biggest24468 = 0;
    if(ends[22]>=biggest24468){
      biggest24468=ends[22];
    }
    if(ends[25]>=biggest24468){
      biggest24468=ends[25];
    }
    if(ends[28]>=biggest24468){
      biggest24468=ends[28];
    }
    if(biggest24468 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24468 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24468 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread24453(int [] tdone, int [] ends){
        S3614=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread24452(int [] tdone, int [] ends){
        S3611=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread24451(int [] tdone, int [] ends){
        S4530=1;
    S3615=0;
    thread24452(tdone,ends);
    thread24453(tdone,ends);
    int biggest24454 = 0;
    if(ends[17]>=biggest24454){
      biggest24454=ends[17];
    }
    if(ends[18]>=biggest24454){
      biggest24454=ends[18];
    }
    if(biggest24454 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread24447(int [] tdone, int [] ends){
        S4759=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cR_15);
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S4759=0;
      active[30]=0;
      ends[30]=0;
      tdone[30]=1;
    }
  }

  public void thread24446(int [] tdone, int [] ends){
        S4753=1;
    S4752=0;
    S4736=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4736=1;
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
    else {
      S4731=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4731=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[29]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4752=1;
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
      }
      else {
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
      }
    }
  }

  public void thread24445(int [] tdone, int [] ends){
        S4827=1;
    S4761=0;
    thread24446(tdone,ends);
    thread24447(tdone,ends);
    int biggest24448 = 0;
    if(ends[29]>=biggest24448){
      biggest24448=ends[29];
    }
    if(ends[30]>=biggest24448){
      biggest24448=ends[30];
    }
    if(biggest24448 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread24443(int [] tdone, int [] ends){
        S4660=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      fR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(fR_15);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S4660=0;
      active[27]=0;
      ends[27]=0;
      tdone[27]=1;
    }
  }

  public void thread24442(int [] tdone, int [] ends){
        S4654=1;
    S4653=0;
    S4637=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4637=1;
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      S4632=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4632=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[26]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4653=1;
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
      }
      else {
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
    }
  }

  public void thread24441(int [] tdone, int [] ends){
        S4728=1;
    S4662=0;
    thread24442(tdone,ends);
    thread24443(tdone,ends);
    int biggest24444 = 0;
    if(ends[26]>=biggest24444){
      biggest24444=ends[26];
    }
    if(ends[27]>=biggest24444){
      biggest24444=ends[27];
    }
    if(biggest24444 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread24439(int [] tdone, int [] ends){
        S4561=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 59, column: 9
      cvR_15.setPresent();//sysj\conveyor_controller.sysj line: 59, column: 20
      currsigs.addElement(cvR_15);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S4561=0;
      active[24]=0;
      ends[24]=0;
      tdone[24]=1;
    }
  }

  public void thread24438(int [] tdone, int [] ends){
        S4555=1;
    S4554=0;
    S4538=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 57, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
      S4538=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S4533=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 57, column: 5
        S4533=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 57, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 57, column: 5
          ends[23]=2;
          ;//sysj\conveyor_controller.sysj line: 57, column: 5
          S4554=1;
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread24437(int [] tdone, int [] ends){
        S4629=1;
    S4563=0;
    thread24438(tdone,ends);
    thread24439(tdone,ends);
    int biggest24440 = 0;
    if(ends[23]>=biggest24440){
      biggest24440=ends[23];
    }
    if(ends[24]>=biggest24440){
      biggest24440=ends[24];
    }
    if(biggest24440 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread24436(int [] tdone, int [] ends){
        S4829=1;
    thread24437(tdone,ends);
    thread24441(tdone,ends);
    thread24445(tdone,ends);
    int biggest24449 = 0;
    if(ends[22]>=biggest24449){
      biggest24449=ends[22];
    }
    if(ends[25]>=biggest24449){
      biggest24449=ends[25];
    }
    if(ends[28]>=biggest24449){
      biggest24449=ends[28];
    }
    if(biggest24449 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24449 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest24449 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread24434(int [] tdone, int [] ends){
        S3614=1;
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread24433(int [] tdone, int [] ends){
        S3611=1;
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread24432(int [] tdone, int [] ends){
        S4530=1;
    S3615=0;
    thread24433(tdone,ends);
    thread24434(tdone,ends);
    int biggest24435 = 0;
    if(ends[17]>=biggest24435){
      biggest24435=ends[17];
    }
    if(ends[18]>=biggest24435){
      biggest24435=ends[18];
    }
    if(biggest24435 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S13377){
        case 0 : 
          S13377=0;
          break RUN;
        
        case 1 : 
          S13377=2;
          S13377=2;
          cvR_15.setClear();//sysj\conveyor_controller.sysj line: 176, column: 7
          fR_15.setClear();//sysj\conveyor_controller.sysj line: 176, column: 7
          cR_15.setClear();//sysj\conveyor_controller.sysj line: 176, column: 7
          S3476=0;
          S3372=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 177, column: 7
            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 177, column: 7
            S3372=1;
            active[15]=1;
            ends[15]=1;
            break RUN;
          }
          else {
            S3367=0;
            if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 177, column: 7
              convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 177, column: 7
              S3367=1;
              if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 177, column: 7
                convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 177, column: 7
                ends[15]=2;
                ;//sysj\conveyor_controller.sysj line: 177, column: 7
                S3476=1;
                S3394=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 178, column: 7
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 178, column: 7
                  S3394=1;
                  active[15]=1;
                  ends[15]=1;
                  break RUN;
                }
                else {
                  S3389=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 178, column: 7
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 178, column: 7
                    S3389=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 178, column: 7
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 178, column: 7
                      ends[15]=2;
                      ;//sysj\conveyor_controller.sysj line: 178, column: 7
                      S3476=2;
                      S3483=0;
                      if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 179, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                        S3483=1;
                        active[15]=1;
                        ends[15]=1;
                        break RUN;
                      }
                      else {
                        S3478=0;
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 179, column: 7
                          S3478=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                            ends[15]=2;
                            ;//sysj\conveyor_controller.sysj line: 179, column: 7
                            S3476=3;
                            thread24432(tdone,ends);
                            thread24436(tdone,ends);
                            int biggest24450 = 0;
                            if(ends[16]>=biggest24450){
                              biggest24450=ends[16];
                            }
                            if(ends[21]>=biggest24450){
                              biggest24450=ends[21];
                            }
                            if(biggest24450 == 1){
                              active[15]=1;
                              ends[15]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[15]=1;
                            ends[15]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[15]=1;
                          ends[15]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      active[15]=1;
                      ends[15]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[15]=1;
                    ends[15]=1;
                    break RUN;
                  }
                }
              }
              else {
                active[15]=1;
                ends[15]=1;
                break RUN;
              }
            }
            else {
              active[15]=1;
              ends[15]=1;
              break RUN;
            }
          }
        
        case 2 : 
          cvR_15.setClear();//sysj\conveyor_controller.sysj line: 176, column: 7
          fR_15.setClear();//sysj\conveyor_controller.sysj line: 176, column: 7
          cR_15.setClear();//sysj\conveyor_controller.sysj line: 176, column: 7
          switch(S3476){
            case 0 : 
              switch(S3372){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 177, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 177, column: 7
                    S3372=1;
                    active[15]=1;
                    ends[15]=1;
                    break RUN;
                  }
                  else {
                    switch(S3367){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 177, column: 7
                          convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 177, column: 7
                          S3367=1;
                          if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 177, column: 7
                            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 177, column: 7
                            ends[15]=2;
                            ;//sysj\conveyor_controller.sysj line: 177, column: 7
                            S3476=1;
                            S3394=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 178, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 178, column: 7
                              S3394=1;
                              active[15]=1;
                              ends[15]=1;
                              break RUN;
                            }
                            else {
                              S3389=0;
                              if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 178, column: 7
                                fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 178, column: 7
                                S3389=1;
                                if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 178, column: 7
                                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 178, column: 7
                                  ends[15]=2;
                                  ;//sysj\conveyor_controller.sysj line: 178, column: 7
                                  S3476=2;
                                  S3483=0;
                                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 179, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                                    S3483=1;
                                    active[15]=1;
                                    ends[15]=1;
                                    break RUN;
                                  }
                                  else {
                                    S3478=0;
                                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 179, column: 7
                                      S3478=1;
                                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                                        ends[15]=2;
                                        ;//sysj\conveyor_controller.sysj line: 179, column: 7
                                        S3476=3;
                                        thread24451(tdone,ends);
                                        thread24455(tdone,ends);
                                        int biggest24469 = 0;
                                        if(ends[16]>=biggest24469){
                                          biggest24469=ends[16];
                                        }
                                        if(ends[21]>=biggest24469){
                                          biggest24469=ends[21];
                                        }
                                        if(biggest24469 == 1){
                                          active[15]=1;
                                          ends[15]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[15]=1;
                                        ends[15]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[15]=1;
                                      ends[15]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[15]=1;
                                  ends[15]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[15]=1;
                                ends[15]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[15]=1;
                            ends[15]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[15]=1;
                          ends[15]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 177, column: 7
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 177, column: 7
                          ends[15]=2;
                          ;//sysj\conveyor_controller.sysj line: 177, column: 7
                          S3476=1;
                          S3394=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 178, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 178, column: 7
                            S3394=1;
                            active[15]=1;
                            ends[15]=1;
                            break RUN;
                          }
                          else {
                            S3389=0;
                            if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 178, column: 7
                              fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 178, column: 7
                              S3389=1;
                              if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 178, column: 7
                                fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 178, column: 7
                                ends[15]=2;
                                ;//sysj\conveyor_controller.sysj line: 178, column: 7
                                S3476=2;
                                S3483=0;
                                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 179, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                                  S3483=1;
                                  active[15]=1;
                                  ends[15]=1;
                                  break RUN;
                                }
                                else {
                                  S3478=0;
                                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 179, column: 7
                                    S3478=1;
                                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                                      ends[15]=2;
                                      ;//sysj\conveyor_controller.sysj line: 179, column: 7
                                      S3476=3;
                                      thread24470(tdone,ends);
                                      thread24474(tdone,ends);
                                      int biggest24488 = 0;
                                      if(ends[16]>=biggest24488){
                                        biggest24488=ends[16];
                                      }
                                      if(ends[21]>=biggest24488){
                                        biggest24488=ends[21];
                                      }
                                      if(biggest24488 == 1){
                                        active[15]=1;
                                        ends[15]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[15]=1;
                                      ends[15]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[15]=1;
                                    ends[15]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[15]=1;
                                ends[15]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[15]=1;
                              ends[15]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[15]=1;
                          ends[15]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3372=1;
                  S3372=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 177, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 177, column: 7
                    S3372=1;
                    active[15]=1;
                    ends[15]=1;
                    break RUN;
                  }
                  else {
                    S3367=0;
                    if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 177, column: 7
                      convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 177, column: 7
                      S3367=1;
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 177, column: 7
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 177, column: 7
                        ends[15]=2;
                        ;//sysj\conveyor_controller.sysj line: 177, column: 7
                        S3476=1;
                        S3394=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 178, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 178, column: 7
                          S3394=1;
                          active[15]=1;
                          ends[15]=1;
                          break RUN;
                        }
                        else {
                          S3389=0;
                          if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 178, column: 7
                            fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 178, column: 7
                            S3389=1;
                            if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 178, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 178, column: 7
                              ends[15]=2;
                              ;//sysj\conveyor_controller.sysj line: 178, column: 7
                              S3476=2;
                              S3483=0;
                              if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 179, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                                S3483=1;
                                active[15]=1;
                                ends[15]=1;
                                break RUN;
                              }
                              else {
                                S3478=0;
                                if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                                  capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 179, column: 7
                                  S3478=1;
                                  if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                                    ends[15]=2;
                                    ;//sysj\conveyor_controller.sysj line: 179, column: 7
                                    S3476=3;
                                    thread24489(tdone,ends);
                                    thread24493(tdone,ends);
                                    int biggest24507 = 0;
                                    if(ends[16]>=biggest24507){
                                      biggest24507=ends[16];
                                    }
                                    if(ends[21]>=biggest24507){
                                      biggest24507=ends[21];
                                    }
                                    if(biggest24507 == 1){
                                      active[15]=1;
                                      ends[15]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[15]=1;
                                    ends[15]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[15]=1;
                                  ends[15]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              active[15]=1;
                              ends[15]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[15]=1;
                            ends[15]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[15]=1;
                      ends[15]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S3394){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 178, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 178, column: 7
                    S3394=1;
                    active[15]=1;
                    ends[15]=1;
                    break RUN;
                  }
                  else {
                    switch(S3389){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 178, column: 7
                          fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 178, column: 7
                          S3389=1;
                          if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 178, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 178, column: 7
                            ends[15]=2;
                            ;//sysj\conveyor_controller.sysj line: 178, column: 7
                            S3476=2;
                            S3483=0;
                            if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 179, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                              S3483=1;
                              active[15]=1;
                              ends[15]=1;
                              break RUN;
                            }
                            else {
                              S3478=0;
                              if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                                capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 179, column: 7
                                S3478=1;
                                if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                                  ends[15]=2;
                                  ;//sysj\conveyor_controller.sysj line: 179, column: 7
                                  S3476=3;
                                  thread24508(tdone,ends);
                                  thread24512(tdone,ends);
                                  int biggest24526 = 0;
                                  if(ends[16]>=biggest24526){
                                    biggest24526=ends[16];
                                  }
                                  if(ends[21]>=biggest24526){
                                    biggest24526=ends[21];
                                  }
                                  if(biggest24526 == 1){
                                    active[15]=1;
                                    ends[15]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[15]=1;
                                  ends[15]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[15]=1;
                                ends[15]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[15]=1;
                            ends[15]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[15]=1;
                          ends[15]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 178, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 178, column: 7
                          ends[15]=2;
                          ;//sysj\conveyor_controller.sysj line: 178, column: 7
                          S3476=2;
                          S3483=0;
                          if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 179, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                            S3483=1;
                            active[15]=1;
                            ends[15]=1;
                            break RUN;
                          }
                          else {
                            S3478=0;
                            if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                              capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 179, column: 7
                              S3478=1;
                              if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                                ends[15]=2;
                                ;//sysj\conveyor_controller.sysj line: 179, column: 7
                                S3476=3;
                                thread24527(tdone,ends);
                                thread24531(tdone,ends);
                                int biggest24545 = 0;
                                if(ends[16]>=biggest24545){
                                  biggest24545=ends[16];
                                }
                                if(ends[21]>=biggest24545){
                                  biggest24545=ends[21];
                                }
                                if(biggest24545 == 1){
                                  active[15]=1;
                                  ends[15]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[15]=1;
                                ends[15]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[15]=1;
                              ends[15]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[15]=1;
                          ends[15]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3394=1;
                  S3394=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 178, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 178, column: 7
                    S3394=1;
                    active[15]=1;
                    ends[15]=1;
                    break RUN;
                  }
                  else {
                    S3389=0;
                    if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 178, column: 7
                      fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 178, column: 7
                      S3389=1;
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 178, column: 7
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 178, column: 7
                        ends[15]=2;
                        ;//sysj\conveyor_controller.sysj line: 178, column: 7
                        S3476=2;
                        S3483=0;
                        if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 179, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                          S3483=1;
                          active[15]=1;
                          ends[15]=1;
                          break RUN;
                        }
                        else {
                          S3478=0;
                          if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                            capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 179, column: 7
                            S3478=1;
                            if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                              ends[15]=2;
                              ;//sysj\conveyor_controller.sysj line: 179, column: 7
                              S3476=3;
                              thread24546(tdone,ends);
                              thread24550(tdone,ends);
                              int biggest24564 = 0;
                              if(ends[16]>=biggest24564){
                                biggest24564=ends[16];
                              }
                              if(ends[21]>=biggest24564){
                                biggest24564=ends[21];
                              }
                              if(biggest24564 == 1){
                                active[15]=1;
                                ends[15]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[15]=1;
                              ends[15]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[15]=1;
                            ends[15]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[15]=1;
                      ends[15]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 2 : 
              switch(S3483){
                case 0 : 
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 179, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                    S3483=1;
                    active[15]=1;
                    ends[15]=1;
                    break RUN;
                  }
                  else {
                    switch(S3478){
                      case 0 : 
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 179, column: 7
                          S3478=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                            ends[15]=2;
                            ;//sysj\conveyor_controller.sysj line: 179, column: 7
                            S3476=3;
                            thread24565(tdone,ends);
                            thread24569(tdone,ends);
                            int biggest24583 = 0;
                            if(ends[16]>=biggest24583){
                              biggest24583=ends[16];
                            }
                            if(ends[21]>=biggest24583){
                              biggest24583=ends[21];
                            }
                            if(biggest24583 == 1){
                              active[15]=1;
                              ends[15]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[15]=1;
                            ends[15]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[15]=1;
                          ends[15]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                          ends[15]=2;
                          ;//sysj\conveyor_controller.sysj line: 179, column: 7
                          S3476=3;
                          thread24584(tdone,ends);
                          thread24588(tdone,ends);
                          int biggest24602 = 0;
                          if(ends[16]>=biggest24602){
                            biggest24602=ends[16];
                          }
                          if(ends[21]>=biggest24602){
                            biggest24602=ends[21];
                          }
                          if(biggest24602 == 1){
                            active[15]=1;
                            ends[15]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[15]=1;
                          ends[15]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3483=1;
                  S3483=0;
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 179, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                    S3483=1;
                    active[15]=1;
                    ends[15]=1;
                    break RUN;
                  }
                  else {
                    S3478=0;
                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 179, column: 7
                      S3478=1;
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 179, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 179, column: 7
                        ends[15]=2;
                        ;//sysj\conveyor_controller.sysj line: 179, column: 7
                        S3476=3;
                        thread24603(tdone,ends);
                        thread24607(tdone,ends);
                        int biggest24621 = 0;
                        if(ends[16]>=biggest24621){
                          biggest24621=ends[16];
                        }
                        if(ends[21]>=biggest24621){
                          biggest24621=ends[21];
                        }
                        if(biggest24621 == 1){
                          active[15]=1;
                          ends[15]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[15]=1;
                      ends[15]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 3 : 
              thread24622(tdone,ends);
              thread24650(tdone,ends);
              int biggest24673 = 0;
              if(ends[16]>=biggest24673){
                biggest24673=ends[16];
              }
              if(ends[21]>=biggest24673){
                biggest24673=ends[21];
              }
              if(biggest24673 == 1){
                active[15]=1;
                ends[15]=1;
                break RUN;
              }
              //FINXME code
              if(biggest24673 == 0){
                S13377=0;
                active[15]=0;
                ends[15]=0;
                S13377=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    cvR_15 = new Signal();
    fR_15 = new Signal();
    cR_15 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[15] != 0){
      int index = 15;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[15]!=0 || suspended[15]!=0 || active[15]!=1);
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
      cvR_15.setpreclear();
      fR_15.setpreclear();
      cR_15.setpreclear();
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
      cvR_15.setClear();
      fR_15.setClear();
      cR_15.setClear();
      convReady_in.sethook();
      fillerReady_in.sethook();
      capperReady_in.sethook();
      rotated_o.sethook();
      if(paused[15]!=0 || suspended[15]!=0 || active[15]!=1);
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
      if(active[15] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

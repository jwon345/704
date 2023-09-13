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
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public input_Channel convReady_in = new input_Channel();
  public input_Channel fillerReady_in = new input_Channel();
  public input_Channel capperReady_in = new input_Channel();
  public input_Channel lidLoaderReady_in = new input_Channel();
  public input_Channel smokeReady_in = new input_Channel();
  public input_Channel checkFive_in = new input_Channel();
  public input_Channel checkOne_in = new input_Channel();
  public output_Channel rotated_o = new output_Channel();
  private Signal cvR_26;
  private Signal fR_26;
  private Signal cR_26;
  private Signal lR_26;
  private Signal sR_26;
  private Signal bottleAtPos5_26;
  private Signal bottleAtPos1_26;
  private long __start_thread_34;//sysj\conveyor_controller.sysj line: 298, column: 44
  private long __start_thread_27;//sysj\conveyor_controller.sysj line: 251, column: 7
  private int i_thread_27;//sysj\conveyor_controller.sysj line: 308, column: 13
  private int S52196 = 1;
  private int S3787 = 1;
  private int S3683 = 1;
  private int S3678 = 1;
  private int S3705 = 1;
  private int S3700 = 1;
  private int S3794 = 1;
  private int S3789 = 1;
  private int S3926 = 1;
  private int S3921 = 1;
  private int S4102 = 1;
  private int S4097 = 1;
  private int S7566 = 1;
  private int S4331 = 1;
  private int S4318 = 1;
  private int S4321 = 1;
  private int S4324 = 1;
  private int S4327 = 1;
  private int S4330 = 1;
  private int S4345 = 1;
  private int S4368 = 1;
  private int S4384 = 1;
  private int S4487 = 1;
  private int S4482 = 1;
  private int S8063 = 1;
  private int S7665 = 1;
  private int S7599 = 1;
  private int S7591 = 1;
  private int S7590 = 1;
  private int S7574 = 1;
  private int S7569 = 1;
  private int S7597 = 1;
  private int S7764 = 1;
  private int S7698 = 1;
  private int S7690 = 1;
  private int S7689 = 1;
  private int S7673 = 1;
  private int S7668 = 1;
  private int S7696 = 1;
  private int S7863 = 1;
  private int S7797 = 1;
  private int S7789 = 1;
  private int S7788 = 1;
  private int S7772 = 1;
  private int S7767 = 1;
  private int S7795 = 1;
  private int S7962 = 1;
  private int S7896 = 1;
  private int S7888 = 1;
  private int S7887 = 1;
  private int S7871 = 1;
  private int S7866 = 1;
  private int S7894 = 1;
  private int S8061 = 1;
  private int S7995 = 1;
  private int S7987 = 1;
  private int S7986 = 1;
  private int S7970 = 1;
  private int S7965 = 1;
  private int S7993 = 1;
  private int S8146 = 1;
  private int S8090 = 1;
  private int S8070 = 1;
  private int S8065 = 1;
  private int S8184 = 1;
  private int S8158 = 1;
  private int S8151 = 1;
  private int S8154 = 1;
  private int S8267 = 1;
  private int S8211 = 1;
  private int S8191 = 1;
  private int S8186 = 1;
  private int S8305 = 1;
  private int S8279 = 1;
  private int S8272 = 1;
  private int S8275 = 1;
  
  private int[] ends = new int[109];
  private int[] tdone = new int[109];
  
  public void thread201781(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201780(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201778(int [] tdone, int [] ends){
        switch(S8275){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_controller.sysj line: 398, column: 29
          ends[58]=2;
          tdone[58]=1;
        }
        else {
          active[58]=1;
          ends[58]=1;
          tdone[58]=1;
        }
        break;
      
    }
  }

  public void thread201777(int [] tdone, int [] ends){
        switch(S8272){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
        currsigs.addElement(bottleAtPos1E);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
        break;
      
    }
  }

  public void thread201776(int [] tdone, int [] ends){
        switch(S8305){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        switch(S8279){
          case 0 : 
            thread201777(tdone,ends);
            thread201778(tdone,ends);
            int biggest201779 = 0;
            if(ends[57]>=biggest201779){
              biggest201779=ends[57];
            }
            if(ends[58]>=biggest201779){
              biggest201779=ends[58];
            }
            if(biggest201779 == 1){
              active[56]=1;
              ends[56]=1;
              tdone[56]=1;
            }
            if(biggest201779 == 2){
              ends[56]=2;
              ;//sysj\conveyor_controller.sysj line: 392, column: 34
              S8279=1;
              active[56]=1;
              ends[56]=1;
              tdone[56]=1;
            }
            //FINXME code
            if(biggest201779 == 0){
              ;//sysj\conveyor_controller.sysj line: 400, column: 20
              S8279=1;
              active[56]=1;
              ends[56]=1;
              tdone[56]=1;
            }
            break;
          
          case 1 : 
            S8279=1;
            S8279=0;
            if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
              thread201780(tdone,ends);
              thread201781(tdone,ends);
              int biggest201782 = 0;
              if(ends[57]>=biggest201782){
                biggest201782=ends[57];
              }
              if(ends[58]>=biggest201782){
                biggest201782=ends[58];
              }
              if(biggest201782 == 1){
                active[56]=1;
                ends[56]=1;
                tdone[56]=1;
              }
            }
            else {
              S8279=1;
              active[56]=1;
              ends[56]=1;
              tdone[56]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread201775(int [] tdone, int [] ends){
        switch(S8267){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        switch(S8211){
          case 0 : 
            switch(S8191){
              case 0 : 
                if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
                  checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
                  S8191=1;
                  active[55]=1;
                  ends[55]=1;
                  tdone[55]=1;
                }
                else {
                  switch(S8186){
                    case 0 : 
                      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
                        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
                        S8186=1;
                        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
                          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
                          ends[55]=2;
                          ;//sysj\conveyor_controller.sysj line: 377, column: 7
                          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
                            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
                            currsigs.addElement(bottleAtPos1_26);
                            S8211=1;
                            active[55]=1;
                            ends[55]=1;
                            tdone[55]=1;
                          }
                          else {
                            S8211=1;
                            active[55]=1;
                            ends[55]=1;
                            tdone[55]=1;
                          }
                        }
                        else {
                          active[55]=1;
                          ends[55]=1;
                          tdone[55]=1;
                        }
                      }
                      else {
                        active[55]=1;
                        ends[55]=1;
                        tdone[55]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
                        checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
                        ends[55]=2;
                        ;//sysj\conveyor_controller.sysj line: 377, column: 7
                        if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
                          bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
                          currsigs.addElement(bottleAtPos1_26);
                          S8211=1;
                          active[55]=1;
                          ends[55]=1;
                          tdone[55]=1;
                        }
                        else {
                          S8211=1;
                          active[55]=1;
                          ends[55]=1;
                          tdone[55]=1;
                        }
                      }
                      else {
                        active[55]=1;
                        ends[55]=1;
                        tdone[55]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S8191=1;
                S8191=0;
                if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
                  checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
                  S8191=1;
                  active[55]=1;
                  ends[55]=1;
                  tdone[55]=1;
                }
                else {
                  S8186=0;
                  if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
                    checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
                    S8186=1;
                    if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
                      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
                      ends[55]=2;
                      ;//sysj\conveyor_controller.sysj line: 377, column: 7
                      if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
                        bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
                        currsigs.addElement(bottleAtPos1_26);
                        S8211=1;
                        active[55]=1;
                        ends[55]=1;
                        tdone[55]=1;
                      }
                      else {
                        S8211=1;
                        active[55]=1;
                        ends[55]=1;
                        tdone[55]=1;
                      }
                    }
                    else {
                      active[55]=1;
                      ends[55]=1;
                      tdone[55]=1;
                    }
                  }
                  else {
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S8211=1;
            S8211=0;
            S8191=0;
            if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
              checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
              S8191=1;
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            else {
              S8186=0;
              if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
                checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
                S8186=1;
                if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
                  checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
                  ends[55]=2;
                  ;//sysj\conveyor_controller.sysj line: 377, column: 7
                  if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
                    bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
                    currsigs.addElement(bottleAtPos1_26);
                    S8211=1;
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                  else {
                    S8211=1;
                    active[55]=1;
                    ends[55]=1;
                    tdone[55]=1;
                  }
                }
                else {
                  active[55]=1;
                  ends[55]=1;
                  tdone[55]=1;
                }
              }
              else {
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread201773(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201772(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201770(int [] tdone, int [] ends){
        switch(S8154){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_controller.sysj line: 361, column: 29
          ends[54]=2;
          tdone[54]=1;
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
        break;
      
    }
  }

  public void thread201769(int [] tdone, int [] ends){
        switch(S8151){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
        currsigs.addElement(bottleAtPos5E);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread201768(int [] tdone, int [] ends){
        switch(S8184){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        switch(S8158){
          case 0 : 
            thread201769(tdone,ends);
            thread201770(tdone,ends);
            int biggest201771 = 0;
            if(ends[53]>=biggest201771){
              biggest201771=ends[53];
            }
            if(ends[54]>=biggest201771){
              biggest201771=ends[54];
            }
            if(biggest201771 == 1){
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            if(biggest201771 == 2){
              ends[52]=2;
              ;//sysj\conveyor_controller.sysj line: 355, column: 34
              S8158=1;
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            //FINXME code
            if(biggest201771 == 0){
              ;//sysj\conveyor_controller.sysj line: 363, column: 20
              S8158=1;
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 1 : 
            S8158=1;
            S8158=0;
            if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
              thread201772(tdone,ends);
              thread201773(tdone,ends);
              int biggest201774 = 0;
              if(ends[53]>=biggest201774){
                biggest201774=ends[53];
              }
              if(ends[54]>=biggest201774){
                biggest201774=ends[54];
              }
              if(biggest201774 == 1){
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
            }
            else {
              S8158=1;
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread201767(int [] tdone, int [] ends){
        switch(S8146){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        switch(S8090){
          case 0 : 
            switch(S8070){
              case 0 : 
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
                  S8070=1;
                  active[51]=1;
                  ends[51]=1;
                  tdone[51]=1;
                }
                else {
                  switch(S8065){
                    case 0 : 
                      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
                        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
                        S8065=1;
                        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
                          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
                          ends[51]=2;
                          ;//sysj\conveyor_controller.sysj line: 339, column: 7
                          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
                            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
                            currsigs.addElement(bottleAtPos5_26);
                            S8090=1;
                            active[51]=1;
                            ends[51]=1;
                            tdone[51]=1;
                          }
                          else {
                            S8090=1;
                            active[51]=1;
                            ends[51]=1;
                            tdone[51]=1;
                          }
                        }
                        else {
                          active[51]=1;
                          ends[51]=1;
                          tdone[51]=1;
                        }
                      }
                      else {
                        active[51]=1;
                        ends[51]=1;
                        tdone[51]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
                        checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
                        ends[51]=2;
                        ;//sysj\conveyor_controller.sysj line: 339, column: 7
                        if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
                          bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
                          currsigs.addElement(bottleAtPos5_26);
                          S8090=1;
                          active[51]=1;
                          ends[51]=1;
                          tdone[51]=1;
                        }
                        else {
                          S8090=1;
                          active[51]=1;
                          ends[51]=1;
                          tdone[51]=1;
                        }
                      }
                      else {
                        active[51]=1;
                        ends[51]=1;
                        tdone[51]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S8070=1;
                S8070=0;
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
                  S8070=1;
                  active[51]=1;
                  ends[51]=1;
                  tdone[51]=1;
                }
                else {
                  S8065=0;
                  if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
                    checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
                    S8065=1;
                    if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
                      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
                      ends[51]=2;
                      ;//sysj\conveyor_controller.sysj line: 339, column: 7
                      if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
                        bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
                        currsigs.addElement(bottleAtPos5_26);
                        S8090=1;
                        active[51]=1;
                        ends[51]=1;
                        tdone[51]=1;
                      }
                      else {
                        S8090=1;
                        active[51]=1;
                        ends[51]=1;
                        tdone[51]=1;
                      }
                    }
                    else {
                      active[51]=1;
                      ends[51]=1;
                      tdone[51]=1;
                    }
                  }
                  else {
                    active[51]=1;
                    ends[51]=1;
                    tdone[51]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S8090=1;
            S8090=0;
            S8070=0;
            if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
              checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
              S8070=1;
              active[51]=1;
              ends[51]=1;
              tdone[51]=1;
            }
            else {
              S8065=0;
              if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
                checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
                S8065=1;
                if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
                  ends[51]=2;
                  ;//sysj\conveyor_controller.sysj line: 339, column: 7
                  if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
                    bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
                    currsigs.addElement(bottleAtPos5_26);
                    S8090=1;
                    active[51]=1;
                    ends[51]=1;
                    tdone[51]=1;
                  }
                  else {
                    S8090=1;
                    active[51]=1;
                    ends[51]=1;
                    tdone[51]=1;
                  }
                }
                else {
                  active[51]=1;
                  ends[51]=1;
                  tdone[51]=1;
                }
              }
              else {
                active[51]=1;
                ends[51]=1;
                tdone[51]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread201764(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201763(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201761(int [] tdone, int [] ends){
        switch(S7993){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
        currsigs.addElement(sR_26);
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
        break;
      
    }
  }

  public void thread201760(int [] tdone, int [] ends){
        switch(S7987){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        switch(S7986){
          case 0 : 
            switch(S7970){
              case 0 : 
                if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
                  smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                  S7970=1;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  switch(S7965){
                    case 0 : 
                      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
                        S7965=1;
                        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                          ends[49]=2;
                          ;//sysj\conveyor_controller.sysj line: 78, column: 5
                          S7986=1;
                          active[49]=1;
                          ends[49]=1;
                          tdone[49]=1;
                        }
                        else {
                          active[49]=1;
                          ends[49]=1;
                          tdone[49]=1;
                        }
                      }
                      else {
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                        smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                        ends[49]=2;
                        ;//sysj\conveyor_controller.sysj line: 78, column: 5
                        S7986=1;
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                      else {
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7970=1;
                S7970=0;
                if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
                  smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                  S7970=1;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  S7965=0;
                  if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                    smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
                    S7965=1;
                    if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                      ends[49]=2;
                      ;//sysj\conveyor_controller.sysj line: 78, column: 5
                      S7986=1;
                      active[49]=1;
                      ends[49]=1;
                      tdone[49]=1;
                    }
                    else {
                      active[49]=1;
                      ends[49]=1;
                      tdone[49]=1;
                    }
                  }
                  else {
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S7986=1;
            S7986=2;
            active[49]=1;
            ends[49]=1;
            tdone[49]=1;
            break;
          
          case 2 : 
            S7986=2;
            smokeReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 78, column: 36
            ends[49]=2;
            tdone[49]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread201759(int [] tdone, int [] ends){
        switch(S8061){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        switch(S7995){
          case 0 : 
            thread201760(tdone,ends);
            thread201761(tdone,ends);
            int biggest201762 = 0;
            if(ends[49]>=biggest201762){
              biggest201762=ends[49];
            }
            if(ends[50]>=biggest201762){
              biggest201762=ends[50];
            }
            if(biggest201762 == 1){
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            if(biggest201762 == 2){
              ends[48]=2;
              ;//sysj\conveyor_controller.sysj line: 77, column: 3
              S7995=1;
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            //FINXME code
            if(biggest201762 == 0){
              S7995=1;
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            break;
          
          case 1 : 
            S7995=1;
            S7995=0;
            thread201763(tdone,ends);
            thread201764(tdone,ends);
            int biggest201765 = 0;
            if(ends[49]>=biggest201765){
              biggest201765=ends[49];
            }
            if(ends[50]>=biggest201765){
              biggest201765=ends[50];
            }
            if(biggest201765 == 1){
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread201757(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201756(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201754(int [] tdone, int [] ends){
        switch(S7894){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
        currsigs.addElement(lR_26);
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
        break;
      
    }
  }

  public void thread201753(int [] tdone, int [] ends){
        switch(S7888){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        switch(S7887){
          case 0 : 
            switch(S7871){
              case 0 : 
                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                  S7871=1;
                  active[46]=1;
                  ends[46]=1;
                  tdone[46]=1;
                }
                else {
                  switch(S7866){
                    case 0 : 
                      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
                        S7866=1;
                        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                          ends[46]=2;
                          ;//sysj\conveyor_controller.sysj line: 78, column: 5
                          S7887=1;
                          active[46]=1;
                          ends[46]=1;
                          tdone[46]=1;
                        }
                        else {
                          active[46]=1;
                          ends[46]=1;
                          tdone[46]=1;
                        }
                      }
                      else {
                        active[46]=1;
                        ends[46]=1;
                        tdone[46]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                        ends[46]=2;
                        ;//sysj\conveyor_controller.sysj line: 78, column: 5
                        S7887=1;
                        active[46]=1;
                        ends[46]=1;
                        tdone[46]=1;
                      }
                      else {
                        active[46]=1;
                        ends[46]=1;
                        tdone[46]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7871=1;
                S7871=0;
                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                  S7871=1;
                  active[46]=1;
                  ends[46]=1;
                  tdone[46]=1;
                }
                else {
                  S7866=0;
                  if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                    lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
                    S7866=1;
                    if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                      ends[46]=2;
                      ;//sysj\conveyor_controller.sysj line: 78, column: 5
                      S7887=1;
                      active[46]=1;
                      ends[46]=1;
                      tdone[46]=1;
                    }
                    else {
                      active[46]=1;
                      ends[46]=1;
                      tdone[46]=1;
                    }
                  }
                  else {
                    active[46]=1;
                    ends[46]=1;
                    tdone[46]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S7887=1;
            S7887=2;
            active[46]=1;
            ends[46]=1;
            tdone[46]=1;
            break;
          
          case 2 : 
            S7887=2;
            lidLoaderReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 78, column: 36
            ends[46]=2;
            tdone[46]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread201752(int [] tdone, int [] ends){
        switch(S7962){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S7896){
          case 0 : 
            thread201753(tdone,ends);
            thread201754(tdone,ends);
            int biggest201755 = 0;
            if(ends[46]>=biggest201755){
              biggest201755=ends[46];
            }
            if(ends[47]>=biggest201755){
              biggest201755=ends[47];
            }
            if(biggest201755 == 1){
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            if(biggest201755 == 2){
              ends[45]=2;
              ;//sysj\conveyor_controller.sysj line: 77, column: 3
              S7896=1;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            //FINXME code
            if(biggest201755 == 0){
              S7896=1;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
          case 1 : 
            S7896=1;
            S7896=0;
            thread201756(tdone,ends);
            thread201757(tdone,ends);
            int biggest201758 = 0;
            if(ends[46]>=biggest201758){
              biggest201758=ends[46];
            }
            if(ends[47]>=biggest201758){
              biggest201758=ends[47];
            }
            if(biggest201758 == 1){
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread201750(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201749(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201747(int [] tdone, int [] ends){
        switch(S7795){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
        currsigs.addElement(cR_26);
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
        break;
      
    }
  }

  public void thread201746(int [] tdone, int [] ends){
        switch(S7789){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        switch(S7788){
          case 0 : 
            switch(S7772){
              case 0 : 
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                  S7772=1;
                  active[43]=1;
                  ends[43]=1;
                  tdone[43]=1;
                }
                else {
                  switch(S7767){
                    case 0 : 
                      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
                        S7767=1;
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                          ends[43]=2;
                          ;//sysj\conveyor_controller.sysj line: 78, column: 5
                          S7788=1;
                          active[43]=1;
                          ends[43]=1;
                          tdone[43]=1;
                        }
                        else {
                          active[43]=1;
                          ends[43]=1;
                          tdone[43]=1;
                        }
                      }
                      else {
                        active[43]=1;
                        ends[43]=1;
                        tdone[43]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                        ends[43]=2;
                        ;//sysj\conveyor_controller.sysj line: 78, column: 5
                        S7788=1;
                        active[43]=1;
                        ends[43]=1;
                        tdone[43]=1;
                      }
                      else {
                        active[43]=1;
                        ends[43]=1;
                        tdone[43]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7772=1;
                S7772=0;
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                  S7772=1;
                  active[43]=1;
                  ends[43]=1;
                  tdone[43]=1;
                }
                else {
                  S7767=0;
                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
                    S7767=1;
                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                      ends[43]=2;
                      ;//sysj\conveyor_controller.sysj line: 78, column: 5
                      S7788=1;
                      active[43]=1;
                      ends[43]=1;
                      tdone[43]=1;
                    }
                    else {
                      active[43]=1;
                      ends[43]=1;
                      tdone[43]=1;
                    }
                  }
                  else {
                    active[43]=1;
                    ends[43]=1;
                    tdone[43]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S7788=1;
            S7788=2;
            active[43]=1;
            ends[43]=1;
            tdone[43]=1;
            break;
          
          case 2 : 
            S7788=2;
            capperReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 78, column: 36
            ends[43]=2;
            tdone[43]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread201745(int [] tdone, int [] ends){
        switch(S7863){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S7797){
          case 0 : 
            thread201746(tdone,ends);
            thread201747(tdone,ends);
            int biggest201748 = 0;
            if(ends[43]>=biggest201748){
              biggest201748=ends[43];
            }
            if(ends[44]>=biggest201748){
              biggest201748=ends[44];
            }
            if(biggest201748 == 1){
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            if(biggest201748 == 2){
              ends[42]=2;
              ;//sysj\conveyor_controller.sysj line: 77, column: 3
              S7797=1;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            //FINXME code
            if(biggest201748 == 0){
              S7797=1;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
          case 1 : 
            S7797=1;
            S7797=0;
            thread201749(tdone,ends);
            thread201750(tdone,ends);
            int biggest201751 = 0;
            if(ends[43]>=biggest201751){
              biggest201751=ends[43];
            }
            if(ends[44]>=biggest201751){
              biggest201751=ends[44];
            }
            if(biggest201751 == 1){
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread201743(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201742(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201740(int [] tdone, int [] ends){
        switch(S7696){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
        currsigs.addElement(fR_26);
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
        break;
      
    }
  }

  public void thread201739(int [] tdone, int [] ends){
        switch(S7690){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        switch(S7689){
          case 0 : 
            switch(S7673){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                  S7673=1;
                  active[40]=1;
                  ends[40]=1;
                  tdone[40]=1;
                }
                else {
                  switch(S7668){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
                        S7668=1;
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                          ends[40]=2;
                          ;//sysj\conveyor_controller.sysj line: 78, column: 5
                          S7689=1;
                          active[40]=1;
                          ends[40]=1;
                          tdone[40]=1;
                        }
                        else {
                          active[40]=1;
                          ends[40]=1;
                          tdone[40]=1;
                        }
                      }
                      else {
                        active[40]=1;
                        ends[40]=1;
                        tdone[40]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                        ends[40]=2;
                        ;//sysj\conveyor_controller.sysj line: 78, column: 5
                        S7689=1;
                        active[40]=1;
                        ends[40]=1;
                        tdone[40]=1;
                      }
                      else {
                        active[40]=1;
                        ends[40]=1;
                        tdone[40]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7673=1;
                S7673=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                  S7673=1;
                  active[40]=1;
                  ends[40]=1;
                  tdone[40]=1;
                }
                else {
                  S7668=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
                    S7668=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                      ends[40]=2;
                      ;//sysj\conveyor_controller.sysj line: 78, column: 5
                      S7689=1;
                      active[40]=1;
                      ends[40]=1;
                      tdone[40]=1;
                    }
                    else {
                      active[40]=1;
                      ends[40]=1;
                      tdone[40]=1;
                    }
                  }
                  else {
                    active[40]=1;
                    ends[40]=1;
                    tdone[40]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S7689=1;
            S7689=2;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
            break;
          
          case 2 : 
            S7689=2;
            fillerReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 78, column: 36
            ends[40]=2;
            tdone[40]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread201738(int [] tdone, int [] ends){
        switch(S7764){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S7698){
          case 0 : 
            thread201739(tdone,ends);
            thread201740(tdone,ends);
            int biggest201741 = 0;
            if(ends[40]>=biggest201741){
              biggest201741=ends[40];
            }
            if(ends[41]>=biggest201741){
              biggest201741=ends[41];
            }
            if(biggest201741 == 1){
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            if(biggest201741 == 2){
              ends[39]=2;
              ;//sysj\conveyor_controller.sysj line: 77, column: 3
              S7698=1;
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            //FINXME code
            if(biggest201741 == 0){
              S7698=1;
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
          case 1 : 
            S7698=1;
            S7698=0;
            thread201742(tdone,ends);
            thread201743(tdone,ends);
            int biggest201744 = 0;
            if(ends[40]>=biggest201744){
              biggest201744=ends[40];
            }
            if(ends[41]>=biggest201744){
              biggest201744=ends[41];
            }
            if(biggest201744 == 1){
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread201736(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201735(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201733(int [] tdone, int [] ends){
        switch(S7597){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
        currsigs.addElement(cvR_26);
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
        break;
      
    }
  }

  public void thread201732(int [] tdone, int [] ends){
        switch(S7591){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S7590){
          case 0 : 
            switch(S7574){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                  S7574=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  switch(S7569){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
                        S7569=1;
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                          ends[37]=2;
                          ;//sysj\conveyor_controller.sysj line: 78, column: 5
                          S7590=1;
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                        else {
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                      }
                      else {
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                        ends[37]=2;
                        ;//sysj\conveyor_controller.sysj line: 78, column: 5
                        S7590=1;
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      else {
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7574=1;
                S7574=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                  S7574=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  S7569=0;
                  if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                    convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
                    S7569=1;
                    if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
                      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
                      ends[37]=2;
                      ;//sysj\conveyor_controller.sysj line: 78, column: 5
                      S7590=1;
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                    else {
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S7590=1;
            S7590=2;
            active[37]=1;
            ends[37]=1;
            tdone[37]=1;
            break;
          
          case 2 : 
            S7590=2;
            convReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 78, column: 36
            ends[37]=2;
            tdone[37]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread201731(int [] tdone, int [] ends){
        switch(S7665){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        switch(S7599){
          case 0 : 
            thread201732(tdone,ends);
            thread201733(tdone,ends);
            int biggest201734 = 0;
            if(ends[37]>=biggest201734){
              biggest201734=ends[37];
            }
            if(ends[38]>=biggest201734){
              biggest201734=ends[38];
            }
            if(biggest201734 == 1){
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            if(biggest201734 == 2){
              ends[36]=2;
              ;//sysj\conveyor_controller.sysj line: 77, column: 3
              S7599=1;
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            //FINXME code
            if(biggest201734 == 0){
              S7599=1;
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            break;
          
          case 1 : 
            S7599=1;
            S7599=0;
            thread201735(tdone,ends);
            thread201736(tdone,ends);
            int biggest201737 = 0;
            if(ends[37]>=biggest201737){
              biggest201737=ends[37];
            }
            if(ends[38]>=biggest201737){
              biggest201737=ends[38];
            }
            if(biggest201737 == 1){
              active[36]=1;
              ends[36]=1;
              tdone[36]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread201730(int [] tdone, int [] ends){
        switch(S8063){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        thread201731(tdone,ends);
        thread201738(tdone,ends);
        thread201745(tdone,ends);
        thread201752(tdone,ends);
        thread201759(tdone,ends);
        int biggest201766 = 0;
        if(ends[36]>=biggest201766){
          biggest201766=ends[36];
        }
        if(ends[39]>=biggest201766){
          biggest201766=ends[39];
        }
        if(ends[42]>=biggest201766){
          biggest201766=ends[42];
        }
        if(ends[45]>=biggest201766){
          biggest201766=ends[45];
        }
        if(ends[48]>=biggest201766){
          biggest201766=ends[48];
        }
        if(biggest201766 == 1){
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
        }
        //FINXME code
        if(biggest201766 == 0){
          S8063=0;
          active[35]=0;
          ends[35]=0;
          tdone[35]=1;
        }
        break;
      
    }
  }

  public void thread201728(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201727(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201726(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201725(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201724(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201722(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201721(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201720(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201719(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201718(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201716(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201715(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201714(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201713(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201712(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201710(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201709(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201708(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201707(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201706(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201704(int [] tdone, int [] ends){
        switch(S4384){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_34 >= 100){//sysj\conveyor_controller.sysj line: 298, column: 44
          ends[34]=3;
          ;//sysj\conveyor_controller.sysj line: 298, column: 44
          ends[34]=2;
          tdone[34]=1;
        }
        else {
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread201703(int [] tdone, int [] ends){
        switch(S4368){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 298, column: 14
        currsigs.addElement(rotaryTableTrigger);
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
        break;
      
    }
  }

  public void thread201701(int [] tdone, int [] ends){
        S4384=1;
    __start_thread_34 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 298, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_34 >= 100){//sysj\conveyor_controller.sysj line: 298, column: 44
      ends[34]=3;
      ;//sysj\conveyor_controller.sysj line: 298, column: 44
      ends[34]=2;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread201700(int [] tdone, int [] ends){
        S4368=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 298, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread201698(int [] tdone, int [] ends){
        S4384=1;
    __start_thread_34 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 298, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_34 >= 100){//sysj\conveyor_controller.sysj line: 298, column: 44
      ends[34]=3;
      ;//sysj\conveyor_controller.sysj line: 298, column: 44
      ends[34]=2;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread201697(int [] tdone, int [] ends){
        S4368=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 298, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread201695(int [] tdone, int [] ends){
        S4384=1;
    __start_thread_34 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 298, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_34 >= 100){//sysj\conveyor_controller.sysj line: 298, column: 44
      ends[34]=3;
      ;//sysj\conveyor_controller.sysj line: 298, column: 44
      ends[34]=2;
      tdone[34]=1;
    }
    else {
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread201694(int [] tdone, int [] ends){
        S4368=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 298, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[33]=1;
    ends[33]=1;
    tdone[33]=1;
  }

  public void thread201692(int [] tdone, int [] ends){
        switch(S4330){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(sR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 278, column: 17
          System.out.println("*Rotary - No Smoke*");//sysj\conveyor_controller.sysj line: 279, column: 11
          S4330=0;
          active[32]=0;
          ends[32]=0;
          tdone[32]=1;
        }
        else {
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        break;
      
    }
  }

  public void thread201691(int [] tdone, int [] ends){
        switch(S4327){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(lR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 272, column: 17
          System.out.println("*Rotary - LidLoader Ready*");//sysj\conveyor_controller.sysj line: 273, column: 11
          S4327=0;
          active[31]=0;
          ends[31]=0;
          tdone[31]=1;
        }
        else {
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        break;
      
    }
  }

  public void thread201690(int [] tdone, int [] ends){
        switch(S4324){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(cR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 266, column: 17
          System.out.println("*Rotary - Capper Ready*");//sysj\conveyor_controller.sysj line: 267, column: 11
          S4324=0;
          active[30]=0;
          ends[30]=0;
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

  public void thread201689(int [] tdone, int [] ends){
        switch(S4321){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(cvR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 260, column: 17
          System.out.println("*Rotary - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 261, column: 11
          S4321=0;
          active[29]=0;
          ends[29]=0;
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

  public void thread201688(int [] tdone, int [] ends){
        switch(S4318){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(fR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 255, column: 17
          System.out.println("*Rotary - Filler Ready*");//sysj\conveyor_controller.sysj line: 256, column: 11
          S4318=0;
          active[28]=0;
          ends[28]=0;
          tdone[28]=1;
        }
        else {
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread201687(int [] tdone, int [] ends){
        switch(S7566){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S4331){
          case 0 : 
            thread201688(tdone,ends);
            thread201689(tdone,ends);
            thread201690(tdone,ends);
            thread201691(tdone,ends);
            thread201692(tdone,ends);
            int biggest201693 = 0;
            if(ends[28]>=biggest201693){
              biggest201693=ends[28];
            }
            if(ends[29]>=biggest201693){
              biggest201693=ends[29];
            }
            if(ends[30]>=biggest201693){
              biggest201693=ends[30];
            }
            if(ends[31]>=biggest201693){
              biggest201693=ends[31];
            }
            if(ends[32]>=biggest201693){
              biggest201693=ends[32];
            }
            if(biggest201693 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest201693 == 0){
              System.out.println("*Rotary - All controllers are ready*");//sysj\conveyor_controller.sysj line: 282, column: 10
              S4331=1;
              if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 285, column: 18
                S4345=0;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S4331=2;
                thread201694(tdone,ends);
                thread201695(tdone,ends);
                int biggest201696 = 0;
                if(ends[33]>=biggest201696){
                  biggest201696=ends[33];
                }
                if(ends[34]>=biggest201696){
                  biggest201696=ends[34];
                }
                if(biggest201696 == 1){
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                if(biggest201696 == 2){
                  ends[27]=2;
                  ;//sysj\conveyor_controller.sysj line: 297, column: 12
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 301, column: 16
                  S4331=3;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
              }
            }
            break;
          
          case 1 : 
            switch(S4345){
              case 0 : 
                if(!bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 287, column: 20
                  S4345=1;
                  if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 289, column: 23
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 286, column: 13
                    S4331=2;
                    thread201697(tdone,ends);
                    thread201698(tdone,ends);
                    int biggest201699 = 0;
                    if(ends[33]>=biggest201699){
                      biggest201699=ends[33];
                    }
                    if(ends[34]>=biggest201699){
                      biggest201699=ends[34];
                    }
                    if(biggest201699 == 1){
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                    if(biggest201699 == 2){
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 297, column: 12
                      System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 301, column: 16
                      S4331=3;
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                  }
                }
                else {
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 289, column: 23
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  ends[27]=2;
                  ;//sysj\conveyor_controller.sysj line: 286, column: 13
                  S4331=2;
                  thread201700(tdone,ends);
                  thread201701(tdone,ends);
                  int biggest201702 = 0;
                  if(ends[33]>=biggest201702){
                    biggest201702=ends[33];
                  }
                  if(ends[34]>=biggest201702){
                    biggest201702=ends[34];
                  }
                  if(biggest201702 == 1){
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  if(biggest201702 == 2){
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 297, column: 12
                    System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 301, column: 16
                    S4331=3;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread201703(tdone,ends);
            thread201704(tdone,ends);
            int biggest201705 = 0;
            if(ends[33]>=biggest201705){
              biggest201705=ends[33];
            }
            if(ends[34]>=biggest201705){
              biggest201705=ends[34];
            }
            if(biggest201705 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            if(biggest201705 == 2){
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 297, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 301, column: 16
              S4331=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest201705 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 301, column: 16
              S4331=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_controller.sysj line: 302, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\conveyor_controller.sysj line: 303, column: 16
              S4331=4;
              S4487=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 304, column: 13
                rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 304, column: 13
                S4487=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S4482=0;
                if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 304, column: 13
                  rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 304, column: 13
                  S4482=1;
                  if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 304, column: 13
                    rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 304, column: 13
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 304, column: 13
                    S4331=5;
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
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 4 : 
            switch(S4487){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 304, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 304, column: 13
                  S4487=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  switch(S4482){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 304, column: 13
                        rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 304, column: 13
                        S4482=1;
                        if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 304, column: 13
                          rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 304, column: 13
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 304, column: 13
                          S4331=5;
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
                      if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 304, column: 13
                        rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 304, column: 13
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 304, column: 13
                        S4331=5;
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
                S4487=1;
                S4487=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 304, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 304, column: 13
                  S4487=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  S4482=0;
                  if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 304, column: 13
                    rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 304, column: 13
                    S4482=1;
                    if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 304, column: 13
                      rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 304, column: 13
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 304, column: 13
                      S4331=5;
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
          
          case 5 : 
            S4331=5;
            S4331=6;
            __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 251, column: 7
            if(com.systemj.Timer.getMs() - __start_thread_27 >= 5){//sysj\conveyor_controller.sysj line: 251, column: 7
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 251, column: 7
              i_thread_27 = 0;//sysj\conveyor_controller.sysj line: 308, column: 13
              S4331=7;
              i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 311, column: 12
              if(i_thread_27 > 15){//sysj\conveyor_controller.sysj line: 312, column: 15
                ends[27]=2;
                ;//sysj\conveyor_controller.sysj line: 309, column: 10
                S4331=8;
                __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 251, column: 7
                if(com.systemj.Timer.getMs() - __start_thread_27 >= (3) * 1000){//sysj\conveyor_controller.sysj line: 251, column: 7
                  ends[27]=2;
                  ;//sysj\conveyor_controller.sysj line: 251, column: 7
                  S4331=0;
                  thread201706(tdone,ends);
                  thread201707(tdone,ends);
                  thread201708(tdone,ends);
                  thread201709(tdone,ends);
                  thread201710(tdone,ends);
                  int biggest201711 = 0;
                  if(ends[28]>=biggest201711){
                    biggest201711=ends[28];
                  }
                  if(ends[29]>=biggest201711){
                    biggest201711=ends[29];
                  }
                  if(ends[30]>=biggest201711){
                    biggest201711=ends[30];
                  }
                  if(ends[31]>=biggest201711){
                    biggest201711=ends[31];
                  }
                  if(ends[32]>=biggest201711){
                    biggest201711=ends[32];
                  }
                  if(biggest201711 == 1){
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
          
          case 6 : 
            if(com.systemj.Timer.getMs() - __start_thread_27 >= 5){//sysj\conveyor_controller.sysj line: 251, column: 7
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 251, column: 7
              i_thread_27 = 0;//sysj\conveyor_controller.sysj line: 308, column: 13
              S4331=7;
              i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 311, column: 12
              if(i_thread_27 > 15){//sysj\conveyor_controller.sysj line: 312, column: 15
                ends[27]=2;
                ;//sysj\conveyor_controller.sysj line: 309, column: 10
                S4331=8;
                __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 251, column: 7
                if(com.systemj.Timer.getMs() - __start_thread_27 >= (3) * 1000){//sysj\conveyor_controller.sysj line: 251, column: 7
                  ends[27]=2;
                  ;//sysj\conveyor_controller.sysj line: 251, column: 7
                  S4331=0;
                  thread201712(tdone,ends);
                  thread201713(tdone,ends);
                  thread201714(tdone,ends);
                  thread201715(tdone,ends);
                  thread201716(tdone,ends);
                  int biggest201717 = 0;
                  if(ends[28]>=biggest201717){
                    biggest201717=ends[28];
                  }
                  if(ends[29]>=biggest201717){
                    biggest201717=ends[29];
                  }
                  if(ends[30]>=biggest201717){
                    biggest201717=ends[30];
                  }
                  if(ends[31]>=biggest201717){
                    biggest201717=ends[31];
                  }
                  if(ends[32]>=biggest201717){
                    biggest201717=ends[32];
                  }
                  if(biggest201717 == 1){
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
          
          case 7 : 
            i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 311, column: 12
            if(i_thread_27 > 15){//sysj\conveyor_controller.sysj line: 312, column: 15
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 309, column: 10
              S4331=8;
              __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 251, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_27 >= (3) * 1000){//sysj\conveyor_controller.sysj line: 251, column: 7
                ends[27]=2;
                ;//sysj\conveyor_controller.sysj line: 251, column: 7
                S4331=0;
                thread201718(tdone,ends);
                thread201719(tdone,ends);
                thread201720(tdone,ends);
                thread201721(tdone,ends);
                thread201722(tdone,ends);
                int biggest201723 = 0;
                if(ends[28]>=biggest201723){
                  biggest201723=ends[28];
                }
                if(ends[29]>=biggest201723){
                  biggest201723=ends[29];
                }
                if(ends[30]>=biggest201723){
                  biggest201723=ends[30];
                }
                if(ends[31]>=biggest201723){
                  biggest201723=ends[31];
                }
                if(ends[32]>=biggest201723){
                  biggest201723=ends[32];
                }
                if(biggest201723 == 1){
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
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 8 : 
            if(com.systemj.Timer.getMs() - __start_thread_27 >= (3) * 1000){//sysj\conveyor_controller.sysj line: 251, column: 7
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 251, column: 7
              S4331=0;
              thread201724(tdone,ends);
              thread201725(tdone,ends);
              thread201726(tdone,ends);
              thread201727(tdone,ends);
              thread201728(tdone,ends);
              int biggest201729 = 0;
              if(ends[28]>=biggest201729){
                biggest201729=ends[28];
              }
              if(ends[29]>=biggest201729){
                biggest201729=ends[29];
              }
              if(ends[30]>=biggest201729){
                biggest201729=ends[30];
              }
              if(ends[31]>=biggest201729){
                biggest201729=ends[31];
              }
              if(ends[32]>=biggest201729){
                biggest201729=ends[32];
              }
              if(biggest201729 == 1){
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
          
        }
        break;
      
    }
  }

  public void thread201684(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201683(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201682(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201683(tdone,ends);
      thread201684(tdone,ends);
      int biggest201685 = 0;
      if(ends[57]>=biggest201685){
        biggest201685=ends[57];
      }
      if(ends[58]>=biggest201685){
        biggest201685=ends[58];
      }
      if(biggest201685 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201681(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201679(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201678(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201677(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201678(tdone,ends);
      thread201679(tdone,ends);
      int biggest201680 = 0;
      if(ends[53]>=biggest201680){
        biggest201680=ends[53];
      }
      if(ends[54]>=biggest201680){
        biggest201680=ends[54];
      }
      if(biggest201680 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201676(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201673(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201672(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201671(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201672(tdone,ends);
    thread201673(tdone,ends);
    int biggest201674 = 0;
    if(ends[49]>=biggest201674){
      biggest201674=ends[49];
    }
    if(ends[50]>=biggest201674){
      biggest201674=ends[50];
    }
    if(biggest201674 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201669(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201668(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201667(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201668(tdone,ends);
    thread201669(tdone,ends);
    int biggest201670 = 0;
    if(ends[46]>=biggest201670){
      biggest201670=ends[46];
    }
    if(ends[47]>=biggest201670){
      biggest201670=ends[47];
    }
    if(biggest201670 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201665(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201664(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201663(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201664(tdone,ends);
    thread201665(tdone,ends);
    int biggest201666 = 0;
    if(ends[43]>=biggest201666){
      biggest201666=ends[43];
    }
    if(ends[44]>=biggest201666){
      biggest201666=ends[44];
    }
    if(biggest201666 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201661(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201660(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201659(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201660(tdone,ends);
    thread201661(tdone,ends);
    int biggest201662 = 0;
    if(ends[40]>=biggest201662){
      biggest201662=ends[40];
    }
    if(ends[41]>=biggest201662){
      biggest201662=ends[41];
    }
    if(biggest201662 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201657(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201656(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201655(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201656(tdone,ends);
    thread201657(tdone,ends);
    int biggest201658 = 0;
    if(ends[37]>=biggest201658){
      biggest201658=ends[37];
    }
    if(ends[38]>=biggest201658){
      biggest201658=ends[38];
    }
    if(biggest201658 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201654(int [] tdone, int [] ends){
        S8063=1;
    thread201655(tdone,ends);
    thread201659(tdone,ends);
    thread201663(tdone,ends);
    thread201667(tdone,ends);
    thread201671(tdone,ends);
    int biggest201675 = 0;
    if(ends[36]>=biggest201675){
      biggest201675=ends[36];
    }
    if(ends[39]>=biggest201675){
      biggest201675=ends[39];
    }
    if(ends[42]>=biggest201675){
      biggest201675=ends[42];
    }
    if(ends[45]>=biggest201675){
      biggest201675=ends[45];
    }
    if(ends[48]>=biggest201675){
      biggest201675=ends[48];
    }
    if(biggest201675 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201675 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201675 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201675 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201675 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201652(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201651(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201650(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201649(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201648(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201647(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201648(tdone,ends);
    thread201649(tdone,ends);
    thread201650(tdone,ends);
    thread201651(tdone,ends);
    thread201652(tdone,ends);
    int biggest201653 = 0;
    if(ends[28]>=biggest201653){
      biggest201653=ends[28];
    }
    if(ends[29]>=biggest201653){
      biggest201653=ends[29];
    }
    if(ends[30]>=biggest201653){
      biggest201653=ends[30];
    }
    if(ends[31]>=biggest201653){
      biggest201653=ends[31];
    }
    if(ends[32]>=biggest201653){
      biggest201653=ends[32];
    }
    if(biggest201653 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201644(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201643(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201642(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201643(tdone,ends);
      thread201644(tdone,ends);
      int biggest201645 = 0;
      if(ends[57]>=biggest201645){
        biggest201645=ends[57];
      }
      if(ends[58]>=biggest201645){
        biggest201645=ends[58];
      }
      if(biggest201645 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201641(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201639(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201638(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201637(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201638(tdone,ends);
      thread201639(tdone,ends);
      int biggest201640 = 0;
      if(ends[53]>=biggest201640){
        biggest201640=ends[53];
      }
      if(ends[54]>=biggest201640){
        biggest201640=ends[54];
      }
      if(biggest201640 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201636(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201633(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201632(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201631(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201632(tdone,ends);
    thread201633(tdone,ends);
    int biggest201634 = 0;
    if(ends[49]>=biggest201634){
      biggest201634=ends[49];
    }
    if(ends[50]>=biggest201634){
      biggest201634=ends[50];
    }
    if(biggest201634 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201629(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201628(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201627(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201628(tdone,ends);
    thread201629(tdone,ends);
    int biggest201630 = 0;
    if(ends[46]>=biggest201630){
      biggest201630=ends[46];
    }
    if(ends[47]>=biggest201630){
      biggest201630=ends[47];
    }
    if(biggest201630 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201625(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201624(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201623(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201624(tdone,ends);
    thread201625(tdone,ends);
    int biggest201626 = 0;
    if(ends[43]>=biggest201626){
      biggest201626=ends[43];
    }
    if(ends[44]>=biggest201626){
      biggest201626=ends[44];
    }
    if(biggest201626 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201621(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201620(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201619(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201620(tdone,ends);
    thread201621(tdone,ends);
    int biggest201622 = 0;
    if(ends[40]>=biggest201622){
      biggest201622=ends[40];
    }
    if(ends[41]>=biggest201622){
      biggest201622=ends[41];
    }
    if(biggest201622 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201617(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201616(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201615(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201616(tdone,ends);
    thread201617(tdone,ends);
    int biggest201618 = 0;
    if(ends[37]>=biggest201618){
      biggest201618=ends[37];
    }
    if(ends[38]>=biggest201618){
      biggest201618=ends[38];
    }
    if(biggest201618 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201614(int [] tdone, int [] ends){
        S8063=1;
    thread201615(tdone,ends);
    thread201619(tdone,ends);
    thread201623(tdone,ends);
    thread201627(tdone,ends);
    thread201631(tdone,ends);
    int biggest201635 = 0;
    if(ends[36]>=biggest201635){
      biggest201635=ends[36];
    }
    if(ends[39]>=biggest201635){
      biggest201635=ends[39];
    }
    if(ends[42]>=biggest201635){
      biggest201635=ends[42];
    }
    if(ends[45]>=biggest201635){
      biggest201635=ends[45];
    }
    if(ends[48]>=biggest201635){
      biggest201635=ends[48];
    }
    if(biggest201635 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201635 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201635 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201635 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201635 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201612(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201611(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201610(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201609(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201608(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201607(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201608(tdone,ends);
    thread201609(tdone,ends);
    thread201610(tdone,ends);
    thread201611(tdone,ends);
    thread201612(tdone,ends);
    int biggest201613 = 0;
    if(ends[28]>=biggest201613){
      biggest201613=ends[28];
    }
    if(ends[29]>=biggest201613){
      biggest201613=ends[29];
    }
    if(ends[30]>=biggest201613){
      biggest201613=ends[30];
    }
    if(ends[31]>=biggest201613){
      biggest201613=ends[31];
    }
    if(ends[32]>=biggest201613){
      biggest201613=ends[32];
    }
    if(biggest201613 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201604(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201603(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201602(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201603(tdone,ends);
      thread201604(tdone,ends);
      int biggest201605 = 0;
      if(ends[57]>=biggest201605){
        biggest201605=ends[57];
      }
      if(ends[58]>=biggest201605){
        biggest201605=ends[58];
      }
      if(biggest201605 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201601(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201599(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201598(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201597(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201598(tdone,ends);
      thread201599(tdone,ends);
      int biggest201600 = 0;
      if(ends[53]>=biggest201600){
        biggest201600=ends[53];
      }
      if(ends[54]>=biggest201600){
        biggest201600=ends[54];
      }
      if(biggest201600 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201596(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201593(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201592(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201591(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201592(tdone,ends);
    thread201593(tdone,ends);
    int biggest201594 = 0;
    if(ends[49]>=biggest201594){
      biggest201594=ends[49];
    }
    if(ends[50]>=biggest201594){
      biggest201594=ends[50];
    }
    if(biggest201594 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201589(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201588(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201587(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201588(tdone,ends);
    thread201589(tdone,ends);
    int biggest201590 = 0;
    if(ends[46]>=biggest201590){
      biggest201590=ends[46];
    }
    if(ends[47]>=biggest201590){
      biggest201590=ends[47];
    }
    if(biggest201590 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201585(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201584(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201583(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201584(tdone,ends);
    thread201585(tdone,ends);
    int biggest201586 = 0;
    if(ends[43]>=biggest201586){
      biggest201586=ends[43];
    }
    if(ends[44]>=biggest201586){
      biggest201586=ends[44];
    }
    if(biggest201586 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201581(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201580(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201579(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201580(tdone,ends);
    thread201581(tdone,ends);
    int biggest201582 = 0;
    if(ends[40]>=biggest201582){
      biggest201582=ends[40];
    }
    if(ends[41]>=biggest201582){
      biggest201582=ends[41];
    }
    if(biggest201582 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201577(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201576(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201575(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201576(tdone,ends);
    thread201577(tdone,ends);
    int biggest201578 = 0;
    if(ends[37]>=biggest201578){
      biggest201578=ends[37];
    }
    if(ends[38]>=biggest201578){
      biggest201578=ends[38];
    }
    if(biggest201578 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201574(int [] tdone, int [] ends){
        S8063=1;
    thread201575(tdone,ends);
    thread201579(tdone,ends);
    thread201583(tdone,ends);
    thread201587(tdone,ends);
    thread201591(tdone,ends);
    int biggest201595 = 0;
    if(ends[36]>=biggest201595){
      biggest201595=ends[36];
    }
    if(ends[39]>=biggest201595){
      biggest201595=ends[39];
    }
    if(ends[42]>=biggest201595){
      biggest201595=ends[42];
    }
    if(ends[45]>=biggest201595){
      biggest201595=ends[45];
    }
    if(ends[48]>=biggest201595){
      biggest201595=ends[48];
    }
    if(biggest201595 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201595 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201595 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201595 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201595 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201572(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201571(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201570(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201569(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201568(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201567(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201568(tdone,ends);
    thread201569(tdone,ends);
    thread201570(tdone,ends);
    thread201571(tdone,ends);
    thread201572(tdone,ends);
    int biggest201573 = 0;
    if(ends[28]>=biggest201573){
      biggest201573=ends[28];
    }
    if(ends[29]>=biggest201573){
      biggest201573=ends[29];
    }
    if(ends[30]>=biggest201573){
      biggest201573=ends[30];
    }
    if(ends[31]>=biggest201573){
      biggest201573=ends[31];
    }
    if(ends[32]>=biggest201573){
      biggest201573=ends[32];
    }
    if(biggest201573 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201564(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201563(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201562(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201563(tdone,ends);
      thread201564(tdone,ends);
      int biggest201565 = 0;
      if(ends[57]>=biggest201565){
        biggest201565=ends[57];
      }
      if(ends[58]>=biggest201565){
        biggest201565=ends[58];
      }
      if(biggest201565 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201561(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201559(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201558(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201557(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201558(tdone,ends);
      thread201559(tdone,ends);
      int biggest201560 = 0;
      if(ends[53]>=biggest201560){
        biggest201560=ends[53];
      }
      if(ends[54]>=biggest201560){
        biggest201560=ends[54];
      }
      if(biggest201560 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201556(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201553(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201552(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201551(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201552(tdone,ends);
    thread201553(tdone,ends);
    int biggest201554 = 0;
    if(ends[49]>=biggest201554){
      biggest201554=ends[49];
    }
    if(ends[50]>=biggest201554){
      biggest201554=ends[50];
    }
    if(biggest201554 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201549(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201548(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201547(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201548(tdone,ends);
    thread201549(tdone,ends);
    int biggest201550 = 0;
    if(ends[46]>=biggest201550){
      biggest201550=ends[46];
    }
    if(ends[47]>=biggest201550){
      biggest201550=ends[47];
    }
    if(biggest201550 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201545(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201544(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201543(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201544(tdone,ends);
    thread201545(tdone,ends);
    int biggest201546 = 0;
    if(ends[43]>=biggest201546){
      biggest201546=ends[43];
    }
    if(ends[44]>=biggest201546){
      biggest201546=ends[44];
    }
    if(biggest201546 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201541(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201540(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201539(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201540(tdone,ends);
    thread201541(tdone,ends);
    int biggest201542 = 0;
    if(ends[40]>=biggest201542){
      biggest201542=ends[40];
    }
    if(ends[41]>=biggest201542){
      biggest201542=ends[41];
    }
    if(biggest201542 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201537(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201536(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201535(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201536(tdone,ends);
    thread201537(tdone,ends);
    int biggest201538 = 0;
    if(ends[37]>=biggest201538){
      biggest201538=ends[37];
    }
    if(ends[38]>=biggest201538){
      biggest201538=ends[38];
    }
    if(biggest201538 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201534(int [] tdone, int [] ends){
        S8063=1;
    thread201535(tdone,ends);
    thread201539(tdone,ends);
    thread201543(tdone,ends);
    thread201547(tdone,ends);
    thread201551(tdone,ends);
    int biggest201555 = 0;
    if(ends[36]>=biggest201555){
      biggest201555=ends[36];
    }
    if(ends[39]>=biggest201555){
      biggest201555=ends[39];
    }
    if(ends[42]>=biggest201555){
      biggest201555=ends[42];
    }
    if(ends[45]>=biggest201555){
      biggest201555=ends[45];
    }
    if(ends[48]>=biggest201555){
      biggest201555=ends[48];
    }
    if(biggest201555 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201555 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201555 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201555 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201555 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201532(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201531(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201530(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201529(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201528(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201527(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201528(tdone,ends);
    thread201529(tdone,ends);
    thread201530(tdone,ends);
    thread201531(tdone,ends);
    thread201532(tdone,ends);
    int biggest201533 = 0;
    if(ends[28]>=biggest201533){
      biggest201533=ends[28];
    }
    if(ends[29]>=biggest201533){
      biggest201533=ends[29];
    }
    if(ends[30]>=biggest201533){
      biggest201533=ends[30];
    }
    if(ends[31]>=biggest201533){
      biggest201533=ends[31];
    }
    if(ends[32]>=biggest201533){
      biggest201533=ends[32];
    }
    if(biggest201533 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201524(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201523(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201522(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201523(tdone,ends);
      thread201524(tdone,ends);
      int biggest201525 = 0;
      if(ends[57]>=biggest201525){
        biggest201525=ends[57];
      }
      if(ends[58]>=biggest201525){
        biggest201525=ends[58];
      }
      if(biggest201525 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201521(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201519(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201518(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201517(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201518(tdone,ends);
      thread201519(tdone,ends);
      int biggest201520 = 0;
      if(ends[53]>=biggest201520){
        biggest201520=ends[53];
      }
      if(ends[54]>=biggest201520){
        biggest201520=ends[54];
      }
      if(biggest201520 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201516(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201513(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201512(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201511(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201512(tdone,ends);
    thread201513(tdone,ends);
    int biggest201514 = 0;
    if(ends[49]>=biggest201514){
      biggest201514=ends[49];
    }
    if(ends[50]>=biggest201514){
      biggest201514=ends[50];
    }
    if(biggest201514 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201509(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201508(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201507(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201508(tdone,ends);
    thread201509(tdone,ends);
    int biggest201510 = 0;
    if(ends[46]>=biggest201510){
      biggest201510=ends[46];
    }
    if(ends[47]>=biggest201510){
      biggest201510=ends[47];
    }
    if(biggest201510 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201505(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201504(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201503(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201504(tdone,ends);
    thread201505(tdone,ends);
    int biggest201506 = 0;
    if(ends[43]>=biggest201506){
      biggest201506=ends[43];
    }
    if(ends[44]>=biggest201506){
      biggest201506=ends[44];
    }
    if(biggest201506 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201501(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201500(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201499(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201500(tdone,ends);
    thread201501(tdone,ends);
    int biggest201502 = 0;
    if(ends[40]>=biggest201502){
      biggest201502=ends[40];
    }
    if(ends[41]>=biggest201502){
      biggest201502=ends[41];
    }
    if(biggest201502 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201497(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201496(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201495(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201496(tdone,ends);
    thread201497(tdone,ends);
    int biggest201498 = 0;
    if(ends[37]>=biggest201498){
      biggest201498=ends[37];
    }
    if(ends[38]>=biggest201498){
      biggest201498=ends[38];
    }
    if(biggest201498 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201494(int [] tdone, int [] ends){
        S8063=1;
    thread201495(tdone,ends);
    thread201499(tdone,ends);
    thread201503(tdone,ends);
    thread201507(tdone,ends);
    thread201511(tdone,ends);
    int biggest201515 = 0;
    if(ends[36]>=biggest201515){
      biggest201515=ends[36];
    }
    if(ends[39]>=biggest201515){
      biggest201515=ends[39];
    }
    if(ends[42]>=biggest201515){
      biggest201515=ends[42];
    }
    if(ends[45]>=biggest201515){
      biggest201515=ends[45];
    }
    if(ends[48]>=biggest201515){
      biggest201515=ends[48];
    }
    if(biggest201515 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201515 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201515 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201515 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201515 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201492(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201491(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201490(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201489(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201488(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201487(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201488(tdone,ends);
    thread201489(tdone,ends);
    thread201490(tdone,ends);
    thread201491(tdone,ends);
    thread201492(tdone,ends);
    int biggest201493 = 0;
    if(ends[28]>=biggest201493){
      biggest201493=ends[28];
    }
    if(ends[29]>=biggest201493){
      biggest201493=ends[29];
    }
    if(ends[30]>=biggest201493){
      biggest201493=ends[30];
    }
    if(ends[31]>=biggest201493){
      biggest201493=ends[31];
    }
    if(ends[32]>=biggest201493){
      biggest201493=ends[32];
    }
    if(biggest201493 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201484(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201483(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201482(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201483(tdone,ends);
      thread201484(tdone,ends);
      int biggest201485 = 0;
      if(ends[57]>=biggest201485){
        biggest201485=ends[57];
      }
      if(ends[58]>=biggest201485){
        biggest201485=ends[58];
      }
      if(biggest201485 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201481(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201479(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201478(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201477(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201478(tdone,ends);
      thread201479(tdone,ends);
      int biggest201480 = 0;
      if(ends[53]>=biggest201480){
        biggest201480=ends[53];
      }
      if(ends[54]>=biggest201480){
        biggest201480=ends[54];
      }
      if(biggest201480 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201476(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201473(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201472(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201471(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201472(tdone,ends);
    thread201473(tdone,ends);
    int biggest201474 = 0;
    if(ends[49]>=biggest201474){
      biggest201474=ends[49];
    }
    if(ends[50]>=biggest201474){
      biggest201474=ends[50];
    }
    if(biggest201474 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201469(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201468(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201467(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201468(tdone,ends);
    thread201469(tdone,ends);
    int biggest201470 = 0;
    if(ends[46]>=biggest201470){
      biggest201470=ends[46];
    }
    if(ends[47]>=biggest201470){
      biggest201470=ends[47];
    }
    if(biggest201470 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201465(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201464(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201463(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201464(tdone,ends);
    thread201465(tdone,ends);
    int biggest201466 = 0;
    if(ends[43]>=biggest201466){
      biggest201466=ends[43];
    }
    if(ends[44]>=biggest201466){
      biggest201466=ends[44];
    }
    if(biggest201466 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201461(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201460(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201459(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201460(tdone,ends);
    thread201461(tdone,ends);
    int biggest201462 = 0;
    if(ends[40]>=biggest201462){
      biggest201462=ends[40];
    }
    if(ends[41]>=biggest201462){
      biggest201462=ends[41];
    }
    if(biggest201462 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201457(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201456(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201455(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201456(tdone,ends);
    thread201457(tdone,ends);
    int biggest201458 = 0;
    if(ends[37]>=biggest201458){
      biggest201458=ends[37];
    }
    if(ends[38]>=biggest201458){
      biggest201458=ends[38];
    }
    if(biggest201458 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201454(int [] tdone, int [] ends){
        S8063=1;
    thread201455(tdone,ends);
    thread201459(tdone,ends);
    thread201463(tdone,ends);
    thread201467(tdone,ends);
    thread201471(tdone,ends);
    int biggest201475 = 0;
    if(ends[36]>=biggest201475){
      biggest201475=ends[36];
    }
    if(ends[39]>=biggest201475){
      biggest201475=ends[39];
    }
    if(ends[42]>=biggest201475){
      biggest201475=ends[42];
    }
    if(ends[45]>=biggest201475){
      biggest201475=ends[45];
    }
    if(ends[48]>=biggest201475){
      biggest201475=ends[48];
    }
    if(biggest201475 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201475 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201475 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201475 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201475 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201452(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201451(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201450(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201449(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201448(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201447(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201448(tdone,ends);
    thread201449(tdone,ends);
    thread201450(tdone,ends);
    thread201451(tdone,ends);
    thread201452(tdone,ends);
    int biggest201453 = 0;
    if(ends[28]>=biggest201453){
      biggest201453=ends[28];
    }
    if(ends[29]>=biggest201453){
      biggest201453=ends[29];
    }
    if(ends[30]>=biggest201453){
      biggest201453=ends[30];
    }
    if(ends[31]>=biggest201453){
      biggest201453=ends[31];
    }
    if(ends[32]>=biggest201453){
      biggest201453=ends[32];
    }
    if(biggest201453 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201444(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201443(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201442(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201443(tdone,ends);
      thread201444(tdone,ends);
      int biggest201445 = 0;
      if(ends[57]>=biggest201445){
        biggest201445=ends[57];
      }
      if(ends[58]>=biggest201445){
        biggest201445=ends[58];
      }
      if(biggest201445 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201441(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201439(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201438(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201437(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201438(tdone,ends);
      thread201439(tdone,ends);
      int biggest201440 = 0;
      if(ends[53]>=biggest201440){
        biggest201440=ends[53];
      }
      if(ends[54]>=biggest201440){
        biggest201440=ends[54];
      }
      if(biggest201440 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201436(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201433(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201432(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201431(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201432(tdone,ends);
    thread201433(tdone,ends);
    int biggest201434 = 0;
    if(ends[49]>=biggest201434){
      biggest201434=ends[49];
    }
    if(ends[50]>=biggest201434){
      biggest201434=ends[50];
    }
    if(biggest201434 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201429(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201428(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201427(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201428(tdone,ends);
    thread201429(tdone,ends);
    int biggest201430 = 0;
    if(ends[46]>=biggest201430){
      biggest201430=ends[46];
    }
    if(ends[47]>=biggest201430){
      biggest201430=ends[47];
    }
    if(biggest201430 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201425(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201424(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201423(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201424(tdone,ends);
    thread201425(tdone,ends);
    int biggest201426 = 0;
    if(ends[43]>=biggest201426){
      biggest201426=ends[43];
    }
    if(ends[44]>=biggest201426){
      biggest201426=ends[44];
    }
    if(biggest201426 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201421(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201420(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201419(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201420(tdone,ends);
    thread201421(tdone,ends);
    int biggest201422 = 0;
    if(ends[40]>=biggest201422){
      biggest201422=ends[40];
    }
    if(ends[41]>=biggest201422){
      biggest201422=ends[41];
    }
    if(biggest201422 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201417(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201416(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201415(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201416(tdone,ends);
    thread201417(tdone,ends);
    int biggest201418 = 0;
    if(ends[37]>=biggest201418){
      biggest201418=ends[37];
    }
    if(ends[38]>=biggest201418){
      biggest201418=ends[38];
    }
    if(biggest201418 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201414(int [] tdone, int [] ends){
        S8063=1;
    thread201415(tdone,ends);
    thread201419(tdone,ends);
    thread201423(tdone,ends);
    thread201427(tdone,ends);
    thread201431(tdone,ends);
    int biggest201435 = 0;
    if(ends[36]>=biggest201435){
      biggest201435=ends[36];
    }
    if(ends[39]>=biggest201435){
      biggest201435=ends[39];
    }
    if(ends[42]>=biggest201435){
      biggest201435=ends[42];
    }
    if(ends[45]>=biggest201435){
      biggest201435=ends[45];
    }
    if(ends[48]>=biggest201435){
      biggest201435=ends[48];
    }
    if(biggest201435 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201435 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201435 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201435 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201435 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201412(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201411(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201410(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201409(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201408(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201407(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201408(tdone,ends);
    thread201409(tdone,ends);
    thread201410(tdone,ends);
    thread201411(tdone,ends);
    thread201412(tdone,ends);
    int biggest201413 = 0;
    if(ends[28]>=biggest201413){
      biggest201413=ends[28];
    }
    if(ends[29]>=biggest201413){
      biggest201413=ends[29];
    }
    if(ends[30]>=biggest201413){
      biggest201413=ends[30];
    }
    if(ends[31]>=biggest201413){
      biggest201413=ends[31];
    }
    if(ends[32]>=biggest201413){
      biggest201413=ends[32];
    }
    if(biggest201413 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201404(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201403(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201402(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201403(tdone,ends);
      thread201404(tdone,ends);
      int biggest201405 = 0;
      if(ends[57]>=biggest201405){
        biggest201405=ends[57];
      }
      if(ends[58]>=biggest201405){
        biggest201405=ends[58];
      }
      if(biggest201405 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201401(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201399(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201398(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201397(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201398(tdone,ends);
      thread201399(tdone,ends);
      int biggest201400 = 0;
      if(ends[53]>=biggest201400){
        biggest201400=ends[53];
      }
      if(ends[54]>=biggest201400){
        biggest201400=ends[54];
      }
      if(biggest201400 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201396(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201393(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201392(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201391(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201392(tdone,ends);
    thread201393(tdone,ends);
    int biggest201394 = 0;
    if(ends[49]>=biggest201394){
      biggest201394=ends[49];
    }
    if(ends[50]>=biggest201394){
      biggest201394=ends[50];
    }
    if(biggest201394 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201389(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201388(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201387(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201388(tdone,ends);
    thread201389(tdone,ends);
    int biggest201390 = 0;
    if(ends[46]>=biggest201390){
      biggest201390=ends[46];
    }
    if(ends[47]>=biggest201390){
      biggest201390=ends[47];
    }
    if(biggest201390 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201385(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201384(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201383(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201384(tdone,ends);
    thread201385(tdone,ends);
    int biggest201386 = 0;
    if(ends[43]>=biggest201386){
      biggest201386=ends[43];
    }
    if(ends[44]>=biggest201386){
      biggest201386=ends[44];
    }
    if(biggest201386 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201381(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201380(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201379(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201380(tdone,ends);
    thread201381(tdone,ends);
    int biggest201382 = 0;
    if(ends[40]>=biggest201382){
      biggest201382=ends[40];
    }
    if(ends[41]>=biggest201382){
      biggest201382=ends[41];
    }
    if(biggest201382 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201377(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201376(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201375(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201376(tdone,ends);
    thread201377(tdone,ends);
    int biggest201378 = 0;
    if(ends[37]>=biggest201378){
      biggest201378=ends[37];
    }
    if(ends[38]>=biggest201378){
      biggest201378=ends[38];
    }
    if(biggest201378 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201374(int [] tdone, int [] ends){
        S8063=1;
    thread201375(tdone,ends);
    thread201379(tdone,ends);
    thread201383(tdone,ends);
    thread201387(tdone,ends);
    thread201391(tdone,ends);
    int biggest201395 = 0;
    if(ends[36]>=biggest201395){
      biggest201395=ends[36];
    }
    if(ends[39]>=biggest201395){
      biggest201395=ends[39];
    }
    if(ends[42]>=biggest201395){
      biggest201395=ends[42];
    }
    if(ends[45]>=biggest201395){
      biggest201395=ends[45];
    }
    if(ends[48]>=biggest201395){
      biggest201395=ends[48];
    }
    if(biggest201395 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201395 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201395 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201395 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201395 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201372(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201371(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201370(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201369(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201368(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201367(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201368(tdone,ends);
    thread201369(tdone,ends);
    thread201370(tdone,ends);
    thread201371(tdone,ends);
    thread201372(tdone,ends);
    int biggest201373 = 0;
    if(ends[28]>=biggest201373){
      biggest201373=ends[28];
    }
    if(ends[29]>=biggest201373){
      biggest201373=ends[29];
    }
    if(ends[30]>=biggest201373){
      biggest201373=ends[30];
    }
    if(ends[31]>=biggest201373){
      biggest201373=ends[31];
    }
    if(ends[32]>=biggest201373){
      biggest201373=ends[32];
    }
    if(biggest201373 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201364(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201363(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201362(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201363(tdone,ends);
      thread201364(tdone,ends);
      int biggest201365 = 0;
      if(ends[57]>=biggest201365){
        biggest201365=ends[57];
      }
      if(ends[58]>=biggest201365){
        biggest201365=ends[58];
      }
      if(biggest201365 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201361(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201359(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201358(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201357(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201358(tdone,ends);
      thread201359(tdone,ends);
      int biggest201360 = 0;
      if(ends[53]>=biggest201360){
        biggest201360=ends[53];
      }
      if(ends[54]>=biggest201360){
        biggest201360=ends[54];
      }
      if(biggest201360 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201356(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201353(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201352(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201351(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201352(tdone,ends);
    thread201353(tdone,ends);
    int biggest201354 = 0;
    if(ends[49]>=biggest201354){
      biggest201354=ends[49];
    }
    if(ends[50]>=biggest201354){
      biggest201354=ends[50];
    }
    if(biggest201354 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201349(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201348(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201347(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201348(tdone,ends);
    thread201349(tdone,ends);
    int biggest201350 = 0;
    if(ends[46]>=biggest201350){
      biggest201350=ends[46];
    }
    if(ends[47]>=biggest201350){
      biggest201350=ends[47];
    }
    if(biggest201350 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201345(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201344(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201343(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201344(tdone,ends);
    thread201345(tdone,ends);
    int biggest201346 = 0;
    if(ends[43]>=biggest201346){
      biggest201346=ends[43];
    }
    if(ends[44]>=biggest201346){
      biggest201346=ends[44];
    }
    if(biggest201346 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201341(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201340(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201339(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201340(tdone,ends);
    thread201341(tdone,ends);
    int biggest201342 = 0;
    if(ends[40]>=biggest201342){
      biggest201342=ends[40];
    }
    if(ends[41]>=biggest201342){
      biggest201342=ends[41];
    }
    if(biggest201342 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201337(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201336(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201335(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201336(tdone,ends);
    thread201337(tdone,ends);
    int biggest201338 = 0;
    if(ends[37]>=biggest201338){
      biggest201338=ends[37];
    }
    if(ends[38]>=biggest201338){
      biggest201338=ends[38];
    }
    if(biggest201338 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201334(int [] tdone, int [] ends){
        S8063=1;
    thread201335(tdone,ends);
    thread201339(tdone,ends);
    thread201343(tdone,ends);
    thread201347(tdone,ends);
    thread201351(tdone,ends);
    int biggest201355 = 0;
    if(ends[36]>=biggest201355){
      biggest201355=ends[36];
    }
    if(ends[39]>=biggest201355){
      biggest201355=ends[39];
    }
    if(ends[42]>=biggest201355){
      biggest201355=ends[42];
    }
    if(ends[45]>=biggest201355){
      biggest201355=ends[45];
    }
    if(ends[48]>=biggest201355){
      biggest201355=ends[48];
    }
    if(biggest201355 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201355 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201355 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201355 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201355 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201332(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201331(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201330(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201329(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201328(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201327(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201328(tdone,ends);
    thread201329(tdone,ends);
    thread201330(tdone,ends);
    thread201331(tdone,ends);
    thread201332(tdone,ends);
    int biggest201333 = 0;
    if(ends[28]>=biggest201333){
      biggest201333=ends[28];
    }
    if(ends[29]>=biggest201333){
      biggest201333=ends[29];
    }
    if(ends[30]>=biggest201333){
      biggest201333=ends[30];
    }
    if(ends[31]>=biggest201333){
      biggest201333=ends[31];
    }
    if(ends[32]>=biggest201333){
      biggest201333=ends[32];
    }
    if(biggest201333 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201324(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201323(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201322(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201323(tdone,ends);
      thread201324(tdone,ends);
      int biggest201325 = 0;
      if(ends[57]>=biggest201325){
        biggest201325=ends[57];
      }
      if(ends[58]>=biggest201325){
        biggest201325=ends[58];
      }
      if(biggest201325 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201321(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201319(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201318(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201317(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201318(tdone,ends);
      thread201319(tdone,ends);
      int biggest201320 = 0;
      if(ends[53]>=biggest201320){
        biggest201320=ends[53];
      }
      if(ends[54]>=biggest201320){
        biggest201320=ends[54];
      }
      if(biggest201320 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201316(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201313(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201312(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201311(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201312(tdone,ends);
    thread201313(tdone,ends);
    int biggest201314 = 0;
    if(ends[49]>=biggest201314){
      biggest201314=ends[49];
    }
    if(ends[50]>=biggest201314){
      biggest201314=ends[50];
    }
    if(biggest201314 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201309(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201308(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201307(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201308(tdone,ends);
    thread201309(tdone,ends);
    int biggest201310 = 0;
    if(ends[46]>=biggest201310){
      biggest201310=ends[46];
    }
    if(ends[47]>=biggest201310){
      biggest201310=ends[47];
    }
    if(biggest201310 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201305(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201304(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201303(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201304(tdone,ends);
    thread201305(tdone,ends);
    int biggest201306 = 0;
    if(ends[43]>=biggest201306){
      biggest201306=ends[43];
    }
    if(ends[44]>=biggest201306){
      biggest201306=ends[44];
    }
    if(biggest201306 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201301(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201300(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201299(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201300(tdone,ends);
    thread201301(tdone,ends);
    int biggest201302 = 0;
    if(ends[40]>=biggest201302){
      biggest201302=ends[40];
    }
    if(ends[41]>=biggest201302){
      biggest201302=ends[41];
    }
    if(biggest201302 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201297(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201296(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201295(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201296(tdone,ends);
    thread201297(tdone,ends);
    int biggest201298 = 0;
    if(ends[37]>=biggest201298){
      biggest201298=ends[37];
    }
    if(ends[38]>=biggest201298){
      biggest201298=ends[38];
    }
    if(biggest201298 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201294(int [] tdone, int [] ends){
        S8063=1;
    thread201295(tdone,ends);
    thread201299(tdone,ends);
    thread201303(tdone,ends);
    thread201307(tdone,ends);
    thread201311(tdone,ends);
    int biggest201315 = 0;
    if(ends[36]>=biggest201315){
      biggest201315=ends[36];
    }
    if(ends[39]>=biggest201315){
      biggest201315=ends[39];
    }
    if(ends[42]>=biggest201315){
      biggest201315=ends[42];
    }
    if(ends[45]>=biggest201315){
      biggest201315=ends[45];
    }
    if(ends[48]>=biggest201315){
      biggest201315=ends[48];
    }
    if(biggest201315 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201315 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201315 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201315 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201315 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201292(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201291(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201290(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201289(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201288(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201287(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201288(tdone,ends);
    thread201289(tdone,ends);
    thread201290(tdone,ends);
    thread201291(tdone,ends);
    thread201292(tdone,ends);
    int biggest201293 = 0;
    if(ends[28]>=biggest201293){
      biggest201293=ends[28];
    }
    if(ends[29]>=biggest201293){
      biggest201293=ends[29];
    }
    if(ends[30]>=biggest201293){
      biggest201293=ends[30];
    }
    if(ends[31]>=biggest201293){
      biggest201293=ends[31];
    }
    if(ends[32]>=biggest201293){
      biggest201293=ends[32];
    }
    if(biggest201293 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201284(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201283(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201282(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201283(tdone,ends);
      thread201284(tdone,ends);
      int biggest201285 = 0;
      if(ends[57]>=biggest201285){
        biggest201285=ends[57];
      }
      if(ends[58]>=biggest201285){
        biggest201285=ends[58];
      }
      if(biggest201285 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201281(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201279(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201278(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201277(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201278(tdone,ends);
      thread201279(tdone,ends);
      int biggest201280 = 0;
      if(ends[53]>=biggest201280){
        biggest201280=ends[53];
      }
      if(ends[54]>=biggest201280){
        biggest201280=ends[54];
      }
      if(biggest201280 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201276(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201273(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201272(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201271(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201272(tdone,ends);
    thread201273(tdone,ends);
    int biggest201274 = 0;
    if(ends[49]>=biggest201274){
      biggest201274=ends[49];
    }
    if(ends[50]>=biggest201274){
      biggest201274=ends[50];
    }
    if(biggest201274 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201269(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201268(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201267(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201268(tdone,ends);
    thread201269(tdone,ends);
    int biggest201270 = 0;
    if(ends[46]>=biggest201270){
      biggest201270=ends[46];
    }
    if(ends[47]>=biggest201270){
      biggest201270=ends[47];
    }
    if(biggest201270 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201265(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201264(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201263(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201264(tdone,ends);
    thread201265(tdone,ends);
    int biggest201266 = 0;
    if(ends[43]>=biggest201266){
      biggest201266=ends[43];
    }
    if(ends[44]>=biggest201266){
      biggest201266=ends[44];
    }
    if(biggest201266 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201261(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201260(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201259(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201260(tdone,ends);
    thread201261(tdone,ends);
    int biggest201262 = 0;
    if(ends[40]>=biggest201262){
      biggest201262=ends[40];
    }
    if(ends[41]>=biggest201262){
      biggest201262=ends[41];
    }
    if(biggest201262 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201257(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201256(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201255(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201256(tdone,ends);
    thread201257(tdone,ends);
    int biggest201258 = 0;
    if(ends[37]>=biggest201258){
      biggest201258=ends[37];
    }
    if(ends[38]>=biggest201258){
      biggest201258=ends[38];
    }
    if(biggest201258 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201254(int [] tdone, int [] ends){
        S8063=1;
    thread201255(tdone,ends);
    thread201259(tdone,ends);
    thread201263(tdone,ends);
    thread201267(tdone,ends);
    thread201271(tdone,ends);
    int biggest201275 = 0;
    if(ends[36]>=biggest201275){
      biggest201275=ends[36];
    }
    if(ends[39]>=biggest201275){
      biggest201275=ends[39];
    }
    if(ends[42]>=biggest201275){
      biggest201275=ends[42];
    }
    if(ends[45]>=biggest201275){
      biggest201275=ends[45];
    }
    if(ends[48]>=biggest201275){
      biggest201275=ends[48];
    }
    if(biggest201275 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201275 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201275 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201275 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201275 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201252(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201251(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201250(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201249(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201248(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201247(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201248(tdone,ends);
    thread201249(tdone,ends);
    thread201250(tdone,ends);
    thread201251(tdone,ends);
    thread201252(tdone,ends);
    int biggest201253 = 0;
    if(ends[28]>=biggest201253){
      biggest201253=ends[28];
    }
    if(ends[29]>=biggest201253){
      biggest201253=ends[29];
    }
    if(ends[30]>=biggest201253){
      biggest201253=ends[30];
    }
    if(ends[31]>=biggest201253){
      biggest201253=ends[31];
    }
    if(ends[32]>=biggest201253){
      biggest201253=ends[32];
    }
    if(biggest201253 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201244(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201243(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201242(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201243(tdone,ends);
      thread201244(tdone,ends);
      int biggest201245 = 0;
      if(ends[57]>=biggest201245){
        biggest201245=ends[57];
      }
      if(ends[58]>=biggest201245){
        biggest201245=ends[58];
      }
      if(biggest201245 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201241(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201239(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201238(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201237(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201238(tdone,ends);
      thread201239(tdone,ends);
      int biggest201240 = 0;
      if(ends[53]>=biggest201240){
        biggest201240=ends[53];
      }
      if(ends[54]>=biggest201240){
        biggest201240=ends[54];
      }
      if(biggest201240 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201236(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201233(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201232(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201231(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201232(tdone,ends);
    thread201233(tdone,ends);
    int biggest201234 = 0;
    if(ends[49]>=biggest201234){
      biggest201234=ends[49];
    }
    if(ends[50]>=biggest201234){
      biggest201234=ends[50];
    }
    if(biggest201234 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201229(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201228(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201227(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201228(tdone,ends);
    thread201229(tdone,ends);
    int biggest201230 = 0;
    if(ends[46]>=biggest201230){
      biggest201230=ends[46];
    }
    if(ends[47]>=biggest201230){
      biggest201230=ends[47];
    }
    if(biggest201230 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201225(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201224(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201223(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201224(tdone,ends);
    thread201225(tdone,ends);
    int biggest201226 = 0;
    if(ends[43]>=biggest201226){
      biggest201226=ends[43];
    }
    if(ends[44]>=biggest201226){
      biggest201226=ends[44];
    }
    if(biggest201226 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201221(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201220(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201219(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201220(tdone,ends);
    thread201221(tdone,ends);
    int biggest201222 = 0;
    if(ends[40]>=biggest201222){
      biggest201222=ends[40];
    }
    if(ends[41]>=biggest201222){
      biggest201222=ends[41];
    }
    if(biggest201222 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201217(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201216(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201215(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201216(tdone,ends);
    thread201217(tdone,ends);
    int biggest201218 = 0;
    if(ends[37]>=biggest201218){
      biggest201218=ends[37];
    }
    if(ends[38]>=biggest201218){
      biggest201218=ends[38];
    }
    if(biggest201218 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201214(int [] tdone, int [] ends){
        S8063=1;
    thread201215(tdone,ends);
    thread201219(tdone,ends);
    thread201223(tdone,ends);
    thread201227(tdone,ends);
    thread201231(tdone,ends);
    int biggest201235 = 0;
    if(ends[36]>=biggest201235){
      biggest201235=ends[36];
    }
    if(ends[39]>=biggest201235){
      biggest201235=ends[39];
    }
    if(ends[42]>=biggest201235){
      biggest201235=ends[42];
    }
    if(ends[45]>=biggest201235){
      biggest201235=ends[45];
    }
    if(ends[48]>=biggest201235){
      biggest201235=ends[48];
    }
    if(biggest201235 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201235 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201235 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201235 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201235 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201212(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201211(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201210(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201209(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201208(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201207(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201208(tdone,ends);
    thread201209(tdone,ends);
    thread201210(tdone,ends);
    thread201211(tdone,ends);
    thread201212(tdone,ends);
    int biggest201213 = 0;
    if(ends[28]>=biggest201213){
      biggest201213=ends[28];
    }
    if(ends[29]>=biggest201213){
      biggest201213=ends[29];
    }
    if(ends[30]>=biggest201213){
      biggest201213=ends[30];
    }
    if(ends[31]>=biggest201213){
      biggest201213=ends[31];
    }
    if(ends[32]>=biggest201213){
      biggest201213=ends[32];
    }
    if(biggest201213 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201204(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201203(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201202(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201203(tdone,ends);
      thread201204(tdone,ends);
      int biggest201205 = 0;
      if(ends[57]>=biggest201205){
        biggest201205=ends[57];
      }
      if(ends[58]>=biggest201205){
        biggest201205=ends[58];
      }
      if(biggest201205 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201201(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201199(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201198(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201197(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201198(tdone,ends);
      thread201199(tdone,ends);
      int biggest201200 = 0;
      if(ends[53]>=biggest201200){
        biggest201200=ends[53];
      }
      if(ends[54]>=biggest201200){
        biggest201200=ends[54];
      }
      if(biggest201200 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201196(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201193(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201192(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201191(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201192(tdone,ends);
    thread201193(tdone,ends);
    int biggest201194 = 0;
    if(ends[49]>=biggest201194){
      biggest201194=ends[49];
    }
    if(ends[50]>=biggest201194){
      biggest201194=ends[50];
    }
    if(biggest201194 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201189(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201188(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201187(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201188(tdone,ends);
    thread201189(tdone,ends);
    int biggest201190 = 0;
    if(ends[46]>=biggest201190){
      biggest201190=ends[46];
    }
    if(ends[47]>=biggest201190){
      biggest201190=ends[47];
    }
    if(biggest201190 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201185(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201184(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201183(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201184(tdone,ends);
    thread201185(tdone,ends);
    int biggest201186 = 0;
    if(ends[43]>=biggest201186){
      biggest201186=ends[43];
    }
    if(ends[44]>=biggest201186){
      biggest201186=ends[44];
    }
    if(biggest201186 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201181(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201180(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201179(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201180(tdone,ends);
    thread201181(tdone,ends);
    int biggest201182 = 0;
    if(ends[40]>=biggest201182){
      biggest201182=ends[40];
    }
    if(ends[41]>=biggest201182){
      biggest201182=ends[41];
    }
    if(biggest201182 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201177(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201176(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201175(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201176(tdone,ends);
    thread201177(tdone,ends);
    int biggest201178 = 0;
    if(ends[37]>=biggest201178){
      biggest201178=ends[37];
    }
    if(ends[38]>=biggest201178){
      biggest201178=ends[38];
    }
    if(biggest201178 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201174(int [] tdone, int [] ends){
        S8063=1;
    thread201175(tdone,ends);
    thread201179(tdone,ends);
    thread201183(tdone,ends);
    thread201187(tdone,ends);
    thread201191(tdone,ends);
    int biggest201195 = 0;
    if(ends[36]>=biggest201195){
      biggest201195=ends[36];
    }
    if(ends[39]>=biggest201195){
      biggest201195=ends[39];
    }
    if(ends[42]>=biggest201195){
      biggest201195=ends[42];
    }
    if(ends[45]>=biggest201195){
      biggest201195=ends[45];
    }
    if(ends[48]>=biggest201195){
      biggest201195=ends[48];
    }
    if(biggest201195 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201195 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201195 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201195 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201195 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201172(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201171(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201170(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201169(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201168(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201167(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201168(tdone,ends);
    thread201169(tdone,ends);
    thread201170(tdone,ends);
    thread201171(tdone,ends);
    thread201172(tdone,ends);
    int biggest201173 = 0;
    if(ends[28]>=biggest201173){
      biggest201173=ends[28];
    }
    if(ends[29]>=biggest201173){
      biggest201173=ends[29];
    }
    if(ends[30]>=biggest201173){
      biggest201173=ends[30];
    }
    if(ends[31]>=biggest201173){
      biggest201173=ends[31];
    }
    if(ends[32]>=biggest201173){
      biggest201173=ends[32];
    }
    if(biggest201173 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201164(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201163(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201162(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201163(tdone,ends);
      thread201164(tdone,ends);
      int biggest201165 = 0;
      if(ends[57]>=biggest201165){
        biggest201165=ends[57];
      }
      if(ends[58]>=biggest201165){
        biggest201165=ends[58];
      }
      if(biggest201165 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201161(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201159(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201158(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201157(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201158(tdone,ends);
      thread201159(tdone,ends);
      int biggest201160 = 0;
      if(ends[53]>=biggest201160){
        biggest201160=ends[53];
      }
      if(ends[54]>=biggest201160){
        biggest201160=ends[54];
      }
      if(biggest201160 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201156(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201153(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201152(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201151(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201152(tdone,ends);
    thread201153(tdone,ends);
    int biggest201154 = 0;
    if(ends[49]>=biggest201154){
      biggest201154=ends[49];
    }
    if(ends[50]>=biggest201154){
      biggest201154=ends[50];
    }
    if(biggest201154 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201149(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201148(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201147(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201148(tdone,ends);
    thread201149(tdone,ends);
    int biggest201150 = 0;
    if(ends[46]>=biggest201150){
      biggest201150=ends[46];
    }
    if(ends[47]>=biggest201150){
      biggest201150=ends[47];
    }
    if(biggest201150 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201145(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201144(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201143(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201144(tdone,ends);
    thread201145(tdone,ends);
    int biggest201146 = 0;
    if(ends[43]>=biggest201146){
      biggest201146=ends[43];
    }
    if(ends[44]>=biggest201146){
      biggest201146=ends[44];
    }
    if(biggest201146 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201141(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201140(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201139(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201140(tdone,ends);
    thread201141(tdone,ends);
    int biggest201142 = 0;
    if(ends[40]>=biggest201142){
      biggest201142=ends[40];
    }
    if(ends[41]>=biggest201142){
      biggest201142=ends[41];
    }
    if(biggest201142 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201137(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201136(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201135(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201136(tdone,ends);
    thread201137(tdone,ends);
    int biggest201138 = 0;
    if(ends[37]>=biggest201138){
      biggest201138=ends[37];
    }
    if(ends[38]>=biggest201138){
      biggest201138=ends[38];
    }
    if(biggest201138 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201134(int [] tdone, int [] ends){
        S8063=1;
    thread201135(tdone,ends);
    thread201139(tdone,ends);
    thread201143(tdone,ends);
    thread201147(tdone,ends);
    thread201151(tdone,ends);
    int biggest201155 = 0;
    if(ends[36]>=biggest201155){
      biggest201155=ends[36];
    }
    if(ends[39]>=biggest201155){
      biggest201155=ends[39];
    }
    if(ends[42]>=biggest201155){
      biggest201155=ends[42];
    }
    if(ends[45]>=biggest201155){
      biggest201155=ends[45];
    }
    if(ends[48]>=biggest201155){
      biggest201155=ends[48];
    }
    if(biggest201155 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201155 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201155 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201155 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201155 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201132(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201131(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201130(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201129(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201128(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201127(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201128(tdone,ends);
    thread201129(tdone,ends);
    thread201130(tdone,ends);
    thread201131(tdone,ends);
    thread201132(tdone,ends);
    int biggest201133 = 0;
    if(ends[28]>=biggest201133){
      biggest201133=ends[28];
    }
    if(ends[29]>=biggest201133){
      biggest201133=ends[29];
    }
    if(ends[30]>=biggest201133){
      biggest201133=ends[30];
    }
    if(ends[31]>=biggest201133){
      biggest201133=ends[31];
    }
    if(ends[32]>=biggest201133){
      biggest201133=ends[32];
    }
    if(biggest201133 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201124(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201123(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201122(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201123(tdone,ends);
      thread201124(tdone,ends);
      int biggest201125 = 0;
      if(ends[57]>=biggest201125){
        biggest201125=ends[57];
      }
      if(ends[58]>=biggest201125){
        biggest201125=ends[58];
      }
      if(biggest201125 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201121(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201119(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201118(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201117(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201118(tdone,ends);
      thread201119(tdone,ends);
      int biggest201120 = 0;
      if(ends[53]>=biggest201120){
        biggest201120=ends[53];
      }
      if(ends[54]>=biggest201120){
        biggest201120=ends[54];
      }
      if(biggest201120 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201116(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201113(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201112(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201111(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201112(tdone,ends);
    thread201113(tdone,ends);
    int biggest201114 = 0;
    if(ends[49]>=biggest201114){
      biggest201114=ends[49];
    }
    if(ends[50]>=biggest201114){
      biggest201114=ends[50];
    }
    if(biggest201114 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201109(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201108(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201107(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201108(tdone,ends);
    thread201109(tdone,ends);
    int biggest201110 = 0;
    if(ends[46]>=biggest201110){
      biggest201110=ends[46];
    }
    if(ends[47]>=biggest201110){
      biggest201110=ends[47];
    }
    if(biggest201110 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201105(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201104(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201103(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201104(tdone,ends);
    thread201105(tdone,ends);
    int biggest201106 = 0;
    if(ends[43]>=biggest201106){
      biggest201106=ends[43];
    }
    if(ends[44]>=biggest201106){
      biggest201106=ends[44];
    }
    if(biggest201106 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201101(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201100(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201099(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201100(tdone,ends);
    thread201101(tdone,ends);
    int biggest201102 = 0;
    if(ends[40]>=biggest201102){
      biggest201102=ends[40];
    }
    if(ends[41]>=biggest201102){
      biggest201102=ends[41];
    }
    if(biggest201102 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201097(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201096(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201095(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201096(tdone,ends);
    thread201097(tdone,ends);
    int biggest201098 = 0;
    if(ends[37]>=biggest201098){
      biggest201098=ends[37];
    }
    if(ends[38]>=biggest201098){
      biggest201098=ends[38];
    }
    if(biggest201098 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201094(int [] tdone, int [] ends){
        S8063=1;
    thread201095(tdone,ends);
    thread201099(tdone,ends);
    thread201103(tdone,ends);
    thread201107(tdone,ends);
    thread201111(tdone,ends);
    int biggest201115 = 0;
    if(ends[36]>=biggest201115){
      biggest201115=ends[36];
    }
    if(ends[39]>=biggest201115){
      biggest201115=ends[39];
    }
    if(ends[42]>=biggest201115){
      biggest201115=ends[42];
    }
    if(ends[45]>=biggest201115){
      biggest201115=ends[45];
    }
    if(ends[48]>=biggest201115){
      biggest201115=ends[48];
    }
    if(biggest201115 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201115 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201115 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201115 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201115 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201092(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201091(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201090(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201089(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201088(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201087(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201088(tdone,ends);
    thread201089(tdone,ends);
    thread201090(tdone,ends);
    thread201091(tdone,ends);
    thread201092(tdone,ends);
    int biggest201093 = 0;
    if(ends[28]>=biggest201093){
      biggest201093=ends[28];
    }
    if(ends[29]>=biggest201093){
      biggest201093=ends[29];
    }
    if(ends[30]>=biggest201093){
      biggest201093=ends[30];
    }
    if(ends[31]>=biggest201093){
      biggest201093=ends[31];
    }
    if(ends[32]>=biggest201093){
      biggest201093=ends[32];
    }
    if(biggest201093 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread201084(int [] tdone, int [] ends){
        S8275=1;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread201083(int [] tdone, int [] ends){
        S8272=1;
    bottleAtPos1E.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread201082(int [] tdone, int [] ends){
        S8305=1;
    S8279=0;
    if(bottleAtPos1_26.getprestatus()){//sysj\conveyor_controller.sysj line: 392, column: 21
      thread201083(tdone,ends);
      thread201084(tdone,ends);
      int biggest201085 = 0;
      if(ends[57]>=biggest201085){
        biggest201085=ends[57];
      }
      if(ends[58]>=biggest201085){
        biggest201085=ends[58];
      }
      if(biggest201085 == 1){
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
      }
    }
    else {
      S8279=1;
      active[56]=1;
      ends[56]=1;
      tdone[56]=1;
    }
  }

  public void thread201081(int [] tdone, int [] ends){
        S8267=1;
    S8211=0;
    S8191=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 377, column: 7
      checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
      S8191=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
    else {
      S8186=0;
      if(!checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
        checkOne_in.setACK(true);//sysj\conveyor_controller.sysj line: 377, column: 7
        S8186=1;
        if(checkOne_in.isREQ()){//sysj\conveyor_controller.sysj line: 377, column: 7
          checkOne_in.setACK(false);//sysj\conveyor_controller.sysj line: 377, column: 7
          ends[55]=2;
          ;//sysj\conveyor_controller.sysj line: 377, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\conveyor_controller.sysj line: 378, column: 10
            bottleAtPos1_26.setPresent();//sysj\conveyor_controller.sysj line: 379, column: 8
            currsigs.addElement(bottleAtPos1_26);
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
          else {
            S8211=1;
            active[55]=1;
            ends[55]=1;
            tdone[55]=1;
          }
        }
        else {
          active[55]=1;
          ends[55]=1;
          tdone[55]=1;
        }
      }
      else {
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
  }

  public void thread201079(int [] tdone, int [] ends){
        S8154=1;
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread201078(int [] tdone, int [] ends){
        S8151=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 357, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread201077(int [] tdone, int [] ends){
        S8184=1;
    S8158=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 355, column: 21
      thread201078(tdone,ends);
      thread201079(tdone,ends);
      int biggest201080 = 0;
      if(ends[53]>=biggest201080){
        biggest201080=ends[53];
      }
      if(ends[54]>=biggest201080){
        biggest201080=ends[54];
      }
      if(biggest201080 == 1){
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
      }
    }
    else {
      S8158=1;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread201076(int [] tdone, int [] ends){
        S8146=1;
    S8090=0;
    S8070=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 339, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
      S8070=1;
      active[51]=1;
      ends[51]=1;
      tdone[51]=1;
    }
    else {
      S8065=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 339, column: 7
        S8065=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 339, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 339, column: 7
          ends[51]=2;
          ;//sysj\conveyor_controller.sysj line: 339, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 340, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 341, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
          else {
            S8090=1;
            active[51]=1;
            ends[51]=1;
            tdone[51]=1;
          }
        }
        else {
          active[51]=1;
          ends[51]=1;
          tdone[51]=1;
        }
      }
      else {
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
      }
    }
  }

  public void thread201073(int [] tdone, int [] ends){
        S7993=1;
    if((smokeReady_in.getVal() == null ? null : ((Boolean)smokeReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      sR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(sR_26);
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
    else {
      S7993=0;
      active[50]=0;
      ends[50]=0;
      tdone[50]=1;
    }
  }

  public void thread201072(int [] tdone, int [] ends){
        S7987=1;
    S7986=0;
    S7970=0;
    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7970=1;
      active[49]=1;
      ends[49]=1;
      tdone[49]=1;
    }
    else {
      S7965=0;
      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7965=1;
        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[49]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7986=1;
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
        else {
          active[49]=1;
          ends[49]=1;
          tdone[49]=1;
        }
      }
      else {
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
      }
    }
  }

  public void thread201071(int [] tdone, int [] ends){
        S8061=1;
    S7995=0;
    thread201072(tdone,ends);
    thread201073(tdone,ends);
    int biggest201074 = 0;
    if(ends[49]>=biggest201074){
      biggest201074=ends[49];
    }
    if(ends[50]>=biggest201074){
      biggest201074=ends[50];
    }
    if(biggest201074 == 1){
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread201069(int [] tdone, int [] ends){
        S7894=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(lR_26);
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S7894=0;
      active[47]=0;
      ends[47]=0;
      tdone[47]=1;
    }
  }

  public void thread201068(int [] tdone, int [] ends){
        S7888=1;
    S7887=0;
    S7871=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7871=1;
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S7866=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7866=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[46]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7887=1;
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        else {
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
      }
      else {
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
      }
    }
  }

  public void thread201067(int [] tdone, int [] ends){
        S7962=1;
    S7896=0;
    thread201068(tdone,ends);
    thread201069(tdone,ends);
    int biggest201070 = 0;
    if(ends[46]>=biggest201070){
      biggest201070=ends[46];
    }
    if(ends[47]>=biggest201070){
      biggest201070=ends[47];
    }
    if(biggest201070 == 1){
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread201065(int [] tdone, int [] ends){
        S7795=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cR_26);
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7795=0;
      active[44]=0;
      ends[44]=0;
      tdone[44]=1;
    }
  }

  public void thread201064(int [] tdone, int [] ends){
        S7789=1;
    S7788=0;
    S7772=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7772=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S7767=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7767=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[43]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7788=1;
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        else {
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
      }
      else {
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
  }

  public void thread201063(int [] tdone, int [] ends){
        S7863=1;
    S7797=0;
    thread201064(tdone,ends);
    thread201065(tdone,ends);
    int biggest201066 = 0;
    if(ends[43]>=biggest201066){
      biggest201066=ends[43];
    }
    if(ends[44]>=biggest201066){
      biggest201066=ends[44];
    }
    if(biggest201066 == 1){
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread201061(int [] tdone, int [] ends){
        S7696=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(fR_26);
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7696=0;
      active[41]=0;
      ends[41]=0;
      tdone[41]=1;
    }
  }

  public void thread201060(int [] tdone, int [] ends){
        S7690=1;
    S7689=0;
    S7673=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7673=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7668=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7668=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7689=1;
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
        else {
          active[40]=1;
          ends[40]=1;
          tdone[40]=1;
        }
      }
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread201059(int [] tdone, int [] ends){
        S7764=1;
    S7698=0;
    thread201060(tdone,ends);
    thread201061(tdone,ends);
    int biggest201062 = 0;
    if(ends[40]>=biggest201062){
      biggest201062=ends[40];
    }
    if(ends[41]>=biggest201062){
      biggest201062=ends[41];
    }
    if(biggest201062 == 1){
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
  }

  public void thread201057(int [] tdone, int [] ends){
        S7597=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 80, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 80, column: 20
      currsigs.addElement(cvR_26);
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7597=0;
      active[38]=0;
      ends[38]=0;
      tdone[38]=1;
    }
  }

  public void thread201056(int [] tdone, int [] ends){
        S7591=1;
    S7590=0;
    S7574=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 78, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
      S7574=1;
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7569=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 78, column: 5
        S7569=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 78, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 78, column: 5
          ends[37]=2;
          ;//sysj\conveyor_controller.sysj line: 78, column: 5
          S7590=1;
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
        else {
          active[37]=1;
          ends[37]=1;
          tdone[37]=1;
        }
      }
      else {
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
      }
    }
  }

  public void thread201055(int [] tdone, int [] ends){
        S7665=1;
    S7599=0;
    thread201056(tdone,ends);
    thread201057(tdone,ends);
    int biggest201058 = 0;
    if(ends[37]>=biggest201058){
      biggest201058=ends[37];
    }
    if(ends[38]>=biggest201058){
      biggest201058=ends[38];
    }
    if(biggest201058 == 1){
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
  }

  public void thread201054(int [] tdone, int [] ends){
        S8063=1;
    thread201055(tdone,ends);
    thread201059(tdone,ends);
    thread201063(tdone,ends);
    thread201067(tdone,ends);
    thread201071(tdone,ends);
    int biggest201075 = 0;
    if(ends[36]>=biggest201075){
      biggest201075=ends[36];
    }
    if(ends[39]>=biggest201075){
      biggest201075=ends[39];
    }
    if(ends[42]>=biggest201075){
      biggest201075=ends[42];
    }
    if(ends[45]>=biggest201075){
      biggest201075=ends[45];
    }
    if(ends[48]>=biggest201075){
      biggest201075=ends[48];
    }
    if(biggest201075 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201075 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201075 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201075 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    if(biggest201075 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread201052(int [] tdone, int [] ends){
        S4330=1;
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread201051(int [] tdone, int [] ends){
        S4327=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread201050(int [] tdone, int [] ends){
        S4324=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread201049(int [] tdone, int [] ends){
        S4321=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread201048(int [] tdone, int [] ends){
        S4318=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread201047(int [] tdone, int [] ends){
        S7566=1;
    S4331=0;
    thread201048(tdone,ends);
    thread201049(tdone,ends);
    thread201050(tdone,ends);
    thread201051(tdone,ends);
    thread201052(tdone,ends);
    int biggest201053 = 0;
    if(ends[28]>=biggest201053){
      biggest201053=ends[28];
    }
    if(ends[29]>=biggest201053){
      biggest201053=ends[29];
    }
    if(ends[30]>=biggest201053){
      biggest201053=ends[30];
    }
    if(ends[31]>=biggest201053){
      biggest201053=ends[31];
    }
    if(ends[32]>=biggest201053){
      biggest201053=ends[32];
    }
    if(biggest201053 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S52196){
        case 0 : 
          S52196=0;
          break RUN;
        
        case 1 : 
          S52196=2;
          S52196=2;
          cvR_26.setClear();//sysj\conveyor_controller.sysj line: 243, column: 7
          fR_26.setClear();//sysj\conveyor_controller.sysj line: 243, column: 7
          cR_26.setClear();//sysj\conveyor_controller.sysj line: 243, column: 7
          lR_26.setClear();//sysj\conveyor_controller.sysj line: 243, column: 7
          sR_26.setClear();//sysj\conveyor_controller.sysj line: 243, column: 7
          bottleAtPos5_26.setClear();//sysj\conveyor_controller.sysj line: 244, column: 7
          bottleAtPos1_26.setClear();//sysj\conveyor_controller.sysj line: 244, column: 7
          S3787=0;
          S3683=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 245, column: 7
            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 245, column: 7
            S3683=1;
            active[26]=1;
            ends[26]=1;
            break RUN;
          }
          else {
            S3678=0;
            if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 245, column: 7
              convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 245, column: 7
              S3678=1;
              if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 245, column: 7
                convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 245, column: 7
                ends[26]=2;
                ;//sysj\conveyor_controller.sysj line: 245, column: 7
                S3787=1;
                S3705=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 246, column: 7
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 246, column: 7
                  S3705=1;
                  active[26]=1;
                  ends[26]=1;
                  break RUN;
                }
                else {
                  S3700=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 246, column: 7
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 246, column: 7
                    S3700=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 246, column: 7
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 246, column: 7
                      ends[26]=2;
                      ;//sysj\conveyor_controller.sysj line: 246, column: 7
                      S3787=2;
                      S3794=0;
                      if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 247, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                        S3794=1;
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                      else {
                        S3789=0;
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 247, column: 7
                          S3789=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 247, column: 7
                            S3787=3;
                            S3926=0;
                            if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 248, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                              S3926=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3921=0;
                              if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 248, column: 7
                                S3921=1;
                                if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 248, column: 7
                                  S3787=4;
                                  S4102=0;
                                  if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                    smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                    S4102=1;
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                  else {
                                    S4097=0;
                                    if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                      smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                                      S4097=1;
                                      if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                        smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                        ends[26]=2;
                                        ;//sysj\conveyor_controller.sysj line: 249, column: 7
                                        S3787=5;
                                        thread201047(tdone,ends);
                                        thread201054(tdone,ends);
                                        thread201076(tdone,ends);
                                        thread201077(tdone,ends);
                                        thread201081(tdone,ends);
                                        thread201082(tdone,ends);
                                        int biggest201086 = 0;
                                        if(ends[27]>=biggest201086){
                                          biggest201086=ends[27];
                                        }
                                        if(ends[35]>=biggest201086){
                                          biggest201086=ends[35];
                                        }
                                        if(ends[51]>=biggest201086){
                                          biggest201086=ends[51];
                                        }
                                        if(ends[52]>=biggest201086){
                                          biggest201086=ends[52];
                                        }
                                        if(ends[55]>=biggest201086){
                                          biggest201086=ends[55];
                                        }
                                        if(ends[56]>=biggest201086){
                                          biggest201086=ends[56];
                                        }
                                        if(biggest201086 == 1){
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                }
              }
              else {
                active[26]=1;
                ends[26]=1;
                break RUN;
              }
            }
            else {
              active[26]=1;
              ends[26]=1;
              break RUN;
            }
          }
        
        case 2 : 
          cvR_26.setClear();//sysj\conveyor_controller.sysj line: 243, column: 7
          fR_26.setClear();//sysj\conveyor_controller.sysj line: 243, column: 7
          cR_26.setClear();//sysj\conveyor_controller.sysj line: 243, column: 7
          lR_26.setClear();//sysj\conveyor_controller.sysj line: 243, column: 7
          sR_26.setClear();//sysj\conveyor_controller.sysj line: 243, column: 7
          bottleAtPos5_26.setClear();//sysj\conveyor_controller.sysj line: 244, column: 7
          bottleAtPos1_26.setClear();//sysj\conveyor_controller.sysj line: 244, column: 7
          switch(S3787){
            case 0 : 
              switch(S3683){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 245, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 245, column: 7
                    S3683=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3678){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 245, column: 7
                          convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 245, column: 7
                          S3678=1;
                          if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 245, column: 7
                            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 245, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 245, column: 7
                            S3787=1;
                            S3705=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 246, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 246, column: 7
                              S3705=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3700=0;
                              if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 246, column: 7
                                fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 246, column: 7
                                S3700=1;
                                if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 246, column: 7
                                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 246, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 246, column: 7
                                  S3787=2;
                                  S3794=0;
                                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 247, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                                    S3794=1;
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                  else {
                                    S3789=0;
                                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 247, column: 7
                                      S3789=1;
                                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                                        ends[26]=2;
                                        ;//sysj\conveyor_controller.sysj line: 247, column: 7
                                        S3787=3;
                                        S3926=0;
                                        if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                          S3926=1;
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                        else {
                                          S3921=0;
                                          if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                            lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 248, column: 7
                                            S3921=1;
                                            if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                              ends[26]=2;
                                              ;//sysj\conveyor_controller.sysj line: 248, column: 7
                                              S3787=4;
                                              S4102=0;
                                              if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                                smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                                S4102=1;
                                                active[26]=1;
                                                ends[26]=1;
                                                break RUN;
                                              }
                                              else {
                                                S4097=0;
                                                if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                                  smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                                                  S4097=1;
                                                  if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                                    smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                                    ends[26]=2;
                                                    ;//sysj\conveyor_controller.sysj line: 249, column: 7
                                                    S3787=5;
                                                    thread201087(tdone,ends);
                                                    thread201094(tdone,ends);
                                                    thread201116(tdone,ends);
                                                    thread201117(tdone,ends);
                                                    thread201121(tdone,ends);
                                                    thread201122(tdone,ends);
                                                    int biggest201126 = 0;
                                                    if(ends[27]>=biggest201126){
                                                      biggest201126=ends[27];
                                                    }
                                                    if(ends[35]>=biggest201126){
                                                      biggest201126=ends[35];
                                                    }
                                                    if(ends[51]>=biggest201126){
                                                      biggest201126=ends[51];
                                                    }
                                                    if(ends[52]>=biggest201126){
                                                      biggest201126=ends[52];
                                                    }
                                                    if(ends[55]>=biggest201126){
                                                      biggest201126=ends[55];
                                                    }
                                                    if(ends[56]>=biggest201126){
                                                      biggest201126=ends[56];
                                                    }
                                                    if(biggest201126 == 1){
                                                      active[26]=1;
                                                      ends[26]=1;
                                                      break RUN;
                                                    }
                                                  }
                                                  else {
                                                    active[26]=1;
                                                    ends[26]=1;
                                                    break RUN;
                                                  }
                                                }
                                                else {
                                                  active[26]=1;
                                                  ends[26]=1;
                                                  break RUN;
                                                }
                                              }
                                            }
                                            else {
                                              active[26]=1;
                                              ends[26]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[26]=1;
                                            ends[26]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                      else {
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 245, column: 7
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 245, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 245, column: 7
                          S3787=1;
                          S3705=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 246, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 246, column: 7
                            S3705=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S3700=0;
                            if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 246, column: 7
                              fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 246, column: 7
                              S3700=1;
                              if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 246, column: 7
                                fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 246, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 246, column: 7
                                S3787=2;
                                S3794=0;
                                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 247, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                                  S3794=1;
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                                else {
                                  S3789=0;
                                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 247, column: 7
                                    S3789=1;
                                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                                      ends[26]=2;
                                      ;//sysj\conveyor_controller.sysj line: 247, column: 7
                                      S3787=3;
                                      S3926=0;
                                      if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                        S3926=1;
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                      else {
                                        S3921=0;
                                        if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                          lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 248, column: 7
                                          S3921=1;
                                          if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                            lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                            ends[26]=2;
                                            ;//sysj\conveyor_controller.sysj line: 248, column: 7
                                            S3787=4;
                                            S4102=0;
                                            if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                              smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                              S4102=1;
                                              active[26]=1;
                                              ends[26]=1;
                                              break RUN;
                                            }
                                            else {
                                              S4097=0;
                                              if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                                smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                                                S4097=1;
                                                if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                                  smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                                  ends[26]=2;
                                                  ;//sysj\conveyor_controller.sysj line: 249, column: 7
                                                  S3787=5;
                                                  thread201127(tdone,ends);
                                                  thread201134(tdone,ends);
                                                  thread201156(tdone,ends);
                                                  thread201157(tdone,ends);
                                                  thread201161(tdone,ends);
                                                  thread201162(tdone,ends);
                                                  int biggest201166 = 0;
                                                  if(ends[27]>=biggest201166){
                                                    biggest201166=ends[27];
                                                  }
                                                  if(ends[35]>=biggest201166){
                                                    biggest201166=ends[35];
                                                  }
                                                  if(ends[51]>=biggest201166){
                                                    biggest201166=ends[51];
                                                  }
                                                  if(ends[52]>=biggest201166){
                                                    biggest201166=ends[52];
                                                  }
                                                  if(ends[55]>=biggest201166){
                                                    biggest201166=ends[55];
                                                  }
                                                  if(ends[56]>=biggest201166){
                                                    biggest201166=ends[56];
                                                  }
                                                  if(biggest201166 == 1){
                                                    active[26]=1;
                                                    ends[26]=1;
                                                    break RUN;
                                                  }
                                                }
                                                else {
                                                  active[26]=1;
                                                  ends[26]=1;
                                                  break RUN;
                                                }
                                              }
                                              else {
                                                active[26]=1;
                                                ends[26]=1;
                                                break RUN;
                                              }
                                            }
                                          }
                                          else {
                                            active[26]=1;
                                            ends[26]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3683=1;
                  S3683=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 245, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 245, column: 7
                    S3683=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3678=0;
                    if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 245, column: 7
                      convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 245, column: 7
                      S3678=1;
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 245, column: 7
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 245, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 245, column: 7
                        S3787=1;
                        S3705=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 246, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 246, column: 7
                          S3705=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S3700=0;
                          if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 246, column: 7
                            fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 246, column: 7
                            S3700=1;
                            if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 246, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 246, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 246, column: 7
                              S3787=2;
                              S3794=0;
                              if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 247, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                                S3794=1;
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                              else {
                                S3789=0;
                                if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                                  capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 247, column: 7
                                  S3789=1;
                                  if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                                    ends[26]=2;
                                    ;//sysj\conveyor_controller.sysj line: 247, column: 7
                                    S3787=3;
                                    S3926=0;
                                    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                      S3926=1;
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                    else {
                                      S3921=0;
                                      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 248, column: 7
                                        S3921=1;
                                        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                          ends[26]=2;
                                          ;//sysj\conveyor_controller.sysj line: 248, column: 7
                                          S3787=4;
                                          S4102=0;
                                          if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                            smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                            S4102=1;
                                            active[26]=1;
                                            ends[26]=1;
                                            break RUN;
                                          }
                                          else {
                                            S4097=0;
                                            if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                              smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                                              S4097=1;
                                              if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                                smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                                ends[26]=2;
                                                ;//sysj\conveyor_controller.sysj line: 249, column: 7
                                                S3787=5;
                                                thread201167(tdone,ends);
                                                thread201174(tdone,ends);
                                                thread201196(tdone,ends);
                                                thread201197(tdone,ends);
                                                thread201201(tdone,ends);
                                                thread201202(tdone,ends);
                                                int biggest201206 = 0;
                                                if(ends[27]>=biggest201206){
                                                  biggest201206=ends[27];
                                                }
                                                if(ends[35]>=biggest201206){
                                                  biggest201206=ends[35];
                                                }
                                                if(ends[51]>=biggest201206){
                                                  biggest201206=ends[51];
                                                }
                                                if(ends[52]>=biggest201206){
                                                  biggest201206=ends[52];
                                                }
                                                if(ends[55]>=biggest201206){
                                                  biggest201206=ends[55];
                                                }
                                                if(ends[56]>=biggest201206){
                                                  biggest201206=ends[56];
                                                }
                                                if(biggest201206 == 1){
                                                  active[26]=1;
                                                  ends[26]=1;
                                                  break RUN;
                                                }
                                              }
                                              else {
                                                active[26]=1;
                                                ends[26]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              active[26]=1;
                                              ends[26]=1;
                                              break RUN;
                                            }
                                          }
                                        }
                                        else {
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S3705){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 246, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 246, column: 7
                    S3705=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3700){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 246, column: 7
                          fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 246, column: 7
                          S3700=1;
                          if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 246, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 246, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 246, column: 7
                            S3787=2;
                            S3794=0;
                            if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 247, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                              S3794=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3789=0;
                              if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                                capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 247, column: 7
                                S3789=1;
                                if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 247, column: 7
                                  S3787=3;
                                  S3926=0;
                                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                    S3926=1;
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                  else {
                                    S3921=0;
                                    if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                      lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 248, column: 7
                                      S3921=1;
                                      if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                        ends[26]=2;
                                        ;//sysj\conveyor_controller.sysj line: 248, column: 7
                                        S3787=4;
                                        S4102=0;
                                        if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                          S4102=1;
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                        else {
                                          S4097=0;
                                          if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                            smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                                            S4097=1;
                                            if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                              smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                              ends[26]=2;
                                              ;//sysj\conveyor_controller.sysj line: 249, column: 7
                                              S3787=5;
                                              thread201207(tdone,ends);
                                              thread201214(tdone,ends);
                                              thread201236(tdone,ends);
                                              thread201237(tdone,ends);
                                              thread201241(tdone,ends);
                                              thread201242(tdone,ends);
                                              int biggest201246 = 0;
                                              if(ends[27]>=biggest201246){
                                                biggest201246=ends[27];
                                              }
                                              if(ends[35]>=biggest201246){
                                                biggest201246=ends[35];
                                              }
                                              if(ends[51]>=biggest201246){
                                                biggest201246=ends[51];
                                              }
                                              if(ends[52]>=biggest201246){
                                                biggest201246=ends[52];
                                              }
                                              if(ends[55]>=biggest201246){
                                                biggest201246=ends[55];
                                              }
                                              if(ends[56]>=biggest201246){
                                                biggest201246=ends[56];
                                              }
                                              if(biggest201246 == 1){
                                                active[26]=1;
                                                ends[26]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              active[26]=1;
                                              ends[26]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[26]=1;
                                            ends[26]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                      else {
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 246, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 246, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 246, column: 7
                          S3787=2;
                          S3794=0;
                          if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 247, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                            S3794=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S3789=0;
                            if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                              capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 247, column: 7
                              S3789=1;
                              if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 247, column: 7
                                S3787=3;
                                S3926=0;
                                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                  S3926=1;
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                                else {
                                  S3921=0;
                                  if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                    lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 248, column: 7
                                    S3921=1;
                                    if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                      ends[26]=2;
                                      ;//sysj\conveyor_controller.sysj line: 248, column: 7
                                      S3787=4;
                                      S4102=0;
                                      if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                        smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                        S4102=1;
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                      else {
                                        S4097=0;
                                        if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                          smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                                          S4097=1;
                                          if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                            smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                            ends[26]=2;
                                            ;//sysj\conveyor_controller.sysj line: 249, column: 7
                                            S3787=5;
                                            thread201247(tdone,ends);
                                            thread201254(tdone,ends);
                                            thread201276(tdone,ends);
                                            thread201277(tdone,ends);
                                            thread201281(tdone,ends);
                                            thread201282(tdone,ends);
                                            int biggest201286 = 0;
                                            if(ends[27]>=biggest201286){
                                              biggest201286=ends[27];
                                            }
                                            if(ends[35]>=biggest201286){
                                              biggest201286=ends[35];
                                            }
                                            if(ends[51]>=biggest201286){
                                              biggest201286=ends[51];
                                            }
                                            if(ends[52]>=biggest201286){
                                              biggest201286=ends[52];
                                            }
                                            if(ends[55]>=biggest201286){
                                              biggest201286=ends[55];
                                            }
                                            if(ends[56]>=biggest201286){
                                              biggest201286=ends[56];
                                            }
                                            if(biggest201286 == 1){
                                              active[26]=1;
                                              ends[26]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[26]=1;
                                            ends[26]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3705=1;
                  S3705=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 246, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 246, column: 7
                    S3705=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3700=0;
                    if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 246, column: 7
                      fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 246, column: 7
                      S3700=1;
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 246, column: 7
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 246, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 246, column: 7
                        S3787=2;
                        S3794=0;
                        if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 247, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                          S3794=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S3789=0;
                          if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                            capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 247, column: 7
                            S3789=1;
                            if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 247, column: 7
                              S3787=3;
                              S3926=0;
                              if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                S3926=1;
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                              else {
                                S3921=0;
                                if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                  lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 248, column: 7
                                  S3921=1;
                                  if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                    ends[26]=2;
                                    ;//sysj\conveyor_controller.sysj line: 248, column: 7
                                    S3787=4;
                                    S4102=0;
                                    if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                      S4102=1;
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                    else {
                                      S4097=0;
                                      if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                        smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                                        S4097=1;
                                        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                          ends[26]=2;
                                          ;//sysj\conveyor_controller.sysj line: 249, column: 7
                                          S3787=5;
                                          thread201287(tdone,ends);
                                          thread201294(tdone,ends);
                                          thread201316(tdone,ends);
                                          thread201317(tdone,ends);
                                          thread201321(tdone,ends);
                                          thread201322(tdone,ends);
                                          int biggest201326 = 0;
                                          if(ends[27]>=biggest201326){
                                            biggest201326=ends[27];
                                          }
                                          if(ends[35]>=biggest201326){
                                            biggest201326=ends[35];
                                          }
                                          if(ends[51]>=biggest201326){
                                            biggest201326=ends[51];
                                          }
                                          if(ends[52]>=biggest201326){
                                            biggest201326=ends[52];
                                          }
                                          if(ends[55]>=biggest201326){
                                            biggest201326=ends[55];
                                          }
                                          if(ends[56]>=biggest201326){
                                            biggest201326=ends[56];
                                          }
                                          if(biggest201326 == 1){
                                            active[26]=1;
                                            ends[26]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 2 : 
              switch(S3794){
                case 0 : 
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 247, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                    S3794=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3789){
                      case 0 : 
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 247, column: 7
                          S3789=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 247, column: 7
                            S3787=3;
                            S3926=0;
                            if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 248, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                              S3926=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3921=0;
                              if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 248, column: 7
                                S3921=1;
                                if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 248, column: 7
                                  S3787=4;
                                  S4102=0;
                                  if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                    smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                    S4102=1;
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                  else {
                                    S4097=0;
                                    if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                      smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                                      S4097=1;
                                      if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                        smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                        ends[26]=2;
                                        ;//sysj\conveyor_controller.sysj line: 249, column: 7
                                        S3787=5;
                                        thread201327(tdone,ends);
                                        thread201334(tdone,ends);
                                        thread201356(tdone,ends);
                                        thread201357(tdone,ends);
                                        thread201361(tdone,ends);
                                        thread201362(tdone,ends);
                                        int biggest201366 = 0;
                                        if(ends[27]>=biggest201366){
                                          biggest201366=ends[27];
                                        }
                                        if(ends[35]>=biggest201366){
                                          biggest201366=ends[35];
                                        }
                                        if(ends[51]>=biggest201366){
                                          biggest201366=ends[51];
                                        }
                                        if(ends[52]>=biggest201366){
                                          biggest201366=ends[52];
                                        }
                                        if(ends[55]>=biggest201366){
                                          biggest201366=ends[55];
                                        }
                                        if(ends[56]>=biggest201366){
                                          biggest201366=ends[56];
                                        }
                                        if(biggest201366 == 1){
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 247, column: 7
                          S3787=3;
                          S3926=0;
                          if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 248, column: 7
                            lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                            S3926=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S3921=0;
                            if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                              lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 248, column: 7
                              S3921=1;
                              if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                                lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 248, column: 7
                                S3787=4;
                                S4102=0;
                                if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                  smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                  S4102=1;
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                                else {
                                  S4097=0;
                                  if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                    smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                                    S4097=1;
                                    if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                      smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                      ends[26]=2;
                                      ;//sysj\conveyor_controller.sysj line: 249, column: 7
                                      S3787=5;
                                      thread201367(tdone,ends);
                                      thread201374(tdone,ends);
                                      thread201396(tdone,ends);
                                      thread201397(tdone,ends);
                                      thread201401(tdone,ends);
                                      thread201402(tdone,ends);
                                      int biggest201406 = 0;
                                      if(ends[27]>=biggest201406){
                                        biggest201406=ends[27];
                                      }
                                      if(ends[35]>=biggest201406){
                                        biggest201406=ends[35];
                                      }
                                      if(ends[51]>=biggest201406){
                                        biggest201406=ends[51];
                                      }
                                      if(ends[52]>=biggest201406){
                                        biggest201406=ends[52];
                                      }
                                      if(ends[55]>=biggest201406){
                                        biggest201406=ends[55];
                                      }
                                      if(ends[56]>=biggest201406){
                                        biggest201406=ends[56];
                                      }
                                      if(biggest201406 == 1){
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3794=1;
                  S3794=0;
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 247, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                    S3794=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3789=0;
                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 247, column: 7
                      S3789=1;
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 247, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 247, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 247, column: 7
                        S3787=3;
                        S3926=0;
                        if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 248, column: 7
                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                          S3926=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S3921=0;
                          if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                            lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 248, column: 7
                            S3921=1;
                            if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 248, column: 7
                              S3787=4;
                              S4102=0;
                              if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                S4102=1;
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                              else {
                                S4097=0;
                                if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                  smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                                  S4097=1;
                                  if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                    smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                    ends[26]=2;
                                    ;//sysj\conveyor_controller.sysj line: 249, column: 7
                                    S3787=5;
                                    thread201407(tdone,ends);
                                    thread201414(tdone,ends);
                                    thread201436(tdone,ends);
                                    thread201437(tdone,ends);
                                    thread201441(tdone,ends);
                                    thread201442(tdone,ends);
                                    int biggest201446 = 0;
                                    if(ends[27]>=biggest201446){
                                      biggest201446=ends[27];
                                    }
                                    if(ends[35]>=biggest201446){
                                      biggest201446=ends[35];
                                    }
                                    if(ends[51]>=biggest201446){
                                      biggest201446=ends[51];
                                    }
                                    if(ends[52]>=biggest201446){
                                      biggest201446=ends[52];
                                    }
                                    if(ends[55]>=biggest201446){
                                      biggest201446=ends[55];
                                    }
                                    if(ends[56]>=biggest201446){
                                      biggest201446=ends[56];
                                    }
                                    if(biggest201446 == 1){
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 3 : 
              switch(S3926){
                case 0 : 
                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 248, column: 7
                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                    S3926=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3921){
                      case 0 : 
                        if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                          lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 248, column: 7
                          S3921=1;
                          if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                            lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 248, column: 7
                            S3787=4;
                            S4102=0;
                            if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                              smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                              S4102=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S4097=0;
                              if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                                S4097=1;
                                if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                  smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 249, column: 7
                                  S3787=5;
                                  thread201447(tdone,ends);
                                  thread201454(tdone,ends);
                                  thread201476(tdone,ends);
                                  thread201477(tdone,ends);
                                  thread201481(tdone,ends);
                                  thread201482(tdone,ends);
                                  int biggest201486 = 0;
                                  if(ends[27]>=biggest201486){
                                    biggest201486=ends[27];
                                  }
                                  if(ends[35]>=biggest201486){
                                    biggest201486=ends[35];
                                  }
                                  if(ends[51]>=biggest201486){
                                    biggest201486=ends[51];
                                  }
                                  if(ends[52]>=biggest201486){
                                    biggest201486=ends[52];
                                  }
                                  if(ends[55]>=biggest201486){
                                    biggest201486=ends[55];
                                  }
                                  if(ends[56]>=biggest201486){
                                    biggest201486=ends[56];
                                  }
                                  if(biggest201486 == 1){
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 248, column: 7
                          S3787=4;
                          S4102=0;
                          if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                            smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                            S4102=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S4097=0;
                            if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                              smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                              S4097=1;
                              if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                                smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 249, column: 7
                                S3787=5;
                                thread201487(tdone,ends);
                                thread201494(tdone,ends);
                                thread201516(tdone,ends);
                                thread201517(tdone,ends);
                                thread201521(tdone,ends);
                                thread201522(tdone,ends);
                                int biggest201526 = 0;
                                if(ends[27]>=biggest201526){
                                  biggest201526=ends[27];
                                }
                                if(ends[35]>=biggest201526){
                                  biggest201526=ends[35];
                                }
                                if(ends[51]>=biggest201526){
                                  biggest201526=ends[51];
                                }
                                if(ends[52]>=biggest201526){
                                  biggest201526=ends[52];
                                }
                                if(ends[55]>=biggest201526){
                                  biggest201526=ends[55];
                                }
                                if(ends[56]>=biggest201526){
                                  biggest201526=ends[56];
                                }
                                if(biggest201526 == 1){
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3926=1;
                  S3926=0;
                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 248, column: 7
                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                    S3926=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3921=0;
                    if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                      lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 248, column: 7
                      S3921=1;
                      if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 248, column: 7
                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 248, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 248, column: 7
                        S3787=4;
                        S4102=0;
                        if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                          S4102=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S4097=0;
                          if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                            smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                            S4097=1;
                            if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                              smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 249, column: 7
                              S3787=5;
                              thread201527(tdone,ends);
                              thread201534(tdone,ends);
                              thread201556(tdone,ends);
                              thread201557(tdone,ends);
                              thread201561(tdone,ends);
                              thread201562(tdone,ends);
                              int biggest201566 = 0;
                              if(ends[27]>=biggest201566){
                                biggest201566=ends[27];
                              }
                              if(ends[35]>=biggest201566){
                                biggest201566=ends[35];
                              }
                              if(ends[51]>=biggest201566){
                                biggest201566=ends[51];
                              }
                              if(ends[52]>=biggest201566){
                                biggest201566=ends[52];
                              }
                              if(ends[55]>=biggest201566){
                                biggest201566=ends[55];
                              }
                              if(ends[56]>=biggest201566){
                                biggest201566=ends[56];
                              }
                              if(biggest201566 == 1){
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 4 : 
              switch(S4102){
                case 0 : 
                  if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                    smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                    S4102=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S4097){
                      case 0 : 
                        if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                          smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                          S4097=1;
                          if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                            smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 249, column: 7
                            S3787=5;
                            thread201567(tdone,ends);
                            thread201574(tdone,ends);
                            thread201596(tdone,ends);
                            thread201597(tdone,ends);
                            thread201601(tdone,ends);
                            thread201602(tdone,ends);
                            int biggest201606 = 0;
                            if(ends[27]>=biggest201606){
                              biggest201606=ends[27];
                            }
                            if(ends[35]>=biggest201606){
                              biggest201606=ends[35];
                            }
                            if(ends[51]>=biggest201606){
                              biggest201606=ends[51];
                            }
                            if(ends[52]>=biggest201606){
                              biggest201606=ends[52];
                            }
                            if(ends[55]>=biggest201606){
                              biggest201606=ends[55];
                            }
                            if(ends[56]>=biggest201606){
                              biggest201606=ends[56];
                            }
                            if(biggest201606 == 1){
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                          smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 249, column: 7
                          S3787=5;
                          thread201607(tdone,ends);
                          thread201614(tdone,ends);
                          thread201636(tdone,ends);
                          thread201637(tdone,ends);
                          thread201641(tdone,ends);
                          thread201642(tdone,ends);
                          int biggest201646 = 0;
                          if(ends[27]>=biggest201646){
                            biggest201646=ends[27];
                          }
                          if(ends[35]>=biggest201646){
                            biggest201646=ends[35];
                          }
                          if(ends[51]>=biggest201646){
                            biggest201646=ends[51];
                          }
                          if(ends[52]>=biggest201646){
                            biggest201646=ends[52];
                          }
                          if(ends[55]>=biggest201646){
                            biggest201646=ends[55];
                          }
                          if(ends[56]>=biggest201646){
                            biggest201646=ends[56];
                          }
                          if(biggest201646 == 1){
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S4102=1;
                  S4102=0;
                  if(!smokeReady_in.isPartnerPresent() || smokeReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 249, column: 7
                    smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                    S4102=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S4097=0;
                    if(!smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                      smokeReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 249, column: 7
                      S4097=1;
                      if(smokeReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 249, column: 7
                        smokeReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 249, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 249, column: 7
                        S3787=5;
                        thread201647(tdone,ends);
                        thread201654(tdone,ends);
                        thread201676(tdone,ends);
                        thread201677(tdone,ends);
                        thread201681(tdone,ends);
                        thread201682(tdone,ends);
                        int biggest201686 = 0;
                        if(ends[27]>=biggest201686){
                          biggest201686=ends[27];
                        }
                        if(ends[35]>=biggest201686){
                          biggest201686=ends[35];
                        }
                        if(ends[51]>=biggest201686){
                          biggest201686=ends[51];
                        }
                        if(ends[52]>=biggest201686){
                          biggest201686=ends[52];
                        }
                        if(ends[55]>=biggest201686){
                          biggest201686=ends[55];
                        }
                        if(ends[56]>=biggest201686){
                          biggest201686=ends[56];
                        }
                        if(biggest201686 == 1){
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 5 : 
              thread201687(tdone,ends);
              thread201730(tdone,ends);
              thread201767(tdone,ends);
              thread201768(tdone,ends);
              thread201775(tdone,ends);
              thread201776(tdone,ends);
              int biggest201783 = 0;
              if(ends[27]>=biggest201783){
                biggest201783=ends[27];
              }
              if(ends[35]>=biggest201783){
                biggest201783=ends[35];
              }
              if(ends[51]>=biggest201783){
                biggest201783=ends[51];
              }
              if(ends[52]>=biggest201783){
                biggest201783=ends[52];
              }
              if(ends[55]>=biggest201783){
                biggest201783=ends[55];
              }
              if(ends[56]>=biggest201783){
                biggest201783=ends[56];
              }
              if(biggest201783 == 1){
                active[26]=1;
                ends[26]=1;
                break RUN;
              }
              //FINXME code
              if(biggest201783 == 0){
                S52196=0;
                active[26]=0;
                ends[26]=0;
                S52196=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    cvR_26 = new Signal();
    fR_26 = new Signal();
    cR_26 = new Signal();
    lR_26 = new Signal();
    sR_26 = new Signal();
    bottleAtPos5_26 = new Signal();
    bottleAtPos1_26 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[26] != 0){
      int index = 26;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[26]!=0 || suspended[26]!=0 || active[26]!=1);
      else{
        if(!df){
          convReady_in.gethook();
          fillerReady_in.gethook();
          capperReady_in.gethook();
          lidLoaderReady_in.gethook();
          smokeReady_in.gethook();
          checkFive_in.gethook();
          checkOne_in.gethook();
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
      bottleAtPos5E.setpreclear();
      bottleAtPos1E.setpreclear();
      cvR_26.setpreclear();
      fR_26.setpreclear();
      cR_26.setpreclear();
      lR_26.setpreclear();
      sR_26.setpreclear();
      bottleAtPos5_26.setpreclear();
      bottleAtPos1_26.setpreclear();
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
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      cvR_26.setClear();
      fR_26.setClear();
      cR_26.setClear();
      lR_26.setClear();
      sR_26.setClear();
      bottleAtPos5_26.setClear();
      bottleAtPos1_26.setClear();
      convReady_in.sethook();
      fillerReady_in.sethook();
      capperReady_in.sethook();
      lidLoaderReady_in.sethook();
      smokeReady_in.sethook();
      checkFive_in.sethook();
      checkOne_in.sethook();
      rotated_o.sethook();
      if(paused[26]!=0 || suspended[26]!=0 || active[26]!=1);
      else{
        convReady_in.gethook();
        fillerReady_in.gethook();
        capperReady_in.gethook();
        lidLoaderReady_in.gethook();
        smokeReady_in.gethook();
        checkFive_in.gethook();
        checkOne_in.gethook();
        rotated_o.gethook();
        tableAlignedWithSensor.gethook();
        capOnBottleAtPos1.gethook();
      }
      runFinisher();
      if(active[26] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

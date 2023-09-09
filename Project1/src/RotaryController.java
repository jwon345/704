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
  public Signal bottleAtPos3E = new Signal("bottleAtPos3E", Signal.OUTPUT);
  public input_Channel convReady_in = new input_Channel();
  public input_Channel fillerReady_in = new input_Channel();
  public input_Channel capperReady_in = new input_Channel();
  public input_Channel checkFive_in = new input_Channel();
  public input_Channel checkThree_in = new input_Channel();
  public input_Channel checkOne_in = new input_Channel();
  public output_Channel rotated_o = new output_Channel();
  private Signal cvR_26;
  private Signal fR_26;
  private Signal cR_26;
  private Signal bottleAtPos5_26;
  private Signal bottleAtPos3_26;
  private long __start_thread_32;//sysj\conveyor_controller.sysj line: 282, column: 44
  private long __start_thread_27;//sysj\conveyor_controller.sysj line: 244, column: 7
  private int i_thread_27;//sysj\conveyor_controller.sysj line: 291, column: 10
  private int S28448 = 1;
  private int S5179 = 1;
  private int S5075 = 1;
  private int S5070 = 1;
  private int S5097 = 1;
  private int S5092 = 1;
  private int S5186 = 1;
  private int S5181 = 1;
  private int S7658 = 1;
  private int S5321 = 1;
  private int S5314 = 1;
  private int S5317 = 1;
  private int S5320 = 1;
  private int S5335 = 1;
  private int S5358 = 1;
  private int S5374 = 1;
  private int S5477 = 1;
  private int S5472 = 1;
  private int S7957 = 1;
  private int S7757 = 1;
  private int S7691 = 1;
  private int S7683 = 1;
  private int S7682 = 1;
  private int S7666 = 1;
  private int S7661 = 1;
  private int S7689 = 1;
  private int S7856 = 1;
  private int S7790 = 1;
  private int S7782 = 1;
  private int S7781 = 1;
  private int S7765 = 1;
  private int S7760 = 1;
  private int S7788 = 1;
  private int S7955 = 1;
  private int S7889 = 1;
  private int S7881 = 1;
  private int S7880 = 1;
  private int S7864 = 1;
  private int S7859 = 1;
  private int S7887 = 1;
  private int S8125 = 1;
  private int S8040 = 1;
  private int S7984 = 1;
  private int S7964 = 1;
  private int S7959 = 1;
  private int S8123 = 1;
  private int S8067 = 1;
  private int S8047 = 1;
  private int S8042 = 1;
  private int S8203 = 1;
  private int S8163 = 1;
  private int S8137 = 1;
  private int S8130 = 1;
  private int S8133 = 1;
  private int S8201 = 1;
  private int S8175 = 1;
  private int S8168 = 1;
  private int S8171 = 1;
  
  private int[] ends = new int[77];
  private int[] tdone = new int[77];
  
  public void thread42611(int [] tdone, int [] ends){
        S8171=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread42610(int [] tdone, int [] ends){
        S8168=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 364, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread42608(int [] tdone, int [] ends){
        switch(S8171){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_controller.sysj line: 368, column: 29
          ends[52]=2;
          tdone[52]=1;
        }
        else {
          active[52]=1;
          ends[52]=1;
          tdone[52]=1;
        }
        break;
      
    }
  }

  public void thread42607(int [] tdone, int [] ends){
        switch(S8168){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 364, column: 23
        currsigs.addElement(bottleAtPos5E);
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
        break;
      
    }
  }

  public void thread42606(int [] tdone, int [] ends){
        switch(S8201){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        switch(S8175){
          case 0 : 
            thread42607(tdone,ends);
            thread42608(tdone,ends);
            int biggest42609 = 0;
            if(ends[51]>=biggest42609){
              biggest42609=ends[51];
            }
            if(ends[52]>=biggest42609){
              biggest42609=ends[52];
            }
            if(biggest42609 == 1){
              active[50]=1;
              ends[50]=1;
              tdone[50]=1;
            }
            if(biggest42609 == 2){
              ends[50]=2;
              ;//sysj\conveyor_controller.sysj line: 362, column: 34
              S8175=1;
              active[50]=1;
              ends[50]=1;
              tdone[50]=1;
            }
            //FINXME code
            if(biggest42609 == 0){
              ;//sysj\conveyor_controller.sysj line: 370, column: 20
              S8175=1;
              active[50]=1;
              ends[50]=1;
              tdone[50]=1;
            }
            break;
          
          case 1 : 
            S8175=1;
            S8175=0;
            if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 362, column: 21
              thread42610(tdone,ends);
              thread42611(tdone,ends);
              int biggest42612 = 0;
              if(ends[51]>=biggest42612){
                biggest42612=ends[51];
              }
              if(ends[52]>=biggest42612){
                biggest42612=ends[52];
              }
              if(biggest42612 == 1){
                active[50]=1;
                ends[50]=1;
                tdone[50]=1;
              }
            }
            else {
              S8175=1;
              active[50]=1;
              ends[50]=1;
              tdone[50]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread42604(int [] tdone, int [] ends){
        S8133=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread42603(int [] tdone, int [] ends){
        S8130=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 346, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread42601(int [] tdone, int [] ends){
        switch(S8133){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_controller.sysj line: 350, column: 29
          ends[49]=2;
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

  public void thread42600(int [] tdone, int [] ends){
        switch(S8130){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 346, column: 23
        currsigs.addElement(bottleAtPos3E);
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
        break;
      
    }
  }

  public void thread42599(int [] tdone, int [] ends){
        switch(S8163){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        switch(S8137){
          case 0 : 
            thread42600(tdone,ends);
            thread42601(tdone,ends);
            int biggest42602 = 0;
            if(ends[48]>=biggest42602){
              biggest42602=ends[48];
            }
            if(ends[49]>=biggest42602){
              biggest42602=ends[49];
            }
            if(biggest42602 == 1){
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            if(biggest42602 == 2){
              ends[47]=2;
              ;//sysj\conveyor_controller.sysj line: 344, column: 34
              S8137=1;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            //FINXME code
            if(biggest42602 == 0){
              ;//sysj\conveyor_controller.sysj line: 352, column: 20
              S8137=1;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
          case 1 : 
            S8137=1;
            S8137=0;
            if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 344, column: 21
              thread42603(tdone,ends);
              thread42604(tdone,ends);
              int biggest42605 = 0;
              if(ends[48]>=biggest42605){
                biggest42605=ends[48];
              }
              if(ends[49]>=biggest42605){
                biggest42605=ends[49];
              }
              if(biggest42605 == 1){
                active[47]=1;
                ends[47]=1;
                tdone[47]=1;
              }
            }
            else {
              S8137=1;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread42598(int [] tdone, int [] ends){
        switch(S8203){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        thread42599(tdone,ends);
        thread42606(tdone,ends);
        int biggest42613 = 0;
        if(ends[47]>=biggest42613){
          biggest42613=ends[47];
        }
        if(ends[50]>=biggest42613){
          biggest42613=ends[50];
        }
        if(biggest42613 == 1){
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        //FINXME code
        if(biggest42613 == 0){
          S8203=0;
          active[46]=0;
          ends[46]=0;
          tdone[46]=1;
        }
        break;
      
    }
  }

  public void thread42596(int [] tdone, int [] ends){
        switch(S8123){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S8067){
          case 0 : 
            switch(S8047){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
                  S8047=1;
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
                else {
                  switch(S8042){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 8
                        S8042=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
                          ends[45]=2;
                          ;//sysj\conveyor_controller.sysj line: 329, column: 8
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 11
                            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 9
                            currsigs.addElement(bottleAtPos3_26);
                            S8067=1;
                            active[45]=1;
                            ends[45]=1;
                            tdone[45]=1;
                          }
                          else {
                            S8067=1;
                            active[45]=1;
                            ends[45]=1;
                            tdone[45]=1;
                          }
                        }
                        else {
                          active[45]=1;
                          ends[45]=1;
                          tdone[45]=1;
                        }
                      }
                      else {
                        active[45]=1;
                        ends[45]=1;
                        tdone[45]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
                        ends[45]=2;
                        ;//sysj\conveyor_controller.sysj line: 329, column: 8
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 11
                          bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 9
                          currsigs.addElement(bottleAtPos3_26);
                          S8067=1;
                          active[45]=1;
                          ends[45]=1;
                          tdone[45]=1;
                        }
                        else {
                          S8067=1;
                          active[45]=1;
                          ends[45]=1;
                          tdone[45]=1;
                        }
                      }
                      else {
                        active[45]=1;
                        ends[45]=1;
                        tdone[45]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S8047=1;
                S8047=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
                  S8047=1;
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
                else {
                  S8042=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 8
                    S8042=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
                      ends[45]=2;
                      ;//sysj\conveyor_controller.sysj line: 329, column: 8
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 11
                        bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 9
                        currsigs.addElement(bottleAtPos3_26);
                        S8067=1;
                        active[45]=1;
                        ends[45]=1;
                        tdone[45]=1;
                      }
                      else {
                        S8067=1;
                        active[45]=1;
                        ends[45]=1;
                        tdone[45]=1;
                      }
                    }
                    else {
                      active[45]=1;
                      ends[45]=1;
                      tdone[45]=1;
                    }
                  }
                  else {
                    active[45]=1;
                    ends[45]=1;
                    tdone[45]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S8067=1;
            S8067=0;
            S8047=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 8
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
              S8047=1;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            else {
              S8042=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 8
                S8042=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
                  ends[45]=2;
                  ;//sysj\conveyor_controller.sysj line: 329, column: 8
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 11
                    bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 9
                    currsigs.addElement(bottleAtPos3_26);
                    S8067=1;
                    active[45]=1;
                    ends[45]=1;
                    tdone[45]=1;
                  }
                  else {
                    S8067=1;
                    active[45]=1;
                    ends[45]=1;
                    tdone[45]=1;
                  }
                }
                else {
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
              }
              else {
                active[45]=1;
                ends[45]=1;
                tdone[45]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread42595(int [] tdone, int [] ends){
        switch(S8040){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        switch(S7984){
          case 0 : 
            switch(S7964){
              case 0 : 
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 319, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
                  S7964=1;
                  active[44]=1;
                  ends[44]=1;
                  tdone[44]=1;
                }
                else {
                  switch(S7959){
                    case 0 : 
                      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
                        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 319, column: 7
                        S7959=1;
                        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
                          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
                          ends[44]=2;
                          ;//sysj\conveyor_controller.sysj line: 319, column: 7
                          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 320, column: 10
                            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 321, column: 8
                            currsigs.addElement(bottleAtPos5_26);
                            S7984=1;
                            active[44]=1;
                            ends[44]=1;
                            tdone[44]=1;
                          }
                          else {
                            S7984=1;
                            active[44]=1;
                            ends[44]=1;
                            tdone[44]=1;
                          }
                        }
                        else {
                          active[44]=1;
                          ends[44]=1;
                          tdone[44]=1;
                        }
                      }
                      else {
                        active[44]=1;
                        ends[44]=1;
                        tdone[44]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
                        checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
                        ends[44]=2;
                        ;//sysj\conveyor_controller.sysj line: 319, column: 7
                        if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 320, column: 10
                          bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 321, column: 8
                          currsigs.addElement(bottleAtPos5_26);
                          S7984=1;
                          active[44]=1;
                          ends[44]=1;
                          tdone[44]=1;
                        }
                        else {
                          S7984=1;
                          active[44]=1;
                          ends[44]=1;
                          tdone[44]=1;
                        }
                      }
                      else {
                        active[44]=1;
                        ends[44]=1;
                        tdone[44]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7964=1;
                S7964=0;
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 319, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
                  S7964=1;
                  active[44]=1;
                  ends[44]=1;
                  tdone[44]=1;
                }
                else {
                  S7959=0;
                  if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
                    checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 319, column: 7
                    S7959=1;
                    if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
                      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
                      ends[44]=2;
                      ;//sysj\conveyor_controller.sysj line: 319, column: 7
                      if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 320, column: 10
                        bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 321, column: 8
                        currsigs.addElement(bottleAtPos5_26);
                        S7984=1;
                        active[44]=1;
                        ends[44]=1;
                        tdone[44]=1;
                      }
                      else {
                        S7984=1;
                        active[44]=1;
                        ends[44]=1;
                        tdone[44]=1;
                      }
                    }
                    else {
                      active[44]=1;
                      ends[44]=1;
                      tdone[44]=1;
                    }
                  }
                  else {
                    active[44]=1;
                    ends[44]=1;
                    tdone[44]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S7984=1;
            S7984=0;
            S7964=0;
            if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 319, column: 7
              checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
              S7964=1;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            else {
              S7959=0;
              if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
                checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 319, column: 7
                S7959=1;
                if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
                  ends[44]=2;
                  ;//sysj\conveyor_controller.sysj line: 319, column: 7
                  if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 320, column: 10
                    bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 321, column: 8
                    currsigs.addElement(bottleAtPos5_26);
                    S7984=1;
                    active[44]=1;
                    ends[44]=1;
                    tdone[44]=1;
                  }
                  else {
                    S7984=1;
                    active[44]=1;
                    ends[44]=1;
                    tdone[44]=1;
                  }
                }
                else {
                  active[44]=1;
                  ends[44]=1;
                  tdone[44]=1;
                }
              }
              else {
                active[44]=1;
                ends[44]=1;
                tdone[44]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread42594(int [] tdone, int [] ends){
        switch(S8125){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        thread42595(tdone,ends);
        thread42596(tdone,ends);
        int biggest42597 = 0;
        if(ends[44]>=biggest42597){
          biggest42597=ends[44];
        }
        if(ends[45]>=biggest42597){
          biggest42597=ends[45];
        }
        if(biggest42597 == 1){
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        //FINXME code
        if(biggest42597 == 0){
          S8125=0;
          active[43]=0;
          ends[43]=0;
          tdone[43]=1;
        }
        break;
      
    }
  }

  public void thread42591(int [] tdone, int [] ends){
        S7887=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7887=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread42590(int [] tdone, int [] ends){
        S7881=1;
    S7880=0;
    S7864=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7864=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7859=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7859=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7880=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
      else {
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
    }
  }

  public void thread42588(int [] tdone, int [] ends){
        switch(S7887){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
        currsigs.addElement(cR_26);
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
        break;
      
    }
  }

  public void thread42587(int [] tdone, int [] ends){
        switch(S7881){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        switch(S7880){
          case 0 : 
            switch(S7864){
              case 0 : 
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7864=1;
                  active[41]=1;
                  ends[41]=1;
                  tdone[41]=1;
                }
                else {
                  switch(S7859){
                    case 0 : 
                      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7859=1;
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[41]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S7880=1;
                          active[41]=1;
                          ends[41]=1;
                          tdone[41]=1;
                        }
                        else {
                          active[41]=1;
                          ends[41]=1;
                          tdone[41]=1;
                        }
                      }
                      else {
                        active[41]=1;
                        ends[41]=1;
                        tdone[41]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                        ends[41]=2;
                        ;//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7880=1;
                        active[41]=1;
                        ends[41]=1;
                        tdone[41]=1;
                      }
                      else {
                        active[41]=1;
                        ends[41]=1;
                        tdone[41]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7864=1;
                S7864=0;
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7864=1;
                  active[41]=1;
                  ends[41]=1;
                  tdone[41]=1;
                }
                else {
                  S7859=0;
                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S7859=1;
                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[41]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S7880=1;
                      active[41]=1;
                      ends[41]=1;
                      tdone[41]=1;
                    }
                    else {
                      active[41]=1;
                      ends[41]=1;
                      tdone[41]=1;
                    }
                  }
                  else {
                    active[41]=1;
                    ends[41]=1;
                    tdone[41]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S7880=1;
            S7880=2;
            active[41]=1;
            ends[41]=1;
            tdone[41]=1;
            break;
          
          case 2 : 
            S7880=2;
            capperReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[41]=2;
            tdone[41]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread42586(int [] tdone, int [] ends){
        switch(S7955){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        switch(S7889){
          case 0 : 
            thread42587(tdone,ends);
            thread42588(tdone,ends);
            int biggest42589 = 0;
            if(ends[41]>=biggest42589){
              biggest42589=ends[41];
            }
            if(ends[42]>=biggest42589){
              biggest42589=ends[42];
            }
            if(biggest42589 == 1){
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            if(biggest42589 == 2){
              ends[40]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S7889=1;
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            //FINXME code
            if(biggest42589 == 0){
              S7889=1;
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            break;
          
          case 1 : 
            S7889=1;
            S7889=0;
            thread42590(tdone,ends);
            thread42591(tdone,ends);
            int biggest42592 = 0;
            if(ends[41]>=biggest42592){
              biggest42592=ends[41];
            }
            if(ends[42]>=biggest42592){
              biggest42592=ends[42];
            }
            if(biggest42592 == 1){
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread42584(int [] tdone, int [] ends){
        S7788=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7788=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread42583(int [] tdone, int [] ends){
        S7782=1;
    S7781=0;
    S7765=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7765=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7760=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7760=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7781=1;
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
      }
      else {
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
  }

  public void thread42581(int [] tdone, int [] ends){
        switch(S7788){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
        currsigs.addElement(fR_26);
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
        break;
      
    }
  }

  public void thread42580(int [] tdone, int [] ends){
        switch(S7782){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S7781){
          case 0 : 
            switch(S7765){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7765=1;
                  active[38]=1;
                  ends[38]=1;
                  tdone[38]=1;
                }
                else {
                  switch(S7760){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7760=1;
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[38]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S7781=1;
                          active[38]=1;
                          ends[38]=1;
                          tdone[38]=1;
                        }
                        else {
                          active[38]=1;
                          ends[38]=1;
                          tdone[38]=1;
                        }
                      }
                      else {
                        active[38]=1;
                        ends[38]=1;
                        tdone[38]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                        ends[38]=2;
                        ;//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7781=1;
                        active[38]=1;
                        ends[38]=1;
                        tdone[38]=1;
                      }
                      else {
                        active[38]=1;
                        ends[38]=1;
                        tdone[38]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S7765=1;
                S7765=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7765=1;
                  active[38]=1;
                  ends[38]=1;
                  tdone[38]=1;
                }
                else {
                  S7760=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S7760=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[38]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S7781=1;
                      active[38]=1;
                      ends[38]=1;
                      tdone[38]=1;
                    }
                    else {
                      active[38]=1;
                      ends[38]=1;
                      tdone[38]=1;
                    }
                  }
                  else {
                    active[38]=1;
                    ends[38]=1;
                    tdone[38]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S7781=1;
            S7781=2;
            active[38]=1;
            ends[38]=1;
            tdone[38]=1;
            break;
          
          case 2 : 
            S7781=2;
            fillerReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[38]=2;
            tdone[38]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread42579(int [] tdone, int [] ends){
        switch(S7856){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S7790){
          case 0 : 
            thread42580(tdone,ends);
            thread42581(tdone,ends);
            int biggest42582 = 0;
            if(ends[38]>=biggest42582){
              biggest42582=ends[38];
            }
            if(ends[39]>=biggest42582){
              biggest42582=ends[39];
            }
            if(biggest42582 == 1){
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            if(biggest42582 == 2){
              ends[37]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S7790=1;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            //FINXME code
            if(biggest42582 == 0){
              S7790=1;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 1 : 
            S7790=1;
            S7790=0;
            thread42583(tdone,ends);
            thread42584(tdone,ends);
            int biggest42585 = 0;
            if(ends[38]>=biggest42585){
              biggest42585=ends[38];
            }
            if(ends[39]>=biggest42585){
              biggest42585=ends[39];
            }
            if(biggest42585 == 1){
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread42577(int [] tdone, int [] ends){
        S7689=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7689=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread42576(int [] tdone, int [] ends){
        S7683=1;
    S7682=0;
    S7666=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7666=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7661=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7661=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7682=1;
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
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

  public void thread42574(int [] tdone, int [] ends){
        switch(S7689){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
        currsigs.addElement(cvR_26);
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
        break;
      
    }
  }

  public void thread42573(int [] tdone, int [] ends){
        switch(S7683){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        switch(S7682){
          case 0 : 
            switch(S7666){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7666=1;
                  active[35]=1;
                  ends[35]=1;
                  tdone[35]=1;
                }
                else {
                  switch(S7661){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7661=1;
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[35]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S7682=1;
                          active[35]=1;
                          ends[35]=1;
                          tdone[35]=1;
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
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                        ends[35]=2;
                        ;//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7682=1;
                        active[35]=1;
                        ends[35]=1;
                        tdone[35]=1;
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
                S7666=1;
                S7666=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7666=1;
                  active[35]=1;
                  ends[35]=1;
                  tdone[35]=1;
                }
                else {
                  S7661=0;
                  if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S7661=1;
                    if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[35]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S7682=1;
                      active[35]=1;
                      ends[35]=1;
                      tdone[35]=1;
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
            S7682=1;
            S7682=2;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
            break;
          
          case 2 : 
            S7682=2;
            convReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[35]=2;
            tdone[35]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread42572(int [] tdone, int [] ends){
        switch(S7757){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        switch(S7691){
          case 0 : 
            thread42573(tdone,ends);
            thread42574(tdone,ends);
            int biggest42575 = 0;
            if(ends[35]>=biggest42575){
              biggest42575=ends[35];
            }
            if(ends[36]>=biggest42575){
              biggest42575=ends[36];
            }
            if(biggest42575 == 1){
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            if(biggest42575 == 2){
              ends[34]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S7691=1;
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            //FINXME code
            if(biggest42575 == 0){
              S7691=1;
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            break;
          
          case 1 : 
            S7691=1;
            S7691=0;
            thread42576(tdone,ends);
            thread42577(tdone,ends);
            int biggest42578 = 0;
            if(ends[35]>=biggest42578){
              biggest42578=ends[35];
            }
            if(ends[36]>=biggest42578){
              biggest42578=ends[36];
            }
            if(biggest42578 == 1){
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread42571(int [] tdone, int [] ends){
        switch(S7957){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        thread42572(tdone,ends);
        thread42579(tdone,ends);
        thread42586(tdone,ends);
        int biggest42593 = 0;
        if(ends[34]>=biggest42593){
          biggest42593=ends[34];
        }
        if(ends[37]>=biggest42593){
          biggest42593=ends[37];
        }
        if(ends[40]>=biggest42593){
          biggest42593=ends[40];
        }
        if(biggest42593 == 1){
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        //FINXME code
        if(biggest42593 == 0){
          S7957=0;
          active[33]=0;
          ends[33]=0;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread42569(int [] tdone, int [] ends){
        S5320=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread42568(int [] tdone, int [] ends){
        S5317=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread42567(int [] tdone, int [] ends){
        S5314=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread42565(int [] tdone, int [] ends){
        S5320=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread42564(int [] tdone, int [] ends){
        S5317=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread42563(int [] tdone, int [] ends){
        S5314=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread42561(int [] tdone, int [] ends){
        S5320=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread42560(int [] tdone, int [] ends){
        S5317=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread42559(int [] tdone, int [] ends){
        S5314=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread42557(int [] tdone, int [] ends){
        switch(S5374){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_32 >= 100){//sysj\conveyor_controller.sysj line: 282, column: 44
          ends[32]=3;
          ;//sysj\conveyor_controller.sysj line: 282, column: 44
          ends[32]=2;
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

  public void thread42556(int [] tdone, int [] ends){
        switch(S5358){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 282, column: 14
        currsigs.addElement(rotaryTableTrigger);
        active[31]=1;
        ends[31]=1;
        tdone[31]=1;
        break;
      
    }
  }

  public void thread42554(int [] tdone, int [] ends){
        S5374=1;
    __start_thread_32 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 282, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_32 >= 100){//sysj\conveyor_controller.sysj line: 282, column: 44
      ends[32]=3;
      ;//sysj\conveyor_controller.sysj line: 282, column: 44
      ends[32]=2;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread42553(int [] tdone, int [] ends){
        S5358=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 282, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread42551(int [] tdone, int [] ends){
        S5374=1;
    __start_thread_32 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 282, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_32 >= 100){//sysj\conveyor_controller.sysj line: 282, column: 44
      ends[32]=3;
      ;//sysj\conveyor_controller.sysj line: 282, column: 44
      ends[32]=2;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread42550(int [] tdone, int [] ends){
        S5358=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 282, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread42548(int [] tdone, int [] ends){
        S5374=1;
    __start_thread_32 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 282, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_32 >= 100){//sysj\conveyor_controller.sysj line: 282, column: 44
      ends[32]=3;
      ;//sysj\conveyor_controller.sysj line: 282, column: 44
      ends[32]=2;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread42547(int [] tdone, int [] ends){
        S5358=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 282, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread42545(int [] tdone, int [] ends){
        switch(S5320){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(cR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 259, column: 17
          System.out.println("*Rotary - Capper Ready*");//sysj\conveyor_controller.sysj line: 260, column: 11
          S5320=0;
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

  public void thread42544(int [] tdone, int [] ends){
        switch(S5317){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(cvR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 253, column: 17
          System.out.println("*Rotary - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 254, column: 11
          S5317=0;
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

  public void thread42543(int [] tdone, int [] ends){
        switch(S5314){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(fR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 248, column: 17
          System.out.println("*Rotary - Filler Ready*");//sysj\conveyor_controller.sysj line: 249, column: 11
          S5314=0;
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

  public void thread42542(int [] tdone, int [] ends){
        switch(S7658){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S5321){
          case 0 : 
            thread42543(tdone,ends);
            thread42544(tdone,ends);
            thread42545(tdone,ends);
            int biggest42546 = 0;
            if(ends[28]>=biggest42546){
              biggest42546=ends[28];
            }
            if(ends[29]>=biggest42546){
              biggest42546=ends[29];
            }
            if(ends[30]>=biggest42546){
              biggest42546=ends[30];
            }
            if(biggest42546 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest42546 == 0){
              System.out.println("*Rotary - All controllers are ready*");//sysj\conveyor_controller.sysj line: 265, column: 10
              S5321=1;
              if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 268, column: 18
                S5335=0;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S5321=2;
                thread42547(tdone,ends);
                thread42548(tdone,ends);
                int biggest42549 = 0;
                if(ends[31]>=biggest42549){
                  biggest42549=ends[31];
                }
                if(ends[32]>=biggest42549){
                  biggest42549=ends[32];
                }
                if(biggest42549 == 1){
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                if(biggest42549 == 2){
                  ends[27]=2;
                  ;//sysj\conveyor_controller.sysj line: 281, column: 12
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 285, column: 16
                  S5321=3;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
              }
            }
            break;
          
          case 1 : 
            switch(S5335){
              case 0 : 
                if(!bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 270, column: 20
                  S5335=1;
                  if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 272, column: 23
                    System.out.println("*at pos5*");//sysj\conveyor_controller.sysj line: 273, column: 17
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 269, column: 13
                    S5321=2;
                    thread42550(tdone,ends);
                    thread42551(tdone,ends);
                    int biggest42552 = 0;
                    if(ends[31]>=biggest42552){
                      biggest42552=ends[31];
                    }
                    if(ends[32]>=biggest42552){
                      biggest42552=ends[32];
                    }
                    if(biggest42552 == 1){
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                    if(biggest42552 == 2){
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 281, column: 12
                      System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 285, column: 16
                      S5321=3;
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
                if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 272, column: 23
                  System.out.println("*at pos5*");//sysj\conveyor_controller.sysj line: 273, column: 17
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  ends[27]=2;
                  ;//sysj\conveyor_controller.sysj line: 269, column: 13
                  S5321=2;
                  thread42553(tdone,ends);
                  thread42554(tdone,ends);
                  int biggest42555 = 0;
                  if(ends[31]>=biggest42555){
                    biggest42555=ends[31];
                  }
                  if(ends[32]>=biggest42555){
                    biggest42555=ends[32];
                  }
                  if(biggest42555 == 1){
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  if(biggest42555 == 2){
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 281, column: 12
                    System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 285, column: 16
                    S5321=3;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread42556(tdone,ends);
            thread42557(tdone,ends);
            int biggest42558 = 0;
            if(ends[31]>=biggest42558){
              biggest42558=ends[31];
            }
            if(ends[32]>=biggest42558){
              biggest42558=ends[32];
            }
            if(biggest42558 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            if(biggest42558 == 2){
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 281, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 285, column: 16
              S5321=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest42558 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 285, column: 16
              S5321=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_controller.sysj line: 286, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\conveyor_controller.sysj line: 287, column: 16
              S5321=4;
              S5477=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 13
                rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 288, column: 13
                S5477=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S5472=0;
                if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 288, column: 13
                  rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 288, column: 13
                  S5472=1;
                  if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 288, column: 13
                    rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 288, column: 13
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 288, column: 13
                    S5321=5;
                    __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                    if(com.systemj.Timer.getMs() - __start_thread_27 >= 5){//sysj\conveyor_controller.sysj line: 244, column: 7
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 244, column: 7
                      S5321=6;
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
            switch(S5477){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 288, column: 13
                  S5477=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  switch(S5472){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 288, column: 13
                        rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 288, column: 13
                        S5472=1;
                        if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 288, column: 13
                          rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 288, column: 13
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 288, column: 13
                          S5321=5;
                          __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                          if(com.systemj.Timer.getMs() - __start_thread_27 >= 5){//sysj\conveyor_controller.sysj line: 244, column: 7
                            ends[27]=2;
                            ;//sysj\conveyor_controller.sysj line: 244, column: 7
                            S5321=6;
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
                      else {
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 288, column: 13
                        rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 288, column: 13
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 288, column: 13
                        S5321=5;
                        __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                        if(com.systemj.Timer.getMs() - __start_thread_27 >= 5){//sysj\conveyor_controller.sysj line: 244, column: 7
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 244, column: 7
                          S5321=6;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S5477=1;
                S5477=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 288, column: 13
                  S5477=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  S5472=0;
                  if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 288, column: 13
                    rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 288, column: 13
                    S5472=1;
                    if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 288, column: 13
                      rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 288, column: 13
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 288, column: 13
                      S5321=5;
                      __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                      if(com.systemj.Timer.getMs() - __start_thread_27 >= 5){//sysj\conveyor_controller.sysj line: 244, column: 7
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 244, column: 7
                        S5321=6;
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
            if(com.systemj.Timer.getMs() - __start_thread_27 >= 5){//sysj\conveyor_controller.sysj line: 244, column: 7
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 244, column: 7
              S5321=6;
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
          
          case 6 : 
            S5321=6;
            i_thread_27 = 0;//sysj\conveyor_controller.sysj line: 291, column: 10
            S5321=7;
            i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 294, column: 12
            if(i_thread_27 > 12){//sysj\conveyor_controller.sysj line: 295, column: 15
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 292, column: 10
              S5321=8;
              __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_27 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 244, column: 7
                ends[27]=2;
                ;//sysj\conveyor_controller.sysj line: 244, column: 7
                S5321=0;
                thread42559(tdone,ends);
                thread42560(tdone,ends);
                thread42561(tdone,ends);
                int biggest42562 = 0;
                if(ends[28]>=biggest42562){
                  biggest42562=ends[28];
                }
                if(ends[29]>=biggest42562){
                  biggest42562=ends[29];
                }
                if(ends[30]>=biggest42562){
                  biggest42562=ends[30];
                }
                if(biggest42562 == 1){
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
            i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 294, column: 12
            if(i_thread_27 > 12){//sysj\conveyor_controller.sysj line: 295, column: 15
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 292, column: 10
              S5321=8;
              __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_27 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 244, column: 7
                ends[27]=2;
                ;//sysj\conveyor_controller.sysj line: 244, column: 7
                S5321=0;
                thread42563(tdone,ends);
                thread42564(tdone,ends);
                thread42565(tdone,ends);
                int biggest42566 = 0;
                if(ends[28]>=biggest42566){
                  biggest42566=ends[28];
                }
                if(ends[29]>=biggest42566){
                  biggest42566=ends[29];
                }
                if(ends[30]>=biggest42566){
                  biggest42566=ends[30];
                }
                if(biggest42566 == 1){
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
            if(com.systemj.Timer.getMs() - __start_thread_27 >= (1) * 1000){//sysj\conveyor_controller.sysj line: 244, column: 7
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 244, column: 7
              S5321=0;
              thread42567(tdone,ends);
              thread42568(tdone,ends);
              thread42569(tdone,ends);
              int biggest42570 = 0;
              if(ends[28]>=biggest42570){
                biggest42570=ends[28];
              }
              if(ends[29]>=biggest42570){
                biggest42570=ends[29];
              }
              if(ends[30]>=biggest42570){
                biggest42570=ends[30];
              }
              if(biggest42570 == 1){
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

  public void thread42538(int [] tdone, int [] ends){
        S8171=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread42537(int [] tdone, int [] ends){
        S8168=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 364, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread42536(int [] tdone, int [] ends){
        S8201=1;
    S8175=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 362, column: 21
      thread42537(tdone,ends);
      thread42538(tdone,ends);
      int biggest42539 = 0;
      if(ends[51]>=biggest42539){
        biggest42539=ends[51];
      }
      if(ends[52]>=biggest42539){
        biggest42539=ends[52];
      }
      if(biggest42539 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S8175=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread42534(int [] tdone, int [] ends){
        S8133=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread42533(int [] tdone, int [] ends){
        S8130=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 346, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread42532(int [] tdone, int [] ends){
        S8163=1;
    S8137=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 344, column: 21
      thread42533(tdone,ends);
      thread42534(tdone,ends);
      int biggest42535 = 0;
      if(ends[48]>=biggest42535){
        biggest42535=ends[48];
      }
      if(ends[49]>=biggest42535){
        biggest42535=ends[49];
      }
      if(biggest42535 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S8137=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread42531(int [] tdone, int [] ends){
        S8203=1;
    thread42532(tdone,ends);
    thread42536(tdone,ends);
    int biggest42540 = 0;
    if(ends[47]>=biggest42540){
      biggest42540=ends[47];
    }
    if(ends[50]>=biggest42540){
      biggest42540=ends[50];
    }
    if(biggest42540 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread42529(int [] tdone, int [] ends){
        S8123=1;
    S8067=0;
    S8047=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
      S8047=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S8042=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 8
        S8042=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 329, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread42528(int [] tdone, int [] ends){
        S8040=1;
    S7984=0;
    S7964=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 319, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
      S7964=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7959=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 319, column: 7
        S7959=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 319, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 320, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 321, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
      }
      else {
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
      }
    }
  }

  public void thread42527(int [] tdone, int [] ends){
        S8125=1;
    thread42528(tdone,ends);
    thread42529(tdone,ends);
    int biggest42530 = 0;
    if(ends[44]>=biggest42530){
      biggest42530=ends[44];
    }
    if(ends[45]>=biggest42530){
      biggest42530=ends[45];
    }
    if(biggest42530 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread42524(int [] tdone, int [] ends){
        S7887=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7887=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread42523(int [] tdone, int [] ends){
        S7881=1;
    S7880=0;
    S7864=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7864=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7859=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7859=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7880=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
      else {
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
    }
  }

  public void thread42522(int [] tdone, int [] ends){
        S7955=1;
    S7889=0;
    thread42523(tdone,ends);
    thread42524(tdone,ends);
    int biggest42525 = 0;
    if(ends[41]>=biggest42525){
      biggest42525=ends[41];
    }
    if(ends[42]>=biggest42525){
      biggest42525=ends[42];
    }
    if(biggest42525 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread42520(int [] tdone, int [] ends){
        S7788=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7788=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread42519(int [] tdone, int [] ends){
        S7782=1;
    S7781=0;
    S7765=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7765=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7760=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7760=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7781=1;
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
      }
      else {
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
  }

  public void thread42518(int [] tdone, int [] ends){
        S7856=1;
    S7790=0;
    thread42519(tdone,ends);
    thread42520(tdone,ends);
    int biggest42521 = 0;
    if(ends[38]>=biggest42521){
      biggest42521=ends[38];
    }
    if(ends[39]>=biggest42521){
      biggest42521=ends[39];
    }
    if(biggest42521 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread42516(int [] tdone, int [] ends){
        S7689=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7689=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread42515(int [] tdone, int [] ends){
        S7683=1;
    S7682=0;
    S7666=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7666=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7661=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7661=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7682=1;
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
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

  public void thread42514(int [] tdone, int [] ends){
        S7757=1;
    S7691=0;
    thread42515(tdone,ends);
    thread42516(tdone,ends);
    int biggest42517 = 0;
    if(ends[35]>=biggest42517){
      biggest42517=ends[35];
    }
    if(ends[36]>=biggest42517){
      biggest42517=ends[36];
    }
    if(biggest42517 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread42513(int [] tdone, int [] ends){
        S7957=1;
    thread42514(tdone,ends);
    thread42518(tdone,ends);
    thread42522(tdone,ends);
    int biggest42526 = 0;
    if(ends[34]>=biggest42526){
      biggest42526=ends[34];
    }
    if(ends[37]>=biggest42526){
      biggest42526=ends[37];
    }
    if(ends[40]>=biggest42526){
      biggest42526=ends[40];
    }
    if(biggest42526 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42526 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42526 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread42511(int [] tdone, int [] ends){
        S5320=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread42510(int [] tdone, int [] ends){
        S5317=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread42509(int [] tdone, int [] ends){
        S5314=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread42508(int [] tdone, int [] ends){
        S7658=1;
    S5321=0;
    thread42509(tdone,ends);
    thread42510(tdone,ends);
    thread42511(tdone,ends);
    int biggest42512 = 0;
    if(ends[28]>=biggest42512){
      biggest42512=ends[28];
    }
    if(ends[29]>=biggest42512){
      biggest42512=ends[29];
    }
    if(ends[30]>=biggest42512){
      biggest42512=ends[30];
    }
    if(biggest42512 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread42504(int [] tdone, int [] ends){
        S8171=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread42503(int [] tdone, int [] ends){
        S8168=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 364, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread42502(int [] tdone, int [] ends){
        S8201=1;
    S8175=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 362, column: 21
      thread42503(tdone,ends);
      thread42504(tdone,ends);
      int biggest42505 = 0;
      if(ends[51]>=biggest42505){
        biggest42505=ends[51];
      }
      if(ends[52]>=biggest42505){
        biggest42505=ends[52];
      }
      if(biggest42505 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S8175=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread42500(int [] tdone, int [] ends){
        S8133=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread42499(int [] tdone, int [] ends){
        S8130=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 346, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread42498(int [] tdone, int [] ends){
        S8163=1;
    S8137=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 344, column: 21
      thread42499(tdone,ends);
      thread42500(tdone,ends);
      int biggest42501 = 0;
      if(ends[48]>=biggest42501){
        biggest42501=ends[48];
      }
      if(ends[49]>=biggest42501){
        biggest42501=ends[49];
      }
      if(biggest42501 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S8137=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread42497(int [] tdone, int [] ends){
        S8203=1;
    thread42498(tdone,ends);
    thread42502(tdone,ends);
    int biggest42506 = 0;
    if(ends[47]>=biggest42506){
      biggest42506=ends[47];
    }
    if(ends[50]>=biggest42506){
      biggest42506=ends[50];
    }
    if(biggest42506 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread42495(int [] tdone, int [] ends){
        S8123=1;
    S8067=0;
    S8047=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
      S8047=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S8042=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 8
        S8042=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 329, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread42494(int [] tdone, int [] ends){
        S8040=1;
    S7984=0;
    S7964=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 319, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
      S7964=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7959=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 319, column: 7
        S7959=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 319, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 320, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 321, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
      }
      else {
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
      }
    }
  }

  public void thread42493(int [] tdone, int [] ends){
        S8125=1;
    thread42494(tdone,ends);
    thread42495(tdone,ends);
    int biggest42496 = 0;
    if(ends[44]>=biggest42496){
      biggest42496=ends[44];
    }
    if(ends[45]>=biggest42496){
      biggest42496=ends[45];
    }
    if(biggest42496 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread42490(int [] tdone, int [] ends){
        S7887=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7887=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread42489(int [] tdone, int [] ends){
        S7881=1;
    S7880=0;
    S7864=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7864=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7859=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7859=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7880=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
      else {
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
    }
  }

  public void thread42488(int [] tdone, int [] ends){
        S7955=1;
    S7889=0;
    thread42489(tdone,ends);
    thread42490(tdone,ends);
    int biggest42491 = 0;
    if(ends[41]>=biggest42491){
      biggest42491=ends[41];
    }
    if(ends[42]>=biggest42491){
      biggest42491=ends[42];
    }
    if(biggest42491 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread42486(int [] tdone, int [] ends){
        S7788=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7788=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread42485(int [] tdone, int [] ends){
        S7782=1;
    S7781=0;
    S7765=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7765=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7760=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7760=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7781=1;
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
      }
      else {
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
  }

  public void thread42484(int [] tdone, int [] ends){
        S7856=1;
    S7790=0;
    thread42485(tdone,ends);
    thread42486(tdone,ends);
    int biggest42487 = 0;
    if(ends[38]>=biggest42487){
      biggest42487=ends[38];
    }
    if(ends[39]>=biggest42487){
      biggest42487=ends[39];
    }
    if(biggest42487 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread42482(int [] tdone, int [] ends){
        S7689=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7689=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread42481(int [] tdone, int [] ends){
        S7683=1;
    S7682=0;
    S7666=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7666=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7661=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7661=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7682=1;
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
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

  public void thread42480(int [] tdone, int [] ends){
        S7757=1;
    S7691=0;
    thread42481(tdone,ends);
    thread42482(tdone,ends);
    int biggest42483 = 0;
    if(ends[35]>=biggest42483){
      biggest42483=ends[35];
    }
    if(ends[36]>=biggest42483){
      biggest42483=ends[36];
    }
    if(biggest42483 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread42479(int [] tdone, int [] ends){
        S7957=1;
    thread42480(tdone,ends);
    thread42484(tdone,ends);
    thread42488(tdone,ends);
    int biggest42492 = 0;
    if(ends[34]>=biggest42492){
      biggest42492=ends[34];
    }
    if(ends[37]>=biggest42492){
      biggest42492=ends[37];
    }
    if(ends[40]>=biggest42492){
      biggest42492=ends[40];
    }
    if(biggest42492 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42492 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42492 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread42477(int [] tdone, int [] ends){
        S5320=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread42476(int [] tdone, int [] ends){
        S5317=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread42475(int [] tdone, int [] ends){
        S5314=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread42474(int [] tdone, int [] ends){
        S7658=1;
    S5321=0;
    thread42475(tdone,ends);
    thread42476(tdone,ends);
    thread42477(tdone,ends);
    int biggest42478 = 0;
    if(ends[28]>=biggest42478){
      biggest42478=ends[28];
    }
    if(ends[29]>=biggest42478){
      biggest42478=ends[29];
    }
    if(ends[30]>=biggest42478){
      biggest42478=ends[30];
    }
    if(biggest42478 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread42470(int [] tdone, int [] ends){
        S8171=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread42469(int [] tdone, int [] ends){
        S8168=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 364, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread42468(int [] tdone, int [] ends){
        S8201=1;
    S8175=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 362, column: 21
      thread42469(tdone,ends);
      thread42470(tdone,ends);
      int biggest42471 = 0;
      if(ends[51]>=biggest42471){
        biggest42471=ends[51];
      }
      if(ends[52]>=biggest42471){
        biggest42471=ends[52];
      }
      if(biggest42471 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S8175=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread42466(int [] tdone, int [] ends){
        S8133=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread42465(int [] tdone, int [] ends){
        S8130=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 346, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread42464(int [] tdone, int [] ends){
        S8163=1;
    S8137=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 344, column: 21
      thread42465(tdone,ends);
      thread42466(tdone,ends);
      int biggest42467 = 0;
      if(ends[48]>=biggest42467){
        biggest42467=ends[48];
      }
      if(ends[49]>=biggest42467){
        biggest42467=ends[49];
      }
      if(biggest42467 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S8137=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread42463(int [] tdone, int [] ends){
        S8203=1;
    thread42464(tdone,ends);
    thread42468(tdone,ends);
    int biggest42472 = 0;
    if(ends[47]>=biggest42472){
      biggest42472=ends[47];
    }
    if(ends[50]>=biggest42472){
      biggest42472=ends[50];
    }
    if(biggest42472 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread42461(int [] tdone, int [] ends){
        S8123=1;
    S8067=0;
    S8047=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
      S8047=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S8042=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 8
        S8042=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 329, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread42460(int [] tdone, int [] ends){
        S8040=1;
    S7984=0;
    S7964=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 319, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
      S7964=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7959=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 319, column: 7
        S7959=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 319, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 320, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 321, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
      }
      else {
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
      }
    }
  }

  public void thread42459(int [] tdone, int [] ends){
        S8125=1;
    thread42460(tdone,ends);
    thread42461(tdone,ends);
    int biggest42462 = 0;
    if(ends[44]>=biggest42462){
      biggest42462=ends[44];
    }
    if(ends[45]>=biggest42462){
      biggest42462=ends[45];
    }
    if(biggest42462 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread42456(int [] tdone, int [] ends){
        S7887=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7887=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread42455(int [] tdone, int [] ends){
        S7881=1;
    S7880=0;
    S7864=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7864=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7859=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7859=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7880=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
      else {
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
    }
  }

  public void thread42454(int [] tdone, int [] ends){
        S7955=1;
    S7889=0;
    thread42455(tdone,ends);
    thread42456(tdone,ends);
    int biggest42457 = 0;
    if(ends[41]>=biggest42457){
      biggest42457=ends[41];
    }
    if(ends[42]>=biggest42457){
      biggest42457=ends[42];
    }
    if(biggest42457 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread42452(int [] tdone, int [] ends){
        S7788=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7788=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread42451(int [] tdone, int [] ends){
        S7782=1;
    S7781=0;
    S7765=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7765=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7760=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7760=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7781=1;
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
      }
      else {
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
  }

  public void thread42450(int [] tdone, int [] ends){
        S7856=1;
    S7790=0;
    thread42451(tdone,ends);
    thread42452(tdone,ends);
    int biggest42453 = 0;
    if(ends[38]>=biggest42453){
      biggest42453=ends[38];
    }
    if(ends[39]>=biggest42453){
      biggest42453=ends[39];
    }
    if(biggest42453 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread42448(int [] tdone, int [] ends){
        S7689=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7689=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread42447(int [] tdone, int [] ends){
        S7683=1;
    S7682=0;
    S7666=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7666=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7661=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7661=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7682=1;
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
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

  public void thread42446(int [] tdone, int [] ends){
        S7757=1;
    S7691=0;
    thread42447(tdone,ends);
    thread42448(tdone,ends);
    int biggest42449 = 0;
    if(ends[35]>=biggest42449){
      biggest42449=ends[35];
    }
    if(ends[36]>=biggest42449){
      biggest42449=ends[36];
    }
    if(biggest42449 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread42445(int [] tdone, int [] ends){
        S7957=1;
    thread42446(tdone,ends);
    thread42450(tdone,ends);
    thread42454(tdone,ends);
    int biggest42458 = 0;
    if(ends[34]>=biggest42458){
      biggest42458=ends[34];
    }
    if(ends[37]>=biggest42458){
      biggest42458=ends[37];
    }
    if(ends[40]>=biggest42458){
      biggest42458=ends[40];
    }
    if(biggest42458 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42458 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42458 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread42443(int [] tdone, int [] ends){
        S5320=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread42442(int [] tdone, int [] ends){
        S5317=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread42441(int [] tdone, int [] ends){
        S5314=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread42440(int [] tdone, int [] ends){
        S7658=1;
    S5321=0;
    thread42441(tdone,ends);
    thread42442(tdone,ends);
    thread42443(tdone,ends);
    int biggest42444 = 0;
    if(ends[28]>=biggest42444){
      biggest42444=ends[28];
    }
    if(ends[29]>=biggest42444){
      biggest42444=ends[29];
    }
    if(ends[30]>=biggest42444){
      biggest42444=ends[30];
    }
    if(biggest42444 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread42436(int [] tdone, int [] ends){
        S8171=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread42435(int [] tdone, int [] ends){
        S8168=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 364, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread42434(int [] tdone, int [] ends){
        S8201=1;
    S8175=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 362, column: 21
      thread42435(tdone,ends);
      thread42436(tdone,ends);
      int biggest42437 = 0;
      if(ends[51]>=biggest42437){
        biggest42437=ends[51];
      }
      if(ends[52]>=biggest42437){
        biggest42437=ends[52];
      }
      if(biggest42437 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S8175=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread42432(int [] tdone, int [] ends){
        S8133=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread42431(int [] tdone, int [] ends){
        S8130=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 346, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread42430(int [] tdone, int [] ends){
        S8163=1;
    S8137=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 344, column: 21
      thread42431(tdone,ends);
      thread42432(tdone,ends);
      int biggest42433 = 0;
      if(ends[48]>=biggest42433){
        biggest42433=ends[48];
      }
      if(ends[49]>=biggest42433){
        biggest42433=ends[49];
      }
      if(biggest42433 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S8137=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread42429(int [] tdone, int [] ends){
        S8203=1;
    thread42430(tdone,ends);
    thread42434(tdone,ends);
    int biggest42438 = 0;
    if(ends[47]>=biggest42438){
      biggest42438=ends[47];
    }
    if(ends[50]>=biggest42438){
      biggest42438=ends[50];
    }
    if(biggest42438 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread42427(int [] tdone, int [] ends){
        S8123=1;
    S8067=0;
    S8047=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
      S8047=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S8042=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 8
        S8042=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 329, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread42426(int [] tdone, int [] ends){
        S8040=1;
    S7984=0;
    S7964=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 319, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
      S7964=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7959=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 319, column: 7
        S7959=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 319, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 320, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 321, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
      }
      else {
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
      }
    }
  }

  public void thread42425(int [] tdone, int [] ends){
        S8125=1;
    thread42426(tdone,ends);
    thread42427(tdone,ends);
    int biggest42428 = 0;
    if(ends[44]>=biggest42428){
      biggest42428=ends[44];
    }
    if(ends[45]>=biggest42428){
      biggest42428=ends[45];
    }
    if(biggest42428 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread42422(int [] tdone, int [] ends){
        S7887=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7887=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread42421(int [] tdone, int [] ends){
        S7881=1;
    S7880=0;
    S7864=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7864=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7859=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7859=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7880=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
      else {
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
    }
  }

  public void thread42420(int [] tdone, int [] ends){
        S7955=1;
    S7889=0;
    thread42421(tdone,ends);
    thread42422(tdone,ends);
    int biggest42423 = 0;
    if(ends[41]>=biggest42423){
      biggest42423=ends[41];
    }
    if(ends[42]>=biggest42423){
      biggest42423=ends[42];
    }
    if(biggest42423 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread42418(int [] tdone, int [] ends){
        S7788=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7788=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread42417(int [] tdone, int [] ends){
        S7782=1;
    S7781=0;
    S7765=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7765=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7760=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7760=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7781=1;
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
      }
      else {
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
  }

  public void thread42416(int [] tdone, int [] ends){
        S7856=1;
    S7790=0;
    thread42417(tdone,ends);
    thread42418(tdone,ends);
    int biggest42419 = 0;
    if(ends[38]>=biggest42419){
      biggest42419=ends[38];
    }
    if(ends[39]>=biggest42419){
      biggest42419=ends[39];
    }
    if(biggest42419 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread42414(int [] tdone, int [] ends){
        S7689=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7689=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread42413(int [] tdone, int [] ends){
        S7683=1;
    S7682=0;
    S7666=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7666=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7661=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7661=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7682=1;
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
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

  public void thread42412(int [] tdone, int [] ends){
        S7757=1;
    S7691=0;
    thread42413(tdone,ends);
    thread42414(tdone,ends);
    int biggest42415 = 0;
    if(ends[35]>=biggest42415){
      biggest42415=ends[35];
    }
    if(ends[36]>=biggest42415){
      biggest42415=ends[36];
    }
    if(biggest42415 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread42411(int [] tdone, int [] ends){
        S7957=1;
    thread42412(tdone,ends);
    thread42416(tdone,ends);
    thread42420(tdone,ends);
    int biggest42424 = 0;
    if(ends[34]>=biggest42424){
      biggest42424=ends[34];
    }
    if(ends[37]>=biggest42424){
      biggest42424=ends[37];
    }
    if(ends[40]>=biggest42424){
      biggest42424=ends[40];
    }
    if(biggest42424 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42424 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42424 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread42409(int [] tdone, int [] ends){
        S5320=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread42408(int [] tdone, int [] ends){
        S5317=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread42407(int [] tdone, int [] ends){
        S5314=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread42406(int [] tdone, int [] ends){
        S7658=1;
    S5321=0;
    thread42407(tdone,ends);
    thread42408(tdone,ends);
    thread42409(tdone,ends);
    int biggest42410 = 0;
    if(ends[28]>=biggest42410){
      biggest42410=ends[28];
    }
    if(ends[29]>=biggest42410){
      biggest42410=ends[29];
    }
    if(ends[30]>=biggest42410){
      biggest42410=ends[30];
    }
    if(biggest42410 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread42402(int [] tdone, int [] ends){
        S8171=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread42401(int [] tdone, int [] ends){
        S8168=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 364, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread42400(int [] tdone, int [] ends){
        S8201=1;
    S8175=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 362, column: 21
      thread42401(tdone,ends);
      thread42402(tdone,ends);
      int biggest42403 = 0;
      if(ends[51]>=biggest42403){
        biggest42403=ends[51];
      }
      if(ends[52]>=biggest42403){
        biggest42403=ends[52];
      }
      if(biggest42403 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S8175=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread42398(int [] tdone, int [] ends){
        S8133=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread42397(int [] tdone, int [] ends){
        S8130=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 346, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread42396(int [] tdone, int [] ends){
        S8163=1;
    S8137=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 344, column: 21
      thread42397(tdone,ends);
      thread42398(tdone,ends);
      int biggest42399 = 0;
      if(ends[48]>=biggest42399){
        biggest42399=ends[48];
      }
      if(ends[49]>=biggest42399){
        biggest42399=ends[49];
      }
      if(biggest42399 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S8137=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread42395(int [] tdone, int [] ends){
        S8203=1;
    thread42396(tdone,ends);
    thread42400(tdone,ends);
    int biggest42404 = 0;
    if(ends[47]>=biggest42404){
      biggest42404=ends[47];
    }
    if(ends[50]>=biggest42404){
      biggest42404=ends[50];
    }
    if(biggest42404 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread42393(int [] tdone, int [] ends){
        S8123=1;
    S8067=0;
    S8047=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
      S8047=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S8042=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 8
        S8042=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 329, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread42392(int [] tdone, int [] ends){
        S8040=1;
    S7984=0;
    S7964=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 319, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
      S7964=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7959=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 319, column: 7
        S7959=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 319, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 320, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 321, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
      }
      else {
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
      }
    }
  }

  public void thread42391(int [] tdone, int [] ends){
        S8125=1;
    thread42392(tdone,ends);
    thread42393(tdone,ends);
    int biggest42394 = 0;
    if(ends[44]>=biggest42394){
      biggest42394=ends[44];
    }
    if(ends[45]>=biggest42394){
      biggest42394=ends[45];
    }
    if(biggest42394 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread42388(int [] tdone, int [] ends){
        S7887=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7887=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread42387(int [] tdone, int [] ends){
        S7881=1;
    S7880=0;
    S7864=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7864=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7859=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7859=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7880=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
      else {
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
    }
  }

  public void thread42386(int [] tdone, int [] ends){
        S7955=1;
    S7889=0;
    thread42387(tdone,ends);
    thread42388(tdone,ends);
    int biggest42389 = 0;
    if(ends[41]>=biggest42389){
      biggest42389=ends[41];
    }
    if(ends[42]>=biggest42389){
      biggest42389=ends[42];
    }
    if(biggest42389 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread42384(int [] tdone, int [] ends){
        S7788=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7788=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread42383(int [] tdone, int [] ends){
        S7782=1;
    S7781=0;
    S7765=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7765=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7760=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7760=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7781=1;
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
      }
      else {
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
  }

  public void thread42382(int [] tdone, int [] ends){
        S7856=1;
    S7790=0;
    thread42383(tdone,ends);
    thread42384(tdone,ends);
    int biggest42385 = 0;
    if(ends[38]>=biggest42385){
      biggest42385=ends[38];
    }
    if(ends[39]>=biggest42385){
      biggest42385=ends[39];
    }
    if(biggest42385 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread42380(int [] tdone, int [] ends){
        S7689=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7689=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread42379(int [] tdone, int [] ends){
        S7683=1;
    S7682=0;
    S7666=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7666=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7661=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7661=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7682=1;
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
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

  public void thread42378(int [] tdone, int [] ends){
        S7757=1;
    S7691=0;
    thread42379(tdone,ends);
    thread42380(tdone,ends);
    int biggest42381 = 0;
    if(ends[35]>=biggest42381){
      biggest42381=ends[35];
    }
    if(ends[36]>=biggest42381){
      biggest42381=ends[36];
    }
    if(biggest42381 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread42377(int [] tdone, int [] ends){
        S7957=1;
    thread42378(tdone,ends);
    thread42382(tdone,ends);
    thread42386(tdone,ends);
    int biggest42390 = 0;
    if(ends[34]>=biggest42390){
      biggest42390=ends[34];
    }
    if(ends[37]>=biggest42390){
      biggest42390=ends[37];
    }
    if(ends[40]>=biggest42390){
      biggest42390=ends[40];
    }
    if(biggest42390 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42390 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42390 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread42375(int [] tdone, int [] ends){
        S5320=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread42374(int [] tdone, int [] ends){
        S5317=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread42373(int [] tdone, int [] ends){
        S5314=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread42372(int [] tdone, int [] ends){
        S7658=1;
    S5321=0;
    thread42373(tdone,ends);
    thread42374(tdone,ends);
    thread42375(tdone,ends);
    int biggest42376 = 0;
    if(ends[28]>=biggest42376){
      biggest42376=ends[28];
    }
    if(ends[29]>=biggest42376){
      biggest42376=ends[29];
    }
    if(ends[30]>=biggest42376){
      biggest42376=ends[30];
    }
    if(biggest42376 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread42368(int [] tdone, int [] ends){
        S8171=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread42367(int [] tdone, int [] ends){
        S8168=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 364, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread42366(int [] tdone, int [] ends){
        S8201=1;
    S8175=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 362, column: 21
      thread42367(tdone,ends);
      thread42368(tdone,ends);
      int biggest42369 = 0;
      if(ends[51]>=biggest42369){
        biggest42369=ends[51];
      }
      if(ends[52]>=biggest42369){
        biggest42369=ends[52];
      }
      if(biggest42369 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S8175=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread42364(int [] tdone, int [] ends){
        S8133=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread42363(int [] tdone, int [] ends){
        S8130=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 346, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread42362(int [] tdone, int [] ends){
        S8163=1;
    S8137=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 344, column: 21
      thread42363(tdone,ends);
      thread42364(tdone,ends);
      int biggest42365 = 0;
      if(ends[48]>=biggest42365){
        biggest42365=ends[48];
      }
      if(ends[49]>=biggest42365){
        biggest42365=ends[49];
      }
      if(biggest42365 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S8137=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread42361(int [] tdone, int [] ends){
        S8203=1;
    thread42362(tdone,ends);
    thread42366(tdone,ends);
    int biggest42370 = 0;
    if(ends[47]>=biggest42370){
      biggest42370=ends[47];
    }
    if(ends[50]>=biggest42370){
      biggest42370=ends[50];
    }
    if(biggest42370 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread42359(int [] tdone, int [] ends){
        S8123=1;
    S8067=0;
    S8047=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
      S8047=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S8042=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 8
        S8042=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 329, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread42358(int [] tdone, int [] ends){
        S8040=1;
    S7984=0;
    S7964=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 319, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
      S7964=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7959=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 319, column: 7
        S7959=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 319, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 320, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 321, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
      }
      else {
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
      }
    }
  }

  public void thread42357(int [] tdone, int [] ends){
        S8125=1;
    thread42358(tdone,ends);
    thread42359(tdone,ends);
    int biggest42360 = 0;
    if(ends[44]>=biggest42360){
      biggest42360=ends[44];
    }
    if(ends[45]>=biggest42360){
      biggest42360=ends[45];
    }
    if(biggest42360 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread42354(int [] tdone, int [] ends){
        S7887=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7887=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread42353(int [] tdone, int [] ends){
        S7881=1;
    S7880=0;
    S7864=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7864=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7859=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7859=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7880=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
      else {
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
    }
  }

  public void thread42352(int [] tdone, int [] ends){
        S7955=1;
    S7889=0;
    thread42353(tdone,ends);
    thread42354(tdone,ends);
    int biggest42355 = 0;
    if(ends[41]>=biggest42355){
      biggest42355=ends[41];
    }
    if(ends[42]>=biggest42355){
      biggest42355=ends[42];
    }
    if(biggest42355 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread42350(int [] tdone, int [] ends){
        S7788=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7788=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread42349(int [] tdone, int [] ends){
        S7782=1;
    S7781=0;
    S7765=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7765=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7760=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7760=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7781=1;
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
      }
      else {
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
  }

  public void thread42348(int [] tdone, int [] ends){
        S7856=1;
    S7790=0;
    thread42349(tdone,ends);
    thread42350(tdone,ends);
    int biggest42351 = 0;
    if(ends[38]>=biggest42351){
      biggest42351=ends[38];
    }
    if(ends[39]>=biggest42351){
      biggest42351=ends[39];
    }
    if(biggest42351 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread42346(int [] tdone, int [] ends){
        S7689=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7689=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread42345(int [] tdone, int [] ends){
        S7683=1;
    S7682=0;
    S7666=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7666=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7661=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7661=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7682=1;
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
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

  public void thread42344(int [] tdone, int [] ends){
        S7757=1;
    S7691=0;
    thread42345(tdone,ends);
    thread42346(tdone,ends);
    int biggest42347 = 0;
    if(ends[35]>=biggest42347){
      biggest42347=ends[35];
    }
    if(ends[36]>=biggest42347){
      biggest42347=ends[36];
    }
    if(biggest42347 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread42343(int [] tdone, int [] ends){
        S7957=1;
    thread42344(tdone,ends);
    thread42348(tdone,ends);
    thread42352(tdone,ends);
    int biggest42356 = 0;
    if(ends[34]>=biggest42356){
      biggest42356=ends[34];
    }
    if(ends[37]>=biggest42356){
      biggest42356=ends[37];
    }
    if(ends[40]>=biggest42356){
      biggest42356=ends[40];
    }
    if(biggest42356 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42356 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42356 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread42341(int [] tdone, int [] ends){
        S5320=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread42340(int [] tdone, int [] ends){
        S5317=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread42339(int [] tdone, int [] ends){
        S5314=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread42338(int [] tdone, int [] ends){
        S7658=1;
    S5321=0;
    thread42339(tdone,ends);
    thread42340(tdone,ends);
    thread42341(tdone,ends);
    int biggest42342 = 0;
    if(ends[28]>=biggest42342){
      biggest42342=ends[28];
    }
    if(ends[29]>=biggest42342){
      biggest42342=ends[29];
    }
    if(ends[30]>=biggest42342){
      biggest42342=ends[30];
    }
    if(biggest42342 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread42334(int [] tdone, int [] ends){
        S8171=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread42333(int [] tdone, int [] ends){
        S8168=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 364, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread42332(int [] tdone, int [] ends){
        S8201=1;
    S8175=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 362, column: 21
      thread42333(tdone,ends);
      thread42334(tdone,ends);
      int biggest42335 = 0;
      if(ends[51]>=biggest42335){
        biggest42335=ends[51];
      }
      if(ends[52]>=biggest42335){
        biggest42335=ends[52];
      }
      if(biggest42335 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S8175=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread42330(int [] tdone, int [] ends){
        S8133=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread42329(int [] tdone, int [] ends){
        S8130=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 346, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread42328(int [] tdone, int [] ends){
        S8163=1;
    S8137=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 344, column: 21
      thread42329(tdone,ends);
      thread42330(tdone,ends);
      int biggest42331 = 0;
      if(ends[48]>=biggest42331){
        biggest42331=ends[48];
      }
      if(ends[49]>=biggest42331){
        biggest42331=ends[49];
      }
      if(biggest42331 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S8137=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread42327(int [] tdone, int [] ends){
        S8203=1;
    thread42328(tdone,ends);
    thread42332(tdone,ends);
    int biggest42336 = 0;
    if(ends[47]>=biggest42336){
      biggest42336=ends[47];
    }
    if(ends[50]>=biggest42336){
      biggest42336=ends[50];
    }
    if(biggest42336 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread42325(int [] tdone, int [] ends){
        S8123=1;
    S8067=0;
    S8047=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
      S8047=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S8042=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 8
        S8042=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 329, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread42324(int [] tdone, int [] ends){
        S8040=1;
    S7984=0;
    S7964=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 319, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
      S7964=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7959=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 319, column: 7
        S7959=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 319, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 320, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 321, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
      }
      else {
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
      }
    }
  }

  public void thread42323(int [] tdone, int [] ends){
        S8125=1;
    thread42324(tdone,ends);
    thread42325(tdone,ends);
    int biggest42326 = 0;
    if(ends[44]>=biggest42326){
      biggest42326=ends[44];
    }
    if(ends[45]>=biggest42326){
      biggest42326=ends[45];
    }
    if(biggest42326 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread42320(int [] tdone, int [] ends){
        S7887=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7887=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread42319(int [] tdone, int [] ends){
        S7881=1;
    S7880=0;
    S7864=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7864=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7859=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7859=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7880=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
      else {
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
    }
  }

  public void thread42318(int [] tdone, int [] ends){
        S7955=1;
    S7889=0;
    thread42319(tdone,ends);
    thread42320(tdone,ends);
    int biggest42321 = 0;
    if(ends[41]>=biggest42321){
      biggest42321=ends[41];
    }
    if(ends[42]>=biggest42321){
      biggest42321=ends[42];
    }
    if(biggest42321 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread42316(int [] tdone, int [] ends){
        S7788=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7788=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread42315(int [] tdone, int [] ends){
        S7782=1;
    S7781=0;
    S7765=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7765=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7760=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7760=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7781=1;
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
      }
      else {
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
  }

  public void thread42314(int [] tdone, int [] ends){
        S7856=1;
    S7790=0;
    thread42315(tdone,ends);
    thread42316(tdone,ends);
    int biggest42317 = 0;
    if(ends[38]>=biggest42317){
      biggest42317=ends[38];
    }
    if(ends[39]>=biggest42317){
      biggest42317=ends[39];
    }
    if(biggest42317 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread42312(int [] tdone, int [] ends){
        S7689=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7689=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread42311(int [] tdone, int [] ends){
        S7683=1;
    S7682=0;
    S7666=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7666=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7661=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7661=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7682=1;
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
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

  public void thread42310(int [] tdone, int [] ends){
        S7757=1;
    S7691=0;
    thread42311(tdone,ends);
    thread42312(tdone,ends);
    int biggest42313 = 0;
    if(ends[35]>=biggest42313){
      biggest42313=ends[35];
    }
    if(ends[36]>=biggest42313){
      biggest42313=ends[36];
    }
    if(biggest42313 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread42309(int [] tdone, int [] ends){
        S7957=1;
    thread42310(tdone,ends);
    thread42314(tdone,ends);
    thread42318(tdone,ends);
    int biggest42322 = 0;
    if(ends[34]>=biggest42322){
      biggest42322=ends[34];
    }
    if(ends[37]>=biggest42322){
      biggest42322=ends[37];
    }
    if(ends[40]>=biggest42322){
      biggest42322=ends[40];
    }
    if(biggest42322 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42322 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42322 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread42307(int [] tdone, int [] ends){
        S5320=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread42306(int [] tdone, int [] ends){
        S5317=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread42305(int [] tdone, int [] ends){
        S5314=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread42304(int [] tdone, int [] ends){
        S7658=1;
    S5321=0;
    thread42305(tdone,ends);
    thread42306(tdone,ends);
    thread42307(tdone,ends);
    int biggest42308 = 0;
    if(ends[28]>=biggest42308){
      biggest42308=ends[28];
    }
    if(ends[29]>=biggest42308){
      biggest42308=ends[29];
    }
    if(ends[30]>=biggest42308){
      biggest42308=ends[30];
    }
    if(biggest42308 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread42300(int [] tdone, int [] ends){
        S8171=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread42299(int [] tdone, int [] ends){
        S8168=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 364, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread42298(int [] tdone, int [] ends){
        S8201=1;
    S8175=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 362, column: 21
      thread42299(tdone,ends);
      thread42300(tdone,ends);
      int biggest42301 = 0;
      if(ends[51]>=biggest42301){
        biggest42301=ends[51];
      }
      if(ends[52]>=biggest42301){
        biggest42301=ends[52];
      }
      if(biggest42301 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S8175=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread42296(int [] tdone, int [] ends){
        S8133=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread42295(int [] tdone, int [] ends){
        S8130=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 346, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread42294(int [] tdone, int [] ends){
        S8163=1;
    S8137=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 344, column: 21
      thread42295(tdone,ends);
      thread42296(tdone,ends);
      int biggest42297 = 0;
      if(ends[48]>=biggest42297){
        biggest42297=ends[48];
      }
      if(ends[49]>=biggest42297){
        biggest42297=ends[49];
      }
      if(biggest42297 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S8137=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread42293(int [] tdone, int [] ends){
        S8203=1;
    thread42294(tdone,ends);
    thread42298(tdone,ends);
    int biggest42302 = 0;
    if(ends[47]>=biggest42302){
      biggest42302=ends[47];
    }
    if(ends[50]>=biggest42302){
      biggest42302=ends[50];
    }
    if(biggest42302 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread42291(int [] tdone, int [] ends){
        S8123=1;
    S8067=0;
    S8047=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
      S8047=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S8042=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 8
        S8042=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 329, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread42290(int [] tdone, int [] ends){
        S8040=1;
    S7984=0;
    S7964=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 319, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
      S7964=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7959=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 319, column: 7
        S7959=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 319, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 320, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 321, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
      }
      else {
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
      }
    }
  }

  public void thread42289(int [] tdone, int [] ends){
        S8125=1;
    thread42290(tdone,ends);
    thread42291(tdone,ends);
    int biggest42292 = 0;
    if(ends[44]>=biggest42292){
      biggest42292=ends[44];
    }
    if(ends[45]>=biggest42292){
      biggest42292=ends[45];
    }
    if(biggest42292 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread42286(int [] tdone, int [] ends){
        S7887=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7887=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread42285(int [] tdone, int [] ends){
        S7881=1;
    S7880=0;
    S7864=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7864=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7859=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7859=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7880=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
      else {
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
    }
  }

  public void thread42284(int [] tdone, int [] ends){
        S7955=1;
    S7889=0;
    thread42285(tdone,ends);
    thread42286(tdone,ends);
    int biggest42287 = 0;
    if(ends[41]>=biggest42287){
      biggest42287=ends[41];
    }
    if(ends[42]>=biggest42287){
      biggest42287=ends[42];
    }
    if(biggest42287 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread42282(int [] tdone, int [] ends){
        S7788=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7788=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread42281(int [] tdone, int [] ends){
        S7782=1;
    S7781=0;
    S7765=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7765=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7760=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7760=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7781=1;
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
      }
      else {
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
  }

  public void thread42280(int [] tdone, int [] ends){
        S7856=1;
    S7790=0;
    thread42281(tdone,ends);
    thread42282(tdone,ends);
    int biggest42283 = 0;
    if(ends[38]>=biggest42283){
      biggest42283=ends[38];
    }
    if(ends[39]>=biggest42283){
      biggest42283=ends[39];
    }
    if(biggest42283 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread42278(int [] tdone, int [] ends){
        S7689=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7689=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread42277(int [] tdone, int [] ends){
        S7683=1;
    S7682=0;
    S7666=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7666=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7661=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7661=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7682=1;
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
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

  public void thread42276(int [] tdone, int [] ends){
        S7757=1;
    S7691=0;
    thread42277(tdone,ends);
    thread42278(tdone,ends);
    int biggest42279 = 0;
    if(ends[35]>=biggest42279){
      biggest42279=ends[35];
    }
    if(ends[36]>=biggest42279){
      biggest42279=ends[36];
    }
    if(biggest42279 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread42275(int [] tdone, int [] ends){
        S7957=1;
    thread42276(tdone,ends);
    thread42280(tdone,ends);
    thread42284(tdone,ends);
    int biggest42288 = 0;
    if(ends[34]>=biggest42288){
      biggest42288=ends[34];
    }
    if(ends[37]>=biggest42288){
      biggest42288=ends[37];
    }
    if(ends[40]>=biggest42288){
      biggest42288=ends[40];
    }
    if(biggest42288 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42288 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42288 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread42273(int [] tdone, int [] ends){
        S5320=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread42272(int [] tdone, int [] ends){
        S5317=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread42271(int [] tdone, int [] ends){
        S5314=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread42270(int [] tdone, int [] ends){
        S7658=1;
    S5321=0;
    thread42271(tdone,ends);
    thread42272(tdone,ends);
    thread42273(tdone,ends);
    int biggest42274 = 0;
    if(ends[28]>=biggest42274){
      biggest42274=ends[28];
    }
    if(ends[29]>=biggest42274){
      biggest42274=ends[29];
    }
    if(ends[30]>=biggest42274){
      biggest42274=ends[30];
    }
    if(biggest42274 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread42266(int [] tdone, int [] ends){
        S8171=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread42265(int [] tdone, int [] ends){
        S8168=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 364, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread42264(int [] tdone, int [] ends){
        S8201=1;
    S8175=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 362, column: 21
      thread42265(tdone,ends);
      thread42266(tdone,ends);
      int biggest42267 = 0;
      if(ends[51]>=biggest42267){
        biggest42267=ends[51];
      }
      if(ends[52]>=biggest42267){
        biggest42267=ends[52];
      }
      if(biggest42267 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S8175=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread42262(int [] tdone, int [] ends){
        S8133=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread42261(int [] tdone, int [] ends){
        S8130=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 346, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread42260(int [] tdone, int [] ends){
        S8163=1;
    S8137=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 344, column: 21
      thread42261(tdone,ends);
      thread42262(tdone,ends);
      int biggest42263 = 0;
      if(ends[48]>=biggest42263){
        biggest42263=ends[48];
      }
      if(ends[49]>=biggest42263){
        biggest42263=ends[49];
      }
      if(biggest42263 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S8137=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread42259(int [] tdone, int [] ends){
        S8203=1;
    thread42260(tdone,ends);
    thread42264(tdone,ends);
    int biggest42268 = 0;
    if(ends[47]>=biggest42268){
      biggest42268=ends[47];
    }
    if(ends[50]>=biggest42268){
      biggest42268=ends[50];
    }
    if(biggest42268 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread42257(int [] tdone, int [] ends){
        S8123=1;
    S8067=0;
    S8047=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
      S8047=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S8042=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 8
        S8042=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 329, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread42256(int [] tdone, int [] ends){
        S8040=1;
    S7984=0;
    S7964=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 319, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
      S7964=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7959=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 319, column: 7
        S7959=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 319, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 320, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 321, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
      }
      else {
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
      }
    }
  }

  public void thread42255(int [] tdone, int [] ends){
        S8125=1;
    thread42256(tdone,ends);
    thread42257(tdone,ends);
    int biggest42258 = 0;
    if(ends[44]>=biggest42258){
      biggest42258=ends[44];
    }
    if(ends[45]>=biggest42258){
      biggest42258=ends[45];
    }
    if(biggest42258 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread42252(int [] tdone, int [] ends){
        S7887=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7887=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread42251(int [] tdone, int [] ends){
        S7881=1;
    S7880=0;
    S7864=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7864=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7859=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7859=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7880=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
      else {
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
    }
  }

  public void thread42250(int [] tdone, int [] ends){
        S7955=1;
    S7889=0;
    thread42251(tdone,ends);
    thread42252(tdone,ends);
    int biggest42253 = 0;
    if(ends[41]>=biggest42253){
      biggest42253=ends[41];
    }
    if(ends[42]>=biggest42253){
      biggest42253=ends[42];
    }
    if(biggest42253 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread42248(int [] tdone, int [] ends){
        S7788=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7788=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread42247(int [] tdone, int [] ends){
        S7782=1;
    S7781=0;
    S7765=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7765=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7760=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7760=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7781=1;
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
      }
      else {
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
  }

  public void thread42246(int [] tdone, int [] ends){
        S7856=1;
    S7790=0;
    thread42247(tdone,ends);
    thread42248(tdone,ends);
    int biggest42249 = 0;
    if(ends[38]>=biggest42249){
      biggest42249=ends[38];
    }
    if(ends[39]>=biggest42249){
      biggest42249=ends[39];
    }
    if(biggest42249 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread42244(int [] tdone, int [] ends){
        S7689=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7689=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread42243(int [] tdone, int [] ends){
        S7683=1;
    S7682=0;
    S7666=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7666=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7661=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7661=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7682=1;
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
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

  public void thread42242(int [] tdone, int [] ends){
        S7757=1;
    S7691=0;
    thread42243(tdone,ends);
    thread42244(tdone,ends);
    int biggest42245 = 0;
    if(ends[35]>=biggest42245){
      biggest42245=ends[35];
    }
    if(ends[36]>=biggest42245){
      biggest42245=ends[36];
    }
    if(biggest42245 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread42241(int [] tdone, int [] ends){
        S7957=1;
    thread42242(tdone,ends);
    thread42246(tdone,ends);
    thread42250(tdone,ends);
    int biggest42254 = 0;
    if(ends[34]>=biggest42254){
      biggest42254=ends[34];
    }
    if(ends[37]>=biggest42254){
      biggest42254=ends[37];
    }
    if(ends[40]>=biggest42254){
      biggest42254=ends[40];
    }
    if(biggest42254 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42254 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42254 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread42239(int [] tdone, int [] ends){
        S5320=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread42238(int [] tdone, int [] ends){
        S5317=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread42237(int [] tdone, int [] ends){
        S5314=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread42236(int [] tdone, int [] ends){
        S7658=1;
    S5321=0;
    thread42237(tdone,ends);
    thread42238(tdone,ends);
    thread42239(tdone,ends);
    int biggest42240 = 0;
    if(ends[28]>=biggest42240){
      biggest42240=ends[28];
    }
    if(ends[29]>=biggest42240){
      biggest42240=ends[29];
    }
    if(ends[30]>=biggest42240){
      biggest42240=ends[30];
    }
    if(biggest42240 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread42232(int [] tdone, int [] ends){
        S8171=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread42231(int [] tdone, int [] ends){
        S8168=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 364, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread42230(int [] tdone, int [] ends){
        S8201=1;
    S8175=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 362, column: 21
      thread42231(tdone,ends);
      thread42232(tdone,ends);
      int biggest42233 = 0;
      if(ends[51]>=biggest42233){
        biggest42233=ends[51];
      }
      if(ends[52]>=biggest42233){
        biggest42233=ends[52];
      }
      if(biggest42233 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S8175=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread42228(int [] tdone, int [] ends){
        S8133=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread42227(int [] tdone, int [] ends){
        S8130=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 346, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread42226(int [] tdone, int [] ends){
        S8163=1;
    S8137=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 344, column: 21
      thread42227(tdone,ends);
      thread42228(tdone,ends);
      int biggest42229 = 0;
      if(ends[48]>=biggest42229){
        biggest42229=ends[48];
      }
      if(ends[49]>=biggest42229){
        biggest42229=ends[49];
      }
      if(biggest42229 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S8137=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread42225(int [] tdone, int [] ends){
        S8203=1;
    thread42226(tdone,ends);
    thread42230(tdone,ends);
    int biggest42234 = 0;
    if(ends[47]>=biggest42234){
      biggest42234=ends[47];
    }
    if(ends[50]>=biggest42234){
      biggest42234=ends[50];
    }
    if(biggest42234 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread42223(int [] tdone, int [] ends){
        S8123=1;
    S8067=0;
    S8047=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
      S8047=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S8042=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 8
        S8042=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 329, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S8067=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread42222(int [] tdone, int [] ends){
        S8040=1;
    S7984=0;
    S7964=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 319, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
      S7964=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7959=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 319, column: 7
        S7959=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 319, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 319, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 319, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 320, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 321, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7984=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
      }
      else {
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
      }
    }
  }

  public void thread42221(int [] tdone, int [] ends){
        S8125=1;
    thread42222(tdone,ends);
    thread42223(tdone,ends);
    int biggest42224 = 0;
    if(ends[44]>=biggest42224){
      biggest42224=ends[44];
    }
    if(ends[45]>=biggest42224){
      biggest42224=ends[45];
    }
    if(biggest42224 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread42218(int [] tdone, int [] ends){
        S7887=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7887=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread42217(int [] tdone, int [] ends){
        S7881=1;
    S7880=0;
    S7864=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7864=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7859=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7859=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7880=1;
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        else {
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
      }
      else {
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
      }
    }
  }

  public void thread42216(int [] tdone, int [] ends){
        S7955=1;
    S7889=0;
    thread42217(tdone,ends);
    thread42218(tdone,ends);
    int biggest42219 = 0;
    if(ends[41]>=biggest42219){
      biggest42219=ends[41];
    }
    if(ends[42]>=biggest42219){
      biggest42219=ends[42];
    }
    if(biggest42219 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread42214(int [] tdone, int [] ends){
        S7788=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7788=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread42213(int [] tdone, int [] ends){
        S7782=1;
    S7781=0;
    S7765=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7765=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7760=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7760=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7781=1;
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        else {
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
      }
      else {
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
      }
    }
  }

  public void thread42212(int [] tdone, int [] ends){
        S7856=1;
    S7790=0;
    thread42213(tdone,ends);
    thread42214(tdone,ends);
    int biggest42215 = 0;
    if(ends[38]>=biggest42215){
      biggest42215=ends[38];
    }
    if(ends[39]>=biggest42215){
      biggest42215=ends[39];
    }
    if(biggest42215 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread42210(int [] tdone, int [] ends){
        S7689=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7689=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread42209(int [] tdone, int [] ends){
        S7683=1;
    S7682=0;
    S7666=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7666=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7661=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7661=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7682=1;
          active[35]=1;
          ends[35]=1;
          tdone[35]=1;
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

  public void thread42208(int [] tdone, int [] ends){
        S7757=1;
    S7691=0;
    thread42209(tdone,ends);
    thread42210(tdone,ends);
    int biggest42211 = 0;
    if(ends[35]>=biggest42211){
      biggest42211=ends[35];
    }
    if(ends[36]>=biggest42211){
      biggest42211=ends[36];
    }
    if(biggest42211 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread42207(int [] tdone, int [] ends){
        S7957=1;
    thread42208(tdone,ends);
    thread42212(tdone,ends);
    thread42216(tdone,ends);
    int biggest42220 = 0;
    if(ends[34]>=biggest42220){
      biggest42220=ends[34];
    }
    if(ends[37]>=biggest42220){
      biggest42220=ends[37];
    }
    if(ends[40]>=biggest42220){
      biggest42220=ends[40];
    }
    if(biggest42220 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42220 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest42220 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread42205(int [] tdone, int [] ends){
        S5320=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread42204(int [] tdone, int [] ends){
        S5317=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread42203(int [] tdone, int [] ends){
        S5314=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread42202(int [] tdone, int [] ends){
        S7658=1;
    S5321=0;
    thread42203(tdone,ends);
    thread42204(tdone,ends);
    thread42205(tdone,ends);
    int biggest42206 = 0;
    if(ends[28]>=biggest42206){
      biggest42206=ends[28];
    }
    if(ends[29]>=biggest42206){
      biggest42206=ends[29];
    }
    if(ends[30]>=biggest42206){
      biggest42206=ends[30];
    }
    if(biggest42206 == 1){
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
      switch(S28448){
        case 0 : 
          S28448=0;
          break RUN;
        
        case 1 : 
          S28448=2;
          S28448=2;
          cvR_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          fR_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          cR_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          bottleAtPos5_26.setClear();//sysj\conveyor_controller.sysj line: 240, column: 7
          bottleAtPos3_26.setClear();//sysj\conveyor_controller.sysj line: 240, column: 7
          S5179=0;
          S5075=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
            S5075=1;
            active[26]=1;
            ends[26]=1;
            break RUN;
          }
          else {
            S5070=0;
            if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
              convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
              S5070=1;
              if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                ends[26]=2;
                ;//sysj\conveyor_controller.sysj line: 241, column: 7
                S5179=1;
                S5097=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                  S5097=1;
                  active[26]=1;
                  ends[26]=1;
                  break RUN;
                }
                else {
                  S5092=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                    S5092=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                      ends[26]=2;
                      ;//sysj\conveyor_controller.sysj line: 242, column: 7
                      S5179=2;
                      S5186=0;
                      if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                        S5186=1;
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                      else {
                        S5181=0;
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                          S5181=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 243, column: 7
                            S5179=3;
                            thread42202(tdone,ends);
                            thread42207(tdone,ends);
                            thread42221(tdone,ends);
                            thread42225(tdone,ends);
                            int biggest42235 = 0;
                            if(ends[27]>=biggest42235){
                              biggest42235=ends[27];
                            }
                            if(ends[33]>=biggest42235){
                              biggest42235=ends[33];
                            }
                            if(ends[43]>=biggest42235){
                              biggest42235=ends[43];
                            }
                            if(ends[46]>=biggest42235){
                              biggest42235=ends[46];
                            }
                            if(biggest42235 == 1){
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
        
        case 2 : 
          cvR_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          fR_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          cR_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          bottleAtPos5_26.setClear();//sysj\conveyor_controller.sysj line: 240, column: 7
          bottleAtPos3_26.setClear();//sysj\conveyor_controller.sysj line: 240, column: 7
          switch(S5179){
            case 0 : 
              switch(S5075){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                    S5075=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S5070){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                          convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                          S5070=1;
                          if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 241, column: 7
                            S5179=1;
                            S5097=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                              S5097=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S5092=0;
                              if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                S5092=1;
                                if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                  S5179=2;
                                  S5186=0;
                                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                    S5186=1;
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                  else {
                                    S5181=0;
                                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                      S5181=1;
                                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                        ends[26]=2;
                                        ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                        S5179=3;
                                        thread42236(tdone,ends);
                                        thread42241(tdone,ends);
                                        thread42255(tdone,ends);
                                        thread42259(tdone,ends);
                                        int biggest42269 = 0;
                                        if(ends[27]>=biggest42269){
                                          biggest42269=ends[27];
                                        }
                                        if(ends[33]>=biggest42269){
                                          biggest42269=ends[33];
                                        }
                                        if(ends[43]>=biggest42269){
                                          biggest42269=ends[43];
                                        }
                                        if(ends[46]>=biggest42269){
                                          biggest42269=ends[46];
                                        }
                                        if(biggest42269 == 1){
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
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 241, column: 7
                          S5179=1;
                          S5097=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                            S5097=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S5092=0;
                            if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                              S5092=1;
                              if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                S5179=2;
                                S5186=0;
                                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S5186=1;
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                                else {
                                  S5181=0;
                                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                    S5181=1;
                                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                      ends[26]=2;
                                      ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                      S5179=3;
                                      thread42270(tdone,ends);
                                      thread42275(tdone,ends);
                                      thread42289(tdone,ends);
                                      thread42293(tdone,ends);
                                      int biggest42303 = 0;
                                      if(ends[27]>=biggest42303){
                                        biggest42303=ends[27];
                                      }
                                      if(ends[33]>=biggest42303){
                                        biggest42303=ends[33];
                                      }
                                      if(ends[43]>=biggest42303){
                                        biggest42303=ends[43];
                                      }
                                      if(ends[46]>=biggest42303){
                                        biggest42303=ends[46];
                                      }
                                      if(biggest42303 == 1){
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
                  S5075=1;
                  S5075=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                    S5075=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S5070=0;
                    if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                      convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                      S5070=1;
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 241, column: 7
                        S5179=1;
                        S5097=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                          S5097=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S5092=0;
                          if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                            S5092=1;
                            if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 242, column: 7
                              S5179=2;
                              S5186=0;
                              if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                S5186=1;
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                              else {
                                S5181=0;
                                if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S5181=1;
                                  if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                    ends[26]=2;
                                    ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                    S5179=3;
                                    thread42304(tdone,ends);
                                    thread42309(tdone,ends);
                                    thread42323(tdone,ends);
                                    thread42327(tdone,ends);
                                    int biggest42337 = 0;
                                    if(ends[27]>=biggest42337){
                                      biggest42337=ends[27];
                                    }
                                    if(ends[33]>=biggest42337){
                                      biggest42337=ends[33];
                                    }
                                    if(ends[43]>=biggest42337){
                                      biggest42337=ends[43];
                                    }
                                    if(ends[46]>=biggest42337){
                                      biggest42337=ends[46];
                                    }
                                    if(biggest42337 == 1){
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
            
            case 1 : 
              switch(S5097){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                    S5097=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S5092){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                          S5092=1;
                          if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 242, column: 7
                            S5179=2;
                            S5186=0;
                            if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                              S5186=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S5181=0;
                              if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                S5181=1;
                                if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S5179=3;
                                  thread42338(tdone,ends);
                                  thread42343(tdone,ends);
                                  thread42357(tdone,ends);
                                  thread42361(tdone,ends);
                                  int biggest42371 = 0;
                                  if(ends[27]>=biggest42371){
                                    biggest42371=ends[27];
                                  }
                                  if(ends[33]>=biggest42371){
                                    biggest42371=ends[33];
                                  }
                                  if(ends[43]>=biggest42371){
                                    biggest42371=ends[43];
                                  }
                                  if(ends[46]>=biggest42371){
                                    biggest42371=ends[46];
                                  }
                                  if(biggest42371 == 1){
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
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 242, column: 7
                          S5179=2;
                          S5186=0;
                          if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                            S5186=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S5181=0;
                            if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                              S5181=1;
                              if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                S5179=3;
                                thread42372(tdone,ends);
                                thread42377(tdone,ends);
                                thread42391(tdone,ends);
                                thread42395(tdone,ends);
                                int biggest42405 = 0;
                                if(ends[27]>=biggest42405){
                                  biggest42405=ends[27];
                                }
                                if(ends[33]>=biggest42405){
                                  biggest42405=ends[33];
                                }
                                if(ends[43]>=biggest42405){
                                  biggest42405=ends[43];
                                }
                                if(ends[46]>=biggest42405){
                                  biggest42405=ends[46];
                                }
                                if(biggest42405 == 1){
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
                  S5097=1;
                  S5097=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                    S5097=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S5092=0;
                    if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                      fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                      S5092=1;
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 242, column: 7
                        S5179=2;
                        S5186=0;
                        if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                          S5186=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S5181=0;
                          if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                            capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                            S5181=1;
                            if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 243, column: 7
                              S5179=3;
                              thread42406(tdone,ends);
                              thread42411(tdone,ends);
                              thread42425(tdone,ends);
                              thread42429(tdone,ends);
                              int biggest42439 = 0;
                              if(ends[27]>=biggest42439){
                                biggest42439=ends[27];
                              }
                              if(ends[33]>=biggest42439){
                                biggest42439=ends[33];
                              }
                              if(ends[43]>=biggest42439){
                                biggest42439=ends[43];
                              }
                              if(ends[46]>=biggest42439){
                                biggest42439=ends[46];
                              }
                              if(biggest42439 == 1){
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
            
            case 2 : 
              switch(S5186){
                case 0 : 
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                    S5186=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S5181){
                      case 0 : 
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                          S5181=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 243, column: 7
                            S5179=3;
                            thread42440(tdone,ends);
                            thread42445(tdone,ends);
                            thread42459(tdone,ends);
                            thread42463(tdone,ends);
                            int biggest42473 = 0;
                            if(ends[27]>=biggest42473){
                              biggest42473=ends[27];
                            }
                            if(ends[33]>=biggest42473){
                              biggest42473=ends[33];
                            }
                            if(ends[43]>=biggest42473){
                              biggest42473=ends[43];
                            }
                            if(ends[46]>=biggest42473){
                              biggest42473=ends[46];
                            }
                            if(biggest42473 == 1){
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
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 243, column: 7
                          S5179=3;
                          thread42474(tdone,ends);
                          thread42479(tdone,ends);
                          thread42493(tdone,ends);
                          thread42497(tdone,ends);
                          int biggest42507 = 0;
                          if(ends[27]>=biggest42507){
                            biggest42507=ends[27];
                          }
                          if(ends[33]>=biggest42507){
                            biggest42507=ends[33];
                          }
                          if(ends[43]>=biggest42507){
                            biggest42507=ends[43];
                          }
                          if(ends[46]>=biggest42507){
                            biggest42507=ends[46];
                          }
                          if(biggest42507 == 1){
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
                  S5186=1;
                  S5186=0;
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                    S5186=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S5181=0;
                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                      S5181=1;
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 243, column: 7
                        S5179=3;
                        thread42508(tdone,ends);
                        thread42513(tdone,ends);
                        thread42527(tdone,ends);
                        thread42531(tdone,ends);
                        int biggest42541 = 0;
                        if(ends[27]>=biggest42541){
                          biggest42541=ends[27];
                        }
                        if(ends[33]>=biggest42541){
                          biggest42541=ends[33];
                        }
                        if(ends[43]>=biggest42541){
                          biggest42541=ends[43];
                        }
                        if(ends[46]>=biggest42541){
                          biggest42541=ends[46];
                        }
                        if(biggest42541 == 1){
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
            
            case 3 : 
              thread42542(tdone,ends);
              thread42571(tdone,ends);
              thread42594(tdone,ends);
              thread42598(tdone,ends);
              int biggest42614 = 0;
              if(ends[27]>=biggest42614){
                biggest42614=ends[27];
              }
              if(ends[33]>=biggest42614){
                biggest42614=ends[33];
              }
              if(ends[43]>=biggest42614){
                biggest42614=ends[43];
              }
              if(ends[46]>=biggest42614){
                biggest42614=ends[46];
              }
              if(biggest42614 == 1){
                active[26]=1;
                ends[26]=1;
                break RUN;
              }
              //FINXME code
              if(biggest42614 == 0){
                S28448=0;
                active[26]=0;
                ends[26]=0;
                S28448=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    cvR_26 = new Signal();
    fR_26 = new Signal();
    cR_26 = new Signal();
    bottleAtPos5_26 = new Signal();
    bottleAtPos3_26 = new Signal();
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
          checkFive_in.gethook();
          checkThree_in.gethook();
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
      bottleAtPos3E.setpreclear();
      cvR_26.setpreclear();
      fR_26.setpreclear();
      cR_26.setpreclear();
      bottleAtPos5_26.setpreclear();
      bottleAtPos3_26.setpreclear();
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
      bottleAtPos3E.sethook();
      bottleAtPos3E.setClear();
      cvR_26.setClear();
      fR_26.setClear();
      cR_26.setClear();
      bottleAtPos5_26.setClear();
      bottleAtPos3_26.setClear();
      convReady_in.sethook();
      fillerReady_in.sethook();
      capperReady_in.sethook();
      checkFive_in.sethook();
      checkThree_in.sethook();
      checkOne_in.sethook();
      rotated_o.sethook();
      if(paused[26]!=0 || suspended[26]!=0 || active[26]!=1);
      else{
        convReady_in.gethook();
        fillerReady_in.gethook();
        capperReady_in.gethook();
        checkFive_in.gethook();
        checkThree_in.gethook();
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

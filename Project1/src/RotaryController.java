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
  private long __start_thread_32;//sysj\conveyor_controller.sysj line: 281, column: 44
  private long __start_thread_27;//sysj\conveyor_controller.sysj line: 243, column: 7
  private int i_thread_27;//sysj\conveyor_controller.sysj line: 290, column: 10
  private int S21604 = 1;
  private int S5935 = 1;
  private int S5831 = 1;
  private int S5826 = 1;
  private int S5853 = 1;
  private int S5848 = 1;
  private int S5942 = 1;
  private int S5937 = 1;
  private int S7464 = 1;
  private int S6077 = 1;
  private int S6070 = 1;
  private int S6073 = 1;
  private int S6076 = 1;
  private int S6091 = 1;
  private int S6114 = 1;
  private int S6130 = 1;
  private int S6233 = 1;
  private int S6228 = 1;
  private int S7763 = 1;
  private int S7563 = 1;
  private int S7497 = 1;
  private int S7489 = 1;
  private int S7488 = 1;
  private int S7472 = 1;
  private int S7467 = 1;
  private int S7495 = 1;
  private int S7662 = 1;
  private int S7596 = 1;
  private int S7588 = 1;
  private int S7587 = 1;
  private int S7571 = 1;
  private int S7566 = 1;
  private int S7594 = 1;
  private int S7761 = 1;
  private int S7695 = 1;
  private int S7687 = 1;
  private int S7686 = 1;
  private int S7670 = 1;
  private int S7665 = 1;
  private int S7693 = 1;
  private int S7931 = 1;
  private int S7846 = 1;
  private int S7790 = 1;
  private int S7770 = 1;
  private int S7765 = 1;
  private int S7929 = 1;
  private int S7873 = 1;
  private int S7853 = 1;
  private int S7848 = 1;
  private int S8009 = 1;
  private int S7969 = 1;
  private int S7943 = 1;
  private int S7936 = 1;
  private int S7939 = 1;
  private int S8007 = 1;
  private int S7981 = 1;
  private int S7974 = 1;
  private int S7977 = 1;
  
  private int[] ends = new int[77];
  private int[] tdone = new int[77];
  
  public void thread35760(int [] tdone, int [] ends){
        S7977=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread35759(int [] tdone, int [] ends){
        S7974=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 361, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread35757(int [] tdone, int [] ends){
        switch(S7977){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_controller.sysj line: 365, column: 29
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

  public void thread35756(int [] tdone, int [] ends){
        switch(S7974){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 361, column: 23
        currsigs.addElement(bottleAtPos5E);
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
        break;
      
    }
  }

  public void thread35755(int [] tdone, int [] ends){
        switch(S8007){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        switch(S7981){
          case 0 : 
            thread35756(tdone,ends);
            thread35757(tdone,ends);
            int biggest35758 = 0;
            if(ends[51]>=biggest35758){
              biggest35758=ends[51];
            }
            if(ends[52]>=biggest35758){
              biggest35758=ends[52];
            }
            if(biggest35758 == 1){
              active[50]=1;
              ends[50]=1;
              tdone[50]=1;
            }
            if(biggest35758 == 2){
              ends[50]=2;
              ;//sysj\conveyor_controller.sysj line: 359, column: 34
              S7981=1;
              active[50]=1;
              ends[50]=1;
              tdone[50]=1;
            }
            //FINXME code
            if(biggest35758 == 0){
              ;//sysj\conveyor_controller.sysj line: 367, column: 20
              S7981=1;
              active[50]=1;
              ends[50]=1;
              tdone[50]=1;
            }
            break;
          
          case 1 : 
            S7981=1;
            S7981=0;
            if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 359, column: 21
              thread35759(tdone,ends);
              thread35760(tdone,ends);
              int biggest35761 = 0;
              if(ends[51]>=biggest35761){
                biggest35761=ends[51];
              }
              if(ends[52]>=biggest35761){
                biggest35761=ends[52];
              }
              if(biggest35761 == 1){
                active[50]=1;
                ends[50]=1;
                tdone[50]=1;
              }
            }
            else {
              S7981=1;
              active[50]=1;
              ends[50]=1;
              tdone[50]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35753(int [] tdone, int [] ends){
        S7939=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread35752(int [] tdone, int [] ends){
        S7936=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread35750(int [] tdone, int [] ends){
        switch(S7939){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 29
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

  public void thread35749(int [] tdone, int [] ends){
        switch(S7936){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 23
        currsigs.addElement(bottleAtPos3E);
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
        break;
      
    }
  }

  public void thread35748(int [] tdone, int [] ends){
        switch(S7969){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        switch(S7943){
          case 0 : 
            thread35749(tdone,ends);
            thread35750(tdone,ends);
            int biggest35751 = 0;
            if(ends[48]>=biggest35751){
              biggest35751=ends[48];
            }
            if(ends[49]>=biggest35751){
              biggest35751=ends[49];
            }
            if(biggest35751 == 1){
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            if(biggest35751 == 2){
              ends[47]=2;
              ;//sysj\conveyor_controller.sysj line: 341, column: 34
              S7943=1;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            //FINXME code
            if(biggest35751 == 0){
              ;//sysj\conveyor_controller.sysj line: 349, column: 20
              S7943=1;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
          case 1 : 
            S7943=1;
            S7943=0;
            if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 341, column: 21
              thread35752(tdone,ends);
              thread35753(tdone,ends);
              int biggest35754 = 0;
              if(ends[48]>=biggest35754){
                biggest35754=ends[48];
              }
              if(ends[49]>=biggest35754){
                biggest35754=ends[49];
              }
              if(biggest35754 == 1){
                active[47]=1;
                ends[47]=1;
                tdone[47]=1;
              }
            }
            else {
              S7943=1;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35747(int [] tdone, int [] ends){
        switch(S8009){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        thread35748(tdone,ends);
        thread35755(tdone,ends);
        int biggest35762 = 0;
        if(ends[47]>=biggest35762){
          biggest35762=ends[47];
        }
        if(ends[50]>=biggest35762){
          biggest35762=ends[50];
        }
        if(biggest35762 == 1){
          active[46]=1;
          ends[46]=1;
          tdone[46]=1;
        }
        //FINXME code
        if(biggest35762 == 0){
          S8009=0;
          active[46]=0;
          ends[46]=0;
          tdone[46]=1;
        }
        break;
      
    }
  }

  public void thread35745(int [] tdone, int [] ends){
        switch(S7929){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S7873){
          case 0 : 
            switch(S7853){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 326, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
                  S7853=1;
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
                else {
                  switch(S7848){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 326, column: 8
                        S7848=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
                          ends[45]=2;
                          ;//sysj\conveyor_controller.sysj line: 326, column: 8
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 327, column: 11
                            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 328, column: 9
                            currsigs.addElement(bottleAtPos3_26);
                            S7873=1;
                            active[45]=1;
                            ends[45]=1;
                            tdone[45]=1;
                          }
                          else {
                            S7873=1;
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
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
                        ends[45]=2;
                        ;//sysj\conveyor_controller.sysj line: 326, column: 8
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 327, column: 11
                          bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 328, column: 9
                          currsigs.addElement(bottleAtPos3_26);
                          S7873=1;
                          active[45]=1;
                          ends[45]=1;
                          tdone[45]=1;
                        }
                        else {
                          S7873=1;
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
                S7853=1;
                S7853=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 326, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
                  S7853=1;
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
                else {
                  S7848=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 326, column: 8
                    S7848=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
                      ends[45]=2;
                      ;//sysj\conveyor_controller.sysj line: 326, column: 8
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 327, column: 11
                        bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 328, column: 9
                        currsigs.addElement(bottleAtPos3_26);
                        S7873=1;
                        active[45]=1;
                        ends[45]=1;
                        tdone[45]=1;
                      }
                      else {
                        S7873=1;
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
            S7873=1;
            S7873=0;
            S7853=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 326, column: 8
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
              S7853=1;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            else {
              S7848=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 326, column: 8
                S7848=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
                  ends[45]=2;
                  ;//sysj\conveyor_controller.sysj line: 326, column: 8
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 327, column: 11
                    bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 328, column: 9
                    currsigs.addElement(bottleAtPos3_26);
                    S7873=1;
                    active[45]=1;
                    ends[45]=1;
                    tdone[45]=1;
                  }
                  else {
                    S7873=1;
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

  public void thread35744(int [] tdone, int [] ends){
        switch(S7846){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        switch(S7790){
          case 0 : 
            switch(S7770){
              case 0 : 
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 316, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
                  S7770=1;
                  active[44]=1;
                  ends[44]=1;
                  tdone[44]=1;
                }
                else {
                  switch(S7765){
                    case 0 : 
                      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
                        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 316, column: 7
                        S7765=1;
                        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
                          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
                          ends[44]=2;
                          ;//sysj\conveyor_controller.sysj line: 316, column: 7
                          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 317, column: 10
                            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 318, column: 8
                            currsigs.addElement(bottleAtPos5_26);
                            S7790=1;
                            active[44]=1;
                            ends[44]=1;
                            tdone[44]=1;
                          }
                          else {
                            S7790=1;
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
                      if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
                        checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
                        ends[44]=2;
                        ;//sysj\conveyor_controller.sysj line: 316, column: 7
                        if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 317, column: 10
                          bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 318, column: 8
                          currsigs.addElement(bottleAtPos5_26);
                          S7790=1;
                          active[44]=1;
                          ends[44]=1;
                          tdone[44]=1;
                        }
                        else {
                          S7790=1;
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
                S7770=1;
                S7770=0;
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 316, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
                  S7770=1;
                  active[44]=1;
                  ends[44]=1;
                  tdone[44]=1;
                }
                else {
                  S7765=0;
                  if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
                    checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 316, column: 7
                    S7765=1;
                    if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
                      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
                      ends[44]=2;
                      ;//sysj\conveyor_controller.sysj line: 316, column: 7
                      if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 317, column: 10
                        bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 318, column: 8
                        currsigs.addElement(bottleAtPos5_26);
                        S7790=1;
                        active[44]=1;
                        ends[44]=1;
                        tdone[44]=1;
                      }
                      else {
                        S7790=1;
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
            S7790=1;
            S7790=0;
            S7770=0;
            if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 316, column: 7
              checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
              S7770=1;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            else {
              S7765=0;
              if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
                checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 316, column: 7
                S7765=1;
                if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
                  ends[44]=2;
                  ;//sysj\conveyor_controller.sysj line: 316, column: 7
                  if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 317, column: 10
                    bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 318, column: 8
                    currsigs.addElement(bottleAtPos5_26);
                    S7790=1;
                    active[44]=1;
                    ends[44]=1;
                    tdone[44]=1;
                  }
                  else {
                    S7790=1;
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

  public void thread35743(int [] tdone, int [] ends){
        switch(S7931){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        thread35744(tdone,ends);
        thread35745(tdone,ends);
        int biggest35746 = 0;
        if(ends[44]>=biggest35746){
          biggest35746=ends[44];
        }
        if(ends[45]>=biggest35746){
          biggest35746=ends[45];
        }
        if(biggest35746 == 1){
          active[43]=1;
          ends[43]=1;
          tdone[43]=1;
        }
        //FINXME code
        if(biggest35746 == 0){
          S7931=0;
          active[43]=0;
          ends[43]=0;
          tdone[43]=1;
        }
        break;
      
    }
  }

  public void thread35740(int [] tdone, int [] ends){
        S7693=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7693=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread35739(int [] tdone, int [] ends){
        S7687=1;
    S7686=0;
    S7670=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7670=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7665=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7665=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7686=1;
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

  public void thread35737(int [] tdone, int [] ends){
        switch(S7693){
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

  public void thread35736(int [] tdone, int [] ends){
        switch(S7687){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        switch(S7686){
          case 0 : 
            switch(S7670){
              case 0 : 
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7670=1;
                  active[41]=1;
                  ends[41]=1;
                  tdone[41]=1;
                }
                else {
                  switch(S7665){
                    case 0 : 
                      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7665=1;
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[41]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S7686=1;
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
                        S7686=1;
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
                S7670=1;
                S7670=0;
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7670=1;
                  active[41]=1;
                  ends[41]=1;
                  tdone[41]=1;
                }
                else {
                  S7665=0;
                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S7665=1;
                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[41]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S7686=1;
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
            S7686=1;
            S7686=2;
            active[41]=1;
            ends[41]=1;
            tdone[41]=1;
            break;
          
          case 2 : 
            S7686=2;
            capperReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[41]=2;
            tdone[41]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread35735(int [] tdone, int [] ends){
        switch(S7761){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        switch(S7695){
          case 0 : 
            thread35736(tdone,ends);
            thread35737(tdone,ends);
            int biggest35738 = 0;
            if(ends[41]>=biggest35738){
              biggest35738=ends[41];
            }
            if(ends[42]>=biggest35738){
              biggest35738=ends[42];
            }
            if(biggest35738 == 1){
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            if(biggest35738 == 2){
              ends[40]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S7695=1;
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            //FINXME code
            if(biggest35738 == 0){
              S7695=1;
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            break;
          
          case 1 : 
            S7695=1;
            S7695=0;
            thread35739(tdone,ends);
            thread35740(tdone,ends);
            int biggest35741 = 0;
            if(ends[41]>=biggest35741){
              biggest35741=ends[41];
            }
            if(ends[42]>=biggest35741){
              biggest35741=ends[42];
            }
            if(biggest35741 == 1){
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35733(int [] tdone, int [] ends){
        S7594=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7594=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread35732(int [] tdone, int [] ends){
        S7588=1;
    S7587=0;
    S7571=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7571=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7566=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7566=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7587=1;
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

  public void thread35730(int [] tdone, int [] ends){
        switch(S7594){
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

  public void thread35729(int [] tdone, int [] ends){
        switch(S7588){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S7587){
          case 0 : 
            switch(S7571){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7571=1;
                  active[38]=1;
                  ends[38]=1;
                  tdone[38]=1;
                }
                else {
                  switch(S7566){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7566=1;
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[38]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S7587=1;
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
                        S7587=1;
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
                S7571=1;
                S7571=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7571=1;
                  active[38]=1;
                  ends[38]=1;
                  tdone[38]=1;
                }
                else {
                  S7566=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S7566=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[38]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S7587=1;
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
            S7587=1;
            S7587=2;
            active[38]=1;
            ends[38]=1;
            tdone[38]=1;
            break;
          
          case 2 : 
            S7587=2;
            fillerReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[38]=2;
            tdone[38]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread35728(int [] tdone, int [] ends){
        switch(S7662){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S7596){
          case 0 : 
            thread35729(tdone,ends);
            thread35730(tdone,ends);
            int biggest35731 = 0;
            if(ends[38]>=biggest35731){
              biggest35731=ends[38];
            }
            if(ends[39]>=biggest35731){
              biggest35731=ends[39];
            }
            if(biggest35731 == 1){
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            if(biggest35731 == 2){
              ends[37]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S7596=1;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            //FINXME code
            if(biggest35731 == 0){
              S7596=1;
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 1 : 
            S7596=1;
            S7596=0;
            thread35732(tdone,ends);
            thread35733(tdone,ends);
            int biggest35734 = 0;
            if(ends[38]>=biggest35734){
              biggest35734=ends[38];
            }
            if(ends[39]>=biggest35734){
              biggest35734=ends[39];
            }
            if(biggest35734 == 1){
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35726(int [] tdone, int [] ends){
        S7495=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7495=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread35725(int [] tdone, int [] ends){
        S7489=1;
    S7488=0;
    S7472=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7472=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7467=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7467=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7488=1;
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

  public void thread35723(int [] tdone, int [] ends){
        switch(S7495){
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

  public void thread35722(int [] tdone, int [] ends){
        switch(S7489){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        switch(S7488){
          case 0 : 
            switch(S7472){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7472=1;
                  active[35]=1;
                  ends[35]=1;
                  tdone[35]=1;
                }
                else {
                  switch(S7467){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S7467=1;
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[35]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S7488=1;
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
                        S7488=1;
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
                S7472=1;
                S7472=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S7472=1;
                  active[35]=1;
                  ends[35]=1;
                  tdone[35]=1;
                }
                else {
                  S7467=0;
                  if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S7467=1;
                    if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[35]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S7488=1;
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
            S7488=1;
            S7488=2;
            active[35]=1;
            ends[35]=1;
            tdone[35]=1;
            break;
          
          case 2 : 
            S7488=2;
            convReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[35]=2;
            tdone[35]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread35721(int [] tdone, int [] ends){
        switch(S7563){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        switch(S7497){
          case 0 : 
            thread35722(tdone,ends);
            thread35723(tdone,ends);
            int biggest35724 = 0;
            if(ends[35]>=biggest35724){
              biggest35724=ends[35];
            }
            if(ends[36]>=biggest35724){
              biggest35724=ends[36];
            }
            if(biggest35724 == 1){
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            if(biggest35724 == 2){
              ends[34]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S7497=1;
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            //FINXME code
            if(biggest35724 == 0){
              S7497=1;
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            break;
          
          case 1 : 
            S7497=1;
            S7497=0;
            thread35725(tdone,ends);
            thread35726(tdone,ends);
            int biggest35727 = 0;
            if(ends[35]>=biggest35727){
              biggest35727=ends[35];
            }
            if(ends[36]>=biggest35727){
              biggest35727=ends[36];
            }
            if(biggest35727 == 1){
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread35720(int [] tdone, int [] ends){
        switch(S7763){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        thread35721(tdone,ends);
        thread35728(tdone,ends);
        thread35735(tdone,ends);
        int biggest35742 = 0;
        if(ends[34]>=biggest35742){
          biggest35742=ends[34];
        }
        if(ends[37]>=biggest35742){
          biggest35742=ends[37];
        }
        if(ends[40]>=biggest35742){
          biggest35742=ends[40];
        }
        if(biggest35742 == 1){
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        //FINXME code
        if(biggest35742 == 0){
          S7763=0;
          active[33]=0;
          ends[33]=0;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread35718(int [] tdone, int [] ends){
        S6076=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread35717(int [] tdone, int [] ends){
        S6073=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread35716(int [] tdone, int [] ends){
        S6070=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread35714(int [] tdone, int [] ends){
        S6076=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread35713(int [] tdone, int [] ends){
        S6073=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread35712(int [] tdone, int [] ends){
        S6070=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread35710(int [] tdone, int [] ends){
        switch(S6130){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_32 >= 300){//sysj\conveyor_controller.sysj line: 281, column: 44
          ends[32]=3;
          ;//sysj\conveyor_controller.sysj line: 281, column: 44
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

  public void thread35709(int [] tdone, int [] ends){
        switch(S6114){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 281, column: 14
        currsigs.addElement(rotaryTableTrigger);
        active[31]=1;
        ends[31]=1;
        tdone[31]=1;
        break;
      
    }
  }

  public void thread35707(int [] tdone, int [] ends){
        S6130=1;
    __start_thread_32 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 281, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_32 >= 300){//sysj\conveyor_controller.sysj line: 281, column: 44
      ends[32]=3;
      ;//sysj\conveyor_controller.sysj line: 281, column: 44
      ends[32]=2;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread35706(int [] tdone, int [] ends){
        S6114=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 281, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread35704(int [] tdone, int [] ends){
        S6130=1;
    __start_thread_32 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 281, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_32 >= 300){//sysj\conveyor_controller.sysj line: 281, column: 44
      ends[32]=3;
      ;//sysj\conveyor_controller.sysj line: 281, column: 44
      ends[32]=2;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread35703(int [] tdone, int [] ends){
        S6114=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 281, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread35701(int [] tdone, int [] ends){
        S6130=1;
    __start_thread_32 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 281, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_32 >= 300){//sysj\conveyor_controller.sysj line: 281, column: 44
      ends[32]=3;
      ;//sysj\conveyor_controller.sysj line: 281, column: 44
      ends[32]=2;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread35700(int [] tdone, int [] ends){
        S6114=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 281, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread35698(int [] tdone, int [] ends){
        switch(S6076){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(cR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 258, column: 17
          System.out.println("*Rotary - Capper Ready*");//sysj\conveyor_controller.sysj line: 259, column: 11
          S6076=0;
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

  public void thread35697(int [] tdone, int [] ends){
        switch(S6073){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(cvR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 252, column: 17
          System.out.println("*Rotary - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 253, column: 11
          S6073=0;
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

  public void thread35696(int [] tdone, int [] ends){
        switch(S6070){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(fR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 247, column: 17
          System.out.println("*Rotary - Filler Ready*");//sysj\conveyor_controller.sysj line: 248, column: 11
          S6070=0;
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

  public void thread35695(int [] tdone, int [] ends){
        switch(S7464){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S6077){
          case 0 : 
            thread35696(tdone,ends);
            thread35697(tdone,ends);
            thread35698(tdone,ends);
            int biggest35699 = 0;
            if(ends[28]>=biggest35699){
              biggest35699=ends[28];
            }
            if(ends[29]>=biggest35699){
              biggest35699=ends[29];
            }
            if(ends[30]>=biggest35699){
              biggest35699=ends[30];
            }
            if(biggest35699 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest35699 == 0){
              System.out.println("*Rotary - All controllers are ready*");//sysj\conveyor_controller.sysj line: 264, column: 10
              S6077=1;
              if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 267, column: 18
                S6091=0;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S6077=2;
                thread35700(tdone,ends);
                thread35701(tdone,ends);
                int biggest35702 = 0;
                if(ends[31]>=biggest35702){
                  biggest35702=ends[31];
                }
                if(ends[32]>=biggest35702){
                  biggest35702=ends[32];
                }
                if(biggest35702 == 1){
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                if(biggest35702 == 2){
                  ends[27]=2;
                  ;//sysj\conveyor_controller.sysj line: 280, column: 12
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 284, column: 16
                  S6077=3;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
              }
            }
            break;
          
          case 1 : 
            switch(S6091){
              case 0 : 
                if(!bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 269, column: 20
                  S6091=1;
                  if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 271, column: 23
                    System.out.println("*at pos5*");//sysj\conveyor_controller.sysj line: 272, column: 17
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 268, column: 13
                    S6077=2;
                    thread35703(tdone,ends);
                    thread35704(tdone,ends);
                    int biggest35705 = 0;
                    if(ends[31]>=biggest35705){
                      biggest35705=ends[31];
                    }
                    if(ends[32]>=biggest35705){
                      biggest35705=ends[32];
                    }
                    if(biggest35705 == 1){
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                    if(biggest35705 == 2){
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 280, column: 12
                      System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 284, column: 16
                      S6077=3;
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
                if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 271, column: 23
                  System.out.println("*at pos5*");//sysj\conveyor_controller.sysj line: 272, column: 17
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  ends[27]=2;
                  ;//sysj\conveyor_controller.sysj line: 268, column: 13
                  S6077=2;
                  thread35706(tdone,ends);
                  thread35707(tdone,ends);
                  int biggest35708 = 0;
                  if(ends[31]>=biggest35708){
                    biggest35708=ends[31];
                  }
                  if(ends[32]>=biggest35708){
                    biggest35708=ends[32];
                  }
                  if(biggest35708 == 1){
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  if(biggest35708 == 2){
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 280, column: 12
                    System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 284, column: 16
                    S6077=3;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread35709(tdone,ends);
            thread35710(tdone,ends);
            int biggest35711 = 0;
            if(ends[31]>=biggest35711){
              biggest35711=ends[31];
            }
            if(ends[32]>=biggest35711){
              biggest35711=ends[32];
            }
            if(biggest35711 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            if(biggest35711 == 2){
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 280, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 284, column: 16
              S6077=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest35711 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 284, column: 16
              S6077=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_controller.sysj line: 285, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\conveyor_controller.sysj line: 286, column: 16
              S6077=4;
              S6233=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 287, column: 13
                rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 287, column: 13
                S6233=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S6228=0;
                if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 287, column: 13
                  rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 287, column: 13
                  S6228=1;
                  if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 287, column: 13
                    rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 287, column: 13
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 287, column: 13
                    S6077=5;
                    __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 243, column: 7
                    if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 243, column: 7
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 243, column: 7
                      S6077=6;
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
            switch(S6233){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 287, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 287, column: 13
                  S6233=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  switch(S6228){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 287, column: 13
                        rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 287, column: 13
                        S6228=1;
                        if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 287, column: 13
                          rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 287, column: 13
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 287, column: 13
                          S6077=5;
                          __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 243, column: 7
                          if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 243, column: 7
                            ends[27]=2;
                            ;//sysj\conveyor_controller.sysj line: 243, column: 7
                            S6077=6;
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
                      if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 287, column: 13
                        rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 287, column: 13
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 287, column: 13
                        S6077=5;
                        __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 243, column: 7
                        if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 243, column: 7
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 243, column: 7
                          S6077=6;
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
                S6233=1;
                S6233=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 287, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 287, column: 13
                  S6233=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  S6228=0;
                  if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 287, column: 13
                    rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 287, column: 13
                    S6228=1;
                    if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 287, column: 13
                      rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 287, column: 13
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 287, column: 13
                      S6077=5;
                      __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 243, column: 7
                      if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 243, column: 7
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 243, column: 7
                        S6077=6;
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
            if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 243, column: 7
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 243, column: 7
              S6077=6;
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
            S6077=6;
            i_thread_27 = 0;//sysj\conveyor_controller.sysj line: 290, column: 10
            S6077=7;
            i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 293, column: 12
            if(i_thread_27 > 100){//sysj\conveyor_controller.sysj line: 294, column: 15
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 291, column: 10
              S6077=0;
              thread35712(tdone,ends);
              thread35713(tdone,ends);
              thread35714(tdone,ends);
              int biggest35715 = 0;
              if(ends[28]>=biggest35715){
                biggest35715=ends[28];
              }
              if(ends[29]>=biggest35715){
                biggest35715=ends[29];
              }
              if(ends[30]>=biggest35715){
                biggest35715=ends[30];
              }
              if(biggest35715 == 1){
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
            i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 293, column: 12
            if(i_thread_27 > 100){//sysj\conveyor_controller.sysj line: 294, column: 15
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 291, column: 10
              S6077=0;
              thread35716(tdone,ends);
              thread35717(tdone,ends);
              thread35718(tdone,ends);
              int biggest35719 = 0;
              if(ends[28]>=biggest35719){
                biggest35719=ends[28];
              }
              if(ends[29]>=biggest35719){
                biggest35719=ends[29];
              }
              if(ends[30]>=biggest35719){
                biggest35719=ends[30];
              }
              if(biggest35719 == 1){
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

  public void thread35691(int [] tdone, int [] ends){
        S7977=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread35690(int [] tdone, int [] ends){
        S7974=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 361, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread35689(int [] tdone, int [] ends){
        S8007=1;
    S7981=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 359, column: 21
      thread35690(tdone,ends);
      thread35691(tdone,ends);
      int biggest35692 = 0;
      if(ends[51]>=biggest35692){
        biggest35692=ends[51];
      }
      if(ends[52]>=biggest35692){
        biggest35692=ends[52];
      }
      if(biggest35692 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S7981=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread35687(int [] tdone, int [] ends){
        S7939=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread35686(int [] tdone, int [] ends){
        S7936=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread35685(int [] tdone, int [] ends){
        S7969=1;
    S7943=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 341, column: 21
      thread35686(tdone,ends);
      thread35687(tdone,ends);
      int biggest35688 = 0;
      if(ends[48]>=biggest35688){
        biggest35688=ends[48];
      }
      if(ends[49]>=biggest35688){
        biggest35688=ends[49];
      }
      if(biggest35688 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S7943=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread35684(int [] tdone, int [] ends){
        S8009=1;
    thread35685(tdone,ends);
    thread35689(tdone,ends);
    int biggest35693 = 0;
    if(ends[47]>=biggest35693){
      biggest35693=ends[47];
    }
    if(ends[50]>=biggest35693){
      biggest35693=ends[50];
    }
    if(biggest35693 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread35682(int [] tdone, int [] ends){
        S7929=1;
    S7873=0;
    S7853=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 326, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
      S7853=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7848=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 326, column: 8
        S7848=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 326, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 327, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 328, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S7873=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S7873=1;
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

  public void thread35681(int [] tdone, int [] ends){
        S7846=1;
    S7790=0;
    S7770=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 316, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
      S7770=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7765=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 316, column: 7
        S7765=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 316, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 317, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 318, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7790=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7790=1;
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

  public void thread35680(int [] tdone, int [] ends){
        S7931=1;
    thread35681(tdone,ends);
    thread35682(tdone,ends);
    int biggest35683 = 0;
    if(ends[44]>=biggest35683){
      biggest35683=ends[44];
    }
    if(ends[45]>=biggest35683){
      biggest35683=ends[45];
    }
    if(biggest35683 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread35677(int [] tdone, int [] ends){
        S7693=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7693=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread35676(int [] tdone, int [] ends){
        S7687=1;
    S7686=0;
    S7670=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7670=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7665=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7665=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7686=1;
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

  public void thread35675(int [] tdone, int [] ends){
        S7761=1;
    S7695=0;
    thread35676(tdone,ends);
    thread35677(tdone,ends);
    int biggest35678 = 0;
    if(ends[41]>=biggest35678){
      biggest35678=ends[41];
    }
    if(ends[42]>=biggest35678){
      biggest35678=ends[42];
    }
    if(biggest35678 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread35673(int [] tdone, int [] ends){
        S7594=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7594=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread35672(int [] tdone, int [] ends){
        S7588=1;
    S7587=0;
    S7571=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7571=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7566=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7566=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7587=1;
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

  public void thread35671(int [] tdone, int [] ends){
        S7662=1;
    S7596=0;
    thread35672(tdone,ends);
    thread35673(tdone,ends);
    int biggest35674 = 0;
    if(ends[38]>=biggest35674){
      biggest35674=ends[38];
    }
    if(ends[39]>=biggest35674){
      biggest35674=ends[39];
    }
    if(biggest35674 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread35669(int [] tdone, int [] ends){
        S7495=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7495=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread35668(int [] tdone, int [] ends){
        S7489=1;
    S7488=0;
    S7472=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7472=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7467=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7467=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7488=1;
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

  public void thread35667(int [] tdone, int [] ends){
        S7563=1;
    S7497=0;
    thread35668(tdone,ends);
    thread35669(tdone,ends);
    int biggest35670 = 0;
    if(ends[35]>=biggest35670){
      biggest35670=ends[35];
    }
    if(ends[36]>=biggest35670){
      biggest35670=ends[36];
    }
    if(biggest35670 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread35666(int [] tdone, int [] ends){
        S7763=1;
    thread35667(tdone,ends);
    thread35671(tdone,ends);
    thread35675(tdone,ends);
    int biggest35679 = 0;
    if(ends[34]>=biggest35679){
      biggest35679=ends[34];
    }
    if(ends[37]>=biggest35679){
      biggest35679=ends[37];
    }
    if(ends[40]>=biggest35679){
      biggest35679=ends[40];
    }
    if(biggest35679 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35679 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35679 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread35664(int [] tdone, int [] ends){
        S6076=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread35663(int [] tdone, int [] ends){
        S6073=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread35662(int [] tdone, int [] ends){
        S6070=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread35661(int [] tdone, int [] ends){
        S7464=1;
    S6077=0;
    thread35662(tdone,ends);
    thread35663(tdone,ends);
    thread35664(tdone,ends);
    int biggest35665 = 0;
    if(ends[28]>=biggest35665){
      biggest35665=ends[28];
    }
    if(ends[29]>=biggest35665){
      biggest35665=ends[29];
    }
    if(ends[30]>=biggest35665){
      biggest35665=ends[30];
    }
    if(biggest35665 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread35657(int [] tdone, int [] ends){
        S7977=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread35656(int [] tdone, int [] ends){
        S7974=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 361, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread35655(int [] tdone, int [] ends){
        S8007=1;
    S7981=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 359, column: 21
      thread35656(tdone,ends);
      thread35657(tdone,ends);
      int biggest35658 = 0;
      if(ends[51]>=biggest35658){
        biggest35658=ends[51];
      }
      if(ends[52]>=biggest35658){
        biggest35658=ends[52];
      }
      if(biggest35658 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S7981=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread35653(int [] tdone, int [] ends){
        S7939=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread35652(int [] tdone, int [] ends){
        S7936=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread35651(int [] tdone, int [] ends){
        S7969=1;
    S7943=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 341, column: 21
      thread35652(tdone,ends);
      thread35653(tdone,ends);
      int biggest35654 = 0;
      if(ends[48]>=biggest35654){
        biggest35654=ends[48];
      }
      if(ends[49]>=biggest35654){
        biggest35654=ends[49];
      }
      if(biggest35654 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S7943=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread35650(int [] tdone, int [] ends){
        S8009=1;
    thread35651(tdone,ends);
    thread35655(tdone,ends);
    int biggest35659 = 0;
    if(ends[47]>=biggest35659){
      biggest35659=ends[47];
    }
    if(ends[50]>=biggest35659){
      biggest35659=ends[50];
    }
    if(biggest35659 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread35648(int [] tdone, int [] ends){
        S7929=1;
    S7873=0;
    S7853=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 326, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
      S7853=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7848=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 326, column: 8
        S7848=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 326, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 327, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 328, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S7873=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S7873=1;
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

  public void thread35647(int [] tdone, int [] ends){
        S7846=1;
    S7790=0;
    S7770=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 316, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
      S7770=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7765=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 316, column: 7
        S7765=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 316, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 317, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 318, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7790=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7790=1;
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

  public void thread35646(int [] tdone, int [] ends){
        S7931=1;
    thread35647(tdone,ends);
    thread35648(tdone,ends);
    int biggest35649 = 0;
    if(ends[44]>=biggest35649){
      biggest35649=ends[44];
    }
    if(ends[45]>=biggest35649){
      biggest35649=ends[45];
    }
    if(biggest35649 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread35643(int [] tdone, int [] ends){
        S7693=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7693=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread35642(int [] tdone, int [] ends){
        S7687=1;
    S7686=0;
    S7670=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7670=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7665=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7665=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7686=1;
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

  public void thread35641(int [] tdone, int [] ends){
        S7761=1;
    S7695=0;
    thread35642(tdone,ends);
    thread35643(tdone,ends);
    int biggest35644 = 0;
    if(ends[41]>=biggest35644){
      biggest35644=ends[41];
    }
    if(ends[42]>=biggest35644){
      biggest35644=ends[42];
    }
    if(biggest35644 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread35639(int [] tdone, int [] ends){
        S7594=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7594=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread35638(int [] tdone, int [] ends){
        S7588=1;
    S7587=0;
    S7571=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7571=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7566=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7566=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7587=1;
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

  public void thread35637(int [] tdone, int [] ends){
        S7662=1;
    S7596=0;
    thread35638(tdone,ends);
    thread35639(tdone,ends);
    int biggest35640 = 0;
    if(ends[38]>=biggest35640){
      biggest35640=ends[38];
    }
    if(ends[39]>=biggest35640){
      biggest35640=ends[39];
    }
    if(biggest35640 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread35635(int [] tdone, int [] ends){
        S7495=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7495=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread35634(int [] tdone, int [] ends){
        S7489=1;
    S7488=0;
    S7472=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7472=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7467=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7467=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7488=1;
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

  public void thread35633(int [] tdone, int [] ends){
        S7563=1;
    S7497=0;
    thread35634(tdone,ends);
    thread35635(tdone,ends);
    int biggest35636 = 0;
    if(ends[35]>=biggest35636){
      biggest35636=ends[35];
    }
    if(ends[36]>=biggest35636){
      biggest35636=ends[36];
    }
    if(biggest35636 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread35632(int [] tdone, int [] ends){
        S7763=1;
    thread35633(tdone,ends);
    thread35637(tdone,ends);
    thread35641(tdone,ends);
    int biggest35645 = 0;
    if(ends[34]>=biggest35645){
      biggest35645=ends[34];
    }
    if(ends[37]>=biggest35645){
      biggest35645=ends[37];
    }
    if(ends[40]>=biggest35645){
      biggest35645=ends[40];
    }
    if(biggest35645 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35645 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35645 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread35630(int [] tdone, int [] ends){
        S6076=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread35629(int [] tdone, int [] ends){
        S6073=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread35628(int [] tdone, int [] ends){
        S6070=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread35627(int [] tdone, int [] ends){
        S7464=1;
    S6077=0;
    thread35628(tdone,ends);
    thread35629(tdone,ends);
    thread35630(tdone,ends);
    int biggest35631 = 0;
    if(ends[28]>=biggest35631){
      biggest35631=ends[28];
    }
    if(ends[29]>=biggest35631){
      biggest35631=ends[29];
    }
    if(ends[30]>=biggest35631){
      biggest35631=ends[30];
    }
    if(biggest35631 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread35623(int [] tdone, int [] ends){
        S7977=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread35622(int [] tdone, int [] ends){
        S7974=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 361, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread35621(int [] tdone, int [] ends){
        S8007=1;
    S7981=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 359, column: 21
      thread35622(tdone,ends);
      thread35623(tdone,ends);
      int biggest35624 = 0;
      if(ends[51]>=biggest35624){
        biggest35624=ends[51];
      }
      if(ends[52]>=biggest35624){
        biggest35624=ends[52];
      }
      if(biggest35624 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S7981=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread35619(int [] tdone, int [] ends){
        S7939=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread35618(int [] tdone, int [] ends){
        S7936=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread35617(int [] tdone, int [] ends){
        S7969=1;
    S7943=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 341, column: 21
      thread35618(tdone,ends);
      thread35619(tdone,ends);
      int biggest35620 = 0;
      if(ends[48]>=biggest35620){
        biggest35620=ends[48];
      }
      if(ends[49]>=biggest35620){
        biggest35620=ends[49];
      }
      if(biggest35620 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S7943=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread35616(int [] tdone, int [] ends){
        S8009=1;
    thread35617(tdone,ends);
    thread35621(tdone,ends);
    int biggest35625 = 0;
    if(ends[47]>=biggest35625){
      biggest35625=ends[47];
    }
    if(ends[50]>=biggest35625){
      biggest35625=ends[50];
    }
    if(biggest35625 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread35614(int [] tdone, int [] ends){
        S7929=1;
    S7873=0;
    S7853=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 326, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
      S7853=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7848=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 326, column: 8
        S7848=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 326, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 327, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 328, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S7873=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S7873=1;
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

  public void thread35613(int [] tdone, int [] ends){
        S7846=1;
    S7790=0;
    S7770=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 316, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
      S7770=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7765=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 316, column: 7
        S7765=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 316, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 317, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 318, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7790=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7790=1;
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

  public void thread35612(int [] tdone, int [] ends){
        S7931=1;
    thread35613(tdone,ends);
    thread35614(tdone,ends);
    int biggest35615 = 0;
    if(ends[44]>=biggest35615){
      biggest35615=ends[44];
    }
    if(ends[45]>=biggest35615){
      biggest35615=ends[45];
    }
    if(biggest35615 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread35609(int [] tdone, int [] ends){
        S7693=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7693=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread35608(int [] tdone, int [] ends){
        S7687=1;
    S7686=0;
    S7670=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7670=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7665=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7665=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7686=1;
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

  public void thread35607(int [] tdone, int [] ends){
        S7761=1;
    S7695=0;
    thread35608(tdone,ends);
    thread35609(tdone,ends);
    int biggest35610 = 0;
    if(ends[41]>=biggest35610){
      biggest35610=ends[41];
    }
    if(ends[42]>=biggest35610){
      biggest35610=ends[42];
    }
    if(biggest35610 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread35605(int [] tdone, int [] ends){
        S7594=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7594=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread35604(int [] tdone, int [] ends){
        S7588=1;
    S7587=0;
    S7571=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7571=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7566=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7566=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7587=1;
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

  public void thread35603(int [] tdone, int [] ends){
        S7662=1;
    S7596=0;
    thread35604(tdone,ends);
    thread35605(tdone,ends);
    int biggest35606 = 0;
    if(ends[38]>=biggest35606){
      biggest35606=ends[38];
    }
    if(ends[39]>=biggest35606){
      biggest35606=ends[39];
    }
    if(biggest35606 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread35601(int [] tdone, int [] ends){
        S7495=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7495=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread35600(int [] tdone, int [] ends){
        S7489=1;
    S7488=0;
    S7472=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7472=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7467=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7467=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7488=1;
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

  public void thread35599(int [] tdone, int [] ends){
        S7563=1;
    S7497=0;
    thread35600(tdone,ends);
    thread35601(tdone,ends);
    int biggest35602 = 0;
    if(ends[35]>=biggest35602){
      biggest35602=ends[35];
    }
    if(ends[36]>=biggest35602){
      biggest35602=ends[36];
    }
    if(biggest35602 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread35598(int [] tdone, int [] ends){
        S7763=1;
    thread35599(tdone,ends);
    thread35603(tdone,ends);
    thread35607(tdone,ends);
    int biggest35611 = 0;
    if(ends[34]>=biggest35611){
      biggest35611=ends[34];
    }
    if(ends[37]>=biggest35611){
      biggest35611=ends[37];
    }
    if(ends[40]>=biggest35611){
      biggest35611=ends[40];
    }
    if(biggest35611 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35611 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35611 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread35596(int [] tdone, int [] ends){
        S6076=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread35595(int [] tdone, int [] ends){
        S6073=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread35594(int [] tdone, int [] ends){
        S6070=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread35593(int [] tdone, int [] ends){
        S7464=1;
    S6077=0;
    thread35594(tdone,ends);
    thread35595(tdone,ends);
    thread35596(tdone,ends);
    int biggest35597 = 0;
    if(ends[28]>=biggest35597){
      biggest35597=ends[28];
    }
    if(ends[29]>=biggest35597){
      biggest35597=ends[29];
    }
    if(ends[30]>=biggest35597){
      biggest35597=ends[30];
    }
    if(biggest35597 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread35589(int [] tdone, int [] ends){
        S7977=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread35588(int [] tdone, int [] ends){
        S7974=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 361, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread35587(int [] tdone, int [] ends){
        S8007=1;
    S7981=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 359, column: 21
      thread35588(tdone,ends);
      thread35589(tdone,ends);
      int biggest35590 = 0;
      if(ends[51]>=biggest35590){
        biggest35590=ends[51];
      }
      if(ends[52]>=biggest35590){
        biggest35590=ends[52];
      }
      if(biggest35590 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S7981=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread35585(int [] tdone, int [] ends){
        S7939=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread35584(int [] tdone, int [] ends){
        S7936=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread35583(int [] tdone, int [] ends){
        S7969=1;
    S7943=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 341, column: 21
      thread35584(tdone,ends);
      thread35585(tdone,ends);
      int biggest35586 = 0;
      if(ends[48]>=biggest35586){
        biggest35586=ends[48];
      }
      if(ends[49]>=biggest35586){
        biggest35586=ends[49];
      }
      if(biggest35586 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S7943=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread35582(int [] tdone, int [] ends){
        S8009=1;
    thread35583(tdone,ends);
    thread35587(tdone,ends);
    int biggest35591 = 0;
    if(ends[47]>=biggest35591){
      biggest35591=ends[47];
    }
    if(ends[50]>=biggest35591){
      biggest35591=ends[50];
    }
    if(biggest35591 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread35580(int [] tdone, int [] ends){
        S7929=1;
    S7873=0;
    S7853=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 326, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
      S7853=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7848=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 326, column: 8
        S7848=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 326, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 327, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 328, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S7873=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S7873=1;
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

  public void thread35579(int [] tdone, int [] ends){
        S7846=1;
    S7790=0;
    S7770=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 316, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
      S7770=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7765=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 316, column: 7
        S7765=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 316, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 317, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 318, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7790=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7790=1;
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

  public void thread35578(int [] tdone, int [] ends){
        S7931=1;
    thread35579(tdone,ends);
    thread35580(tdone,ends);
    int biggest35581 = 0;
    if(ends[44]>=biggest35581){
      biggest35581=ends[44];
    }
    if(ends[45]>=biggest35581){
      biggest35581=ends[45];
    }
    if(biggest35581 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread35575(int [] tdone, int [] ends){
        S7693=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7693=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread35574(int [] tdone, int [] ends){
        S7687=1;
    S7686=0;
    S7670=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7670=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7665=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7665=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7686=1;
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

  public void thread35573(int [] tdone, int [] ends){
        S7761=1;
    S7695=0;
    thread35574(tdone,ends);
    thread35575(tdone,ends);
    int biggest35576 = 0;
    if(ends[41]>=biggest35576){
      biggest35576=ends[41];
    }
    if(ends[42]>=biggest35576){
      biggest35576=ends[42];
    }
    if(biggest35576 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread35571(int [] tdone, int [] ends){
        S7594=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7594=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread35570(int [] tdone, int [] ends){
        S7588=1;
    S7587=0;
    S7571=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7571=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7566=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7566=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7587=1;
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

  public void thread35569(int [] tdone, int [] ends){
        S7662=1;
    S7596=0;
    thread35570(tdone,ends);
    thread35571(tdone,ends);
    int biggest35572 = 0;
    if(ends[38]>=biggest35572){
      biggest35572=ends[38];
    }
    if(ends[39]>=biggest35572){
      biggest35572=ends[39];
    }
    if(biggest35572 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread35567(int [] tdone, int [] ends){
        S7495=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7495=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread35566(int [] tdone, int [] ends){
        S7489=1;
    S7488=0;
    S7472=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7472=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7467=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7467=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7488=1;
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

  public void thread35565(int [] tdone, int [] ends){
        S7563=1;
    S7497=0;
    thread35566(tdone,ends);
    thread35567(tdone,ends);
    int biggest35568 = 0;
    if(ends[35]>=biggest35568){
      biggest35568=ends[35];
    }
    if(ends[36]>=biggest35568){
      biggest35568=ends[36];
    }
    if(biggest35568 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread35564(int [] tdone, int [] ends){
        S7763=1;
    thread35565(tdone,ends);
    thread35569(tdone,ends);
    thread35573(tdone,ends);
    int biggest35577 = 0;
    if(ends[34]>=biggest35577){
      biggest35577=ends[34];
    }
    if(ends[37]>=biggest35577){
      biggest35577=ends[37];
    }
    if(ends[40]>=biggest35577){
      biggest35577=ends[40];
    }
    if(biggest35577 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35577 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35577 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread35562(int [] tdone, int [] ends){
        S6076=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread35561(int [] tdone, int [] ends){
        S6073=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread35560(int [] tdone, int [] ends){
        S6070=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread35559(int [] tdone, int [] ends){
        S7464=1;
    S6077=0;
    thread35560(tdone,ends);
    thread35561(tdone,ends);
    thread35562(tdone,ends);
    int biggest35563 = 0;
    if(ends[28]>=biggest35563){
      biggest35563=ends[28];
    }
    if(ends[29]>=biggest35563){
      biggest35563=ends[29];
    }
    if(ends[30]>=biggest35563){
      biggest35563=ends[30];
    }
    if(biggest35563 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread35555(int [] tdone, int [] ends){
        S7977=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread35554(int [] tdone, int [] ends){
        S7974=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 361, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread35553(int [] tdone, int [] ends){
        S8007=1;
    S7981=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 359, column: 21
      thread35554(tdone,ends);
      thread35555(tdone,ends);
      int biggest35556 = 0;
      if(ends[51]>=biggest35556){
        biggest35556=ends[51];
      }
      if(ends[52]>=biggest35556){
        biggest35556=ends[52];
      }
      if(biggest35556 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S7981=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread35551(int [] tdone, int [] ends){
        S7939=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread35550(int [] tdone, int [] ends){
        S7936=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread35549(int [] tdone, int [] ends){
        S7969=1;
    S7943=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 341, column: 21
      thread35550(tdone,ends);
      thread35551(tdone,ends);
      int biggest35552 = 0;
      if(ends[48]>=biggest35552){
        biggest35552=ends[48];
      }
      if(ends[49]>=biggest35552){
        biggest35552=ends[49];
      }
      if(biggest35552 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S7943=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread35548(int [] tdone, int [] ends){
        S8009=1;
    thread35549(tdone,ends);
    thread35553(tdone,ends);
    int biggest35557 = 0;
    if(ends[47]>=biggest35557){
      biggest35557=ends[47];
    }
    if(ends[50]>=biggest35557){
      biggest35557=ends[50];
    }
    if(biggest35557 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread35546(int [] tdone, int [] ends){
        S7929=1;
    S7873=0;
    S7853=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 326, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
      S7853=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7848=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 326, column: 8
        S7848=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 326, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 327, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 328, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S7873=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S7873=1;
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

  public void thread35545(int [] tdone, int [] ends){
        S7846=1;
    S7790=0;
    S7770=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 316, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
      S7770=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7765=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 316, column: 7
        S7765=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 316, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 317, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 318, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7790=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7790=1;
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

  public void thread35544(int [] tdone, int [] ends){
        S7931=1;
    thread35545(tdone,ends);
    thread35546(tdone,ends);
    int biggest35547 = 0;
    if(ends[44]>=biggest35547){
      biggest35547=ends[44];
    }
    if(ends[45]>=biggest35547){
      biggest35547=ends[45];
    }
    if(biggest35547 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread35541(int [] tdone, int [] ends){
        S7693=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7693=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread35540(int [] tdone, int [] ends){
        S7687=1;
    S7686=0;
    S7670=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7670=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7665=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7665=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7686=1;
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

  public void thread35539(int [] tdone, int [] ends){
        S7761=1;
    S7695=0;
    thread35540(tdone,ends);
    thread35541(tdone,ends);
    int biggest35542 = 0;
    if(ends[41]>=biggest35542){
      biggest35542=ends[41];
    }
    if(ends[42]>=biggest35542){
      biggest35542=ends[42];
    }
    if(biggest35542 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread35537(int [] tdone, int [] ends){
        S7594=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7594=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread35536(int [] tdone, int [] ends){
        S7588=1;
    S7587=0;
    S7571=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7571=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7566=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7566=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7587=1;
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

  public void thread35535(int [] tdone, int [] ends){
        S7662=1;
    S7596=0;
    thread35536(tdone,ends);
    thread35537(tdone,ends);
    int biggest35538 = 0;
    if(ends[38]>=biggest35538){
      biggest35538=ends[38];
    }
    if(ends[39]>=biggest35538){
      biggest35538=ends[39];
    }
    if(biggest35538 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread35533(int [] tdone, int [] ends){
        S7495=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7495=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread35532(int [] tdone, int [] ends){
        S7489=1;
    S7488=0;
    S7472=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7472=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7467=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7467=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7488=1;
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

  public void thread35531(int [] tdone, int [] ends){
        S7563=1;
    S7497=0;
    thread35532(tdone,ends);
    thread35533(tdone,ends);
    int biggest35534 = 0;
    if(ends[35]>=biggest35534){
      biggest35534=ends[35];
    }
    if(ends[36]>=biggest35534){
      biggest35534=ends[36];
    }
    if(biggest35534 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread35530(int [] tdone, int [] ends){
        S7763=1;
    thread35531(tdone,ends);
    thread35535(tdone,ends);
    thread35539(tdone,ends);
    int biggest35543 = 0;
    if(ends[34]>=biggest35543){
      biggest35543=ends[34];
    }
    if(ends[37]>=biggest35543){
      biggest35543=ends[37];
    }
    if(ends[40]>=biggest35543){
      biggest35543=ends[40];
    }
    if(biggest35543 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35543 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35543 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread35528(int [] tdone, int [] ends){
        S6076=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread35527(int [] tdone, int [] ends){
        S6073=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread35526(int [] tdone, int [] ends){
        S6070=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread35525(int [] tdone, int [] ends){
        S7464=1;
    S6077=0;
    thread35526(tdone,ends);
    thread35527(tdone,ends);
    thread35528(tdone,ends);
    int biggest35529 = 0;
    if(ends[28]>=biggest35529){
      biggest35529=ends[28];
    }
    if(ends[29]>=biggest35529){
      biggest35529=ends[29];
    }
    if(ends[30]>=biggest35529){
      biggest35529=ends[30];
    }
    if(biggest35529 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread35521(int [] tdone, int [] ends){
        S7977=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread35520(int [] tdone, int [] ends){
        S7974=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 361, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread35519(int [] tdone, int [] ends){
        S8007=1;
    S7981=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 359, column: 21
      thread35520(tdone,ends);
      thread35521(tdone,ends);
      int biggest35522 = 0;
      if(ends[51]>=biggest35522){
        biggest35522=ends[51];
      }
      if(ends[52]>=biggest35522){
        biggest35522=ends[52];
      }
      if(biggest35522 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S7981=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread35517(int [] tdone, int [] ends){
        S7939=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread35516(int [] tdone, int [] ends){
        S7936=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread35515(int [] tdone, int [] ends){
        S7969=1;
    S7943=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 341, column: 21
      thread35516(tdone,ends);
      thread35517(tdone,ends);
      int biggest35518 = 0;
      if(ends[48]>=biggest35518){
        biggest35518=ends[48];
      }
      if(ends[49]>=biggest35518){
        biggest35518=ends[49];
      }
      if(biggest35518 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S7943=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread35514(int [] tdone, int [] ends){
        S8009=1;
    thread35515(tdone,ends);
    thread35519(tdone,ends);
    int biggest35523 = 0;
    if(ends[47]>=biggest35523){
      biggest35523=ends[47];
    }
    if(ends[50]>=biggest35523){
      biggest35523=ends[50];
    }
    if(biggest35523 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread35512(int [] tdone, int [] ends){
        S7929=1;
    S7873=0;
    S7853=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 326, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
      S7853=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7848=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 326, column: 8
        S7848=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 326, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 327, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 328, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S7873=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S7873=1;
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

  public void thread35511(int [] tdone, int [] ends){
        S7846=1;
    S7790=0;
    S7770=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 316, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
      S7770=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7765=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 316, column: 7
        S7765=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 316, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 317, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 318, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7790=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7790=1;
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

  public void thread35510(int [] tdone, int [] ends){
        S7931=1;
    thread35511(tdone,ends);
    thread35512(tdone,ends);
    int biggest35513 = 0;
    if(ends[44]>=biggest35513){
      biggest35513=ends[44];
    }
    if(ends[45]>=biggest35513){
      biggest35513=ends[45];
    }
    if(biggest35513 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread35507(int [] tdone, int [] ends){
        S7693=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7693=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread35506(int [] tdone, int [] ends){
        S7687=1;
    S7686=0;
    S7670=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7670=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7665=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7665=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7686=1;
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

  public void thread35505(int [] tdone, int [] ends){
        S7761=1;
    S7695=0;
    thread35506(tdone,ends);
    thread35507(tdone,ends);
    int biggest35508 = 0;
    if(ends[41]>=biggest35508){
      biggest35508=ends[41];
    }
    if(ends[42]>=biggest35508){
      biggest35508=ends[42];
    }
    if(biggest35508 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread35503(int [] tdone, int [] ends){
        S7594=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7594=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread35502(int [] tdone, int [] ends){
        S7588=1;
    S7587=0;
    S7571=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7571=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7566=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7566=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7587=1;
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

  public void thread35501(int [] tdone, int [] ends){
        S7662=1;
    S7596=0;
    thread35502(tdone,ends);
    thread35503(tdone,ends);
    int biggest35504 = 0;
    if(ends[38]>=biggest35504){
      biggest35504=ends[38];
    }
    if(ends[39]>=biggest35504){
      biggest35504=ends[39];
    }
    if(biggest35504 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread35499(int [] tdone, int [] ends){
        S7495=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7495=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread35498(int [] tdone, int [] ends){
        S7489=1;
    S7488=0;
    S7472=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7472=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7467=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7467=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7488=1;
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

  public void thread35497(int [] tdone, int [] ends){
        S7563=1;
    S7497=0;
    thread35498(tdone,ends);
    thread35499(tdone,ends);
    int biggest35500 = 0;
    if(ends[35]>=biggest35500){
      biggest35500=ends[35];
    }
    if(ends[36]>=biggest35500){
      biggest35500=ends[36];
    }
    if(biggest35500 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread35496(int [] tdone, int [] ends){
        S7763=1;
    thread35497(tdone,ends);
    thread35501(tdone,ends);
    thread35505(tdone,ends);
    int biggest35509 = 0;
    if(ends[34]>=biggest35509){
      biggest35509=ends[34];
    }
    if(ends[37]>=biggest35509){
      biggest35509=ends[37];
    }
    if(ends[40]>=biggest35509){
      biggest35509=ends[40];
    }
    if(biggest35509 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35509 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35509 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread35494(int [] tdone, int [] ends){
        S6076=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread35493(int [] tdone, int [] ends){
        S6073=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread35492(int [] tdone, int [] ends){
        S6070=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread35491(int [] tdone, int [] ends){
        S7464=1;
    S6077=0;
    thread35492(tdone,ends);
    thread35493(tdone,ends);
    thread35494(tdone,ends);
    int biggest35495 = 0;
    if(ends[28]>=biggest35495){
      biggest35495=ends[28];
    }
    if(ends[29]>=biggest35495){
      biggest35495=ends[29];
    }
    if(ends[30]>=biggest35495){
      biggest35495=ends[30];
    }
    if(biggest35495 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread35487(int [] tdone, int [] ends){
        S7977=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread35486(int [] tdone, int [] ends){
        S7974=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 361, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread35485(int [] tdone, int [] ends){
        S8007=1;
    S7981=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 359, column: 21
      thread35486(tdone,ends);
      thread35487(tdone,ends);
      int biggest35488 = 0;
      if(ends[51]>=biggest35488){
        biggest35488=ends[51];
      }
      if(ends[52]>=biggest35488){
        biggest35488=ends[52];
      }
      if(biggest35488 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S7981=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread35483(int [] tdone, int [] ends){
        S7939=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread35482(int [] tdone, int [] ends){
        S7936=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread35481(int [] tdone, int [] ends){
        S7969=1;
    S7943=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 341, column: 21
      thread35482(tdone,ends);
      thread35483(tdone,ends);
      int biggest35484 = 0;
      if(ends[48]>=biggest35484){
        biggest35484=ends[48];
      }
      if(ends[49]>=biggest35484){
        biggest35484=ends[49];
      }
      if(biggest35484 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S7943=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread35480(int [] tdone, int [] ends){
        S8009=1;
    thread35481(tdone,ends);
    thread35485(tdone,ends);
    int biggest35489 = 0;
    if(ends[47]>=biggest35489){
      biggest35489=ends[47];
    }
    if(ends[50]>=biggest35489){
      biggest35489=ends[50];
    }
    if(biggest35489 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread35478(int [] tdone, int [] ends){
        S7929=1;
    S7873=0;
    S7853=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 326, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
      S7853=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7848=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 326, column: 8
        S7848=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 326, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 327, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 328, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S7873=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S7873=1;
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

  public void thread35477(int [] tdone, int [] ends){
        S7846=1;
    S7790=0;
    S7770=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 316, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
      S7770=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7765=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 316, column: 7
        S7765=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 316, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 317, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 318, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7790=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7790=1;
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

  public void thread35476(int [] tdone, int [] ends){
        S7931=1;
    thread35477(tdone,ends);
    thread35478(tdone,ends);
    int biggest35479 = 0;
    if(ends[44]>=biggest35479){
      biggest35479=ends[44];
    }
    if(ends[45]>=biggest35479){
      biggest35479=ends[45];
    }
    if(biggest35479 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread35473(int [] tdone, int [] ends){
        S7693=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7693=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread35472(int [] tdone, int [] ends){
        S7687=1;
    S7686=0;
    S7670=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7670=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7665=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7665=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7686=1;
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

  public void thread35471(int [] tdone, int [] ends){
        S7761=1;
    S7695=0;
    thread35472(tdone,ends);
    thread35473(tdone,ends);
    int biggest35474 = 0;
    if(ends[41]>=biggest35474){
      biggest35474=ends[41];
    }
    if(ends[42]>=biggest35474){
      biggest35474=ends[42];
    }
    if(biggest35474 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread35469(int [] tdone, int [] ends){
        S7594=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7594=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread35468(int [] tdone, int [] ends){
        S7588=1;
    S7587=0;
    S7571=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7571=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7566=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7566=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7587=1;
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

  public void thread35467(int [] tdone, int [] ends){
        S7662=1;
    S7596=0;
    thread35468(tdone,ends);
    thread35469(tdone,ends);
    int biggest35470 = 0;
    if(ends[38]>=biggest35470){
      biggest35470=ends[38];
    }
    if(ends[39]>=biggest35470){
      biggest35470=ends[39];
    }
    if(biggest35470 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread35465(int [] tdone, int [] ends){
        S7495=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7495=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread35464(int [] tdone, int [] ends){
        S7489=1;
    S7488=0;
    S7472=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7472=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7467=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7467=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7488=1;
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

  public void thread35463(int [] tdone, int [] ends){
        S7563=1;
    S7497=0;
    thread35464(tdone,ends);
    thread35465(tdone,ends);
    int biggest35466 = 0;
    if(ends[35]>=biggest35466){
      biggest35466=ends[35];
    }
    if(ends[36]>=biggest35466){
      biggest35466=ends[36];
    }
    if(biggest35466 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread35462(int [] tdone, int [] ends){
        S7763=1;
    thread35463(tdone,ends);
    thread35467(tdone,ends);
    thread35471(tdone,ends);
    int biggest35475 = 0;
    if(ends[34]>=biggest35475){
      biggest35475=ends[34];
    }
    if(ends[37]>=biggest35475){
      biggest35475=ends[37];
    }
    if(ends[40]>=biggest35475){
      biggest35475=ends[40];
    }
    if(biggest35475 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35475 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35475 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread35460(int [] tdone, int [] ends){
        S6076=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread35459(int [] tdone, int [] ends){
        S6073=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread35458(int [] tdone, int [] ends){
        S6070=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread35457(int [] tdone, int [] ends){
        S7464=1;
    S6077=0;
    thread35458(tdone,ends);
    thread35459(tdone,ends);
    thread35460(tdone,ends);
    int biggest35461 = 0;
    if(ends[28]>=biggest35461){
      biggest35461=ends[28];
    }
    if(ends[29]>=biggest35461){
      biggest35461=ends[29];
    }
    if(ends[30]>=biggest35461){
      biggest35461=ends[30];
    }
    if(biggest35461 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread35453(int [] tdone, int [] ends){
        S7977=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread35452(int [] tdone, int [] ends){
        S7974=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 361, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread35451(int [] tdone, int [] ends){
        S8007=1;
    S7981=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 359, column: 21
      thread35452(tdone,ends);
      thread35453(tdone,ends);
      int biggest35454 = 0;
      if(ends[51]>=biggest35454){
        biggest35454=ends[51];
      }
      if(ends[52]>=biggest35454){
        biggest35454=ends[52];
      }
      if(biggest35454 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S7981=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread35449(int [] tdone, int [] ends){
        S7939=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread35448(int [] tdone, int [] ends){
        S7936=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread35447(int [] tdone, int [] ends){
        S7969=1;
    S7943=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 341, column: 21
      thread35448(tdone,ends);
      thread35449(tdone,ends);
      int biggest35450 = 0;
      if(ends[48]>=biggest35450){
        biggest35450=ends[48];
      }
      if(ends[49]>=biggest35450){
        biggest35450=ends[49];
      }
      if(biggest35450 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S7943=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread35446(int [] tdone, int [] ends){
        S8009=1;
    thread35447(tdone,ends);
    thread35451(tdone,ends);
    int biggest35455 = 0;
    if(ends[47]>=biggest35455){
      biggest35455=ends[47];
    }
    if(ends[50]>=biggest35455){
      biggest35455=ends[50];
    }
    if(biggest35455 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread35444(int [] tdone, int [] ends){
        S7929=1;
    S7873=0;
    S7853=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 326, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
      S7853=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7848=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 326, column: 8
        S7848=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 326, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 327, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 328, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S7873=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S7873=1;
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

  public void thread35443(int [] tdone, int [] ends){
        S7846=1;
    S7790=0;
    S7770=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 316, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
      S7770=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7765=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 316, column: 7
        S7765=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 316, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 317, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 318, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7790=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7790=1;
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

  public void thread35442(int [] tdone, int [] ends){
        S7931=1;
    thread35443(tdone,ends);
    thread35444(tdone,ends);
    int biggest35445 = 0;
    if(ends[44]>=biggest35445){
      biggest35445=ends[44];
    }
    if(ends[45]>=biggest35445){
      biggest35445=ends[45];
    }
    if(biggest35445 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread35439(int [] tdone, int [] ends){
        S7693=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7693=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread35438(int [] tdone, int [] ends){
        S7687=1;
    S7686=0;
    S7670=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7670=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7665=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7665=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7686=1;
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

  public void thread35437(int [] tdone, int [] ends){
        S7761=1;
    S7695=0;
    thread35438(tdone,ends);
    thread35439(tdone,ends);
    int biggest35440 = 0;
    if(ends[41]>=biggest35440){
      biggest35440=ends[41];
    }
    if(ends[42]>=biggest35440){
      biggest35440=ends[42];
    }
    if(biggest35440 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread35435(int [] tdone, int [] ends){
        S7594=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7594=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread35434(int [] tdone, int [] ends){
        S7588=1;
    S7587=0;
    S7571=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7571=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7566=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7566=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7587=1;
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

  public void thread35433(int [] tdone, int [] ends){
        S7662=1;
    S7596=0;
    thread35434(tdone,ends);
    thread35435(tdone,ends);
    int biggest35436 = 0;
    if(ends[38]>=biggest35436){
      biggest35436=ends[38];
    }
    if(ends[39]>=biggest35436){
      biggest35436=ends[39];
    }
    if(biggest35436 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread35431(int [] tdone, int [] ends){
        S7495=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7495=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread35430(int [] tdone, int [] ends){
        S7489=1;
    S7488=0;
    S7472=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7472=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7467=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7467=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7488=1;
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

  public void thread35429(int [] tdone, int [] ends){
        S7563=1;
    S7497=0;
    thread35430(tdone,ends);
    thread35431(tdone,ends);
    int biggest35432 = 0;
    if(ends[35]>=biggest35432){
      biggest35432=ends[35];
    }
    if(ends[36]>=biggest35432){
      biggest35432=ends[36];
    }
    if(biggest35432 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread35428(int [] tdone, int [] ends){
        S7763=1;
    thread35429(tdone,ends);
    thread35433(tdone,ends);
    thread35437(tdone,ends);
    int biggest35441 = 0;
    if(ends[34]>=biggest35441){
      biggest35441=ends[34];
    }
    if(ends[37]>=biggest35441){
      biggest35441=ends[37];
    }
    if(ends[40]>=biggest35441){
      biggest35441=ends[40];
    }
    if(biggest35441 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35441 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35441 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread35426(int [] tdone, int [] ends){
        S6076=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread35425(int [] tdone, int [] ends){
        S6073=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread35424(int [] tdone, int [] ends){
        S6070=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread35423(int [] tdone, int [] ends){
        S7464=1;
    S6077=0;
    thread35424(tdone,ends);
    thread35425(tdone,ends);
    thread35426(tdone,ends);
    int biggest35427 = 0;
    if(ends[28]>=biggest35427){
      biggest35427=ends[28];
    }
    if(ends[29]>=biggest35427){
      biggest35427=ends[29];
    }
    if(ends[30]>=biggest35427){
      biggest35427=ends[30];
    }
    if(biggest35427 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread35419(int [] tdone, int [] ends){
        S7977=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread35418(int [] tdone, int [] ends){
        S7974=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 361, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread35417(int [] tdone, int [] ends){
        S8007=1;
    S7981=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 359, column: 21
      thread35418(tdone,ends);
      thread35419(tdone,ends);
      int biggest35420 = 0;
      if(ends[51]>=biggest35420){
        biggest35420=ends[51];
      }
      if(ends[52]>=biggest35420){
        biggest35420=ends[52];
      }
      if(biggest35420 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S7981=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread35415(int [] tdone, int [] ends){
        S7939=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread35414(int [] tdone, int [] ends){
        S7936=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread35413(int [] tdone, int [] ends){
        S7969=1;
    S7943=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 341, column: 21
      thread35414(tdone,ends);
      thread35415(tdone,ends);
      int biggest35416 = 0;
      if(ends[48]>=biggest35416){
        biggest35416=ends[48];
      }
      if(ends[49]>=biggest35416){
        biggest35416=ends[49];
      }
      if(biggest35416 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S7943=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread35412(int [] tdone, int [] ends){
        S8009=1;
    thread35413(tdone,ends);
    thread35417(tdone,ends);
    int biggest35421 = 0;
    if(ends[47]>=biggest35421){
      biggest35421=ends[47];
    }
    if(ends[50]>=biggest35421){
      biggest35421=ends[50];
    }
    if(biggest35421 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread35410(int [] tdone, int [] ends){
        S7929=1;
    S7873=0;
    S7853=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 326, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
      S7853=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7848=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 326, column: 8
        S7848=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 326, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 327, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 328, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S7873=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S7873=1;
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

  public void thread35409(int [] tdone, int [] ends){
        S7846=1;
    S7790=0;
    S7770=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 316, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
      S7770=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7765=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 316, column: 7
        S7765=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 316, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 317, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 318, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7790=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7790=1;
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

  public void thread35408(int [] tdone, int [] ends){
        S7931=1;
    thread35409(tdone,ends);
    thread35410(tdone,ends);
    int biggest35411 = 0;
    if(ends[44]>=biggest35411){
      biggest35411=ends[44];
    }
    if(ends[45]>=biggest35411){
      biggest35411=ends[45];
    }
    if(biggest35411 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread35405(int [] tdone, int [] ends){
        S7693=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7693=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread35404(int [] tdone, int [] ends){
        S7687=1;
    S7686=0;
    S7670=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7670=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7665=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7665=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7686=1;
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

  public void thread35403(int [] tdone, int [] ends){
        S7761=1;
    S7695=0;
    thread35404(tdone,ends);
    thread35405(tdone,ends);
    int biggest35406 = 0;
    if(ends[41]>=biggest35406){
      biggest35406=ends[41];
    }
    if(ends[42]>=biggest35406){
      biggest35406=ends[42];
    }
    if(biggest35406 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread35401(int [] tdone, int [] ends){
        S7594=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7594=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread35400(int [] tdone, int [] ends){
        S7588=1;
    S7587=0;
    S7571=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7571=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7566=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7566=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7587=1;
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

  public void thread35399(int [] tdone, int [] ends){
        S7662=1;
    S7596=0;
    thread35400(tdone,ends);
    thread35401(tdone,ends);
    int biggest35402 = 0;
    if(ends[38]>=biggest35402){
      biggest35402=ends[38];
    }
    if(ends[39]>=biggest35402){
      biggest35402=ends[39];
    }
    if(biggest35402 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread35397(int [] tdone, int [] ends){
        S7495=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7495=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread35396(int [] tdone, int [] ends){
        S7489=1;
    S7488=0;
    S7472=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7472=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7467=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7467=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7488=1;
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

  public void thread35395(int [] tdone, int [] ends){
        S7563=1;
    S7497=0;
    thread35396(tdone,ends);
    thread35397(tdone,ends);
    int biggest35398 = 0;
    if(ends[35]>=biggest35398){
      biggest35398=ends[35];
    }
    if(ends[36]>=biggest35398){
      biggest35398=ends[36];
    }
    if(biggest35398 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread35394(int [] tdone, int [] ends){
        S7763=1;
    thread35395(tdone,ends);
    thread35399(tdone,ends);
    thread35403(tdone,ends);
    int biggest35407 = 0;
    if(ends[34]>=biggest35407){
      biggest35407=ends[34];
    }
    if(ends[37]>=biggest35407){
      biggest35407=ends[37];
    }
    if(ends[40]>=biggest35407){
      biggest35407=ends[40];
    }
    if(biggest35407 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35407 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35407 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread35392(int [] tdone, int [] ends){
        S6076=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread35391(int [] tdone, int [] ends){
        S6073=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread35390(int [] tdone, int [] ends){
        S6070=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread35389(int [] tdone, int [] ends){
        S7464=1;
    S6077=0;
    thread35390(tdone,ends);
    thread35391(tdone,ends);
    thread35392(tdone,ends);
    int biggest35393 = 0;
    if(ends[28]>=biggest35393){
      biggest35393=ends[28];
    }
    if(ends[29]>=biggest35393){
      biggest35393=ends[29];
    }
    if(ends[30]>=biggest35393){
      biggest35393=ends[30];
    }
    if(biggest35393 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread35385(int [] tdone, int [] ends){
        S7977=1;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread35384(int [] tdone, int [] ends){
        S7974=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 361, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread35383(int [] tdone, int [] ends){
        S8007=1;
    S7981=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 359, column: 21
      thread35384(tdone,ends);
      thread35385(tdone,ends);
      int biggest35386 = 0;
      if(ends[51]>=biggest35386){
        biggest35386=ends[51];
      }
      if(ends[52]>=biggest35386){
        biggest35386=ends[52];
      }
      if(biggest35386 == 1){
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
      }
    }
    else {
      S7981=1;
      active[50]=1;
      ends[50]=1;
      tdone[50]=1;
    }
  }

  public void thread35381(int [] tdone, int [] ends){
        S7939=1;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread35380(int [] tdone, int [] ends){
        S7936=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[48]=1;
    ends[48]=1;
    tdone[48]=1;
  }

  public void thread35379(int [] tdone, int [] ends){
        S7969=1;
    S7943=0;
    if(bottleAtPos3_26.getprestatus()){//sysj\conveyor_controller.sysj line: 341, column: 21
      thread35380(tdone,ends);
      thread35381(tdone,ends);
      int biggest35382 = 0;
      if(ends[48]>=biggest35382){
        biggest35382=ends[48];
      }
      if(ends[49]>=biggest35382){
        biggest35382=ends[49];
      }
      if(biggest35382 == 1){
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
    else {
      S7943=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
  }

  public void thread35378(int [] tdone, int [] ends){
        S8009=1;
    thread35379(tdone,ends);
    thread35383(tdone,ends);
    int biggest35387 = 0;
    if(ends[47]>=biggest35387){
      biggest35387=ends[47];
    }
    if(ends[50]>=biggest35387){
      biggest35387=ends[50];
    }
    if(biggest35387 == 1){
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
  }

  public void thread35376(int [] tdone, int [] ends){
        S7929=1;
    S7873=0;
    S7853=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 326, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
      S7853=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S7848=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 326, column: 8
        S7848=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 326, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 326, column: 8
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 326, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 327, column: 11
            bottleAtPos3_26.setPresent();//sysj\conveyor_controller.sysj line: 328, column: 9
            currsigs.addElement(bottleAtPos3_26);
            S7873=1;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
          }
          else {
            S7873=1;
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

  public void thread35375(int [] tdone, int [] ends){
        S7846=1;
    S7790=0;
    S7770=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 316, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
      S7770=1;
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
    else {
      S7765=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 316, column: 7
        S7765=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 316, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 316, column: 7
          ends[44]=2;
          ;//sysj\conveyor_controller.sysj line: 316, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 317, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 318, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S7790=1;
            active[44]=1;
            ends[44]=1;
            tdone[44]=1;
          }
          else {
            S7790=1;
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

  public void thread35374(int [] tdone, int [] ends){
        S7931=1;
    thread35375(tdone,ends);
    thread35376(tdone,ends);
    int biggest35377 = 0;
    if(ends[44]>=biggest35377){
      biggest35377=ends[44];
    }
    if(ends[45]>=biggest35377){
      biggest35377=ends[45];
    }
    if(biggest35377 == 1){
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread35371(int [] tdone, int [] ends){
        S7693=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S7693=0;
      active[42]=0;
      ends[42]=0;
      tdone[42]=1;
    }
  }

  public void thread35370(int [] tdone, int [] ends){
        S7687=1;
    S7686=0;
    S7670=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7670=1;
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
    else {
      S7665=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7665=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[41]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7686=1;
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

  public void thread35369(int [] tdone, int [] ends){
        S7761=1;
    S7695=0;
    thread35370(tdone,ends);
    thread35371(tdone,ends);
    int biggest35372 = 0;
    if(ends[41]>=biggest35372){
      biggest35372=ends[41];
    }
    if(ends[42]>=biggest35372){
      biggest35372=ends[42];
    }
    if(biggest35372 == 1){
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
  }

  public void thread35367(int [] tdone, int [] ends){
        S7594=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7594=0;
      active[39]=0;
      ends[39]=0;
      tdone[39]=1;
    }
  }

  public void thread35366(int [] tdone, int [] ends){
        S7588=1;
    S7587=0;
    S7571=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7571=1;
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
    else {
      S7566=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7566=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[38]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7587=1;
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

  public void thread35365(int [] tdone, int [] ends){
        S7662=1;
    S7596=0;
    thread35366(tdone,ends);
    thread35367(tdone,ends);
    int biggest35368 = 0;
    if(ends[38]>=biggest35368){
      biggest35368=ends[38];
    }
    if(ends[39]>=biggest35368){
      biggest35368=ends[39];
    }
    if(biggest35368 == 1){
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
  }

  public void thread35363(int [] tdone, int [] ends){
        S7495=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7495=0;
      active[36]=0;
      ends[36]=0;
      tdone[36]=1;
    }
  }

  public void thread35362(int [] tdone, int [] ends){
        S7489=1;
    S7488=0;
    S7472=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S7472=1;
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
    else {
      S7467=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S7467=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[35]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S7488=1;
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

  public void thread35361(int [] tdone, int [] ends){
        S7563=1;
    S7497=0;
    thread35362(tdone,ends);
    thread35363(tdone,ends);
    int biggest35364 = 0;
    if(ends[35]>=biggest35364){
      biggest35364=ends[35];
    }
    if(ends[36]>=biggest35364){
      biggest35364=ends[36];
    }
    if(biggest35364 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread35360(int [] tdone, int [] ends){
        S7763=1;
    thread35361(tdone,ends);
    thread35365(tdone,ends);
    thread35369(tdone,ends);
    int biggest35373 = 0;
    if(ends[34]>=biggest35373){
      biggest35373=ends[34];
    }
    if(ends[37]>=biggest35373){
      biggest35373=ends[37];
    }
    if(ends[40]>=biggest35373){
      biggest35373=ends[40];
    }
    if(biggest35373 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35373 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    if(biggest35373 == 1){
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread35358(int [] tdone, int [] ends){
        S6076=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread35357(int [] tdone, int [] ends){
        S6073=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread35356(int [] tdone, int [] ends){
        S6070=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread35355(int [] tdone, int [] ends){
        S7464=1;
    S6077=0;
    thread35356(tdone,ends);
    thread35357(tdone,ends);
    thread35358(tdone,ends);
    int biggest35359 = 0;
    if(ends[28]>=biggest35359){
      biggest35359=ends[28];
    }
    if(ends[29]>=biggest35359){
      biggest35359=ends[29];
    }
    if(ends[30]>=biggest35359){
      biggest35359=ends[30];
    }
    if(biggest35359 == 1){
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
      switch(S21604){
        case 0 : 
          S21604=0;
          break RUN;
        
        case 1 : 
          S21604=2;
          S21604=2;
          cvR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          fR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          cR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          bottleAtPos5_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          bottleAtPos3_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          S5935=0;
          S5831=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 240, column: 7
            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
            S5831=1;
            active[26]=1;
            ends[26]=1;
            break RUN;
          }
          else {
            S5826=0;
            if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
              convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 240, column: 7
              S5826=1;
              if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                ends[26]=2;
                ;//sysj\conveyor_controller.sysj line: 240, column: 7
                S5935=1;
                S5853=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                  S5853=1;
                  active[26]=1;
                  ends[26]=1;
                  break RUN;
                }
                else {
                  S5848=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                    S5848=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                      ends[26]=2;
                      ;//sysj\conveyor_controller.sysj line: 241, column: 7
                      S5935=2;
                      S5942=0;
                      if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                        S5942=1;
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                      else {
                        S5937=0;
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                          S5937=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 242, column: 7
                            S5935=3;
                            thread35355(tdone,ends);
                            thread35360(tdone,ends);
                            thread35374(tdone,ends);
                            thread35378(tdone,ends);
                            int biggest35388 = 0;
                            if(ends[27]>=biggest35388){
                              biggest35388=ends[27];
                            }
                            if(ends[33]>=biggest35388){
                              biggest35388=ends[33];
                            }
                            if(ends[43]>=biggest35388){
                              biggest35388=ends[43];
                            }
                            if(ends[46]>=biggest35388){
                              biggest35388=ends[46];
                            }
                            if(biggest35388 == 1){
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
          cvR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          fR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          cR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          bottleAtPos5_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          bottleAtPos3_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          switch(S5935){
            case 0 : 
              switch(S5831){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 240, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                    S5831=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S5826){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                          convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 240, column: 7
                          S5826=1;
                          if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 240, column: 7
                            S5935=1;
                            S5853=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                              S5853=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S5848=0;
                              if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                                fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                                S5848=1;
                                if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 241, column: 7
                                  S5935=2;
                                  S5942=0;
                                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                    S5942=1;
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                  else {
                                    S5937=0;
                                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                      S5937=1;
                                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                        ends[26]=2;
                                        ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                        S5935=3;
                                        thread35389(tdone,ends);
                                        thread35394(tdone,ends);
                                        thread35408(tdone,ends);
                                        thread35412(tdone,ends);
                                        int biggest35422 = 0;
                                        if(ends[27]>=biggest35422){
                                          biggest35422=ends[27];
                                        }
                                        if(ends[33]>=biggest35422){
                                          biggest35422=ends[33];
                                        }
                                        if(ends[43]>=biggest35422){
                                          biggest35422=ends[43];
                                        }
                                        if(ends[46]>=biggest35422){
                                          biggest35422=ends[46];
                                        }
                                        if(biggest35422 == 1){
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
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 240, column: 7
                          S5935=1;
                          S5853=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                            S5853=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S5848=0;
                            if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                              fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                              S5848=1;
                              if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                                fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 241, column: 7
                                S5935=2;
                                S5942=0;
                                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                  S5942=1;
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                                else {
                                  S5937=0;
                                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                    S5937=1;
                                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                      ends[26]=2;
                                      ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                      S5935=3;
                                      thread35423(tdone,ends);
                                      thread35428(tdone,ends);
                                      thread35442(tdone,ends);
                                      thread35446(tdone,ends);
                                      int biggest35456 = 0;
                                      if(ends[27]>=biggest35456){
                                        biggest35456=ends[27];
                                      }
                                      if(ends[33]>=biggest35456){
                                        biggest35456=ends[33];
                                      }
                                      if(ends[43]>=biggest35456){
                                        biggest35456=ends[43];
                                      }
                                      if(ends[46]>=biggest35456){
                                        biggest35456=ends[46];
                                      }
                                      if(biggest35456 == 1){
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
                  S5831=1;
                  S5831=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 240, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                    S5831=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S5826=0;
                    if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                      convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 240, column: 7
                      S5826=1;
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 240, column: 7
                        S5935=1;
                        S5853=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                          S5853=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S5848=0;
                          if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                            fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                            S5848=1;
                            if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 241, column: 7
                              S5935=2;
                              S5942=0;
                              if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                S5942=1;
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                              else {
                                S5937=0;
                                if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                  capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                  S5937=1;
                                  if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                    ends[26]=2;
                                    ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                    S5935=3;
                                    thread35457(tdone,ends);
                                    thread35462(tdone,ends);
                                    thread35476(tdone,ends);
                                    thread35480(tdone,ends);
                                    int biggest35490 = 0;
                                    if(ends[27]>=biggest35490){
                                      biggest35490=ends[27];
                                    }
                                    if(ends[33]>=biggest35490){
                                      biggest35490=ends[33];
                                    }
                                    if(ends[43]>=biggest35490){
                                      biggest35490=ends[43];
                                    }
                                    if(ends[46]>=biggest35490){
                                      biggest35490=ends[46];
                                    }
                                    if(biggest35490 == 1){
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
              switch(S5853){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                    S5853=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S5848){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                          fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                          S5848=1;
                          if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 241, column: 7
                            S5935=2;
                            S5942=0;
                            if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                              S5942=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S5937=0;
                              if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                S5937=1;
                                if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                  S5935=3;
                                  thread35491(tdone,ends);
                                  thread35496(tdone,ends);
                                  thread35510(tdone,ends);
                                  thread35514(tdone,ends);
                                  int biggest35524 = 0;
                                  if(ends[27]>=biggest35524){
                                    biggest35524=ends[27];
                                  }
                                  if(ends[33]>=biggest35524){
                                    biggest35524=ends[33];
                                  }
                                  if(ends[43]>=biggest35524){
                                    biggest35524=ends[43];
                                  }
                                  if(ends[46]>=biggest35524){
                                    biggest35524=ends[46];
                                  }
                                  if(biggest35524 == 1){
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
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 241, column: 7
                          S5935=2;
                          S5942=0;
                          if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                            S5942=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S5937=0;
                            if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                              S5937=1;
                              if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                S5935=3;
                                thread35525(tdone,ends);
                                thread35530(tdone,ends);
                                thread35544(tdone,ends);
                                thread35548(tdone,ends);
                                int biggest35558 = 0;
                                if(ends[27]>=biggest35558){
                                  biggest35558=ends[27];
                                }
                                if(ends[33]>=biggest35558){
                                  biggest35558=ends[33];
                                }
                                if(ends[43]>=biggest35558){
                                  biggest35558=ends[43];
                                }
                                if(ends[46]>=biggest35558){
                                  biggest35558=ends[46];
                                }
                                if(biggest35558 == 1){
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
                  S5853=1;
                  S5853=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                    S5853=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S5848=0;
                    if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                      fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                      S5848=1;
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 241, column: 7
                        S5935=2;
                        S5942=0;
                        if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                          S5942=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S5937=0;
                          if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                            S5937=1;
                            if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 242, column: 7
                              S5935=3;
                              thread35559(tdone,ends);
                              thread35564(tdone,ends);
                              thread35578(tdone,ends);
                              thread35582(tdone,ends);
                              int biggest35592 = 0;
                              if(ends[27]>=biggest35592){
                                biggest35592=ends[27];
                              }
                              if(ends[33]>=biggest35592){
                                biggest35592=ends[33];
                              }
                              if(ends[43]>=biggest35592){
                                biggest35592=ends[43];
                              }
                              if(ends[46]>=biggest35592){
                                biggest35592=ends[46];
                              }
                              if(biggest35592 == 1){
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
              switch(S5942){
                case 0 : 
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                    S5942=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S5937){
                      case 0 : 
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                          S5937=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 242, column: 7
                            S5935=3;
                            thread35593(tdone,ends);
                            thread35598(tdone,ends);
                            thread35612(tdone,ends);
                            thread35616(tdone,ends);
                            int biggest35626 = 0;
                            if(ends[27]>=biggest35626){
                              biggest35626=ends[27];
                            }
                            if(ends[33]>=biggest35626){
                              biggest35626=ends[33];
                            }
                            if(ends[43]>=biggest35626){
                              biggest35626=ends[43];
                            }
                            if(ends[46]>=biggest35626){
                              biggest35626=ends[46];
                            }
                            if(biggest35626 == 1){
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
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 242, column: 7
                          S5935=3;
                          thread35627(tdone,ends);
                          thread35632(tdone,ends);
                          thread35646(tdone,ends);
                          thread35650(tdone,ends);
                          int biggest35660 = 0;
                          if(ends[27]>=biggest35660){
                            biggest35660=ends[27];
                          }
                          if(ends[33]>=biggest35660){
                            biggest35660=ends[33];
                          }
                          if(ends[43]>=biggest35660){
                            biggest35660=ends[43];
                          }
                          if(ends[46]>=biggest35660){
                            biggest35660=ends[46];
                          }
                          if(biggest35660 == 1){
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
                  S5942=1;
                  S5942=0;
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                    S5942=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S5937=0;
                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                      S5937=1;
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 242, column: 7
                        S5935=3;
                        thread35661(tdone,ends);
                        thread35666(tdone,ends);
                        thread35680(tdone,ends);
                        thread35684(tdone,ends);
                        int biggest35694 = 0;
                        if(ends[27]>=biggest35694){
                          biggest35694=ends[27];
                        }
                        if(ends[33]>=biggest35694){
                          biggest35694=ends[33];
                        }
                        if(ends[43]>=biggest35694){
                          biggest35694=ends[43];
                        }
                        if(ends[46]>=biggest35694){
                          biggest35694=ends[46];
                        }
                        if(biggest35694 == 1){
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
              thread35695(tdone,ends);
              thread35720(tdone,ends);
              thread35743(tdone,ends);
              thread35747(tdone,ends);
              int biggest35763 = 0;
              if(ends[27]>=biggest35763){
                biggest35763=ends[27];
              }
              if(ends[33]>=biggest35763){
                biggest35763=ends[33];
              }
              if(ends[43]>=biggest35763){
                biggest35763=ends[43];
              }
              if(ends[46]>=biggest35763){
                biggest35763=ends[46];
              }
              if(biggest35763 == 1){
                active[26]=1;
                ends[26]=1;
                break RUN;
              }
              //FINXME code
              if(biggest35763 == 0){
                S21604=0;
                active[26]=0;
                ends[26]=0;
                S21604=0;
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

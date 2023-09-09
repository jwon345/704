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
  private Signal cvR_21;
  private Signal fR_21;
  private Signal cR_21;
  private Signal bottleAtPos5_21;
  private Signal bottleAtPos3_21;
  private long __start_thread_27;//sysj\conveyor_controller.sysj line: 246, column: 44
  private int i_thread_22;//sysj\conveyor_controller.sysj line: 255, column: 10
  private long __start_thread_22;//sysj\conveyor_controller.sysj line: 208, column: 7
  private int S24545 = 1;
  private int S4412 = 1;
  private int S4308 = 1;
  private int S4303 = 1;
  private int S4330 = 1;
  private int S4325 = 1;
  private int S4419 = 1;
  private int S4414 = 1;
  private int S6499 = 1;
  private int S4554 = 1;
  private int S4547 = 1;
  private int S4550 = 1;
  private int S4553 = 1;
  private int S4568 = 1;
  private int S4591 = 1;
  private int S4607 = 1;
  private int S4710 = 1;
  private int S4705 = 1;
  private int S6798 = 1;
  private int S6598 = 1;
  private int S6532 = 1;
  private int S6524 = 1;
  private int S6523 = 1;
  private int S6507 = 1;
  private int S6502 = 1;
  private int S6530 = 1;
  private int S6697 = 1;
  private int S6631 = 1;
  private int S6623 = 1;
  private int S6622 = 1;
  private int S6606 = 1;
  private int S6601 = 1;
  private int S6629 = 1;
  private int S6796 = 1;
  private int S6730 = 1;
  private int S6722 = 1;
  private int S6721 = 1;
  private int S6705 = 1;
  private int S6700 = 1;
  private int S6728 = 1;
  private int S6966 = 1;
  private int S6881 = 1;
  private int S6825 = 1;
  private int S6805 = 1;
  private int S6800 = 1;
  private int S6964 = 1;
  private int S6908 = 1;
  private int S6888 = 1;
  private int S6883 = 1;
  private int S7044 = 1;
  private int S7004 = 1;
  private int S6978 = 1;
  private int S6971 = 1;
  private int S6974 = 1;
  private int S7042 = 1;
  private int S7016 = 1;
  private int S7009 = 1;
  private int S7012 = 1;
  
  private int[] ends = new int[72];
  private int[] tdone = new int[72];
  
  public void thread38688(int [] tdone, int [] ends){
        S7012=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38687(int [] tdone, int [] ends){
        S7009=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38685(int [] tdone, int [] ends){
        switch(S7012){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_controller.sysj line: 331, column: 29
          ends[47]=2;
          tdone[47]=1;
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
        break;
      
    }
  }

  public void thread38684(int [] tdone, int [] ends){
        switch(S7009){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
        currsigs.addElement(bottleAtPos5E);
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
        break;
      
    }
  }

  public void thread38683(int [] tdone, int [] ends){
        switch(S7042){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S7016){
          case 0 : 
            thread38684(tdone,ends);
            thread38685(tdone,ends);
            int biggest38686 = 0;
            if(ends[46]>=biggest38686){
              biggest38686=ends[46];
            }
            if(ends[47]>=biggest38686){
              biggest38686=ends[47];
            }
            if(biggest38686 == 1){
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            if(biggest38686 == 2){
              ends[45]=2;
              ;//sysj\conveyor_controller.sysj line: 325, column: 34
              S7016=1;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            //FINXME code
            if(biggest38686 == 0){
              ;//sysj\conveyor_controller.sysj line: 333, column: 20
              S7016=1;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
          case 1 : 
            S7016=1;
            S7016=0;
            if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
              thread38687(tdone,ends);
              thread38688(tdone,ends);
              int biggest38689 = 0;
              if(ends[46]>=biggest38689){
                biggest38689=ends[46];
              }
              if(ends[47]>=biggest38689){
                biggest38689=ends[47];
              }
              if(biggest38689 == 1){
                active[45]=1;
                ends[45]=1;
                tdone[45]=1;
              }
            }
            else {
              S7016=1;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38681(int [] tdone, int [] ends){
        S6974=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38680(int [] tdone, int [] ends){
        S6971=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38678(int [] tdone, int [] ends){
        switch(S6974){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_controller.sysj line: 313, column: 29
          ends[44]=2;
          tdone[44]=1;
        }
        else {
          active[44]=1;
          ends[44]=1;
          tdone[44]=1;
        }
        break;
      
    }
  }

  public void thread38677(int [] tdone, int [] ends){
        switch(S6971){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
        currsigs.addElement(bottleAtPos3E);
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
        break;
      
    }
  }

  public void thread38676(int [] tdone, int [] ends){
        switch(S7004){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S6978){
          case 0 : 
            thread38677(tdone,ends);
            thread38678(tdone,ends);
            int biggest38679 = 0;
            if(ends[43]>=biggest38679){
              biggest38679=ends[43];
            }
            if(ends[44]>=biggest38679){
              biggest38679=ends[44];
            }
            if(biggest38679 == 1){
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            if(biggest38679 == 2){
              ends[42]=2;
              ;//sysj\conveyor_controller.sysj line: 307, column: 34
              S6978=1;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            //FINXME code
            if(biggest38679 == 0){
              ;//sysj\conveyor_controller.sysj line: 315, column: 20
              S6978=1;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
          case 1 : 
            S6978=1;
            S6978=0;
            if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
              thread38680(tdone,ends);
              thread38681(tdone,ends);
              int biggest38682 = 0;
              if(ends[43]>=biggest38682){
                biggest38682=ends[43];
              }
              if(ends[44]>=biggest38682){
                biggest38682=ends[44];
              }
              if(biggest38682 == 1){
                active[42]=1;
                ends[42]=1;
                tdone[42]=1;
              }
            }
            else {
              S6978=1;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38675(int [] tdone, int [] ends){
        switch(S7044){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        thread38676(tdone,ends);
        thread38683(tdone,ends);
        int biggest38690 = 0;
        if(ends[42]>=biggest38690){
          biggest38690=ends[42];
        }
        if(ends[45]>=biggest38690){
          biggest38690=ends[45];
        }
        if(biggest38690 == 1){
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        //FINXME code
        if(biggest38690 == 0){
          S7044=0;
          active[41]=0;
          ends[41]=0;
          tdone[41]=1;
        }
        break;
      
    }
  }

  public void thread38673(int [] tdone, int [] ends){
        switch(S6964){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        switch(S6908){
          case 0 : 
            switch(S6888){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
                  S6888=1;
                  active[40]=1;
                  ends[40]=1;
                  tdone[40]=1;
                }
                else {
                  switch(S6883){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
                        S6883=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
                          ends[40]=2;
                          ;//sysj\conveyor_controller.sysj line: 292, column: 8
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
                            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
                            currsigs.addElement(bottleAtPos3_21);
                            S6908=1;
                            active[40]=1;
                            ends[40]=1;
                            tdone[40]=1;
                          }
                          else {
                            S6908=1;
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
                      else {
                        active[40]=1;
                        ends[40]=1;
                        tdone[40]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
                        ends[40]=2;
                        ;//sysj\conveyor_controller.sysj line: 292, column: 8
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
                          bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
                          currsigs.addElement(bottleAtPos3_21);
                          S6908=1;
                          active[40]=1;
                          ends[40]=1;
                          tdone[40]=1;
                        }
                        else {
                          S6908=1;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S6888=1;
                S6888=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
                  S6888=1;
                  active[40]=1;
                  ends[40]=1;
                  tdone[40]=1;
                }
                else {
                  S6883=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
                    S6883=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
                      ends[40]=2;
                      ;//sysj\conveyor_controller.sysj line: 292, column: 8
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
                        bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
                        currsigs.addElement(bottleAtPos3_21);
                        S6908=1;
                        active[40]=1;
                        ends[40]=1;
                        tdone[40]=1;
                      }
                      else {
                        S6908=1;
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
            S6908=1;
            S6908=0;
            S6888=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
              S6888=1;
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            else {
              S6883=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
                S6883=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
                  ends[40]=2;
                  ;//sysj\conveyor_controller.sysj line: 292, column: 8
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
                    bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
                    currsigs.addElement(bottleAtPos3_21);
                    S6908=1;
                    active[40]=1;
                    ends[40]=1;
                    tdone[40]=1;
                  }
                  else {
                    S6908=1;
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
              else {
                active[40]=1;
                ends[40]=1;
                tdone[40]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38672(int [] tdone, int [] ends){
        switch(S6881){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S6825){
          case 0 : 
            switch(S6805){
              case 0 : 
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
                  S6805=1;
                  active[39]=1;
                  ends[39]=1;
                  tdone[39]=1;
                }
                else {
                  switch(S6800){
                    case 0 : 
                      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
                        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
                        S6800=1;
                        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
                          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
                          ends[39]=2;
                          ;//sysj\conveyor_controller.sysj line: 282, column: 7
                          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
                            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
                            currsigs.addElement(bottleAtPos5_21);
                            S6825=1;
                            active[39]=1;
                            ends[39]=1;
                            tdone[39]=1;
                          }
                          else {
                            S6825=1;
                            active[39]=1;
                            ends[39]=1;
                            tdone[39]=1;
                          }
                        }
                        else {
                          active[39]=1;
                          ends[39]=1;
                          tdone[39]=1;
                        }
                      }
                      else {
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
                        checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
                        ends[39]=2;
                        ;//sysj\conveyor_controller.sysj line: 282, column: 7
                        if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
                          bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
                          currsigs.addElement(bottleAtPos5_21);
                          S6825=1;
                          active[39]=1;
                          ends[39]=1;
                          tdone[39]=1;
                        }
                        else {
                          S6825=1;
                          active[39]=1;
                          ends[39]=1;
                          tdone[39]=1;
                        }
                      }
                      else {
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S6805=1;
                S6805=0;
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
                  S6805=1;
                  active[39]=1;
                  ends[39]=1;
                  tdone[39]=1;
                }
                else {
                  S6800=0;
                  if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
                    checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
                    S6800=1;
                    if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
                      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
                      ends[39]=2;
                      ;//sysj\conveyor_controller.sysj line: 282, column: 7
                      if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
                        bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
                        currsigs.addElement(bottleAtPos5_21);
                        S6825=1;
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                      else {
                        S6825=1;
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                    }
                    else {
                      active[39]=1;
                      ends[39]=1;
                      tdone[39]=1;
                    }
                  }
                  else {
                    active[39]=1;
                    ends[39]=1;
                    tdone[39]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S6825=1;
            S6825=0;
            S6805=0;
            if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
              checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
              S6805=1;
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            else {
              S6800=0;
              if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
                checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
                S6800=1;
                if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
                  ends[39]=2;
                  ;//sysj\conveyor_controller.sysj line: 282, column: 7
                  if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
                    bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
                    currsigs.addElement(bottleAtPos5_21);
                    S6825=1;
                    active[39]=1;
                    ends[39]=1;
                    tdone[39]=1;
                  }
                  else {
                    S6825=1;
                    active[39]=1;
                    ends[39]=1;
                    tdone[39]=1;
                  }
                }
                else {
                  active[39]=1;
                  ends[39]=1;
                  tdone[39]=1;
                }
              }
              else {
                active[39]=1;
                ends[39]=1;
                tdone[39]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38671(int [] tdone, int [] ends){
        switch(S6966){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        thread38672(tdone,ends);
        thread38673(tdone,ends);
        int biggest38674 = 0;
        if(ends[39]>=biggest38674){
          biggest38674=ends[39];
        }
        if(ends[40]>=biggest38674){
          biggest38674=ends[40];
        }
        if(biggest38674 == 1){
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        //FINXME code
        if(biggest38674 == 0){
          S6966=0;
          active[38]=0;
          ends[38]=0;
          tdone[38]=1;
        }
        break;
      
    }
  }

  public void thread38668(int [] tdone, int [] ends){
        S6728=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6728=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38667(int [] tdone, int [] ends){
        S6722=1;
    S6721=0;
    S6705=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6705=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6700=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6700=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6721=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread38665(int [] tdone, int [] ends){
        switch(S6728){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
        currsigs.addElement(cR_21);
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
        break;
      
    }
  }

  public void thread38664(int [] tdone, int [] ends){
        switch(S6722){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        switch(S6721){
          case 0 : 
            switch(S6705){
              case 0 : 
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                  S6705=1;
                  active[36]=1;
                  ends[36]=1;
                  tdone[36]=1;
                }
                else {
                  switch(S6700){
                    case 0 : 
                      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
                        S6700=1;
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                          ends[36]=2;
                          ;//sysj\conveyor_controller.sysj line: 67, column: 5
                          S6721=1;
                          active[36]=1;
                          ends[36]=1;
                          tdone[36]=1;
                        }
                        else {
                          active[36]=1;
                          ends[36]=1;
                          tdone[36]=1;
                        }
                      }
                      else {
                        active[36]=1;
                        ends[36]=1;
                        tdone[36]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                        ends[36]=2;
                        ;//sysj\conveyor_controller.sysj line: 67, column: 5
                        S6721=1;
                        active[36]=1;
                        ends[36]=1;
                        tdone[36]=1;
                      }
                      else {
                        active[36]=1;
                        ends[36]=1;
                        tdone[36]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S6705=1;
                S6705=0;
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                  S6705=1;
                  active[36]=1;
                  ends[36]=1;
                  tdone[36]=1;
                }
                else {
                  S6700=0;
                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
                    S6700=1;
                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                      ends[36]=2;
                      ;//sysj\conveyor_controller.sysj line: 67, column: 5
                      S6721=1;
                      active[36]=1;
                      ends[36]=1;
                      tdone[36]=1;
                    }
                    else {
                      active[36]=1;
                      ends[36]=1;
                      tdone[36]=1;
                    }
                  }
                  else {
                    active[36]=1;
                    ends[36]=1;
                    tdone[36]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S6721=1;
            S6721=2;
            active[36]=1;
            ends[36]=1;
            tdone[36]=1;
            break;
          
          case 2 : 
            S6721=2;
            capperReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 67, column: 36
            ends[36]=2;
            tdone[36]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread38663(int [] tdone, int [] ends){
        switch(S6796){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        switch(S6730){
          case 0 : 
            thread38664(tdone,ends);
            thread38665(tdone,ends);
            int biggest38666 = 0;
            if(ends[36]>=biggest38666){
              biggest38666=ends[36];
            }
            if(ends[37]>=biggest38666){
              biggest38666=ends[37];
            }
            if(biggest38666 == 1){
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            if(biggest38666 == 2){
              ends[35]=2;
              ;//sysj\conveyor_controller.sysj line: 66, column: 3
              S6730=1;
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            //FINXME code
            if(biggest38666 == 0){
              S6730=1;
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            break;
          
          case 1 : 
            S6730=1;
            S6730=0;
            thread38667(tdone,ends);
            thread38668(tdone,ends);
            int biggest38669 = 0;
            if(ends[36]>=biggest38669){
              biggest38669=ends[36];
            }
            if(ends[37]>=biggest38669){
              biggest38669=ends[37];
            }
            if(biggest38669 == 1){
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38661(int [] tdone, int [] ends){
        S6629=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6629=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38660(int [] tdone, int [] ends){
        S6623=1;
    S6622=0;
    S6606=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6606=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6601=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6601=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6622=1;
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

  public void thread38658(int [] tdone, int [] ends){
        switch(S6629){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
        currsigs.addElement(fR_21);
        active[34]=1;
        ends[34]=1;
        tdone[34]=1;
        break;
      
    }
  }

  public void thread38657(int [] tdone, int [] ends){
        switch(S6623){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        switch(S6622){
          case 0 : 
            switch(S6606){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                  S6606=1;
                  active[33]=1;
                  ends[33]=1;
                  tdone[33]=1;
                }
                else {
                  switch(S6601){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
                        S6601=1;
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                          ends[33]=2;
                          ;//sysj\conveyor_controller.sysj line: 67, column: 5
                          S6622=1;
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
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                        ends[33]=2;
                        ;//sysj\conveyor_controller.sysj line: 67, column: 5
                        S6622=1;
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
                S6606=1;
                S6606=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                  S6606=1;
                  active[33]=1;
                  ends[33]=1;
                  tdone[33]=1;
                }
                else {
                  S6601=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
                    S6601=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                      ends[33]=2;
                      ;//sysj\conveyor_controller.sysj line: 67, column: 5
                      S6622=1;
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
            S6622=1;
            S6622=2;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
            break;
          
          case 2 : 
            S6622=2;
            fillerReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 67, column: 36
            ends[33]=2;
            tdone[33]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread38656(int [] tdone, int [] ends){
        switch(S6697){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        switch(S6631){
          case 0 : 
            thread38657(tdone,ends);
            thread38658(tdone,ends);
            int biggest38659 = 0;
            if(ends[33]>=biggest38659){
              biggest38659=ends[33];
            }
            if(ends[34]>=biggest38659){
              biggest38659=ends[34];
            }
            if(biggest38659 == 1){
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            if(biggest38659 == 2){
              ends[32]=2;
              ;//sysj\conveyor_controller.sysj line: 66, column: 3
              S6631=1;
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            //FINXME code
            if(biggest38659 == 0){
              S6631=1;
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
          case 1 : 
            S6631=1;
            S6631=0;
            thread38660(tdone,ends);
            thread38661(tdone,ends);
            int biggest38662 = 0;
            if(ends[33]>=biggest38662){
              biggest38662=ends[33];
            }
            if(ends[34]>=biggest38662){
              biggest38662=ends[34];
            }
            if(biggest38662 == 1){
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38654(int [] tdone, int [] ends){
        S6530=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6530=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38653(int [] tdone, int [] ends){
        S6524=1;
    S6523=0;
    S6507=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6507=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6502=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6502=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6523=1;
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

  public void thread38651(int [] tdone, int [] ends){
        switch(S6530){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
        currsigs.addElement(cvR_21);
        active[31]=1;
        ends[31]=1;
        tdone[31]=1;
        break;
      
    }
  }

  public void thread38650(int [] tdone, int [] ends){
        switch(S6524){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S6523){
          case 0 : 
            switch(S6507){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                  S6507=1;
                  active[30]=1;
                  ends[30]=1;
                  tdone[30]=1;
                }
                else {
                  switch(S6502){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
                        S6502=1;
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                          ends[30]=2;
                          ;//sysj\conveyor_controller.sysj line: 67, column: 5
                          S6523=1;
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
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                        ends[30]=2;
                        ;//sysj\conveyor_controller.sysj line: 67, column: 5
                        S6523=1;
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
                S6507=1;
                S6507=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                  S6507=1;
                  active[30]=1;
                  ends[30]=1;
                  tdone[30]=1;
                }
                else {
                  S6502=0;
                  if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                    convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
                    S6502=1;
                    if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                      ends[30]=2;
                      ;//sysj\conveyor_controller.sysj line: 67, column: 5
                      S6523=1;
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
            S6523=1;
            S6523=2;
            active[30]=1;
            ends[30]=1;
            tdone[30]=1;
            break;
          
          case 2 : 
            S6523=2;
            convReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 67, column: 36
            ends[30]=2;
            tdone[30]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread38649(int [] tdone, int [] ends){
        switch(S6598){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S6532){
          case 0 : 
            thread38650(tdone,ends);
            thread38651(tdone,ends);
            int biggest38652 = 0;
            if(ends[30]>=biggest38652){
              biggest38652=ends[30];
            }
            if(ends[31]>=biggest38652){
              biggest38652=ends[31];
            }
            if(biggest38652 == 1){
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            if(biggest38652 == 2){
              ends[29]=2;
              ;//sysj\conveyor_controller.sysj line: 66, column: 3
              S6532=1;
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            //FINXME code
            if(biggest38652 == 0){
              S6532=1;
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            break;
          
          case 1 : 
            S6532=1;
            S6532=0;
            thread38653(tdone,ends);
            thread38654(tdone,ends);
            int biggest38655 = 0;
            if(ends[30]>=biggest38655){
              biggest38655=ends[30];
            }
            if(ends[31]>=biggest38655){
              biggest38655=ends[31];
            }
            if(biggest38655 == 1){
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38648(int [] tdone, int [] ends){
        switch(S6798){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        thread38649(tdone,ends);
        thread38656(tdone,ends);
        thread38663(tdone,ends);
        int biggest38670 = 0;
        if(ends[29]>=biggest38670){
          biggest38670=ends[29];
        }
        if(ends[32]>=biggest38670){
          biggest38670=ends[32];
        }
        if(ends[35]>=biggest38670){
          biggest38670=ends[35];
        }
        if(biggest38670 == 1){
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        //FINXME code
        if(biggest38670 == 0){
          S6798=0;
          active[28]=0;
          ends[28]=0;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread38646(int [] tdone, int [] ends){
        S4553=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38645(int [] tdone, int [] ends){
        S4550=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38644(int [] tdone, int [] ends){
        S4547=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38642(int [] tdone, int [] ends){
        S4553=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38641(int [] tdone, int [] ends){
        S4550=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38640(int [] tdone, int [] ends){
        S4547=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38638(int [] tdone, int [] ends){
        S4553=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38637(int [] tdone, int [] ends){
        S4550=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38636(int [] tdone, int [] ends){
        S4547=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38634(int [] tdone, int [] ends){
        switch(S4607){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_27 >= 100){//sysj\conveyor_controller.sysj line: 246, column: 44
          ends[27]=3;
          ;//sysj\conveyor_controller.sysj line: 246, column: 44
          ends[27]=2;
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

  public void thread38633(int [] tdone, int [] ends){
        switch(S4591){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 246, column: 14
        currsigs.addElement(rotaryTableTrigger);
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
        break;
      
    }
  }

  public void thread38631(int [] tdone, int [] ends){
        S4607=1;
    __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 246, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_27 >= 100){//sysj\conveyor_controller.sysj line: 246, column: 44
      ends[27]=3;
      ;//sysj\conveyor_controller.sysj line: 246, column: 44
      ends[27]=2;
      tdone[27]=1;
    }
    else {
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread38630(int [] tdone, int [] ends){
        S4591=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 246, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread38628(int [] tdone, int [] ends){
        S4607=1;
    __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 246, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_27 >= 100){//sysj\conveyor_controller.sysj line: 246, column: 44
      ends[27]=3;
      ;//sysj\conveyor_controller.sysj line: 246, column: 44
      ends[27]=2;
      tdone[27]=1;
    }
    else {
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread38627(int [] tdone, int [] ends){
        S4591=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 246, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread38625(int [] tdone, int [] ends){
        S4607=1;
    __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 246, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_27 >= 100){//sysj\conveyor_controller.sysj line: 246, column: 44
      ends[27]=3;
      ;//sysj\conveyor_controller.sysj line: 246, column: 44
      ends[27]=2;
      tdone[27]=1;
    }
    else {
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread38624(int [] tdone, int [] ends){
        S4591=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 246, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread38622(int [] tdone, int [] ends){
        switch(S4553){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(cR_21.getprestatus()){//sysj\conveyor_controller.sysj line: 223, column: 17
          System.out.println("*Rotary - Capper Ready*");//sysj\conveyor_controller.sysj line: 224, column: 11
          S4553=0;
          active[25]=0;
          ends[25]=0;
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

  public void thread38621(int [] tdone, int [] ends){
        switch(S4550){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(cvR_21.getprestatus()){//sysj\conveyor_controller.sysj line: 217, column: 17
          System.out.println("*Rotary - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 218, column: 11
          S4550=0;
          active[24]=0;
          ends[24]=0;
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

  public void thread38620(int [] tdone, int [] ends){
        switch(S4547){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(fR_21.getprestatus()){//sysj\conveyor_controller.sysj line: 212, column: 17
          System.out.println("*Rotary - Filler Ready*");//sysj\conveyor_controller.sysj line: 213, column: 11
          S4547=0;
          active[23]=0;
          ends[23]=0;
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

  public void thread38619(int [] tdone, int [] ends){
        switch(S6499){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S4554){
          case 0 : 
            thread38620(tdone,ends);
            thread38621(tdone,ends);
            thread38622(tdone,ends);
            int biggest38623 = 0;
            if(ends[23]>=biggest38623){
              biggest38623=ends[23];
            }
            if(ends[24]>=biggest38623){
              biggest38623=ends[24];
            }
            if(ends[25]>=biggest38623){
              biggest38623=ends[25];
            }
            if(biggest38623 == 1){
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            //FINXME code
            if(biggest38623 == 0){
              System.out.println("*Rotary - All controllers are ready*");//sysj\conveyor_controller.sysj line: 229, column: 10
              S4554=1;
              if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 232, column: 18
                S4568=0;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S4554=2;
                thread38624(tdone,ends);
                thread38625(tdone,ends);
                int biggest38626 = 0;
                if(ends[26]>=biggest38626){
                  biggest38626=ends[26];
                }
                if(ends[27]>=biggest38626){
                  biggest38626=ends[27];
                }
                if(biggest38626 == 1){
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                if(biggest38626 == 2){
                  ends[22]=2;
                  ;//sysj\conveyor_controller.sysj line: 245, column: 12
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 249, column: 16
                  S4554=3;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
              }
            }
            break;
          
          case 1 : 
            switch(S4568){
              case 0 : 
                if(!bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 234, column: 20
                  S4568=1;
                  if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 236, column: 23
                    System.out.println("*at pos5*");//sysj\conveyor_controller.sysj line: 237, column: 17
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                  else {
                    ends[22]=2;
                    ;//sysj\conveyor_controller.sysj line: 233, column: 13
                    S4554=2;
                    thread38627(tdone,ends);
                    thread38628(tdone,ends);
                    int biggest38629 = 0;
                    if(ends[26]>=biggest38629){
                      biggest38629=ends[26];
                    }
                    if(ends[27]>=biggest38629){
                      biggest38629=ends[27];
                    }
                    if(biggest38629 == 1){
                      active[22]=1;
                      ends[22]=1;
                      tdone[22]=1;
                    }
                    if(biggest38629 == 2){
                      ends[22]=2;
                      ;//sysj\conveyor_controller.sysj line: 245, column: 12
                      System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 249, column: 16
                      S4554=3;
                      active[22]=1;
                      ends[22]=1;
                      tdone[22]=1;
                    }
                  }
                }
                else {
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 236, column: 23
                  System.out.println("*at pos5*");//sysj\conveyor_controller.sysj line: 237, column: 17
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  ends[22]=2;
                  ;//sysj\conveyor_controller.sysj line: 233, column: 13
                  S4554=2;
                  thread38630(tdone,ends);
                  thread38631(tdone,ends);
                  int biggest38632 = 0;
                  if(ends[26]>=biggest38632){
                    biggest38632=ends[26];
                  }
                  if(ends[27]>=biggest38632){
                    biggest38632=ends[27];
                  }
                  if(biggest38632 == 1){
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                  if(biggest38632 == 2){
                    ends[22]=2;
                    ;//sysj\conveyor_controller.sysj line: 245, column: 12
                    System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 249, column: 16
                    S4554=3;
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread38633(tdone,ends);
            thread38634(tdone,ends);
            int biggest38635 = 0;
            if(ends[26]>=biggest38635){
              biggest38635=ends[26];
            }
            if(ends[27]>=biggest38635){
              biggest38635=ends[27];
            }
            if(biggest38635 == 1){
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            if(biggest38635 == 2){
              ends[22]=2;
              ;//sysj\conveyor_controller.sysj line: 245, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 249, column: 16
              S4554=3;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            //FINXME code
            if(biggest38635 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 249, column: 16
              S4554=3;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_controller.sysj line: 250, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\conveyor_controller.sysj line: 251, column: 16
              S4554=4;
              S4710=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 252, column: 13
                rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 252, column: 13
                S4710=1;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S4705=0;
                if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 252, column: 13
                  rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 252, column: 13
                  S4705=1;
                  if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 252, column: 13
                    rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 252, column: 13
                    ends[22]=2;
                    ;//sysj\conveyor_controller.sysj line: 252, column: 13
                    S4554=5;
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
            else {
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
          case 4 : 
            switch(S4710){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 252, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 252, column: 13
                  S4710=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  switch(S4705){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 252, column: 13
                        rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 252, column: 13
                        S4705=1;
                        if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 252, column: 13
                          rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 252, column: 13
                          ends[22]=2;
                          ;//sysj\conveyor_controller.sysj line: 252, column: 13
                          S4554=5;
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
                      if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 252, column: 13
                        rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 252, column: 13
                        ends[22]=2;
                        ;//sysj\conveyor_controller.sysj line: 252, column: 13
                        S4554=5;
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
                S4710=1;
                S4710=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 252, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 252, column: 13
                  S4710=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  S4705=0;
                  if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 252, column: 13
                    rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 252, column: 13
                    S4705=1;
                    if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 252, column: 13
                      rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 252, column: 13
                      ends[22]=2;
                      ;//sysj\conveyor_controller.sysj line: 252, column: 13
                      S4554=5;
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
          
          case 5 : 
            S4554=5;
            i_thread_22 = 0;//sysj\conveyor_controller.sysj line: 255, column: 10
            S4554=6;
            i_thread_22 = i_thread_22 + 1;//sysj\conveyor_controller.sysj line: 258, column: 12
            if(i_thread_22 > 12){//sysj\conveyor_controller.sysj line: 259, column: 15
              ends[22]=2;
              ;//sysj\conveyor_controller.sysj line: 256, column: 10
              S4554=7;
              __start_thread_22 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 208, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_22 >= (4) * 1000){//sysj\conveyor_controller.sysj line: 208, column: 7
                ends[22]=2;
                ;//sysj\conveyor_controller.sysj line: 208, column: 7
                S4554=0;
                thread38636(tdone,ends);
                thread38637(tdone,ends);
                thread38638(tdone,ends);
                int biggest38639 = 0;
                if(ends[23]>=biggest38639){
                  biggest38639=ends[23];
                }
                if(ends[24]>=biggest38639){
                  biggest38639=ends[24];
                }
                if(ends[25]>=biggest38639){
                  biggest38639=ends[25];
                }
                if(biggest38639 == 1){
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
            else {
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
          case 6 : 
            i_thread_22 = i_thread_22 + 1;//sysj\conveyor_controller.sysj line: 258, column: 12
            if(i_thread_22 > 12){//sysj\conveyor_controller.sysj line: 259, column: 15
              ends[22]=2;
              ;//sysj\conveyor_controller.sysj line: 256, column: 10
              S4554=7;
              __start_thread_22 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 208, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_22 >= (4) * 1000){//sysj\conveyor_controller.sysj line: 208, column: 7
                ends[22]=2;
                ;//sysj\conveyor_controller.sysj line: 208, column: 7
                S4554=0;
                thread38640(tdone,ends);
                thread38641(tdone,ends);
                thread38642(tdone,ends);
                int biggest38643 = 0;
                if(ends[23]>=biggest38643){
                  biggest38643=ends[23];
                }
                if(ends[24]>=biggest38643){
                  biggest38643=ends[24];
                }
                if(ends[25]>=biggest38643){
                  biggest38643=ends[25];
                }
                if(biggest38643 == 1){
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
            else {
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
          case 7 : 
            if(com.systemj.Timer.getMs() - __start_thread_22 >= (4) * 1000){//sysj\conveyor_controller.sysj line: 208, column: 7
              ends[22]=2;
              ;//sysj\conveyor_controller.sysj line: 208, column: 7
              S4554=0;
              thread38644(tdone,ends);
              thread38645(tdone,ends);
              thread38646(tdone,ends);
              int biggest38647 = 0;
              if(ends[23]>=biggest38647){
                biggest38647=ends[23];
              }
              if(ends[24]>=biggest38647){
                biggest38647=ends[24];
              }
              if(ends[25]>=biggest38647){
                biggest38647=ends[25];
              }
              if(biggest38647 == 1){
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
          
        }
        break;
      
    }
  }

  public void thread38615(int [] tdone, int [] ends){
        S7012=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38614(int [] tdone, int [] ends){
        S7009=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38613(int [] tdone, int [] ends){
        S7042=1;
    S7016=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38614(tdone,ends);
      thread38615(tdone,ends);
      int biggest38616 = 0;
      if(ends[46]>=biggest38616){
        biggest38616=ends[46];
      }
      if(ends[47]>=biggest38616){
        biggest38616=ends[47];
      }
      if(biggest38616 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7016=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38611(int [] tdone, int [] ends){
        S6974=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38610(int [] tdone, int [] ends){
        S6971=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38609(int [] tdone, int [] ends){
        S7004=1;
    S6978=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38610(tdone,ends);
      thread38611(tdone,ends);
      int biggest38612 = 0;
      if(ends[43]>=biggest38612){
        biggest38612=ends[43];
      }
      if(ends[44]>=biggest38612){
        biggest38612=ends[44];
      }
      if(biggest38612 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S6978=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38608(int [] tdone, int [] ends){
        S7044=1;
    thread38609(tdone,ends);
    thread38613(tdone,ends);
    int biggest38617 = 0;
    if(ends[42]>=biggest38617){
      biggest38617=ends[42];
    }
    if(ends[45]>=biggest38617){
      biggest38617=ends[45];
    }
    if(biggest38617 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38606(int [] tdone, int [] ends){
        S6964=1;
    S6908=0;
    S6888=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S6888=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S6883=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S6883=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S6908=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S6908=1;
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
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread38605(int [] tdone, int [] ends){
        S6881=1;
    S6825=0;
    S6805=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S6805=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S6800=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S6800=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread38604(int [] tdone, int [] ends){
        S6966=1;
    thread38605(tdone,ends);
    thread38606(tdone,ends);
    int biggest38607 = 0;
    if(ends[39]>=biggest38607){
      biggest38607=ends[39];
    }
    if(ends[40]>=biggest38607){
      biggest38607=ends[40];
    }
    if(biggest38607 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38601(int [] tdone, int [] ends){
        S6728=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6728=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38600(int [] tdone, int [] ends){
        S6722=1;
    S6721=0;
    S6705=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6705=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6700=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6700=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6721=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread38599(int [] tdone, int [] ends){
        S6796=1;
    S6730=0;
    thread38600(tdone,ends);
    thread38601(tdone,ends);
    int biggest38602 = 0;
    if(ends[36]>=biggest38602){
      biggest38602=ends[36];
    }
    if(ends[37]>=biggest38602){
      biggest38602=ends[37];
    }
    if(biggest38602 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38597(int [] tdone, int [] ends){
        S6629=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6629=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38596(int [] tdone, int [] ends){
        S6623=1;
    S6622=0;
    S6606=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6606=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6601=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6601=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6622=1;
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

  public void thread38595(int [] tdone, int [] ends){
        S6697=1;
    S6631=0;
    thread38596(tdone,ends);
    thread38597(tdone,ends);
    int biggest38598 = 0;
    if(ends[33]>=biggest38598){
      biggest38598=ends[33];
    }
    if(ends[34]>=biggest38598){
      biggest38598=ends[34];
    }
    if(biggest38598 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38593(int [] tdone, int [] ends){
        S6530=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6530=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38592(int [] tdone, int [] ends){
        S6524=1;
    S6523=0;
    S6507=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6507=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6502=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6502=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6523=1;
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

  public void thread38591(int [] tdone, int [] ends){
        S6598=1;
    S6532=0;
    thread38592(tdone,ends);
    thread38593(tdone,ends);
    int biggest38594 = 0;
    if(ends[30]>=biggest38594){
      biggest38594=ends[30];
    }
    if(ends[31]>=biggest38594){
      biggest38594=ends[31];
    }
    if(biggest38594 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38590(int [] tdone, int [] ends){
        S6798=1;
    thread38591(tdone,ends);
    thread38595(tdone,ends);
    thread38599(tdone,ends);
    int biggest38603 = 0;
    if(ends[29]>=biggest38603){
      biggest38603=ends[29];
    }
    if(ends[32]>=biggest38603){
      biggest38603=ends[32];
    }
    if(ends[35]>=biggest38603){
      biggest38603=ends[35];
    }
    if(biggest38603 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38603 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38603 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38588(int [] tdone, int [] ends){
        S4553=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38587(int [] tdone, int [] ends){
        S4550=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38586(int [] tdone, int [] ends){
        S4547=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38585(int [] tdone, int [] ends){
        S6499=1;
    S4554=0;
    thread38586(tdone,ends);
    thread38587(tdone,ends);
    thread38588(tdone,ends);
    int biggest38589 = 0;
    if(ends[23]>=biggest38589){
      biggest38589=ends[23];
    }
    if(ends[24]>=biggest38589){
      biggest38589=ends[24];
    }
    if(ends[25]>=biggest38589){
      biggest38589=ends[25];
    }
    if(biggest38589 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38581(int [] tdone, int [] ends){
        S7012=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38580(int [] tdone, int [] ends){
        S7009=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38579(int [] tdone, int [] ends){
        S7042=1;
    S7016=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38580(tdone,ends);
      thread38581(tdone,ends);
      int biggest38582 = 0;
      if(ends[46]>=biggest38582){
        biggest38582=ends[46];
      }
      if(ends[47]>=biggest38582){
        biggest38582=ends[47];
      }
      if(biggest38582 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7016=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38577(int [] tdone, int [] ends){
        S6974=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38576(int [] tdone, int [] ends){
        S6971=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38575(int [] tdone, int [] ends){
        S7004=1;
    S6978=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38576(tdone,ends);
      thread38577(tdone,ends);
      int biggest38578 = 0;
      if(ends[43]>=biggest38578){
        biggest38578=ends[43];
      }
      if(ends[44]>=biggest38578){
        biggest38578=ends[44];
      }
      if(biggest38578 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S6978=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38574(int [] tdone, int [] ends){
        S7044=1;
    thread38575(tdone,ends);
    thread38579(tdone,ends);
    int biggest38583 = 0;
    if(ends[42]>=biggest38583){
      biggest38583=ends[42];
    }
    if(ends[45]>=biggest38583){
      biggest38583=ends[45];
    }
    if(biggest38583 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38572(int [] tdone, int [] ends){
        S6964=1;
    S6908=0;
    S6888=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S6888=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S6883=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S6883=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S6908=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S6908=1;
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
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread38571(int [] tdone, int [] ends){
        S6881=1;
    S6825=0;
    S6805=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S6805=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S6800=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S6800=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread38570(int [] tdone, int [] ends){
        S6966=1;
    thread38571(tdone,ends);
    thread38572(tdone,ends);
    int biggest38573 = 0;
    if(ends[39]>=biggest38573){
      biggest38573=ends[39];
    }
    if(ends[40]>=biggest38573){
      biggest38573=ends[40];
    }
    if(biggest38573 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38567(int [] tdone, int [] ends){
        S6728=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6728=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38566(int [] tdone, int [] ends){
        S6722=1;
    S6721=0;
    S6705=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6705=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6700=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6700=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6721=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread38565(int [] tdone, int [] ends){
        S6796=1;
    S6730=0;
    thread38566(tdone,ends);
    thread38567(tdone,ends);
    int biggest38568 = 0;
    if(ends[36]>=biggest38568){
      biggest38568=ends[36];
    }
    if(ends[37]>=biggest38568){
      biggest38568=ends[37];
    }
    if(biggest38568 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38563(int [] tdone, int [] ends){
        S6629=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6629=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38562(int [] tdone, int [] ends){
        S6623=1;
    S6622=0;
    S6606=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6606=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6601=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6601=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6622=1;
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

  public void thread38561(int [] tdone, int [] ends){
        S6697=1;
    S6631=0;
    thread38562(tdone,ends);
    thread38563(tdone,ends);
    int biggest38564 = 0;
    if(ends[33]>=biggest38564){
      biggest38564=ends[33];
    }
    if(ends[34]>=biggest38564){
      biggest38564=ends[34];
    }
    if(biggest38564 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38559(int [] tdone, int [] ends){
        S6530=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6530=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38558(int [] tdone, int [] ends){
        S6524=1;
    S6523=0;
    S6507=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6507=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6502=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6502=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6523=1;
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

  public void thread38557(int [] tdone, int [] ends){
        S6598=1;
    S6532=0;
    thread38558(tdone,ends);
    thread38559(tdone,ends);
    int biggest38560 = 0;
    if(ends[30]>=biggest38560){
      biggest38560=ends[30];
    }
    if(ends[31]>=biggest38560){
      biggest38560=ends[31];
    }
    if(biggest38560 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38556(int [] tdone, int [] ends){
        S6798=1;
    thread38557(tdone,ends);
    thread38561(tdone,ends);
    thread38565(tdone,ends);
    int biggest38569 = 0;
    if(ends[29]>=biggest38569){
      biggest38569=ends[29];
    }
    if(ends[32]>=biggest38569){
      biggest38569=ends[32];
    }
    if(ends[35]>=biggest38569){
      biggest38569=ends[35];
    }
    if(biggest38569 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38569 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38569 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38554(int [] tdone, int [] ends){
        S4553=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38553(int [] tdone, int [] ends){
        S4550=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38552(int [] tdone, int [] ends){
        S4547=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38551(int [] tdone, int [] ends){
        S6499=1;
    S4554=0;
    thread38552(tdone,ends);
    thread38553(tdone,ends);
    thread38554(tdone,ends);
    int biggest38555 = 0;
    if(ends[23]>=biggest38555){
      biggest38555=ends[23];
    }
    if(ends[24]>=biggest38555){
      biggest38555=ends[24];
    }
    if(ends[25]>=biggest38555){
      biggest38555=ends[25];
    }
    if(biggest38555 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38547(int [] tdone, int [] ends){
        S7012=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38546(int [] tdone, int [] ends){
        S7009=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38545(int [] tdone, int [] ends){
        S7042=1;
    S7016=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38546(tdone,ends);
      thread38547(tdone,ends);
      int biggest38548 = 0;
      if(ends[46]>=biggest38548){
        biggest38548=ends[46];
      }
      if(ends[47]>=biggest38548){
        biggest38548=ends[47];
      }
      if(biggest38548 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7016=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38543(int [] tdone, int [] ends){
        S6974=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38542(int [] tdone, int [] ends){
        S6971=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38541(int [] tdone, int [] ends){
        S7004=1;
    S6978=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38542(tdone,ends);
      thread38543(tdone,ends);
      int biggest38544 = 0;
      if(ends[43]>=biggest38544){
        biggest38544=ends[43];
      }
      if(ends[44]>=biggest38544){
        biggest38544=ends[44];
      }
      if(biggest38544 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S6978=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38540(int [] tdone, int [] ends){
        S7044=1;
    thread38541(tdone,ends);
    thread38545(tdone,ends);
    int biggest38549 = 0;
    if(ends[42]>=biggest38549){
      biggest38549=ends[42];
    }
    if(ends[45]>=biggest38549){
      biggest38549=ends[45];
    }
    if(biggest38549 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38538(int [] tdone, int [] ends){
        S6964=1;
    S6908=0;
    S6888=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S6888=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S6883=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S6883=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S6908=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S6908=1;
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
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread38537(int [] tdone, int [] ends){
        S6881=1;
    S6825=0;
    S6805=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S6805=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S6800=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S6800=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread38536(int [] tdone, int [] ends){
        S6966=1;
    thread38537(tdone,ends);
    thread38538(tdone,ends);
    int biggest38539 = 0;
    if(ends[39]>=biggest38539){
      biggest38539=ends[39];
    }
    if(ends[40]>=biggest38539){
      biggest38539=ends[40];
    }
    if(biggest38539 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38533(int [] tdone, int [] ends){
        S6728=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6728=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38532(int [] tdone, int [] ends){
        S6722=1;
    S6721=0;
    S6705=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6705=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6700=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6700=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6721=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread38531(int [] tdone, int [] ends){
        S6796=1;
    S6730=0;
    thread38532(tdone,ends);
    thread38533(tdone,ends);
    int biggest38534 = 0;
    if(ends[36]>=biggest38534){
      biggest38534=ends[36];
    }
    if(ends[37]>=biggest38534){
      biggest38534=ends[37];
    }
    if(biggest38534 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38529(int [] tdone, int [] ends){
        S6629=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6629=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38528(int [] tdone, int [] ends){
        S6623=1;
    S6622=0;
    S6606=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6606=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6601=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6601=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6622=1;
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

  public void thread38527(int [] tdone, int [] ends){
        S6697=1;
    S6631=0;
    thread38528(tdone,ends);
    thread38529(tdone,ends);
    int biggest38530 = 0;
    if(ends[33]>=biggest38530){
      biggest38530=ends[33];
    }
    if(ends[34]>=biggest38530){
      biggest38530=ends[34];
    }
    if(biggest38530 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38525(int [] tdone, int [] ends){
        S6530=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6530=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38524(int [] tdone, int [] ends){
        S6524=1;
    S6523=0;
    S6507=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6507=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6502=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6502=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6523=1;
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

  public void thread38523(int [] tdone, int [] ends){
        S6598=1;
    S6532=0;
    thread38524(tdone,ends);
    thread38525(tdone,ends);
    int biggest38526 = 0;
    if(ends[30]>=biggest38526){
      biggest38526=ends[30];
    }
    if(ends[31]>=biggest38526){
      biggest38526=ends[31];
    }
    if(biggest38526 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38522(int [] tdone, int [] ends){
        S6798=1;
    thread38523(tdone,ends);
    thread38527(tdone,ends);
    thread38531(tdone,ends);
    int biggest38535 = 0;
    if(ends[29]>=biggest38535){
      biggest38535=ends[29];
    }
    if(ends[32]>=biggest38535){
      biggest38535=ends[32];
    }
    if(ends[35]>=biggest38535){
      biggest38535=ends[35];
    }
    if(biggest38535 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38535 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38535 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38520(int [] tdone, int [] ends){
        S4553=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38519(int [] tdone, int [] ends){
        S4550=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38518(int [] tdone, int [] ends){
        S4547=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38517(int [] tdone, int [] ends){
        S6499=1;
    S4554=0;
    thread38518(tdone,ends);
    thread38519(tdone,ends);
    thread38520(tdone,ends);
    int biggest38521 = 0;
    if(ends[23]>=biggest38521){
      biggest38521=ends[23];
    }
    if(ends[24]>=biggest38521){
      biggest38521=ends[24];
    }
    if(ends[25]>=biggest38521){
      biggest38521=ends[25];
    }
    if(biggest38521 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38513(int [] tdone, int [] ends){
        S7012=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38512(int [] tdone, int [] ends){
        S7009=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38511(int [] tdone, int [] ends){
        S7042=1;
    S7016=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38512(tdone,ends);
      thread38513(tdone,ends);
      int biggest38514 = 0;
      if(ends[46]>=biggest38514){
        biggest38514=ends[46];
      }
      if(ends[47]>=biggest38514){
        biggest38514=ends[47];
      }
      if(biggest38514 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7016=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38509(int [] tdone, int [] ends){
        S6974=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38508(int [] tdone, int [] ends){
        S6971=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38507(int [] tdone, int [] ends){
        S7004=1;
    S6978=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38508(tdone,ends);
      thread38509(tdone,ends);
      int biggest38510 = 0;
      if(ends[43]>=biggest38510){
        biggest38510=ends[43];
      }
      if(ends[44]>=biggest38510){
        biggest38510=ends[44];
      }
      if(biggest38510 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S6978=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38506(int [] tdone, int [] ends){
        S7044=1;
    thread38507(tdone,ends);
    thread38511(tdone,ends);
    int biggest38515 = 0;
    if(ends[42]>=biggest38515){
      biggest38515=ends[42];
    }
    if(ends[45]>=biggest38515){
      biggest38515=ends[45];
    }
    if(biggest38515 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38504(int [] tdone, int [] ends){
        S6964=1;
    S6908=0;
    S6888=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S6888=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S6883=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S6883=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S6908=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S6908=1;
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
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread38503(int [] tdone, int [] ends){
        S6881=1;
    S6825=0;
    S6805=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S6805=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S6800=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S6800=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread38502(int [] tdone, int [] ends){
        S6966=1;
    thread38503(tdone,ends);
    thread38504(tdone,ends);
    int biggest38505 = 0;
    if(ends[39]>=biggest38505){
      biggest38505=ends[39];
    }
    if(ends[40]>=biggest38505){
      biggest38505=ends[40];
    }
    if(biggest38505 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38499(int [] tdone, int [] ends){
        S6728=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6728=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38498(int [] tdone, int [] ends){
        S6722=1;
    S6721=0;
    S6705=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6705=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6700=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6700=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6721=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread38497(int [] tdone, int [] ends){
        S6796=1;
    S6730=0;
    thread38498(tdone,ends);
    thread38499(tdone,ends);
    int biggest38500 = 0;
    if(ends[36]>=biggest38500){
      biggest38500=ends[36];
    }
    if(ends[37]>=biggest38500){
      biggest38500=ends[37];
    }
    if(biggest38500 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38495(int [] tdone, int [] ends){
        S6629=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6629=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38494(int [] tdone, int [] ends){
        S6623=1;
    S6622=0;
    S6606=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6606=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6601=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6601=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6622=1;
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

  public void thread38493(int [] tdone, int [] ends){
        S6697=1;
    S6631=0;
    thread38494(tdone,ends);
    thread38495(tdone,ends);
    int biggest38496 = 0;
    if(ends[33]>=biggest38496){
      biggest38496=ends[33];
    }
    if(ends[34]>=biggest38496){
      biggest38496=ends[34];
    }
    if(biggest38496 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38491(int [] tdone, int [] ends){
        S6530=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6530=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38490(int [] tdone, int [] ends){
        S6524=1;
    S6523=0;
    S6507=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6507=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6502=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6502=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6523=1;
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

  public void thread38489(int [] tdone, int [] ends){
        S6598=1;
    S6532=0;
    thread38490(tdone,ends);
    thread38491(tdone,ends);
    int biggest38492 = 0;
    if(ends[30]>=biggest38492){
      biggest38492=ends[30];
    }
    if(ends[31]>=biggest38492){
      biggest38492=ends[31];
    }
    if(biggest38492 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38488(int [] tdone, int [] ends){
        S6798=1;
    thread38489(tdone,ends);
    thread38493(tdone,ends);
    thread38497(tdone,ends);
    int biggest38501 = 0;
    if(ends[29]>=biggest38501){
      biggest38501=ends[29];
    }
    if(ends[32]>=biggest38501){
      biggest38501=ends[32];
    }
    if(ends[35]>=biggest38501){
      biggest38501=ends[35];
    }
    if(biggest38501 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38501 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38501 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38486(int [] tdone, int [] ends){
        S4553=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38485(int [] tdone, int [] ends){
        S4550=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38484(int [] tdone, int [] ends){
        S4547=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38483(int [] tdone, int [] ends){
        S6499=1;
    S4554=0;
    thread38484(tdone,ends);
    thread38485(tdone,ends);
    thread38486(tdone,ends);
    int biggest38487 = 0;
    if(ends[23]>=biggest38487){
      biggest38487=ends[23];
    }
    if(ends[24]>=biggest38487){
      biggest38487=ends[24];
    }
    if(ends[25]>=biggest38487){
      biggest38487=ends[25];
    }
    if(biggest38487 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38479(int [] tdone, int [] ends){
        S7012=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38478(int [] tdone, int [] ends){
        S7009=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38477(int [] tdone, int [] ends){
        S7042=1;
    S7016=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38478(tdone,ends);
      thread38479(tdone,ends);
      int biggest38480 = 0;
      if(ends[46]>=biggest38480){
        biggest38480=ends[46];
      }
      if(ends[47]>=biggest38480){
        biggest38480=ends[47];
      }
      if(biggest38480 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7016=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38475(int [] tdone, int [] ends){
        S6974=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38474(int [] tdone, int [] ends){
        S6971=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38473(int [] tdone, int [] ends){
        S7004=1;
    S6978=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38474(tdone,ends);
      thread38475(tdone,ends);
      int biggest38476 = 0;
      if(ends[43]>=biggest38476){
        biggest38476=ends[43];
      }
      if(ends[44]>=biggest38476){
        biggest38476=ends[44];
      }
      if(biggest38476 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S6978=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38472(int [] tdone, int [] ends){
        S7044=1;
    thread38473(tdone,ends);
    thread38477(tdone,ends);
    int biggest38481 = 0;
    if(ends[42]>=biggest38481){
      biggest38481=ends[42];
    }
    if(ends[45]>=biggest38481){
      biggest38481=ends[45];
    }
    if(biggest38481 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38470(int [] tdone, int [] ends){
        S6964=1;
    S6908=0;
    S6888=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S6888=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S6883=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S6883=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S6908=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S6908=1;
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
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread38469(int [] tdone, int [] ends){
        S6881=1;
    S6825=0;
    S6805=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S6805=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S6800=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S6800=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread38468(int [] tdone, int [] ends){
        S6966=1;
    thread38469(tdone,ends);
    thread38470(tdone,ends);
    int biggest38471 = 0;
    if(ends[39]>=biggest38471){
      biggest38471=ends[39];
    }
    if(ends[40]>=biggest38471){
      biggest38471=ends[40];
    }
    if(biggest38471 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38465(int [] tdone, int [] ends){
        S6728=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6728=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38464(int [] tdone, int [] ends){
        S6722=1;
    S6721=0;
    S6705=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6705=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6700=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6700=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6721=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread38463(int [] tdone, int [] ends){
        S6796=1;
    S6730=0;
    thread38464(tdone,ends);
    thread38465(tdone,ends);
    int biggest38466 = 0;
    if(ends[36]>=biggest38466){
      biggest38466=ends[36];
    }
    if(ends[37]>=biggest38466){
      biggest38466=ends[37];
    }
    if(biggest38466 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38461(int [] tdone, int [] ends){
        S6629=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6629=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38460(int [] tdone, int [] ends){
        S6623=1;
    S6622=0;
    S6606=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6606=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6601=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6601=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6622=1;
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

  public void thread38459(int [] tdone, int [] ends){
        S6697=1;
    S6631=0;
    thread38460(tdone,ends);
    thread38461(tdone,ends);
    int biggest38462 = 0;
    if(ends[33]>=biggest38462){
      biggest38462=ends[33];
    }
    if(ends[34]>=biggest38462){
      biggest38462=ends[34];
    }
    if(biggest38462 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38457(int [] tdone, int [] ends){
        S6530=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6530=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38456(int [] tdone, int [] ends){
        S6524=1;
    S6523=0;
    S6507=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6507=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6502=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6502=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6523=1;
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

  public void thread38455(int [] tdone, int [] ends){
        S6598=1;
    S6532=0;
    thread38456(tdone,ends);
    thread38457(tdone,ends);
    int biggest38458 = 0;
    if(ends[30]>=biggest38458){
      biggest38458=ends[30];
    }
    if(ends[31]>=biggest38458){
      biggest38458=ends[31];
    }
    if(biggest38458 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38454(int [] tdone, int [] ends){
        S6798=1;
    thread38455(tdone,ends);
    thread38459(tdone,ends);
    thread38463(tdone,ends);
    int biggest38467 = 0;
    if(ends[29]>=biggest38467){
      biggest38467=ends[29];
    }
    if(ends[32]>=biggest38467){
      biggest38467=ends[32];
    }
    if(ends[35]>=biggest38467){
      biggest38467=ends[35];
    }
    if(biggest38467 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38467 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38467 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38452(int [] tdone, int [] ends){
        S4553=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38451(int [] tdone, int [] ends){
        S4550=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38450(int [] tdone, int [] ends){
        S4547=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38449(int [] tdone, int [] ends){
        S6499=1;
    S4554=0;
    thread38450(tdone,ends);
    thread38451(tdone,ends);
    thread38452(tdone,ends);
    int biggest38453 = 0;
    if(ends[23]>=biggest38453){
      biggest38453=ends[23];
    }
    if(ends[24]>=biggest38453){
      biggest38453=ends[24];
    }
    if(ends[25]>=biggest38453){
      biggest38453=ends[25];
    }
    if(biggest38453 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38445(int [] tdone, int [] ends){
        S7012=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38444(int [] tdone, int [] ends){
        S7009=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38443(int [] tdone, int [] ends){
        S7042=1;
    S7016=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38444(tdone,ends);
      thread38445(tdone,ends);
      int biggest38446 = 0;
      if(ends[46]>=biggest38446){
        biggest38446=ends[46];
      }
      if(ends[47]>=biggest38446){
        biggest38446=ends[47];
      }
      if(biggest38446 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7016=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38441(int [] tdone, int [] ends){
        S6974=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38440(int [] tdone, int [] ends){
        S6971=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38439(int [] tdone, int [] ends){
        S7004=1;
    S6978=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38440(tdone,ends);
      thread38441(tdone,ends);
      int biggest38442 = 0;
      if(ends[43]>=biggest38442){
        biggest38442=ends[43];
      }
      if(ends[44]>=biggest38442){
        biggest38442=ends[44];
      }
      if(biggest38442 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S6978=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38438(int [] tdone, int [] ends){
        S7044=1;
    thread38439(tdone,ends);
    thread38443(tdone,ends);
    int biggest38447 = 0;
    if(ends[42]>=biggest38447){
      biggest38447=ends[42];
    }
    if(ends[45]>=biggest38447){
      biggest38447=ends[45];
    }
    if(biggest38447 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38436(int [] tdone, int [] ends){
        S6964=1;
    S6908=0;
    S6888=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S6888=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S6883=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S6883=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S6908=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S6908=1;
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
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread38435(int [] tdone, int [] ends){
        S6881=1;
    S6825=0;
    S6805=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S6805=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S6800=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S6800=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread38434(int [] tdone, int [] ends){
        S6966=1;
    thread38435(tdone,ends);
    thread38436(tdone,ends);
    int biggest38437 = 0;
    if(ends[39]>=biggest38437){
      biggest38437=ends[39];
    }
    if(ends[40]>=biggest38437){
      biggest38437=ends[40];
    }
    if(biggest38437 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38431(int [] tdone, int [] ends){
        S6728=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6728=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38430(int [] tdone, int [] ends){
        S6722=1;
    S6721=0;
    S6705=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6705=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6700=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6700=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6721=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread38429(int [] tdone, int [] ends){
        S6796=1;
    S6730=0;
    thread38430(tdone,ends);
    thread38431(tdone,ends);
    int biggest38432 = 0;
    if(ends[36]>=biggest38432){
      biggest38432=ends[36];
    }
    if(ends[37]>=biggest38432){
      biggest38432=ends[37];
    }
    if(biggest38432 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38427(int [] tdone, int [] ends){
        S6629=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6629=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38426(int [] tdone, int [] ends){
        S6623=1;
    S6622=0;
    S6606=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6606=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6601=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6601=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6622=1;
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

  public void thread38425(int [] tdone, int [] ends){
        S6697=1;
    S6631=0;
    thread38426(tdone,ends);
    thread38427(tdone,ends);
    int biggest38428 = 0;
    if(ends[33]>=biggest38428){
      biggest38428=ends[33];
    }
    if(ends[34]>=biggest38428){
      biggest38428=ends[34];
    }
    if(biggest38428 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38423(int [] tdone, int [] ends){
        S6530=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6530=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38422(int [] tdone, int [] ends){
        S6524=1;
    S6523=0;
    S6507=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6507=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6502=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6502=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6523=1;
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

  public void thread38421(int [] tdone, int [] ends){
        S6598=1;
    S6532=0;
    thread38422(tdone,ends);
    thread38423(tdone,ends);
    int biggest38424 = 0;
    if(ends[30]>=biggest38424){
      biggest38424=ends[30];
    }
    if(ends[31]>=biggest38424){
      biggest38424=ends[31];
    }
    if(biggest38424 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38420(int [] tdone, int [] ends){
        S6798=1;
    thread38421(tdone,ends);
    thread38425(tdone,ends);
    thread38429(tdone,ends);
    int biggest38433 = 0;
    if(ends[29]>=biggest38433){
      biggest38433=ends[29];
    }
    if(ends[32]>=biggest38433){
      biggest38433=ends[32];
    }
    if(ends[35]>=biggest38433){
      biggest38433=ends[35];
    }
    if(biggest38433 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38433 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38433 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38418(int [] tdone, int [] ends){
        S4553=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38417(int [] tdone, int [] ends){
        S4550=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38416(int [] tdone, int [] ends){
        S4547=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38415(int [] tdone, int [] ends){
        S6499=1;
    S4554=0;
    thread38416(tdone,ends);
    thread38417(tdone,ends);
    thread38418(tdone,ends);
    int biggest38419 = 0;
    if(ends[23]>=biggest38419){
      biggest38419=ends[23];
    }
    if(ends[24]>=biggest38419){
      biggest38419=ends[24];
    }
    if(ends[25]>=biggest38419){
      biggest38419=ends[25];
    }
    if(biggest38419 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38411(int [] tdone, int [] ends){
        S7012=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38410(int [] tdone, int [] ends){
        S7009=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38409(int [] tdone, int [] ends){
        S7042=1;
    S7016=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38410(tdone,ends);
      thread38411(tdone,ends);
      int biggest38412 = 0;
      if(ends[46]>=biggest38412){
        biggest38412=ends[46];
      }
      if(ends[47]>=biggest38412){
        biggest38412=ends[47];
      }
      if(biggest38412 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7016=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38407(int [] tdone, int [] ends){
        S6974=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38406(int [] tdone, int [] ends){
        S6971=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38405(int [] tdone, int [] ends){
        S7004=1;
    S6978=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38406(tdone,ends);
      thread38407(tdone,ends);
      int biggest38408 = 0;
      if(ends[43]>=biggest38408){
        biggest38408=ends[43];
      }
      if(ends[44]>=biggest38408){
        biggest38408=ends[44];
      }
      if(biggest38408 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S6978=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38404(int [] tdone, int [] ends){
        S7044=1;
    thread38405(tdone,ends);
    thread38409(tdone,ends);
    int biggest38413 = 0;
    if(ends[42]>=biggest38413){
      biggest38413=ends[42];
    }
    if(ends[45]>=biggest38413){
      biggest38413=ends[45];
    }
    if(biggest38413 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38402(int [] tdone, int [] ends){
        S6964=1;
    S6908=0;
    S6888=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S6888=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S6883=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S6883=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S6908=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S6908=1;
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
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread38401(int [] tdone, int [] ends){
        S6881=1;
    S6825=0;
    S6805=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S6805=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S6800=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S6800=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread38400(int [] tdone, int [] ends){
        S6966=1;
    thread38401(tdone,ends);
    thread38402(tdone,ends);
    int biggest38403 = 0;
    if(ends[39]>=biggest38403){
      biggest38403=ends[39];
    }
    if(ends[40]>=biggest38403){
      biggest38403=ends[40];
    }
    if(biggest38403 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38397(int [] tdone, int [] ends){
        S6728=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6728=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38396(int [] tdone, int [] ends){
        S6722=1;
    S6721=0;
    S6705=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6705=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6700=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6700=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6721=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread38395(int [] tdone, int [] ends){
        S6796=1;
    S6730=0;
    thread38396(tdone,ends);
    thread38397(tdone,ends);
    int biggest38398 = 0;
    if(ends[36]>=biggest38398){
      biggest38398=ends[36];
    }
    if(ends[37]>=biggest38398){
      biggest38398=ends[37];
    }
    if(biggest38398 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38393(int [] tdone, int [] ends){
        S6629=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6629=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38392(int [] tdone, int [] ends){
        S6623=1;
    S6622=0;
    S6606=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6606=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6601=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6601=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6622=1;
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

  public void thread38391(int [] tdone, int [] ends){
        S6697=1;
    S6631=0;
    thread38392(tdone,ends);
    thread38393(tdone,ends);
    int biggest38394 = 0;
    if(ends[33]>=biggest38394){
      biggest38394=ends[33];
    }
    if(ends[34]>=biggest38394){
      biggest38394=ends[34];
    }
    if(biggest38394 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38389(int [] tdone, int [] ends){
        S6530=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6530=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38388(int [] tdone, int [] ends){
        S6524=1;
    S6523=0;
    S6507=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6507=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6502=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6502=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6523=1;
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

  public void thread38387(int [] tdone, int [] ends){
        S6598=1;
    S6532=0;
    thread38388(tdone,ends);
    thread38389(tdone,ends);
    int biggest38390 = 0;
    if(ends[30]>=biggest38390){
      biggest38390=ends[30];
    }
    if(ends[31]>=biggest38390){
      biggest38390=ends[31];
    }
    if(biggest38390 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38386(int [] tdone, int [] ends){
        S6798=1;
    thread38387(tdone,ends);
    thread38391(tdone,ends);
    thread38395(tdone,ends);
    int biggest38399 = 0;
    if(ends[29]>=biggest38399){
      biggest38399=ends[29];
    }
    if(ends[32]>=biggest38399){
      biggest38399=ends[32];
    }
    if(ends[35]>=biggest38399){
      biggest38399=ends[35];
    }
    if(biggest38399 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38399 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38399 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38384(int [] tdone, int [] ends){
        S4553=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38383(int [] tdone, int [] ends){
        S4550=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38382(int [] tdone, int [] ends){
        S4547=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38381(int [] tdone, int [] ends){
        S6499=1;
    S4554=0;
    thread38382(tdone,ends);
    thread38383(tdone,ends);
    thread38384(tdone,ends);
    int biggest38385 = 0;
    if(ends[23]>=biggest38385){
      biggest38385=ends[23];
    }
    if(ends[24]>=biggest38385){
      biggest38385=ends[24];
    }
    if(ends[25]>=biggest38385){
      biggest38385=ends[25];
    }
    if(biggest38385 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38377(int [] tdone, int [] ends){
        S7012=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38376(int [] tdone, int [] ends){
        S7009=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38375(int [] tdone, int [] ends){
        S7042=1;
    S7016=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38376(tdone,ends);
      thread38377(tdone,ends);
      int biggest38378 = 0;
      if(ends[46]>=biggest38378){
        biggest38378=ends[46];
      }
      if(ends[47]>=biggest38378){
        biggest38378=ends[47];
      }
      if(biggest38378 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7016=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38373(int [] tdone, int [] ends){
        S6974=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38372(int [] tdone, int [] ends){
        S6971=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38371(int [] tdone, int [] ends){
        S7004=1;
    S6978=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38372(tdone,ends);
      thread38373(tdone,ends);
      int biggest38374 = 0;
      if(ends[43]>=biggest38374){
        biggest38374=ends[43];
      }
      if(ends[44]>=biggest38374){
        biggest38374=ends[44];
      }
      if(biggest38374 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S6978=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38370(int [] tdone, int [] ends){
        S7044=1;
    thread38371(tdone,ends);
    thread38375(tdone,ends);
    int biggest38379 = 0;
    if(ends[42]>=biggest38379){
      biggest38379=ends[42];
    }
    if(ends[45]>=biggest38379){
      biggest38379=ends[45];
    }
    if(biggest38379 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38368(int [] tdone, int [] ends){
        S6964=1;
    S6908=0;
    S6888=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S6888=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S6883=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S6883=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S6908=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S6908=1;
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
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread38367(int [] tdone, int [] ends){
        S6881=1;
    S6825=0;
    S6805=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S6805=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S6800=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S6800=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread38366(int [] tdone, int [] ends){
        S6966=1;
    thread38367(tdone,ends);
    thread38368(tdone,ends);
    int biggest38369 = 0;
    if(ends[39]>=biggest38369){
      biggest38369=ends[39];
    }
    if(ends[40]>=biggest38369){
      biggest38369=ends[40];
    }
    if(biggest38369 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38363(int [] tdone, int [] ends){
        S6728=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6728=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38362(int [] tdone, int [] ends){
        S6722=1;
    S6721=0;
    S6705=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6705=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6700=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6700=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6721=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread38361(int [] tdone, int [] ends){
        S6796=1;
    S6730=0;
    thread38362(tdone,ends);
    thread38363(tdone,ends);
    int biggest38364 = 0;
    if(ends[36]>=biggest38364){
      biggest38364=ends[36];
    }
    if(ends[37]>=biggest38364){
      biggest38364=ends[37];
    }
    if(biggest38364 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38359(int [] tdone, int [] ends){
        S6629=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6629=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38358(int [] tdone, int [] ends){
        S6623=1;
    S6622=0;
    S6606=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6606=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6601=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6601=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6622=1;
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

  public void thread38357(int [] tdone, int [] ends){
        S6697=1;
    S6631=0;
    thread38358(tdone,ends);
    thread38359(tdone,ends);
    int biggest38360 = 0;
    if(ends[33]>=biggest38360){
      biggest38360=ends[33];
    }
    if(ends[34]>=biggest38360){
      biggest38360=ends[34];
    }
    if(biggest38360 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38355(int [] tdone, int [] ends){
        S6530=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6530=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38354(int [] tdone, int [] ends){
        S6524=1;
    S6523=0;
    S6507=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6507=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6502=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6502=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6523=1;
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

  public void thread38353(int [] tdone, int [] ends){
        S6598=1;
    S6532=0;
    thread38354(tdone,ends);
    thread38355(tdone,ends);
    int biggest38356 = 0;
    if(ends[30]>=biggest38356){
      biggest38356=ends[30];
    }
    if(ends[31]>=biggest38356){
      biggest38356=ends[31];
    }
    if(biggest38356 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38352(int [] tdone, int [] ends){
        S6798=1;
    thread38353(tdone,ends);
    thread38357(tdone,ends);
    thread38361(tdone,ends);
    int biggest38365 = 0;
    if(ends[29]>=biggest38365){
      biggest38365=ends[29];
    }
    if(ends[32]>=biggest38365){
      biggest38365=ends[32];
    }
    if(ends[35]>=biggest38365){
      biggest38365=ends[35];
    }
    if(biggest38365 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38365 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38365 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38350(int [] tdone, int [] ends){
        S4553=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38349(int [] tdone, int [] ends){
        S4550=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38348(int [] tdone, int [] ends){
        S4547=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38347(int [] tdone, int [] ends){
        S6499=1;
    S4554=0;
    thread38348(tdone,ends);
    thread38349(tdone,ends);
    thread38350(tdone,ends);
    int biggest38351 = 0;
    if(ends[23]>=biggest38351){
      biggest38351=ends[23];
    }
    if(ends[24]>=biggest38351){
      biggest38351=ends[24];
    }
    if(ends[25]>=biggest38351){
      biggest38351=ends[25];
    }
    if(biggest38351 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38343(int [] tdone, int [] ends){
        S7012=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38342(int [] tdone, int [] ends){
        S7009=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38341(int [] tdone, int [] ends){
        S7042=1;
    S7016=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38342(tdone,ends);
      thread38343(tdone,ends);
      int biggest38344 = 0;
      if(ends[46]>=biggest38344){
        biggest38344=ends[46];
      }
      if(ends[47]>=biggest38344){
        biggest38344=ends[47];
      }
      if(biggest38344 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7016=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38339(int [] tdone, int [] ends){
        S6974=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38338(int [] tdone, int [] ends){
        S6971=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38337(int [] tdone, int [] ends){
        S7004=1;
    S6978=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38338(tdone,ends);
      thread38339(tdone,ends);
      int biggest38340 = 0;
      if(ends[43]>=biggest38340){
        biggest38340=ends[43];
      }
      if(ends[44]>=biggest38340){
        biggest38340=ends[44];
      }
      if(biggest38340 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S6978=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38336(int [] tdone, int [] ends){
        S7044=1;
    thread38337(tdone,ends);
    thread38341(tdone,ends);
    int biggest38345 = 0;
    if(ends[42]>=biggest38345){
      biggest38345=ends[42];
    }
    if(ends[45]>=biggest38345){
      biggest38345=ends[45];
    }
    if(biggest38345 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38334(int [] tdone, int [] ends){
        S6964=1;
    S6908=0;
    S6888=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S6888=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S6883=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S6883=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S6908=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S6908=1;
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
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread38333(int [] tdone, int [] ends){
        S6881=1;
    S6825=0;
    S6805=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S6805=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S6800=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S6800=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread38332(int [] tdone, int [] ends){
        S6966=1;
    thread38333(tdone,ends);
    thread38334(tdone,ends);
    int biggest38335 = 0;
    if(ends[39]>=biggest38335){
      biggest38335=ends[39];
    }
    if(ends[40]>=biggest38335){
      biggest38335=ends[40];
    }
    if(biggest38335 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38329(int [] tdone, int [] ends){
        S6728=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6728=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38328(int [] tdone, int [] ends){
        S6722=1;
    S6721=0;
    S6705=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6705=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6700=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6700=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6721=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread38327(int [] tdone, int [] ends){
        S6796=1;
    S6730=0;
    thread38328(tdone,ends);
    thread38329(tdone,ends);
    int biggest38330 = 0;
    if(ends[36]>=biggest38330){
      biggest38330=ends[36];
    }
    if(ends[37]>=biggest38330){
      biggest38330=ends[37];
    }
    if(biggest38330 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38325(int [] tdone, int [] ends){
        S6629=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6629=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38324(int [] tdone, int [] ends){
        S6623=1;
    S6622=0;
    S6606=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6606=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6601=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6601=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6622=1;
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

  public void thread38323(int [] tdone, int [] ends){
        S6697=1;
    S6631=0;
    thread38324(tdone,ends);
    thread38325(tdone,ends);
    int biggest38326 = 0;
    if(ends[33]>=biggest38326){
      biggest38326=ends[33];
    }
    if(ends[34]>=biggest38326){
      biggest38326=ends[34];
    }
    if(biggest38326 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38321(int [] tdone, int [] ends){
        S6530=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6530=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38320(int [] tdone, int [] ends){
        S6524=1;
    S6523=0;
    S6507=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6507=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6502=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6502=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6523=1;
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

  public void thread38319(int [] tdone, int [] ends){
        S6598=1;
    S6532=0;
    thread38320(tdone,ends);
    thread38321(tdone,ends);
    int biggest38322 = 0;
    if(ends[30]>=biggest38322){
      biggest38322=ends[30];
    }
    if(ends[31]>=biggest38322){
      biggest38322=ends[31];
    }
    if(biggest38322 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38318(int [] tdone, int [] ends){
        S6798=1;
    thread38319(tdone,ends);
    thread38323(tdone,ends);
    thread38327(tdone,ends);
    int biggest38331 = 0;
    if(ends[29]>=biggest38331){
      biggest38331=ends[29];
    }
    if(ends[32]>=biggest38331){
      biggest38331=ends[32];
    }
    if(ends[35]>=biggest38331){
      biggest38331=ends[35];
    }
    if(biggest38331 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38331 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38331 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38316(int [] tdone, int [] ends){
        S4553=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38315(int [] tdone, int [] ends){
        S4550=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38314(int [] tdone, int [] ends){
        S4547=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38313(int [] tdone, int [] ends){
        S6499=1;
    S4554=0;
    thread38314(tdone,ends);
    thread38315(tdone,ends);
    thread38316(tdone,ends);
    int biggest38317 = 0;
    if(ends[23]>=biggest38317){
      biggest38317=ends[23];
    }
    if(ends[24]>=biggest38317){
      biggest38317=ends[24];
    }
    if(ends[25]>=biggest38317){
      biggest38317=ends[25];
    }
    if(biggest38317 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38309(int [] tdone, int [] ends){
        S7012=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38308(int [] tdone, int [] ends){
        S7009=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38307(int [] tdone, int [] ends){
        S7042=1;
    S7016=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38308(tdone,ends);
      thread38309(tdone,ends);
      int biggest38310 = 0;
      if(ends[46]>=biggest38310){
        biggest38310=ends[46];
      }
      if(ends[47]>=biggest38310){
        biggest38310=ends[47];
      }
      if(biggest38310 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7016=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38305(int [] tdone, int [] ends){
        S6974=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38304(int [] tdone, int [] ends){
        S6971=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38303(int [] tdone, int [] ends){
        S7004=1;
    S6978=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38304(tdone,ends);
      thread38305(tdone,ends);
      int biggest38306 = 0;
      if(ends[43]>=biggest38306){
        biggest38306=ends[43];
      }
      if(ends[44]>=biggest38306){
        biggest38306=ends[44];
      }
      if(biggest38306 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S6978=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38302(int [] tdone, int [] ends){
        S7044=1;
    thread38303(tdone,ends);
    thread38307(tdone,ends);
    int biggest38311 = 0;
    if(ends[42]>=biggest38311){
      biggest38311=ends[42];
    }
    if(ends[45]>=biggest38311){
      biggest38311=ends[45];
    }
    if(biggest38311 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38300(int [] tdone, int [] ends){
        S6964=1;
    S6908=0;
    S6888=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S6888=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S6883=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S6883=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S6908=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S6908=1;
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
      else {
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
      }
    }
  }

  public void thread38299(int [] tdone, int [] ends){
        S6881=1;
    S6825=0;
    S6805=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S6805=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S6800=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S6800=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S6825=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread38298(int [] tdone, int [] ends){
        S6966=1;
    thread38299(tdone,ends);
    thread38300(tdone,ends);
    int biggest38301 = 0;
    if(ends[39]>=biggest38301){
      biggest38301=ends[39];
    }
    if(ends[40]>=biggest38301){
      biggest38301=ends[40];
    }
    if(biggest38301 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38295(int [] tdone, int [] ends){
        S6728=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S6728=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38294(int [] tdone, int [] ends){
        S6722=1;
    S6721=0;
    S6705=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6705=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S6700=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6700=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6721=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread38293(int [] tdone, int [] ends){
        S6796=1;
    S6730=0;
    thread38294(tdone,ends);
    thread38295(tdone,ends);
    int biggest38296 = 0;
    if(ends[36]>=biggest38296){
      biggest38296=ends[36];
    }
    if(ends[37]>=biggest38296){
      biggest38296=ends[37];
    }
    if(biggest38296 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38291(int [] tdone, int [] ends){
        S6629=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6629=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38290(int [] tdone, int [] ends){
        S6623=1;
    S6622=0;
    S6606=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6606=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6601=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6601=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6622=1;
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

  public void thread38289(int [] tdone, int [] ends){
        S6697=1;
    S6631=0;
    thread38290(tdone,ends);
    thread38291(tdone,ends);
    int biggest38292 = 0;
    if(ends[33]>=biggest38292){
      biggest38292=ends[33];
    }
    if(ends[34]>=biggest38292){
      biggest38292=ends[34];
    }
    if(biggest38292 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38287(int [] tdone, int [] ends){
        S6530=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6530=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38286(int [] tdone, int [] ends){
        S6524=1;
    S6523=0;
    S6507=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6507=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6502=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6502=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6523=1;
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

  public void thread38285(int [] tdone, int [] ends){
        S6598=1;
    S6532=0;
    thread38286(tdone,ends);
    thread38287(tdone,ends);
    int biggest38288 = 0;
    if(ends[30]>=biggest38288){
      biggest38288=ends[30];
    }
    if(ends[31]>=biggest38288){
      biggest38288=ends[31];
    }
    if(biggest38288 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38284(int [] tdone, int [] ends){
        S6798=1;
    thread38285(tdone,ends);
    thread38289(tdone,ends);
    thread38293(tdone,ends);
    int biggest38297 = 0;
    if(ends[29]>=biggest38297){
      biggest38297=ends[29];
    }
    if(ends[32]>=biggest38297){
      biggest38297=ends[32];
    }
    if(ends[35]>=biggest38297){
      biggest38297=ends[35];
    }
    if(biggest38297 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38297 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38297 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38282(int [] tdone, int [] ends){
        S4553=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38281(int [] tdone, int [] ends){
        S4550=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38280(int [] tdone, int [] ends){
        S4547=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38279(int [] tdone, int [] ends){
        S6499=1;
    S4554=0;
    thread38280(tdone,ends);
    thread38281(tdone,ends);
    thread38282(tdone,ends);
    int biggest38283 = 0;
    if(ends[23]>=biggest38283){
      biggest38283=ends[23];
    }
    if(ends[24]>=biggest38283){
      biggest38283=ends[24];
    }
    if(ends[25]>=biggest38283){
      biggest38283=ends[25];
    }
    if(biggest38283 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S24545){
        case 0 : 
          S24545=0;
          break RUN;
        
        case 1 : 
          S24545=2;
          S24545=2;
          cvR_21.setClear();//sysj\conveyor_controller.sysj line: 203, column: 7
          fR_21.setClear();//sysj\conveyor_controller.sysj line: 203, column: 7
          cR_21.setClear();//sysj\conveyor_controller.sysj line: 203, column: 7
          bottleAtPos5_21.setClear();//sysj\conveyor_controller.sysj line: 204, column: 7
          bottleAtPos3_21.setClear();//sysj\conveyor_controller.sysj line: 204, column: 7
          S4412=0;
          S4308=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 205, column: 7
            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 205, column: 7
            S4308=1;
            active[21]=1;
            ends[21]=1;
            break RUN;
          }
          else {
            S4303=0;
            if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 205, column: 7
              convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 205, column: 7
              S4303=1;
              if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 205, column: 7
                convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 205, column: 7
                ends[21]=2;
                ;//sysj\conveyor_controller.sysj line: 205, column: 7
                S4412=1;
                S4330=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 206, column: 7
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                  S4330=1;
                  active[21]=1;
                  ends[21]=1;
                  break RUN;
                }
                else {
                  S4325=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 206, column: 7
                    S4325=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                      ends[21]=2;
                      ;//sysj\conveyor_controller.sysj line: 206, column: 7
                      S4412=2;
                      S4419=0;
                      if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                        S4419=1;
                        active[21]=1;
                        ends[21]=1;
                        break RUN;
                      }
                      else {
                        S4414=0;
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                          S4414=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                            ends[21]=2;
                            ;//sysj\conveyor_controller.sysj line: 207, column: 7
                            S4412=3;
                            thread38279(tdone,ends);
                            thread38284(tdone,ends);
                            thread38298(tdone,ends);
                            thread38302(tdone,ends);
                            int biggest38312 = 0;
                            if(ends[22]>=biggest38312){
                              biggest38312=ends[22];
                            }
                            if(ends[28]>=biggest38312){
                              biggest38312=ends[28];
                            }
                            if(ends[38]>=biggest38312){
                              biggest38312=ends[38];
                            }
                            if(ends[41]>=biggest38312){
                              biggest38312=ends[41];
                            }
                            if(biggest38312 == 1){
                              active[21]=1;
                              ends[21]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[21]=1;
                            ends[21]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[21]=1;
                          ends[21]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      active[21]=1;
                      ends[21]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[21]=1;
                    ends[21]=1;
                    break RUN;
                  }
                }
              }
              else {
                active[21]=1;
                ends[21]=1;
                break RUN;
              }
            }
            else {
              active[21]=1;
              ends[21]=1;
              break RUN;
            }
          }
        
        case 2 : 
          cvR_21.setClear();//sysj\conveyor_controller.sysj line: 203, column: 7
          fR_21.setClear();//sysj\conveyor_controller.sysj line: 203, column: 7
          cR_21.setClear();//sysj\conveyor_controller.sysj line: 203, column: 7
          bottleAtPos5_21.setClear();//sysj\conveyor_controller.sysj line: 204, column: 7
          bottleAtPos3_21.setClear();//sysj\conveyor_controller.sysj line: 204, column: 7
          switch(S4412){
            case 0 : 
              switch(S4308){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 205, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 205, column: 7
                    S4308=1;
                    active[21]=1;
                    ends[21]=1;
                    break RUN;
                  }
                  else {
                    switch(S4303){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 205, column: 7
                          convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 205, column: 7
                          S4303=1;
                          if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 205, column: 7
                            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 205, column: 7
                            ends[21]=2;
                            ;//sysj\conveyor_controller.sysj line: 205, column: 7
                            S4412=1;
                            S4330=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 206, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                              S4330=1;
                              active[21]=1;
                              ends[21]=1;
                              break RUN;
                            }
                            else {
                              S4325=0;
                              if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                                fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 206, column: 7
                                S4325=1;
                                if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                                  ends[21]=2;
                                  ;//sysj\conveyor_controller.sysj line: 206, column: 7
                                  S4412=2;
                                  S4419=0;
                                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                    S4419=1;
                                    active[21]=1;
                                    ends[21]=1;
                                    break RUN;
                                  }
                                  else {
                                    S4414=0;
                                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                                      S4414=1;
                                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                        ends[21]=2;
                                        ;//sysj\conveyor_controller.sysj line: 207, column: 7
                                        S4412=3;
                                        thread38313(tdone,ends);
                                        thread38318(tdone,ends);
                                        thread38332(tdone,ends);
                                        thread38336(tdone,ends);
                                        int biggest38346 = 0;
                                        if(ends[22]>=biggest38346){
                                          biggest38346=ends[22];
                                        }
                                        if(ends[28]>=biggest38346){
                                          biggest38346=ends[28];
                                        }
                                        if(ends[38]>=biggest38346){
                                          biggest38346=ends[38];
                                        }
                                        if(ends[41]>=biggest38346){
                                          biggest38346=ends[41];
                                        }
                                        if(biggest38346 == 1){
                                          active[21]=1;
                                          ends[21]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[21]=1;
                                        ends[21]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[21]=1;
                                      ends[21]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[21]=1;
                                  ends[21]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[21]=1;
                                ends[21]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[21]=1;
                            ends[21]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[21]=1;
                          ends[21]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 205, column: 7
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 205, column: 7
                          ends[21]=2;
                          ;//sysj\conveyor_controller.sysj line: 205, column: 7
                          S4412=1;
                          S4330=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 206, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                            S4330=1;
                            active[21]=1;
                            ends[21]=1;
                            break RUN;
                          }
                          else {
                            S4325=0;
                            if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                              fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 206, column: 7
                              S4325=1;
                              if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                                fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                                ends[21]=2;
                                ;//sysj\conveyor_controller.sysj line: 206, column: 7
                                S4412=2;
                                S4419=0;
                                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                  S4419=1;
                                  active[21]=1;
                                  ends[21]=1;
                                  break RUN;
                                }
                                else {
                                  S4414=0;
                                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                                    S4414=1;
                                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                      ends[21]=2;
                                      ;//sysj\conveyor_controller.sysj line: 207, column: 7
                                      S4412=3;
                                      thread38347(tdone,ends);
                                      thread38352(tdone,ends);
                                      thread38366(tdone,ends);
                                      thread38370(tdone,ends);
                                      int biggest38380 = 0;
                                      if(ends[22]>=biggest38380){
                                        biggest38380=ends[22];
                                      }
                                      if(ends[28]>=biggest38380){
                                        biggest38380=ends[28];
                                      }
                                      if(ends[38]>=biggest38380){
                                        biggest38380=ends[38];
                                      }
                                      if(ends[41]>=biggest38380){
                                        biggest38380=ends[41];
                                      }
                                      if(biggest38380 == 1){
                                        active[21]=1;
                                        ends[21]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[21]=1;
                                      ends[21]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[21]=1;
                                    ends[21]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[21]=1;
                                ends[21]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[21]=1;
                              ends[21]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[21]=1;
                          ends[21]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S4308=1;
                  S4308=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 205, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 205, column: 7
                    S4308=1;
                    active[21]=1;
                    ends[21]=1;
                    break RUN;
                  }
                  else {
                    S4303=0;
                    if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 205, column: 7
                      convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 205, column: 7
                      S4303=1;
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 205, column: 7
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 205, column: 7
                        ends[21]=2;
                        ;//sysj\conveyor_controller.sysj line: 205, column: 7
                        S4412=1;
                        S4330=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 206, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                          S4330=1;
                          active[21]=1;
                          ends[21]=1;
                          break RUN;
                        }
                        else {
                          S4325=0;
                          if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                            fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 206, column: 7
                            S4325=1;
                            if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                              ends[21]=2;
                              ;//sysj\conveyor_controller.sysj line: 206, column: 7
                              S4412=2;
                              S4419=0;
                              if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                S4419=1;
                                active[21]=1;
                                ends[21]=1;
                                break RUN;
                              }
                              else {
                                S4414=0;
                                if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                  capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                                  S4414=1;
                                  if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                    ends[21]=2;
                                    ;//sysj\conveyor_controller.sysj line: 207, column: 7
                                    S4412=3;
                                    thread38381(tdone,ends);
                                    thread38386(tdone,ends);
                                    thread38400(tdone,ends);
                                    thread38404(tdone,ends);
                                    int biggest38414 = 0;
                                    if(ends[22]>=biggest38414){
                                      biggest38414=ends[22];
                                    }
                                    if(ends[28]>=biggest38414){
                                      biggest38414=ends[28];
                                    }
                                    if(ends[38]>=biggest38414){
                                      biggest38414=ends[38];
                                    }
                                    if(ends[41]>=biggest38414){
                                      biggest38414=ends[41];
                                    }
                                    if(biggest38414 == 1){
                                      active[21]=1;
                                      ends[21]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[21]=1;
                                    ends[21]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[21]=1;
                                  ends[21]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              active[21]=1;
                              ends[21]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[21]=1;
                            ends[21]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[21]=1;
                        ends[21]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[21]=1;
                      ends[21]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S4330){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 206, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                    S4330=1;
                    active[21]=1;
                    ends[21]=1;
                    break RUN;
                  }
                  else {
                    switch(S4325){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                          fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 206, column: 7
                          S4325=1;
                          if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                            ends[21]=2;
                            ;//sysj\conveyor_controller.sysj line: 206, column: 7
                            S4412=2;
                            S4419=0;
                            if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                              S4419=1;
                              active[21]=1;
                              ends[21]=1;
                              break RUN;
                            }
                            else {
                              S4414=0;
                              if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                                S4414=1;
                                if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                  ends[21]=2;
                                  ;//sysj\conveyor_controller.sysj line: 207, column: 7
                                  S4412=3;
                                  thread38415(tdone,ends);
                                  thread38420(tdone,ends);
                                  thread38434(tdone,ends);
                                  thread38438(tdone,ends);
                                  int biggest38448 = 0;
                                  if(ends[22]>=biggest38448){
                                    biggest38448=ends[22];
                                  }
                                  if(ends[28]>=biggest38448){
                                    biggest38448=ends[28];
                                  }
                                  if(ends[38]>=biggest38448){
                                    biggest38448=ends[38];
                                  }
                                  if(ends[41]>=biggest38448){
                                    biggest38448=ends[41];
                                  }
                                  if(biggest38448 == 1){
                                    active[21]=1;
                                    ends[21]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[21]=1;
                                  ends[21]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[21]=1;
                                ends[21]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[21]=1;
                            ends[21]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[21]=1;
                          ends[21]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                          ends[21]=2;
                          ;//sysj\conveyor_controller.sysj line: 206, column: 7
                          S4412=2;
                          S4419=0;
                          if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                            S4419=1;
                            active[21]=1;
                            ends[21]=1;
                            break RUN;
                          }
                          else {
                            S4414=0;
                            if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                              capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                              S4414=1;
                              if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                ends[21]=2;
                                ;//sysj\conveyor_controller.sysj line: 207, column: 7
                                S4412=3;
                                thread38449(tdone,ends);
                                thread38454(tdone,ends);
                                thread38468(tdone,ends);
                                thread38472(tdone,ends);
                                int biggest38482 = 0;
                                if(ends[22]>=biggest38482){
                                  biggest38482=ends[22];
                                }
                                if(ends[28]>=biggest38482){
                                  biggest38482=ends[28];
                                }
                                if(ends[38]>=biggest38482){
                                  biggest38482=ends[38];
                                }
                                if(ends[41]>=biggest38482){
                                  biggest38482=ends[41];
                                }
                                if(biggest38482 == 1){
                                  active[21]=1;
                                  ends[21]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[21]=1;
                                ends[21]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[21]=1;
                              ends[21]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[21]=1;
                          ends[21]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S4330=1;
                  S4330=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 206, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                    S4330=1;
                    active[21]=1;
                    ends[21]=1;
                    break RUN;
                  }
                  else {
                    S4325=0;
                    if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                      fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 206, column: 7
                      S4325=1;
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                        ends[21]=2;
                        ;//sysj\conveyor_controller.sysj line: 206, column: 7
                        S4412=2;
                        S4419=0;
                        if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                          S4419=1;
                          active[21]=1;
                          ends[21]=1;
                          break RUN;
                        }
                        else {
                          S4414=0;
                          if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                            capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                            S4414=1;
                            if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                              ends[21]=2;
                              ;//sysj\conveyor_controller.sysj line: 207, column: 7
                              S4412=3;
                              thread38483(tdone,ends);
                              thread38488(tdone,ends);
                              thread38502(tdone,ends);
                              thread38506(tdone,ends);
                              int biggest38516 = 0;
                              if(ends[22]>=biggest38516){
                                biggest38516=ends[22];
                              }
                              if(ends[28]>=biggest38516){
                                biggest38516=ends[28];
                              }
                              if(ends[38]>=biggest38516){
                                biggest38516=ends[38];
                              }
                              if(ends[41]>=biggest38516){
                                biggest38516=ends[41];
                              }
                              if(biggest38516 == 1){
                                active[21]=1;
                                ends[21]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[21]=1;
                              ends[21]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[21]=1;
                            ends[21]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[21]=1;
                        ends[21]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[21]=1;
                      ends[21]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 2 : 
              switch(S4419){
                case 0 : 
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                    S4419=1;
                    active[21]=1;
                    ends[21]=1;
                    break RUN;
                  }
                  else {
                    switch(S4414){
                      case 0 : 
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                          S4414=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                            ends[21]=2;
                            ;//sysj\conveyor_controller.sysj line: 207, column: 7
                            S4412=3;
                            thread38517(tdone,ends);
                            thread38522(tdone,ends);
                            thread38536(tdone,ends);
                            thread38540(tdone,ends);
                            int biggest38550 = 0;
                            if(ends[22]>=biggest38550){
                              biggest38550=ends[22];
                            }
                            if(ends[28]>=biggest38550){
                              biggest38550=ends[28];
                            }
                            if(ends[38]>=biggest38550){
                              biggest38550=ends[38];
                            }
                            if(ends[41]>=biggest38550){
                              biggest38550=ends[41];
                            }
                            if(biggest38550 == 1){
                              active[21]=1;
                              ends[21]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[21]=1;
                            ends[21]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[21]=1;
                          ends[21]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                          ends[21]=2;
                          ;//sysj\conveyor_controller.sysj line: 207, column: 7
                          S4412=3;
                          thread38551(tdone,ends);
                          thread38556(tdone,ends);
                          thread38570(tdone,ends);
                          thread38574(tdone,ends);
                          int biggest38584 = 0;
                          if(ends[22]>=biggest38584){
                            biggest38584=ends[22];
                          }
                          if(ends[28]>=biggest38584){
                            biggest38584=ends[28];
                          }
                          if(ends[38]>=biggest38584){
                            biggest38584=ends[38];
                          }
                          if(ends[41]>=biggest38584){
                            biggest38584=ends[41];
                          }
                          if(biggest38584 == 1){
                            active[21]=1;
                            ends[21]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[21]=1;
                          ends[21]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S4419=1;
                  S4419=0;
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                    S4419=1;
                    active[21]=1;
                    ends[21]=1;
                    break RUN;
                  }
                  else {
                    S4414=0;
                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                      S4414=1;
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                        ends[21]=2;
                        ;//sysj\conveyor_controller.sysj line: 207, column: 7
                        S4412=3;
                        thread38585(tdone,ends);
                        thread38590(tdone,ends);
                        thread38604(tdone,ends);
                        thread38608(tdone,ends);
                        int biggest38618 = 0;
                        if(ends[22]>=biggest38618){
                          biggest38618=ends[22];
                        }
                        if(ends[28]>=biggest38618){
                          biggest38618=ends[28];
                        }
                        if(ends[38]>=biggest38618){
                          biggest38618=ends[38];
                        }
                        if(ends[41]>=biggest38618){
                          biggest38618=ends[41];
                        }
                        if(biggest38618 == 1){
                          active[21]=1;
                          ends[21]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[21]=1;
                        ends[21]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[21]=1;
                      ends[21]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 3 : 
              thread38619(tdone,ends);
              thread38648(tdone,ends);
              thread38671(tdone,ends);
              thread38675(tdone,ends);
              int biggest38691 = 0;
              if(ends[22]>=biggest38691){
                biggest38691=ends[22];
              }
              if(ends[28]>=biggest38691){
                biggest38691=ends[28];
              }
              if(ends[38]>=biggest38691){
                biggest38691=ends[38];
              }
              if(ends[41]>=biggest38691){
                biggest38691=ends[41];
              }
              if(biggest38691 == 1){
                active[21]=1;
                ends[21]=1;
                break RUN;
              }
              //FINXME code
              if(biggest38691 == 0){
                S24545=0;
                active[21]=0;
                ends[21]=0;
                S24545=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    cvR_21 = new Signal();
    fR_21 = new Signal();
    cR_21 = new Signal();
    bottleAtPos5_21 = new Signal();
    bottleAtPos3_21 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[21] != 0){
      int index = 21;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[21]!=0 || suspended[21]!=0 || active[21]!=1);
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
      cvR_21.setpreclear();
      fR_21.setpreclear();
      cR_21.setpreclear();
      bottleAtPos5_21.setpreclear();
      bottleAtPos3_21.setpreclear();
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
      cvR_21.setClear();
      fR_21.setClear();
      cR_21.setClear();
      bottleAtPos5_21.setClear();
      bottleAtPos3_21.setClear();
      convReady_in.sethook();
      fillerReady_in.sethook();
      capperReady_in.sethook();
      checkFive_in.sethook();
      checkThree_in.sethook();
      checkOne_in.sethook();
      rotated_o.sethook();
      if(paused[21]!=0 || suspended[21]!=0 || active[21]!=1);
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
      if(active[21] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

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
  private int S24889 = 1;
  private int S4756 = 1;
  private int S4652 = 1;
  private int S4647 = 1;
  private int S4674 = 1;
  private int S4669 = 1;
  private int S4763 = 1;
  private int S4758 = 1;
  private int S6843 = 1;
  private int S4898 = 1;
  private int S4891 = 1;
  private int S4894 = 1;
  private int S4897 = 1;
  private int S4912 = 1;
  private int S4935 = 1;
  private int S4951 = 1;
  private int S5054 = 1;
  private int S5049 = 1;
  private int S7142 = 1;
  private int S6942 = 1;
  private int S6876 = 1;
  private int S6868 = 1;
  private int S6867 = 1;
  private int S6851 = 1;
  private int S6846 = 1;
  private int S6874 = 1;
  private int S7041 = 1;
  private int S6975 = 1;
  private int S6967 = 1;
  private int S6966 = 1;
  private int S6950 = 1;
  private int S6945 = 1;
  private int S6973 = 1;
  private int S7140 = 1;
  private int S7074 = 1;
  private int S7066 = 1;
  private int S7065 = 1;
  private int S7049 = 1;
  private int S7044 = 1;
  private int S7072 = 1;
  private int S7310 = 1;
  private int S7225 = 1;
  private int S7169 = 1;
  private int S7149 = 1;
  private int S7144 = 1;
  private int S7308 = 1;
  private int S7252 = 1;
  private int S7232 = 1;
  private int S7227 = 1;
  private int S7388 = 1;
  private int S7348 = 1;
  private int S7322 = 1;
  private int S7315 = 1;
  private int S7318 = 1;
  private int S7386 = 1;
  private int S7360 = 1;
  private int S7353 = 1;
  private int S7356 = 1;
  
  private int[] ends = new int[72];
  private int[] tdone = new int[72];
  
  public void thread39035(int [] tdone, int [] ends){
        S7356=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread39034(int [] tdone, int [] ends){
        S7353=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread39032(int [] tdone, int [] ends){
        switch(S7356){
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

  public void thread39031(int [] tdone, int [] ends){
        switch(S7353){
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

  public void thread39030(int [] tdone, int [] ends){
        switch(S7386){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S7360){
          case 0 : 
            thread39031(tdone,ends);
            thread39032(tdone,ends);
            int biggest39033 = 0;
            if(ends[46]>=biggest39033){
              biggest39033=ends[46];
            }
            if(ends[47]>=biggest39033){
              biggest39033=ends[47];
            }
            if(biggest39033 == 1){
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            if(biggest39033 == 2){
              ends[45]=2;
              ;//sysj\conveyor_controller.sysj line: 325, column: 34
              S7360=1;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            //FINXME code
            if(biggest39033 == 0){
              ;//sysj\conveyor_controller.sysj line: 333, column: 20
              S7360=1;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
          case 1 : 
            S7360=1;
            S7360=0;
            if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
              thread39034(tdone,ends);
              thread39035(tdone,ends);
              int biggest39036 = 0;
              if(ends[46]>=biggest39036){
                biggest39036=ends[46];
              }
              if(ends[47]>=biggest39036){
                biggest39036=ends[47];
              }
              if(biggest39036 == 1){
                active[45]=1;
                ends[45]=1;
                tdone[45]=1;
              }
            }
            else {
              S7360=1;
              active[45]=1;
              ends[45]=1;
              tdone[45]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread39028(int [] tdone, int [] ends){
        S7318=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread39027(int [] tdone, int [] ends){
        S7315=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread39025(int [] tdone, int [] ends){
        switch(S7318){
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

  public void thread39024(int [] tdone, int [] ends){
        switch(S7315){
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

  public void thread39023(int [] tdone, int [] ends){
        switch(S7348){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S7322){
          case 0 : 
            thread39024(tdone,ends);
            thread39025(tdone,ends);
            int biggest39026 = 0;
            if(ends[43]>=biggest39026){
              biggest39026=ends[43];
            }
            if(ends[44]>=biggest39026){
              biggest39026=ends[44];
            }
            if(biggest39026 == 1){
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            if(biggest39026 == 2){
              ends[42]=2;
              ;//sysj\conveyor_controller.sysj line: 307, column: 34
              S7322=1;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            //FINXME code
            if(biggest39026 == 0){
              ;//sysj\conveyor_controller.sysj line: 315, column: 20
              S7322=1;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
          case 1 : 
            S7322=1;
            S7322=0;
            if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
              thread39027(tdone,ends);
              thread39028(tdone,ends);
              int biggest39029 = 0;
              if(ends[43]>=biggest39029){
                biggest39029=ends[43];
              }
              if(ends[44]>=biggest39029){
                biggest39029=ends[44];
              }
              if(biggest39029 == 1){
                active[42]=1;
                ends[42]=1;
                tdone[42]=1;
              }
            }
            else {
              S7322=1;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread39022(int [] tdone, int [] ends){
        switch(S7388){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        thread39023(tdone,ends);
        thread39030(tdone,ends);
        int biggest39037 = 0;
        if(ends[42]>=biggest39037){
          biggest39037=ends[42];
        }
        if(ends[45]>=biggest39037){
          biggest39037=ends[45];
        }
        if(biggest39037 == 1){
          active[41]=1;
          ends[41]=1;
          tdone[41]=1;
        }
        //FINXME code
        if(biggest39037 == 0){
          S7388=0;
          active[41]=0;
          ends[41]=0;
          tdone[41]=1;
        }
        break;
      
    }
  }

  public void thread39020(int [] tdone, int [] ends){
        switch(S7308){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        switch(S7252){
          case 0 : 
            switch(S7232){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
                  S7232=1;
                  active[40]=1;
                  ends[40]=1;
                  tdone[40]=1;
                }
                else {
                  switch(S7227){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
                        S7227=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
                          ends[40]=2;
                          ;//sysj\conveyor_controller.sysj line: 292, column: 8
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
                            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
                            currsigs.addElement(bottleAtPos3_21);
                            S7252=1;
                            active[40]=1;
                            ends[40]=1;
                            tdone[40]=1;
                          }
                          else {
                            S7252=1;
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
                          S7252=1;
                          active[40]=1;
                          ends[40]=1;
                          tdone[40]=1;
                        }
                        else {
                          S7252=1;
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
                S7232=1;
                S7232=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
                  S7232=1;
                  active[40]=1;
                  ends[40]=1;
                  tdone[40]=1;
                }
                else {
                  S7227=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
                    S7227=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
                      ends[40]=2;
                      ;//sysj\conveyor_controller.sysj line: 292, column: 8
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
                        bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
                        currsigs.addElement(bottleAtPos3_21);
                        S7252=1;
                        active[40]=1;
                        ends[40]=1;
                        tdone[40]=1;
                      }
                      else {
                        S7252=1;
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
            S7252=1;
            S7252=0;
            S7232=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
              S7232=1;
              active[40]=1;
              ends[40]=1;
              tdone[40]=1;
            }
            else {
              S7227=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
                S7227=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
                  ends[40]=2;
                  ;//sysj\conveyor_controller.sysj line: 292, column: 8
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
                    bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
                    currsigs.addElement(bottleAtPos3_21);
                    S7252=1;
                    active[40]=1;
                    ends[40]=1;
                    tdone[40]=1;
                  }
                  else {
                    S7252=1;
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

  public void thread39019(int [] tdone, int [] ends){
        switch(S7225){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S7169){
          case 0 : 
            switch(S7149){
              case 0 : 
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
                  S7149=1;
                  active[39]=1;
                  ends[39]=1;
                  tdone[39]=1;
                }
                else {
                  switch(S7144){
                    case 0 : 
                      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
                        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
                        S7144=1;
                        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
                          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
                          ends[39]=2;
                          ;//sysj\conveyor_controller.sysj line: 282, column: 7
                          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
                            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
                            currsigs.addElement(bottleAtPos5_21);
                            S7169=1;
                            active[39]=1;
                            ends[39]=1;
                            tdone[39]=1;
                          }
                          else {
                            S7169=1;
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
                          S7169=1;
                          active[39]=1;
                          ends[39]=1;
                          tdone[39]=1;
                        }
                        else {
                          S7169=1;
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
                S7149=1;
                S7149=0;
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
                  S7149=1;
                  active[39]=1;
                  ends[39]=1;
                  tdone[39]=1;
                }
                else {
                  S7144=0;
                  if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
                    checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
                    S7144=1;
                    if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
                      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
                      ends[39]=2;
                      ;//sysj\conveyor_controller.sysj line: 282, column: 7
                      if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
                        bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
                        currsigs.addElement(bottleAtPos5_21);
                        S7169=1;
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                      else {
                        S7169=1;
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
            S7169=1;
            S7169=0;
            S7149=0;
            if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
              checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
              S7149=1;
              active[39]=1;
              ends[39]=1;
              tdone[39]=1;
            }
            else {
              S7144=0;
              if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
                checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
                S7144=1;
                if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
                  ends[39]=2;
                  ;//sysj\conveyor_controller.sysj line: 282, column: 7
                  if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
                    bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
                    currsigs.addElement(bottleAtPos5_21);
                    S7169=1;
                    active[39]=1;
                    ends[39]=1;
                    tdone[39]=1;
                  }
                  else {
                    S7169=1;
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

  public void thread39018(int [] tdone, int [] ends){
        switch(S7310){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        thread39019(tdone,ends);
        thread39020(tdone,ends);
        int biggest39021 = 0;
        if(ends[39]>=biggest39021){
          biggest39021=ends[39];
        }
        if(ends[40]>=biggest39021){
          biggest39021=ends[40];
        }
        if(biggest39021 == 1){
          active[38]=1;
          ends[38]=1;
          tdone[38]=1;
        }
        //FINXME code
        if(biggest39021 == 0){
          S7310=0;
          active[38]=0;
          ends[38]=0;
          tdone[38]=1;
        }
        break;
      
    }
  }

  public void thread39015(int [] tdone, int [] ends){
        S7072=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7072=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread39014(int [] tdone, int [] ends){
        S7066=1;
    S7065=0;
    S7049=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S7049=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7044=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S7044=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S7065=1;
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

  public void thread39012(int [] tdone, int [] ends){
        switch(S7072){
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

  public void thread39011(int [] tdone, int [] ends){
        switch(S7066){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        switch(S7065){
          case 0 : 
            switch(S7049){
              case 0 : 
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                  S7049=1;
                  active[36]=1;
                  ends[36]=1;
                  tdone[36]=1;
                }
                else {
                  switch(S7044){
                    case 0 : 
                      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
                        S7044=1;
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                          ends[36]=2;
                          ;//sysj\conveyor_controller.sysj line: 67, column: 5
                          S7065=1;
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
                        S7065=1;
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
                S7049=1;
                S7049=0;
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                  S7049=1;
                  active[36]=1;
                  ends[36]=1;
                  tdone[36]=1;
                }
                else {
                  S7044=0;
                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
                    S7044=1;
                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                      ends[36]=2;
                      ;//sysj\conveyor_controller.sysj line: 67, column: 5
                      S7065=1;
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
            S7065=1;
            S7065=2;
            active[36]=1;
            ends[36]=1;
            tdone[36]=1;
            break;
          
          case 2 : 
            S7065=2;
            capperReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 67, column: 36
            ends[36]=2;
            tdone[36]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread39010(int [] tdone, int [] ends){
        switch(S7140){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        switch(S7074){
          case 0 : 
            thread39011(tdone,ends);
            thread39012(tdone,ends);
            int biggest39013 = 0;
            if(ends[36]>=biggest39013){
              biggest39013=ends[36];
            }
            if(ends[37]>=biggest39013){
              biggest39013=ends[37];
            }
            if(biggest39013 == 1){
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            if(biggest39013 == 2){
              ends[35]=2;
              ;//sysj\conveyor_controller.sysj line: 66, column: 3
              S7074=1;
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            //FINXME code
            if(biggest39013 == 0){
              S7074=1;
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            break;
          
          case 1 : 
            S7074=1;
            S7074=0;
            thread39014(tdone,ends);
            thread39015(tdone,ends);
            int biggest39016 = 0;
            if(ends[36]>=biggest39016){
              biggest39016=ends[36];
            }
            if(ends[37]>=biggest39016){
              biggest39016=ends[37];
            }
            if(biggest39016 == 1){
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread39008(int [] tdone, int [] ends){
        S6973=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6973=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread39007(int [] tdone, int [] ends){
        S6967=1;
    S6966=0;
    S6950=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6950=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6945=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6945=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6966=1;
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

  public void thread39005(int [] tdone, int [] ends){
        switch(S6973){
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

  public void thread39004(int [] tdone, int [] ends){
        switch(S6967){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        switch(S6966){
          case 0 : 
            switch(S6950){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                  S6950=1;
                  active[33]=1;
                  ends[33]=1;
                  tdone[33]=1;
                }
                else {
                  switch(S6945){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
                        S6945=1;
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                          ends[33]=2;
                          ;//sysj\conveyor_controller.sysj line: 67, column: 5
                          S6966=1;
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
                        S6966=1;
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
                S6950=1;
                S6950=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                  S6950=1;
                  active[33]=1;
                  ends[33]=1;
                  tdone[33]=1;
                }
                else {
                  S6945=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
                    S6945=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                      ends[33]=2;
                      ;//sysj\conveyor_controller.sysj line: 67, column: 5
                      S6966=1;
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
            S6966=1;
            S6966=2;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
            break;
          
          case 2 : 
            S6966=2;
            fillerReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 67, column: 36
            ends[33]=2;
            tdone[33]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread39003(int [] tdone, int [] ends){
        switch(S7041){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        switch(S6975){
          case 0 : 
            thread39004(tdone,ends);
            thread39005(tdone,ends);
            int biggest39006 = 0;
            if(ends[33]>=biggest39006){
              biggest39006=ends[33];
            }
            if(ends[34]>=biggest39006){
              biggest39006=ends[34];
            }
            if(biggest39006 == 1){
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            if(biggest39006 == 2){
              ends[32]=2;
              ;//sysj\conveyor_controller.sysj line: 66, column: 3
              S6975=1;
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            //FINXME code
            if(biggest39006 == 0){
              S6975=1;
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
          case 1 : 
            S6975=1;
            S6975=0;
            thread39007(tdone,ends);
            thread39008(tdone,ends);
            int biggest39009 = 0;
            if(ends[33]>=biggest39009){
              biggest39009=ends[33];
            }
            if(ends[34]>=biggest39009){
              biggest39009=ends[34];
            }
            if(biggest39009 == 1){
              active[32]=1;
              ends[32]=1;
              tdone[32]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread39001(int [] tdone, int [] ends){
        S6874=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6874=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread39000(int [] tdone, int [] ends){
        S6868=1;
    S6867=0;
    S6851=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6851=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6846=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6846=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6867=1;
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

  public void thread38998(int [] tdone, int [] ends){
        switch(S6874){
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

  public void thread38997(int [] tdone, int [] ends){
        switch(S6868){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S6867){
          case 0 : 
            switch(S6851){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                  S6851=1;
                  active[30]=1;
                  ends[30]=1;
                  tdone[30]=1;
                }
                else {
                  switch(S6846){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
                        S6846=1;
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                          ends[30]=2;
                          ;//sysj\conveyor_controller.sysj line: 67, column: 5
                          S6867=1;
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
                        S6867=1;
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
                S6851=1;
                S6851=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                  S6851=1;
                  active[30]=1;
                  ends[30]=1;
                  tdone[30]=1;
                }
                else {
                  S6846=0;
                  if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                    convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
                    S6846=1;
                    if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
                      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
                      ends[30]=2;
                      ;//sysj\conveyor_controller.sysj line: 67, column: 5
                      S6867=1;
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
            S6867=1;
            S6867=2;
            active[30]=1;
            ends[30]=1;
            tdone[30]=1;
            break;
          
          case 2 : 
            S6867=2;
            convReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 67, column: 36
            ends[30]=2;
            tdone[30]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread38996(int [] tdone, int [] ends){
        switch(S6942){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S6876){
          case 0 : 
            thread38997(tdone,ends);
            thread38998(tdone,ends);
            int biggest38999 = 0;
            if(ends[30]>=biggest38999){
              biggest38999=ends[30];
            }
            if(ends[31]>=biggest38999){
              biggest38999=ends[31];
            }
            if(biggest38999 == 1){
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            if(biggest38999 == 2){
              ends[29]=2;
              ;//sysj\conveyor_controller.sysj line: 66, column: 3
              S6876=1;
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            //FINXME code
            if(biggest38999 == 0){
              S6876=1;
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            break;
          
          case 1 : 
            S6876=1;
            S6876=0;
            thread39000(tdone,ends);
            thread39001(tdone,ends);
            int biggest39002 = 0;
            if(ends[30]>=biggest39002){
              biggest39002=ends[30];
            }
            if(ends[31]>=biggest39002){
              biggest39002=ends[31];
            }
            if(biggest39002 == 1){
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread38995(int [] tdone, int [] ends){
        switch(S7142){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        thread38996(tdone,ends);
        thread39003(tdone,ends);
        thread39010(tdone,ends);
        int biggest39017 = 0;
        if(ends[29]>=biggest39017){
          biggest39017=ends[29];
        }
        if(ends[32]>=biggest39017){
          biggest39017=ends[32];
        }
        if(ends[35]>=biggest39017){
          biggest39017=ends[35];
        }
        if(biggest39017 == 1){
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        //FINXME code
        if(biggest39017 == 0){
          S7142=0;
          active[28]=0;
          ends[28]=0;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread38993(int [] tdone, int [] ends){
        S4897=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38992(int [] tdone, int [] ends){
        S4894=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38991(int [] tdone, int [] ends){
        S4891=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38989(int [] tdone, int [] ends){
        S4897=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38988(int [] tdone, int [] ends){
        S4894=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38987(int [] tdone, int [] ends){
        S4891=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38985(int [] tdone, int [] ends){
        S4897=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38984(int [] tdone, int [] ends){
        S4894=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38983(int [] tdone, int [] ends){
        S4891=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38981(int [] tdone, int [] ends){
        switch(S4951){
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

  public void thread38980(int [] tdone, int [] ends){
        switch(S4935){
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

  public void thread38978(int [] tdone, int [] ends){
        S4951=1;
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

  public void thread38977(int [] tdone, int [] ends){
        S4935=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 246, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread38975(int [] tdone, int [] ends){
        S4951=1;
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

  public void thread38974(int [] tdone, int [] ends){
        S4935=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 246, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread38972(int [] tdone, int [] ends){
        S4951=1;
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

  public void thread38971(int [] tdone, int [] ends){
        S4935=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 246, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread38969(int [] tdone, int [] ends){
        switch(S4897){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if(cR_21.getprestatus()){//sysj\conveyor_controller.sysj line: 223, column: 17
          System.out.println("*Rotary - Capper Ready*");//sysj\conveyor_controller.sysj line: 224, column: 11
          S4897=0;
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

  public void thread38968(int [] tdone, int [] ends){
        switch(S4894){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(cvR_21.getprestatus()){//sysj\conveyor_controller.sysj line: 217, column: 17
          System.out.println("*Rotary - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 218, column: 11
          S4894=0;
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

  public void thread38967(int [] tdone, int [] ends){
        switch(S4891){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(fR_21.getprestatus()){//sysj\conveyor_controller.sysj line: 212, column: 17
          System.out.println("*Rotary - Filler Ready*");//sysj\conveyor_controller.sysj line: 213, column: 11
          S4891=0;
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

  public void thread38966(int [] tdone, int [] ends){
        switch(S6843){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S4898){
          case 0 : 
            thread38967(tdone,ends);
            thread38968(tdone,ends);
            thread38969(tdone,ends);
            int biggest38970 = 0;
            if(ends[23]>=biggest38970){
              biggest38970=ends[23];
            }
            if(ends[24]>=biggest38970){
              biggest38970=ends[24];
            }
            if(ends[25]>=biggest38970){
              biggest38970=ends[25];
            }
            if(biggest38970 == 1){
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            //FINXME code
            if(biggest38970 == 0){
              System.out.println("*Rotary - All controllers are ready*");//sysj\conveyor_controller.sysj line: 229, column: 10
              S4898=1;
              if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 232, column: 18
                S4912=0;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S4898=2;
                thread38971(tdone,ends);
                thread38972(tdone,ends);
                int biggest38973 = 0;
                if(ends[26]>=biggest38973){
                  biggest38973=ends[26];
                }
                if(ends[27]>=biggest38973){
                  biggest38973=ends[27];
                }
                if(biggest38973 == 1){
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                if(biggest38973 == 2){
                  ends[22]=2;
                  ;//sysj\conveyor_controller.sysj line: 245, column: 12
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 249, column: 16
                  S4898=3;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
              }
            }
            break;
          
          case 1 : 
            switch(S4912){
              case 0 : 
                if(!bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 234, column: 20
                  S4912=1;
                  if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 236, column: 23
                    System.out.println("*at pos5*");//sysj\conveyor_controller.sysj line: 237, column: 17
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                  else {
                    ends[22]=2;
                    ;//sysj\conveyor_controller.sysj line: 233, column: 13
                    S4898=2;
                    thread38974(tdone,ends);
                    thread38975(tdone,ends);
                    int biggest38976 = 0;
                    if(ends[26]>=biggest38976){
                      biggest38976=ends[26];
                    }
                    if(ends[27]>=biggest38976){
                      biggest38976=ends[27];
                    }
                    if(biggest38976 == 1){
                      active[22]=1;
                      ends[22]=1;
                      tdone[22]=1;
                    }
                    if(biggest38976 == 2){
                      ends[22]=2;
                      ;//sysj\conveyor_controller.sysj line: 245, column: 12
                      System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 249, column: 16
                      S4898=3;
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
                  S4898=2;
                  thread38977(tdone,ends);
                  thread38978(tdone,ends);
                  int biggest38979 = 0;
                  if(ends[26]>=biggest38979){
                    biggest38979=ends[26];
                  }
                  if(ends[27]>=biggest38979){
                    biggest38979=ends[27];
                  }
                  if(biggest38979 == 1){
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                  if(biggest38979 == 2){
                    ends[22]=2;
                    ;//sysj\conveyor_controller.sysj line: 245, column: 12
                    System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 249, column: 16
                    S4898=3;
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread38980(tdone,ends);
            thread38981(tdone,ends);
            int biggest38982 = 0;
            if(ends[26]>=biggest38982){
              biggest38982=ends[26];
            }
            if(ends[27]>=biggest38982){
              biggest38982=ends[27];
            }
            if(biggest38982 == 1){
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            if(biggest38982 == 2){
              ends[22]=2;
              ;//sysj\conveyor_controller.sysj line: 245, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 249, column: 16
              S4898=3;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            //FINXME code
            if(biggest38982 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 249, column: 16
              S4898=3;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_controller.sysj line: 250, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\conveyor_controller.sysj line: 251, column: 16
              S4898=4;
              S5054=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 252, column: 13
                rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 252, column: 13
                S5054=1;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S5049=0;
                if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 252, column: 13
                  rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 252, column: 13
                  S5049=1;
                  if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 252, column: 13
                    rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 252, column: 13
                    ends[22]=2;
                    ;//sysj\conveyor_controller.sysj line: 252, column: 13
                    S4898=5;
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
            switch(S5054){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 252, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 252, column: 13
                  S5054=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  switch(S5049){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 252, column: 13
                        rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 252, column: 13
                        S5049=1;
                        if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 252, column: 13
                          rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 252, column: 13
                          ends[22]=2;
                          ;//sysj\conveyor_controller.sysj line: 252, column: 13
                          S4898=5;
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
                        S4898=5;
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
                S5054=1;
                S5054=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 252, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 252, column: 13
                  S5054=1;
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  S5049=0;
                  if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 252, column: 13
                    rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 252, column: 13
                    S5049=1;
                    if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 252, column: 13
                      rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 252, column: 13
                      ends[22]=2;
                      ;//sysj\conveyor_controller.sysj line: 252, column: 13
                      S4898=5;
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
            S4898=5;
            i_thread_22 = 0;//sysj\conveyor_controller.sysj line: 255, column: 10
            S4898=6;
            i_thread_22 = i_thread_22 + 1;//sysj\conveyor_controller.sysj line: 258, column: 12
            if(i_thread_22 > 12){//sysj\conveyor_controller.sysj line: 259, column: 15
              ends[22]=2;
              ;//sysj\conveyor_controller.sysj line: 256, column: 10
              S4898=7;
              __start_thread_22 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 208, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_22 >= (4) * 1000){//sysj\conveyor_controller.sysj line: 208, column: 7
                ends[22]=2;
                ;//sysj\conveyor_controller.sysj line: 208, column: 7
                S4898=0;
                thread38983(tdone,ends);
                thread38984(tdone,ends);
                thread38985(tdone,ends);
                int biggest38986 = 0;
                if(ends[23]>=biggest38986){
                  biggest38986=ends[23];
                }
                if(ends[24]>=biggest38986){
                  biggest38986=ends[24];
                }
                if(ends[25]>=biggest38986){
                  biggest38986=ends[25];
                }
                if(biggest38986 == 1){
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
              S4898=7;
              __start_thread_22 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 208, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_22 >= (4) * 1000){//sysj\conveyor_controller.sysj line: 208, column: 7
                ends[22]=2;
                ;//sysj\conveyor_controller.sysj line: 208, column: 7
                S4898=0;
                thread38987(tdone,ends);
                thread38988(tdone,ends);
                thread38989(tdone,ends);
                int biggest38990 = 0;
                if(ends[23]>=biggest38990){
                  biggest38990=ends[23];
                }
                if(ends[24]>=biggest38990){
                  biggest38990=ends[24];
                }
                if(ends[25]>=biggest38990){
                  biggest38990=ends[25];
                }
                if(biggest38990 == 1){
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
              S4898=0;
              thread38991(tdone,ends);
              thread38992(tdone,ends);
              thread38993(tdone,ends);
              int biggest38994 = 0;
              if(ends[23]>=biggest38994){
                biggest38994=ends[23];
              }
              if(ends[24]>=biggest38994){
                biggest38994=ends[24];
              }
              if(ends[25]>=biggest38994){
                biggest38994=ends[25];
              }
              if(biggest38994 == 1){
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

  public void thread38962(int [] tdone, int [] ends){
        S7356=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38961(int [] tdone, int [] ends){
        S7353=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38960(int [] tdone, int [] ends){
        S7386=1;
    S7360=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38961(tdone,ends);
      thread38962(tdone,ends);
      int biggest38963 = 0;
      if(ends[46]>=biggest38963){
        biggest38963=ends[46];
      }
      if(ends[47]>=biggest38963){
        biggest38963=ends[47];
      }
      if(biggest38963 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7360=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38958(int [] tdone, int [] ends){
        S7318=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38957(int [] tdone, int [] ends){
        S7315=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38956(int [] tdone, int [] ends){
        S7348=1;
    S7322=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38957(tdone,ends);
      thread38958(tdone,ends);
      int biggest38959 = 0;
      if(ends[43]>=biggest38959){
        biggest38959=ends[43];
      }
      if(ends[44]>=biggest38959){
        biggest38959=ends[44];
      }
      if(biggest38959 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S7322=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38955(int [] tdone, int [] ends){
        S7388=1;
    thread38956(tdone,ends);
    thread38960(tdone,ends);
    int biggest38964 = 0;
    if(ends[42]>=biggest38964){
      biggest38964=ends[42];
    }
    if(ends[45]>=biggest38964){
      biggest38964=ends[45];
    }
    if(biggest38964 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38953(int [] tdone, int [] ends){
        S7308=1;
    S7252=0;
    S7232=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S7232=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7227=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S7227=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S7252=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S7252=1;
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

  public void thread38952(int [] tdone, int [] ends){
        S7225=1;
    S7169=0;
    S7149=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S7149=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7144=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S7144=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S7169=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S7169=1;
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

  public void thread38951(int [] tdone, int [] ends){
        S7310=1;
    thread38952(tdone,ends);
    thread38953(tdone,ends);
    int biggest38954 = 0;
    if(ends[39]>=biggest38954){
      biggest38954=ends[39];
    }
    if(ends[40]>=biggest38954){
      biggest38954=ends[40];
    }
    if(biggest38954 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38948(int [] tdone, int [] ends){
        S7072=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7072=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38947(int [] tdone, int [] ends){
        S7066=1;
    S7065=0;
    S7049=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S7049=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7044=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S7044=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S7065=1;
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

  public void thread38946(int [] tdone, int [] ends){
        S7140=1;
    S7074=0;
    thread38947(tdone,ends);
    thread38948(tdone,ends);
    int biggest38949 = 0;
    if(ends[36]>=biggest38949){
      biggest38949=ends[36];
    }
    if(ends[37]>=biggest38949){
      biggest38949=ends[37];
    }
    if(biggest38949 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38944(int [] tdone, int [] ends){
        S6973=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6973=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38943(int [] tdone, int [] ends){
        S6967=1;
    S6966=0;
    S6950=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6950=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6945=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6945=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6966=1;
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

  public void thread38942(int [] tdone, int [] ends){
        S7041=1;
    S6975=0;
    thread38943(tdone,ends);
    thread38944(tdone,ends);
    int biggest38945 = 0;
    if(ends[33]>=biggest38945){
      biggest38945=ends[33];
    }
    if(ends[34]>=biggest38945){
      biggest38945=ends[34];
    }
    if(biggest38945 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38940(int [] tdone, int [] ends){
        S6874=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6874=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38939(int [] tdone, int [] ends){
        S6868=1;
    S6867=0;
    S6851=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6851=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6846=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6846=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6867=1;
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

  public void thread38938(int [] tdone, int [] ends){
        S6942=1;
    S6876=0;
    thread38939(tdone,ends);
    thread38940(tdone,ends);
    int biggest38941 = 0;
    if(ends[30]>=biggest38941){
      biggest38941=ends[30];
    }
    if(ends[31]>=biggest38941){
      biggest38941=ends[31];
    }
    if(biggest38941 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38937(int [] tdone, int [] ends){
        S7142=1;
    thread38938(tdone,ends);
    thread38942(tdone,ends);
    thread38946(tdone,ends);
    int biggest38950 = 0;
    if(ends[29]>=biggest38950){
      biggest38950=ends[29];
    }
    if(ends[32]>=biggest38950){
      biggest38950=ends[32];
    }
    if(ends[35]>=biggest38950){
      biggest38950=ends[35];
    }
    if(biggest38950 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38950 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38950 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38935(int [] tdone, int [] ends){
        S4897=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38934(int [] tdone, int [] ends){
        S4894=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38933(int [] tdone, int [] ends){
        S4891=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38932(int [] tdone, int [] ends){
        S6843=1;
    S4898=0;
    thread38933(tdone,ends);
    thread38934(tdone,ends);
    thread38935(tdone,ends);
    int biggest38936 = 0;
    if(ends[23]>=biggest38936){
      biggest38936=ends[23];
    }
    if(ends[24]>=biggest38936){
      biggest38936=ends[24];
    }
    if(ends[25]>=biggest38936){
      biggest38936=ends[25];
    }
    if(biggest38936 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38928(int [] tdone, int [] ends){
        S7356=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38927(int [] tdone, int [] ends){
        S7353=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38926(int [] tdone, int [] ends){
        S7386=1;
    S7360=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38927(tdone,ends);
      thread38928(tdone,ends);
      int biggest38929 = 0;
      if(ends[46]>=biggest38929){
        biggest38929=ends[46];
      }
      if(ends[47]>=biggest38929){
        biggest38929=ends[47];
      }
      if(biggest38929 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7360=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38924(int [] tdone, int [] ends){
        S7318=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38923(int [] tdone, int [] ends){
        S7315=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38922(int [] tdone, int [] ends){
        S7348=1;
    S7322=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38923(tdone,ends);
      thread38924(tdone,ends);
      int biggest38925 = 0;
      if(ends[43]>=biggest38925){
        biggest38925=ends[43];
      }
      if(ends[44]>=biggest38925){
        biggest38925=ends[44];
      }
      if(biggest38925 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S7322=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38921(int [] tdone, int [] ends){
        S7388=1;
    thread38922(tdone,ends);
    thread38926(tdone,ends);
    int biggest38930 = 0;
    if(ends[42]>=biggest38930){
      biggest38930=ends[42];
    }
    if(ends[45]>=biggest38930){
      biggest38930=ends[45];
    }
    if(biggest38930 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38919(int [] tdone, int [] ends){
        S7308=1;
    S7252=0;
    S7232=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S7232=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7227=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S7227=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S7252=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S7252=1;
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

  public void thread38918(int [] tdone, int [] ends){
        S7225=1;
    S7169=0;
    S7149=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S7149=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7144=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S7144=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S7169=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S7169=1;
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

  public void thread38917(int [] tdone, int [] ends){
        S7310=1;
    thread38918(tdone,ends);
    thread38919(tdone,ends);
    int biggest38920 = 0;
    if(ends[39]>=biggest38920){
      biggest38920=ends[39];
    }
    if(ends[40]>=biggest38920){
      biggest38920=ends[40];
    }
    if(biggest38920 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38914(int [] tdone, int [] ends){
        S7072=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7072=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38913(int [] tdone, int [] ends){
        S7066=1;
    S7065=0;
    S7049=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S7049=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7044=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S7044=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S7065=1;
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

  public void thread38912(int [] tdone, int [] ends){
        S7140=1;
    S7074=0;
    thread38913(tdone,ends);
    thread38914(tdone,ends);
    int biggest38915 = 0;
    if(ends[36]>=biggest38915){
      biggest38915=ends[36];
    }
    if(ends[37]>=biggest38915){
      biggest38915=ends[37];
    }
    if(biggest38915 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38910(int [] tdone, int [] ends){
        S6973=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6973=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38909(int [] tdone, int [] ends){
        S6967=1;
    S6966=0;
    S6950=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6950=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6945=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6945=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6966=1;
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

  public void thread38908(int [] tdone, int [] ends){
        S7041=1;
    S6975=0;
    thread38909(tdone,ends);
    thread38910(tdone,ends);
    int biggest38911 = 0;
    if(ends[33]>=biggest38911){
      biggest38911=ends[33];
    }
    if(ends[34]>=biggest38911){
      biggest38911=ends[34];
    }
    if(biggest38911 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38906(int [] tdone, int [] ends){
        S6874=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6874=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38905(int [] tdone, int [] ends){
        S6868=1;
    S6867=0;
    S6851=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6851=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6846=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6846=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6867=1;
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

  public void thread38904(int [] tdone, int [] ends){
        S6942=1;
    S6876=0;
    thread38905(tdone,ends);
    thread38906(tdone,ends);
    int biggest38907 = 0;
    if(ends[30]>=biggest38907){
      biggest38907=ends[30];
    }
    if(ends[31]>=biggest38907){
      biggest38907=ends[31];
    }
    if(biggest38907 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38903(int [] tdone, int [] ends){
        S7142=1;
    thread38904(tdone,ends);
    thread38908(tdone,ends);
    thread38912(tdone,ends);
    int biggest38916 = 0;
    if(ends[29]>=biggest38916){
      biggest38916=ends[29];
    }
    if(ends[32]>=biggest38916){
      biggest38916=ends[32];
    }
    if(ends[35]>=biggest38916){
      biggest38916=ends[35];
    }
    if(biggest38916 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38916 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38916 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38901(int [] tdone, int [] ends){
        S4897=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38900(int [] tdone, int [] ends){
        S4894=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38899(int [] tdone, int [] ends){
        S4891=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38898(int [] tdone, int [] ends){
        S6843=1;
    S4898=0;
    thread38899(tdone,ends);
    thread38900(tdone,ends);
    thread38901(tdone,ends);
    int biggest38902 = 0;
    if(ends[23]>=biggest38902){
      biggest38902=ends[23];
    }
    if(ends[24]>=biggest38902){
      biggest38902=ends[24];
    }
    if(ends[25]>=biggest38902){
      biggest38902=ends[25];
    }
    if(biggest38902 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38894(int [] tdone, int [] ends){
        S7356=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38893(int [] tdone, int [] ends){
        S7353=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38892(int [] tdone, int [] ends){
        S7386=1;
    S7360=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38893(tdone,ends);
      thread38894(tdone,ends);
      int biggest38895 = 0;
      if(ends[46]>=biggest38895){
        biggest38895=ends[46];
      }
      if(ends[47]>=biggest38895){
        biggest38895=ends[47];
      }
      if(biggest38895 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7360=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38890(int [] tdone, int [] ends){
        S7318=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38889(int [] tdone, int [] ends){
        S7315=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38888(int [] tdone, int [] ends){
        S7348=1;
    S7322=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38889(tdone,ends);
      thread38890(tdone,ends);
      int biggest38891 = 0;
      if(ends[43]>=biggest38891){
        biggest38891=ends[43];
      }
      if(ends[44]>=biggest38891){
        biggest38891=ends[44];
      }
      if(biggest38891 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S7322=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38887(int [] tdone, int [] ends){
        S7388=1;
    thread38888(tdone,ends);
    thread38892(tdone,ends);
    int biggest38896 = 0;
    if(ends[42]>=biggest38896){
      biggest38896=ends[42];
    }
    if(ends[45]>=biggest38896){
      biggest38896=ends[45];
    }
    if(biggest38896 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38885(int [] tdone, int [] ends){
        S7308=1;
    S7252=0;
    S7232=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S7232=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7227=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S7227=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S7252=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S7252=1;
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

  public void thread38884(int [] tdone, int [] ends){
        S7225=1;
    S7169=0;
    S7149=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S7149=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7144=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S7144=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S7169=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S7169=1;
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

  public void thread38883(int [] tdone, int [] ends){
        S7310=1;
    thread38884(tdone,ends);
    thread38885(tdone,ends);
    int biggest38886 = 0;
    if(ends[39]>=biggest38886){
      biggest38886=ends[39];
    }
    if(ends[40]>=biggest38886){
      biggest38886=ends[40];
    }
    if(biggest38886 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38880(int [] tdone, int [] ends){
        S7072=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7072=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38879(int [] tdone, int [] ends){
        S7066=1;
    S7065=0;
    S7049=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S7049=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7044=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S7044=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S7065=1;
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

  public void thread38878(int [] tdone, int [] ends){
        S7140=1;
    S7074=0;
    thread38879(tdone,ends);
    thread38880(tdone,ends);
    int biggest38881 = 0;
    if(ends[36]>=biggest38881){
      biggest38881=ends[36];
    }
    if(ends[37]>=biggest38881){
      biggest38881=ends[37];
    }
    if(biggest38881 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38876(int [] tdone, int [] ends){
        S6973=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6973=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38875(int [] tdone, int [] ends){
        S6967=1;
    S6966=0;
    S6950=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6950=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6945=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6945=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6966=1;
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

  public void thread38874(int [] tdone, int [] ends){
        S7041=1;
    S6975=0;
    thread38875(tdone,ends);
    thread38876(tdone,ends);
    int biggest38877 = 0;
    if(ends[33]>=biggest38877){
      biggest38877=ends[33];
    }
    if(ends[34]>=biggest38877){
      biggest38877=ends[34];
    }
    if(biggest38877 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38872(int [] tdone, int [] ends){
        S6874=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6874=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38871(int [] tdone, int [] ends){
        S6868=1;
    S6867=0;
    S6851=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6851=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6846=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6846=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6867=1;
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

  public void thread38870(int [] tdone, int [] ends){
        S6942=1;
    S6876=0;
    thread38871(tdone,ends);
    thread38872(tdone,ends);
    int biggest38873 = 0;
    if(ends[30]>=biggest38873){
      biggest38873=ends[30];
    }
    if(ends[31]>=biggest38873){
      biggest38873=ends[31];
    }
    if(biggest38873 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38869(int [] tdone, int [] ends){
        S7142=1;
    thread38870(tdone,ends);
    thread38874(tdone,ends);
    thread38878(tdone,ends);
    int biggest38882 = 0;
    if(ends[29]>=biggest38882){
      biggest38882=ends[29];
    }
    if(ends[32]>=biggest38882){
      biggest38882=ends[32];
    }
    if(ends[35]>=biggest38882){
      biggest38882=ends[35];
    }
    if(biggest38882 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38882 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38882 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38867(int [] tdone, int [] ends){
        S4897=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38866(int [] tdone, int [] ends){
        S4894=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38865(int [] tdone, int [] ends){
        S4891=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38864(int [] tdone, int [] ends){
        S6843=1;
    S4898=0;
    thread38865(tdone,ends);
    thread38866(tdone,ends);
    thread38867(tdone,ends);
    int biggest38868 = 0;
    if(ends[23]>=biggest38868){
      biggest38868=ends[23];
    }
    if(ends[24]>=biggest38868){
      biggest38868=ends[24];
    }
    if(ends[25]>=biggest38868){
      biggest38868=ends[25];
    }
    if(biggest38868 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38860(int [] tdone, int [] ends){
        S7356=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38859(int [] tdone, int [] ends){
        S7353=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38858(int [] tdone, int [] ends){
        S7386=1;
    S7360=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38859(tdone,ends);
      thread38860(tdone,ends);
      int biggest38861 = 0;
      if(ends[46]>=biggest38861){
        biggest38861=ends[46];
      }
      if(ends[47]>=biggest38861){
        biggest38861=ends[47];
      }
      if(biggest38861 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7360=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38856(int [] tdone, int [] ends){
        S7318=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38855(int [] tdone, int [] ends){
        S7315=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38854(int [] tdone, int [] ends){
        S7348=1;
    S7322=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38855(tdone,ends);
      thread38856(tdone,ends);
      int biggest38857 = 0;
      if(ends[43]>=biggest38857){
        biggest38857=ends[43];
      }
      if(ends[44]>=biggest38857){
        biggest38857=ends[44];
      }
      if(biggest38857 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S7322=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38853(int [] tdone, int [] ends){
        S7388=1;
    thread38854(tdone,ends);
    thread38858(tdone,ends);
    int biggest38862 = 0;
    if(ends[42]>=biggest38862){
      biggest38862=ends[42];
    }
    if(ends[45]>=biggest38862){
      biggest38862=ends[45];
    }
    if(biggest38862 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38851(int [] tdone, int [] ends){
        S7308=1;
    S7252=0;
    S7232=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S7232=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7227=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S7227=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S7252=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S7252=1;
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

  public void thread38850(int [] tdone, int [] ends){
        S7225=1;
    S7169=0;
    S7149=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S7149=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7144=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S7144=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S7169=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S7169=1;
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

  public void thread38849(int [] tdone, int [] ends){
        S7310=1;
    thread38850(tdone,ends);
    thread38851(tdone,ends);
    int biggest38852 = 0;
    if(ends[39]>=biggest38852){
      biggest38852=ends[39];
    }
    if(ends[40]>=biggest38852){
      biggest38852=ends[40];
    }
    if(biggest38852 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38846(int [] tdone, int [] ends){
        S7072=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7072=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38845(int [] tdone, int [] ends){
        S7066=1;
    S7065=0;
    S7049=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S7049=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7044=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S7044=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S7065=1;
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

  public void thread38844(int [] tdone, int [] ends){
        S7140=1;
    S7074=0;
    thread38845(tdone,ends);
    thread38846(tdone,ends);
    int biggest38847 = 0;
    if(ends[36]>=biggest38847){
      biggest38847=ends[36];
    }
    if(ends[37]>=biggest38847){
      biggest38847=ends[37];
    }
    if(biggest38847 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38842(int [] tdone, int [] ends){
        S6973=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6973=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38841(int [] tdone, int [] ends){
        S6967=1;
    S6966=0;
    S6950=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6950=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6945=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6945=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6966=1;
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

  public void thread38840(int [] tdone, int [] ends){
        S7041=1;
    S6975=0;
    thread38841(tdone,ends);
    thread38842(tdone,ends);
    int biggest38843 = 0;
    if(ends[33]>=biggest38843){
      biggest38843=ends[33];
    }
    if(ends[34]>=biggest38843){
      biggest38843=ends[34];
    }
    if(biggest38843 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38838(int [] tdone, int [] ends){
        S6874=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6874=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38837(int [] tdone, int [] ends){
        S6868=1;
    S6867=0;
    S6851=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6851=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6846=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6846=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6867=1;
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

  public void thread38836(int [] tdone, int [] ends){
        S6942=1;
    S6876=0;
    thread38837(tdone,ends);
    thread38838(tdone,ends);
    int biggest38839 = 0;
    if(ends[30]>=biggest38839){
      biggest38839=ends[30];
    }
    if(ends[31]>=biggest38839){
      biggest38839=ends[31];
    }
    if(biggest38839 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38835(int [] tdone, int [] ends){
        S7142=1;
    thread38836(tdone,ends);
    thread38840(tdone,ends);
    thread38844(tdone,ends);
    int biggest38848 = 0;
    if(ends[29]>=biggest38848){
      biggest38848=ends[29];
    }
    if(ends[32]>=biggest38848){
      biggest38848=ends[32];
    }
    if(ends[35]>=biggest38848){
      biggest38848=ends[35];
    }
    if(biggest38848 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38848 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38848 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38833(int [] tdone, int [] ends){
        S4897=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38832(int [] tdone, int [] ends){
        S4894=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38831(int [] tdone, int [] ends){
        S4891=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38830(int [] tdone, int [] ends){
        S6843=1;
    S4898=0;
    thread38831(tdone,ends);
    thread38832(tdone,ends);
    thread38833(tdone,ends);
    int biggest38834 = 0;
    if(ends[23]>=biggest38834){
      biggest38834=ends[23];
    }
    if(ends[24]>=biggest38834){
      biggest38834=ends[24];
    }
    if(ends[25]>=biggest38834){
      biggest38834=ends[25];
    }
    if(biggest38834 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38826(int [] tdone, int [] ends){
        S7356=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38825(int [] tdone, int [] ends){
        S7353=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38824(int [] tdone, int [] ends){
        S7386=1;
    S7360=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38825(tdone,ends);
      thread38826(tdone,ends);
      int biggest38827 = 0;
      if(ends[46]>=biggest38827){
        biggest38827=ends[46];
      }
      if(ends[47]>=biggest38827){
        biggest38827=ends[47];
      }
      if(biggest38827 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7360=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38822(int [] tdone, int [] ends){
        S7318=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38821(int [] tdone, int [] ends){
        S7315=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38820(int [] tdone, int [] ends){
        S7348=1;
    S7322=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38821(tdone,ends);
      thread38822(tdone,ends);
      int biggest38823 = 0;
      if(ends[43]>=biggest38823){
        biggest38823=ends[43];
      }
      if(ends[44]>=biggest38823){
        biggest38823=ends[44];
      }
      if(biggest38823 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S7322=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38819(int [] tdone, int [] ends){
        S7388=1;
    thread38820(tdone,ends);
    thread38824(tdone,ends);
    int biggest38828 = 0;
    if(ends[42]>=biggest38828){
      biggest38828=ends[42];
    }
    if(ends[45]>=biggest38828){
      biggest38828=ends[45];
    }
    if(biggest38828 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38817(int [] tdone, int [] ends){
        S7308=1;
    S7252=0;
    S7232=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S7232=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7227=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S7227=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S7252=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S7252=1;
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

  public void thread38816(int [] tdone, int [] ends){
        S7225=1;
    S7169=0;
    S7149=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S7149=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7144=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S7144=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S7169=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S7169=1;
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

  public void thread38815(int [] tdone, int [] ends){
        S7310=1;
    thread38816(tdone,ends);
    thread38817(tdone,ends);
    int biggest38818 = 0;
    if(ends[39]>=biggest38818){
      biggest38818=ends[39];
    }
    if(ends[40]>=biggest38818){
      biggest38818=ends[40];
    }
    if(biggest38818 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38812(int [] tdone, int [] ends){
        S7072=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7072=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38811(int [] tdone, int [] ends){
        S7066=1;
    S7065=0;
    S7049=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S7049=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7044=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S7044=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S7065=1;
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

  public void thread38810(int [] tdone, int [] ends){
        S7140=1;
    S7074=0;
    thread38811(tdone,ends);
    thread38812(tdone,ends);
    int biggest38813 = 0;
    if(ends[36]>=biggest38813){
      biggest38813=ends[36];
    }
    if(ends[37]>=biggest38813){
      biggest38813=ends[37];
    }
    if(biggest38813 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38808(int [] tdone, int [] ends){
        S6973=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6973=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38807(int [] tdone, int [] ends){
        S6967=1;
    S6966=0;
    S6950=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6950=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6945=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6945=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6966=1;
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

  public void thread38806(int [] tdone, int [] ends){
        S7041=1;
    S6975=0;
    thread38807(tdone,ends);
    thread38808(tdone,ends);
    int biggest38809 = 0;
    if(ends[33]>=biggest38809){
      biggest38809=ends[33];
    }
    if(ends[34]>=biggest38809){
      biggest38809=ends[34];
    }
    if(biggest38809 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38804(int [] tdone, int [] ends){
        S6874=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6874=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38803(int [] tdone, int [] ends){
        S6868=1;
    S6867=0;
    S6851=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6851=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6846=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6846=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6867=1;
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

  public void thread38802(int [] tdone, int [] ends){
        S6942=1;
    S6876=0;
    thread38803(tdone,ends);
    thread38804(tdone,ends);
    int biggest38805 = 0;
    if(ends[30]>=biggest38805){
      biggest38805=ends[30];
    }
    if(ends[31]>=biggest38805){
      biggest38805=ends[31];
    }
    if(biggest38805 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38801(int [] tdone, int [] ends){
        S7142=1;
    thread38802(tdone,ends);
    thread38806(tdone,ends);
    thread38810(tdone,ends);
    int biggest38814 = 0;
    if(ends[29]>=biggest38814){
      biggest38814=ends[29];
    }
    if(ends[32]>=biggest38814){
      biggest38814=ends[32];
    }
    if(ends[35]>=biggest38814){
      biggest38814=ends[35];
    }
    if(biggest38814 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38814 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38814 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38799(int [] tdone, int [] ends){
        S4897=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38798(int [] tdone, int [] ends){
        S4894=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38797(int [] tdone, int [] ends){
        S4891=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38796(int [] tdone, int [] ends){
        S6843=1;
    S4898=0;
    thread38797(tdone,ends);
    thread38798(tdone,ends);
    thread38799(tdone,ends);
    int biggest38800 = 0;
    if(ends[23]>=biggest38800){
      biggest38800=ends[23];
    }
    if(ends[24]>=biggest38800){
      biggest38800=ends[24];
    }
    if(ends[25]>=biggest38800){
      biggest38800=ends[25];
    }
    if(biggest38800 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38792(int [] tdone, int [] ends){
        S7356=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38791(int [] tdone, int [] ends){
        S7353=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38790(int [] tdone, int [] ends){
        S7386=1;
    S7360=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38791(tdone,ends);
      thread38792(tdone,ends);
      int biggest38793 = 0;
      if(ends[46]>=biggest38793){
        biggest38793=ends[46];
      }
      if(ends[47]>=biggest38793){
        biggest38793=ends[47];
      }
      if(biggest38793 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7360=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38788(int [] tdone, int [] ends){
        S7318=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38787(int [] tdone, int [] ends){
        S7315=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38786(int [] tdone, int [] ends){
        S7348=1;
    S7322=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38787(tdone,ends);
      thread38788(tdone,ends);
      int biggest38789 = 0;
      if(ends[43]>=biggest38789){
        biggest38789=ends[43];
      }
      if(ends[44]>=biggest38789){
        biggest38789=ends[44];
      }
      if(biggest38789 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S7322=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38785(int [] tdone, int [] ends){
        S7388=1;
    thread38786(tdone,ends);
    thread38790(tdone,ends);
    int biggest38794 = 0;
    if(ends[42]>=biggest38794){
      biggest38794=ends[42];
    }
    if(ends[45]>=biggest38794){
      biggest38794=ends[45];
    }
    if(biggest38794 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38783(int [] tdone, int [] ends){
        S7308=1;
    S7252=0;
    S7232=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S7232=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7227=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S7227=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S7252=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S7252=1;
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

  public void thread38782(int [] tdone, int [] ends){
        S7225=1;
    S7169=0;
    S7149=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S7149=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7144=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S7144=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S7169=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S7169=1;
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

  public void thread38781(int [] tdone, int [] ends){
        S7310=1;
    thread38782(tdone,ends);
    thread38783(tdone,ends);
    int biggest38784 = 0;
    if(ends[39]>=biggest38784){
      biggest38784=ends[39];
    }
    if(ends[40]>=biggest38784){
      biggest38784=ends[40];
    }
    if(biggest38784 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38778(int [] tdone, int [] ends){
        S7072=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7072=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38777(int [] tdone, int [] ends){
        S7066=1;
    S7065=0;
    S7049=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S7049=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7044=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S7044=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S7065=1;
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

  public void thread38776(int [] tdone, int [] ends){
        S7140=1;
    S7074=0;
    thread38777(tdone,ends);
    thread38778(tdone,ends);
    int biggest38779 = 0;
    if(ends[36]>=biggest38779){
      biggest38779=ends[36];
    }
    if(ends[37]>=biggest38779){
      biggest38779=ends[37];
    }
    if(biggest38779 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38774(int [] tdone, int [] ends){
        S6973=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6973=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38773(int [] tdone, int [] ends){
        S6967=1;
    S6966=0;
    S6950=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6950=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6945=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6945=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6966=1;
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

  public void thread38772(int [] tdone, int [] ends){
        S7041=1;
    S6975=0;
    thread38773(tdone,ends);
    thread38774(tdone,ends);
    int biggest38775 = 0;
    if(ends[33]>=biggest38775){
      biggest38775=ends[33];
    }
    if(ends[34]>=biggest38775){
      biggest38775=ends[34];
    }
    if(biggest38775 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38770(int [] tdone, int [] ends){
        S6874=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6874=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38769(int [] tdone, int [] ends){
        S6868=1;
    S6867=0;
    S6851=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6851=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6846=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6846=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6867=1;
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

  public void thread38768(int [] tdone, int [] ends){
        S6942=1;
    S6876=0;
    thread38769(tdone,ends);
    thread38770(tdone,ends);
    int biggest38771 = 0;
    if(ends[30]>=biggest38771){
      biggest38771=ends[30];
    }
    if(ends[31]>=biggest38771){
      biggest38771=ends[31];
    }
    if(biggest38771 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38767(int [] tdone, int [] ends){
        S7142=1;
    thread38768(tdone,ends);
    thread38772(tdone,ends);
    thread38776(tdone,ends);
    int biggest38780 = 0;
    if(ends[29]>=biggest38780){
      biggest38780=ends[29];
    }
    if(ends[32]>=biggest38780){
      biggest38780=ends[32];
    }
    if(ends[35]>=biggest38780){
      biggest38780=ends[35];
    }
    if(biggest38780 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38780 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38780 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38765(int [] tdone, int [] ends){
        S4897=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38764(int [] tdone, int [] ends){
        S4894=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38763(int [] tdone, int [] ends){
        S4891=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38762(int [] tdone, int [] ends){
        S6843=1;
    S4898=0;
    thread38763(tdone,ends);
    thread38764(tdone,ends);
    thread38765(tdone,ends);
    int biggest38766 = 0;
    if(ends[23]>=biggest38766){
      biggest38766=ends[23];
    }
    if(ends[24]>=biggest38766){
      biggest38766=ends[24];
    }
    if(ends[25]>=biggest38766){
      biggest38766=ends[25];
    }
    if(biggest38766 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38758(int [] tdone, int [] ends){
        S7356=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38757(int [] tdone, int [] ends){
        S7353=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38756(int [] tdone, int [] ends){
        S7386=1;
    S7360=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38757(tdone,ends);
      thread38758(tdone,ends);
      int biggest38759 = 0;
      if(ends[46]>=biggest38759){
        biggest38759=ends[46];
      }
      if(ends[47]>=biggest38759){
        biggest38759=ends[47];
      }
      if(biggest38759 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7360=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38754(int [] tdone, int [] ends){
        S7318=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38753(int [] tdone, int [] ends){
        S7315=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38752(int [] tdone, int [] ends){
        S7348=1;
    S7322=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38753(tdone,ends);
      thread38754(tdone,ends);
      int biggest38755 = 0;
      if(ends[43]>=biggest38755){
        biggest38755=ends[43];
      }
      if(ends[44]>=biggest38755){
        biggest38755=ends[44];
      }
      if(biggest38755 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S7322=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38751(int [] tdone, int [] ends){
        S7388=1;
    thread38752(tdone,ends);
    thread38756(tdone,ends);
    int biggest38760 = 0;
    if(ends[42]>=biggest38760){
      biggest38760=ends[42];
    }
    if(ends[45]>=biggest38760){
      biggest38760=ends[45];
    }
    if(biggest38760 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38749(int [] tdone, int [] ends){
        S7308=1;
    S7252=0;
    S7232=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S7232=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7227=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S7227=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S7252=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S7252=1;
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

  public void thread38748(int [] tdone, int [] ends){
        S7225=1;
    S7169=0;
    S7149=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S7149=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7144=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S7144=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S7169=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S7169=1;
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

  public void thread38747(int [] tdone, int [] ends){
        S7310=1;
    thread38748(tdone,ends);
    thread38749(tdone,ends);
    int biggest38750 = 0;
    if(ends[39]>=biggest38750){
      biggest38750=ends[39];
    }
    if(ends[40]>=biggest38750){
      biggest38750=ends[40];
    }
    if(biggest38750 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38744(int [] tdone, int [] ends){
        S7072=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7072=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38743(int [] tdone, int [] ends){
        S7066=1;
    S7065=0;
    S7049=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S7049=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7044=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S7044=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S7065=1;
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

  public void thread38742(int [] tdone, int [] ends){
        S7140=1;
    S7074=0;
    thread38743(tdone,ends);
    thread38744(tdone,ends);
    int biggest38745 = 0;
    if(ends[36]>=biggest38745){
      biggest38745=ends[36];
    }
    if(ends[37]>=biggest38745){
      biggest38745=ends[37];
    }
    if(biggest38745 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38740(int [] tdone, int [] ends){
        S6973=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6973=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38739(int [] tdone, int [] ends){
        S6967=1;
    S6966=0;
    S6950=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6950=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6945=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6945=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6966=1;
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

  public void thread38738(int [] tdone, int [] ends){
        S7041=1;
    S6975=0;
    thread38739(tdone,ends);
    thread38740(tdone,ends);
    int biggest38741 = 0;
    if(ends[33]>=biggest38741){
      biggest38741=ends[33];
    }
    if(ends[34]>=biggest38741){
      biggest38741=ends[34];
    }
    if(biggest38741 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38736(int [] tdone, int [] ends){
        S6874=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6874=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38735(int [] tdone, int [] ends){
        S6868=1;
    S6867=0;
    S6851=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6851=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6846=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6846=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6867=1;
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

  public void thread38734(int [] tdone, int [] ends){
        S6942=1;
    S6876=0;
    thread38735(tdone,ends);
    thread38736(tdone,ends);
    int biggest38737 = 0;
    if(ends[30]>=biggest38737){
      biggest38737=ends[30];
    }
    if(ends[31]>=biggest38737){
      biggest38737=ends[31];
    }
    if(biggest38737 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38733(int [] tdone, int [] ends){
        S7142=1;
    thread38734(tdone,ends);
    thread38738(tdone,ends);
    thread38742(tdone,ends);
    int biggest38746 = 0;
    if(ends[29]>=biggest38746){
      biggest38746=ends[29];
    }
    if(ends[32]>=biggest38746){
      biggest38746=ends[32];
    }
    if(ends[35]>=biggest38746){
      biggest38746=ends[35];
    }
    if(biggest38746 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38746 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38746 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38731(int [] tdone, int [] ends){
        S4897=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38730(int [] tdone, int [] ends){
        S4894=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38729(int [] tdone, int [] ends){
        S4891=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38728(int [] tdone, int [] ends){
        S6843=1;
    S4898=0;
    thread38729(tdone,ends);
    thread38730(tdone,ends);
    thread38731(tdone,ends);
    int biggest38732 = 0;
    if(ends[23]>=biggest38732){
      biggest38732=ends[23];
    }
    if(ends[24]>=biggest38732){
      biggest38732=ends[24];
    }
    if(ends[25]>=biggest38732){
      biggest38732=ends[25];
    }
    if(biggest38732 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38724(int [] tdone, int [] ends){
        S7356=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38723(int [] tdone, int [] ends){
        S7353=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38722(int [] tdone, int [] ends){
        S7386=1;
    S7360=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38723(tdone,ends);
      thread38724(tdone,ends);
      int biggest38725 = 0;
      if(ends[46]>=biggest38725){
        biggest38725=ends[46];
      }
      if(ends[47]>=biggest38725){
        biggest38725=ends[47];
      }
      if(biggest38725 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7360=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38720(int [] tdone, int [] ends){
        S7318=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38719(int [] tdone, int [] ends){
        S7315=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38718(int [] tdone, int [] ends){
        S7348=1;
    S7322=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38719(tdone,ends);
      thread38720(tdone,ends);
      int biggest38721 = 0;
      if(ends[43]>=biggest38721){
        biggest38721=ends[43];
      }
      if(ends[44]>=biggest38721){
        biggest38721=ends[44];
      }
      if(biggest38721 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S7322=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38717(int [] tdone, int [] ends){
        S7388=1;
    thread38718(tdone,ends);
    thread38722(tdone,ends);
    int biggest38726 = 0;
    if(ends[42]>=biggest38726){
      biggest38726=ends[42];
    }
    if(ends[45]>=biggest38726){
      biggest38726=ends[45];
    }
    if(biggest38726 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38715(int [] tdone, int [] ends){
        S7308=1;
    S7252=0;
    S7232=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S7232=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7227=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S7227=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S7252=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S7252=1;
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

  public void thread38714(int [] tdone, int [] ends){
        S7225=1;
    S7169=0;
    S7149=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S7149=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7144=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S7144=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S7169=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S7169=1;
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

  public void thread38713(int [] tdone, int [] ends){
        S7310=1;
    thread38714(tdone,ends);
    thread38715(tdone,ends);
    int biggest38716 = 0;
    if(ends[39]>=biggest38716){
      biggest38716=ends[39];
    }
    if(ends[40]>=biggest38716){
      biggest38716=ends[40];
    }
    if(biggest38716 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38710(int [] tdone, int [] ends){
        S7072=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7072=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38709(int [] tdone, int [] ends){
        S7066=1;
    S7065=0;
    S7049=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S7049=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7044=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S7044=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S7065=1;
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

  public void thread38708(int [] tdone, int [] ends){
        S7140=1;
    S7074=0;
    thread38709(tdone,ends);
    thread38710(tdone,ends);
    int biggest38711 = 0;
    if(ends[36]>=biggest38711){
      biggest38711=ends[36];
    }
    if(ends[37]>=biggest38711){
      biggest38711=ends[37];
    }
    if(biggest38711 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38706(int [] tdone, int [] ends){
        S6973=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6973=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38705(int [] tdone, int [] ends){
        S6967=1;
    S6966=0;
    S6950=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6950=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6945=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6945=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6966=1;
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

  public void thread38704(int [] tdone, int [] ends){
        S7041=1;
    S6975=0;
    thread38705(tdone,ends);
    thread38706(tdone,ends);
    int biggest38707 = 0;
    if(ends[33]>=biggest38707){
      biggest38707=ends[33];
    }
    if(ends[34]>=biggest38707){
      biggest38707=ends[34];
    }
    if(biggest38707 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38702(int [] tdone, int [] ends){
        S6874=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6874=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38701(int [] tdone, int [] ends){
        S6868=1;
    S6867=0;
    S6851=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6851=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6846=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6846=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6867=1;
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

  public void thread38700(int [] tdone, int [] ends){
        S6942=1;
    S6876=0;
    thread38701(tdone,ends);
    thread38702(tdone,ends);
    int biggest38703 = 0;
    if(ends[30]>=biggest38703){
      biggest38703=ends[30];
    }
    if(ends[31]>=biggest38703){
      biggest38703=ends[31];
    }
    if(biggest38703 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38699(int [] tdone, int [] ends){
        S7142=1;
    thread38700(tdone,ends);
    thread38704(tdone,ends);
    thread38708(tdone,ends);
    int biggest38712 = 0;
    if(ends[29]>=biggest38712){
      biggest38712=ends[29];
    }
    if(ends[32]>=biggest38712){
      biggest38712=ends[32];
    }
    if(ends[35]>=biggest38712){
      biggest38712=ends[35];
    }
    if(biggest38712 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38712 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38712 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38697(int [] tdone, int [] ends){
        S4897=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38696(int [] tdone, int [] ends){
        S4894=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38695(int [] tdone, int [] ends){
        S4891=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38694(int [] tdone, int [] ends){
        S6843=1;
    S4898=0;
    thread38695(tdone,ends);
    thread38696(tdone,ends);
    thread38697(tdone,ends);
    int biggest38698 = 0;
    if(ends[23]>=biggest38698){
      biggest38698=ends[23];
    }
    if(ends[24]>=biggest38698){
      biggest38698=ends[24];
    }
    if(ends[25]>=biggest38698){
      biggest38698=ends[25];
    }
    if(biggest38698 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38690(int [] tdone, int [] ends){
        S7356=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38689(int [] tdone, int [] ends){
        S7353=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38688(int [] tdone, int [] ends){
        S7386=1;
    S7360=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38689(tdone,ends);
      thread38690(tdone,ends);
      int biggest38691 = 0;
      if(ends[46]>=biggest38691){
        biggest38691=ends[46];
      }
      if(ends[47]>=biggest38691){
        biggest38691=ends[47];
      }
      if(biggest38691 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7360=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38686(int [] tdone, int [] ends){
        S7318=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38685(int [] tdone, int [] ends){
        S7315=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38684(int [] tdone, int [] ends){
        S7348=1;
    S7322=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38685(tdone,ends);
      thread38686(tdone,ends);
      int biggest38687 = 0;
      if(ends[43]>=biggest38687){
        biggest38687=ends[43];
      }
      if(ends[44]>=biggest38687){
        biggest38687=ends[44];
      }
      if(biggest38687 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S7322=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38683(int [] tdone, int [] ends){
        S7388=1;
    thread38684(tdone,ends);
    thread38688(tdone,ends);
    int biggest38692 = 0;
    if(ends[42]>=biggest38692){
      biggest38692=ends[42];
    }
    if(ends[45]>=biggest38692){
      biggest38692=ends[45];
    }
    if(biggest38692 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38681(int [] tdone, int [] ends){
        S7308=1;
    S7252=0;
    S7232=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S7232=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7227=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S7227=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S7252=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S7252=1;
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

  public void thread38680(int [] tdone, int [] ends){
        S7225=1;
    S7169=0;
    S7149=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S7149=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7144=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S7144=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S7169=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S7169=1;
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

  public void thread38679(int [] tdone, int [] ends){
        S7310=1;
    thread38680(tdone,ends);
    thread38681(tdone,ends);
    int biggest38682 = 0;
    if(ends[39]>=biggest38682){
      biggest38682=ends[39];
    }
    if(ends[40]>=biggest38682){
      biggest38682=ends[40];
    }
    if(biggest38682 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38676(int [] tdone, int [] ends){
        S7072=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7072=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38675(int [] tdone, int [] ends){
        S7066=1;
    S7065=0;
    S7049=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S7049=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7044=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S7044=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S7065=1;
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

  public void thread38674(int [] tdone, int [] ends){
        S7140=1;
    S7074=0;
    thread38675(tdone,ends);
    thread38676(tdone,ends);
    int biggest38677 = 0;
    if(ends[36]>=biggest38677){
      biggest38677=ends[36];
    }
    if(ends[37]>=biggest38677){
      biggest38677=ends[37];
    }
    if(biggest38677 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38672(int [] tdone, int [] ends){
        S6973=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6973=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38671(int [] tdone, int [] ends){
        S6967=1;
    S6966=0;
    S6950=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6950=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6945=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6945=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6966=1;
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

  public void thread38670(int [] tdone, int [] ends){
        S7041=1;
    S6975=0;
    thread38671(tdone,ends);
    thread38672(tdone,ends);
    int biggest38673 = 0;
    if(ends[33]>=biggest38673){
      biggest38673=ends[33];
    }
    if(ends[34]>=biggest38673){
      biggest38673=ends[34];
    }
    if(biggest38673 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38668(int [] tdone, int [] ends){
        S6874=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6874=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38667(int [] tdone, int [] ends){
        S6868=1;
    S6867=0;
    S6851=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6851=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6846=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6846=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6867=1;
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

  public void thread38666(int [] tdone, int [] ends){
        S6942=1;
    S6876=0;
    thread38667(tdone,ends);
    thread38668(tdone,ends);
    int biggest38669 = 0;
    if(ends[30]>=biggest38669){
      biggest38669=ends[30];
    }
    if(ends[31]>=biggest38669){
      biggest38669=ends[31];
    }
    if(biggest38669 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38665(int [] tdone, int [] ends){
        S7142=1;
    thread38666(tdone,ends);
    thread38670(tdone,ends);
    thread38674(tdone,ends);
    int biggest38678 = 0;
    if(ends[29]>=biggest38678){
      biggest38678=ends[29];
    }
    if(ends[32]>=biggest38678){
      biggest38678=ends[32];
    }
    if(ends[35]>=biggest38678){
      biggest38678=ends[35];
    }
    if(biggest38678 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38678 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38678 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38663(int [] tdone, int [] ends){
        S4897=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38662(int [] tdone, int [] ends){
        S4894=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38661(int [] tdone, int [] ends){
        S4891=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38660(int [] tdone, int [] ends){
        S6843=1;
    S4898=0;
    thread38661(tdone,ends);
    thread38662(tdone,ends);
    thread38663(tdone,ends);
    int biggest38664 = 0;
    if(ends[23]>=biggest38664){
      biggest38664=ends[23];
    }
    if(ends[24]>=biggest38664){
      biggest38664=ends[24];
    }
    if(ends[25]>=biggest38664){
      biggest38664=ends[25];
    }
    if(biggest38664 == 1){
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
  }

  public void thread38656(int [] tdone, int [] ends){
        S7356=1;
    active[47]=1;
    ends[47]=1;
    tdone[47]=1;
  }

  public void thread38655(int [] tdone, int [] ends){
        S7353=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 327, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[46]=1;
    ends[46]=1;
    tdone[46]=1;
  }

  public void thread38654(int [] tdone, int [] ends){
        S7386=1;
    S7360=0;
    if(bottleAtPos5_21.getprestatus()){//sysj\conveyor_controller.sysj line: 325, column: 21
      thread38655(tdone,ends);
      thread38656(tdone,ends);
      int biggest38657 = 0;
      if(ends[46]>=biggest38657){
        biggest38657=ends[46];
      }
      if(ends[47]>=biggest38657){
        biggest38657=ends[47];
      }
      if(biggest38657 == 1){
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
    else {
      S7360=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
  }

  public void thread38652(int [] tdone, int [] ends){
        S7318=1;
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread38651(int [] tdone, int [] ends){
        S7315=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 309, column: 23
    currsigs.addElement(bottleAtPos3E);
    active[43]=1;
    ends[43]=1;
    tdone[43]=1;
  }

  public void thread38650(int [] tdone, int [] ends){
        S7348=1;
    S7322=0;
    if(bottleAtPos3_21.getprestatus()){//sysj\conveyor_controller.sysj line: 307, column: 21
      thread38651(tdone,ends);
      thread38652(tdone,ends);
      int biggest38653 = 0;
      if(ends[43]>=biggest38653){
        biggest38653=ends[43];
      }
      if(ends[44]>=biggest38653){
        biggest38653=ends[44];
      }
      if(biggest38653 == 1){
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
    else {
      S7322=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
  }

  public void thread38649(int [] tdone, int [] ends){
        S7388=1;
    thread38650(tdone,ends);
    thread38654(tdone,ends);
    int biggest38658 = 0;
    if(ends[42]>=biggest38658){
      biggest38658=ends[42];
    }
    if(ends[45]>=biggest38658){
      biggest38658=ends[45];
    }
    if(biggest38658 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread38647(int [] tdone, int [] ends){
        S7308=1;
    S7252=0;
    S7232=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 292, column: 8
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
      S7232=1;
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S7227=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 292, column: 8
        S7227=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 292, column: 8
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 292, column: 8
          ends[40]=2;
          ;//sysj\conveyor_controller.sysj line: 292, column: 8
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 293, column: 11
            bottleAtPos3_21.setPresent();//sysj\conveyor_controller.sysj line: 294, column: 9
            currsigs.addElement(bottleAtPos3_21);
            S7252=1;
            active[40]=1;
            ends[40]=1;
            tdone[40]=1;
          }
          else {
            S7252=1;
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

  public void thread38646(int [] tdone, int [] ends){
        S7225=1;
    S7169=0;
    S7149=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 282, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
      S7149=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S7144=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 282, column: 7
        S7144=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 282, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 282, column: 7
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 282, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 283, column: 10
            bottleAtPos5_21.setPresent();//sysj\conveyor_controller.sysj line: 284, column: 8
            currsigs.addElement(bottleAtPos5_21);
            S7169=1;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
          }
          else {
            S7169=1;
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

  public void thread38645(int [] tdone, int [] ends){
        S7310=1;
    thread38646(tdone,ends);
    thread38647(tdone,ends);
    int biggest38648 = 0;
    if(ends[39]>=biggest38648){
      biggest38648=ends[39];
    }
    if(ends[40]>=biggest38648){
      biggest38648=ends[40];
    }
    if(biggest38648 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread38642(int [] tdone, int [] ends){
        S7072=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cR_21);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S7072=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread38641(int [] tdone, int [] ends){
        S7066=1;
    S7065=0;
    S7049=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S7049=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S7044=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S7044=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S7065=1;
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

  public void thread38640(int [] tdone, int [] ends){
        S7140=1;
    S7074=0;
    thread38641(tdone,ends);
    thread38642(tdone,ends);
    int biggest38643 = 0;
    if(ends[36]>=biggest38643){
      biggest38643=ends[36];
    }
    if(ends[37]>=biggest38643){
      biggest38643=ends[37];
    }
    if(biggest38643 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread38638(int [] tdone, int [] ends){
        S6973=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      fR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(fR_21);
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    else {
      S6973=0;
      active[34]=0;
      ends[34]=0;
      tdone[34]=1;
    }
  }

  public void thread38637(int [] tdone, int [] ends){
        S6967=1;
    S6966=0;
    S6950=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6950=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S6945=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6945=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6966=1;
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

  public void thread38636(int [] tdone, int [] ends){
        S7041=1;
    S6975=0;
    thread38637(tdone,ends);
    thread38638(tdone,ends);
    int biggest38639 = 0;
    if(ends[33]>=biggest38639){
      biggest38639=ends[33];
    }
    if(ends[34]>=biggest38639){
      biggest38639=ends[34];
    }
    if(biggest38639 == 1){
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread38634(int [] tdone, int [] ends){
        S6874=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 69, column: 9
      cvR_21.setPresent();//sysj\conveyor_controller.sysj line: 69, column: 20
      currsigs.addElement(cvR_21);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      S6874=0;
      active[31]=0;
      ends[31]=0;
      tdone[31]=1;
    }
  }

  public void thread38633(int [] tdone, int [] ends){
        S6868=1;
    S6867=0;
    S6851=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 67, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
      S6851=1;
      active[30]=1;
      ends[30]=1;
      tdone[30]=1;
    }
    else {
      S6846=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 67, column: 5
        S6846=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 67, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 67, column: 5
          ends[30]=2;
          ;//sysj\conveyor_controller.sysj line: 67, column: 5
          S6867=1;
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

  public void thread38632(int [] tdone, int [] ends){
        S6942=1;
    S6876=0;
    thread38633(tdone,ends);
    thread38634(tdone,ends);
    int biggest38635 = 0;
    if(ends[30]>=biggest38635){
      biggest38635=ends[30];
    }
    if(ends[31]>=biggest38635){
      biggest38635=ends[31];
    }
    if(biggest38635 == 1){
      active[29]=1;
      ends[29]=1;
      tdone[29]=1;
    }
  }

  public void thread38631(int [] tdone, int [] ends){
        S7142=1;
    thread38632(tdone,ends);
    thread38636(tdone,ends);
    thread38640(tdone,ends);
    int biggest38644 = 0;
    if(ends[29]>=biggest38644){
      biggest38644=ends[29];
    }
    if(ends[32]>=biggest38644){
      biggest38644=ends[32];
    }
    if(ends[35]>=biggest38644){
      biggest38644=ends[35];
    }
    if(biggest38644 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38644 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    if(biggest38644 == 1){
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread38629(int [] tdone, int [] ends){
        S4897=1;
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread38628(int [] tdone, int [] ends){
        S4894=1;
    active[24]=1;
    ends[24]=1;
    tdone[24]=1;
  }

  public void thread38627(int [] tdone, int [] ends){
        S4891=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread38626(int [] tdone, int [] ends){
        S6843=1;
    S4898=0;
    thread38627(tdone,ends);
    thread38628(tdone,ends);
    thread38629(tdone,ends);
    int biggest38630 = 0;
    if(ends[23]>=biggest38630){
      biggest38630=ends[23];
    }
    if(ends[24]>=biggest38630){
      biggest38630=ends[24];
    }
    if(ends[25]>=biggest38630){
      biggest38630=ends[25];
    }
    if(biggest38630 == 1){
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
      switch(S24889){
        case 0 : 
          S24889=0;
          break RUN;
        
        case 1 : 
          S24889=2;
          S24889=2;
          cvR_21.setClear();//sysj\conveyor_controller.sysj line: 203, column: 7
          fR_21.setClear();//sysj\conveyor_controller.sysj line: 203, column: 7
          cR_21.setClear();//sysj\conveyor_controller.sysj line: 203, column: 7
          bottleAtPos5_21.setClear();//sysj\conveyor_controller.sysj line: 204, column: 7
          bottleAtPos3_21.setClear();//sysj\conveyor_controller.sysj line: 204, column: 7
          S4756=0;
          S4652=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 205, column: 7
            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 205, column: 7
            S4652=1;
            active[21]=1;
            ends[21]=1;
            break RUN;
          }
          else {
            S4647=0;
            if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 205, column: 7
              convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 205, column: 7
              S4647=1;
              if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 205, column: 7
                convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 205, column: 7
                ends[21]=2;
                ;//sysj\conveyor_controller.sysj line: 205, column: 7
                S4756=1;
                S4674=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 206, column: 7
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                  S4674=1;
                  active[21]=1;
                  ends[21]=1;
                  break RUN;
                }
                else {
                  S4669=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 206, column: 7
                    S4669=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                      ends[21]=2;
                      ;//sysj\conveyor_controller.sysj line: 206, column: 7
                      S4756=2;
                      S4763=0;
                      if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                        S4763=1;
                        active[21]=1;
                        ends[21]=1;
                        break RUN;
                      }
                      else {
                        S4758=0;
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                          S4758=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                            ends[21]=2;
                            ;//sysj\conveyor_controller.sysj line: 207, column: 7
                            S4756=3;
                            thread38626(tdone,ends);
                            thread38631(tdone,ends);
                            thread38645(tdone,ends);
                            thread38649(tdone,ends);
                            int biggest38659 = 0;
                            if(ends[22]>=biggest38659){
                              biggest38659=ends[22];
                            }
                            if(ends[28]>=biggest38659){
                              biggest38659=ends[28];
                            }
                            if(ends[38]>=biggest38659){
                              biggest38659=ends[38];
                            }
                            if(ends[41]>=biggest38659){
                              biggest38659=ends[41];
                            }
                            if(biggest38659 == 1){
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
          switch(S4756){
            case 0 : 
              switch(S4652){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 205, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 205, column: 7
                    S4652=1;
                    active[21]=1;
                    ends[21]=1;
                    break RUN;
                  }
                  else {
                    switch(S4647){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 205, column: 7
                          convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 205, column: 7
                          S4647=1;
                          if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 205, column: 7
                            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 205, column: 7
                            ends[21]=2;
                            ;//sysj\conveyor_controller.sysj line: 205, column: 7
                            S4756=1;
                            S4674=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 206, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                              S4674=1;
                              active[21]=1;
                              ends[21]=1;
                              break RUN;
                            }
                            else {
                              S4669=0;
                              if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                                fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 206, column: 7
                                S4669=1;
                                if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                                  ends[21]=2;
                                  ;//sysj\conveyor_controller.sysj line: 206, column: 7
                                  S4756=2;
                                  S4763=0;
                                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                    S4763=1;
                                    active[21]=1;
                                    ends[21]=1;
                                    break RUN;
                                  }
                                  else {
                                    S4758=0;
                                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                                      S4758=1;
                                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                        ends[21]=2;
                                        ;//sysj\conveyor_controller.sysj line: 207, column: 7
                                        S4756=3;
                                        thread38660(tdone,ends);
                                        thread38665(tdone,ends);
                                        thread38679(tdone,ends);
                                        thread38683(tdone,ends);
                                        int biggest38693 = 0;
                                        if(ends[22]>=biggest38693){
                                          biggest38693=ends[22];
                                        }
                                        if(ends[28]>=biggest38693){
                                          biggest38693=ends[28];
                                        }
                                        if(ends[38]>=biggest38693){
                                          biggest38693=ends[38];
                                        }
                                        if(ends[41]>=biggest38693){
                                          biggest38693=ends[41];
                                        }
                                        if(biggest38693 == 1){
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
                          S4756=1;
                          S4674=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 206, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                            S4674=1;
                            active[21]=1;
                            ends[21]=1;
                            break RUN;
                          }
                          else {
                            S4669=0;
                            if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                              fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 206, column: 7
                              S4669=1;
                              if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                                fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                                ends[21]=2;
                                ;//sysj\conveyor_controller.sysj line: 206, column: 7
                                S4756=2;
                                S4763=0;
                                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                  S4763=1;
                                  active[21]=1;
                                  ends[21]=1;
                                  break RUN;
                                }
                                else {
                                  S4758=0;
                                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                                    S4758=1;
                                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                      ends[21]=2;
                                      ;//sysj\conveyor_controller.sysj line: 207, column: 7
                                      S4756=3;
                                      thread38694(tdone,ends);
                                      thread38699(tdone,ends);
                                      thread38713(tdone,ends);
                                      thread38717(tdone,ends);
                                      int biggest38727 = 0;
                                      if(ends[22]>=biggest38727){
                                        biggest38727=ends[22];
                                      }
                                      if(ends[28]>=biggest38727){
                                        biggest38727=ends[28];
                                      }
                                      if(ends[38]>=biggest38727){
                                        biggest38727=ends[38];
                                      }
                                      if(ends[41]>=biggest38727){
                                        biggest38727=ends[41];
                                      }
                                      if(biggest38727 == 1){
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
                  S4652=1;
                  S4652=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 205, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 205, column: 7
                    S4652=1;
                    active[21]=1;
                    ends[21]=1;
                    break RUN;
                  }
                  else {
                    S4647=0;
                    if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 205, column: 7
                      convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 205, column: 7
                      S4647=1;
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 205, column: 7
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 205, column: 7
                        ends[21]=2;
                        ;//sysj\conveyor_controller.sysj line: 205, column: 7
                        S4756=1;
                        S4674=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 206, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                          S4674=1;
                          active[21]=1;
                          ends[21]=1;
                          break RUN;
                        }
                        else {
                          S4669=0;
                          if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                            fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 206, column: 7
                            S4669=1;
                            if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                              ends[21]=2;
                              ;//sysj\conveyor_controller.sysj line: 206, column: 7
                              S4756=2;
                              S4763=0;
                              if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                S4763=1;
                                active[21]=1;
                                ends[21]=1;
                                break RUN;
                              }
                              else {
                                S4758=0;
                                if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                  capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                                  S4758=1;
                                  if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                    ends[21]=2;
                                    ;//sysj\conveyor_controller.sysj line: 207, column: 7
                                    S4756=3;
                                    thread38728(tdone,ends);
                                    thread38733(tdone,ends);
                                    thread38747(tdone,ends);
                                    thread38751(tdone,ends);
                                    int biggest38761 = 0;
                                    if(ends[22]>=biggest38761){
                                      biggest38761=ends[22];
                                    }
                                    if(ends[28]>=biggest38761){
                                      biggest38761=ends[28];
                                    }
                                    if(ends[38]>=biggest38761){
                                      biggest38761=ends[38];
                                    }
                                    if(ends[41]>=biggest38761){
                                      biggest38761=ends[41];
                                    }
                                    if(biggest38761 == 1){
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
              switch(S4674){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 206, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                    S4674=1;
                    active[21]=1;
                    ends[21]=1;
                    break RUN;
                  }
                  else {
                    switch(S4669){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                          fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 206, column: 7
                          S4669=1;
                          if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                            ends[21]=2;
                            ;//sysj\conveyor_controller.sysj line: 206, column: 7
                            S4756=2;
                            S4763=0;
                            if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                              S4763=1;
                              active[21]=1;
                              ends[21]=1;
                              break RUN;
                            }
                            else {
                              S4758=0;
                              if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                                S4758=1;
                                if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                  ends[21]=2;
                                  ;//sysj\conveyor_controller.sysj line: 207, column: 7
                                  S4756=3;
                                  thread38762(tdone,ends);
                                  thread38767(tdone,ends);
                                  thread38781(tdone,ends);
                                  thread38785(tdone,ends);
                                  int biggest38795 = 0;
                                  if(ends[22]>=biggest38795){
                                    biggest38795=ends[22];
                                  }
                                  if(ends[28]>=biggest38795){
                                    biggest38795=ends[28];
                                  }
                                  if(ends[38]>=biggest38795){
                                    biggest38795=ends[38];
                                  }
                                  if(ends[41]>=biggest38795){
                                    biggest38795=ends[41];
                                  }
                                  if(biggest38795 == 1){
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
                          S4756=2;
                          S4763=0;
                          if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                            S4763=1;
                            active[21]=1;
                            ends[21]=1;
                            break RUN;
                          }
                          else {
                            S4758=0;
                            if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                              capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                              S4758=1;
                              if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                                ends[21]=2;
                                ;//sysj\conveyor_controller.sysj line: 207, column: 7
                                S4756=3;
                                thread38796(tdone,ends);
                                thread38801(tdone,ends);
                                thread38815(tdone,ends);
                                thread38819(tdone,ends);
                                int biggest38829 = 0;
                                if(ends[22]>=biggest38829){
                                  biggest38829=ends[22];
                                }
                                if(ends[28]>=biggest38829){
                                  biggest38829=ends[28];
                                }
                                if(ends[38]>=biggest38829){
                                  biggest38829=ends[38];
                                }
                                if(ends[41]>=biggest38829){
                                  biggest38829=ends[41];
                                }
                                if(biggest38829 == 1){
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
                  S4674=1;
                  S4674=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 206, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                    S4674=1;
                    active[21]=1;
                    ends[21]=1;
                    break RUN;
                  }
                  else {
                    S4669=0;
                    if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                      fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 206, column: 7
                      S4669=1;
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 206, column: 7
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 206, column: 7
                        ends[21]=2;
                        ;//sysj\conveyor_controller.sysj line: 206, column: 7
                        S4756=2;
                        S4763=0;
                        if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                          S4763=1;
                          active[21]=1;
                          ends[21]=1;
                          break RUN;
                        }
                        else {
                          S4758=0;
                          if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                            capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                            S4758=1;
                            if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                              ends[21]=2;
                              ;//sysj\conveyor_controller.sysj line: 207, column: 7
                              S4756=3;
                              thread38830(tdone,ends);
                              thread38835(tdone,ends);
                              thread38849(tdone,ends);
                              thread38853(tdone,ends);
                              int biggest38863 = 0;
                              if(ends[22]>=biggest38863){
                                biggest38863=ends[22];
                              }
                              if(ends[28]>=biggest38863){
                                biggest38863=ends[28];
                              }
                              if(ends[38]>=biggest38863){
                                biggest38863=ends[38];
                              }
                              if(ends[41]>=biggest38863){
                                biggest38863=ends[41];
                              }
                              if(biggest38863 == 1){
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
              switch(S4763){
                case 0 : 
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                    S4763=1;
                    active[21]=1;
                    ends[21]=1;
                    break RUN;
                  }
                  else {
                    switch(S4758){
                      case 0 : 
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                          S4758=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                            ends[21]=2;
                            ;//sysj\conveyor_controller.sysj line: 207, column: 7
                            S4756=3;
                            thread38864(tdone,ends);
                            thread38869(tdone,ends);
                            thread38883(tdone,ends);
                            thread38887(tdone,ends);
                            int biggest38897 = 0;
                            if(ends[22]>=biggest38897){
                              biggest38897=ends[22];
                            }
                            if(ends[28]>=biggest38897){
                              biggest38897=ends[28];
                            }
                            if(ends[38]>=biggest38897){
                              biggest38897=ends[38];
                            }
                            if(ends[41]>=biggest38897){
                              biggest38897=ends[41];
                            }
                            if(biggest38897 == 1){
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
                          S4756=3;
                          thread38898(tdone,ends);
                          thread38903(tdone,ends);
                          thread38917(tdone,ends);
                          thread38921(tdone,ends);
                          int biggest38931 = 0;
                          if(ends[22]>=biggest38931){
                            biggest38931=ends[22];
                          }
                          if(ends[28]>=biggest38931){
                            biggest38931=ends[28];
                          }
                          if(ends[38]>=biggest38931){
                            biggest38931=ends[38];
                          }
                          if(ends[41]>=biggest38931){
                            biggest38931=ends[41];
                          }
                          if(biggest38931 == 1){
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
                  S4763=1;
                  S4763=0;
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 207, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                    S4763=1;
                    active[21]=1;
                    ends[21]=1;
                    break RUN;
                  }
                  else {
                    S4758=0;
                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 207, column: 7
                      S4758=1;
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 207, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 207, column: 7
                        ends[21]=2;
                        ;//sysj\conveyor_controller.sysj line: 207, column: 7
                        S4756=3;
                        thread38932(tdone,ends);
                        thread38937(tdone,ends);
                        thread38951(tdone,ends);
                        thread38955(tdone,ends);
                        int biggest38965 = 0;
                        if(ends[22]>=biggest38965){
                          biggest38965=ends[22];
                        }
                        if(ends[28]>=biggest38965){
                          biggest38965=ends[28];
                        }
                        if(ends[38]>=biggest38965){
                          biggest38965=ends[38];
                        }
                        if(ends[41]>=biggest38965){
                          biggest38965=ends[41];
                        }
                        if(biggest38965 == 1){
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
              thread38966(tdone,ends);
              thread38995(tdone,ends);
              thread39018(tdone,ends);
              thread39022(tdone,ends);
              int biggest39038 = 0;
              if(ends[22]>=biggest39038){
                biggest39038=ends[22];
              }
              if(ends[28]>=biggest39038){
                biggest39038=ends[28];
              }
              if(ends[38]>=biggest39038){
                biggest39038=ends[38];
              }
              if(ends[41]>=biggest39038){
                biggest39038=ends[41];
              }
              if(biggest39038 == 1){
                active[21]=1;
                ends[21]=1;
                break RUN;
              }
              //FINXME code
              if(biggest39038 == 0){
                S24889=0;
                active[21]=0;
                ends[21]=0;
                S24889=0;
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

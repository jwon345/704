import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class FillerController extends ClockDomain{
  public FillerController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public input_Channel simFiller_in = new input_Channel();
  public output_Channel fillerReady_o = new output_Channel();
  private Signal bottleAtPos2_27;
  private long __start_thread_28;//sysj\conveyor_controller.sysj line: 249, column: 9
  private int S18702 = 1;
  private int S18701 = 1;
  private int S10741 = 1;
  private int S10736 = 1;
  private int S12624 = 1;
  private int S10759 = 1;
  private int S10794 = 1;
  private int S10789 = 1;
  private int S10883 = 1;
  private int S10888 = 1;
  private int S10967 = 1;
  private int S10972 = 1;
  private int S11008 = 1;
  private int S11003 = 1;
  private int S12707 = 1;
  private int S12651 = 1;
  private int S12631 = 1;
  private int S12626 = 1;
  private int S12742 = 1;
  private int S12718 = 1;
  private int S12712 = 1;
  private int S12715 = 1;
  
  private int[] ends = new int[37];
  private int[] tdone = new int[37];
  
  public void thread18953(int [] tdone, int [] ends){
        S12715=1;
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread18952(int [] tdone, int [] ends){
        S12712=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 302, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread18950(int [] tdone, int [] ends){
        switch(S12715){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 306, column: 35
          ends[36]=2;
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

  public void thread18949(int [] tdone, int [] ends){
        switch(S12712){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 302, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[35]=1;
        ends[35]=1;
        tdone[35]=1;
        break;
      
    }
  }

  public void thread18948(int [] tdone, int [] ends){
        switch(S12742){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        switch(S12718){
          case 0 : 
            thread18949(tdone,ends);
            thread18950(tdone,ends);
            int biggest18951 = 0;
            if(ends[35]>=biggest18951){
              biggest18951=ends[35];
            }
            if(ends[36]>=biggest18951){
              biggest18951=ends[36];
            }
            if(biggest18951 == 1){
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            if(biggest18951 == 2){
              ends[34]=2;
              ;//sysj\conveyor_controller.sysj line: 300, column: 18
              S12718=1;
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            //FINXME code
            if(biggest18951 == 0){
              S12718=1;
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            break;
          
          case 1 : 
            S12718=1;
            S12718=0;
            if(bottleAtPos2_27.getprestatus()){//sysj\conveyor_controller.sysj line: 299, column: 26
              thread18952(tdone,ends);
              thread18953(tdone,ends);
              int biggest18954 = 0;
              if(ends[35]>=biggest18954){
                biggest18954=ends[35];
              }
              if(ends[36]>=biggest18954){
                biggest18954=ends[36];
              }
              if(biggest18954 == 1){
                active[34]=1;
                ends[34]=1;
                tdone[34]=1;
              }
            }
            else {
              S12718=1;
              active[34]=1;
              ends[34]=1;
              tdone[34]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18947(int [] tdone, int [] ends){
        switch(S12707){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        switch(S12651){
          case 0 : 
            switch(S12631){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
                  S12631=1;
                  active[33]=1;
                  ends[33]=1;
                  tdone[33]=1;
                }
                else {
                  switch(S12626){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 288, column: 12
                        S12626=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
                          ends[33]=2;
                          ;//sysj\conveyor_controller.sysj line: 288, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
                            bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
                            currsigs.addElement(bottleAtPos2_27);
                            S12651=1;
                            active[33]=1;
                            ends[33]=1;
                            tdone[33]=1;
                          }
                          else {
                            S12651=1;
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
                      else {
                        active[33]=1;
                        ends[33]=1;
                        tdone[33]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
                        ends[33]=2;
                        ;//sysj\conveyor_controller.sysj line: 288, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
                          bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
                          currsigs.addElement(bottleAtPos2_27);
                          S12651=1;
                          active[33]=1;
                          ends[33]=1;
                          tdone[33]=1;
                        }
                        else {
                          S12651=1;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S12631=1;
                S12631=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
                  S12631=1;
                  active[33]=1;
                  ends[33]=1;
                  tdone[33]=1;
                }
                else {
                  S12626=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 288, column: 12
                    S12626=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
                      ends[33]=2;
                      ;//sysj\conveyor_controller.sysj line: 288, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
                        bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
                        currsigs.addElement(bottleAtPos2_27);
                        S12651=1;
                        active[33]=1;
                        ends[33]=1;
                        tdone[33]=1;
                      }
                      else {
                        S12651=1;
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
            S12651=1;
            S12651=0;
            S12631=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
              S12631=1;
              active[33]=1;
              ends[33]=1;
              tdone[33]=1;
            }
            else {
              S12626=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 288, column: 12
                S12626=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
                  ends[33]=2;
                  ;//sysj\conveyor_controller.sysj line: 288, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
                    bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
                    currsigs.addElement(bottleAtPos2_27);
                    S12651=1;
                    active[33]=1;
                    ends[33]=1;
                    tdone[33]=1;
                  }
                  else {
                    S12651=1;
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
              else {
                active[33]=1;
                ends[33]=1;
                tdone[33]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18945(int [] tdone, int [] ends){
        switch(S10972){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 275, column: 13
        currsigs.addElement(dosUnitValveExtend);
        active[32]=1;
        ends[32]=1;
        tdone[32]=1;
        break;
      
    }
  }

  public void thread18944(int [] tdone, int [] ends){
        switch(S10967){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 271, column: 13
        currsigs.addElement(valveInletOnOff);
        active[31]=1;
        ends[31]=1;
        tdone[31]=1;
        break;
      
    }
  }

  public void thread18942(int [] tdone, int [] ends){
        S10972=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 275, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread18941(int [] tdone, int [] ends){
        S10967=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 270, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 271, column: 13
    currsigs.addElement(valveInletOnOff);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread18939(int [] tdone, int [] ends){
        switch(S10888){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 13
        currsigs.addElement(dosUnitValveRetract);
        active[30]=1;
        ends[30]=1;
        tdone[30]=1;
        break;
      
    }
  }

  public void thread18938(int [] tdone, int [] ends){
        switch(S10883){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 260, column: 13
        currsigs.addElement(valveInjectorOnOff);
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
        break;
      
    }
  }

  public void thread18936(int [] tdone, int [] ends){
        S10972=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 275, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread18935(int [] tdone, int [] ends){
        S10967=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 270, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 271, column: 13
    currsigs.addElement(valveInletOnOff);
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread18933(int [] tdone, int [] ends){
        S10888=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread18932(int [] tdone, int [] ends){
        S10883=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 259, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 260, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread18930(int [] tdone, int [] ends){
        S10888=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread18929(int [] tdone, int [] ends){
        S10883=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 259, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 260, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread18927(int [] tdone, int [] ends){
        S10888=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread18926(int [] tdone, int [] ends){
        S10883=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 259, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 260, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread18924(int [] tdone, int [] ends){
        S10888=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread18923(int [] tdone, int [] ends){
        S10883=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 259, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 260, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread18921(int [] tdone, int [] ends){
        S10888=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 264, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread18920(int [] tdone, int [] ends){
        S10883=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 259, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 260, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread18919(int [] tdone, int [] ends){
        switch(S12624){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        switch(S10759){
          case 0 : 
            if(bottleAtPos2_27.getprestatus()){//sysj\conveyor_controller.sysj line: 252, column: 17
              S10759=1;
              __start_thread_28 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 249, column: 9
              if(com.systemj.Timer.getMs() - __start_thread_28 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 249, column: 9
                ends[28]=2;
                ;//sysj\conveyor_controller.sysj line: 249, column: 9
                S10759=2;
                S10794=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 254, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                  S10794=1;
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
                else {
                  S10789=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 254, column: 11
                    S10789=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                      ends[28]=2;
                      ;//sysj\conveyor_controller.sysj line: 254, column: 11
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 255, column: 11
                      S10759=3;
                      thread18920(tdone,ends);
                      thread18921(tdone,ends);
                      int biggest18922 = 0;
                      if(ends[29]>=biggest18922){
                        biggest18922=ends[29];
                      }
                      if(ends[30]>=biggest18922){
                        biggest18922=ends[30];
                      }
                      if(biggest18922 == 1){
                        active[28]=1;
                        ends[28]=1;
                        tdone[28]=1;
                      }
                    }
                    else {
                      active[28]=1;
                      ends[28]=1;
                      tdone[28]=1;
                    }
                  }
                  else {
                    active[28]=1;
                    ends[28]=1;
                    tdone[28]=1;
                  }
                }
              }
              else {
                active[28]=1;
                ends[28]=1;
                tdone[28]=1;
              }
            }
            else {
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            break;
          
          case 1 : 
            if(com.systemj.Timer.getMs() - __start_thread_28 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 249, column: 9
              ends[28]=2;
              ;//sysj\conveyor_controller.sysj line: 249, column: 9
              S10759=2;
              S10794=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 254, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                S10794=1;
                active[28]=1;
                ends[28]=1;
                tdone[28]=1;
              }
              else {
                S10789=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 254, column: 11
                  S10789=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                    ends[28]=2;
                    ;//sysj\conveyor_controller.sysj line: 254, column: 11
                    System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 255, column: 11
                    S10759=3;
                    thread18923(tdone,ends);
                    thread18924(tdone,ends);
                    int biggest18925 = 0;
                    if(ends[29]>=biggest18925){
                      biggest18925=ends[29];
                    }
                    if(ends[30]>=biggest18925){
                      biggest18925=ends[30];
                    }
                    if(biggest18925 == 1){
                      active[28]=1;
                      ends[28]=1;
                      tdone[28]=1;
                    }
                  }
                  else {
                    active[28]=1;
                    ends[28]=1;
                    tdone[28]=1;
                  }
                }
                else {
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
              }
            }
            else {
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            break;
          
          case 2 : 
            switch(S10794){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 254, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                  S10794=1;
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
                else {
                  switch(S10789){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 254, column: 11
                        S10789=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                          ends[28]=2;
                          ;//sysj\conveyor_controller.sysj line: 254, column: 11
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 255, column: 11
                          S10759=3;
                          thread18926(tdone,ends);
                          thread18927(tdone,ends);
                          int biggest18928 = 0;
                          if(ends[29]>=biggest18928){
                            biggest18928=ends[29];
                          }
                          if(ends[30]>=biggest18928){
                            biggest18928=ends[30];
                          }
                          if(biggest18928 == 1){
                            active[28]=1;
                            ends[28]=1;
                            tdone[28]=1;
                          }
                        }
                        else {
                          active[28]=1;
                          ends[28]=1;
                          tdone[28]=1;
                        }
                      }
                      else {
                        active[28]=1;
                        ends[28]=1;
                        tdone[28]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                        ends[28]=2;
                        ;//sysj\conveyor_controller.sysj line: 254, column: 11
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 255, column: 11
                        S10759=3;
                        thread18929(tdone,ends);
                        thread18930(tdone,ends);
                        int biggest18931 = 0;
                        if(ends[29]>=biggest18931){
                          biggest18931=ends[29];
                        }
                        if(ends[30]>=biggest18931){
                          biggest18931=ends[30];
                        }
                        if(biggest18931 == 1){
                          active[28]=1;
                          ends[28]=1;
                          tdone[28]=1;
                        }
                      }
                      else {
                        active[28]=1;
                        ends[28]=1;
                        tdone[28]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S10794=1;
                S10794=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 254, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                  S10794=1;
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
                else {
                  S10789=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 254, column: 11
                    S10789=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 254, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 254, column: 11
                      ends[28]=2;
                      ;//sysj\conveyor_controller.sysj line: 254, column: 11
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 255, column: 11
                      S10759=3;
                      thread18932(tdone,ends);
                      thread18933(tdone,ends);
                      int biggest18934 = 0;
                      if(ends[29]>=biggest18934){
                        biggest18934=ends[29];
                      }
                      if(ends[30]>=biggest18934){
                        biggest18934=ends[30];
                      }
                      if(biggest18934 == 1){
                        active[28]=1;
                        ends[28]=1;
                        tdone[28]=1;
                      }
                    }
                    else {
                      active[28]=1;
                      ends[28]=1;
                      tdone[28]=1;
                    }
                  }
                  else {
                    active[28]=1;
                    ends[28]=1;
                    tdone[28]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 3 : 
            if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 257, column: 17
              S10759=4;
              thread18935(tdone,ends);
              thread18936(tdone,ends);
              int biggest18937 = 0;
              if(ends[31]>=biggest18937){
                biggest18937=ends[31];
              }
              if(ends[32]>=biggest18937){
                biggest18937=ends[32];
              }
              if(biggest18937 == 1){
                active[28]=1;
                ends[28]=1;
                tdone[28]=1;
              }
            }
            else {
              thread18938(tdone,ends);
              thread18939(tdone,ends);
              int biggest18940 = 0;
              if(ends[29]>=biggest18940){
                biggest18940=ends[29];
              }
              if(ends[30]>=biggest18940){
                biggest18940=ends[30];
              }
              if(biggest18940 == 1){
                active[28]=1;
                ends[28]=1;
                tdone[28]=1;
              }
              //FINXME code
              if(biggest18940 == 0){
                S10759=4;
                thread18941(tdone,ends);
                thread18942(tdone,ends);
                int biggest18943 = 0;
                if(ends[31]>=biggest18943){
                  biggest18943=ends[31];
                }
                if(ends[32]>=biggest18943){
                  biggest18943=ends[32];
                }
                if(biggest18943 == 1){
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
              }
            }
            break;
          
          case 4 : 
            if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 268, column: 17
              S10759=5;
              S11008=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 279, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                S11008=1;
                active[28]=1;
                ends[28]=1;
                tdone[28]=1;
              }
              else {
                S11003=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 279, column: 11
                  S11003=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                    ends[28]=2;
                    ;//sysj\conveyor_controller.sysj line: 279, column: 11
                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 280, column: 11
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
                    S10759=0;
                    active[28]=1;
                    ends[28]=1;
                    tdone[28]=1;
                  }
                  else {
                    active[28]=1;
                    ends[28]=1;
                    tdone[28]=1;
                  }
                }
                else {
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
              }
            }
            else {
              thread18944(tdone,ends);
              thread18945(tdone,ends);
              int biggest18946 = 0;
              if(ends[31]>=biggest18946){
                biggest18946=ends[31];
              }
              if(ends[32]>=biggest18946){
                biggest18946=ends[32];
              }
              if(biggest18946 == 1){
                active[28]=1;
                ends[28]=1;
                tdone[28]=1;
              }
              //FINXME code
              if(biggest18946 == 0){
                S10759=5;
                S11008=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 279, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                  S11008=1;
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
                else {
                  S11003=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 279, column: 11
                    S11003=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                      ends[28]=2;
                      ;//sysj\conveyor_controller.sysj line: 279, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 280, column: 11
                      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
                      S10759=0;
                      active[28]=1;
                      ends[28]=1;
                      tdone[28]=1;
                    }
                    else {
                      active[28]=1;
                      ends[28]=1;
                      tdone[28]=1;
                    }
                  }
                  else {
                    active[28]=1;
                    ends[28]=1;
                    tdone[28]=1;
                  }
                }
              }
            }
            break;
          
          case 5 : 
            switch(S11008){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 279, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                  S11008=1;
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
                else {
                  switch(S11003){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 279, column: 11
                        S11003=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                          ends[28]=2;
                          ;//sysj\conveyor_controller.sysj line: 279, column: 11
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 280, column: 11
                          System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
                          S10759=0;
                          active[28]=1;
                          ends[28]=1;
                          tdone[28]=1;
                        }
                        else {
                          active[28]=1;
                          ends[28]=1;
                          tdone[28]=1;
                        }
                      }
                      else {
                        active[28]=1;
                        ends[28]=1;
                        tdone[28]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                        ends[28]=2;
                        ;//sysj\conveyor_controller.sysj line: 279, column: 11
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 280, column: 11
                        System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
                        S10759=0;
                        active[28]=1;
                        ends[28]=1;
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
                break;
              
              case 1 : 
                S11008=1;
                S11008=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 279, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                  S11008=1;
                  active[28]=1;
                  ends[28]=1;
                  tdone[28]=1;
                }
                else {
                  S11003=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 279, column: 11
                    S11003=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 279, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 279, column: 11
                      ends[28]=2;
                      ;//sysj\conveyor_controller.sysj line: 279, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 280, column: 11
                      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
                      S10759=0;
                      active[28]=1;
                      ends[28]=1;
                      tdone[28]=1;
                    }
                    else {
                      active[28]=1;
                      ends[28]=1;
                      tdone[28]=1;
                    }
                  }
                  else {
                    active[28]=1;
                    ends[28]=1;
                    tdone[28]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread18916(int [] tdone, int [] ends){
        S12715=1;
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread18915(int [] tdone, int [] ends){
        S12712=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 302, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread18914(int [] tdone, int [] ends){
        S12742=1;
    S12718=0;
    if(bottleAtPos2_27.getprestatus()){//sysj\conveyor_controller.sysj line: 299, column: 26
      thread18915(tdone,ends);
      thread18916(tdone,ends);
      int biggest18917 = 0;
      if(ends[35]>=biggest18917){
        biggest18917=ends[35];
      }
      if(ends[36]>=biggest18917){
        biggest18917=ends[36];
      }
      if(biggest18917 == 1){
        active[34]=1;
        ends[34]=1;
        tdone[34]=1;
      }
    }
    else {
      S12718=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread18913(int [] tdone, int [] ends){
        S12707=1;
    S12651=0;
    S12631=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
      S12631=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S12626=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 288, column: 12
        S12626=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 288, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
            bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
            currsigs.addElement(bottleAtPos2_27);
            S12651=1;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
          else {
            S12651=1;
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
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread18912(int [] tdone, int [] ends){
        S12624=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
    S10759=0;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread18909(int [] tdone, int [] ends){
        S12715=1;
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread18908(int [] tdone, int [] ends){
        S12712=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 302, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread18907(int [] tdone, int [] ends){
        S12742=1;
    S12718=0;
    if(bottleAtPos2_27.getprestatus()){//sysj\conveyor_controller.sysj line: 299, column: 26
      thread18908(tdone,ends);
      thread18909(tdone,ends);
      int biggest18910 = 0;
      if(ends[35]>=biggest18910){
        biggest18910=ends[35];
      }
      if(ends[36]>=biggest18910){
        biggest18910=ends[36];
      }
      if(biggest18910 == 1){
        active[34]=1;
        ends[34]=1;
        tdone[34]=1;
      }
    }
    else {
      S12718=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread18906(int [] tdone, int [] ends){
        S12707=1;
    S12651=0;
    S12631=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
      S12631=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S12626=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 288, column: 12
        S12626=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 288, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
            bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
            currsigs.addElement(bottleAtPos2_27);
            S12651=1;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
          else {
            S12651=1;
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
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread18905(int [] tdone, int [] ends){
        S12624=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
    S10759=0;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread18902(int [] tdone, int [] ends){
        S12715=1;
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread18901(int [] tdone, int [] ends){
        S12712=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 302, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread18900(int [] tdone, int [] ends){
        S12742=1;
    S12718=0;
    if(bottleAtPos2_27.getprestatus()){//sysj\conveyor_controller.sysj line: 299, column: 26
      thread18901(tdone,ends);
      thread18902(tdone,ends);
      int biggest18903 = 0;
      if(ends[35]>=biggest18903){
        biggest18903=ends[35];
      }
      if(ends[36]>=biggest18903){
        biggest18903=ends[36];
      }
      if(biggest18903 == 1){
        active[34]=1;
        ends[34]=1;
        tdone[34]=1;
      }
    }
    else {
      S12718=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread18899(int [] tdone, int [] ends){
        S12707=1;
    S12651=0;
    S12631=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
      S12631=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S12626=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 288, column: 12
        S12626=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 288, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
            bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
            currsigs.addElement(bottleAtPos2_27);
            S12651=1;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
          else {
            S12651=1;
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
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread18898(int [] tdone, int [] ends){
        S12624=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
    S10759=0;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread18895(int [] tdone, int [] ends){
        S12715=1;
    active[36]=1;
    ends[36]=1;
    tdone[36]=1;
  }

  public void thread18894(int [] tdone, int [] ends){
        S12712=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 302, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[35]=1;
    ends[35]=1;
    tdone[35]=1;
  }

  public void thread18893(int [] tdone, int [] ends){
        S12742=1;
    S12718=0;
    if(bottleAtPos2_27.getprestatus()){//sysj\conveyor_controller.sysj line: 299, column: 26
      thread18894(tdone,ends);
      thread18895(tdone,ends);
      int biggest18896 = 0;
      if(ends[35]>=biggest18896){
        biggest18896=ends[35];
      }
      if(ends[36]>=biggest18896){
        biggest18896=ends[36];
      }
      if(biggest18896 == 1){
        active[34]=1;
        ends[34]=1;
        tdone[34]=1;
      }
    }
    else {
      S12718=1;
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread18892(int [] tdone, int [] ends){
        S12707=1;
    S12651=0;
    S12631=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 288, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
      S12631=1;
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
    else {
      S12626=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 288, column: 12
        S12626=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 288, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 288, column: 12
          ends[33]=2;
          ;//sysj\conveyor_controller.sysj line: 288, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 289, column: 15
            bottleAtPos2_27.setPresent();//sysj\conveyor_controller.sysj line: 290, column: 13
            currsigs.addElement(bottleAtPos2_27);
            S12651=1;
            active[33]=1;
            ends[33]=1;
            tdone[33]=1;
          }
          else {
            S12651=1;
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
      else {
        active[33]=1;
        ends[33]=1;
        tdone[33]=1;
      }
    }
  }

  public void thread18891(int [] tdone, int [] ends){
        S12624=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 251, column: 14
    S10759=0;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S18702){
        case 0 : 
          S18702=0;
          break RUN;
        
        case 1 : 
          S18702=2;
          S18702=2;
          bottleAtPos2_27.setClear();//sysj\conveyor_controller.sysj line: 244, column: 9
          S18701=0;
          S10741=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 246, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 246, column: 9
            S10741=1;
            active[27]=1;
            ends[27]=1;
            break RUN;
          }
          else {
            S10736=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 246, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 246, column: 9
              S10736=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 246, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 246, column: 9
                ends[27]=2;
                ;//sysj\conveyor_controller.sysj line: 246, column: 9
                S18701=1;
                thread18891(tdone,ends);
                thread18892(tdone,ends);
                thread18893(tdone,ends);
                int biggest18897 = 0;
                if(ends[28]>=biggest18897){
                  biggest18897=ends[28];
                }
                if(ends[33]>=biggest18897){
                  biggest18897=ends[33];
                }
                if(ends[34]>=biggest18897){
                  biggest18897=ends[34];
                }
                if(biggest18897 == 1){
                  active[27]=1;
                  ends[27]=1;
                  break RUN;
                }
              }
              else {
                active[27]=1;
                ends[27]=1;
                break RUN;
              }
            }
            else {
              active[27]=1;
              ends[27]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos2_27.setClear();//sysj\conveyor_controller.sysj line: 244, column: 9
          switch(S18701){
            case 0 : 
              switch(S10741){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 246, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 246, column: 9
                    S10741=1;
                    active[27]=1;
                    ends[27]=1;
                    break RUN;
                  }
                  else {
                    switch(S10736){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 246, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 246, column: 9
                          S10736=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 246, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 246, column: 9
                            ends[27]=2;
                            ;//sysj\conveyor_controller.sysj line: 246, column: 9
                            S18701=1;
                            thread18898(tdone,ends);
                            thread18899(tdone,ends);
                            thread18900(tdone,ends);
                            int biggest18904 = 0;
                            if(ends[28]>=biggest18904){
                              biggest18904=ends[28];
                            }
                            if(ends[33]>=biggest18904){
                              biggest18904=ends[33];
                            }
                            if(ends[34]>=biggest18904){
                              biggest18904=ends[34];
                            }
                            if(biggest18904 == 1){
                              active[27]=1;
                              ends[27]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[27]=1;
                            ends[27]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[27]=1;
                          ends[27]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 246, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 246, column: 9
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 246, column: 9
                          S18701=1;
                          thread18905(tdone,ends);
                          thread18906(tdone,ends);
                          thread18907(tdone,ends);
                          int biggest18911 = 0;
                          if(ends[28]>=biggest18911){
                            biggest18911=ends[28];
                          }
                          if(ends[33]>=biggest18911){
                            biggest18911=ends[33];
                          }
                          if(ends[34]>=biggest18911){
                            biggest18911=ends[34];
                          }
                          if(biggest18911 == 1){
                            active[27]=1;
                            ends[27]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[27]=1;
                          ends[27]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S10741=1;
                  S10741=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 246, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 246, column: 9
                    S10741=1;
                    active[27]=1;
                    ends[27]=1;
                    break RUN;
                  }
                  else {
                    S10736=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 246, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 246, column: 9
                      S10736=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 246, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 246, column: 9
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 246, column: 9
                        S18701=1;
                        thread18912(tdone,ends);
                        thread18913(tdone,ends);
                        thread18914(tdone,ends);
                        int biggest18918 = 0;
                        if(ends[28]>=biggest18918){
                          biggest18918=ends[28];
                        }
                        if(ends[33]>=biggest18918){
                          biggest18918=ends[33];
                        }
                        if(ends[34]>=biggest18918){
                          biggest18918=ends[34];
                        }
                        if(biggest18918 == 1){
                          active[27]=1;
                          ends[27]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[27]=1;
                        ends[27]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[27]=1;
                      ends[27]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread18919(tdone,ends);
              thread18947(tdone,ends);
              thread18948(tdone,ends);
              int biggest18955 = 0;
              if(ends[28]>=biggest18955){
                biggest18955=ends[28];
              }
              if(ends[33]>=biggest18955){
                biggest18955=ends[33];
              }
              if(ends[34]>=biggest18955){
                biggest18955=ends[34];
              }
              if(biggest18955 == 1){
                active[27]=1;
                ends[27]=1;
                break RUN;
              }
              //FINXME code
              if(biggest18955 == 0){
                S18702=0;
                active[27]=0;
                ends[27]=0;
                S18702=0;
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
    bottleAtPos2_27 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[27] != 0){
      int index = 27;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[27]!=0 || suspended[27]!=0 || active[27]!=1);
      else{
        if(!df){
          simFiller_in.gethook();
          fillerReady_o.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          df = true;
        }
        runClockDomain();
      }
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      bottleAtPos2E.setpreclear();
      bottleAtPos2_27.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      bottleAtPos2_27.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[27]!=0 || suspended[27]!=0 || active[27]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[27] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

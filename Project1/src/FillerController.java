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
  public Signal fileReadSignal = new Signal("fileReadSignal", Signal.INPUT);
  public Signal ordered = new Signal("ordered", Signal.INPUT);
  public Signal orderFill_1 = new Signal("orderFill_1", Signal.INPUT);
  public Signal orderFill_2 = new Signal("orderFill_2", Signal.INPUT);
  public Signal orderFill_3 = new Signal("orderFill_3", Signal.INPUT);
  public Signal orderFill_4 = new Signal("orderFill_4", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public Signal order_finished = new Signal("order_finished", Signal.OUTPUT);
  public input_Channel simFiller_in = new input_Channel();
  public output_Channel fillerReady_o = new output_Channel();
  private Signal filler1_51;
  private Signal filler2_51;
  private Signal filler3_51;
  private Signal filler4_51;
  private Signal filler1_amount_51;
  private Signal filler2_amount_51;
  private Signal filler3_amount_51;
  private Signal filler4_amount_51;
  private Signal current_fill_51;
  private Signal total_fill_51;
  private Signal bottleAtPos2_51;
  private int current_thread_52;//sysj\conveyor_controller.sysj line: 375, column: 16
  private int total_thread_52;//sysj\conveyor_controller.sysj line: 376, column: 16
  private long __start_thread_52;//sysj\conveyor_controller.sysj line: 374, column: 9
  private int S137679 = 1;
  private int S137678 = 1;
  private int S27622 = 1;
  private int S27617 = 1;
  private int S55029 = 1;
  private int S27639 = 1;
  private int S27648 = 1;
  private int S27643 = 1;
  private int S27798 = 1;
  private int S27749 = 1;
  private int S27754 = 1;
  private int S27763 = 1;
  private int S27768 = 1;
  private int S28146 = 1;
  private int S28097 = 1;
  private int S28102 = 1;
  private int S28111 = 1;
  private int S28116 = 1;
  private int S28610 = 1;
  private int S28561 = 1;
  private int S28566 = 1;
  private int S28575 = 1;
  private int S28580 = 1;
  private int S29190 = 1;
  private int S29141 = 1;
  private int S29146 = 1;
  private int S29155 = 1;
  private int S29160 = 1;
  private int S29836 = 1;
  private int S29831 = 1;
  private int S30151 = 1;
  private int S55112 = 1;
  private int S55056 = 1;
  private int S55036 = 1;
  private int S55031 = 1;
  private int S55147 = 1;
  private int S55123 = 1;
  private int S55117 = 1;
  private int S55120 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread202300(int [] tdone, int [] ends){
        S55120=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread202299(int [] tdone, int [] ends){
        S55117=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread202297(int [] tdone, int [] ends){
        switch(S55120){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 557, column: 35
          ends[72]=2;
          tdone[72]=1;
        }
        else {
          active[72]=1;
          ends[72]=1;
          tdone[72]=1;
        }
        break;
      
    }
  }

  public void thread202296(int [] tdone, int [] ends){
        switch(S55117){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
        break;
      
    }
  }

  public void thread202295(int [] tdone, int [] ends){
        switch(S55147){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        switch(S55123){
          case 0 : 
            thread202296(tdone,ends);
            thread202297(tdone,ends);
            int biggest202298 = 0;
            if(ends[71]>=biggest202298){
              biggest202298=ends[71];
            }
            if(ends[72]>=biggest202298){
              biggest202298=ends[72];
            }
            if(biggest202298 == 1){
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            if(biggest202298 == 2){
              ends[70]=2;
              ;//sysj\conveyor_controller.sysj line: 551, column: 18
              S55123=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            //FINXME code
            if(biggest202298 == 0){
              S55123=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            break;
          
          case 1 : 
            S55123=1;
            S55123=0;
            if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 550, column: 26
              thread202299(tdone,ends);
              thread202300(tdone,ends);
              int biggest202301 = 0;
              if(ends[71]>=biggest202301){
                biggest202301=ends[71];
              }
              if(ends[72]>=biggest202301){
                biggest202301=ends[72];
              }
              if(biggest202301 == 1){
                active[70]=1;
                ends[70]=1;
                tdone[70]=1;
              }
            }
            else {
              S55123=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202294(int [] tdone, int [] ends){
        switch(S55112){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        switch(S55056){
          case 0 : 
            switch(S55036){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 539, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
                  S55036=1;
                  active[69]=1;
                  ends[69]=1;
                  tdone[69]=1;
                }
                else {
                  switch(S55031){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 539, column: 12
                        S55031=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
                          ends[69]=2;
                          ;//sysj\conveyor_controller.sysj line: 539, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 540, column: 15
                            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 541, column: 13
                            currsigs.addElement(bottleAtPos2_51);
                            S55056=1;
                            active[69]=1;
                            ends[69]=1;
                            tdone[69]=1;
                          }
                          else {
                            S55056=1;
                            active[69]=1;
                            ends[69]=1;
                            tdone[69]=1;
                          }
                        }
                        else {
                          active[69]=1;
                          ends[69]=1;
                          tdone[69]=1;
                        }
                      }
                      else {
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
                        ends[69]=2;
                        ;//sysj\conveyor_controller.sysj line: 539, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 540, column: 15
                          bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 541, column: 13
                          currsigs.addElement(bottleAtPos2_51);
                          S55056=1;
                          active[69]=1;
                          ends[69]=1;
                          tdone[69]=1;
                        }
                        else {
                          S55056=1;
                          active[69]=1;
                          ends[69]=1;
                          tdone[69]=1;
                        }
                      }
                      else {
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S55036=1;
                S55036=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 539, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
                  S55036=1;
                  active[69]=1;
                  ends[69]=1;
                  tdone[69]=1;
                }
                else {
                  S55031=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 539, column: 12
                    S55031=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
                      ends[69]=2;
                      ;//sysj\conveyor_controller.sysj line: 539, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 540, column: 15
                        bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 541, column: 13
                        currsigs.addElement(bottleAtPos2_51);
                        S55056=1;
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                      else {
                        S55056=1;
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                    }
                    else {
                      active[69]=1;
                      ends[69]=1;
                      tdone[69]=1;
                    }
                  }
                  else {
                    active[69]=1;
                    ends[69]=1;
                    tdone[69]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S55056=1;
            S55056=0;
            S55036=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 539, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
              S55036=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            else {
              S55031=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 539, column: 12
                S55031=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
                  ends[69]=2;
                  ;//sysj\conveyor_controller.sysj line: 539, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 540, column: 15
                    bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 541, column: 13
                    currsigs.addElement(bottleAtPos2_51);
                    S55056=1;
                    active[69]=1;
                    ends[69]=1;
                    tdone[69]=1;
                  }
                  else {
                    S55056=1;
                    active[69]=1;
                    ends[69]=1;
                    tdone[69]=1;
                  }
                }
                else {
                  active[69]=1;
                  ends[69]=1;
                  tdone[69]=1;
                }
              }
              else {
                active[69]=1;
                ends[69]=1;
                tdone[69]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202292(int [] tdone, int [] ends){
        switch(S29160){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 505, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
        break;
      
    }
  }

  public void thread202291(int [] tdone, int [] ends){
        switch(S29155){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 501, column: 32
        currsigs.addElement(valveInletOnOff);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread202289(int [] tdone, int [] ends){
        S29160=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 505, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread202288(int [] tdone, int [] ends){
        S29155=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 500, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 501, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread202286(int [] tdone, int [] ends){
        switch(S29146){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread202285(int [] tdone, int [] ends){
        switch(S29141){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
        break;
      
    }
  }

  public void thread202283(int [] tdone, int [] ends){
        S29160=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 505, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread202282(int [] tdone, int [] ends){
        S29155=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 500, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 501, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread202280(int [] tdone, int [] ends){
        S29146=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread202279(int [] tdone, int [] ends){
        S29141=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread202277(int [] tdone, int [] ends){
        switch(S28580){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 476, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[64]=1;
        ends[64]=1;
        tdone[64]=1;
        break;
      
    }
  }

  public void thread202276(int [] tdone, int [] ends){
        switch(S28575){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 472, column: 32
        currsigs.addElement(valveInletOnOff);
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
        break;
      
    }
  }

  public void thread202274(int [] tdone, int [] ends){
        S29146=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread202273(int [] tdone, int [] ends){
        S29141=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread202271(int [] tdone, int [] ends){
        S28580=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 476, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread202270(int [] tdone, int [] ends){
        S28575=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 471, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 472, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread202268(int [] tdone, int [] ends){
        switch(S28566){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[62]=1;
        ends[62]=1;
        tdone[62]=1;
        break;
      
    }
  }

  public void thread202267(int [] tdone, int [] ends){
        switch(S28561){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[61]=1;
        ends[61]=1;
        tdone[61]=1;
        break;
      
    }
  }

  public void thread202265(int [] tdone, int [] ends){
        S28580=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 476, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread202264(int [] tdone, int [] ends){
        S28575=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 471, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 472, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread202262(int [] tdone, int [] ends){
        S29146=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread202261(int [] tdone, int [] ends){
        S29141=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread202259(int [] tdone, int [] ends){
        S28566=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread202258(int [] tdone, int [] ends){
        S28561=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread202256(int [] tdone, int [] ends){
        switch(S28116){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 446, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
        break;
      
    }
  }

  public void thread202255(int [] tdone, int [] ends){
        switch(S28111){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 442, column: 32
        currsigs.addElement(valveInletOnOff);
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
        break;
      
    }
  }

  public void thread202253(int [] tdone, int [] ends){
        S29146=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread202252(int [] tdone, int [] ends){
        S29141=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread202250(int [] tdone, int [] ends){
        S28566=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread202249(int [] tdone, int [] ends){
        S28561=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread202247(int [] tdone, int [] ends){
        S28116=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 446, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread202246(int [] tdone, int [] ends){
        S28111=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 441, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 442, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread202244(int [] tdone, int [] ends){
        switch(S28102){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
        break;
      
    }
  }

  public void thread202243(int [] tdone, int [] ends){
        switch(S28097){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
        break;
      
    }
  }

  public void thread202241(int [] tdone, int [] ends){
        S28116=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 446, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread202240(int [] tdone, int [] ends){
        S28111=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 441, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 442, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread202238(int [] tdone, int [] ends){
        S29146=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread202237(int [] tdone, int [] ends){
        S29141=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread202235(int [] tdone, int [] ends){
        S28566=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread202234(int [] tdone, int [] ends){
        S28561=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread202232(int [] tdone, int [] ends){
        S28102=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread202231(int [] tdone, int [] ends){
        S28097=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 431, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread202229(int [] tdone, int [] ends){
        switch(S27768){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 416, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread202228(int [] tdone, int [] ends){
        switch(S27763){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 32
        currsigs.addElement(valveInletOnOff);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread202226(int [] tdone, int [] ends){
        S29146=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread202225(int [] tdone, int [] ends){
        S29141=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread202223(int [] tdone, int [] ends){
        S28566=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread202222(int [] tdone, int [] ends){
        S28561=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread202220(int [] tdone, int [] ends){
        S28102=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread202219(int [] tdone, int [] ends){
        S28097=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 431, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread202217(int [] tdone, int [] ends){
        S27768=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 416, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread202216(int [] tdone, int [] ends){
        S27763=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 411, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 32
    currsigs.addElement(valveInletOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread202214(int [] tdone, int [] ends){
        switch(S27754){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
        break;
      
    }
  }

  public void thread202213(int [] tdone, int [] ends){
        switch(S27749){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread202211(int [] tdone, int [] ends){
        S27768=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 416, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread202210(int [] tdone, int [] ends){
        S27763=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 411, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 32
    currsigs.addElement(valveInletOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread202208(int [] tdone, int [] ends){
        S29146=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread202207(int [] tdone, int [] ends){
        S29141=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread202205(int [] tdone, int [] ends){
        S28566=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread202204(int [] tdone, int [] ends){
        S28561=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread202202(int [] tdone, int [] ends){
        S28102=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread202201(int [] tdone, int [] ends){
        S28097=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 431, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread202199(int [] tdone, int [] ends){
        S27754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread202198(int [] tdone, int [] ends){
        S27749=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 401, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread202196(int [] tdone, int [] ends){
        S29146=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread202195(int [] tdone, int [] ends){
        S29141=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread202193(int [] tdone, int [] ends){
        S28566=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread202192(int [] tdone, int [] ends){
        S28561=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread202190(int [] tdone, int [] ends){
        S28102=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread202189(int [] tdone, int [] ends){
        S28097=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 431, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread202187(int [] tdone, int [] ends){
        S27754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread202186(int [] tdone, int [] ends){
        S27749=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 401, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread202184(int [] tdone, int [] ends){
        S29146=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread202183(int [] tdone, int [] ends){
        S29141=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread202181(int [] tdone, int [] ends){
        S28566=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread202180(int [] tdone, int [] ends){
        S28561=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread202178(int [] tdone, int [] ends){
        S28102=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread202177(int [] tdone, int [] ends){
        S28097=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 431, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread202175(int [] tdone, int [] ends){
        S27754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread202174(int [] tdone, int [] ends){
        S27749=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 401, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread202172(int [] tdone, int [] ends){
        S29146=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread202171(int [] tdone, int [] ends){
        S29141=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread202169(int [] tdone, int [] ends){
        S28566=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread202168(int [] tdone, int [] ends){
        S28561=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread202166(int [] tdone, int [] ends){
        S28102=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread202165(int [] tdone, int [] ends){
        S28097=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 431, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread202163(int [] tdone, int [] ends){
        S27754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread202162(int [] tdone, int [] ends){
        S27749=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 401, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread202160(int [] tdone, int [] ends){
        S29146=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread202159(int [] tdone, int [] ends){
        S29141=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread202157(int [] tdone, int [] ends){
        S28566=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread202156(int [] tdone, int [] ends){
        S28561=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread202154(int [] tdone, int [] ends){
        S28102=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread202153(int [] tdone, int [] ends){
        S28097=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 431, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread202151(int [] tdone, int [] ends){
        S27754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread202150(int [] tdone, int [] ends){
        S27749=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 401, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread202149(int [] tdone, int [] ends){
        switch(S55029){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        switch(S27639){
          case 0 : 
            if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 390, column: 26
              S27639=1;
              S27648=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 391, column: 20
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 20
                S27648=1;
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
              else {
                S27643=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 20
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 391, column: 20
                  S27643=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 20
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 391, column: 20
                    S27639=2;
                    __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 374, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 374, column: 9
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 374, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 394, column: 20
                      S27639=3;
                      if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 397, column: 24
                        S27798=0;
                        thread202150(tdone,ends);
                        thread202151(tdone,ends);
                        int biggest202152 = 0;
                        if(ends[53]>=biggest202152){
                          biggest202152=ends[53];
                        }
                        if(ends[54]>=biggest202152){
                          biggest202152=ends[54];
                        }
                        if(biggest202152 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        S27639=4;
                        if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 427, column: 24
                          S28146=0;
                          thread202153(tdone,ends);
                          thread202154(tdone,ends);
                          int biggest202155 = 0;
                          if(ends[57]>=biggest202155){
                            biggest202155=ends[57];
                          }
                          if(ends[58]>=biggest202155){
                            biggest202155=ends[58];
                          }
                          if(biggest202155 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          S27639=5;
                          if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                            S28610=0;
                            thread202156(tdone,ends);
                            thread202157(tdone,ends);
                            int biggest202158 = 0;
                            if(ends[61]>=biggest202158){
                              biggest202158=ends[61];
                            }
                            if(ends[62]>=biggest202158){
                              biggest202158=ends[62];
                            }
                            if(biggest202158 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S27639=6;
                            if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                              S29190=0;
                              thread202159(tdone,ends);
                              thread202160(tdone,ends);
                              int biggest202161 = 0;
                              if(ends[65]>=biggest202161){
                                biggest202161=ends[65];
                              }
                              if(ends[66]>=biggest202161){
                                biggest202161=ends[66];
                              }
                              if(biggest202161 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              order_finished.setPresent();//sysj\conveyor_controller.sysj line: 516, column: 20
                              currsigs.addElement(order_finished);
                              S27639=7;
                              S29836=0;
                              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                                S29836=1;
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                              else {
                                S29831=0;
                                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                                  S29831=1;
                                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                                    ends[52]=2;
                                    ;//sysj\conveyor_controller.sysj line: 518, column: 20
                                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                                    S27639=8;
                                    S30151=0;
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                  else {
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                                else {
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 1 : 
            switch(S27648){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 391, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 20
                  S27648=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  switch(S27643){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 20
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 391, column: 20
                        S27643=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 391, column: 20
                          S27639=2;
                          __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 374, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 374, column: 9
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 374, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 394, column: 20
                            S27639=3;
                            if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 397, column: 24
                              S27798=0;
                              thread202162(tdone,ends);
                              thread202163(tdone,ends);
                              int biggest202164 = 0;
                              if(ends[53]>=biggest202164){
                                biggest202164=ends[53];
                              }
                              if(ends[54]>=biggest202164){
                                biggest202164=ends[54];
                              }
                              if(biggest202164 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S27639=4;
                              if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 427, column: 24
                                S28146=0;
                                thread202165(tdone,ends);
                                thread202166(tdone,ends);
                                int biggest202167 = 0;
                                if(ends[57]>=biggest202167){
                                  biggest202167=ends[57];
                                }
                                if(ends[58]>=biggest202167){
                                  biggest202167=ends[58];
                                }
                                if(biggest202167 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                S27639=5;
                                if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                                  S28610=0;
                                  thread202168(tdone,ends);
                                  thread202169(tdone,ends);
                                  int biggest202170 = 0;
                                  if(ends[61]>=biggest202170){
                                    biggest202170=ends[61];
                                  }
                                  if(ends[62]>=biggest202170){
                                    biggest202170=ends[62];
                                  }
                                  if(biggest202170 == 1){
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                                else {
                                  S27639=6;
                                  if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                                    S29190=0;
                                    thread202171(tdone,ends);
                                    thread202172(tdone,ends);
                                    int biggest202173 = 0;
                                    if(ends[65]>=biggest202173){
                                      biggest202173=ends[65];
                                    }
                                    if(ends[66]>=biggest202173){
                                      biggest202173=ends[66];
                                    }
                                    if(biggest202173 == 1){
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                  }
                                  else {
                                    order_finished.setPresent();//sysj\conveyor_controller.sysj line: 516, column: 20
                                    currsigs.addElement(order_finished);
                                    S27639=7;
                                    S29836=0;
                                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                                      S29836=1;
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                    else {
                                      S29831=0;
                                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                                        S29831=1;
                                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                                          ends[52]=2;
                                          ;//sysj\conveyor_controller.sysj line: 518, column: 20
                                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                                          S27639=8;
                                          S30151=0;
                                          active[52]=1;
                                          ends[52]=1;
                                          tdone[52]=1;
                                        }
                                        else {
                                          active[52]=1;
                                          ends[52]=1;
                                          tdone[52]=1;
                                        }
                                      }
                                      else {
                                        active[52]=1;
                                        ends[52]=1;
                                        tdone[52]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 391, column: 20
                        S27639=2;
                        __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 374, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 374, column: 9
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 374, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 394, column: 20
                          S27639=3;
                          if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 397, column: 24
                            S27798=0;
                            thread202174(tdone,ends);
                            thread202175(tdone,ends);
                            int biggest202176 = 0;
                            if(ends[53]>=biggest202176){
                              biggest202176=ends[53];
                            }
                            if(ends[54]>=biggest202176){
                              biggest202176=ends[54];
                            }
                            if(biggest202176 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S27639=4;
                            if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 427, column: 24
                              S28146=0;
                              thread202177(tdone,ends);
                              thread202178(tdone,ends);
                              int biggest202179 = 0;
                              if(ends[57]>=biggest202179){
                                biggest202179=ends[57];
                              }
                              if(ends[58]>=biggest202179){
                                biggest202179=ends[58];
                              }
                              if(biggest202179 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S27639=5;
                              if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                                S28610=0;
                                thread202180(tdone,ends);
                                thread202181(tdone,ends);
                                int biggest202182 = 0;
                                if(ends[61]>=biggest202182){
                                  biggest202182=ends[61];
                                }
                                if(ends[62]>=biggest202182){
                                  biggest202182=ends[62];
                                }
                                if(biggest202182 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                S27639=6;
                                if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                                  S29190=0;
                                  thread202183(tdone,ends);
                                  thread202184(tdone,ends);
                                  int biggest202185 = 0;
                                  if(ends[65]>=biggest202185){
                                    biggest202185=ends[65];
                                  }
                                  if(ends[66]>=biggest202185){
                                    biggest202185=ends[66];
                                  }
                                  if(biggest202185 == 1){
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                                else {
                                  order_finished.setPresent();//sysj\conveyor_controller.sysj line: 516, column: 20
                                  currsigs.addElement(order_finished);
                                  S27639=7;
                                  S29836=0;
                                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                                    S29836=1;
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                  else {
                                    S29831=0;
                                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                                      S29831=1;
                                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                                        ends[52]=2;
                                        ;//sysj\conveyor_controller.sysj line: 518, column: 20
                                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                                        S27639=8;
                                        S30151=0;
                                        active[52]=1;
                                        ends[52]=1;
                                        tdone[52]=1;
                                      }
                                      else {
                                        active[52]=1;
                                        ends[52]=1;
                                        tdone[52]=1;
                                      }
                                    }
                                    else {
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S27648=1;
                S27648=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 391, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 20
                  S27648=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S27643=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 20
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 391, column: 20
                    S27643=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 20
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 391, column: 20
                      S27639=2;
                      __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 374, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 374, column: 9
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 374, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 394, column: 20
                        S27639=3;
                        if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 397, column: 24
                          S27798=0;
                          thread202186(tdone,ends);
                          thread202187(tdone,ends);
                          int biggest202188 = 0;
                          if(ends[53]>=biggest202188){
                            biggest202188=ends[53];
                          }
                          if(ends[54]>=biggest202188){
                            biggest202188=ends[54];
                          }
                          if(biggest202188 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          S27639=4;
                          if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 427, column: 24
                            S28146=0;
                            thread202189(tdone,ends);
                            thread202190(tdone,ends);
                            int biggest202191 = 0;
                            if(ends[57]>=biggest202191){
                              biggest202191=ends[57];
                            }
                            if(ends[58]>=biggest202191){
                              biggest202191=ends[58];
                            }
                            if(biggest202191 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S27639=5;
                            if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                              S28610=0;
                              thread202192(tdone,ends);
                              thread202193(tdone,ends);
                              int biggest202194 = 0;
                              if(ends[61]>=biggest202194){
                                biggest202194=ends[61];
                              }
                              if(ends[62]>=biggest202194){
                                biggest202194=ends[62];
                              }
                              if(biggest202194 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S27639=6;
                              if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                                S29190=0;
                                thread202195(tdone,ends);
                                thread202196(tdone,ends);
                                int biggest202197 = 0;
                                if(ends[65]>=biggest202197){
                                  biggest202197=ends[65];
                                }
                                if(ends[66]>=biggest202197){
                                  biggest202197=ends[66];
                                }
                                if(biggest202197 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                order_finished.setPresent();//sysj\conveyor_controller.sysj line: 516, column: 20
                                currsigs.addElement(order_finished);
                                S27639=7;
                                S29836=0;
                                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                                  S29836=1;
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                                else {
                                  S29831=0;
                                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                                    S29831=1;
                                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                                      ends[52]=2;
                                      ;//sysj\conveyor_controller.sysj line: 518, column: 20
                                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                                      S27639=8;
                                      S30151=0;
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                    else {
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                  }
                                  else {
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 374, column: 9
              ends[52]=2;
              ;//sysj\conveyor_controller.sysj line: 374, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 394, column: 20
              S27639=3;
              if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 397, column: 24
                S27798=0;
                thread202198(tdone,ends);
                thread202199(tdone,ends);
                int biggest202200 = 0;
                if(ends[53]>=biggest202200){
                  biggest202200=ends[53];
                }
                if(ends[54]>=biggest202200){
                  biggest202200=ends[54];
                }
                if(biggest202200 == 1){
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
              else {
                S27639=4;
                if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 427, column: 24
                  S28146=0;
                  thread202201(tdone,ends);
                  thread202202(tdone,ends);
                  int biggest202203 = 0;
                  if(ends[57]>=biggest202203){
                    biggest202203=ends[57];
                  }
                  if(ends[58]>=biggest202203){
                    biggest202203=ends[58];
                  }
                  if(biggest202203 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  S27639=5;
                  if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                    S28610=0;
                    thread202204(tdone,ends);
                    thread202205(tdone,ends);
                    int biggest202206 = 0;
                    if(ends[61]>=biggest202206){
                      biggest202206=ends[61];
                    }
                    if(ends[62]>=biggest202206){
                      biggest202206=ends[62];
                    }
                    if(biggest202206 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S27639=6;
                    if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                      S29190=0;
                      thread202207(tdone,ends);
                      thread202208(tdone,ends);
                      int biggest202209 = 0;
                      if(ends[65]>=biggest202209){
                        biggest202209=ends[65];
                      }
                      if(ends[66]>=biggest202209){
                        biggest202209=ends[66];
                      }
                      if(biggest202209 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      order_finished.setPresent();//sysj\conveyor_controller.sysj line: 516, column: 20
                      currsigs.addElement(order_finished);
                      S27639=7;
                      S29836=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                        S29836=1;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        S29831=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                          S29831=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 518, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                            S27639=8;
                            S30151=0;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                    }
                  }
                }
              }
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 3 : 
            switch(S27798){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 399, column: 30
                  S27798=1;
                  thread202210(tdone,ends);
                  thread202211(tdone,ends);
                  int biggest202212 = 0;
                  if(ends[55]>=biggest202212){
                    biggest202212=ends[55];
                  }
                  if(ends[56]>=biggest202212){
                    biggest202212=ends[56];
                  }
                  if(biggest202212 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread202213(tdone,ends);
                  thread202214(tdone,ends);
                  int biggest202215 = 0;
                  if(ends[53]>=biggest202215){
                    biggest202215=ends[53];
                  }
                  if(ends[54]>=biggest202215){
                    biggest202215=ends[54];
                  }
                  if(biggest202215 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest202215 == 0){
                    S27798=1;
                    thread202216(tdone,ends);
                    thread202217(tdone,ends);
                    int biggest202218 = 0;
                    if(ends[55]>=biggest202218){
                      biggest202218=ends[55];
                    }
                    if(ends[56]>=biggest202218){
                      biggest202218=ends[56];
                    }
                    if(biggest202218 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 409, column: 30
                  System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 420, column: 24
                  current_thread_52 += (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 421, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 422, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 423, column: 24
                  S27639=4;
                  if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 427, column: 24
                    S28146=0;
                    thread202219(tdone,ends);
                    thread202220(tdone,ends);
                    int biggest202221 = 0;
                    if(ends[57]>=biggest202221){
                      biggest202221=ends[57];
                    }
                    if(ends[58]>=biggest202221){
                      biggest202221=ends[58];
                    }
                    if(biggest202221 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S27639=5;
                    if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                      S28610=0;
                      thread202222(tdone,ends);
                      thread202223(tdone,ends);
                      int biggest202224 = 0;
                      if(ends[61]>=biggest202224){
                        biggest202224=ends[61];
                      }
                      if(ends[62]>=biggest202224){
                        biggest202224=ends[62];
                      }
                      if(biggest202224 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S27639=6;
                      if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                        S29190=0;
                        thread202225(tdone,ends);
                        thread202226(tdone,ends);
                        int biggest202227 = 0;
                        if(ends[65]>=biggest202227){
                          biggest202227=ends[65];
                        }
                        if(ends[66]>=biggest202227){
                          biggest202227=ends[66];
                        }
                        if(biggest202227 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        order_finished.setPresent();//sysj\conveyor_controller.sysj line: 516, column: 20
                        currsigs.addElement(order_finished);
                        S27639=7;
                        S29836=0;
                        if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                          S29836=1;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          S29831=0;
                          if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                            fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                            S29831=1;
                            if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                              fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                              ends[52]=2;
                              ;//sysj\conveyor_controller.sysj line: 518, column: 20
                              System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                              S27639=8;
                              S30151=0;
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                            else {
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                      }
                    }
                  }
                }
                else {
                  thread202228(tdone,ends);
                  thread202229(tdone,ends);
                  int biggest202230 = 0;
                  if(ends[55]>=biggest202230){
                    biggest202230=ends[55];
                  }
                  if(ends[56]>=biggest202230){
                    biggest202230=ends[56];
                  }
                  if(biggest202230 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest202230 == 0){
                    System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 420, column: 24
                    current_thread_52 += (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 421, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 422, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 423, column: 24
                    S27639=4;
                    if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 427, column: 24
                      S28146=0;
                      thread202231(tdone,ends);
                      thread202232(tdone,ends);
                      int biggest202233 = 0;
                      if(ends[57]>=biggest202233){
                        biggest202233=ends[57];
                      }
                      if(ends[58]>=biggest202233){
                        biggest202233=ends[58];
                      }
                      if(biggest202233 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S27639=5;
                      if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                        S28610=0;
                        thread202234(tdone,ends);
                        thread202235(tdone,ends);
                        int biggest202236 = 0;
                        if(ends[61]>=biggest202236){
                          biggest202236=ends[61];
                        }
                        if(ends[62]>=biggest202236){
                          biggest202236=ends[62];
                        }
                        if(biggest202236 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        S27639=6;
                        if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                          S29190=0;
                          thread202237(tdone,ends);
                          thread202238(tdone,ends);
                          int biggest202239 = 0;
                          if(ends[65]>=biggest202239){
                            biggest202239=ends[65];
                          }
                          if(ends[66]>=biggest202239){
                            biggest202239=ends[66];
                          }
                          if(biggest202239 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          order_finished.setPresent();//sysj\conveyor_controller.sysj line: 516, column: 20
                          currsigs.addElement(order_finished);
                          S27639=7;
                          S29836=0;
                          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                            S29836=1;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            S29831=0;
                            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                              S29831=1;
                              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                                ends[52]=2;
                                ;//sysj\conveyor_controller.sysj line: 518, column: 20
                                System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                                S27639=8;
                                S30151=0;
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                              else {
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 4 : 
            switch(S28146){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 429, column: 30
                  S28146=1;
                  thread202240(tdone,ends);
                  thread202241(tdone,ends);
                  int biggest202242 = 0;
                  if(ends[59]>=biggest202242){
                    biggest202242=ends[59];
                  }
                  if(ends[60]>=biggest202242){
                    biggest202242=ends[60];
                  }
                  if(biggest202242 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread202243(tdone,ends);
                  thread202244(tdone,ends);
                  int biggest202245 = 0;
                  if(ends[57]>=biggest202245){
                    biggest202245=ends[57];
                  }
                  if(ends[58]>=biggest202245){
                    biggest202245=ends[58];
                  }
                  if(biggest202245 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest202245 == 0){
                    S28146=1;
                    thread202246(tdone,ends);
                    thread202247(tdone,ends);
                    int biggest202248 = 0;
                    if(ends[59]>=biggest202248){
                      biggest202248=ends[59];
                    }
                    if(ends[60]>=biggest202248){
                      biggest202248=ends[60];
                    }
                    if(biggest202248 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 439, column: 30
                  System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 450, column: 24
                  current_thread_52 += (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 451, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 452, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 453, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 453, column: 24
                  S27639=5;
                  if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                    S28610=0;
                    thread202249(tdone,ends);
                    thread202250(tdone,ends);
                    int biggest202251 = 0;
                    if(ends[61]>=biggest202251){
                      biggest202251=ends[61];
                    }
                    if(ends[62]>=biggest202251){
                      biggest202251=ends[62];
                    }
                    if(biggest202251 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S27639=6;
                    if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                      S29190=0;
                      thread202252(tdone,ends);
                      thread202253(tdone,ends);
                      int biggest202254 = 0;
                      if(ends[65]>=biggest202254){
                        biggest202254=ends[65];
                      }
                      if(ends[66]>=biggest202254){
                        biggest202254=ends[66];
                      }
                      if(biggest202254 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      order_finished.setPresent();//sysj\conveyor_controller.sysj line: 516, column: 20
                      currsigs.addElement(order_finished);
                      S27639=7;
                      S29836=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                        S29836=1;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        S29831=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                          S29831=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 518, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                            S27639=8;
                            S30151=0;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  thread202255(tdone,ends);
                  thread202256(tdone,ends);
                  int biggest202257 = 0;
                  if(ends[59]>=biggest202257){
                    biggest202257=ends[59];
                  }
                  if(ends[60]>=biggest202257){
                    biggest202257=ends[60];
                  }
                  if(biggest202257 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest202257 == 0){
                    System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 450, column: 24
                    current_thread_52 += (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 451, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 452, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 453, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 453, column: 24
                    S27639=5;
                    if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                      S28610=0;
                      thread202258(tdone,ends);
                      thread202259(tdone,ends);
                      int biggest202260 = 0;
                      if(ends[61]>=biggest202260){
                        biggest202260=ends[61];
                      }
                      if(ends[62]>=biggest202260){
                        biggest202260=ends[62];
                      }
                      if(biggest202260 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S27639=6;
                      if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                        S29190=0;
                        thread202261(tdone,ends);
                        thread202262(tdone,ends);
                        int biggest202263 = 0;
                        if(ends[65]>=biggest202263){
                          biggest202263=ends[65];
                        }
                        if(ends[66]>=biggest202263){
                          biggest202263=ends[66];
                        }
                        if(biggest202263 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        order_finished.setPresent();//sysj\conveyor_controller.sysj line: 516, column: 20
                        currsigs.addElement(order_finished);
                        S27639=7;
                        S29836=0;
                        if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                          S29836=1;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          S29831=0;
                          if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                            fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                            S29831=1;
                            if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                              fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                              ends[52]=2;
                              ;//sysj\conveyor_controller.sysj line: 518, column: 20
                              System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                              S27639=8;
                              S30151=0;
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                            else {
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 5 : 
            switch(S28610){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 459, column: 30
                  S28610=1;
                  thread202264(tdone,ends);
                  thread202265(tdone,ends);
                  int biggest202266 = 0;
                  if(ends[63]>=biggest202266){
                    biggest202266=ends[63];
                  }
                  if(ends[64]>=biggest202266){
                    biggest202266=ends[64];
                  }
                  if(biggest202266 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread202267(tdone,ends);
                  thread202268(tdone,ends);
                  int biggest202269 = 0;
                  if(ends[61]>=biggest202269){
                    biggest202269=ends[61];
                  }
                  if(ends[62]>=biggest202269){
                    biggest202269=ends[62];
                  }
                  if(biggest202269 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest202269 == 0){
                    S28610=1;
                    thread202270(tdone,ends);
                    thread202271(tdone,ends);
                    int biggest202272 = 0;
                    if(ends[63]>=biggest202272){
                      biggest202272=ends[63];
                    }
                    if(ends[64]>=biggest202272){
                      biggest202272=ends[64];
                    }
                    if(biggest202272 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 469, column: 30
                  System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 480, column: 24
                  current_thread_52 += (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 481, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 482, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 483, column: 24
                  S27639=6;
                  if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                    S29190=0;
                    thread202273(tdone,ends);
                    thread202274(tdone,ends);
                    int biggest202275 = 0;
                    if(ends[65]>=biggest202275){
                      biggest202275=ends[65];
                    }
                    if(ends[66]>=biggest202275){
                      biggest202275=ends[66];
                    }
                    if(biggest202275 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    order_finished.setPresent();//sysj\conveyor_controller.sysj line: 516, column: 20
                    currsigs.addElement(order_finished);
                    S27639=7;
                    S29836=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                      S29836=1;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      S29831=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                        S29831=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 518, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                          S27639=8;
                          S30151=0;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                  }
                }
                else {
                  thread202276(tdone,ends);
                  thread202277(tdone,ends);
                  int biggest202278 = 0;
                  if(ends[63]>=biggest202278){
                    biggest202278=ends[63];
                  }
                  if(ends[64]>=biggest202278){
                    biggest202278=ends[64];
                  }
                  if(biggest202278 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest202278 == 0){
                    System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 480, column: 24
                    current_thread_52 += (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 481, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 482, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 483, column: 24
                    S27639=6;
                    if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                      S29190=0;
                      thread202279(tdone,ends);
                      thread202280(tdone,ends);
                      int biggest202281 = 0;
                      if(ends[65]>=biggest202281){
                        biggest202281=ends[65];
                      }
                      if(ends[66]>=biggest202281){
                        biggest202281=ends[66];
                      }
                      if(biggest202281 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      order_finished.setPresent();//sysj\conveyor_controller.sysj line: 516, column: 20
                      currsigs.addElement(order_finished);
                      S27639=7;
                      S29836=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                        S29836=1;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        S29831=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                          S29831=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 518, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                            S27639=8;
                            S30151=0;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S29190){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 488, column: 30
                  S29190=1;
                  thread202282(tdone,ends);
                  thread202283(tdone,ends);
                  int biggest202284 = 0;
                  if(ends[67]>=biggest202284){
                    biggest202284=ends[67];
                  }
                  if(ends[68]>=biggest202284){
                    biggest202284=ends[68];
                  }
                  if(biggest202284 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread202285(tdone,ends);
                  thread202286(tdone,ends);
                  int biggest202287 = 0;
                  if(ends[65]>=biggest202287){
                    biggest202287=ends[65];
                  }
                  if(ends[66]>=biggest202287){
                    biggest202287=ends[66];
                  }
                  if(biggest202287 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest202287 == 0){
                    S29190=1;
                    thread202288(tdone,ends);
                    thread202289(tdone,ends);
                    int biggest202290 = 0;
                    if(ends[67]>=biggest202290){
                      biggest202290=ends[67];
                    }
                    if(ends[68]>=biggest202290){
                      biggest202290=ends[68];
                    }
                    if(biggest202290 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 498, column: 30
                  System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 509, column: 24
                  current_thread_52 += (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 510, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 511, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 512, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 512, column: 24
                  order_finished.setPresent();//sysj\conveyor_controller.sysj line: 516, column: 20
                  currsigs.addElement(order_finished);
                  S27639=7;
                  S29836=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                    S29836=1;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  else {
                    S29831=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                      S29831=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 518, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                        S27639=8;
                        S30151=0;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                else {
                  thread202291(tdone,ends);
                  thread202292(tdone,ends);
                  int biggest202293 = 0;
                  if(ends[67]>=biggest202293){
                    biggest202293=ends[67];
                  }
                  if(ends[68]>=biggest202293){
                    biggest202293=ends[68];
                  }
                  if(biggest202293 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest202293 == 0){
                    System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 509, column: 24
                    current_thread_52 += (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 510, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 511, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 512, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 512, column: 24
                    order_finished.setPresent();//sysj\conveyor_controller.sysj line: 516, column: 20
                    currsigs.addElement(order_finished);
                    S27639=7;
                    S29836=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                      S29836=1;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      S29831=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                        S29831=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 518, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                          S27639=8;
                          S30151=0;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 7 : 
            switch(S29836){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                  S29836=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  switch(S29831){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                        S29831=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 518, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                          S27639=8;
                          S30151=0;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 518, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                        S27639=8;
                        S30151=0;
                        active[52]=1;
                        ends[52]=1;
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
                break;
              
              case 1 : 
                S29836=1;
                S29836=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 518, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                  S29836=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S29831=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 518, column: 20
                    S29831=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 518, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 518, column: 20
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 518, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 519, column: 20
                      S27639=8;
                      S30151=0;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S30151){
              case 0 : 
                if(!bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 522, column: 30
                  S30151=1;
                  if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 524, column: 36
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  else {
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 521, column: 20
                    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 8
                    currsigs.addElement(filler1_amount_51);
                    filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 383, column: 8
                    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 8
                    currsigs.addElement(filler2_amount_51);
                    filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 384, column: 8
                    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 8
                    currsigs.addElement(filler3_amount_51);
                    filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 385, column: 8
                    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 8
                    currsigs.addElement(filler4_amount_51);
                    filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 386, column: 8
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 389, column: 20
                    S27639=0;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 524, column: 36
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  ends[52]=2;
                  ;//sysj\conveyor_controller.sysj line: 521, column: 20
                  filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 8
                  currsigs.addElement(filler1_amount_51);
                  filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 383, column: 8
                  filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 8
                  currsigs.addElement(filler2_amount_51);
                  filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 384, column: 8
                  filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 8
                  currsigs.addElement(filler3_amount_51);
                  filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 385, column: 8
                  filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 8
                  currsigs.addElement(filler4_amount_51);
                  filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 386, column: 8
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 389, column: 20
                  S27639=0;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202146(int [] tdone, int [] ends){
        S55120=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread202145(int [] tdone, int [] ends){
        S55117=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread202144(int [] tdone, int [] ends){
        S55147=1;
    S55123=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 550, column: 26
      thread202145(tdone,ends);
      thread202146(tdone,ends);
      int biggest202147 = 0;
      if(ends[71]>=biggest202147){
        biggest202147=ends[71];
      }
      if(ends[72]>=biggest202147){
        biggest202147=ends[72];
      }
      if(biggest202147 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S55123=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread202143(int [] tdone, int [] ends){
        S55112=1;
    S55056=0;
    S55036=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 539, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
      S55036=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S55031=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 539, column: 12
        S55031=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 539, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 540, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 541, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S55056=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S55056=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread202142(int [] tdone, int [] ends){
        S55029=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 375, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 376, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 377, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 377, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 378, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 378, column: 16
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 8
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 383, column: 8
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 8
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 384, column: 8
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 8
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 385, column: 8
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 8
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 386, column: 8
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 389, column: 20
    S27639=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread202139(int [] tdone, int [] ends){
        S55120=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread202138(int [] tdone, int [] ends){
        S55117=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread202137(int [] tdone, int [] ends){
        S55147=1;
    S55123=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 550, column: 26
      thread202138(tdone,ends);
      thread202139(tdone,ends);
      int biggest202140 = 0;
      if(ends[71]>=biggest202140){
        biggest202140=ends[71];
      }
      if(ends[72]>=biggest202140){
        biggest202140=ends[72];
      }
      if(biggest202140 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S55123=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread202136(int [] tdone, int [] ends){
        S55112=1;
    S55056=0;
    S55036=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 539, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
      S55036=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S55031=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 539, column: 12
        S55031=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 539, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 540, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 541, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S55056=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S55056=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread202135(int [] tdone, int [] ends){
        S55029=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 375, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 376, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 377, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 377, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 378, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 378, column: 16
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 8
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 383, column: 8
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 8
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 384, column: 8
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 8
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 385, column: 8
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 8
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 386, column: 8
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 389, column: 20
    S27639=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread202132(int [] tdone, int [] ends){
        S55120=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread202131(int [] tdone, int [] ends){
        S55117=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread202130(int [] tdone, int [] ends){
        S55147=1;
    S55123=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 550, column: 26
      thread202131(tdone,ends);
      thread202132(tdone,ends);
      int biggest202133 = 0;
      if(ends[71]>=biggest202133){
        biggest202133=ends[71];
      }
      if(ends[72]>=biggest202133){
        biggest202133=ends[72];
      }
      if(biggest202133 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S55123=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread202129(int [] tdone, int [] ends){
        S55112=1;
    S55056=0;
    S55036=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 539, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
      S55036=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S55031=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 539, column: 12
        S55031=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 539, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 540, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 541, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S55056=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S55056=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread202128(int [] tdone, int [] ends){
        S55029=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 375, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 376, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 377, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 377, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 378, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 378, column: 16
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 8
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 383, column: 8
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 8
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 384, column: 8
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 8
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 385, column: 8
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 8
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 386, column: 8
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 389, column: 20
    S27639=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread202125(int [] tdone, int [] ends){
        S55120=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread202124(int [] tdone, int [] ends){
        S55117=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread202123(int [] tdone, int [] ends){
        S55147=1;
    S55123=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 550, column: 26
      thread202124(tdone,ends);
      thread202125(tdone,ends);
      int biggest202126 = 0;
      if(ends[71]>=biggest202126){
        biggest202126=ends[71];
      }
      if(ends[72]>=biggest202126){
        biggest202126=ends[72];
      }
      if(biggest202126 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S55123=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread202122(int [] tdone, int [] ends){
        S55112=1;
    S55056=0;
    S55036=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 539, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
      S55036=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S55031=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 539, column: 12
        S55031=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 539, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 539, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 539, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 540, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 541, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S55056=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S55056=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread202121(int [] tdone, int [] ends){
        S55029=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 375, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 376, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 377, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 377, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 378, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 378, column: 16
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 8
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 383, column: 8
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 8
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 384, column: 8
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 8
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 385, column: 8
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 8
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 386, column: 8
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 389, column: 20
    S27639=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S137679){
        case 0 : 
          S137679=0;
          break RUN;
        
        case 1 : 
          S137679=2;
          S137679=2;
          filler1_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler2_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler3_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler4_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler1_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          filler2_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          filler3_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          filler4_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          current_fill_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          total_fill_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          bottleAtPos2_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          S137678=0;
          S27622=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 372, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 372, column: 9
            S27622=1;
            active[51]=1;
            ends[51]=1;
            break RUN;
          }
          else {
            S27617=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 372, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 372, column: 9
              S27617=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 372, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 372, column: 9
                ends[51]=2;
                ;//sysj\conveyor_controller.sysj line: 372, column: 9
                S137678=1;
                thread202121(tdone,ends);
                thread202122(tdone,ends);
                thread202123(tdone,ends);
                int biggest202127 = 0;
                if(ends[52]>=biggest202127){
                  biggest202127=ends[52];
                }
                if(ends[69]>=biggest202127){
                  biggest202127=ends[69];
                }
                if(ends[70]>=biggest202127){
                  biggest202127=ends[70];
                }
                if(biggest202127 == 1){
                  active[51]=1;
                  ends[51]=1;
                  break RUN;
                }
              }
              else {
                active[51]=1;
                ends[51]=1;
                break RUN;
              }
            }
            else {
              active[51]=1;
              ends[51]=1;
              break RUN;
            }
          }
        
        case 2 : 
          filler1_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler2_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler3_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler4_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler1_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          filler2_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          filler3_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          filler4_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          current_fill_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          total_fill_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          bottleAtPos2_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          switch(S137678){
            case 0 : 
              switch(S27622){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 372, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 372, column: 9
                    S27622=1;
                    active[51]=1;
                    ends[51]=1;
                    break RUN;
                  }
                  else {
                    switch(S27617){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 372, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 372, column: 9
                          S27617=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 372, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 372, column: 9
                            ends[51]=2;
                            ;//sysj\conveyor_controller.sysj line: 372, column: 9
                            S137678=1;
                            thread202128(tdone,ends);
                            thread202129(tdone,ends);
                            thread202130(tdone,ends);
                            int biggest202134 = 0;
                            if(ends[52]>=biggest202134){
                              biggest202134=ends[52];
                            }
                            if(ends[69]>=biggest202134){
                              biggest202134=ends[69];
                            }
                            if(ends[70]>=biggest202134){
                              biggest202134=ends[70];
                            }
                            if(biggest202134 == 1){
                              active[51]=1;
                              ends[51]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[51]=1;
                            ends[51]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 372, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 372, column: 9
                          ends[51]=2;
                          ;//sysj\conveyor_controller.sysj line: 372, column: 9
                          S137678=1;
                          thread202135(tdone,ends);
                          thread202136(tdone,ends);
                          thread202137(tdone,ends);
                          int biggest202141 = 0;
                          if(ends[52]>=biggest202141){
                            biggest202141=ends[52];
                          }
                          if(ends[69]>=biggest202141){
                            biggest202141=ends[69];
                          }
                          if(ends[70]>=biggest202141){
                            biggest202141=ends[70];
                          }
                          if(biggest202141 == 1){
                            active[51]=1;
                            ends[51]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S27622=1;
                  S27622=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 372, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 372, column: 9
                    S27622=1;
                    active[51]=1;
                    ends[51]=1;
                    break RUN;
                  }
                  else {
                    S27617=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 372, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 372, column: 9
                      S27617=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 372, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 372, column: 9
                        ends[51]=2;
                        ;//sysj\conveyor_controller.sysj line: 372, column: 9
                        S137678=1;
                        thread202142(tdone,ends);
                        thread202143(tdone,ends);
                        thread202144(tdone,ends);
                        int biggest202148 = 0;
                        if(ends[52]>=biggest202148){
                          biggest202148=ends[52];
                        }
                        if(ends[69]>=biggest202148){
                          biggest202148=ends[69];
                        }
                        if(ends[70]>=biggest202148){
                          biggest202148=ends[70];
                        }
                        if(biggest202148 == 1){
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[51]=1;
                        ends[51]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[51]=1;
                      ends[51]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread202149(tdone,ends);
              thread202294(tdone,ends);
              thread202295(tdone,ends);
              int biggest202302 = 0;
              if(ends[52]>=biggest202302){
                biggest202302=ends[52];
              }
              if(ends[69]>=biggest202302){
                biggest202302=ends[69];
              }
              if(ends[70]>=biggest202302){
                biggest202302=ends[70];
              }
              if(biggest202302 == 1){
                active[51]=1;
                ends[51]=1;
                break RUN;
              }
              //FINXME code
              if(biggest202302 == 0){
                S137679=0;
                active[51]=0;
                ends[51]=0;
                S137679=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    filler1_51 = new Signal();
    filler2_51 = new Signal();
    filler3_51 = new Signal();
    filler4_51 = new Signal();
    filler1_amount_51 = new Signal();
    filler2_amount_51 = new Signal();
    filler3_amount_51 = new Signal();
    filler4_amount_51 = new Signal();
    current_fill_51 = new Signal();
    total_fill_51 = new Signal();
    bottleAtPos2_51 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[51] != 0){
      int index = 51;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[51]!=0 || suspended[51]!=0 || active[51]!=1);
      else{
        if(!df){
          simFiller_in.gethook();
          fillerReady_o.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          fileReadSignal.gethook();
          ordered.gethook();
          orderFill_1.gethook();
          orderFill_2.gethook();
          orderFill_3.gethook();
          orderFill_4.gethook();
          df = true;
        }
        runClockDomain();
      }
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      fileReadSignal.setpreclear();
      ordered.setpreclear();
      orderFill_1.setpreclear();
      orderFill_2.setpreclear();
      orderFill_3.setpreclear();
      orderFill_4.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      bottleAtPos2E.setpreclear();
      order_finished.setpreclear();
      filler1_51.setpreclear();
      filler2_51.setpreclear();
      filler3_51.setpreclear();
      filler4_51.setpreclear();
      filler1_amount_51.setpreclear();
      filler2_amount_51.setpreclear();
      filler3_amount_51.setpreclear();
      filler4_amount_51.setpreclear();
      current_fill_51.setpreclear();
      total_fill_51.setpreclear();
      bottleAtPos2_51.setpreclear();
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
      dummyint = fileReadSignal.getStatus() ? fileReadSignal.setprepresent() : fileReadSignal.setpreclear();
      fileReadSignal.setpreval(fileReadSignal.getValue());
      fileReadSignal.setClear();
      dummyint = ordered.getStatus() ? ordered.setprepresent() : ordered.setpreclear();
      ordered.setpreval(ordered.getValue());
      ordered.setClear();
      dummyint = orderFill_1.getStatus() ? orderFill_1.setprepresent() : orderFill_1.setpreclear();
      orderFill_1.setpreval(orderFill_1.getValue());
      orderFill_1.setClear();
      dummyint = orderFill_2.getStatus() ? orderFill_2.setprepresent() : orderFill_2.setpreclear();
      orderFill_2.setpreval(orderFill_2.getValue());
      orderFill_2.setClear();
      dummyint = orderFill_3.getStatus() ? orderFill_3.setprepresent() : orderFill_3.setpreclear();
      orderFill_3.setpreval(orderFill_3.getValue());
      orderFill_3.setClear();
      dummyint = orderFill_4.getStatus() ? orderFill_4.setprepresent() : orderFill_4.setpreclear();
      orderFill_4.setpreval(orderFill_4.getValue());
      orderFill_4.setClear();
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
      order_finished.sethook();
      order_finished.setClear();
      filler1_51.setClear();
      filler2_51.setClear();
      filler3_51.setClear();
      filler4_51.setClear();
      filler1_amount_51.setClear();
      filler2_amount_51.setClear();
      filler3_amount_51.setClear();
      filler4_amount_51.setClear();
      current_fill_51.setClear();
      total_fill_51.setClear();
      bottleAtPos2_51.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[51]!=0 || suspended[51]!=0 || active[51]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        fileReadSignal.gethook();
        ordered.gethook();
        orderFill_1.gethook();
        orderFill_2.gethook();
        orderFill_3.gethook();
        orderFill_4.gethook();
      }
      runFinisher();
      if(active[51] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

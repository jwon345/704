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
  private Signal filler1_51;
  private Signal filler2_51;
  private Signal filler3_51;
  private Signal filler4_51;
  private Signal bottleAtPos2_51;
  private long __start_thread_52;//sysj\conveyor_controller.sysj line: 377, column: 9
  private int S36913 = 1;
  private int S36912 = 1;
  private int S29016 = 1;
  private int S29011 = 1;
  private int S30883 = 1;
  private int S29034 = 1;
  private int S29041 = 1;
  private int S29036 = 1;
  private int S29142 = 1;
  private int S29147 = 1;
  private int S29226 = 1;
  private int S29231 = 1;
  private int S29267 = 1;
  private int S29262 = 1;
  private int S29340 = 1;
  private int S30966 = 1;
  private int S30910 = 1;
  private int S30890 = 1;
  private int S30885 = 1;
  private int S31001 = 1;
  private int S30977 = 1;
  private int S30971 = 1;
  private int S30974 = 1;
  
  private int[] ends = new int[88];
  private int[] tdone = new int[88];
  
  public void thread101407(int [] tdone, int [] ends){
        S30974=1;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread101406(int [] tdone, int [] ends){
        S30971=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 445, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread101404(int [] tdone, int [] ends){
        switch(S30974){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 449, column: 35
          ends[60]=2;
          tdone[60]=1;
        }
        else {
          active[60]=1;
          ends[60]=1;
          tdone[60]=1;
        }
        break;
      
    }
  }

  public void thread101403(int [] tdone, int [] ends){
        switch(S30971){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 445, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
        break;
      
    }
  }

  public void thread101402(int [] tdone, int [] ends){
        switch(S31001){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        switch(S30977){
          case 0 : 
            thread101403(tdone,ends);
            thread101404(tdone,ends);
            int biggest101405 = 0;
            if(ends[59]>=biggest101405){
              biggest101405=ends[59];
            }
            if(ends[60]>=biggest101405){
              biggest101405=ends[60];
            }
            if(biggest101405 == 1){
              active[58]=1;
              ends[58]=1;
              tdone[58]=1;
            }
            if(biggest101405 == 2){
              ends[58]=2;
              ;//sysj\conveyor_controller.sysj line: 443, column: 18
              S30977=1;
              active[58]=1;
              ends[58]=1;
              tdone[58]=1;
            }
            //FINXME code
            if(biggest101405 == 0){
              S30977=1;
              active[58]=1;
              ends[58]=1;
              tdone[58]=1;
            }
            break;
          
          case 1 : 
            S30977=1;
            S30977=0;
            if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 442, column: 26
              thread101406(tdone,ends);
              thread101407(tdone,ends);
              int biggest101408 = 0;
              if(ends[59]>=biggest101408){
                biggest101408=ends[59];
              }
              if(ends[60]>=biggest101408){
                biggest101408=ends[60];
              }
              if(biggest101408 == 1){
                active[58]=1;
                ends[58]=1;
                tdone[58]=1;
              }
            }
            else {
              S30977=1;
              active[58]=1;
              ends[58]=1;
              tdone[58]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread101401(int [] tdone, int [] ends){
        switch(S30966){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        switch(S30910){
          case 0 : 
            switch(S30890){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 431, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
                  S30890=1;
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                else {
                  switch(S30885){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 431, column: 12
                        S30885=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
                          ends[57]=2;
                          ;//sysj\conveyor_controller.sysj line: 431, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 432, column: 15
                            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 433, column: 13
                            currsigs.addElement(bottleAtPos2_51);
                            S30910=1;
                            active[57]=1;
                            ends[57]=1;
                            tdone[57]=1;
                          }
                          else {
                            S30910=1;
                            active[57]=1;
                            ends[57]=1;
                            tdone[57]=1;
                          }
                        }
                        else {
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                      }
                      else {
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
                        ends[57]=2;
                        ;//sysj\conveyor_controller.sysj line: 431, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 432, column: 15
                          bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 433, column: 13
                          currsigs.addElement(bottleAtPos2_51);
                          S30910=1;
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                        else {
                          S30910=1;
                          active[57]=1;
                          ends[57]=1;
                          tdone[57]=1;
                        }
                      }
                      else {
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S30890=1;
                S30890=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 431, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
                  S30890=1;
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
                else {
                  S30885=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 431, column: 12
                    S30885=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
                      ends[57]=2;
                      ;//sysj\conveyor_controller.sysj line: 431, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 432, column: 15
                        bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 433, column: 13
                        currsigs.addElement(bottleAtPos2_51);
                        S30910=1;
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                      else {
                        S30910=1;
                        active[57]=1;
                        ends[57]=1;
                        tdone[57]=1;
                      }
                    }
                    else {
                      active[57]=1;
                      ends[57]=1;
                      tdone[57]=1;
                    }
                  }
                  else {
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S30910=1;
            S30910=0;
            S30890=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 431, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
              S30890=1;
              active[57]=1;
              ends[57]=1;
              tdone[57]=1;
            }
            else {
              S30885=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 431, column: 12
                S30885=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
                  ends[57]=2;
                  ;//sysj\conveyor_controller.sysj line: 431, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 432, column: 15
                    bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 433, column: 13
                    currsigs.addElement(bottleAtPos2_51);
                    S30910=1;
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                  else {
                    S30910=1;
                    active[57]=1;
                    ends[57]=1;
                    tdone[57]=1;
                  }
                }
                else {
                  active[57]=1;
                  ends[57]=1;
                  tdone[57]=1;
                }
              }
              else {
                active[57]=1;
                ends[57]=1;
                tdone[57]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread101399(int [] tdone, int [] ends){
        switch(S29231){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 13
        currsigs.addElement(dosUnitValveExtend);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread101398(int [] tdone, int [] ends){
        switch(S29226){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 13
        currsigs.addElement(valveInletOnOff);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread101396(int [] tdone, int [] ends){
        S29231=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread101395(int [] tdone, int [] ends){
        S29226=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 401, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 13
    currsigs.addElement(valveInletOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread101393(int [] tdone, int [] ends){
        switch(S29147){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 13
        currsigs.addElement(dosUnitValveRetract);
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
        break;
      
    }
  }

  public void thread101392(int [] tdone, int [] ends){
        switch(S29142){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 13
        currsigs.addElement(valveInjectorOnOff);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread101390(int [] tdone, int [] ends){
        S29231=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread101389(int [] tdone, int [] ends){
        S29226=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 401, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 13
    currsigs.addElement(valveInletOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread101387(int [] tdone, int [] ends){
        S29147=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread101386(int [] tdone, int [] ends){
        S29142=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 390, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread101384(int [] tdone, int [] ends){
        S29147=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread101383(int [] tdone, int [] ends){
        S29142=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 390, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread101381(int [] tdone, int [] ends){
        S29147=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread101380(int [] tdone, int [] ends){
        S29142=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 390, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread101378(int [] tdone, int [] ends){
        S29147=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread101377(int [] tdone, int [] ends){
        S29142=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 390, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread101375(int [] tdone, int [] ends){
        S29147=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread101374(int [] tdone, int [] ends){
        S29142=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 390, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread101373(int [] tdone, int [] ends){
        switch(S30883){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        switch(S29034){
          case 0 : 
            if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 380, column: 17
              S29034=1;
              S29041=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 381, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 381, column: 11
                S29041=1;
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
              else {
                S29036=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 381, column: 11
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 381, column: 11
                  S29036=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 381, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 381, column: 11
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 381, column: 11
                    S29034=2;
                    __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 377, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 377, column: 9
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 377, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 384, column: 11
                      S29034=3;
                      thread101374(tdone,ends);
                      thread101375(tdone,ends);
                      int biggest101376 = 0;
                      if(ends[53]>=biggest101376){
                        biggest101376=ends[53];
                      }
                      if(ends[54]>=biggest101376){
                        biggest101376=ends[54];
                      }
                      if(biggest101376 == 1){
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
            switch(S29041){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 381, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 381, column: 11
                  S29041=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  switch(S29036){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 381, column: 11
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 381, column: 11
                        S29036=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 381, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 381, column: 11
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 381, column: 11
                          S29034=2;
                          __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 377, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 377, column: 9
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 377, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 384, column: 11
                            S29034=3;
                            thread101377(tdone,ends);
                            thread101378(tdone,ends);
                            int biggest101379 = 0;
                            if(ends[53]>=biggest101379){
                              biggest101379=ends[53];
                            }
                            if(ends[54]>=biggest101379){
                              biggest101379=ends[54];
                            }
                            if(biggest101379 == 1){
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
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 381, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 381, column: 11
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 381, column: 11
                        S29034=2;
                        __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 377, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 377, column: 9
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 377, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 384, column: 11
                          S29034=3;
                          thread101380(tdone,ends);
                          thread101381(tdone,ends);
                          int biggest101382 = 0;
                          if(ends[53]>=biggest101382){
                            biggest101382=ends[53];
                          }
                          if(ends[54]>=biggest101382){
                            biggest101382=ends[54];
                          }
                          if(biggest101382 == 1){
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
                    
                  }
                }
                break;
              
              case 1 : 
                S29041=1;
                S29041=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 381, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 381, column: 11
                  S29041=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S29036=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 381, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 381, column: 11
                    S29036=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 381, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 381, column: 11
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 381, column: 11
                      S29034=2;
                      __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 377, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 377, column: 9
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 377, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 384, column: 11
                        S29034=3;
                        thread101383(tdone,ends);
                        thread101384(tdone,ends);
                        int biggest101385 = 0;
                        if(ends[53]>=biggest101385){
                          biggest101385=ends[53];
                        }
                        if(ends[54]>=biggest101385){
                          biggest101385=ends[54];
                        }
                        if(biggest101385 == 1){
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
            if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 377, column: 9
              ends[52]=2;
              ;//sysj\conveyor_controller.sysj line: 377, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 384, column: 11
              S29034=3;
              thread101386(tdone,ends);
              thread101387(tdone,ends);
              int biggest101388 = 0;
              if(ends[53]>=biggest101388){
                biggest101388=ends[53];
              }
              if(ends[54]>=biggest101388){
                biggest101388=ends[54];
              }
              if(biggest101388 == 1){
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
          
          case 3 : 
            if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 388, column: 17
              S29034=4;
              thread101389(tdone,ends);
              thread101390(tdone,ends);
              int biggest101391 = 0;
              if(ends[55]>=biggest101391){
                biggest101391=ends[55];
              }
              if(ends[56]>=biggest101391){
                biggest101391=ends[56];
              }
              if(biggest101391 == 1){
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
            }
            else {
              thread101392(tdone,ends);
              thread101393(tdone,ends);
              int biggest101394 = 0;
              if(ends[53]>=biggest101394){
                biggest101394=ends[53];
              }
              if(ends[54]>=biggest101394){
                biggest101394=ends[54];
              }
              if(biggest101394 == 1){
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
              //FINXME code
              if(biggest101394 == 0){
                S29034=4;
                thread101395(tdone,ends);
                thread101396(tdone,ends);
                int biggest101397 = 0;
                if(ends[55]>=biggest101397){
                  biggest101397=ends[55];
                }
                if(ends[56]>=biggest101397){
                  biggest101397=ends[56];
                }
                if(biggest101397 == 1){
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
            }
            break;
          
          case 4 : 
            if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 399, column: 17
              S29034=5;
              S29267=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 411, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 411, column: 11
                S29267=1;
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
              else {
                S29262=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 411, column: 11
                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 411, column: 11
                  S29262=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 411, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 411, column: 11
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 411, column: 11
                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 412, column: 11
                    S29034=6;
                    S29340=0;
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
              thread101398(tdone,ends);
              thread101399(tdone,ends);
              int biggest101400 = 0;
              if(ends[55]>=biggest101400){
                biggest101400=ends[55];
              }
              if(ends[56]>=biggest101400){
                biggest101400=ends[56];
              }
              if(biggest101400 == 1){
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
              //FINXME code
              if(biggest101400 == 0){
                S29034=5;
                S29267=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 411, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 411, column: 11
                  S29267=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S29262=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 411, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 411, column: 11
                    S29262=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 411, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 411, column: 11
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 411, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 412, column: 11
                      S29034=6;
                      S29340=0;
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
          
          case 5 : 
            switch(S29267){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 411, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 411, column: 11
                  S29267=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  switch(S29262){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 411, column: 11
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 411, column: 11
                        S29262=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 411, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 411, column: 11
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 411, column: 11
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 412, column: 11
                          S29034=6;
                          S29340=0;
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
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 411, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 411, column: 11
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 411, column: 11
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 412, column: 11
                        S29034=6;
                        S29340=0;
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
                S29267=1;
                S29267=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 411, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 411, column: 11
                  S29267=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S29262=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 411, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 411, column: 11
                    S29262=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 411, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 411, column: 11
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 411, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 412, column: 11
                      S29034=6;
                      S29340=0;
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
          
          case 6 : 
            switch(S29340){
              case 0 : 
                if(!bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 415, column: 18
                  S29340=1;
                  if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 417, column: 21
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  else {
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 414, column: 11
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 379, column: 14
                    S29034=0;
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
                if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 417, column: 21
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  ends[52]=2;
                  ;//sysj\conveyor_controller.sysj line: 414, column: 11
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 379, column: 14
                  S29034=0;
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

  public void thread101370(int [] tdone, int [] ends){
        S30974=1;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread101369(int [] tdone, int [] ends){
        S30971=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 445, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread101368(int [] tdone, int [] ends){
        S31001=1;
    S30977=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 442, column: 26
      thread101369(tdone,ends);
      thread101370(tdone,ends);
      int biggest101371 = 0;
      if(ends[59]>=biggest101371){
        biggest101371=ends[59];
      }
      if(ends[60]>=biggest101371){
        biggest101371=ends[60];
      }
      if(biggest101371 == 1){
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
      }
    }
    else {
      S30977=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread101367(int [] tdone, int [] ends){
        S30966=1;
    S30910=0;
    S30890=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 431, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
      S30890=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      S30885=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 431, column: 12
        S30885=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
          ends[57]=2;
          ;//sysj\conveyor_controller.sysj line: 431, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 432, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 433, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S30910=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
          else {
            S30910=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        else {
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
      }
      else {
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
  }

  public void thread101366(int [] tdone, int [] ends){
        S30883=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 379, column: 14
    S29034=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread101363(int [] tdone, int [] ends){
        S30974=1;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread101362(int [] tdone, int [] ends){
        S30971=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 445, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread101361(int [] tdone, int [] ends){
        S31001=1;
    S30977=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 442, column: 26
      thread101362(tdone,ends);
      thread101363(tdone,ends);
      int biggest101364 = 0;
      if(ends[59]>=biggest101364){
        biggest101364=ends[59];
      }
      if(ends[60]>=biggest101364){
        biggest101364=ends[60];
      }
      if(biggest101364 == 1){
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
      }
    }
    else {
      S30977=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread101360(int [] tdone, int [] ends){
        S30966=1;
    S30910=0;
    S30890=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 431, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
      S30890=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      S30885=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 431, column: 12
        S30885=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
          ends[57]=2;
          ;//sysj\conveyor_controller.sysj line: 431, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 432, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 433, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S30910=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
          else {
            S30910=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        else {
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
      }
      else {
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
  }

  public void thread101359(int [] tdone, int [] ends){
        S30883=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 379, column: 14
    S29034=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread101356(int [] tdone, int [] ends){
        S30974=1;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread101355(int [] tdone, int [] ends){
        S30971=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 445, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread101354(int [] tdone, int [] ends){
        S31001=1;
    S30977=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 442, column: 26
      thread101355(tdone,ends);
      thread101356(tdone,ends);
      int biggest101357 = 0;
      if(ends[59]>=biggest101357){
        biggest101357=ends[59];
      }
      if(ends[60]>=biggest101357){
        biggest101357=ends[60];
      }
      if(biggest101357 == 1){
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
      }
    }
    else {
      S30977=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread101353(int [] tdone, int [] ends){
        S30966=1;
    S30910=0;
    S30890=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 431, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
      S30890=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      S30885=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 431, column: 12
        S30885=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
          ends[57]=2;
          ;//sysj\conveyor_controller.sysj line: 431, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 432, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 433, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S30910=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
          else {
            S30910=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        else {
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
      }
      else {
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
  }

  public void thread101352(int [] tdone, int [] ends){
        S30883=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 379, column: 14
    S29034=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread101349(int [] tdone, int [] ends){
        S30974=1;
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread101348(int [] tdone, int [] ends){
        S30971=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 445, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread101347(int [] tdone, int [] ends){
        S31001=1;
    S30977=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 442, column: 26
      thread101348(tdone,ends);
      thread101349(tdone,ends);
      int biggest101350 = 0;
      if(ends[59]>=biggest101350){
        biggest101350=ends[59];
      }
      if(ends[60]>=biggest101350){
        biggest101350=ends[60];
      }
      if(biggest101350 == 1){
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
      }
    }
    else {
      S30977=1;
      active[58]=1;
      ends[58]=1;
      tdone[58]=1;
    }
  }

  public void thread101346(int [] tdone, int [] ends){
        S30966=1;
    S30910=0;
    S30890=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 431, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
      S30890=1;
      active[57]=1;
      ends[57]=1;
      tdone[57]=1;
    }
    else {
      S30885=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 431, column: 12
        S30885=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 431, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 431, column: 12
          ends[57]=2;
          ;//sysj\conveyor_controller.sysj line: 431, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 432, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 433, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S30910=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
          else {
            S30910=1;
            active[57]=1;
            ends[57]=1;
            tdone[57]=1;
          }
        }
        else {
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
      }
      else {
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
      }
    }
  }

  public void thread101345(int [] tdone, int [] ends){
        S30883=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 379, column: 14
    S29034=0;
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
      switch(S36913){
        case 0 : 
          S36913=0;
          break RUN;
        
        case 1 : 
          S36913=2;
          S36913=2;
          filler1_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          filler2_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          filler3_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          filler4_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          bottleAtPos2_51.setClear();//sysj\conveyor_controller.sysj line: 372, column: 9
          S36912=0;
          S29016=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 374, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 374, column: 9
            S29016=1;
            active[51]=1;
            ends[51]=1;
            break RUN;
          }
          else {
            S29011=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 374, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 374, column: 9
              S29011=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 374, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 374, column: 9
                ends[51]=2;
                ;//sysj\conveyor_controller.sysj line: 374, column: 9
                S36912=1;
                thread101345(tdone,ends);
                thread101346(tdone,ends);
                thread101347(tdone,ends);
                int biggest101351 = 0;
                if(ends[52]>=biggest101351){
                  biggest101351=ends[52];
                }
                if(ends[57]>=biggest101351){
                  biggest101351=ends[57];
                }
                if(ends[58]>=biggest101351){
                  biggest101351=ends[58];
                }
                if(biggest101351 == 1){
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
          filler1_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          filler2_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          filler3_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          filler4_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          bottleAtPos2_51.setClear();//sysj\conveyor_controller.sysj line: 372, column: 9
          switch(S36912){
            case 0 : 
              switch(S29016){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 374, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 374, column: 9
                    S29016=1;
                    active[51]=1;
                    ends[51]=1;
                    break RUN;
                  }
                  else {
                    switch(S29011){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 374, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 374, column: 9
                          S29011=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 374, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 374, column: 9
                            ends[51]=2;
                            ;//sysj\conveyor_controller.sysj line: 374, column: 9
                            S36912=1;
                            thread101352(tdone,ends);
                            thread101353(tdone,ends);
                            thread101354(tdone,ends);
                            int biggest101358 = 0;
                            if(ends[52]>=biggest101358){
                              biggest101358=ends[52];
                            }
                            if(ends[57]>=biggest101358){
                              biggest101358=ends[57];
                            }
                            if(ends[58]>=biggest101358){
                              biggest101358=ends[58];
                            }
                            if(biggest101358 == 1){
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
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 374, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 374, column: 9
                          ends[51]=2;
                          ;//sysj\conveyor_controller.sysj line: 374, column: 9
                          S36912=1;
                          thread101359(tdone,ends);
                          thread101360(tdone,ends);
                          thread101361(tdone,ends);
                          int biggest101365 = 0;
                          if(ends[52]>=biggest101365){
                            biggest101365=ends[52];
                          }
                          if(ends[57]>=biggest101365){
                            biggest101365=ends[57];
                          }
                          if(ends[58]>=biggest101365){
                            biggest101365=ends[58];
                          }
                          if(biggest101365 == 1){
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
                  S29016=1;
                  S29016=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 374, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 374, column: 9
                    S29016=1;
                    active[51]=1;
                    ends[51]=1;
                    break RUN;
                  }
                  else {
                    S29011=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 374, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 374, column: 9
                      S29011=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 374, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 374, column: 9
                        ends[51]=2;
                        ;//sysj\conveyor_controller.sysj line: 374, column: 9
                        S36912=1;
                        thread101366(tdone,ends);
                        thread101367(tdone,ends);
                        thread101368(tdone,ends);
                        int biggest101372 = 0;
                        if(ends[52]>=biggest101372){
                          biggest101372=ends[52];
                        }
                        if(ends[57]>=biggest101372){
                          biggest101372=ends[57];
                        }
                        if(ends[58]>=biggest101372){
                          biggest101372=ends[58];
                        }
                        if(biggest101372 == 1){
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
              thread101373(tdone,ends);
              thread101401(tdone,ends);
              thread101402(tdone,ends);
              int biggest101409 = 0;
              if(ends[52]>=biggest101409){
                biggest101409=ends[52];
              }
              if(ends[57]>=biggest101409){
                biggest101409=ends[57];
              }
              if(ends[58]>=biggest101409){
                biggest101409=ends[58];
              }
              if(biggest101409 == 1){
                active[51]=1;
                ends[51]=1;
                break RUN;
              }
              //FINXME code
              if(biggest101409 == 0){
                S36913=0;
                active[51]=0;
                ends[51]=0;
                S36913=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    filler1_51 = new Signal();
    filler2_51 = new Signal();
    filler3_51 = new Signal();
    filler4_51 = new Signal();
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
      filler1_51.setpreclear();
      filler2_51.setpreclear();
      filler3_51.setpreclear();
      filler4_51.setpreclear();
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
      filler1_51.setClear();
      filler2_51.setClear();
      filler3_51.setClear();
      filler4_51.setClear();
      bottleAtPos2_51.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[51]!=0 || suspended[51]!=0 || active[51]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[51] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

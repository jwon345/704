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
  private Signal bottleAtPos2_57;
  private long __start_thread_58;//sysj\conveyor_controller.sysj line: 400, column: 9
  private int S32520 = 1;
  private int S32519 = 1;
  private int S24623 = 1;
  private int S24618 = 1;
  private int S26490 = 1;
  private int S24641 = 1;
  private int S24648 = 1;
  private int S24643 = 1;
  private int S24749 = 1;
  private int S24754 = 1;
  private int S24833 = 1;
  private int S24838 = 1;
  private int S24874 = 1;
  private int S24869 = 1;
  private int S24947 = 1;
  private int S26573 = 1;
  private int S26517 = 1;
  private int S26497 = 1;
  private int S26492 = 1;
  private int S26608 = 1;
  private int S26584 = 1;
  private int S26578 = 1;
  private int S26581 = 1;
  
  private int[] ends = new int[90];
  private int[] tdone = new int[90];
  
  public void thread47623(int [] tdone, int [] ends){
        S26581=1;
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread47622(int [] tdone, int [] ends){
        S26578=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread47620(int [] tdone, int [] ends){
        switch(S26581){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 470, column: 35
          ends[66]=2;
          tdone[66]=1;
        }
        else {
          active[66]=1;
          ends[66]=1;
          tdone[66]=1;
        }
        break;
      
    }
  }

  public void thread47619(int [] tdone, int [] ends){
        switch(S26578){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
        break;
      
    }
  }

  public void thread47618(int [] tdone, int [] ends){
        switch(S26608){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        switch(S26584){
          case 0 : 
            thread47619(tdone,ends);
            thread47620(tdone,ends);
            int biggest47621 = 0;
            if(ends[65]>=biggest47621){
              biggest47621=ends[65];
            }
            if(ends[66]>=biggest47621){
              biggest47621=ends[66];
            }
            if(biggest47621 == 1){
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            if(biggest47621 == 2){
              ends[64]=2;
              ;//sysj\conveyor_controller.sysj line: 464, column: 18
              S26584=1;
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            //FINXME code
            if(biggest47621 == 0){
              S26584=1;
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            break;
          
          case 1 : 
            S26584=1;
            S26584=0;
            if(bottleAtPos2_57.getprestatus()){//sysj\conveyor_controller.sysj line: 463, column: 26
              thread47622(tdone,ends);
              thread47623(tdone,ends);
              int biggest47624 = 0;
              if(ends[65]>=biggest47624){
                biggest47624=ends[65];
              }
              if(ends[66]>=biggest47624){
                biggest47624=ends[66];
              }
              if(biggest47624 == 1){
                active[64]=1;
                ends[64]=1;
                tdone[64]=1;
              }
            }
            else {
              S26584=1;
              active[64]=1;
              ends[64]=1;
              tdone[64]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47617(int [] tdone, int [] ends){
        switch(S26573){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        switch(S26517){
          case 0 : 
            switch(S26497){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 452, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
                  S26497=1;
                  active[63]=1;
                  ends[63]=1;
                  tdone[63]=1;
                }
                else {
                  switch(S26492){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 452, column: 12
                        S26492=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
                          ends[63]=2;
                          ;//sysj\conveyor_controller.sysj line: 452, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 453, column: 15
                            bottleAtPos2_57.setPresent();//sysj\conveyor_controller.sysj line: 454, column: 13
                            currsigs.addElement(bottleAtPos2_57);
                            S26517=1;
                            active[63]=1;
                            ends[63]=1;
                            tdone[63]=1;
                          }
                          else {
                            S26517=1;
                            active[63]=1;
                            ends[63]=1;
                            tdone[63]=1;
                          }
                        }
                        else {
                          active[63]=1;
                          ends[63]=1;
                          tdone[63]=1;
                        }
                      }
                      else {
                        active[63]=1;
                        ends[63]=1;
                        tdone[63]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
                        ends[63]=2;
                        ;//sysj\conveyor_controller.sysj line: 452, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 453, column: 15
                          bottleAtPos2_57.setPresent();//sysj\conveyor_controller.sysj line: 454, column: 13
                          currsigs.addElement(bottleAtPos2_57);
                          S26517=1;
                          active[63]=1;
                          ends[63]=1;
                          tdone[63]=1;
                        }
                        else {
                          S26517=1;
                          active[63]=1;
                          ends[63]=1;
                          tdone[63]=1;
                        }
                      }
                      else {
                        active[63]=1;
                        ends[63]=1;
                        tdone[63]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S26497=1;
                S26497=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 452, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
                  S26497=1;
                  active[63]=1;
                  ends[63]=1;
                  tdone[63]=1;
                }
                else {
                  S26492=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 452, column: 12
                    S26492=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
                      ends[63]=2;
                      ;//sysj\conveyor_controller.sysj line: 452, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 453, column: 15
                        bottleAtPos2_57.setPresent();//sysj\conveyor_controller.sysj line: 454, column: 13
                        currsigs.addElement(bottleAtPos2_57);
                        S26517=1;
                        active[63]=1;
                        ends[63]=1;
                        tdone[63]=1;
                      }
                      else {
                        S26517=1;
                        active[63]=1;
                        ends[63]=1;
                        tdone[63]=1;
                      }
                    }
                    else {
                      active[63]=1;
                      ends[63]=1;
                      tdone[63]=1;
                    }
                  }
                  else {
                    active[63]=1;
                    ends[63]=1;
                    tdone[63]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S26517=1;
            S26517=0;
            S26497=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 452, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
              S26497=1;
              active[63]=1;
              ends[63]=1;
              tdone[63]=1;
            }
            else {
              S26492=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 452, column: 12
                S26492=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
                  ends[63]=2;
                  ;//sysj\conveyor_controller.sysj line: 452, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 453, column: 15
                    bottleAtPos2_57.setPresent();//sysj\conveyor_controller.sysj line: 454, column: 13
                    currsigs.addElement(bottleAtPos2_57);
                    S26517=1;
                    active[63]=1;
                    ends[63]=1;
                    tdone[63]=1;
                  }
                  else {
                    S26517=1;
                    active[63]=1;
                    ends[63]=1;
                    tdone[63]=1;
                  }
                }
                else {
                  active[63]=1;
                  ends[63]=1;
                  tdone[63]=1;
                }
              }
              else {
                active[63]=1;
                ends[63]=1;
                tdone[63]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47615(int [] tdone, int [] ends){
        switch(S24838){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 430, column: 13
        currsigs.addElement(dosUnitValveExtend);
        active[62]=1;
        ends[62]=1;
        tdone[62]=1;
        break;
      
    }
  }

  public void thread47614(int [] tdone, int [] ends){
        switch(S24833){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 426, column: 13
        currsigs.addElement(valveInletOnOff);
        active[61]=1;
        ends[61]=1;
        tdone[61]=1;
        break;
      
    }
  }

  public void thread47612(int [] tdone, int [] ends){
        S24838=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 430, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread47611(int [] tdone, int [] ends){
        S24833=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 425, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 426, column: 13
    currsigs.addElement(valveInletOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread47609(int [] tdone, int [] ends){
        switch(S24754){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 418, column: 13
        currsigs.addElement(dosUnitValveRetract);
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
        break;
      
    }
  }

  public void thread47608(int [] tdone, int [] ends){
        switch(S24749){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 414, column: 13
        currsigs.addElement(valveInjectorOnOff);
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
        break;
      
    }
  }

  public void thread47606(int [] tdone, int [] ends){
        S24838=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 430, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread47605(int [] tdone, int [] ends){
        S24833=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 425, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 426, column: 13
    currsigs.addElement(valveInletOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread47603(int [] tdone, int [] ends){
        S24754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 418, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread47602(int [] tdone, int [] ends){
        S24749=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 413, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 414, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread47600(int [] tdone, int [] ends){
        S24754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 418, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread47599(int [] tdone, int [] ends){
        S24749=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 413, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 414, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread47597(int [] tdone, int [] ends){
        S24754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 418, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread47596(int [] tdone, int [] ends){
        S24749=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 413, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 414, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread47594(int [] tdone, int [] ends){
        S24754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 418, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread47593(int [] tdone, int [] ends){
        S24749=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 413, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 414, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread47591(int [] tdone, int [] ends){
        S24754=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 418, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread47590(int [] tdone, int [] ends){
        S24749=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 413, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 414, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread47589(int [] tdone, int [] ends){
        switch(S26490){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        switch(S24641){
          case 0 : 
            if(bottleAtPos2_57.getprestatus()){//sysj\conveyor_controller.sysj line: 403, column: 17
              S24641=1;
              S24648=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 404, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 404, column: 11
                S24648=1;
                active[58]=1;
                ends[58]=1;
                tdone[58]=1;
              }
              else {
                S24643=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 404, column: 11
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 404, column: 11
                  S24643=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 404, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 404, column: 11
                    ends[58]=2;
                    ;//sysj\conveyor_controller.sysj line: 404, column: 11
                    S24641=2;
                    __start_thread_58 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 400, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_58 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 400, column: 9
                      ends[58]=2;
                      ;//sysj\conveyor_controller.sysj line: 400, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 407, column: 11
                      S24641=3;
                      thread47590(tdone,ends);
                      thread47591(tdone,ends);
                      int biggest47592 = 0;
                      if(ends[59]>=biggest47592){
                        biggest47592=ends[59];
                      }
                      if(ends[60]>=biggest47592){
                        biggest47592=ends[60];
                      }
                      if(biggest47592 == 1){
                        active[58]=1;
                        ends[58]=1;
                        tdone[58]=1;
                      }
                    }
                    else {
                      active[58]=1;
                      ends[58]=1;
                      tdone[58]=1;
                    }
                  }
                  else {
                    active[58]=1;
                    ends[58]=1;
                    tdone[58]=1;
                  }
                }
                else {
                  active[58]=1;
                  ends[58]=1;
                  tdone[58]=1;
                }
              }
            }
            else {
              active[58]=1;
              ends[58]=1;
              tdone[58]=1;
            }
            break;
          
          case 1 : 
            switch(S24648){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 404, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 404, column: 11
                  S24648=1;
                  active[58]=1;
                  ends[58]=1;
                  tdone[58]=1;
                }
                else {
                  switch(S24643){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 404, column: 11
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 404, column: 11
                        S24643=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 404, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 404, column: 11
                          ends[58]=2;
                          ;//sysj\conveyor_controller.sysj line: 404, column: 11
                          S24641=2;
                          __start_thread_58 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 400, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_58 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 400, column: 9
                            ends[58]=2;
                            ;//sysj\conveyor_controller.sysj line: 400, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 407, column: 11
                            S24641=3;
                            thread47593(tdone,ends);
                            thread47594(tdone,ends);
                            int biggest47595 = 0;
                            if(ends[59]>=biggest47595){
                              biggest47595=ends[59];
                            }
                            if(ends[60]>=biggest47595){
                              biggest47595=ends[60];
                            }
                            if(biggest47595 == 1){
                              active[58]=1;
                              ends[58]=1;
                              tdone[58]=1;
                            }
                          }
                          else {
                            active[58]=1;
                            ends[58]=1;
                            tdone[58]=1;
                          }
                        }
                        else {
                          active[58]=1;
                          ends[58]=1;
                          tdone[58]=1;
                        }
                      }
                      else {
                        active[58]=1;
                        ends[58]=1;
                        tdone[58]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 404, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 404, column: 11
                        ends[58]=2;
                        ;//sysj\conveyor_controller.sysj line: 404, column: 11
                        S24641=2;
                        __start_thread_58 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 400, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_58 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 400, column: 9
                          ends[58]=2;
                          ;//sysj\conveyor_controller.sysj line: 400, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 407, column: 11
                          S24641=3;
                          thread47596(tdone,ends);
                          thread47597(tdone,ends);
                          int biggest47598 = 0;
                          if(ends[59]>=biggest47598){
                            biggest47598=ends[59];
                          }
                          if(ends[60]>=biggest47598){
                            biggest47598=ends[60];
                          }
                          if(biggest47598 == 1){
                            active[58]=1;
                            ends[58]=1;
                            tdone[58]=1;
                          }
                        }
                        else {
                          active[58]=1;
                          ends[58]=1;
                          tdone[58]=1;
                        }
                      }
                      else {
                        active[58]=1;
                        ends[58]=1;
                        tdone[58]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S24648=1;
                S24648=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 404, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 404, column: 11
                  S24648=1;
                  active[58]=1;
                  ends[58]=1;
                  tdone[58]=1;
                }
                else {
                  S24643=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 404, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 404, column: 11
                    S24643=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 404, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 404, column: 11
                      ends[58]=2;
                      ;//sysj\conveyor_controller.sysj line: 404, column: 11
                      S24641=2;
                      __start_thread_58 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 400, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_58 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 400, column: 9
                        ends[58]=2;
                        ;//sysj\conveyor_controller.sysj line: 400, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 407, column: 11
                        S24641=3;
                        thread47599(tdone,ends);
                        thread47600(tdone,ends);
                        int biggest47601 = 0;
                        if(ends[59]>=biggest47601){
                          biggest47601=ends[59];
                        }
                        if(ends[60]>=biggest47601){
                          biggest47601=ends[60];
                        }
                        if(biggest47601 == 1){
                          active[58]=1;
                          ends[58]=1;
                          tdone[58]=1;
                        }
                      }
                      else {
                        active[58]=1;
                        ends[58]=1;
                        tdone[58]=1;
                      }
                    }
                    else {
                      active[58]=1;
                      ends[58]=1;
                      tdone[58]=1;
                    }
                  }
                  else {
                    active[58]=1;
                    ends[58]=1;
                    tdone[58]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_58 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 400, column: 9
              ends[58]=2;
              ;//sysj\conveyor_controller.sysj line: 400, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 407, column: 11
              S24641=3;
              thread47602(tdone,ends);
              thread47603(tdone,ends);
              int biggest47604 = 0;
              if(ends[59]>=biggest47604){
                biggest47604=ends[59];
              }
              if(ends[60]>=biggest47604){
                biggest47604=ends[60];
              }
              if(biggest47604 == 1){
                active[58]=1;
                ends[58]=1;
                tdone[58]=1;
              }
            }
            else {
              active[58]=1;
              ends[58]=1;
              tdone[58]=1;
            }
            break;
          
          case 3 : 
            if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 411, column: 17
              S24641=4;
              thread47605(tdone,ends);
              thread47606(tdone,ends);
              int biggest47607 = 0;
              if(ends[61]>=biggest47607){
                biggest47607=ends[61];
              }
              if(ends[62]>=biggest47607){
                biggest47607=ends[62];
              }
              if(biggest47607 == 1){
                active[58]=1;
                ends[58]=1;
                tdone[58]=1;
              }
            }
            else {
              thread47608(tdone,ends);
              thread47609(tdone,ends);
              int biggest47610 = 0;
              if(ends[59]>=biggest47610){
                biggest47610=ends[59];
              }
              if(ends[60]>=biggest47610){
                biggest47610=ends[60];
              }
              if(biggest47610 == 1){
                active[58]=1;
                ends[58]=1;
                tdone[58]=1;
              }
              //FINXME code
              if(biggest47610 == 0){
                S24641=4;
                thread47611(tdone,ends);
                thread47612(tdone,ends);
                int biggest47613 = 0;
                if(ends[61]>=biggest47613){
                  biggest47613=ends[61];
                }
                if(ends[62]>=biggest47613){
                  biggest47613=ends[62];
                }
                if(biggest47613 == 1){
                  active[58]=1;
                  ends[58]=1;
                  tdone[58]=1;
                }
              }
            }
            break;
          
          case 4 : 
            if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 423, column: 17
              S24641=5;
              S24874=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 435, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 11
                S24874=1;
                active[58]=1;
                ends[58]=1;
                tdone[58]=1;
              }
              else {
                S24869=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 11
                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 435, column: 11
                  S24869=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 11
                    ends[58]=2;
                    ;//sysj\conveyor_controller.sysj line: 435, column: 11
                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 436, column: 11
                    S24641=6;
                    S24947=0;
                    active[58]=1;
                    ends[58]=1;
                    tdone[58]=1;
                  }
                  else {
                    active[58]=1;
                    ends[58]=1;
                    tdone[58]=1;
                  }
                }
                else {
                  active[58]=1;
                  ends[58]=1;
                  tdone[58]=1;
                }
              }
            }
            else {
              thread47614(tdone,ends);
              thread47615(tdone,ends);
              int biggest47616 = 0;
              if(ends[61]>=biggest47616){
                biggest47616=ends[61];
              }
              if(ends[62]>=biggest47616){
                biggest47616=ends[62];
              }
              if(biggest47616 == 1){
                active[58]=1;
                ends[58]=1;
                tdone[58]=1;
              }
              //FINXME code
              if(biggest47616 == 0){
                S24641=5;
                S24874=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 435, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 11
                  S24874=1;
                  active[58]=1;
                  ends[58]=1;
                  tdone[58]=1;
                }
                else {
                  S24869=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 435, column: 11
                    S24869=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 11
                      ends[58]=2;
                      ;//sysj\conveyor_controller.sysj line: 435, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 436, column: 11
                      S24641=6;
                      S24947=0;
                      active[58]=1;
                      ends[58]=1;
                      tdone[58]=1;
                    }
                    else {
                      active[58]=1;
                      ends[58]=1;
                      tdone[58]=1;
                    }
                  }
                  else {
                    active[58]=1;
                    ends[58]=1;
                    tdone[58]=1;
                  }
                }
              }
            }
            break;
          
          case 5 : 
            switch(S24874){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 435, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 11
                  S24874=1;
                  active[58]=1;
                  ends[58]=1;
                  tdone[58]=1;
                }
                else {
                  switch(S24869){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 11
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 435, column: 11
                        S24869=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 11
                          ends[58]=2;
                          ;//sysj\conveyor_controller.sysj line: 435, column: 11
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 436, column: 11
                          S24641=6;
                          S24947=0;
                          active[58]=1;
                          ends[58]=1;
                          tdone[58]=1;
                        }
                        else {
                          active[58]=1;
                          ends[58]=1;
                          tdone[58]=1;
                        }
                      }
                      else {
                        active[58]=1;
                        ends[58]=1;
                        tdone[58]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 11
                        ends[58]=2;
                        ;//sysj\conveyor_controller.sysj line: 435, column: 11
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 436, column: 11
                        S24641=6;
                        S24947=0;
                        active[58]=1;
                        ends[58]=1;
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
                break;
              
              case 1 : 
                S24874=1;
                S24874=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 435, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 11
                  S24874=1;
                  active[58]=1;
                  ends[58]=1;
                  tdone[58]=1;
                }
                else {
                  S24869=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 435, column: 11
                    S24869=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 435, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 435, column: 11
                      ends[58]=2;
                      ;//sysj\conveyor_controller.sysj line: 435, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 436, column: 11
                      S24641=6;
                      S24947=0;
                      active[58]=1;
                      ends[58]=1;
                      tdone[58]=1;
                    }
                    else {
                      active[58]=1;
                      ends[58]=1;
                      tdone[58]=1;
                    }
                  }
                  else {
                    active[58]=1;
                    ends[58]=1;
                    tdone[58]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S24947){
              case 0 : 
                if(!bottleAtPos2_57.getprestatus()){//sysj\conveyor_controller.sysj line: 439, column: 18
                  S24947=1;
                  if(bottleAtPos2_57.getprestatus()){//sysj\conveyor_controller.sysj line: 441, column: 21
                    active[58]=1;
                    ends[58]=1;
                    tdone[58]=1;
                  }
                  else {
                    ends[58]=2;
                    ;//sysj\conveyor_controller.sysj line: 438, column: 11
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 402, column: 14
                    S24641=0;
                    active[58]=1;
                    ends[58]=1;
                    tdone[58]=1;
                  }
                }
                else {
                  active[58]=1;
                  ends[58]=1;
                  tdone[58]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_57.getprestatus()){//sysj\conveyor_controller.sysj line: 441, column: 21
                  active[58]=1;
                  ends[58]=1;
                  tdone[58]=1;
                }
                else {
                  ends[58]=2;
                  ;//sysj\conveyor_controller.sysj line: 438, column: 11
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 402, column: 14
                  S24641=0;
                  active[58]=1;
                  ends[58]=1;
                  tdone[58]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread47586(int [] tdone, int [] ends){
        S26581=1;
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread47585(int [] tdone, int [] ends){
        S26578=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread47584(int [] tdone, int [] ends){
        S26608=1;
    S26584=0;
    if(bottleAtPos2_57.getprestatus()){//sysj\conveyor_controller.sysj line: 463, column: 26
      thread47585(tdone,ends);
      thread47586(tdone,ends);
      int biggest47587 = 0;
      if(ends[65]>=biggest47587){
        biggest47587=ends[65];
      }
      if(ends[66]>=biggest47587){
        biggest47587=ends[66];
      }
      if(biggest47587 == 1){
        active[64]=1;
        ends[64]=1;
        tdone[64]=1;
      }
    }
    else {
      S26584=1;
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
  }

  public void thread47583(int [] tdone, int [] ends){
        S26573=1;
    S26517=0;
    S26497=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 452, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
      S26497=1;
      active[63]=1;
      ends[63]=1;
      tdone[63]=1;
    }
    else {
      S26492=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 452, column: 12
        S26492=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
          ends[63]=2;
          ;//sysj\conveyor_controller.sysj line: 452, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 453, column: 15
            bottleAtPos2_57.setPresent();//sysj\conveyor_controller.sysj line: 454, column: 13
            currsigs.addElement(bottleAtPos2_57);
            S26517=1;
            active[63]=1;
            ends[63]=1;
            tdone[63]=1;
          }
          else {
            S26517=1;
            active[63]=1;
            ends[63]=1;
            tdone[63]=1;
          }
        }
        else {
          active[63]=1;
          ends[63]=1;
          tdone[63]=1;
        }
      }
      else {
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
      }
    }
  }

  public void thread47582(int [] tdone, int [] ends){
        S26490=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 402, column: 14
    S24641=0;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread47579(int [] tdone, int [] ends){
        S26581=1;
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread47578(int [] tdone, int [] ends){
        S26578=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread47577(int [] tdone, int [] ends){
        S26608=1;
    S26584=0;
    if(bottleAtPos2_57.getprestatus()){//sysj\conveyor_controller.sysj line: 463, column: 26
      thread47578(tdone,ends);
      thread47579(tdone,ends);
      int biggest47580 = 0;
      if(ends[65]>=biggest47580){
        biggest47580=ends[65];
      }
      if(ends[66]>=biggest47580){
        biggest47580=ends[66];
      }
      if(biggest47580 == 1){
        active[64]=1;
        ends[64]=1;
        tdone[64]=1;
      }
    }
    else {
      S26584=1;
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
  }

  public void thread47576(int [] tdone, int [] ends){
        S26573=1;
    S26517=0;
    S26497=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 452, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
      S26497=1;
      active[63]=1;
      ends[63]=1;
      tdone[63]=1;
    }
    else {
      S26492=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 452, column: 12
        S26492=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
          ends[63]=2;
          ;//sysj\conveyor_controller.sysj line: 452, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 453, column: 15
            bottleAtPos2_57.setPresent();//sysj\conveyor_controller.sysj line: 454, column: 13
            currsigs.addElement(bottleAtPos2_57);
            S26517=1;
            active[63]=1;
            ends[63]=1;
            tdone[63]=1;
          }
          else {
            S26517=1;
            active[63]=1;
            ends[63]=1;
            tdone[63]=1;
          }
        }
        else {
          active[63]=1;
          ends[63]=1;
          tdone[63]=1;
        }
      }
      else {
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
      }
    }
  }

  public void thread47575(int [] tdone, int [] ends){
        S26490=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 402, column: 14
    S24641=0;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread47572(int [] tdone, int [] ends){
        S26581=1;
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread47571(int [] tdone, int [] ends){
        S26578=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread47570(int [] tdone, int [] ends){
        S26608=1;
    S26584=0;
    if(bottleAtPos2_57.getprestatus()){//sysj\conveyor_controller.sysj line: 463, column: 26
      thread47571(tdone,ends);
      thread47572(tdone,ends);
      int biggest47573 = 0;
      if(ends[65]>=biggest47573){
        biggest47573=ends[65];
      }
      if(ends[66]>=biggest47573){
        biggest47573=ends[66];
      }
      if(biggest47573 == 1){
        active[64]=1;
        ends[64]=1;
        tdone[64]=1;
      }
    }
    else {
      S26584=1;
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
  }

  public void thread47569(int [] tdone, int [] ends){
        S26573=1;
    S26517=0;
    S26497=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 452, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
      S26497=1;
      active[63]=1;
      ends[63]=1;
      tdone[63]=1;
    }
    else {
      S26492=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 452, column: 12
        S26492=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
          ends[63]=2;
          ;//sysj\conveyor_controller.sysj line: 452, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 453, column: 15
            bottleAtPos2_57.setPresent();//sysj\conveyor_controller.sysj line: 454, column: 13
            currsigs.addElement(bottleAtPos2_57);
            S26517=1;
            active[63]=1;
            ends[63]=1;
            tdone[63]=1;
          }
          else {
            S26517=1;
            active[63]=1;
            ends[63]=1;
            tdone[63]=1;
          }
        }
        else {
          active[63]=1;
          ends[63]=1;
          tdone[63]=1;
        }
      }
      else {
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
      }
    }
  }

  public void thread47568(int [] tdone, int [] ends){
        S26490=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 402, column: 14
    S24641=0;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread47565(int [] tdone, int [] ends){
        S26581=1;
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread47564(int [] tdone, int [] ends){
        S26578=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread47563(int [] tdone, int [] ends){
        S26608=1;
    S26584=0;
    if(bottleAtPos2_57.getprestatus()){//sysj\conveyor_controller.sysj line: 463, column: 26
      thread47564(tdone,ends);
      thread47565(tdone,ends);
      int biggest47566 = 0;
      if(ends[65]>=biggest47566){
        biggest47566=ends[65];
      }
      if(ends[66]>=biggest47566){
        biggest47566=ends[66];
      }
      if(biggest47566 == 1){
        active[64]=1;
        ends[64]=1;
        tdone[64]=1;
      }
    }
    else {
      S26584=1;
      active[64]=1;
      ends[64]=1;
      tdone[64]=1;
    }
  }

  public void thread47562(int [] tdone, int [] ends){
        S26573=1;
    S26517=0;
    S26497=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 452, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
      S26497=1;
      active[63]=1;
      ends[63]=1;
      tdone[63]=1;
    }
    else {
      S26492=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 452, column: 12
        S26492=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 452, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 452, column: 12
          ends[63]=2;
          ;//sysj\conveyor_controller.sysj line: 452, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 453, column: 15
            bottleAtPos2_57.setPresent();//sysj\conveyor_controller.sysj line: 454, column: 13
            currsigs.addElement(bottleAtPos2_57);
            S26517=1;
            active[63]=1;
            ends[63]=1;
            tdone[63]=1;
          }
          else {
            S26517=1;
            active[63]=1;
            ends[63]=1;
            tdone[63]=1;
          }
        }
        else {
          active[63]=1;
          ends[63]=1;
          tdone[63]=1;
        }
      }
      else {
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
      }
    }
  }

  public void thread47561(int [] tdone, int [] ends){
        S26490=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 402, column: 14
    S24641=0;
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S32520){
        case 0 : 
          S32520=0;
          break RUN;
        
        case 1 : 
          S32520=2;
          S32520=2;
          bottleAtPos2_57.setClear();//sysj\conveyor_controller.sysj line: 396, column: 9
          S32519=0;
          S24623=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 397, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 397, column: 9
            S24623=1;
            active[57]=1;
            ends[57]=1;
            break RUN;
          }
          else {
            S24618=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 397, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 397, column: 9
              S24618=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 397, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 397, column: 9
                ends[57]=2;
                ;//sysj\conveyor_controller.sysj line: 397, column: 9
                S32519=1;
                thread47561(tdone,ends);
                thread47562(tdone,ends);
                thread47563(tdone,ends);
                int biggest47567 = 0;
                if(ends[58]>=biggest47567){
                  biggest47567=ends[58];
                }
                if(ends[63]>=biggest47567){
                  biggest47567=ends[63];
                }
                if(ends[64]>=biggest47567){
                  biggest47567=ends[64];
                }
                if(biggest47567 == 1){
                  active[57]=1;
                  ends[57]=1;
                  break RUN;
                }
              }
              else {
                active[57]=1;
                ends[57]=1;
                break RUN;
              }
            }
            else {
              active[57]=1;
              ends[57]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos2_57.setClear();//sysj\conveyor_controller.sysj line: 396, column: 9
          switch(S32519){
            case 0 : 
              switch(S24623){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 397, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 397, column: 9
                    S24623=1;
                    active[57]=1;
                    ends[57]=1;
                    break RUN;
                  }
                  else {
                    switch(S24618){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 397, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 397, column: 9
                          S24618=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 397, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 397, column: 9
                            ends[57]=2;
                            ;//sysj\conveyor_controller.sysj line: 397, column: 9
                            S32519=1;
                            thread47568(tdone,ends);
                            thread47569(tdone,ends);
                            thread47570(tdone,ends);
                            int biggest47574 = 0;
                            if(ends[58]>=biggest47574){
                              biggest47574=ends[58];
                            }
                            if(ends[63]>=biggest47574){
                              biggest47574=ends[63];
                            }
                            if(ends[64]>=biggest47574){
                              biggest47574=ends[64];
                            }
                            if(biggest47574 == 1){
                              active[57]=1;
                              ends[57]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[57]=1;
                            ends[57]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[57]=1;
                          ends[57]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 397, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 397, column: 9
                          ends[57]=2;
                          ;//sysj\conveyor_controller.sysj line: 397, column: 9
                          S32519=1;
                          thread47575(tdone,ends);
                          thread47576(tdone,ends);
                          thread47577(tdone,ends);
                          int biggest47581 = 0;
                          if(ends[58]>=biggest47581){
                            biggest47581=ends[58];
                          }
                          if(ends[63]>=biggest47581){
                            biggest47581=ends[63];
                          }
                          if(ends[64]>=biggest47581){
                            biggest47581=ends[64];
                          }
                          if(biggest47581 == 1){
                            active[57]=1;
                            ends[57]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[57]=1;
                          ends[57]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S24623=1;
                  S24623=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 397, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 397, column: 9
                    S24623=1;
                    active[57]=1;
                    ends[57]=1;
                    break RUN;
                  }
                  else {
                    S24618=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 397, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 397, column: 9
                      S24618=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 397, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 397, column: 9
                        ends[57]=2;
                        ;//sysj\conveyor_controller.sysj line: 397, column: 9
                        S32519=1;
                        thread47582(tdone,ends);
                        thread47583(tdone,ends);
                        thread47584(tdone,ends);
                        int biggest47588 = 0;
                        if(ends[58]>=biggest47588){
                          biggest47588=ends[58];
                        }
                        if(ends[63]>=biggest47588){
                          biggest47588=ends[63];
                        }
                        if(ends[64]>=biggest47588){
                          biggest47588=ends[64];
                        }
                        if(biggest47588 == 1){
                          active[57]=1;
                          ends[57]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[57]=1;
                        ends[57]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[57]=1;
                      ends[57]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread47589(tdone,ends);
              thread47617(tdone,ends);
              thread47618(tdone,ends);
              int biggest47625 = 0;
              if(ends[58]>=biggest47625){
                biggest47625=ends[58];
              }
              if(ends[63]>=biggest47625){
                biggest47625=ends[63];
              }
              if(ends[64]>=biggest47625){
                biggest47625=ends[64];
              }
              if(biggest47625 == 1){
                active[57]=1;
                ends[57]=1;
                break RUN;
              }
              //FINXME code
              if(biggest47625 == 0){
                S32520=0;
                active[57]=0;
                ends[57]=0;
                S32520=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos2_57 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[57] != 0){
      int index = 57;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[57]!=0 || suspended[57]!=0 || active[57]!=1);
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
      bottleAtPos2_57.setpreclear();
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
      bottleAtPos2_57.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[57]!=0 || suspended[57]!=0 || active[57]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[57] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  public Signal bottleAtPos3E = new Signal("bottleAtPos3E", Signal.OUTPUT);
  public input_Channel checkThree_in = new input_Channel();
  public output_Channel lidLoaderReady_o = new output_Channel();
  private Signal manualMode_93;
  private Signal autoMode_93;
  private Signal bottleAtPos3_93;
  private Signal done_93;
  private int S191775 = 1;
  private int S191631 = 1;
  private int S191630 = 1;
  private int S139038 = 1;
  private int S139033 = 1;
  private int S139099 = 1;
  private int S139061 = 1;
  private int S139056 = 1;
  private int S139108 = 1;
  private int S139114 = 1;
  private int S139145 = 1;
  private int S139156 = 1;
  private int S139147 = 1;
  private int S139192 = 1;
  private int S139187 = 1;
  private int S142011 = 1;
  private int S142019 = 1;
  private int S142162 = 1;
  private int S142066 = 1;
  private int S142026 = 1;
  private int S142021 = 1;
  private int S142170 = 1;
  private int S191652 = 1;
  private int S191651 = 1;
  private int S191735 = 1;
  private int S191679 = 1;
  private int S191659 = 1;
  private int S191654 = 1;
  private int S191773 = 1;
  private int S191747 = 1;
  private int S191740 = 1;
  private int S191743 = 1;
  
  private int[] ends = new int[106];
  private int[] tdone = new int[106];
  
  public void thread192690(int [] tdone, int [] ends){
        S191743=1;
    active[105]=1;
    ends[105]=1;
    tdone[105]=1;
  }

  public void thread192689(int [] tdone, int [] ends){
        S191740=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 909, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[104]=1;
    ends[104]=1;
    tdone[104]=1;
  }

  public void thread192687(int [] tdone, int [] ends){
        switch(S191743){
      case 0 : 
        active[105]=0;
        ends[105]=0;
        tdone[105]=1;
        break;
      
      case 1 : 
        if(done_93.getprestatus()){//sysj\conveyor_controller.sysj line: 913, column: 28
          ends[105]=2;
          tdone[105]=1;
        }
        else {
          active[105]=1;
          ends[105]=1;
          tdone[105]=1;
        }
        break;
      
    }
  }

  public void thread192686(int [] tdone, int [] ends){
        switch(S191740){
      case 0 : 
        active[104]=0;
        ends[104]=0;
        tdone[104]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 909, column: 22
        currsigs.addElement(bottleAtPos3E);
        active[104]=1;
        ends[104]=1;
        tdone[104]=1;
        break;
      
    }
  }

  public void thread192685(int [] tdone, int [] ends){
        switch(S191773){
      case 0 : 
        active[103]=0;
        ends[103]=0;
        tdone[103]=1;
        break;
      
      case 1 : 
        switch(S191747){
          case 0 : 
            thread192686(tdone,ends);
            thread192687(tdone,ends);
            int biggest192688 = 0;
            if(ends[104]>=biggest192688){
              biggest192688=ends[104];
            }
            if(ends[105]>=biggest192688){
              biggest192688=ends[105];
            }
            if(biggest192688 == 1){
              active[103]=1;
              ends[103]=1;
              tdone[103]=1;
            }
            if(biggest192688 == 2){
              ends[103]=2;
              ;//sysj\conveyor_controller.sysj line: 907, column: 7
              S191747=1;
              active[103]=1;
              ends[103]=1;
              tdone[103]=1;
            }
            //FINXME code
            if(biggest192688 == 0){
              ;//sysj\conveyor_controller.sysj line: 915, column: 19
              S191747=1;
              active[103]=1;
              ends[103]=1;
              tdone[103]=1;
            }
            break;
          
          case 1 : 
            S191747=1;
            S191747=0;
            if(bottleAtPos3_93.getprestatus()){//sysj\conveyor_controller.sysj line: 906, column: 20
              thread192689(tdone,ends);
              thread192690(tdone,ends);
              int biggest192691 = 0;
              if(ends[104]>=biggest192691){
                biggest192691=ends[104];
              }
              if(ends[105]>=biggest192691){
                biggest192691=ends[105];
              }
              if(biggest192691 == 1){
                active[103]=1;
                ends[103]=1;
                tdone[103]=1;
              }
            }
            else {
              S191747=1;
              active[103]=1;
              ends[103]=1;
              tdone[103]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192684(int [] tdone, int [] ends){
        switch(S191735){
      case 0 : 
        active[102]=0;
        ends[102]=0;
        tdone[102]=1;
        break;
      
      case 1 : 
        switch(S191679){
          case 0 : 
            switch(S191659){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 893, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 893, column: 6
                  S191659=1;
                  active[102]=1;
                  ends[102]=1;
                  tdone[102]=1;
                }
                else {
                  switch(S191654){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 893, column: 6
                        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 893, column: 6
                        S191654=1;
                        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 893, column: 6
                          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 893, column: 6
                          ends[102]=2;
                          ;//sysj\conveyor_controller.sysj line: 893, column: 6
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 894, column: 9
                            bottleAtPos3_93.setPresent();//sysj\conveyor_controller.sysj line: 895, column: 7
                            currsigs.addElement(bottleAtPos3_93);
                            S191679=1;
                            active[102]=1;
                            ends[102]=1;
                            tdone[102]=1;
                          }
                          else {
                            done_93.setPresent();//sysj\conveyor_controller.sysj line: 897, column: 7
                            currsigs.addElement(done_93);
                            S191679=1;
                            active[102]=1;
                            ends[102]=1;
                            tdone[102]=1;
                          }
                        }
                        else {
                          active[102]=1;
                          ends[102]=1;
                          tdone[102]=1;
                        }
                      }
                      else {
                        active[102]=1;
                        ends[102]=1;
                        tdone[102]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 893, column: 6
                        checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 893, column: 6
                        ends[102]=2;
                        ;//sysj\conveyor_controller.sysj line: 893, column: 6
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 894, column: 9
                          bottleAtPos3_93.setPresent();//sysj\conveyor_controller.sysj line: 895, column: 7
                          currsigs.addElement(bottleAtPos3_93);
                          S191679=1;
                          active[102]=1;
                          ends[102]=1;
                          tdone[102]=1;
                        }
                        else {
                          done_93.setPresent();//sysj\conveyor_controller.sysj line: 897, column: 7
                          currsigs.addElement(done_93);
                          S191679=1;
                          active[102]=1;
                          ends[102]=1;
                          tdone[102]=1;
                        }
                      }
                      else {
                        active[102]=1;
                        ends[102]=1;
                        tdone[102]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S191659=1;
                S191659=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 893, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 893, column: 6
                  S191659=1;
                  active[102]=1;
                  ends[102]=1;
                  tdone[102]=1;
                }
                else {
                  S191654=0;
                  if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 893, column: 6
                    checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 893, column: 6
                    S191654=1;
                    if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 893, column: 6
                      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 893, column: 6
                      ends[102]=2;
                      ;//sysj\conveyor_controller.sysj line: 893, column: 6
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 894, column: 9
                        bottleAtPos3_93.setPresent();//sysj\conveyor_controller.sysj line: 895, column: 7
                        currsigs.addElement(bottleAtPos3_93);
                        S191679=1;
                        active[102]=1;
                        ends[102]=1;
                        tdone[102]=1;
                      }
                      else {
                        done_93.setPresent();//sysj\conveyor_controller.sysj line: 897, column: 7
                        currsigs.addElement(done_93);
                        S191679=1;
                        active[102]=1;
                        ends[102]=1;
                        tdone[102]=1;
                      }
                    }
                    else {
                      active[102]=1;
                      ends[102]=1;
                      tdone[102]=1;
                    }
                  }
                  else {
                    active[102]=1;
                    ends[102]=1;
                    tdone[102]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S191679=1;
            S191679=0;
            S191659=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 893, column: 6
              checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 893, column: 6
              S191659=1;
              active[102]=1;
              ends[102]=1;
              tdone[102]=1;
            }
            else {
              S191654=0;
              if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 893, column: 6
                checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 893, column: 6
                S191654=1;
                if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 893, column: 6
                  checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 893, column: 6
                  ends[102]=2;
                  ;//sysj\conveyor_controller.sysj line: 893, column: 6
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 894, column: 9
                    bottleAtPos3_93.setPresent();//sysj\conveyor_controller.sysj line: 895, column: 7
                    currsigs.addElement(bottleAtPos3_93);
                    S191679=1;
                    active[102]=1;
                    ends[102]=1;
                    tdone[102]=1;
                  }
                  else {
                    done_93.setPresent();//sysj\conveyor_controller.sysj line: 897, column: 7
                    currsigs.addElement(done_93);
                    S191679=1;
                    active[102]=1;
                    ends[102]=1;
                    tdone[102]=1;
                  }
                }
                else {
                  active[102]=1;
                  ends[102]=1;
                  tdone[102]=1;
                }
              }
              else {
                active[102]=1;
                ends[102]=1;
                tdone[102]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192683(int [] tdone, int [] ends){
        switch(S191652){
      case 0 : 
        active[101]=0;
        ends[101]=0;
        tdone[101]=1;
        break;
      
      case 1 : 
        switch(S191651){
          case 0 : 
            if(mode.getprestatus()){//sysj\conveyor_controller.sysj line: 877, column: 11
              S191651=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 879, column: 9
                autoMode_93.setPresent();//sysj\conveyor_controller.sysj line: 880, column: 7
                currsigs.addElement(autoMode_93);
                active[101]=1;
                ends[101]=1;
                tdone[101]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 882, column: 14
                  manualMode_93.setPresent();//sysj\conveyor_controller.sysj line: 883, column: 7
                  currsigs.addElement(manualMode_93);
                  active[101]=1;
                  ends[101]=1;
                  tdone[101]=1;
                }
                else {
                  active[101]=1;
                  ends[101]=1;
                  tdone[101]=1;
                }
              }
            }
            else {
              active[101]=1;
              ends[101]=1;
              tdone[101]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\conveyor_controller.sysj line: 879, column: 9
              autoMode_93.setPresent();//sysj\conveyor_controller.sysj line: 880, column: 7
              currsigs.addElement(autoMode_93);
              active[101]=1;
              ends[101]=1;
              tdone[101]=1;
            }
            else {
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\conveyor_controller.sysj line: 882, column: 14
                manualMode_93.setPresent();//sysj\conveyor_controller.sysj line: 883, column: 7
                currsigs.addElement(manualMode_93);
                active[101]=1;
                ends[101]=1;
                tdone[101]=1;
              }
              else {
                active[101]=1;
                ends[101]=1;
                tdone[101]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192681(int [] tdone, int [] ends){
        switch(S142170){
      case 0 : 
        active[100]=0;
        ends[100]=0;
        tdone[100]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 870, column: 21
          armDest.setPresent();//sysj\conveyor_controller.sysj line: 870, column: 31
          currsigs.addElement(armDest);
          active[100]=1;
          ends[100]=1;
          tdone[100]=1;
        }
        else {
          active[100]=1;
          ends[100]=1;
          tdone[100]=1;
        }
        break;
      
    }
  }

  public void thread192680(int [] tdone, int [] ends){
        switch(S142162){
      case 0 : 
        active[99]=0;
        ends[99]=0;
        tdone[99]=1;
        break;
      
      case 1 : 
        switch(S142066){
          case 0 : 
            switch(S142026){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 868, column: 48
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 868, column: 48
                  S142026=1;
                  active[99]=1;
                  ends[99]=1;
                  tdone[99]=1;
                }
                else {
                  switch(S142021){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 868, column: 48
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 868, column: 48
                        S142021=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 868, column: 48
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 868, column: 48
                          ends[99]=2;
                          ;//sysj\conveyor_controller.sysj line: 868, column: 48
                          S142066=1;
                          active[99]=1;
                          ends[99]=1;
                          tdone[99]=1;
                        }
                        else {
                          active[99]=1;
                          ends[99]=1;
                          tdone[99]=1;
                        }
                      }
                      else {
                        active[99]=1;
                        ends[99]=1;
                        tdone[99]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 868, column: 48
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 868, column: 48
                        ends[99]=2;
                        ;//sysj\conveyor_controller.sysj line: 868, column: 48
                        S142066=1;
                        active[99]=1;
                        ends[99]=1;
                        tdone[99]=1;
                      }
                      else {
                        active[99]=1;
                        ends[99]=1;
                        tdone[99]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S142026=1;
                S142026=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 868, column: 48
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 868, column: 48
                  S142026=1;
                  active[99]=1;
                  ends[99]=1;
                  tdone[99]=1;
                }
                else {
                  S142021=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 868, column: 48
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 868, column: 48
                    S142021=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 868, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 868, column: 48
                      ends[99]=2;
                      ;//sysj\conveyor_controller.sysj line: 868, column: 48
                      S142066=1;
                      active[99]=1;
                      ends[99]=1;
                      tdone[99]=1;
                    }
                    else {
                      active[99]=1;
                      ends[99]=1;
                      tdone[99]=1;
                    }
                  }
                  else {
                    active[99]=1;
                    ends[99]=1;
                    tdone[99]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S142066=1;
            S142066=0;
            if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 868, column: 21
              armSource.setPresent();//sysj\conveyor_controller.sysj line: 868, column: 33
              currsigs.addElement(armSource);
              S142026=0;
              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 868, column: 48
                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 868, column: 48
                S142026=1;
                active[99]=1;
                ends[99]=1;
                tdone[99]=1;
              }
              else {
                S142021=0;
                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 868, column: 48
                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 868, column: 48
                  S142021=1;
                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 868, column: 48
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 868, column: 48
                    ends[99]=2;
                    ;//sysj\conveyor_controller.sysj line: 868, column: 48
                    S142066=1;
                    active[99]=1;
                    ends[99]=1;
                    tdone[99]=1;
                  }
                  else {
                    active[99]=1;
                    ends[99]=1;
                    tdone[99]=1;
                  }
                }
                else {
                  active[99]=1;
                  ends[99]=1;
                  tdone[99]=1;
                }
              }
            }
            else {
              S142066=1;
              active[99]=1;
              ends[99]=1;
              tdone[99]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192679(int [] tdone, int [] ends){
        switch(S142019){
      case 0 : 
        active[98]=0;
        ends[98]=0;
        tdone[98]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 866, column: 21
          vacOn.setPresent();//sysj\conveyor_controller.sysj line: 866, column: 29
          currsigs.addElement(vacOn);
          active[98]=1;
          ends[98]=1;
          tdone[98]=1;
        }
        else {
          active[98]=1;
          ends[98]=1;
          tdone[98]=1;
        }
        break;
      
    }
  }

  public void thread192678(int [] tdone, int [] ends){
        switch(S142011){
      case 0 : 
        active[97]=0;
        ends[97]=0;
        tdone[97]=1;
        break;
      
      case 1 : 
        if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 864, column: 21
          pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 864, column: 36
          currsigs.addElement(pusherExtend);
          active[97]=1;
          ends[97]=1;
          tdone[97]=1;
        }
        else {
          active[97]=1;
          ends[97]=1;
          tdone[97]=1;
        }
        break;
      
    }
  }

  public void thread192676(int [] tdone, int [] ends){
        S142170=1;
    if(armDestM.getprestatus()){//sysj\conveyor_controller.sysj line: 870, column: 21
      armDest.setPresent();//sysj\conveyor_controller.sysj line: 870, column: 31
      currsigs.addElement(armDest);
      active[100]=1;
      ends[100]=1;
      tdone[100]=1;
    }
    else {
      active[100]=1;
      ends[100]=1;
      tdone[100]=1;
    }
  }

  public void thread192675(int [] tdone, int [] ends){
        S142162=1;
    S142066=0;
    if(armSourceM.getprestatus()){//sysj\conveyor_controller.sysj line: 868, column: 21
      armSource.setPresent();//sysj\conveyor_controller.sysj line: 868, column: 33
      currsigs.addElement(armSource);
      S142026=0;
      if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 868, column: 48
        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 868, column: 48
        S142026=1;
        active[99]=1;
        ends[99]=1;
        tdone[99]=1;
      }
      else {
        S142021=0;
        if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 868, column: 48
          lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 868, column: 48
          S142021=1;
          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 868, column: 48
            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 868, column: 48
            ends[99]=2;
            ;//sysj\conveyor_controller.sysj line: 868, column: 48
            S142066=1;
            active[99]=1;
            ends[99]=1;
            tdone[99]=1;
          }
          else {
            active[99]=1;
            ends[99]=1;
            tdone[99]=1;
          }
        }
        else {
          active[99]=1;
          ends[99]=1;
          tdone[99]=1;
        }
      }
    }
    else {
      S142066=1;
      active[99]=1;
      ends[99]=1;
      tdone[99]=1;
    }
  }

  public void thread192674(int [] tdone, int [] ends){
        S142019=1;
    if(vacOnM.getprestatus()){//sysj\conveyor_controller.sysj line: 866, column: 21
      vacOn.setPresent();//sysj\conveyor_controller.sysj line: 866, column: 29
      currsigs.addElement(vacOn);
      active[98]=1;
      ends[98]=1;
      tdone[98]=1;
    }
    else {
      active[98]=1;
      ends[98]=1;
      tdone[98]=1;
    }
  }

  public void thread192673(int [] tdone, int [] ends){
        S142011=1;
    if(pusherExtendM.getprestatus()){//sysj\conveyor_controller.sysj line: 864, column: 21
      pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 864, column: 36
      currsigs.addElement(pusherExtend);
      active[97]=1;
      ends[97]=1;
      tdone[97]=1;
    }
    else {
      active[97]=1;
      ends[97]=1;
      tdone[97]=1;
    }
  }

  public void thread192671(int [] tdone, int [] ends){
        switch(S139156){
      case 0 : 
        active[96]=0;
        ends[96]=0;
        tdone[96]=1;
        break;
      
      case 1 : 
        switch(S139147){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 835, column: 16
              System.out.println("WP gripped");//sysj\conveyor_controller.sysj line: 836, column: 10
              S139147=1;
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 838, column: 11
              currsigs.addElement(armDest);
              active[96]=1;
              ends[96]=1;
              tdone[96]=1;
            }
            else {
              active[96]=1;
              ends[96]=1;
              tdone[96]=1;
            }
            break;
          
          case 1 : 
            if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 837, column: 16
              System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 840, column: 10
              ends[96]=2;
              tdone[96]=1;
            }
            else {
              armDest.setPresent();//sysj\conveyor_controller.sysj line: 838, column: 11
              currsigs.addElement(armDest);
              active[96]=1;
              ends[96]=1;
              tdone[96]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192670(int [] tdone, int [] ends){
        switch(S139145){
      case 0 : 
        active[95]=0;
        ends[95]=0;
        tdone[95]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\conveyor_controller.sysj line: 831, column: 10
        currsigs.addElement(vacOn);
        active[95]=1;
        ends[95]=1;
        tdone[95]=1;
        break;
      
    }
  }

  public void thread192668(int [] tdone, int [] ends){
        S139156=1;
    S139147=0;
    active[96]=1;
    ends[96]=1;
    tdone[96]=1;
  }

  public void thread192667(int [] tdone, int [] ends){
        S139145=1;
    vacOn.setPresent();//sysj\conveyor_controller.sysj line: 831, column: 10
    currsigs.addElement(vacOn);
    active[95]=1;
    ends[95]=1;
    tdone[95]=1;
  }

  public void thread192666(int [] tdone, int [] ends){
        switch(S191631){
      case 0 : 
        active[94]=0;
        ends[94]=0;
        tdone[94]=1;
        break;
      
      case 1 : 
        switch(S191630){
          case 0 : 
            switch(S139038){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 795, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 795, column: 5
                  S139038=1;
                  active[94]=1;
                  ends[94]=1;
                  tdone[94]=1;
                }
                else {
                  switch(S139033){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 795, column: 5
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 795, column: 5
                        S139033=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 795, column: 5
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 795, column: 5
                          ends[94]=2;
                          ;//sysj\conveyor_controller.sysj line: 795, column: 5
                          S191630=1;
                          S139099=0;
                          active[94]=1;
                          ends[94]=1;
                          tdone[94]=1;
                        }
                        else {
                          active[94]=1;
                          ends[94]=1;
                          tdone[94]=1;
                        }
                      }
                      else {
                        active[94]=1;
                        ends[94]=1;
                        tdone[94]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 795, column: 5
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 795, column: 5
                        ends[94]=2;
                        ;//sysj\conveyor_controller.sysj line: 795, column: 5
                        S191630=1;
                        S139099=0;
                        active[94]=1;
                        ends[94]=1;
                        tdone[94]=1;
                      }
                      else {
                        active[94]=1;
                        ends[94]=1;
                        tdone[94]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S139038=1;
                S139038=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 795, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 795, column: 5
                  S139038=1;
                  active[94]=1;
                  ends[94]=1;
                  tdone[94]=1;
                }
                else {
                  S139033=0;
                  if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 795, column: 5
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 795, column: 5
                    S139033=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 795, column: 5
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 795, column: 5
                      ends[94]=2;
                      ;//sysj\conveyor_controller.sysj line: 795, column: 5
                      S191630=1;
                      S139099=0;
                      active[94]=1;
                      ends[94]=1;
                      tdone[94]=1;
                    }
                    else {
                      active[94]=1;
                      ends[94]=1;
                      tdone[94]=1;
                    }
                  }
                  else {
                    active[94]=1;
                    ends[94]=1;
                    tdone[94]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S139099){
              case 0 : 
                if(bottleAtPos3_93.getprestatus()){//sysj\conveyor_controller.sysj line: 797, column: 13
                  S139099=1;
                  S139061=0;
                  if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 798, column: 6
                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 798, column: 6
                    S139061=1;
                    active[94]=1;
                    ends[94]=1;
                    tdone[94]=1;
                  }
                  else {
                    S139056=0;
                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 798, column: 6
                      lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 798, column: 6
                      S139056=1;
                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 798, column: 6
                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 798, column: 6
                        ends[94]=2;
                        ;//sysj\conveyor_controller.sysj line: 798, column: 6
                        S139099=2;
                        System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 800, column: 7
                        S139108=0;
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 802, column: 8
                        currsigs.addElement(armDest);
                        active[94]=1;
                        ends[94]=1;
                        tdone[94]=1;
                      }
                      else {
                        active[94]=1;
                        ends[94]=1;
                        tdone[94]=1;
                      }
                    }
                    else {
                      active[94]=1;
                      ends[94]=1;
                      tdone[94]=1;
                    }
                  }
                }
                else {
                  active[94]=1;
                  ends[94]=1;
                  tdone[94]=1;
                }
                break;
              
              case 1 : 
                switch(S139061){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 798, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 798, column: 6
                      S139061=1;
                      active[94]=1;
                      ends[94]=1;
                      tdone[94]=1;
                    }
                    else {
                      switch(S139056){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 798, column: 6
                            lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 798, column: 6
                            S139056=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 798, column: 6
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 798, column: 6
                              ends[94]=2;
                              ;//sysj\conveyor_controller.sysj line: 798, column: 6
                              S139099=2;
                              System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 800, column: 7
                              S139108=0;
                              armDest.setPresent();//sysj\conveyor_controller.sysj line: 802, column: 8
                              currsigs.addElement(armDest);
                              active[94]=1;
                              ends[94]=1;
                              tdone[94]=1;
                            }
                            else {
                              active[94]=1;
                              ends[94]=1;
                              tdone[94]=1;
                            }
                          }
                          else {
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 798, column: 6
                            lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 798, column: 6
                            ends[94]=2;
                            ;//sysj\conveyor_controller.sysj line: 798, column: 6
                            S139099=2;
                            System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 800, column: 7
                            S139108=0;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 802, column: 8
                            currsigs.addElement(armDest);
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          else {
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S139061=1;
                    S139061=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 798, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 798, column: 6
                      S139061=1;
                      active[94]=1;
                      ends[94]=1;
                      tdone[94]=1;
                    }
                    else {
                      S139056=0;
                      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 798, column: 6
                        lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 798, column: 6
                        S139056=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 798, column: 6
                          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 798, column: 6
                          ends[94]=2;
                          ;//sysj\conveyor_controller.sysj line: 798, column: 6
                          S139099=2;
                          System.out.println("*Capper - Entering Auto");//sysj\conveyor_controller.sysj line: 800, column: 7
                          S139108=0;
                          armDest.setPresent();//sysj\conveyor_controller.sysj line: 802, column: 8
                          currsigs.addElement(armDest);
                          active[94]=1;
                          ends[94]=1;
                          tdone[94]=1;
                        }
                        else {
                          active[94]=1;
                          ends[94]=1;
                          tdone[94]=1;
                        }
                      }
                      else {
                        active[94]=1;
                        ends[94]=1;
                        tdone[94]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 2 : 
                if(manualMode_93.getprestatus()){//sysj\conveyor_controller.sysj line: 799, column: 12
                  lidLoaderReady_o.setPreempted();
                  S139099=3;
                  active[94]=1;
                  ends[94]=1;
                  tdone[94]=1;
                }
                else {
                  switch(S139108){
                    case 0 : 
                      if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 801, column: 13
                        System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 804, column: 7
                        S139108=1;
                        active[94]=1;
                        ends[94]=1;
                        tdone[94]=1;
                      }
                      else {
                        armDest.setPresent();//sysj\conveyor_controller.sysj line: 802, column: 8
                        currsigs.addElement(armDest);
                        active[94]=1;
                        ends[94]=1;
                        tdone[94]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 805, column: 13
                        System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 806, column: 7
                        S139108=2;
                        S139114=0;
                        active[94]=1;
                        ends[94]=1;
                        tdone[94]=1;
                      }
                      else {
                        active[94]=1;
                        ends[94]=1;
                        tdone[94]=1;
                      }
                      break;
                    
                    case 2 : 
                      switch(S139114){
                        case 0 : 
                          if(!empty.getprestatus()){//sysj\conveyor_controller.sysj line: 809, column: 14
                            S139114=1;
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          else {
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(request.getprestatus()){//sysj\conveyor_controller.sysj line: 810, column: 14
                            System.out.println("New request");//sysj\conveyor_controller.sysj line: 811, column: 8
                            S139114=2;
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 813, column: 9
                            currsigs.addElement(armDest);
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          else {
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          break;
                        
                        case 2 : 
                          if(armAtDest.getprestatus()){//sysj\conveyor_controller.sysj line: 812, column: 14
                            System.out.println("Arm at dest");//sysj\conveyor_controller.sysj line: 815, column: 8
                            S139114=3;
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 818, column: 9
                            currsigs.addElement(pusherExtend);
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          else {
                            armDest.setPresent();//sysj\conveyor_controller.sysj line: 813, column: 9
                            currsigs.addElement(armDest);
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          break;
                        
                        case 3 : 
                          if(pusherExtended.getprestatus()){//sysj\conveyor_controller.sysj line: 817, column: 14
                            System.out.println("Pusher extended");//sysj\conveyor_controller.sysj line: 820, column: 8
                            S139114=4;
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\conveyor_controller.sysj line: 818, column: 9
                            currsigs.addElement(pusherExtend);
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          break;
                        
                        case 4 : 
                          if(pusherRetracted.getprestatus()){//sysj\conveyor_controller.sysj line: 821, column: 14
                            System.out.println("Pusher retracted");//sysj\conveyor_controller.sysj line: 822, column: 8
                            S139114=5;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 825, column: 9
                            currsigs.addElement(armSource);
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          else {
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          break;
                        
                        case 5 : 
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 824, column: 14
                            System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 827, column: 8
                            S139114=6;
                            thread192667(tdone,ends);
                            thread192668(tdone,ends);
                            int biggest192669 = 0;
                            if(ends[95]>=biggest192669){
                              biggest192669=ends[95];
                            }
                            if(ends[96]>=biggest192669){
                              biggest192669=ends[96];
                            }
                            if(biggest192669 == 1){
                              active[94]=1;
                              ends[94]=1;
                              tdone[94]=1;
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 825, column: 9
                            currsigs.addElement(armSource);
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          break;
                        
                        case 6 : 
                          thread192670(tdone,ends);
                          thread192671(tdone,ends);
                          int biggest192672 = 0;
                          if(ends[95]>=biggest192672){
                            biggest192672=ends[95];
                          }
                          if(ends[96]>=biggest192672){
                            biggest192672=ends[96];
                          }
                          if(biggest192672 == 1){
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          if(biggest192672 == 2){
                            ends[94]=2;
                            ;//sysj\conveyor_controller.sysj line: 829, column: 8
                            S139114=7;
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          //FINXME code
                          if(biggest192672 == 0){
                            S139114=7;
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          break;
                        
                        case 7 : 
                          if(!WPgripped.getprestatus()){//sysj\conveyor_controller.sysj line: 845, column: 14
                            S139114=8;
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 848, column: 9
                            currsigs.addElement(armSource);
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          else {
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          break;
                        
                        case 8 : 
                          if(armAtSource.getprestatus()){//sysj\conveyor_controller.sysj line: 847, column: 14
                            S139114=9;
                            S139192=0;
                            if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 852, column: 8
                              lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 852, column: 8
                              S139192=1;
                              active[94]=1;
                              ends[94]=1;
                              tdone[94]=1;
                            }
                            else {
                              S139187=0;
                              if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 852, column: 8
                                lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 852, column: 8
                                S139187=1;
                                if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 852, column: 8
                                  lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 852, column: 8
                                  ends[94]=2;
                                  ;//sysj\conveyor_controller.sysj line: 852, column: 8
                                  System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 854, column: 8
                                  S139114=10;
                                  active[94]=1;
                                  ends[94]=1;
                                  tdone[94]=1;
                                }
                                else {
                                  active[94]=1;
                                  ends[94]=1;
                                  tdone[94]=1;
                                }
                              }
                              else {
                                active[94]=1;
                                ends[94]=1;
                                tdone[94]=1;
                              }
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\conveyor_controller.sysj line: 848, column: 9
                            currsigs.addElement(armSource);
                            active[94]=1;
                            ends[94]=1;
                            tdone[94]=1;
                          }
                          break;
                        
                        case 9 : 
                          switch(S139192){
                            case 0 : 
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 852, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 852, column: 8
                                S139192=1;
                                active[94]=1;
                                ends[94]=1;
                                tdone[94]=1;
                              }
                              else {
                                switch(S139187){
                                  case 0 : 
                                    if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 852, column: 8
                                      lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 852, column: 8
                                      S139187=1;
                                      if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 852, column: 8
                                        lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 852, column: 8
                                        ends[94]=2;
                                        ;//sysj\conveyor_controller.sysj line: 852, column: 8
                                        System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 854, column: 8
                                        S139114=10;
                                        active[94]=1;
                                        ends[94]=1;
                                        tdone[94]=1;
                                      }
                                      else {
                                        active[94]=1;
                                        ends[94]=1;
                                        tdone[94]=1;
                                      }
                                    }
                                    else {
                                      active[94]=1;
                                      ends[94]=1;
                                      tdone[94]=1;
                                    }
                                    break;
                                  
                                  case 1 : 
                                    if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 852, column: 8
                                      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 852, column: 8
                                      ends[94]=2;
                                      ;//sysj\conveyor_controller.sysj line: 852, column: 8
                                      System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 854, column: 8
                                      S139114=10;
                                      active[94]=1;
                                      ends[94]=1;
                                      tdone[94]=1;
                                    }
                                    else {
                                      active[94]=1;
                                      ends[94]=1;
                                      tdone[94]=1;
                                    }
                                    break;
                                  
                                }
                              }
                              break;
                            
                            case 1 : 
                              S139192=1;
                              S139192=0;
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 852, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 852, column: 8
                                S139192=1;
                                active[94]=1;
                                ends[94]=1;
                                tdone[94]=1;
                              }
                              else {
                                S139187=0;
                                if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 852, column: 8
                                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 852, column: 8
                                  S139187=1;
                                  if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 852, column: 8
                                    lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 852, column: 8
                                    ends[94]=2;
                                    ;//sysj\conveyor_controller.sysj line: 852, column: 8
                                    System.out.println("Arm at source");//sysj\conveyor_controller.sysj line: 854, column: 8
                                    S139114=10;
                                    active[94]=1;
                                    ends[94]=1;
                                    tdone[94]=1;
                                  }
                                  else {
                                    active[94]=1;
                                    ends[94]=1;
                                    tdone[94]=1;
                                  }
                                }
                                else {
                                  active[94]=1;
                                  ends[94]=1;
                                  tdone[94]=1;
                                }
                              }
                              break;
                            
                          }
                          break;
                        
                        case 10 : 
                          S139114=10;
                          S139114=0;
                          active[94]=1;
                          ends[94]=1;
                          tdone[94]=1;
                          break;
                        
                      }
                      break;
                    
                  }
                }
                break;
              
              case 3 : 
                S139099=3;
                System.out.println("entering manual");//sysj\conveyor_controller.sysj line: 862, column: 6
                S139099=4;
                thread192673(tdone,ends);
                thread192674(tdone,ends);
                thread192675(tdone,ends);
                thread192676(tdone,ends);
                int biggest192677 = 0;
                if(ends[97]>=biggest192677){
                  biggest192677=ends[97];
                }
                if(ends[98]>=biggest192677){
                  biggest192677=ends[98];
                }
                if(ends[99]>=biggest192677){
                  biggest192677=ends[99];
                }
                if(ends[100]>=biggest192677){
                  biggest192677=ends[100];
                }
                if(biggest192677 == 1){
                  active[94]=1;
                  ends[94]=1;
                  tdone[94]=1;
                }
                break;
              
              case 4 : 
                if(autoMode_93.getprestatus()){//sysj\conveyor_controller.sysj line: 863, column: 12
                  lidLoaderReady_o.setPreempted();
                  S139099=0;
                  active[94]=1;
                  ends[94]=1;
                  tdone[94]=1;
                }
                else {
                  thread192678(tdone,ends);
                  thread192679(tdone,ends);
                  thread192680(tdone,ends);
                  thread192681(tdone,ends);
                  int biggest192682 = 0;
                  if(ends[97]>=biggest192682){
                    biggest192682=ends[97];
                  }
                  if(ends[98]>=biggest192682){
                    biggest192682=ends[98];
                  }
                  if(ends[99]>=biggest192682){
                    biggest192682=ends[99];
                  }
                  if(ends[100]>=biggest192682){
                    biggest192682=ends[100];
                  }
                  if(biggest192682 == 1){
                    active[94]=1;
                    ends[94]=1;
                    tdone[94]=1;
                  }
                  //FINXME code
                  if(biggest192682 == 0){
                    S139099=0;
                    active[94]=1;
                    ends[94]=1;
                    tdone[94]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192663(int [] tdone, int [] ends){
        S191743=1;
    active[105]=1;
    ends[105]=1;
    tdone[105]=1;
  }

  public void thread192662(int [] tdone, int [] ends){
        S191740=1;
    bottleAtPos3E.setPresent();//sysj\conveyor_controller.sysj line: 909, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[104]=1;
    ends[104]=1;
    tdone[104]=1;
  }

  public void thread192661(int [] tdone, int [] ends){
        S191773=1;
    S191747=0;
    if(bottleAtPos3_93.getprestatus()){//sysj\conveyor_controller.sysj line: 906, column: 20
      thread192662(tdone,ends);
      thread192663(tdone,ends);
      int biggest192664 = 0;
      if(ends[104]>=biggest192664){
        biggest192664=ends[104];
      }
      if(ends[105]>=biggest192664){
        biggest192664=ends[105];
      }
      if(biggest192664 == 1){
        active[103]=1;
        ends[103]=1;
        tdone[103]=1;
      }
    }
    else {
      S191747=1;
      active[103]=1;
      ends[103]=1;
      tdone[103]=1;
    }
  }

  public void thread192660(int [] tdone, int [] ends){
        S191735=1;
    S191679=0;
    S191659=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 893, column: 6
      checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 893, column: 6
      S191659=1;
      active[102]=1;
      ends[102]=1;
      tdone[102]=1;
    }
    else {
      S191654=0;
      if(!checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 893, column: 6
        checkThree_in.setACK(true);//sysj\conveyor_controller.sysj line: 893, column: 6
        S191654=1;
        if(checkThree_in.isREQ()){//sysj\conveyor_controller.sysj line: 893, column: 6
          checkThree_in.setACK(false);//sysj\conveyor_controller.sysj line: 893, column: 6
          ends[102]=2;
          ;//sysj\conveyor_controller.sysj line: 893, column: 6
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\conveyor_controller.sysj line: 894, column: 9
            bottleAtPos3_93.setPresent();//sysj\conveyor_controller.sysj line: 895, column: 7
            currsigs.addElement(bottleAtPos3_93);
            S191679=1;
            active[102]=1;
            ends[102]=1;
            tdone[102]=1;
          }
          else {
            done_93.setPresent();//sysj\conveyor_controller.sysj line: 897, column: 7
            currsigs.addElement(done_93);
            S191679=1;
            active[102]=1;
            ends[102]=1;
            tdone[102]=1;
          }
        }
        else {
          active[102]=1;
          ends[102]=1;
          tdone[102]=1;
        }
      }
      else {
        active[102]=1;
        ends[102]=1;
        tdone[102]=1;
      }
    }
  }

  public void thread192659(int [] tdone, int [] ends){
        S191652=1;
    S191651=0;
    active[101]=1;
    ends[101]=1;
    tdone[101]=1;
  }

  public void thread192658(int [] tdone, int [] ends){
        S191631=1;
    S191630=0;
    S139038=0;
    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 795, column: 5
      lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 795, column: 5
      S139038=1;
      active[94]=1;
      ends[94]=1;
      tdone[94]=1;
    }
    else {
      S139033=0;
      if(lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 795, column: 5
        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 795, column: 5
        S139033=1;
        if(!lidLoaderReady_o.isACK()){//sysj\conveyor_controller.sysj line: 795, column: 5
          lidLoaderReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 795, column: 5
          ends[94]=2;
          ;//sysj\conveyor_controller.sysj line: 795, column: 5
          S191630=1;
          S139099=0;
          active[94]=1;
          ends[94]=1;
          tdone[94]=1;
        }
        else {
          active[94]=1;
          ends[94]=1;
          tdone[94]=1;
        }
      }
      else {
        active[94]=1;
        ends[94]=1;
        tdone[94]=1;
      }
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S191775){
        case 0 : 
          S191775=0;
          break RUN;
        
        case 1 : 
          S191775=2;
          S191775=2;
          manualMode_93.setClear();//sysj\conveyor_controller.sysj line: 793, column: 4
          autoMode_93.setClear();//sysj\conveyor_controller.sysj line: 793, column: 4
          bottleAtPos3_93.setClear();//sysj\conveyor_controller.sysj line: 793, column: 4
          done_93.setClear();//sysj\conveyor_controller.sysj line: 793, column: 4
          thread192658(tdone,ends);
          thread192659(tdone,ends);
          thread192660(tdone,ends);
          thread192661(tdone,ends);
          int biggest192665 = 0;
          if(ends[94]>=biggest192665){
            biggest192665=ends[94];
          }
          if(ends[101]>=biggest192665){
            biggest192665=ends[101];
          }
          if(ends[102]>=biggest192665){
            biggest192665=ends[102];
          }
          if(ends[103]>=biggest192665){
            biggest192665=ends[103];
          }
          if(biggest192665 == 1){
            active[93]=1;
            ends[93]=1;
            break RUN;
          }
        
        case 2 : 
          manualMode_93.setClear();//sysj\conveyor_controller.sysj line: 793, column: 4
          autoMode_93.setClear();//sysj\conveyor_controller.sysj line: 793, column: 4
          bottleAtPos3_93.setClear();//sysj\conveyor_controller.sysj line: 793, column: 4
          done_93.setClear();//sysj\conveyor_controller.sysj line: 793, column: 4
          thread192666(tdone,ends);
          thread192683(tdone,ends);
          thread192684(tdone,ends);
          thread192685(tdone,ends);
          int biggest192692 = 0;
          if(ends[94]>=biggest192692){
            biggest192692=ends[94];
          }
          if(ends[101]>=biggest192692){
            biggest192692=ends[101];
          }
          if(ends[102]>=biggest192692){
            biggest192692=ends[102];
          }
          if(ends[103]>=biggest192692){
            biggest192692=ends[103];
          }
          if(biggest192692 == 1){
            active[93]=1;
            ends[93]=1;
            break RUN;
          }
          //FINXME code
          if(biggest192692 == 0){
            S191775=0;
            active[93]=0;
            ends[93]=0;
            S191775=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    manualMode_93 = new Signal();
    autoMode_93 = new Signal();
    bottleAtPos3_93 = new Signal();
    done_93 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[93] != 0){
      int index = 93;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[93]!=0 || suspended[93]!=0 || active[93]!=1);
      else{
        if(!df){
          checkThree_in.gethook();
          lidLoaderReady_o.gethook();
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          request.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      request.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      bottleAtPos3E.setpreclear();
      manualMode_93.setpreclear();
      autoMode_93.setpreclear();
      bottleAtPos3_93.setpreclear();
      done_93.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      bottleAtPos3E.sethook();
      bottleAtPos3E.setClear();
      manualMode_93.setClear();
      autoMode_93.setClear();
      bottleAtPos3_93.setClear();
      done_93.setClear();
      checkThree_in.sethook();
      lidLoaderReady_o.sethook();
      if(paused[93]!=0 || suspended[93]!=0 || active[93]!=1);
      else{
        checkThree_in.gethook();
        lidLoaderReady_o.gethook();
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[93] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

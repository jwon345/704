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
  private Signal manualMode_1;
  private Signal autoMode_1;
  private Signal bottleAtPos3_1;
  private Signal done_1;
  private int S169195 = 1;
  private int S169051 = 1;
  private int S169050 = 1;
  private int S116458 = 1;
  private int S116453 = 1;
  private int S116519 = 1;
  private int S116481 = 1;
  private int S116476 = 1;
  private int S116528 = 1;
  private int S116534 = 1;
  private int S116565 = 1;
  private int S116576 = 1;
  private int S116567 = 1;
  private int S116612 = 1;
  private int S116607 = 1;
  private int S119431 = 1;
  private int S119425 = 1;
  private int S119439 = 1;
  private int S119582 = 1;
  private int S119486 = 1;
  private int S119446 = 1;
  private int S119441 = 1;
  private int S119590 = 1;
  private int S169072 = 1;
  private int S169071 = 1;
  private int S169155 = 1;
  private int S169099 = 1;
  private int S169079 = 1;
  private int S169074 = 1;
  private int S169193 = 1;
  private int S169167 = 1;
  private int S169160 = 1;
  private int S169163 = 1;
  
  private int[] ends = new int[27];
  private int[] tdone = new int[27];
  
  public void thread169893(int [] tdone, int [] ends){
        S169163=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread169892(int [] tdone, int [] ends){
        S169160=1;
    bottleAtPos3E.setPresent();//sysj\lidloader.sysj line: 127, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread169890(int [] tdone, int [] ends){
        switch(S169163){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(done_1.getprestatus()){//sysj\lidloader.sysj line: 131, column: 28
          ends[13]=2;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread169889(int [] tdone, int [] ends){
        switch(S169160){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        bottleAtPos3E.setPresent();//sysj\lidloader.sysj line: 127, column: 22
        currsigs.addElement(bottleAtPos3E);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread169888(int [] tdone, int [] ends){
        switch(S169193){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S169167){
          case 0 : 
            thread169889(tdone,ends);
            thread169890(tdone,ends);
            int biggest169891 = 0;
            if(ends[12]>=biggest169891){
              biggest169891=ends[12];
            }
            if(ends[13]>=biggest169891){
              biggest169891=ends[13];
            }
            if(biggest169891 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            if(biggest169891 == 2){
              ends[11]=2;
              ;//sysj\lidloader.sysj line: 125, column: 7
              S169167=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            //FINXME code
            if(biggest169891 == 0){
              ;//sysj\lidloader.sysj line: 133, column: 19
              S169167=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            S169167=1;
            S169167=0;
            if(bottleAtPos3_1.getprestatus()){//sysj\lidloader.sysj line: 124, column: 20
              thread169892(tdone,ends);
              thread169893(tdone,ends);
              int biggest169894 = 0;
              if(ends[12]>=biggest169894){
                biggest169894=ends[12];
              }
              if(ends[13]>=biggest169894){
                biggest169894=ends[13];
              }
              if(biggest169894 == 1){
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              S169167=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread169887(int [] tdone, int [] ends){
        switch(S169155){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S169099){
          case 0 : 
            switch(S169079){
              case 0 : 
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\lidloader.sysj line: 111, column: 6
                  checkThree_in.setACK(false);//sysj\lidloader.sysj line: 111, column: 6
                  S169079=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  switch(S169074){
                    case 0 : 
                      if(!checkThree_in.isREQ()){//sysj\lidloader.sysj line: 111, column: 6
                        checkThree_in.setACK(true);//sysj\lidloader.sysj line: 111, column: 6
                        S169074=1;
                        if(checkThree_in.isREQ()){//sysj\lidloader.sysj line: 111, column: 6
                          checkThree_in.setACK(false);//sysj\lidloader.sysj line: 111, column: 6
                          ends[10]=2;
                          ;//sysj\lidloader.sysj line: 111, column: 6
                          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\lidloader.sysj line: 112, column: 9
                            bottleAtPos3_1.setPresent();//sysj\lidloader.sysj line: 113, column: 7
                            currsigs.addElement(bottleAtPos3_1);
                            S169099=1;
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                          else {
                            done_1.setPresent();//sysj\lidloader.sysj line: 115, column: 7
                            currsigs.addElement(done_1);
                            S169099=1;
                            active[10]=1;
                            ends[10]=1;
                            tdone[10]=1;
                          }
                        }
                        else {
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                      }
                      else {
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkThree_in.isREQ()){//sysj\lidloader.sysj line: 111, column: 6
                        checkThree_in.setACK(false);//sysj\lidloader.sysj line: 111, column: 6
                        ends[10]=2;
                        ;//sysj\lidloader.sysj line: 111, column: 6
                        if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\lidloader.sysj line: 112, column: 9
                          bottleAtPos3_1.setPresent();//sysj\lidloader.sysj line: 113, column: 7
                          currsigs.addElement(bottleAtPos3_1);
                          S169099=1;
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                        else {
                          done_1.setPresent();//sysj\lidloader.sysj line: 115, column: 7
                          currsigs.addElement(done_1);
                          S169099=1;
                          active[10]=1;
                          ends[10]=1;
                          tdone[10]=1;
                        }
                      }
                      else {
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S169079=1;
                S169079=0;
                if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\lidloader.sysj line: 111, column: 6
                  checkThree_in.setACK(false);//sysj\lidloader.sysj line: 111, column: 6
                  S169079=1;
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  S169074=0;
                  if(!checkThree_in.isREQ()){//sysj\lidloader.sysj line: 111, column: 6
                    checkThree_in.setACK(true);//sysj\lidloader.sysj line: 111, column: 6
                    S169074=1;
                    if(checkThree_in.isREQ()){//sysj\lidloader.sysj line: 111, column: 6
                      checkThree_in.setACK(false);//sysj\lidloader.sysj line: 111, column: 6
                      ends[10]=2;
                      ;//sysj\lidloader.sysj line: 111, column: 6
                      if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\lidloader.sysj line: 112, column: 9
                        bottleAtPos3_1.setPresent();//sysj\lidloader.sysj line: 113, column: 7
                        currsigs.addElement(bottleAtPos3_1);
                        S169099=1;
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                      else {
                        done_1.setPresent();//sysj\lidloader.sysj line: 115, column: 7
                        currsigs.addElement(done_1);
                        S169099=1;
                        active[10]=1;
                        ends[10]=1;
                        tdone[10]=1;
                      }
                    }
                    else {
                      active[10]=1;
                      ends[10]=1;
                      tdone[10]=1;
                    }
                  }
                  else {
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S169099=1;
            S169099=0;
            S169079=0;
            if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\lidloader.sysj line: 111, column: 6
              checkThree_in.setACK(false);//sysj\lidloader.sysj line: 111, column: 6
              S169079=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S169074=0;
              if(!checkThree_in.isREQ()){//sysj\lidloader.sysj line: 111, column: 6
                checkThree_in.setACK(true);//sysj\lidloader.sysj line: 111, column: 6
                S169074=1;
                if(checkThree_in.isREQ()){//sysj\lidloader.sysj line: 111, column: 6
                  checkThree_in.setACK(false);//sysj\lidloader.sysj line: 111, column: 6
                  ends[10]=2;
                  ;//sysj\lidloader.sysj line: 111, column: 6
                  if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\lidloader.sysj line: 112, column: 9
                    bottleAtPos3_1.setPresent();//sysj\lidloader.sysj line: 113, column: 7
                    currsigs.addElement(bottleAtPos3_1);
                    S169099=1;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  else {
                    done_1.setPresent();//sysj\lidloader.sysj line: 115, column: 7
                    currsigs.addElement(done_1);
                    S169099=1;
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                }
                else {
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
              }
              else {
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread169886(int [] tdone, int [] ends){
        switch(S169072){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S169071){
          case 0 : 
            if(mode.getprestatus()){//sysj\lidloader.sysj line: 95, column: 11
              S169071=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\lidloader.sysj line: 97, column: 9
                autoMode_1.setPresent();//sysj\lidloader.sysj line: 98, column: 7
                currsigs.addElement(autoMode_1);
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\lidloader.sysj line: 100, column: 14
                  manualMode_1.setPresent();//sysj\lidloader.sysj line: 101, column: 7
                  currsigs.addElement(manualMode_1);
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
              }
            }
            else {
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\lidloader.sysj line: 97, column: 9
              autoMode_1.setPresent();//sysj\lidloader.sysj line: 98, column: 7
              currsigs.addElement(autoMode_1);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\lidloader.sysj line: 100, column: 14
                manualMode_1.setPresent();//sysj\lidloader.sysj line: 101, column: 7
                currsigs.addElement(manualMode_1);
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread169884(int [] tdone, int [] ends){
        switch(S119590){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\lidloader.sysj line: 88, column: 21
          armDest.setPresent();//sysj\lidloader.sysj line: 88, column: 31
          currsigs.addElement(armDest);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread169883(int [] tdone, int [] ends){
        switch(S119582){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S119486){
          case 0 : 
            switch(S119446){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\lidloader.sysj line: 86, column: 48
                  lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 86, column: 48
                  S119446=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  switch(S119441){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 86, column: 48
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\lidloader.sysj line: 86, column: 48
                        S119441=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 86, column: 48
                          lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 86, column: 48
                          ends[7]=2;
                          ;//sysj\lidloader.sysj line: 86, column: 48
                          S119486=1;
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                        else {
                          active[7]=1;
                          ends[7]=1;
                          tdone[7]=1;
                        }
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 86, column: 48
                        lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 86, column: 48
                        ends[7]=2;
                        ;//sysj\lidloader.sysj line: 86, column: 48
                        S119486=1;
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      else {
                        active[7]=1;
                        ends[7]=1;
                        tdone[7]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S119446=1;
                S119446=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\lidloader.sysj line: 86, column: 48
                  lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 86, column: 48
                  S119446=1;
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
                else {
                  S119441=0;
                  if(lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 86, column: 48
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\lidloader.sysj line: 86, column: 48
                    S119441=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 86, column: 48
                      lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 86, column: 48
                      ends[7]=2;
                      ;//sysj\lidloader.sysj line: 86, column: 48
                      S119486=1;
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                    else {
                      active[7]=1;
                      ends[7]=1;
                      tdone[7]=1;
                    }
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S119486=1;
            S119486=0;
            if(armSourceM.getprestatus()){//sysj\lidloader.sysj line: 86, column: 21
              armSource.setPresent();//sysj\lidloader.sysj line: 86, column: 33
              currsigs.addElement(armSource);
              S119446=0;
              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\lidloader.sysj line: 86, column: 48
                lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 86, column: 48
                S119446=1;
                active[7]=1;
                ends[7]=1;
                tdone[7]=1;
              }
              else {
                S119441=0;
                if(lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 86, column: 48
                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\lidloader.sysj line: 86, column: 48
                  S119441=1;
                  if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 86, column: 48
                    lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 86, column: 48
                    ends[7]=2;
                    ;//sysj\lidloader.sysj line: 86, column: 48
                    S119486=1;
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                  else {
                    active[7]=1;
                    ends[7]=1;
                    tdone[7]=1;
                  }
                }
                else {
                  active[7]=1;
                  ends[7]=1;
                  tdone[7]=1;
                }
              }
            }
            else {
              S119486=1;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread169882(int [] tdone, int [] ends){
        switch(S119439){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\lidloader.sysj line: 84, column: 21
          vacOn.setPresent();//sysj\lidloader.sysj line: 84, column: 29
          currsigs.addElement(vacOn);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread169881(int [] tdone, int [] ends){
        switch(S119431){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S119425){
          case 0 : 
            S119425=0;
            if(pusherExtendM.getprestatus()){//sysj\lidloader.sysj line: 82, column: 21
              pusherExtend.setPresent();//sysj\lidloader.sysj line: 82, column: 36
              currsigs.addElement(pusherExtend);
              S119425=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S119425=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S119425=1;
            S119425=0;
            if(pusherExtendM.getprestatus()){//sysj\lidloader.sysj line: 82, column: 21
              pusherExtend.setPresent();//sysj\lidloader.sysj line: 82, column: 36
              currsigs.addElement(pusherExtend);
              S119425=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S119425=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread169879(int [] tdone, int [] ends){
        S119590=1;
    if(armDestM.getprestatus()){//sysj\lidloader.sysj line: 88, column: 21
      armDest.setPresent();//sysj\lidloader.sysj line: 88, column: 31
      currsigs.addElement(armDest);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread169878(int [] tdone, int [] ends){
        S119582=1;
    S119486=0;
    if(armSourceM.getprestatus()){//sysj\lidloader.sysj line: 86, column: 21
      armSource.setPresent();//sysj\lidloader.sysj line: 86, column: 33
      currsigs.addElement(armSource);
      S119446=0;
      if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\lidloader.sysj line: 86, column: 48
        lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 86, column: 48
        S119446=1;
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
      }
      else {
        S119441=0;
        if(lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 86, column: 48
          lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\lidloader.sysj line: 86, column: 48
          S119441=1;
          if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 86, column: 48
            lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 86, column: 48
            ends[7]=2;
            ;//sysj\lidloader.sysj line: 86, column: 48
            S119486=1;
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
          }
          else {
            active[7]=1;
            ends[7]=1;
            tdone[7]=1;
          }
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
      }
    }
    else {
      S119486=1;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread169877(int [] tdone, int [] ends){
        S119439=1;
    if(vacOnM.getprestatus()){//sysj\lidloader.sysj line: 84, column: 21
      vacOn.setPresent();//sysj\lidloader.sysj line: 84, column: 29
      currsigs.addElement(vacOn);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread169876(int [] tdone, int [] ends){
        S119431=1;
    S119425=0;
    if(pusherExtendM.getprestatus()){//sysj\lidloader.sysj line: 82, column: 21
      pusherExtend.setPresent();//sysj\lidloader.sysj line: 82, column: 36
      currsigs.addElement(pusherExtend);
      S119425=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S119425=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread169874(int [] tdone, int [] ends){
        switch(S116576){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S116567){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\lidloader.sysj line: 53, column: 16
              System.out.println("WP gripped");//sysj\lidloader.sysj line: 54, column: 10
              S116567=1;
              armDest.setPresent();//sysj\lidloader.sysj line: 56, column: 11
              currsigs.addElement(armDest);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(armAtDest.getprestatus()){//sysj\lidloader.sysj line: 55, column: 16
              System.out.println("Arm at dest");//sysj\lidloader.sysj line: 58, column: 10
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              armDest.setPresent();//sysj\lidloader.sysj line: 56, column: 11
              currsigs.addElement(armDest);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread169873(int [] tdone, int [] ends){
        switch(S116565){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\lidloader.sysj line: 49, column: 10
        currsigs.addElement(vacOn);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread169871(int [] tdone, int [] ends){
        S116576=1;
    S116567=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread169870(int [] tdone, int [] ends){
        S116565=1;
    vacOn.setPresent();//sysj\lidloader.sysj line: 49, column: 10
    currsigs.addElement(vacOn);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread169869(int [] tdone, int [] ends){
        switch(S169051){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S169050){
          case 0 : 
            switch(S116458){
              case 0 : 
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\lidloader.sysj line: 13, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 13, column: 5
                  S116458=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S116453){
                    case 0 : 
                      if(lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 13, column: 5
                        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\lidloader.sysj line: 13, column: 5
                        S116453=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 13, column: 5
                          lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 13, column: 5
                          ends[2]=2;
                          ;//sysj\lidloader.sysj line: 13, column: 5
                          S169050=1;
                          S116519=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 13, column: 5
                        lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 13, column: 5
                        ends[2]=2;
                        ;//sysj\lidloader.sysj line: 13, column: 5
                        S169050=1;
                        S116519=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S116458=1;
                S116458=0;
                if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\lidloader.sysj line: 13, column: 5
                  lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 13, column: 5
                  S116458=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S116453=0;
                  if(lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 13, column: 5
                    lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\lidloader.sysj line: 13, column: 5
                    S116453=1;
                    if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 13, column: 5
                      lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 13, column: 5
                      ends[2]=2;
                      ;//sysj\lidloader.sysj line: 13, column: 5
                      S169050=1;
                      S116519=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            switch(S116519){
              case 0 : 
                if(bottleAtPos3_1.getprestatus()){//sysj\lidloader.sysj line: 15, column: 13
                  S116519=1;
                  S116481=0;
                  if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\lidloader.sysj line: 16, column: 6
                    lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 16, column: 6
                    S116481=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S116476=0;
                    if(lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 16, column: 6
                      lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\lidloader.sysj line: 16, column: 6
                      S116476=1;
                      if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 16, column: 6
                        lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 16, column: 6
                        ends[2]=2;
                        ;//sysj\lidloader.sysj line: 16, column: 6
                        S116519=2;
                        System.out.println("*Capper - Entering Auto");//sysj\lidloader.sysj line: 18, column: 7
                        S116528=0;
                        armDest.setPresent();//sysj\lidloader.sysj line: 20, column: 8
                        currsigs.addElement(armDest);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                switch(S116481){
                  case 0 : 
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\lidloader.sysj line: 16, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 16, column: 6
                      S116481=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      switch(S116476){
                        case 0 : 
                          if(lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 16, column: 6
                            lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\lidloader.sysj line: 16, column: 6
                            S116476=1;
                            if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 16, column: 6
                              lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 16, column: 6
                              ends[2]=2;
                              ;//sysj\lidloader.sysj line: 16, column: 6
                              S116519=2;
                              System.out.println("*Capper - Entering Auto");//sysj\lidloader.sysj line: 18, column: 7
                              S116528=0;
                              armDest.setPresent();//sysj\lidloader.sysj line: 20, column: 8
                              currsigs.addElement(armDest);
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 16, column: 6
                            lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 16, column: 6
                            ends[2]=2;
                            ;//sysj\lidloader.sysj line: 16, column: 6
                            S116519=2;
                            System.out.println("*Capper - Entering Auto");//sysj\lidloader.sysj line: 18, column: 7
                            S116528=0;
                            armDest.setPresent();//sysj\lidloader.sysj line: 20, column: 8
                            currsigs.addElement(armDest);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                      }
                    }
                    break;
                  
                  case 1 : 
                    S116481=1;
                    S116481=0;
                    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\lidloader.sysj line: 16, column: 6
                      lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 16, column: 6
                      S116481=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S116476=0;
                      if(lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 16, column: 6
                        lidLoaderReady_o.setVal(Boolean.FALSE);//sysj\lidloader.sysj line: 16, column: 6
                        S116476=1;
                        if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 16, column: 6
                          lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 16, column: 6
                          ends[2]=2;
                          ;//sysj\lidloader.sysj line: 16, column: 6
                          S116519=2;
                          System.out.println("*Capper - Entering Auto");//sysj\lidloader.sysj line: 18, column: 7
                          S116528=0;
                          armDest.setPresent();//sysj\lidloader.sysj line: 20, column: 8
                          currsigs.addElement(armDest);
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
              case 2 : 
                if(manualMode_1.getprestatus()){//sysj\lidloader.sysj line: 17, column: 12
                  lidLoaderReady_o.setPreempted();
                  S116519=3;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S116528){
                    case 0 : 
                      if(armAtDest.getprestatus()){//sysj\lidloader.sysj line: 19, column: 13
                        System.out.println("Arm at dest");//sysj\lidloader.sysj line: 22, column: 7
                        S116528=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        armDest.setPresent();//sysj\lidloader.sysj line: 20, column: 8
                        currsigs.addElement(armDest);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(pusherRetracted.getprestatus()){//sysj\lidloader.sysj line: 23, column: 13
                        System.out.println("Pusher retracted");//sysj\lidloader.sysj line: 24, column: 7
                        S116528=2;
                        S116534=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 2 : 
                      switch(S116534){
                        case 0 : 
                          if(!empty.getprestatus()){//sysj\lidloader.sysj line: 27, column: 14
                            S116534=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                        case 1 : 
                          if(request.getprestatus()){//sysj\lidloader.sysj line: 28, column: 14
                            System.out.println("New request");//sysj\lidloader.sysj line: 29, column: 8
                            S116534=2;
                            armDest.setPresent();//sysj\lidloader.sysj line: 31, column: 9
                            currsigs.addElement(armDest);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                        case 2 : 
                          if(armAtDest.getprestatus()){//sysj\lidloader.sysj line: 30, column: 14
                            System.out.println("Arm at dest");//sysj\lidloader.sysj line: 33, column: 8
                            S116534=3;
                            pusherExtend.setPresent();//sysj\lidloader.sysj line: 36, column: 9
                            currsigs.addElement(pusherExtend);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            armDest.setPresent();//sysj\lidloader.sysj line: 31, column: 9
                            currsigs.addElement(armDest);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                        case 3 : 
                          if(pusherExtended.getprestatus()){//sysj\lidloader.sysj line: 35, column: 14
                            System.out.println("Pusher extended");//sysj\lidloader.sysj line: 38, column: 8
                            S116534=4;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            pusherExtend.setPresent();//sysj\lidloader.sysj line: 36, column: 9
                            currsigs.addElement(pusherExtend);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                        case 4 : 
                          if(pusherRetracted.getprestatus()){//sysj\lidloader.sysj line: 39, column: 14
                            System.out.println("Pusher retracted");//sysj\lidloader.sysj line: 40, column: 8
                            S116534=5;
                            armSource.setPresent();//sysj\lidloader.sysj line: 43, column: 9
                            currsigs.addElement(armSource);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                        case 5 : 
                          if(armAtSource.getprestatus()){//sysj\lidloader.sysj line: 42, column: 14
                            System.out.println("Arm at source");//sysj\lidloader.sysj line: 45, column: 8
                            S116534=6;
                            thread169870(tdone,ends);
                            thread169871(tdone,ends);
                            int biggest169872 = 0;
                            if(ends[3]>=biggest169872){
                              biggest169872=ends[3];
                            }
                            if(ends[4]>=biggest169872){
                              biggest169872=ends[4];
                            }
                            if(biggest169872 == 1){
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\lidloader.sysj line: 43, column: 9
                            currsigs.addElement(armSource);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                        case 6 : 
                          thread169873(tdone,ends);
                          thread169874(tdone,ends);
                          int biggest169875 = 0;
                          if(ends[3]>=biggest169875){
                            biggest169875=ends[3];
                          }
                          if(ends[4]>=biggest169875){
                            biggest169875=ends[4];
                          }
                          if(biggest169875 == 1){
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          if(biggest169875 == 2){
                            ends[2]=2;
                            ;//sysj\lidloader.sysj line: 47, column: 8
                            S116534=7;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          //FINXME code
                          if(biggest169875 == 0){
                            S116534=7;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                        case 7 : 
                          if(!WPgripped.getprestatus()){//sysj\lidloader.sysj line: 63, column: 14
                            S116534=8;
                            armSource.setPresent();//sysj\lidloader.sysj line: 66, column: 9
                            currsigs.addElement(armSource);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                        case 8 : 
                          if(armAtSource.getprestatus()){//sysj\lidloader.sysj line: 65, column: 14
                            S116534=9;
                            S116612=0;
                            if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\lidloader.sysj line: 70, column: 8
                              lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 70, column: 8
                              S116612=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
                              S116607=0;
                              if(lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 70, column: 8
                                lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\lidloader.sysj line: 70, column: 8
                                S116607=1;
                                if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 70, column: 8
                                  lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 70, column: 8
                                  ends[2]=2;
                                  ;//sysj\lidloader.sysj line: 70, column: 8
                                  System.out.println("Arm at source");//sysj\lidloader.sysj line: 72, column: 8
                                  S116534=10;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                              else {
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                          }
                          else {
                            armSource.setPresent();//sysj\lidloader.sysj line: 66, column: 9
                            currsigs.addElement(armSource);
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          break;
                        
                        case 9 : 
                          switch(S116612){
                            case 0 : 
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\lidloader.sysj line: 70, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 70, column: 8
                                S116612=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                switch(S116607){
                                  case 0 : 
                                    if(lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 70, column: 8
                                      lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\lidloader.sysj line: 70, column: 8
                                      S116607=1;
                                      if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 70, column: 8
                                        lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 70, column: 8
                                        ends[2]=2;
                                        ;//sysj\lidloader.sysj line: 70, column: 8
                                        System.out.println("Arm at source");//sysj\lidloader.sysj line: 72, column: 8
                                        S116534=10;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                    }
                                    else {
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    break;
                                  
                                  case 1 : 
                                    if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 70, column: 8
                                      lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 70, column: 8
                                      ends[2]=2;
                                      ;//sysj\lidloader.sysj line: 70, column: 8
                                      System.out.println("Arm at source");//sysj\lidloader.sysj line: 72, column: 8
                                      S116534=10;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    break;
                                  
                                }
                              }
                              break;
                            
                            case 1 : 
                              S116612=1;
                              S116612=0;
                              if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\lidloader.sysj line: 70, column: 8
                                lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 70, column: 8
                                S116612=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S116607=0;
                                if(lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 70, column: 8
                                  lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\lidloader.sysj line: 70, column: 8
                                  S116607=1;
                                  if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 70, column: 8
                                    lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 70, column: 8
                                    ends[2]=2;
                                    ;//sysj\lidloader.sysj line: 70, column: 8
                                    System.out.println("Arm at source");//sysj\lidloader.sysj line: 72, column: 8
                                    S116534=10;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                                else {
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                              break;
                            
                          }
                          break;
                        
                        case 10 : 
                          S116534=10;
                          S116534=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                          break;
                        
                      }
                      break;
                    
                  }
                }
                break;
              
              case 3 : 
                S116519=3;
                System.out.println("entering manual");//sysj\lidloader.sysj line: 80, column: 6
                S116519=4;
                thread169876(tdone,ends);
                thread169877(tdone,ends);
                thread169878(tdone,ends);
                thread169879(tdone,ends);
                int biggest169880 = 0;
                if(ends[5]>=biggest169880){
                  biggest169880=ends[5];
                }
                if(ends[6]>=biggest169880){
                  biggest169880=ends[6];
                }
                if(ends[7]>=biggest169880){
                  biggest169880=ends[7];
                }
                if(ends[8]>=biggest169880){
                  biggest169880=ends[8];
                }
                if(biggest169880 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 4 : 
                if(autoMode_1.getprestatus()){//sysj\lidloader.sysj line: 81, column: 12
                  lidLoaderReady_o.setPreempted();
                  S116519=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  thread169881(tdone,ends);
                  thread169882(tdone,ends);
                  thread169883(tdone,ends);
                  thread169884(tdone,ends);
                  int biggest169885 = 0;
                  if(ends[5]>=biggest169885){
                    biggest169885=ends[5];
                  }
                  if(ends[6]>=biggest169885){
                    biggest169885=ends[6];
                  }
                  if(ends[7]>=biggest169885){
                    biggest169885=ends[7];
                  }
                  if(ends[8]>=biggest169885){
                    biggest169885=ends[8];
                  }
                  if(biggest169885 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest169885 == 0){
                    S116519=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread169866(int [] tdone, int [] ends){
        S169163=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread169865(int [] tdone, int [] ends){
        S169160=1;
    bottleAtPos3E.setPresent();//sysj\lidloader.sysj line: 127, column: 22
    currsigs.addElement(bottleAtPos3E);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread169864(int [] tdone, int [] ends){
        S169193=1;
    S169167=0;
    if(bottleAtPos3_1.getprestatus()){//sysj\lidloader.sysj line: 124, column: 20
      thread169865(tdone,ends);
      thread169866(tdone,ends);
      int biggest169867 = 0;
      if(ends[12]>=biggest169867){
        biggest169867=ends[12];
      }
      if(ends[13]>=biggest169867){
        biggest169867=ends[13];
      }
      if(biggest169867 == 1){
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
    else {
      S169167=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread169863(int [] tdone, int [] ends){
        S169155=1;
    S169099=0;
    S169079=0;
    if(!checkThree_in.isPartnerPresent() || checkThree_in.isPartnerPreempted()){//sysj\lidloader.sysj line: 111, column: 6
      checkThree_in.setACK(false);//sysj\lidloader.sysj line: 111, column: 6
      S169079=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S169074=0;
      if(!checkThree_in.isREQ()){//sysj\lidloader.sysj line: 111, column: 6
        checkThree_in.setACK(true);//sysj\lidloader.sysj line: 111, column: 6
        S169074=1;
        if(checkThree_in.isREQ()){//sysj\lidloader.sysj line: 111, column: 6
          checkThree_in.setACK(false);//sysj\lidloader.sysj line: 111, column: 6
          ends[10]=2;
          ;//sysj\lidloader.sysj line: 111, column: 6
          if((Boolean)(checkThree_in.getVal() == null ? null : ((Boolean)checkThree_in.getVal()))){//sysj\lidloader.sysj line: 112, column: 9
            bottleAtPos3_1.setPresent();//sysj\lidloader.sysj line: 113, column: 7
            currsigs.addElement(bottleAtPos3_1);
            S169099=1;
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
          }
          else {
            done_1.setPresent();//sysj\lidloader.sysj line: 115, column: 7
            currsigs.addElement(done_1);
            S169099=1;
            active[10]=1;
            ends[10]=1;
            tdone[10]=1;
          }
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
      }
      else {
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
  }

  public void thread169862(int [] tdone, int [] ends){
        S169072=1;
    S169071=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread169861(int [] tdone, int [] ends){
        S169051=1;
    S169050=0;
    S116458=0;
    if(!lidLoaderReady_o.isPartnerPresent() || lidLoaderReady_o.isPartnerPreempted()){//sysj\lidloader.sysj line: 13, column: 5
      lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 13, column: 5
      S116458=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      S116453=0;
      if(lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 13, column: 5
        lidLoaderReady_o.setVal(Boolean.TRUE);//sysj\lidloader.sysj line: 13, column: 5
        S116453=1;
        if(!lidLoaderReady_o.isACK()){//sysj\lidloader.sysj line: 13, column: 5
          lidLoaderReady_o.setREQ(false);//sysj\lidloader.sysj line: 13, column: 5
          ends[2]=2;
          ;//sysj\lidloader.sysj line: 13, column: 5
          S169050=1;
          S116519=0;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        else {
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S169195){
        case 0 : 
          S169195=0;
          break RUN;
        
        case 1 : 
          S169195=2;
          S169195=2;
          manualMode_1.setClear();//sysj\lidloader.sysj line: 11, column: 4
          autoMode_1.setClear();//sysj\lidloader.sysj line: 11, column: 4
          bottleAtPos3_1.setClear();//sysj\lidloader.sysj line: 11, column: 4
          done_1.setClear();//sysj\lidloader.sysj line: 11, column: 4
          thread169861(tdone,ends);
          thread169862(tdone,ends);
          thread169863(tdone,ends);
          thread169864(tdone,ends);
          int biggest169868 = 0;
          if(ends[2]>=biggest169868){
            biggest169868=ends[2];
          }
          if(ends[9]>=biggest169868){
            biggest169868=ends[9];
          }
          if(ends[10]>=biggest169868){
            biggest169868=ends[10];
          }
          if(ends[11]>=biggest169868){
            biggest169868=ends[11];
          }
          if(biggest169868 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          manualMode_1.setClear();//sysj\lidloader.sysj line: 11, column: 4
          autoMode_1.setClear();//sysj\lidloader.sysj line: 11, column: 4
          bottleAtPos3_1.setClear();//sysj\lidloader.sysj line: 11, column: 4
          done_1.setClear();//sysj\lidloader.sysj line: 11, column: 4
          thread169869(tdone,ends);
          thread169886(tdone,ends);
          thread169887(tdone,ends);
          thread169888(tdone,ends);
          int biggest169895 = 0;
          if(ends[2]>=biggest169895){
            biggest169895=ends[2];
          }
          if(ends[9]>=biggest169895){
            biggest169895=ends[9];
          }
          if(ends[10]>=biggest169895){
            biggest169895=ends[10];
          }
          if(ends[11]>=biggest169895){
            biggest169895=ends[11];
          }
          if(biggest169895 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest169895 == 0){
            S169195=0;
            active[1]=0;
            ends[1]=0;
            S169195=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    manualMode_1 = new Signal();
    autoMode_1 = new Signal();
    bottleAtPos3_1 = new Signal();
    done_1 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
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
      manualMode_1.setpreclear();
      autoMode_1.setpreclear();
      bottleAtPos3_1.setpreclear();
      done_1.setpreclear();
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
      manualMode_1.setClear();
      autoMode_1.setClear();
      bottleAtPos3_1.setClear();
      done_1.setClear();
      checkThree_in.sethook();
      lidLoaderReady_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
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
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}

package fi.tucs.entities.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fi.tucs.entities.services.EntitiesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntitiesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'extends'", "'{'", "'}'", "'='", "'print'", "'on'", "'off'", "'text'", "'number'", "'toggle'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEntitiesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntitiesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntitiesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEntities.g"; }



     	private EntitiesGrammarAccess grammarAccess;

        public InternalEntitiesParser(TokenStream input, EntitiesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected EntitiesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEntities.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEntities.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalEntities.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEntities.g:71:1: ruleModel returns [EObject current=null] : ( (lv_entities_0_0= ruleEntity ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;



        	enterRule();

        try {
            // InternalEntities.g:77:2: ( ( (lv_entities_0_0= ruleEntity ) )* )
            // InternalEntities.g:78:2: ( (lv_entities_0_0= ruleEntity ) )*
            {
            // InternalEntities.g:78:2: ( (lv_entities_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEntities.g:79:3: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalEntities.g:79:3: (lv_entities_0_0= ruleEntity )
            	    // InternalEntities.g:80:4: lv_entities_0_0= ruleEntity
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"entities",
            	    					lv_entities_0_0,
            	    					"fi.tucs.entities.Entities.Entity");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalEntities.g:100:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalEntities.g:100:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalEntities.g:101:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalEntities.g:107:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_fields_5_0 = null;

        EObject lv_statements_6_0 = null;



        	enterRule();

        try {
            // InternalEntities.g:113:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' ) )
            // InternalEntities.g:114:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' )
            {
            // InternalEntities.g:114:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' )
            // InternalEntities.g:115:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalEntities.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntities.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEntities.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalEntities.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEntities.g:137:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEntities.g:138:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalEntities.g:142:4: ( (otherlv_3= RULE_ID ) )
                    // InternalEntities.g:143:5: (otherlv_3= RULE_ID )
                    {
                    // InternalEntities.g:143:5: (otherlv_3= RULE_ID )
                    // InternalEntities.g:144:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEntities.g:160:3: ( (lv_fields_5_0= ruleField ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_ID) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>=19 && LA3_0<=21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEntities.g:161:4: (lv_fields_5_0= ruleField )
            	    {
            	    // InternalEntities.g:161:4: (lv_fields_5_0= ruleField )
            	    // InternalEntities.g:162:5: lv_fields_5_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_fields_5_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_5_0,
            	    						"fi.tucs.entities.Entities.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalEntities.g:179:3: ( (lv_statements_6_0= ruleStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEntities.g:180:4: (lv_statements_6_0= ruleStatement )
            	    {
            	    // InternalEntities.g:180:4: (lv_statements_6_0= ruleStatement )
            	    // InternalEntities.g:181:5: lv_statements_6_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_statements_6_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_6_0,
            	    						"fi.tucs.entities.Entities.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleStatement"
    // InternalEntities.g:206:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalEntities.g:206:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalEntities.g:207:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalEntities.g:213:1: ruleStatement returns [EObject current=null] : (this_PrintStatement_0= rulePrintStatement | this_AssignmentStatement_1= ruleAssignmentStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_PrintStatement_0 = null;

        EObject this_AssignmentStatement_1 = null;



        	enterRule();

        try {
            // InternalEntities.g:219:2: ( (this_PrintStatement_0= rulePrintStatement | this_AssignmentStatement_1= ruleAssignmentStatement ) )
            // InternalEntities.g:220:2: (this_PrintStatement_0= rulePrintStatement | this_AssignmentStatement_1= ruleAssignmentStatement )
            {
            // InternalEntities.g:220:2: (this_PrintStatement_0= rulePrintStatement | this_AssignmentStatement_1= ruleAssignmentStatement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntities.g:221:3: this_PrintStatement_0= rulePrintStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintStatement_0=rulePrintStatement();

                    state._fsp--;


                    			current = this_PrintStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEntities.g:230:3: this_AssignmentStatement_1= ruleAssignmentStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssignmentStatement_1=ruleAssignmentStatement();

                    state._fsp--;


                    			current = this_AssignmentStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAssignmentStatement"
    // InternalEntities.g:242:1: entryRuleAssignmentStatement returns [EObject current=null] : iv_ruleAssignmentStatement= ruleAssignmentStatement EOF ;
    public final EObject entryRuleAssignmentStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentStatement = null;


        try {
            // InternalEntities.g:242:60: (iv_ruleAssignmentStatement= ruleAssignmentStatement EOF )
            // InternalEntities.g:243:2: iv_ruleAssignmentStatement= ruleAssignmentStatement EOF
            {
             newCompositeNode(grammarAccess.getAssignmentStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentStatement=ruleAssignmentStatement();

            state._fsp--;

             current =iv_ruleAssignmentStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentStatement"


    // $ANTLR start "ruleAssignmentStatement"
    // InternalEntities.g:249:1: ruleAssignmentStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignmentStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalEntities.g:255:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // InternalEntities.g:256:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // InternalEntities.g:256:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // InternalEntities.g:257:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // InternalEntities.g:257:3: ( (otherlv_0= RULE_ID ) )
            // InternalEntities.g:258:4: (otherlv_0= RULE_ID )
            {
            // InternalEntities.g:258:4: (otherlv_0= RULE_ID )
            // InternalEntities.g:259:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentStatementAccess().getAssigneeFieldCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentStatementAccess().getEqualsSignKeyword_1());
            		
            // InternalEntities.g:274:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalEntities.g:275:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalEntities.g:275:4: (lv_expr_2_0= ruleExpression )
            // InternalEntities.g:276:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentStatementAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentStatementRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"fi.tucs.entities.Entities.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentStatement"


    // $ANTLR start "entryRulePrintStatement"
    // InternalEntities.g:297:1: entryRulePrintStatement returns [EObject current=null] : iv_rulePrintStatement= rulePrintStatement EOF ;
    public final EObject entryRulePrintStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintStatement = null;


        try {
            // InternalEntities.g:297:55: (iv_rulePrintStatement= rulePrintStatement EOF )
            // InternalEntities.g:298:2: iv_rulePrintStatement= rulePrintStatement EOF
            {
             newCompositeNode(grammarAccess.getPrintStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintStatement=rulePrintStatement();

            state._fsp--;

             current =iv_rulePrintStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrintStatement"


    // $ANTLR start "rulePrintStatement"
    // InternalEntities.g:304:1: rulePrintStatement returns [EObject current=null] : (otherlv_0= 'print' ( (lv_expr_1_0= ruleExpression ) ) ) ;
    public final EObject rulePrintStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalEntities.g:310:2: ( (otherlv_0= 'print' ( (lv_expr_1_0= ruleExpression ) ) ) )
            // InternalEntities.g:311:2: (otherlv_0= 'print' ( (lv_expr_1_0= ruleExpression ) ) )
            {
            // InternalEntities.g:311:2: (otherlv_0= 'print' ( (lv_expr_1_0= ruleExpression ) ) )
            // InternalEntities.g:312:3: otherlv_0= 'print' ( (lv_expr_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintStatementAccess().getPrintKeyword_0());
            		
            // InternalEntities.g:316:3: ( (lv_expr_1_0= ruleExpression ) )
            // InternalEntities.g:317:4: (lv_expr_1_0= ruleExpression )
            {
            // InternalEntities.g:317:4: (lv_expr_1_0= ruleExpression )
            // InternalEntities.g:318:5: lv_expr_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPrintStatementAccess().getExprExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintStatementRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"fi.tucs.entities.Entities.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrintStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalEntities.g:339:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEntities.g:339:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalEntities.g:340:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalEntities.g:346:1: ruleExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'on' | lv_value_5_2= 'off' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalEntities.g:352:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'on' | lv_value_5_2= 'off' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalEntities.g:353:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'on' | lv_value_5_2= 'off' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalEntities.g:353:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'on' | lv_value_5_2= 'off' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case 17:
            case 18:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalEntities.g:354:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalEntities.g:354:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalEntities.g:355:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalEntities.g:355:4: ()
                    // InternalEntities.g:356:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalEntities.g:362:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalEntities.g:363:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalEntities.g:363:5: (lv_value_1_0= RULE_INT )
                    // InternalEntities.g:364:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEntities.g:382:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalEntities.g:382:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalEntities.g:383:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalEntities.g:383:4: ()
                    // InternalEntities.g:384:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEntities.g:390:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalEntities.g:391:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalEntities.g:391:5: (lv_value_3_0= RULE_STRING )
                    // InternalEntities.g:392:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEntities.g:410:3: ( () ( ( (lv_value_5_1= 'on' | lv_value_5_2= 'off' ) ) ) )
                    {
                    // InternalEntities.g:410:3: ( () ( ( (lv_value_5_1= 'on' | lv_value_5_2= 'off' ) ) ) )
                    // InternalEntities.g:411:4: () ( ( (lv_value_5_1= 'on' | lv_value_5_2= 'off' ) ) )
                    {
                    // InternalEntities.g:411:4: ()
                    // InternalEntities.g:412:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalEntities.g:418:4: ( ( (lv_value_5_1= 'on' | lv_value_5_2= 'off' ) ) )
                    // InternalEntities.g:419:5: ( (lv_value_5_1= 'on' | lv_value_5_2= 'off' ) )
                    {
                    // InternalEntities.g:419:5: ( (lv_value_5_1= 'on' | lv_value_5_2= 'off' ) )
                    // InternalEntities.g:420:6: (lv_value_5_1= 'on' | lv_value_5_2= 'off' )
                    {
                    // InternalEntities.g:420:6: (lv_value_5_1= 'on' | lv_value_5_2= 'off' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==17) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==18) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalEntities.g:421:7: lv_value_5_1= 'on'
                            {
                            lv_value_5_1=(Token)match(input,17,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getExpressionAccess().getValueOnKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalEntities.g:432:7: lv_value_5_2= 'off'
                            {
                            lv_value_5_2=(Token)match(input,18,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getExpressionAccess().getValueOffKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEntities.g:447:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalEntities.g:447:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalEntities.g:448:4: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalEntities.g:448:4: ()
                    // InternalEntities.g:449:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getFieldRefAction_3_0(),
                    						current);
                    				

                    }

                    // InternalEntities.g:455:4: ( (otherlv_7= RULE_ID ) )
                    // InternalEntities.g:456:5: (otherlv_7= RULE_ID )
                    {
                    // InternalEntities.g:456:5: (otherlv_7= RULE_ID )
                    // InternalEntities.g:457:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getFieldFieldCrossReference_3_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleField"
    // InternalEntities.g:473:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalEntities.g:473:46: (iv_ruleField= ruleField EOF )
            // InternalEntities.g:474:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalEntities.g:480:1: ruleField returns [EObject current=null] : ( ( (lv_type_0_0= ruleFieldType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalEntities.g:486:2: ( ( ( (lv_type_0_0= ruleFieldType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalEntities.g:487:2: ( ( (lv_type_0_0= ruleFieldType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalEntities.g:487:2: ( ( (lv_type_0_0= ruleFieldType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalEntities.g:488:3: ( (lv_type_0_0= ruleFieldType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalEntities.g:488:3: ( (lv_type_0_0= ruleFieldType ) )
            // InternalEntities.g:489:4: (lv_type_0_0= ruleFieldType )
            {
            // InternalEntities.g:489:4: (lv_type_0_0= ruleFieldType )
            // InternalEntities.g:490:5: lv_type_0_0= ruleFieldType
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleFieldType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"fi.tucs.entities.Entities.FieldType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEntities.g:507:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntities.g:508:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEntities.g:508:4: (lv_name_1_0= RULE_ID )
            // InternalEntities.g:509:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldType"
    // InternalEntities.g:529:1: entryRuleFieldType returns [EObject current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final EObject entryRuleFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldType = null;


        try {
            // InternalEntities.g:529:50: (iv_ruleFieldType= ruleFieldType EOF )
            // InternalEntities.g:530:2: iv_ruleFieldType= ruleFieldType EOF
            {
             newCompositeNode(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldType=ruleFieldType();

            state._fsp--;

             current =iv_ruleFieldType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // InternalEntities.g:536:1: ruleFieldType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleFieldType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_EntityType_1 = null;



        	enterRule();

        try {
            // InternalEntities.g:542:2: ( (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) )
            // InternalEntities.g:543:2: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            {
            // InternalEntities.g:543:2: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=19 && LA8_0<=21)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEntities.g:544:3: this_BasicType_0= ruleBasicType
                    {

                    			newCompositeNode(grammarAccess.getFieldTypeAccess().getBasicTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;


                    			current = this_BasicType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEntities.g:553:3: this_EntityType_1= ruleEntityType
                    {

                    			newCompositeNode(grammarAccess.getFieldTypeAccess().getEntityTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityType_1=ruleEntityType();

                    state._fsp--;


                    			current = this_EntityType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "entryRuleBasicType"
    // InternalEntities.g:565:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalEntities.g:565:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalEntities.g:566:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalEntities.g:572:1: ruleBasicType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'text' | lv_typeName_0_2= 'number' | lv_typeName_0_3= 'toggle' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;


        	enterRule();

        try {
            // InternalEntities.g:578:2: ( ( ( (lv_typeName_0_1= 'text' | lv_typeName_0_2= 'number' | lv_typeName_0_3= 'toggle' ) ) ) )
            // InternalEntities.g:579:2: ( ( (lv_typeName_0_1= 'text' | lv_typeName_0_2= 'number' | lv_typeName_0_3= 'toggle' ) ) )
            {
            // InternalEntities.g:579:2: ( ( (lv_typeName_0_1= 'text' | lv_typeName_0_2= 'number' | lv_typeName_0_3= 'toggle' ) ) )
            // InternalEntities.g:580:3: ( (lv_typeName_0_1= 'text' | lv_typeName_0_2= 'number' | lv_typeName_0_3= 'toggle' ) )
            {
            // InternalEntities.g:580:3: ( (lv_typeName_0_1= 'text' | lv_typeName_0_2= 'number' | lv_typeName_0_3= 'toggle' ) )
            // InternalEntities.g:581:4: (lv_typeName_0_1= 'text' | lv_typeName_0_2= 'number' | lv_typeName_0_3= 'toggle' )
            {
            // InternalEntities.g:581:4: (lv_typeName_0_1= 'text' | lv_typeName_0_2= 'number' | lv_typeName_0_3= 'toggle' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalEntities.g:582:5: lv_typeName_0_1= 'text'
                    {
                    lv_typeName_0_1=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameTextKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalEntities.g:593:5: lv_typeName_0_2= 'number'
                    {
                    lv_typeName_0_2=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameNumberKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalEntities.g:604:5: lv_typeName_0_3= 'toggle'
                    {
                    lv_typeName_0_3=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameToggleKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEntityType"
    // InternalEntities.g:620:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalEntities.g:620:51: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalEntities.g:621:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalEntities.g:627:1: ruleEntityType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalEntities.g:633:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalEntities.g:634:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalEntities.g:634:2: ( (otherlv_0= RULE_ID ) )
            // InternalEntities.g:635:3: (otherlv_0= RULE_ID )
            {
            // InternalEntities.g:635:3: (otherlv_0= RULE_ID )
            // InternalEntities.g:636:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntityTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000394010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060070L});

}
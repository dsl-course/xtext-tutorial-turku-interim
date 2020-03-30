package fi.tucs.entities.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fi.tucs.entities.services.EntitiesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntitiesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'on'", "'off'", "'text'", "'number'", "'toggle'", "'entity'", "'{'", "'}'", "'extends'", "'='", "'print'"
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

    	public void setGrammarAccess(EntitiesGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalEntities.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalEntities.g:54:1: ( ruleModel EOF )
            // InternalEntities.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEntities.g:62:1: ruleModel : ( ( rule__Model__EntitiesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:66:2: ( ( ( rule__Model__EntitiesAssignment )* ) )
            // InternalEntities.g:67:2: ( ( rule__Model__EntitiesAssignment )* )
            {
            // InternalEntities.g:67:2: ( ( rule__Model__EntitiesAssignment )* )
            // InternalEntities.g:68:3: ( rule__Model__EntitiesAssignment )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment()); 
            // InternalEntities.g:69:3: ( rule__Model__EntitiesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEntities.g:69:4: rule__Model__EntitiesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__EntitiesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntitiesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalEntities.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalEntities.g:79:1: ( ruleEntity EOF )
            // InternalEntities.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalEntities.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalEntities.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalEntities.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalEntities.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalEntities.g:94:3: ( rule__Entity__Group__0 )
            // InternalEntities.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleStatement"
    // InternalEntities.g:103:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalEntities.g:104:1: ( ruleStatement EOF )
            // InternalEntities.g:105:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalEntities.g:112:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:116:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalEntities.g:117:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalEntities.g:117:2: ( ( rule__Statement__Alternatives ) )
            // InternalEntities.g:118:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalEntities.g:119:3: ( rule__Statement__Alternatives )
            // InternalEntities.g:119:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAssignmentStatement"
    // InternalEntities.g:128:1: entryRuleAssignmentStatement : ruleAssignmentStatement EOF ;
    public final void entryRuleAssignmentStatement() throws RecognitionException {
        try {
            // InternalEntities.g:129:1: ( ruleAssignmentStatement EOF )
            // InternalEntities.g:130:1: ruleAssignmentStatement EOF
            {
             before(grammarAccess.getAssignmentStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignmentStatement();

            state._fsp--;

             after(grammarAccess.getAssignmentStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignmentStatement"


    // $ANTLR start "ruleAssignmentStatement"
    // InternalEntities.g:137:1: ruleAssignmentStatement : ( ( rule__AssignmentStatement__Group__0 ) ) ;
    public final void ruleAssignmentStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:141:2: ( ( ( rule__AssignmentStatement__Group__0 ) ) )
            // InternalEntities.g:142:2: ( ( rule__AssignmentStatement__Group__0 ) )
            {
            // InternalEntities.g:142:2: ( ( rule__AssignmentStatement__Group__0 ) )
            // InternalEntities.g:143:3: ( rule__AssignmentStatement__Group__0 )
            {
             before(grammarAccess.getAssignmentStatementAccess().getGroup()); 
            // InternalEntities.g:144:3: ( rule__AssignmentStatement__Group__0 )
            // InternalEntities.g:144:4: rule__AssignmentStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignmentStatement"


    // $ANTLR start "entryRulePrintStatement"
    // InternalEntities.g:153:1: entryRulePrintStatement : rulePrintStatement EOF ;
    public final void entryRulePrintStatement() throws RecognitionException {
        try {
            // InternalEntities.g:154:1: ( rulePrintStatement EOF )
            // InternalEntities.g:155:1: rulePrintStatement EOF
            {
             before(grammarAccess.getPrintStatementRule()); 
            pushFollow(FOLLOW_1);
            rulePrintStatement();

            state._fsp--;

             after(grammarAccess.getPrintStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrintStatement"


    // $ANTLR start "rulePrintStatement"
    // InternalEntities.g:162:1: rulePrintStatement : ( ( rule__PrintStatement__Group__0 ) ) ;
    public final void rulePrintStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:166:2: ( ( ( rule__PrintStatement__Group__0 ) ) )
            // InternalEntities.g:167:2: ( ( rule__PrintStatement__Group__0 ) )
            {
            // InternalEntities.g:167:2: ( ( rule__PrintStatement__Group__0 ) )
            // InternalEntities.g:168:3: ( rule__PrintStatement__Group__0 )
            {
             before(grammarAccess.getPrintStatementAccess().getGroup()); 
            // InternalEntities.g:169:3: ( rule__PrintStatement__Group__0 )
            // InternalEntities.g:169:4: rule__PrintStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrintStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalEntities.g:178:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalEntities.g:179:1: ( ruleExpression EOF )
            // InternalEntities.g:180:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalEntities.g:187:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:191:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalEntities.g:192:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalEntities.g:192:2: ( ( rule__Expression__Alternatives ) )
            // InternalEntities.g:193:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalEntities.g:194:3: ( rule__Expression__Alternatives )
            // InternalEntities.g:194:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleField"
    // InternalEntities.g:203:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalEntities.g:204:1: ( ruleField EOF )
            // InternalEntities.g:205:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalEntities.g:212:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:216:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalEntities.g:217:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalEntities.g:217:2: ( ( rule__Field__Group__0 ) )
            // InternalEntities.g:218:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalEntities.g:219:3: ( rule__Field__Group__0 )
            // InternalEntities.g:219:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldType"
    // InternalEntities.g:228:1: entryRuleFieldType : ruleFieldType EOF ;
    public final void entryRuleFieldType() throws RecognitionException {
        try {
            // InternalEntities.g:229:1: ( ruleFieldType EOF )
            // InternalEntities.g:230:1: ruleFieldType EOF
            {
             before(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // InternalEntities.g:237:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:241:2: ( ( ( rule__FieldType__Alternatives ) ) )
            // InternalEntities.g:242:2: ( ( rule__FieldType__Alternatives ) )
            {
            // InternalEntities.g:242:2: ( ( rule__FieldType__Alternatives ) )
            // InternalEntities.g:243:3: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // InternalEntities.g:244:3: ( rule__FieldType__Alternatives )
            // InternalEntities.g:244:4: rule__FieldType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FieldType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "entryRuleBasicType"
    // InternalEntities.g:253:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalEntities.g:254:1: ( ruleBasicType EOF )
            // InternalEntities.g:255:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalEntities.g:262:1: ruleBasicType : ( ( rule__BasicType__TypeNameAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:266:2: ( ( ( rule__BasicType__TypeNameAssignment ) ) )
            // InternalEntities.g:267:2: ( ( rule__BasicType__TypeNameAssignment ) )
            {
            // InternalEntities.g:267:2: ( ( rule__BasicType__TypeNameAssignment ) )
            // InternalEntities.g:268:3: ( rule__BasicType__TypeNameAssignment )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 
            // InternalEntities.g:269:3: ( rule__BasicType__TypeNameAssignment )
            // InternalEntities.g:269:4: rule__BasicType__TypeNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEntityType"
    // InternalEntities.g:278:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // InternalEntities.g:279:1: ( ruleEntityType EOF )
            // InternalEntities.g:280:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalEntities.g:287:1: ruleEntityType : ( ( rule__EntityType__EntityAssignment ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:291:2: ( ( ( rule__EntityType__EntityAssignment ) ) )
            // InternalEntities.g:292:2: ( ( rule__EntityType__EntityAssignment ) )
            {
            // InternalEntities.g:292:2: ( ( rule__EntityType__EntityAssignment ) )
            // InternalEntities.g:293:3: ( rule__EntityType__EntityAssignment )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 
            // InternalEntities.g:294:3: ( rule__EntityType__EntityAssignment )
            // InternalEntities.g:294:4: rule__EntityType__EntityAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EntityType__EntityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalEntities.g:302:1: rule__Statement__Alternatives : ( ( rulePrintStatement ) | ( ruleAssignmentStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:306:1: ( ( rulePrintStatement ) | ( ruleAssignmentStatement ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEntities.g:307:2: ( rulePrintStatement )
                    {
                    // InternalEntities.g:307:2: ( rulePrintStatement )
                    // InternalEntities.g:308:3: rulePrintStatement
                    {
                     before(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrintStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntities.g:313:2: ( ruleAssignmentStatement )
                    {
                    // InternalEntities.g:313:2: ( ruleAssignmentStatement )
                    // InternalEntities.g:314:3: ruleAssignmentStatement
                    {
                     before(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignmentStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalEntities.g:323:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__Group_2__0 ) ) | ( ( rule__Expression__Group_3__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:327:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__Group_2__0 ) ) | ( ( rule__Expression__Group_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case 11:
            case 12:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalEntities.g:328:2: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // InternalEntities.g:328:2: ( ( rule__Expression__Group_0__0 ) )
                    // InternalEntities.g:329:3: ( rule__Expression__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    // InternalEntities.g:330:3: ( rule__Expression__Group_0__0 )
                    // InternalEntities.g:330:4: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntities.g:334:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalEntities.g:334:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalEntities.g:335:3: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // InternalEntities.g:336:3: ( rule__Expression__Group_1__0 )
                    // InternalEntities.g:336:4: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEntities.g:340:2: ( ( rule__Expression__Group_2__0 ) )
                    {
                    // InternalEntities.g:340:2: ( ( rule__Expression__Group_2__0 ) )
                    // InternalEntities.g:341:3: ( rule__Expression__Group_2__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_2()); 
                    // InternalEntities.g:342:3: ( rule__Expression__Group_2__0 )
                    // InternalEntities.g:342:4: rule__Expression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEntities.g:346:2: ( ( rule__Expression__Group_3__0 ) )
                    {
                    // InternalEntities.g:346:2: ( ( rule__Expression__Group_3__0 ) )
                    // InternalEntities.g:347:3: ( rule__Expression__Group_3__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_3()); 
                    // InternalEntities.g:348:3: ( rule__Expression__Group_3__0 )
                    // InternalEntities.g:348:4: rule__Expression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Expression__ValueAlternatives_2_1_0"
    // InternalEntities.g:356:1: rule__Expression__ValueAlternatives_2_1_0 : ( ( 'on' ) | ( 'off' ) );
    public final void rule__Expression__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:360:1: ( ( 'on' ) | ( 'off' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEntities.g:361:2: ( 'on' )
                    {
                    // InternalEntities.g:361:2: ( 'on' )
                    // InternalEntities.g:362:3: 'on'
                    {
                     before(grammarAccess.getExpressionAccess().getValueOnKeyword_2_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getValueOnKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntities.g:367:2: ( 'off' )
                    {
                    // InternalEntities.g:367:2: ( 'off' )
                    // InternalEntities.g:368:3: 'off'
                    {
                     before(grammarAccess.getExpressionAccess().getValueOffKeyword_2_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getValueOffKeyword_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__FieldType__Alternatives"
    // InternalEntities.g:377:1: rule__FieldType__Alternatives : ( ( ruleBasicType ) | ( ruleEntityType ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:381:1: ( ( ruleBasicType ) | ( ruleEntityType ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=13 && LA5_0<=15)) ) {
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
                    // InternalEntities.g:382:2: ( ruleBasicType )
                    {
                    // InternalEntities.g:382:2: ( ruleBasicType )
                    // InternalEntities.g:383:3: ruleBasicType
                    {
                     before(grammarAccess.getFieldTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getFieldTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntities.g:388:2: ( ruleEntityType )
                    {
                    // InternalEntities.g:388:2: ( ruleEntityType )
                    // InternalEntities.g:389:3: ruleEntityType
                    {
                     before(grammarAccess.getFieldTypeAccess().getEntityTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntityType();

                    state._fsp--;

                     after(grammarAccess.getFieldTypeAccess().getEntityTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__Alternatives"


    // $ANTLR start "rule__BasicType__TypeNameAlternatives_0"
    // InternalEntities.g:398:1: rule__BasicType__TypeNameAlternatives_0 : ( ( 'text' ) | ( 'number' ) | ( 'toggle' ) );
    public final void rule__BasicType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:402:1: ( ( 'text' ) | ( 'number' ) | ( 'toggle' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalEntities.g:403:2: ( 'text' )
                    {
                    // InternalEntities.g:403:2: ( 'text' )
                    // InternalEntities.g:404:3: 'text'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameTextKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameTextKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntities.g:409:2: ( 'number' )
                    {
                    // InternalEntities.g:409:2: ( 'number' )
                    // InternalEntities.g:410:3: 'number'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameNumberKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameNumberKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEntities.g:415:2: ( 'toggle' )
                    {
                    // InternalEntities.g:415:2: ( 'toggle' )
                    // InternalEntities.g:416:3: 'toggle'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameToggleKeyword_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameToggleKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__TypeNameAlternatives_0"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalEntities.g:425:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:429:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalEntities.g:430:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalEntities.g:437:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:441:1: ( ( 'entity' ) )
            // InternalEntities.g:442:1: ( 'entity' )
            {
            // InternalEntities.g:442:1: ( 'entity' )
            // InternalEntities.g:443:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalEntities.g:452:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:456:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalEntities.g:457:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalEntities.g:464:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:468:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalEntities.g:469:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalEntities.g:469:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalEntities.g:470:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalEntities.g:471:2: ( rule__Entity__NameAssignment_1 )
            // InternalEntities.g:471:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalEntities.g:479:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:483:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalEntities.g:484:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalEntities.g:491:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:495:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalEntities.g:496:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalEntities.g:496:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalEntities.g:497:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalEntities.g:498:2: ( rule__Entity__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntities.g:498:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalEntities.g:506:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:510:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalEntities.g:511:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalEntities.g:518:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:522:1: ( ( '{' ) )
            // InternalEntities.g:523:1: ( '{' )
            {
            // InternalEntities.g:523:1: ( '{' )
            // InternalEntities.g:524:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalEntities.g:533:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:537:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalEntities.g:538:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalEntities.g:545:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FieldsAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:549:1: ( ( ( rule__Entity__FieldsAssignment_4 )* ) )
            // InternalEntities.g:550:1: ( ( rule__Entity__FieldsAssignment_4 )* )
            {
            // InternalEntities.g:550:1: ( ( rule__Entity__FieldsAssignment_4 )* )
            // InternalEntities.g:551:2: ( rule__Entity__FieldsAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4()); 
            // InternalEntities.g:552:2: ( rule__Entity__FieldsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==RULE_ID) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>=13 && LA8_0<=15)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEntities.g:552:3: rule__Entity__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entity__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFieldsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalEntities.g:560:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:564:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalEntities.g:565:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalEntities.g:572:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__StatementsAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:576:1: ( ( ( rule__Entity__StatementsAssignment_5 )* ) )
            // InternalEntities.g:577:1: ( ( rule__Entity__StatementsAssignment_5 )* )
            {
            // InternalEntities.g:577:1: ( ( rule__Entity__StatementsAssignment_5 )* )
            // InternalEntities.g:578:2: ( rule__Entity__StatementsAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getStatementsAssignment_5()); 
            // InternalEntities.g:579:2: ( rule__Entity__StatementsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEntities.g:579:3: rule__Entity__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Entity__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getStatementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalEntities.g:587:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:591:1: ( rule__Entity__Group__6__Impl )
            // InternalEntities.g:592:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalEntities.g:598:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:602:1: ( ( '}' ) )
            // InternalEntities.g:603:1: ( '}' )
            {
            // InternalEntities.g:603:1: ( '}' )
            // InternalEntities.g:604:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalEntities.g:614:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:618:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalEntities.g:619:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalEntities.g:626:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:630:1: ( ( 'extends' ) )
            // InternalEntities.g:631:1: ( 'extends' )
            {
            // InternalEntities.g:631:1: ( 'extends' )
            // InternalEntities.g:632:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalEntities.g:641:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:645:1: ( rule__Entity__Group_2__1__Impl )
            // InternalEntities.g:646:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalEntities.g:652:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:656:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalEntities.g:657:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalEntities.g:657:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalEntities.g:658:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalEntities.g:659:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalEntities.g:659:3: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__AssignmentStatement__Group__0"
    // InternalEntities.g:668:1: rule__AssignmentStatement__Group__0 : rule__AssignmentStatement__Group__0__Impl rule__AssignmentStatement__Group__1 ;
    public final void rule__AssignmentStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:672:1: ( rule__AssignmentStatement__Group__0__Impl rule__AssignmentStatement__Group__1 )
            // InternalEntities.g:673:2: rule__AssignmentStatement__Group__0__Impl rule__AssignmentStatement__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AssignmentStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignmentStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group__0"


    // $ANTLR start "rule__AssignmentStatement__Group__0__Impl"
    // InternalEntities.g:680:1: rule__AssignmentStatement__Group__0__Impl : ( ( rule__AssignmentStatement__AssigneeAssignment_0 ) ) ;
    public final void rule__AssignmentStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:684:1: ( ( ( rule__AssignmentStatement__AssigneeAssignment_0 ) ) )
            // InternalEntities.g:685:1: ( ( rule__AssignmentStatement__AssigneeAssignment_0 ) )
            {
            // InternalEntities.g:685:1: ( ( rule__AssignmentStatement__AssigneeAssignment_0 ) )
            // InternalEntities.g:686:2: ( rule__AssignmentStatement__AssigneeAssignment_0 )
            {
             before(grammarAccess.getAssignmentStatementAccess().getAssigneeAssignment_0()); 
            // InternalEntities.g:687:2: ( rule__AssignmentStatement__AssigneeAssignment_0 )
            // InternalEntities.g:687:3: rule__AssignmentStatement__AssigneeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentStatement__AssigneeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentStatementAccess().getAssigneeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group__0__Impl"


    // $ANTLR start "rule__AssignmentStatement__Group__1"
    // InternalEntities.g:695:1: rule__AssignmentStatement__Group__1 : rule__AssignmentStatement__Group__1__Impl rule__AssignmentStatement__Group__2 ;
    public final void rule__AssignmentStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:699:1: ( rule__AssignmentStatement__Group__1__Impl rule__AssignmentStatement__Group__2 )
            // InternalEntities.g:700:2: rule__AssignmentStatement__Group__1__Impl rule__AssignmentStatement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AssignmentStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignmentStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group__1"


    // $ANTLR start "rule__AssignmentStatement__Group__1__Impl"
    // InternalEntities.g:707:1: rule__AssignmentStatement__Group__1__Impl : ( '=' ) ;
    public final void rule__AssignmentStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:711:1: ( ( '=' ) )
            // InternalEntities.g:712:1: ( '=' )
            {
            // InternalEntities.g:712:1: ( '=' )
            // InternalEntities.g:713:2: '='
            {
             before(grammarAccess.getAssignmentStatementAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAssignmentStatementAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group__1__Impl"


    // $ANTLR start "rule__AssignmentStatement__Group__2"
    // InternalEntities.g:722:1: rule__AssignmentStatement__Group__2 : rule__AssignmentStatement__Group__2__Impl ;
    public final void rule__AssignmentStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:726:1: ( rule__AssignmentStatement__Group__2__Impl )
            // InternalEntities.g:727:2: rule__AssignmentStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group__2"


    // $ANTLR start "rule__AssignmentStatement__Group__2__Impl"
    // InternalEntities.g:733:1: rule__AssignmentStatement__Group__2__Impl : ( ( rule__AssignmentStatement__ExprAssignment_2 ) ) ;
    public final void rule__AssignmentStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:737:1: ( ( ( rule__AssignmentStatement__ExprAssignment_2 ) ) )
            // InternalEntities.g:738:1: ( ( rule__AssignmentStatement__ExprAssignment_2 ) )
            {
            // InternalEntities.g:738:1: ( ( rule__AssignmentStatement__ExprAssignment_2 ) )
            // InternalEntities.g:739:2: ( rule__AssignmentStatement__ExprAssignment_2 )
            {
             before(grammarAccess.getAssignmentStatementAccess().getExprAssignment_2()); 
            // InternalEntities.g:740:2: ( rule__AssignmentStatement__ExprAssignment_2 )
            // InternalEntities.g:740:3: rule__AssignmentStatement__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentStatement__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentStatementAccess().getExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group__2__Impl"


    // $ANTLR start "rule__PrintStatement__Group__0"
    // InternalEntities.g:749:1: rule__PrintStatement__Group__0 : rule__PrintStatement__Group__0__Impl rule__PrintStatement__Group__1 ;
    public final void rule__PrintStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:753:1: ( rule__PrintStatement__Group__0__Impl rule__PrintStatement__Group__1 )
            // InternalEntities.g:754:2: rule__PrintStatement__Group__0__Impl rule__PrintStatement__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PrintStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__0"


    // $ANTLR start "rule__PrintStatement__Group__0__Impl"
    // InternalEntities.g:761:1: rule__PrintStatement__Group__0__Impl : ( 'print' ) ;
    public final void rule__PrintStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:765:1: ( ( 'print' ) )
            // InternalEntities.g:766:1: ( 'print' )
            {
            // InternalEntities.g:766:1: ( 'print' )
            // InternalEntities.g:767:2: 'print'
            {
             before(grammarAccess.getPrintStatementAccess().getPrintKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrintStatementAccess().getPrintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__0__Impl"


    // $ANTLR start "rule__PrintStatement__Group__1"
    // InternalEntities.g:776:1: rule__PrintStatement__Group__1 : rule__PrintStatement__Group__1__Impl ;
    public final void rule__PrintStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:780:1: ( rule__PrintStatement__Group__1__Impl )
            // InternalEntities.g:781:2: rule__PrintStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrintStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__1"


    // $ANTLR start "rule__PrintStatement__Group__1__Impl"
    // InternalEntities.g:787:1: rule__PrintStatement__Group__1__Impl : ( ( rule__PrintStatement__ExprAssignment_1 ) ) ;
    public final void rule__PrintStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:791:1: ( ( ( rule__PrintStatement__ExprAssignment_1 ) ) )
            // InternalEntities.g:792:1: ( ( rule__PrintStatement__ExprAssignment_1 ) )
            {
            // InternalEntities.g:792:1: ( ( rule__PrintStatement__ExprAssignment_1 ) )
            // InternalEntities.g:793:2: ( rule__PrintStatement__ExprAssignment_1 )
            {
             before(grammarAccess.getPrintStatementAccess().getExprAssignment_1()); 
            // InternalEntities.g:794:2: ( rule__PrintStatement__ExprAssignment_1 )
            // InternalEntities.g:794:3: rule__PrintStatement__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrintStatement__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintStatementAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_0__0"
    // InternalEntities.g:803:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:807:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // InternalEntities.g:808:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0"


    // $ANTLR start "rule__Expression__Group_0__0__Impl"
    // InternalEntities.g:815:1: rule__Expression__Group_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:819:1: ( ( () ) )
            // InternalEntities.g:820:1: ( () )
            {
            // InternalEntities.g:820:1: ( () )
            // InternalEntities.g:821:2: ()
            {
             before(grammarAccess.getExpressionAccess().getIntConstantAction_0_0()); 
            // InternalEntities.g:822:2: ()
            // InternalEntities.g:822:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_0__1"
    // InternalEntities.g:830:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:834:1: ( rule__Expression__Group_0__1__Impl )
            // InternalEntities.g:835:2: rule__Expression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__1"


    // $ANTLR start "rule__Expression__Group_0__1__Impl"
    // InternalEntities.g:841:1: rule__Expression__Group_0__1__Impl : ( ( rule__Expression__ValueAssignment_0_1 ) ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:845:1: ( ( ( rule__Expression__ValueAssignment_0_1 ) ) )
            // InternalEntities.g:846:1: ( ( rule__Expression__ValueAssignment_0_1 ) )
            {
            // InternalEntities.g:846:1: ( ( rule__Expression__ValueAssignment_0_1 ) )
            // InternalEntities.g:847:2: ( rule__Expression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_0_1()); 
            // InternalEntities.g:848:2: ( rule__Expression__ValueAssignment_0_1 )
            // InternalEntities.g:848:3: rule__Expression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalEntities.g:857:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:861:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalEntities.g:862:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalEntities.g:869:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:873:1: ( ( () ) )
            // InternalEntities.g:874:1: ( () )
            {
            // InternalEntities.g:874:1: ( () )
            // InternalEntities.g:875:2: ()
            {
             before(grammarAccess.getExpressionAccess().getStringConstantAction_1_0()); 
            // InternalEntities.g:876:2: ()
            // InternalEntities.g:876:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalEntities.g:884:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:888:1: ( rule__Expression__Group_1__1__Impl )
            // InternalEntities.g:889:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalEntities.g:895:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ValueAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:899:1: ( ( ( rule__Expression__ValueAssignment_1_1 ) ) )
            // InternalEntities.g:900:1: ( ( rule__Expression__ValueAssignment_1_1 ) )
            {
            // InternalEntities.g:900:1: ( ( rule__Expression__ValueAssignment_1_1 ) )
            // InternalEntities.g:901:2: ( rule__Expression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_1_1()); 
            // InternalEntities.g:902:2: ( rule__Expression__ValueAssignment_1_1 )
            // InternalEntities.g:902:3: rule__Expression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_2__0"
    // InternalEntities.g:911:1: rule__Expression__Group_2__0 : rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 ;
    public final void rule__Expression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:915:1: ( rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 )
            // InternalEntities.g:916:2: rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Expression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__0"


    // $ANTLR start "rule__Expression__Group_2__0__Impl"
    // InternalEntities.g:923:1: rule__Expression__Group_2__0__Impl : ( () ) ;
    public final void rule__Expression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:927:1: ( ( () ) )
            // InternalEntities.g:928:1: ( () )
            {
            // InternalEntities.g:928:1: ( () )
            // InternalEntities.g:929:2: ()
            {
             before(grammarAccess.getExpressionAccess().getBoolConstantAction_2_0()); 
            // InternalEntities.g:930:2: ()
            // InternalEntities.g:930:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__0__Impl"


    // $ANTLR start "rule__Expression__Group_2__1"
    // InternalEntities.g:938:1: rule__Expression__Group_2__1 : rule__Expression__Group_2__1__Impl ;
    public final void rule__Expression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:942:1: ( rule__Expression__Group_2__1__Impl )
            // InternalEntities.g:943:2: rule__Expression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__1"


    // $ANTLR start "rule__Expression__Group_2__1__Impl"
    // InternalEntities.g:949:1: rule__Expression__Group_2__1__Impl : ( ( rule__Expression__ValueAssignment_2_1 ) ) ;
    public final void rule__Expression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:953:1: ( ( ( rule__Expression__ValueAssignment_2_1 ) ) )
            // InternalEntities.g:954:1: ( ( rule__Expression__ValueAssignment_2_1 ) )
            {
            // InternalEntities.g:954:1: ( ( rule__Expression__ValueAssignment_2_1 ) )
            // InternalEntities.g:955:2: ( rule__Expression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_2_1()); 
            // InternalEntities.g:956:2: ( rule__Expression__ValueAssignment_2_1 )
            // InternalEntities.g:956:3: rule__Expression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__1__Impl"


    // $ANTLR start "rule__Expression__Group_3__0"
    // InternalEntities.g:965:1: rule__Expression__Group_3__0 : rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 ;
    public final void rule__Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:969:1: ( rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 )
            // InternalEntities.g:970:2: rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Expression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__0"


    // $ANTLR start "rule__Expression__Group_3__0__Impl"
    // InternalEntities.g:977:1: rule__Expression__Group_3__0__Impl : ( () ) ;
    public final void rule__Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:981:1: ( ( () ) )
            // InternalEntities.g:982:1: ( () )
            {
            // InternalEntities.g:982:1: ( () )
            // InternalEntities.g:983:2: ()
            {
             before(grammarAccess.getExpressionAccess().getFieldRefAction_3_0()); 
            // InternalEntities.g:984:2: ()
            // InternalEntities.g:984:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getFieldRefAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__0__Impl"


    // $ANTLR start "rule__Expression__Group_3__1"
    // InternalEntities.g:992:1: rule__Expression__Group_3__1 : rule__Expression__Group_3__1__Impl ;
    public final void rule__Expression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:996:1: ( rule__Expression__Group_3__1__Impl )
            // InternalEntities.g:997:2: rule__Expression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__1"


    // $ANTLR start "rule__Expression__Group_3__1__Impl"
    // InternalEntities.g:1003:1: rule__Expression__Group_3__1__Impl : ( ( rule__Expression__FieldAssignment_3_1 ) ) ;
    public final void rule__Expression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1007:1: ( ( ( rule__Expression__FieldAssignment_3_1 ) ) )
            // InternalEntities.g:1008:1: ( ( rule__Expression__FieldAssignment_3_1 ) )
            {
            // InternalEntities.g:1008:1: ( ( rule__Expression__FieldAssignment_3_1 ) )
            // InternalEntities.g:1009:2: ( rule__Expression__FieldAssignment_3_1 )
            {
             before(grammarAccess.getExpressionAccess().getFieldAssignment_3_1()); 
            // InternalEntities.g:1010:2: ( rule__Expression__FieldAssignment_3_1 )
            // InternalEntities.g:1010:3: rule__Expression__FieldAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__FieldAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getFieldAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalEntities.g:1019:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1023:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalEntities.g:1024:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalEntities.g:1031:1: rule__Field__Group__0__Impl : ( ( rule__Field__TypeAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1035:1: ( ( ( rule__Field__TypeAssignment_0 ) ) )
            // InternalEntities.g:1036:1: ( ( rule__Field__TypeAssignment_0 ) )
            {
            // InternalEntities.g:1036:1: ( ( rule__Field__TypeAssignment_0 ) )
            // InternalEntities.g:1037:2: ( rule__Field__TypeAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_0()); 
            // InternalEntities.g:1038:2: ( rule__Field__TypeAssignment_0 )
            // InternalEntities.g:1038:3: rule__Field__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalEntities.g:1046:1: rule__Field__Group__1 : rule__Field__Group__1__Impl ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1050:1: ( rule__Field__Group__1__Impl )
            // InternalEntities.g:1051:2: rule__Field__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalEntities.g:1057:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1061:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // InternalEntities.g:1062:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // InternalEntities.g:1062:1: ( ( rule__Field__NameAssignment_1 ) )
            // InternalEntities.g:1063:2: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // InternalEntities.g:1064:2: ( rule__Field__NameAssignment_1 )
            // InternalEntities.g:1064:3: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Model__EntitiesAssignment"
    // InternalEntities.g:1073:1: rule__Model__EntitiesAssignment : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1077:1: ( ( ruleEntity ) )
            // InternalEntities.g:1078:2: ( ruleEntity )
            {
            // InternalEntities.g:1078:2: ( ruleEntity )
            // InternalEntities.g:1079:3: ruleEntity
            {
             before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntitiesAssignment"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalEntities.g:1088:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1092:1: ( ( RULE_ID ) )
            // InternalEntities.g:1093:2: ( RULE_ID )
            {
            // InternalEntities.g:1093:2: ( RULE_ID )
            // InternalEntities.g:1094:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // InternalEntities.g:1103:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1107:1: ( ( ( RULE_ID ) ) )
            // InternalEntities.g:1108:2: ( ( RULE_ID ) )
            {
            // InternalEntities.g:1108:2: ( ( RULE_ID ) )
            // InternalEntities.g:1109:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalEntities.g:1110:3: ( RULE_ID )
            // InternalEntities.g:1111:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__FieldsAssignment_4"
    // InternalEntities.g:1122:1: rule__Entity__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1126:1: ( ( ruleField ) )
            // InternalEntities.g:1127:2: ( ruleField )
            {
            // InternalEntities.g:1127:2: ( ruleField )
            // InternalEntities.g:1128:3: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FieldsAssignment_4"


    // $ANTLR start "rule__Entity__StatementsAssignment_5"
    // InternalEntities.g:1137:1: rule__Entity__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__Entity__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1141:1: ( ( ruleStatement ) )
            // InternalEntities.g:1142:2: ( ruleStatement )
            {
            // InternalEntities.g:1142:2: ( ruleStatement )
            // InternalEntities.g:1143:3: ruleStatement
            {
             before(grammarAccess.getEntityAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getStatementsStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__StatementsAssignment_5"


    // $ANTLR start "rule__AssignmentStatement__AssigneeAssignment_0"
    // InternalEntities.g:1152:1: rule__AssignmentStatement__AssigneeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AssignmentStatement__AssigneeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1156:1: ( ( ( RULE_ID ) ) )
            // InternalEntities.g:1157:2: ( ( RULE_ID ) )
            {
            // InternalEntities.g:1157:2: ( ( RULE_ID ) )
            // InternalEntities.g:1158:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentStatementAccess().getAssigneeFieldCrossReference_0_0()); 
            // InternalEntities.g:1159:3: ( RULE_ID )
            // InternalEntities.g:1160:4: RULE_ID
            {
             before(grammarAccess.getAssignmentStatementAccess().getAssigneeFieldIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentStatementAccess().getAssigneeFieldIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentStatementAccess().getAssigneeFieldCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__AssigneeAssignment_0"


    // $ANTLR start "rule__AssignmentStatement__ExprAssignment_2"
    // InternalEntities.g:1171:1: rule__AssignmentStatement__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__AssignmentStatement__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1175:1: ( ( ruleExpression ) )
            // InternalEntities.g:1176:2: ( ruleExpression )
            {
            // InternalEntities.g:1176:2: ( ruleExpression )
            // InternalEntities.g:1177:3: ruleExpression
            {
             before(grammarAccess.getAssignmentStatementAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentStatementAccess().getExprExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__ExprAssignment_2"


    // $ANTLR start "rule__PrintStatement__ExprAssignment_1"
    // InternalEntities.g:1186:1: rule__PrintStatement__ExprAssignment_1 : ( ruleExpression ) ;
    public final void rule__PrintStatement__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1190:1: ( ( ruleExpression ) )
            // InternalEntities.g:1191:2: ( ruleExpression )
            {
            // InternalEntities.g:1191:2: ( ruleExpression )
            // InternalEntities.g:1192:3: ruleExpression
            {
             before(grammarAccess.getPrintStatementAccess().getExprExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrintStatementAccess().getExprExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrintStatement__ExprAssignment_1"


    // $ANTLR start "rule__Expression__ValueAssignment_0_1"
    // InternalEntities.g:1201:1: rule__Expression__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Expression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1205:1: ( ( RULE_INT ) )
            // InternalEntities.g:1206:2: ( RULE_INT )
            {
            // InternalEntities.g:1206:2: ( RULE_INT )
            // InternalEntities.g:1207:3: RULE_INT
            {
             before(grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ValueAssignment_0_1"


    // $ANTLR start "rule__Expression__ValueAssignment_1_1"
    // InternalEntities.g:1216:1: rule__Expression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Expression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1220:1: ( ( RULE_STRING ) )
            // InternalEntities.g:1221:2: ( RULE_STRING )
            {
            // InternalEntities.g:1221:2: ( RULE_STRING )
            // InternalEntities.g:1222:3: RULE_STRING
            {
             before(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ValueAssignment_1_1"


    // $ANTLR start "rule__Expression__ValueAssignment_2_1"
    // InternalEntities.g:1231:1: rule__Expression__ValueAssignment_2_1 : ( ( rule__Expression__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Expression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1235:1: ( ( ( rule__Expression__ValueAlternatives_2_1_0 ) ) )
            // InternalEntities.g:1236:2: ( ( rule__Expression__ValueAlternatives_2_1_0 ) )
            {
            // InternalEntities.g:1236:2: ( ( rule__Expression__ValueAlternatives_2_1_0 ) )
            // InternalEntities.g:1237:3: ( rule__Expression__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getValueAlternatives_2_1_0()); 
            // InternalEntities.g:1238:3: ( rule__Expression__ValueAlternatives_2_1_0 )
            // InternalEntities.g:1238:4: rule__Expression__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ValueAssignment_2_1"


    // $ANTLR start "rule__Expression__FieldAssignment_3_1"
    // InternalEntities.g:1246:1: rule__Expression__FieldAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Expression__FieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1250:1: ( ( ( RULE_ID ) ) )
            // InternalEntities.g:1251:2: ( ( RULE_ID ) )
            {
            // InternalEntities.g:1251:2: ( ( RULE_ID ) )
            // InternalEntities.g:1252:3: ( RULE_ID )
            {
             before(grammarAccess.getExpressionAccess().getFieldFieldCrossReference_3_1_0()); 
            // InternalEntities.g:1253:3: ( RULE_ID )
            // InternalEntities.g:1254:4: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getFieldFieldIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getFieldFieldIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getExpressionAccess().getFieldFieldCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__FieldAssignment_3_1"


    // $ANTLR start "rule__Field__TypeAssignment_0"
    // InternalEntities.g:1265:1: rule__Field__TypeAssignment_0 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1269:1: ( ( ruleFieldType ) )
            // InternalEntities.g:1270:2: ( ruleFieldType )
            {
            // InternalEntities.g:1270:2: ( ruleFieldType )
            // InternalEntities.g:1271:3: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_0"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // InternalEntities.g:1280:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1284:1: ( ( RULE_ID ) )
            // InternalEntities.g:1285:2: ( RULE_ID )
            {
            // InternalEntities.g:1285:2: ( RULE_ID )
            // InternalEntities.g:1286:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__BasicType__TypeNameAssignment"
    // InternalEntities.g:1295:1: rule__BasicType__TypeNameAssignment : ( ( rule__BasicType__TypeNameAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1299:1: ( ( ( rule__BasicType__TypeNameAlternatives_0 ) ) )
            // InternalEntities.g:1300:2: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            {
            // InternalEntities.g:1300:2: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            // InternalEntities.g:1301:3: ( rule__BasicType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 
            // InternalEntities.g:1302:3: ( rule__BasicType__TypeNameAlternatives_0 )
            // InternalEntities.g:1302:4: rule__BasicType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__TypeNameAssignment"


    // $ANTLR start "rule__EntityType__EntityAssignment"
    // InternalEntities.g:1310:1: rule__EntityType__EntityAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EntityType__EntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntities.g:1314:1: ( ( ( RULE_ID ) ) )
            // InternalEntities.g:1315:2: ( ( RULE_ID ) )
            {
            // InternalEntities.g:1315:2: ( ( RULE_ID ) )
            // InternalEntities.g:1316:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0()); 
            // InternalEntities.g:1317:3: ( RULE_ID )
            // InternalEntities.g:1318:4: RULE_ID
            {
             before(grammarAccess.getEntityTypeAccess().getEntityEntityIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityTypeAccess().getEntityEntityIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__EntityAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000024E010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000E012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001800L});

}
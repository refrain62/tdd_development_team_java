package auth_lib;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * 認証処理 テスト
 */
public class AuthenticatorImplTest
{
    /**
     * 認証処理
     */
    private AuthenticatorImpl _auth;

    /**
     * 前処理
     */
    @Before
    public void setUp()
    {
        this._auth = new AuthenticatorImpl();

        // 登録
        this._auth.register( "taro", "pass1" );
    }

    /**
     * 認証成功テスト
     */
    @Test
    public void auth_success()
    {
        AuthParameters authp = new AuthParameters();

        authp.addParameter( AuthParameters.ParamKey.Uid, "taro" );
        authp.addParameter( AuthParameters.ParamKey.Pwd, "pass1" );

        assertTrue( this._auth.auth( authp ) );
    }
    
    /**
     * 認証失敗テスト
     */
    @Test
    public void auth_fail()
    {
        AuthParameters authp = new AuthParameters();

        authp.addParameter( AuthParameters.ParamKey.Uid, "taro" );
        authp.addParameter( AuthParameters.ParamKey.Pwd, "pass2" );

        assertFalse( this._auth.auth( authp ) );
    }
}

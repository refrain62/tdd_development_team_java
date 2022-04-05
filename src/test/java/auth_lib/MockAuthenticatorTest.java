package auth_lib;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import auth_lib.AuthParameters.ParamKey;

/**
 * 認証処理モック テスト
 */
public class MockAuthenticatorTest
{
    /**
     * 認証処理モック
     */
    private MockAuthenticator _auth;

    /**
     * 事前処理
     */
    @Before
    public void setUp()
    {
        this._auth = new MockAuthenticator();

        this._auth.register( "taro", "pass1" );
    }

    /**
     * 旧認証処理成功テスト
     */
    @Test
    public void auth_success_old()
    {
        boolean result = this._auth.auth( "taro", "pass1" );

        assertTrue( result );
    }

    /**
     * 認証成功 テスト
     */
    @Test
    public void auth_success()
    {
        AuthParameters authp = new AuthParameters();

        authp.addParameter( ParamKey.Uid, "taro" );
        authp.addParameter( ParamKey.Pwd, "pass1" );

        assertTrue( this._auth.auth( authp ) );
    }
}

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
        boolean result = this._auth.auth( "taro", "pass1" );

        assertTrue( result );
    }
    
    /**
     * 認証失敗テスト
     */
    @Test
    public void auth_fail()
    {
        boolean result = this._auth.auth( "taro", "pass2" );

        assertFalse( result );
    }
}

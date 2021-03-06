package shop_web;

import static org.junit.Assert.*;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import auth_lib.*;

/**
 * WEBショップサービス テスト
 */
public class ShopServiceTest
{
    /**
     * WEBショップサービス
     */
    private ShopService _shopService;

    /**
     * 認証前処理
     */
    @Before
    public void setUp()
    {
        this._shopService = new ShopService();
        
        // 認証処理の設定
        AuthenticatorImpl impl = new AuthenticatorImpl();
//        MockAuthenticator impl = new MockAuthenticator();

        impl.register( "aaa", "p123" );
        
        this._shopService.setAuth( impl );
    }

    /**
     * ログイン成功 テスト
     */
    @Test
    public void login_success()
    {
        HashMap< String, String > paramTable = new HashMap<>();

        // パラメータ設定
        paramTable.put( "action", "auth" );
        paramTable.put( "uid", "aaa" );
        paramTable.put( "pwd", "p123" );

        // ログイン処理
        boolean result = this._shopService.doLogin( paramTable );        
        
        // 結果
        assertTrue( result );
    }
    
    /**
     * ログイン失敗 テスト
     */
    @Test
    public void login_fail()
    {
        HashMap< String, String > paramTable = new HashMap<>();

        // パラメータ設定
        paramTable.put( "action", "auth" );
        paramTable.put( "uid", "aaa" );
        paramTable.put( "pwd", null );

        // ログイン処理
        boolean result = this._shopService.doLogin( paramTable );        
        
        // 結果
        assertFalse( result );
    }    
}

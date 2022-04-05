package shop_web;

import static org.junit.Assert.*;
import java.util.HashMap;
import org.junit.Test;
import auth_lib.*;

/**
 * WEBショップサービス テスト
 */
public class ShopServiceTest
{
    /**
     * ログイン成功 テスト
     */
    @Test
    public void login_success()
    {
        Shopservice service = new ShopService();
        HashMap< String, String > paramTable = new HashMap<>();

        // パラメータ設定
        paramTable.put( "action", "auth" );
        paramTable.put( "uid", "aaa" );
        paramTable.put( "pwd", "p123" );

        // ログイン処理
        boolean result = service.doLogin( paramTable );        
        
        // 結果
        assertTrue( result );
    }    
}

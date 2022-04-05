package shop_web;

import java.util.HashMap;

import auth_lib.AuthParameters;
import auth_lib.Authenticator;
import auth_lib.AuthParameters.ParamKey;

/**
 * WEBショップサービス
 */
public class ShopService
{
    /**
     * 認証処理ライブラリ
     */
    private Authenticator _authenticator;

    /**
     * 認証処理
     * @param authenticator
     */
    public void setAuth( Authenticator authenticator )
    {
        this._authenticator = authenticator;
    }

    /**
     * ログイン処理
     */
    public boolean doLogin( HashMap<String, String> paramTable )
    {
        if( this._authenticator == null )
        {
            return false;
        }

        String uid = paramTable.get("uid");
        String pwd = paramTable.get("pwd");

        // 認証方式をID/PASSから パラメータ認証に変更
        AuthParameters authp = new AuthParameters();

        authp.addParameter( ParamKey.Uid, uid );
        authp.addParameter( ParamKey.Pwd, pwd );

        return this._authenticator.auth( authp );
    }
}

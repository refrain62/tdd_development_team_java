package auth_lib;

import java.util.HashMap;

/**
 * 認証用パラメータ
 */
public class AuthParameters
{
    /**
     * パラメータキー
     */
    public enum ParamKey {
         Uid
        ,Pwd
        ,Method
    }

    /**
     * パラメータテーブル
     */
    private HashMap< ParamKey, String > _paramTable = new HashMap<>();

    /**
     * パラメータ追加
     * @param key パラメーターキー
     * @param value パラメーター値
     */
    public void addParameter( ParamKey key, String value )
    {
        this._paramTable.put( key, value );
    }

    /**
     * パラメータ値取得
     * @param key パラメーターキー
     * @return
     */
    public String getParameter( ParamKey key )
    {
        return this._paramTable.get( key );
    }
}

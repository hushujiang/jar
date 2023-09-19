package com.github.catvod.spider;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.catvod.spider.YiSo;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p026b.C0308f;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p040i.C0565d;
import com.github.catvod.spider.merge.p055q.C0652d;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class YiSo extends Ali {

    /* renamed from: com.github.catvod.spider.YiSo$1 */
    /* loaded from: classes.dex */
    class C00011 extends WebViewClient {

        /* renamed from: b */
        public static final /* synthetic */ int f36b = 0;

        /* renamed from: a */
        final /* synthetic */ Map f37a;

        C00011(Map map) {
            this.f37a = map;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (Build.VERSION.SDK_INT < 19) {
                return;
            }
            final Map map = this.f37a;
            webView.evaluateJavascript(atm.m897d("0E151900213D040E5412292C2F161F1829361E09380C18390D341B1829704D0A08106B71314A275B383D120E391A222C0F140E"), new ValueCallback() { // from class: com.github.catvod.spider.a
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    Map map2 = map;
                    String str2 = (String) obj;
                    int i = YiSo.C00011.f36b;
                    if (str2.equals(atm.m897d("040F1619"))) {
                        return;
                    }
                    map2.put(atm.m897d("0009151B"), str2);
                }
            });
        }
    }

    @Override // com.github.catvod.spider.Ali
    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String searchContent(String str, boolean z) {
        String m897d;
        C0565d c0565d;
        if (Build.VERSION.SDK_INT < 19) {
            return "";
        }
        StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F624555031C3F37441C0F1B63391A13550629391819124A2239071F47"));
        m635a.append(URLEncoder.encode(str));
        m635a.append(atm.m897d("4C1C081A21650B1613"));
        String sb = m635a.toString();
        HashMap hashMap = new HashMap();
        C0652d.m141j(sb, new C00011(hashMap));
        while (true) {
            m897d = atm.m897d("0009151B");
            if (hashMap.containsKey(m897d)) {
                break;
            }
            SystemClock.sleep(50L);
        }
        String str2 = (String) hashMap.get(m897d);
        str2.getClass();
        try {
            c0565d = (C0565d) new Gson().fromJson(JsonParser.parseString(str2).getAsJsonPrimitive().getAsString(), C0565d.class);
        } catch (Exception e) {
            e.printStackTrace();
            c0565d = new C0565d();
        }
        return C0308f.m887h(c0565d.m316a().m317a(str));
    }
}

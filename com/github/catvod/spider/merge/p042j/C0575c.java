package com.github.catvod.spider.merge.p042j;

import android.text.TextUtils;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p055q.C0652d;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.j.c */
/* loaded from: classes.dex */
public final class C0575c {

    /* renamed from: a */
    private final Map<String, List<String>> f1042a;

    /* renamed from: b */
    private final Map<String, String> f1043b;

    /* renamed from: c */
    private final Map<String, String> f1044c;

    /* renamed from: d */
    private final String f1045d;

    /* renamed from: e */
    private final String f1046e;

    /* renamed from: f */
    private Request f1047f;

    /* renamed from: g */
    private String f1048g;

    /* renamed from: h */
    private Object f1049h;

    private C0575c(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        RequestBody build;
        this.f1048g = str2;
        this.f1046e = str3;
        this.f1045d = str;
        this.f1044c = map;
        this.f1043b = map2;
        this.f1042a = map3;
        Request.Builder builder = new Request.Builder();
        if (str.equals(atm.m897d("2D3F2E")) && map != null) {
            this.f1048g += atm.m897d("55");
            for (String str4 : map.keySet()) {
                this.f1048g = this.f1048g.concat(str4 + atm.m897d("57") + this.f1044c.get(str4) + atm.m897d("4C"));
            }
            String str5 = this.f1048g;
            List<String> list = C0652d.f1245a;
            if (str5 != null && str5.length() > 1) {
                str5 = str5.substring(0, str5.length() - 1);
            }
            this.f1048g = str5;
        }
        if (this.f1045d.equals(atm.m897d("3A352921"))) {
            if (TextUtils.isEmpty(this.f1046e)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                Map<String, String> map4 = this.f1044c;
                if (map4 != null) {
                    for (String str6 : map4.keySet()) {
                        builder2.add(str6, this.f1044c.get(str6));
                    }
                }
                build = builder2.build();
            } else {
                build = RequestBody.create(MediaType.parse(atm.m897d("0B0A0A19253B0B0E131A22770009151B777809121B073F3D1E470F012A7552")), this.f1046e);
            }
            builder.post(build);
        }
        Map<String, String> map5 = this.f1043b;
        if (map5 != null) {
            for (String str7 : map5.keySet()) {
                builder.addHeader(str7, this.f1043b.get(str7));
            }
        }
        Object obj = this.f1049h;
        if (obj != null) {
            builder.tag(obj);
        }
        this.f1047f = builder.url(this.f1048g).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0575c(String str, String str2, Map map) {
        this(atm.m897d("3A352921"), str, str2, null, map, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0575c(String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        this(str, str2, null, map, map2, map3);
    }

    /* renamed from: a */
    public final C0576d m304a(OkHttpClient okHttpClient) {
        try {
            Response execute = okHttpClient.newCall(this.f1047f).execute();
            Map<String, List<String>> map = this.f1042a;
            if (map != null) {
                map.clear();
            }
            Map<String, List<String>> map2 = this.f1042a;
            if (map2 != null) {
                map2.putAll(execute.headers().toMultimap());
            }
            return new C0576d(execute.code(), execute.body().string());
        } catch (IOException unused) {
            return new C0576d();
        }
    }

    /* renamed from: b */
    public final C0575c m303b() {
        this.f1049h = null;
        return this;
    }
}

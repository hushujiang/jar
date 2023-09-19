package com.github.catvod.spider.merge.p044k;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p048m.C0617a;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.k.l */
/* loaded from: classes.dex */
final class C0597l extends WebSocketListener {

    /* renamed from: a */
    final String f1103a;

    /* renamed from: b */
    final String f1104b;

    /* renamed from: c */
    final JSONObject f1105c;

    /* renamed from: d */
    final C0598m f1106d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0597l(C0598m c0598m, String str, String str2, JSONObject jSONObject) {
        this.f1106d = c0598m;
        this.f1103a = str;
        this.f1104b = str2;
        this.f1105c = jSONObject;
    }

    public final void onMessage(WebSocket webSocket, String str) {
        try {
            this.f1105c.put(C0052e.m1418a(new byte[]{-70, -3, 69}, new byte[]{-49, -113, 41, -6, 95, 114, -46, 16}), new JSONObject(C0617a.m208b(C0052e.m1413f(str), this.f1103a.getBytes(), this.f1104b.getBytes(), C0617a.f1185a)).getString(C0052e.m1418a(new byte[]{-72, 124, 76}, new byte[]{-51, 14, 32, 92, -121, -98, 102, 83})));
            synchronized (C0598m.m278a(this.f1106d)) {
                C0598m.m278a(this.f1106d).notify();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }
}

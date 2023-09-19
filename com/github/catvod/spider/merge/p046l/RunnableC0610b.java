package com.github.catvod.spider.merge.p046l;

import android.widget.Toast;
import com.github.catvod.spider.Init;
import com.google.net.cronet.okhttptransport.CronetInterceptor;

/* renamed from: com.github.catvod.spider.merge.l.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0610b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1167a;

    /* renamed from: b */
    public final /* synthetic */ Object f1168b;

    public /* synthetic */ RunnableC0610b(Object obj, int i) {
        this.f1167a = i;
        this.f1168b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1167a) {
            case 0:
                C0613e.m240a((C0613e) this.f1168b);
                return;
            case 1:
                Toast.makeText(Init.context(), (String) this.f1168b, 1).show();
                return;
            default:
                CronetInterceptor.a((CronetInterceptor) this.f1168b);
                return;
        }
    }
}

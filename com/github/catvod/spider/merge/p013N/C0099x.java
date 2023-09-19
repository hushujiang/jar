package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.p017R.InterfaceC0194b;
import com.github.catvod.spider.merge.p017R.InterfaceC0195c;
import com.github.catvod.spider.merge.p017R.InterfaceC0198f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.N.x */
/* loaded from: classes.dex */
public class C0099x extends C0068C {

    /* renamed from: d */
    public List<InterfaceC0194b> f174d;

    /* renamed from: e */
    public InterfaceC0069D f175e;

    /* renamed from: f */
    public InterfaceC0069D f176f;

    public C0099x() {
    }

    public C0099x(C0099x c0099x, int i) {
        super(c0099x, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.R.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.R.b>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.p013N.C0068C, com.github.catvod.spider.merge.p017R.InterfaceC0194b
    /* renamed from: c */
    public final InterfaceC0194b mo1190c(int i) {
        ?? r0 = this.f174d;
        if (r0 == 0 || i < 0 || i >= r0.size()) {
            return null;
        }
        return (InterfaceC0194b) this.f174d.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.R.b>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.p013N.C0068C, com.github.catvod.spider.merge.p017R.InterfaceC0194b
    /* renamed from: d */
    public final int mo1189d() {
        ?? r0 = this.f174d;
        if (r0 != 0) {
            return r0.size();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.R.b>, java.util.ArrayList] */
    /* renamed from: g */
    public final <T extends InterfaceC0194b> T m1322g(T t) {
        if (this.f174d == null) {
            this.f174d = new ArrayList();
        }
        this.f174d.add(t);
        return t;
    }

    /* renamed from: h */
    public void mo474h(InterfaceC0195c interfaceC0195c) {
    }

    /* renamed from: i */
    public void mo473i(InterfaceC0195c interfaceC0195c) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.R.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.R.b>, java.util.ArrayList] */
    /* renamed from: j */
    public final C0099x m1321j(Class cls) {
        InterfaceC0194b interfaceC0194b;
        ?? r0 = this.f174d;
        if (r0 != 0 && r0.size() > 0) {
            Iterator it = this.f174d.iterator();
            while (it.hasNext()) {
                InterfaceC0194b interfaceC0194b2 = (InterfaceC0194b) it.next();
                if (cls.isInstance(interfaceC0194b2)) {
                    interfaceC0194b = (InterfaceC0194b) cls.cast(interfaceC0194b2);
                    break;
                }
            }
        }
        interfaceC0194b = null;
        return (C0099x) interfaceC0194b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.R.b>, java.util.ArrayList] */
    /* renamed from: k */
    public final <T extends C0099x> List<T> m1320k(Class<? extends T> cls) {
        ?? r0 = this.f174d;
        if (r0 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = null;
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            InterfaceC0194b interfaceC0194b = (InterfaceC0194b) it.next();
            if (cls.isInstance(interfaceC0194b)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cls.cast(interfaceC0194b));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.R.b>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.R.b>, java.util.ArrayList] */
    /* renamed from: l */
    public final InterfaceC0198f m1319l(int i) {
        ?? r0 = this.f174d;
        if (r0 == 0 || r0.size() <= 0) {
            return null;
        }
        Iterator it = this.f174d.iterator();
        while (it.hasNext()) {
            InterfaceC0194b interfaceC0194b = (InterfaceC0194b) it.next();
            if (interfaceC0194b instanceof InterfaceC0198f) {
                InterfaceC0198f interfaceC0198f = (InterfaceC0198f) interfaceC0194b;
                if (interfaceC0198f.mo1181b().getType() == i) {
                    return interfaceC0198f;
                }
            }
        }
        return null;
    }
}

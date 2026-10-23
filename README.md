<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1200 390" width="100%" style="border-radius: 14px; box-shadow: 0 16px 32px rgba(0,0,0,0.5);">
  <defs>
    <linearGradient id="mainBg" x1="0%" y1="0%" x2="100%" y2="100%">
      <stop offset="0%" stop-color="#0f172a" />
      <stop offset="50%" stop-color="#1e1b4b" />
      <stop offset="100%" stop-color="#311b92" />
    </linearGradient>
    <linearGradient id="titleGlow" x1="0%" y1="0%" x2="100%" y2="0%">
      <stop offset="0%" stop-color="#38bdf8" />
      <stop offset="50%" stop-color="#818cf8" />
      <stop offset="100%" stop-color="#c084fc" />
    </linearGradient>
  </defs>

  <!-- Arka Plan -->
  <rect width="100%" height="100%" fill="url(#mainBg)" rx="14" />

  <!-- Başlık ve Alt Başlık -->
  <text x="50%" y="60" text-anchor="middle" fill="url(#titleGlow)" font-family="system-ui, -apple-system, sans-serif" font-weight="900" font-size="36" letter-spacing="0.5">Akıllı Çöp Toplama Rota Planlayıcı 🚛</text>
  <text x="50%" y="95" text-anchor="middle" fill="#94a3b8" font-family="system-ui, -apple-system, sans-serif" font-weight="500" font-size="16">Java SE, Java Swing & Açgözlü (Greedy) Algoritmalar ile Akıllı Şehir Simülasyonu ☕</text>

  <!-- macOS Terminal Penceresi -->
  <g transform="translate(180, 120)">
    <!-- Terminal Arka Planı -->
    <rect width="840" height="235" rx="10" fill="#090d16" stroke="#334155" stroke-width="1.5" />
    
    <!-- macOS Düğmeleri -->
    <circle cx="24" cy="22" r="6" fill="#ef4444" />
    <circle cx="44" cy="22" r="6" fill="#eab308" />
    <circle cx="64" cy="22" r="6" fill="#22c55e" />
    
    <!-- Terminal İçerik Metinleri -->
    <text x="24" y="55" fill="#38bdf8" font-family="Consolas, monospace" font-size="14" font-weight="bold">$ javac Main.java && java Main</text>
    <text x="24" y="83" fill="#e2e8f0" font-family="Consolas, monospace" font-size="13">[01] Parametreler Yüklendi: [Limit: 30kg] [Kapasite: 150kg] [Filo: 3 Araç]</text>
    <text x="24" y="111" fill="#fbbf24" font-family="Consolas, monospace" font-size="13">[02] Veri Kaynağı: CSV Okundu (Veya Otomatik Rastgele Konteyner Matrisi)</text>
    <text x="24" y="139" fill="#a78bfa" font-family="Consolas, monospace" font-size="13">[03] Açısal Kümeleme ve Greedy Rota Optimizasyonu Başarıyla Çalıştırıldı.</text>
    <text x="24" y="167" fill="#f43f5e" font-family="Consolas, monospace" font-size="13">[04] Sınıflandırma: 🟢 %35 Hafif | 🟧 %25 Orta | 🟥 %40 Kritik Dolu</text>
    <text x="24" y="195" fill="#4ade80" font-family="Consolas, monospace" font-size="13">[05] Java Swing Harita Arayüzü Başlatıldı. Rotalar Canlı Çiziliyor! ✨</text>
  </g>
</svg>

</div>

---

## 🎯 Proje Hakkında
Şehir genelindeki çöp konteynerlerinin **koordinatlarını ($x, y$) ve anlık doluluk ağırlıklarını (kg)** analiz ederek, araç filolarının kapasitelerini en verimli şekilde yöneten ve en kısa rota maliyetini çıkaran **Java tabanlı bir simülasyon sistemidir.**

---

## 🎮 Nasıl Oynanır / Çalıştırılır?
1. Programı çalıştır.
2. Konsoldan sırasıyla **toplama limitini**, **araç kapasitesini** ve **araç sayısını** gir.
3. İstersen kendi `kutular.csv` dosyanı ver, istemezsen sistem otomatik rastgele konteynerler üretsin.
4. Hesaplanan rotaları konsol adımlarından takip et ve **Java Swing harita arayüzünde** canlı görselleştirmeyi incele!

---

## 📚 Bu Projede Neler Kullandım?
- **OOP (Nesne Yönelimli Programlama):** `CopKutusu`, `Arac` ve `HaritaPanel` modüler sınıf yapıları
- **Java Swing & Graphics2D:** Özel 2D harita çizimi, ölçeklendirme ve interaktif Legend paneli
- **Dosya İşlemleri:** `BufferedReader` ile UTF-8 formatında CSV veri okuma
- **Algoritmalar:** Açısal bölge kümeleme (Polar Clustering) ve Açgözlü (Greedy) rota optimizasyonu
- **Veri Yapıları:** `ArrayList` ve `Point` nesne yönetimleri

---

## 🚀 Gelecek Planları
- [ ] Genetik Algoritmalar (Genetic Algorithm) ile Gezgin Satıcı Problemi (TSP) optimizasyonu
- [ ] Gerçek dünya harita ve GPS koordinat entegrasyonu (OpenStreetMap)
- [ ] IoT sensörleri üzerinden gerçek zamanlı doluluk takibi

---

<div align="center">

👤 **Geliştirici**  
Java öğrenme ve algoritma geliştirme yolculuğumun en keyifli projelerinden biri. ☕  
*Daha temiz şehirler ve akıllı rotalar için kodlandı!* 🚛

</div>

<%--
  Created by IntelliJ IDEA.
  User: Karina Khomyak
  Date: 11.12.2020
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.00">
    <title>AbitHelp</title>
    <link rel="stylesheet" type="text/css" href="/css/reset.css">
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
    <link rel="stylesheet" type="text/css" href="/css/styles_1.css">
</head>
<body>
<header>
    <div class="header-wrap" >
        <div class="header-wrapper l-wrap four-col-grid" >
            <div class="logo_header">
                <a href="#" ><img src="/images/logo_circle.png" alt="Logo"><span class="logo_txt">AbitHelp</span></a>
            </div>
            <div class="mobile-menu" id="mobile-menu" >
                <div class="bar1"></div>
                <div class="bar2"></div>
                <div class="bar3"></div>
            </div>
            <div class=" top-menu " id="top-menu">
                <nav class="nav_menu">
                    <ul class="menu">
                        <li><a href="#down2">обрати параметри</a></li>
                        <li><a href="#down">топ університетів</a></li>
                    </ul>
                </nav>
            </div>
            <div id="form-search">
                <form>
                    <input type="search" placeholder="Search..." class="search" >
                </form>
            </div>
        </div>
    </div>
</header>
<div class="panel">

    <div class="panel-wrapper  l-wrap four-col-grid ">
        <div class="life">
            <h3 class="h3-1" style="font-size: 130px; color: #F2A007; padding-top: 100px;">AbitHelp</h3>
            <h3 class="h3-2"style="font-size: 25px; padding-bottom: 105px;">сервіс моніторингу київських університетів</h3>
        </div>
        <div class="create-txt">
            <p><a name="down2"></a></p>
            <p>Обери параметри, які підходять саме тобі</p>
        </div>
        <div class="from-to">
            <form name="from-to" method="post" action="input1.php">
                <div class="choose">
                    <label>Предмет ЗНО 1:</label>
                    <p><div class="select"><select required name="subject_1">
                    <option >Виберіть предмет</option>
                    <option value="s1">Українська мова</option>
                    <option value="s2">Математика</option>
                    <option value="s3">Іноземна мова</option>
                    <option value="s4">Історія України</option>
                    <option value="s5">Біологія</option>
                    <option value="s6">Географія</option>
                    <option value="s7">Фізика</option>
                    <option value="s8">Хімія</option>
                    <input type="text"  placeholder="Введіть ваш бал ЗНО">

                </select></div> </p>
                </div>
                <div class="choose">
                    <label>Предмет ЗНО 2:</label>
                    <p><div class="select"><select required name="subject_2">
                    <option >Виберіть предмет</option>
                    <option value="s1">Українська мова</option>
                    <option value="s2">Математика</option>
                    <option value="s3">Іноземна мова</option>
                    <option value="s4">Історія України</option>
                    <option value="s5">Біологія</option>
                    <option value="s6">Географія</option>
                    <option value="s7">Фізика</option>
                    <option value="s8">Хімія</option>
                    <input type="text"  placeholder="Введіть ваш бал ЗНО">
                </select></div> </p>
                </div>
                <div class="choose">
                    <label>Предмет ЗНО 3:</label>
                    <p><div class="select"><select required name="subject_3">
                    <option >Виберіть предмет</option>
                    <option value="s1">Українська мова</option>
                    <option value="s2">Математика</option>
                    <option value="s3">Іноземна мова</option>
                    <option value="s4">Історія України</option>
                    <option value="s5">Біологія</option>
                    <option value="s6">Географія</option>
                    <option value="s7">Фізика</option>
                    <option value="s8">Хімія</option>
                    <input type="text"  placeholder="Введіть ваш бал ЗНО">
                </select></div> </p></div>


                <div class="to" style="margin: 0;">
                    <label style="margin-right: 70px;">Форма навчання:</label>
                    <p><div class="select"><select required name="subject_1">
                    <option >Виберіть варіант</option>
                    <option value="v1">Денна</option>
                    <option value="v2">Заочна</option>
                </select></div> </p>
                </div>
                <div class="to" style="margin: 0;">
                    <label style="margin-right: 70px;">Бюджет/контракт:</label>
                    <p><div class="select" style="margin-left: 0px;"><select required name="subject_1">
                    <option >Виберіть варіант</option>
                    <option value="v1">Бюджетна</option>
                    <option value="v2">Контрактна</option>
                </select></div> </p>
                </div>
                <div class="to" style="margin: 0;">
                    <label>Наявність гуртожитку:</label>
                    <p><div class="select" style="margin-left: 15px;"><select required name="subject_1">
                    <option >Виберіть варіант</option>
                    <option value="h1">Так</option>
                    <option value="h2">Ні</option>
                </select></div> </p>
                </div>
                <div class="choose" style="justify-content:right">
                    <label style="margin-right: 235px;"> Оберіть спеціальність:</label>
                    <input type="text"  placeholder="Введіть номер ">
                </div>
                <button style="padding-top: 10px;padding-bottom: 10px;margin-bottom: 20px;text-align: center;font-size: 20px;"type="submit2" id="calculate">Знайти</button>
            </form>
        </div>
    </div>
</div>
<div class="slider ">
    <div class="slideshow-container">
        <div class="mySlides fade">
            <img src="images/student.jpg" alt="student">
        </div>
    </div>

</div>
</div>
<div class="main-block" >
    <p><a name="down"></a></p>
    <div class=" guide_block l-wrap "style="padding-bottom: 200px;padding-top: 50px; background-color:#225459 ;">
        <div class="guides-wrap">
            <h2 >Найпопулярніші університети Києва</h2>
            <div class="guides">
                <div class="guide grid-item-1" >
                    <div class="guide_img">
                        <a href="https://kpi.ua/"><img src="/images/kpi_super_new.png" alt="KPI"></a>
                    </div>
                    <div class="guide_txt">
                        <h3>КПІ</h3>
                        <p>Національний технічний університет України "Київський політехнічний інститут імені Ігоря Сікорського"</p>

                    </div>
                </div>
                <div class="guide grid-item-1">
                    <div class="guide_img">
                        <a href="http://www.univ.kiev.ua/"><img src="/images/knu_new.png" alt="KNU"></a>
                    </div>
                    <div class="guide_txt">
                        <h3>КНУ</h3><p>Київський національний університет імені Тараса Шевченка	</p>
                    </div>
                </div>
                <div class="guide grid-item-1">
                    <div class="guide_img">
                        <a href="https://www.ukma.edu.ua/"><img src="/images/mohylianka_new.png" alt="KMA"></a>
                    </div>
                    <div class="guide_txt">
                        <h3>КМА</h3><p>Києво-Могилянська академія</p>
                    </div>
                </div>
                <div class="guide grid-item-1">
                    <div class="guide_img">
                        <a href="http://nmuofficial.com/"><img src="/images/bogomolets.png" alt="LNU"></a>
                    </div>
                    <div class="guide_txt">
                        <h3>НМУ</h3><p>Київський національний медичний університет імені О.О.Богомольця</p>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
<footer >
    <div class="footer-wrap l-wrap four-col-grid">
        <div class="footer-logo grid-item-1">
            <a href="#"><img src="/images/logo_circle.png" alt="Logo"></a>
        </div>
        <div class="footer_center grid-item-2 ">
            <div class="footer-menu">
                <ul>
                    <li><a class="p1" style="color: #225459; " href="#">Про нас</a></li>
                    <li><a class="p2" style="color: #225459; "href="#">Контакти</a></li>
                    <li><a class="p3" style="color: #225459; "href="#">Проєкти</a></li>
                    <li><a class="p4" style="color: #225459; "href="#">Співпраця</a></li>
                </ul>
            </div>
            <div class=" grid-item-2" id="footer-text">
                <p class="p5" style="color: #225459;"> To determine eligibility for loans, grants, and/or scholarships, speak to a Financial Aid Officer who will assist you with any questions you may have by calling 833-228-7589 ‡ Based the Title IV 33-week online Software Developer program offered in partnership with Southern Carrers Institute.</p>
            </div>
        </div>
        <div id="social" class="grid-item-1">
            <a href="#"><img src="/images/twitter.png" alt="Twitter"></a>
            <a href="#"><img src="/images/facebook.png" alt="Facebook"></a>
            <a href="#"><img src="/images/google-plus.png" alt="Google-plus"></a>
        </div>
    </div>
</footer>
<script src="js/script.js"></script>
</body>
</html>

(function () {
    'use strict';
    var Configure = (function () {
        function Configure($mdIconProvider, $mdThemingProvider, $urlRouterProvider, $stateProvider) {
            // Register the user `avatar` icons
            $mdIconProvider
                .defaultIconSet("./assets/svg/avatars.svg", 128)
                .icon("menu", "./assets/svg/menu.svg", 24)
                .icon("share", "./assets/svg/share.svg", 24)
                .icon("google_plus", "./assets/svg/google_plus.svg", 512)
                .icon("hangouts", "./assets/svg/hangouts.svg", 512)
                .icon("twitter", "./assets/svg/twitter.svg", 512)
                .icon("phone", "./assets/svg/phone.svg", 512);
            $mdThemingProvider.theme('default')
                .primaryPalette('brown')
                .accentPalette('red');
            $urlRouterProvider.otherwise('/home');
            $stateProvider.state('home', {
                url: '/home',
                templateUrl: '/components/view-detail/home.html',
                component: 'AppComponent' })
                .state('axis2', {
                url: '/axis2',
                templateUrl: '/components/view-detail/axis2.html',
                component: 'AppComponent' })
                .state('about', {
                url: '/about',
                templateUrl: '/components/view-detail/about.html',
                component: 'AppComponent' })
                .state('contactus', {
                url: '/contactus',
                templateUrl: '/components/view-detail/contact-us.html',
                component: 'AppComponent' })
                .state('aws', {
                url: '/aws',
                templateUrl: '/components/view-detail/aws.html',
                component: 'AppComponent' })
                .state('java', {
                url: '/java',
                templateUrl: '/components/view-detail/java.html',
                component: 'AppComponent' })
                .state('angular', {
                url: '/angular',
                templateUrl: '/components/view-detail/angular.html',
                component: 'AppComponent' })
                .state('issues', {
                url: '/issues',
                templateUrl: '/components/view-detail/issues.html',
                component: 'AppComponent' });
        }
        Configure.$inject = ['$mdIconProvider', '$mdThemingProvider', '$urlRouterProvider', '$stateProvider'];
        return Configure;
    })();
    angular.module('myApp')
        .config(Configure);
})();
//# sourceMappingURL=app-config.js.map